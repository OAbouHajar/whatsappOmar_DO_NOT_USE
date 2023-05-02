package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1bW  reason: invalid class name and case insensitive filesystem */
public abstract class C29961bW extends C29971bX implements C29981bY {
    public static final AnonymousClass4X0 A00;
    public static final Object A01 = new Object();
    public static final Logger A02;
    public static final boolean A03;
    public volatile C89914d9 listeners;
    public volatile Object value;
    public volatile C89904d8 waiters;

    static {
        boolean z2;
        AnonymousClass4X0 r6;
        Class<C89904d8> cls = C89904d8.class;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        A03 = z2;
        Class<C29961bW> cls2 = C29961bW.class;
        A02 = Logger.getLogger(cls2.getName());
        Throwable th = null;
        try {
            r6 = new C68213d4();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            r6 = new C68193d2();
        }
        A00 = r6;
        if (th != null) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A00(Object obj) {
        if (obj instanceof AnonymousClass4ZS) {
            Throwable th = ((AnonymousClass4ZS) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof AnonymousClass4ZN) {
            throw new ExecutionException(((AnonymousClass4ZN) obj).A00);
        } else if (obj == A01) {
            return null;
        } else {
            return obj;
        }
    }

    public static void A01(C29961bW r4) {
        C89904d8 r1;
        AnonymousClass4X0 r2;
        C89914d9 r12;
        C89914d9 r3 = null;
        do {
            r1 = r4.waiters;
            r2 = A00;
        } while (!r2.A03(r1, C89904d8.A00, r4));
        while (r1 != null) {
            Thread thread = r1.thread;
            if (thread != null) {
                r1.thread = null;
                LockSupport.unpark(thread);
            }
            r1 = r1.next;
        }
        do {
            r12 = r4.listeners;
        } while (!r2.A02(r12, C89914d9.A03, r4));
        while (r12 != null) {
            C89914d9 r0 = r12.A00;
            r12.A00 = r3;
            r3 = r12;
            r12 = r0;
        }
        while (r3 != null) {
            C89914d9 r22 = r3.A00;
            A02(r3.A01, r3.A02);
            r3 = r22;
        }
    }

    public static void A02(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e2);
        }
    }

    public final void A03(C89904d8 r6) {
        r6.thread = null;
        while (true) {
            C89904d8 r3 = this.waiters;
            if (r3 != C89904d8.A00) {
                C89904d8 r2 = null;
                while (r3 != null) {
                    C89904d8 r1 = r3.next;
                    if (r3.thread != null) {
                        r2 = r3;
                    } else if (r2 != null) {
                        r2.next = r1;
                        if (r2.thread == null) {
                        }
                    } else if (!A00.A03(r3, r1, this)) {
                    }
                    r3 = r1;
                }
                return;
            }
            return;
        }
    }

    public void A04(Object obj) {
        if (obj == null) {
            obj = A01;
        }
        if (A00.A04(this, (Object) null, obj)) {
            A01(this);
        }
    }

    public void A05(Throwable th) {
        if (A00.A04(this, (Object) null, new AnonymousClass4ZN(th))) {
            A01(this);
        }
    }

    public void A4b(Runnable runnable, Executor executor) {
        C89914d9 r3;
        C89914d9 r2;
        if (executor == null) {
            throw new NullPointerException(String.valueOf("Executor was null."));
        } else if (isDone() || (r3 = this.listeners) == (r2 = C89914d9.A03)) {
            A02(runnable, executor);
        } else {
            C89914d9 r1 = new C89914d9(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A00.A02(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
            A02(runnable, executor);
        }
    }

    public boolean cancel(boolean z2) {
        Object obj = this.value;
        if (obj != null) {
            return false;
        }
        if (!A00.A04(this, obj, A03 ? new AnonymousClass4ZS(new CancellationException("Future.cancel() was called.")) : z2 ? AnonymousClass4ZS.A02 : AnonymousClass4ZS.A01)) {
            return false;
        }
        A01(this);
        return true;
    }

    public Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj == null) {
                C89904d8 r3 = this.waiters;
                C89904d8 r2 = C89904d8.A00;
                if (r3 != r2) {
                    C89904d8 r1 = new C89904d8();
                    while (true) {
                        AnonymousClass4X0 r0 = A00;
                        r0.A00(r1, r3);
                        if (!r0.A03(r3, r1, this)) {
                            r3 = this.waiters;
                            if (r3 == r2) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A03(r1);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    }
                } else {
                    obj = this.value;
                }
            }
            return A00(obj);
        }
        throw new InterruptedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (r4 > 1000) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            r17 = this;
            r4 = r18
            r9 = r20
            long r0 = r9.toNanos(r4)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x019e
            r6 = r17
            java.lang.Object r2 = r6.value
            if (r2 == 0) goto L_0x0019
            java.lang.Object r0 = A00(r2)
            return r0
        L_0x0019:
            r15 = 0
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x004b
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 + r0
        L_0x0024:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0071
            X.4d8 r8 = r6.waiters
            X.4d8 r3 = X.C89904d8.A00
            if (r8 == r3) goto L_0x0044
            X.4d8 r7 = new X.4d8
            r7.<init>()
        L_0x0035:
            X.4X0 r2 = A00
            r2.A00(r7, r8)
            boolean r2 = r2.A03(r8, r7, r6)
            if (r2 != 0) goto L_0x004e
            X.4d8 r8 = r6.waiters
            if (r8 != r3) goto L_0x0035
        L_0x0044:
            java.lang.Object r0 = r6.value
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x004b:
            r10 = 0
            goto L_0x0024
        L_0x004e:
            r2 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r0 = java.lang.Math.min(r0, r2)
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0195
            java.lang.Object r0 = r6.value
            if (r0 != 0) goto L_0x0190
            long r2 = java.lang.System.nanoTime()
            long r0 = r10 - r2
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x004e
            r6.A03(r7)
        L_0x0071:
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x008c
            java.lang.Object r0 = r6.value
            if (r0 != 0) goto L_0x0190
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0086
            long r2 = java.lang.System.nanoTime()
            long r0 = r10 - r2
            goto L_0x0071
        L_0x0086:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x008c:
            java.lang.String r3 = r6.toString()
            java.lang.String r7 = r9.toString()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r10 = r7.toLowerCase(r2)
            java.lang.String r2 = java.lang.String.valueOf(r10)
            int r2 = r2.length()
            int r2 = r2 + 28
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            java.lang.String r2 = "Waited "
            r7.append(r2)
            r7.append(r4)
            java.lang.String r8 = " "
            r7.append(r8)
            r7.append(r10)
            java.lang.String r4 = r7.toString()
            long r11 = r0 + r13
            int r2 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x014d
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = " (plus "
            java.lang.String r7 = r4.concat(r2)
            long r4 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r9.convert(r4, r0)
            long r11 = r9.toNanos(r1)
            long r4 = r4 - r11
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e2
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r11 = 0
            if (r0 <= 0) goto L_0x00e3
        L_0x00e2:
            r11 = 1
        L_0x00e3:
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0123
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r0 = r9.length()
            int r7 = r0 + 21
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r7 = r7 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r9)
            r0.append(r1)
            r0.append(r8)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            if (r11 == 0) goto L_0x011b
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = r1.concat(r0)
        L_0x011b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r7 = r0.concat(r8)
        L_0x0123:
            if (r11 == 0) goto L_0x0143
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r0 = r2.length()
            int r0 = r0 + 33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = " nanoseconds "
            r1.append(r0)
            java.lang.String r7 = r1.toString()
        L_0x0143:
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "delay)"
            java.lang.String r4 = r1.concat(r0)
        L_0x014d:
            boolean r0 = r6.isDone()
            if (r0 == 0) goto L_0x0163
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = r1.concat(r0)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0163:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            int r2 = r0 + 5
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            int r2 = r2 + r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0190:
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x0195:
            r6.A03(r7)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x019e:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29961bW.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.value instanceof AnonymousClass4ZS;
    }

    public boolean isDone() {
        boolean z2 = false;
        if (this.value != null) {
            z2 = true;
        }
        return true & z2;
    }

    public String toString() {
        String str;
        Object obj;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Class<?> cls = getClass();
        String name = cls.getName();
        if (name.startsWith("com.google.common.util.concurrent.")) {
            sb.append(cls.getSimpleName());
        } else {
            sb.append(name);
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                int length = sb.length();
                sb.append("PENDING");
                try {
                    if (this instanceof ScheduledFuture) {
                        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("remaining delay=[");
                        sb2.append(delay);
                        sb2.append(" ms]");
                        str3 = sb2.toString();
                        if (str3 != null) {
                            if (str3.isEmpty()) {
                            }
                            if (str3 != null) {
                                sb.append(", info=[");
                                sb.append(str3);
                                sb.append("]");
                            }
                        }
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    String valueOf = String.valueOf(e2.getClass());
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 38);
                    sb3.append("Exception thrown from implementation: ");
                    sb3.append(valueOf);
                    str3 = sb3.toString();
                }
                if (isDone()) {
                    sb.delete(length, sb.length());
                }
                sb.append("]");
                return sb.toString();
            }
            boolean z2 = false;
            while (true) {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (ExecutionException e3) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e3.getCause());
                    sb.append("]");
                } catch (CancellationException unused2) {
                    str = "CANCELLED";
                } catch (RuntimeException e4) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e4.getClass());
                    str = " thrown from get()]";
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            sb.append("SUCCESS, result=[");
            if (obj == null) {
                str2 = "null";
            } else if (obj == this) {
                str2 = "this future";
            } else {
                sb.append(obj.getClass().getName());
                sb.append("@");
                str2 = Integer.toHexString(System.identityHashCode(obj));
            }
            sb.append(str2);
            sb.append("]");
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
