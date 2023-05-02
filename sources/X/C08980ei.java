package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.0ei  reason: invalid class name and case insensitive filesystem */
public abstract class C08980ei implements C29981bY {
    public static final AnonymousClass0Rt A00;
    public static final Object A01 = new Object();
    public static final Logger A02;
    public static final boolean A03 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile AnonymousClass0U0 listeners;
    public volatile Object value;
    public volatile AnonymousClass0W5 waiters;

    static {
        AnonymousClass0Rt r4;
        Class<AnonymousClass0W5> cls = AnonymousClass0W5.class;
        Class<C08980ei> cls2 = C08980ei.class;
        A02 = Logger.getLogger(cls2.getName());
        try {
            r4 = new C02600Df(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "next"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls2, AnonymousClass0U0.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls2, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            r4 = new C02590De();
        }
        A00 = r4;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static final Object A01(Object obj) {
        if (obj instanceof C05960Tr) {
            Throwable th = ((C05960Tr) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C05930To) {
            throw new ExecutionException(((C05930To) obj).A00);
        } else if (obj == A01) {
            return null;
        } else {
            return obj;
        }
    }

    public static void A02(C08980ei r4) {
        AnonymousClass0W5 r1;
        AnonymousClass0Rt r2;
        AnonymousClass0U0 r12;
        AnonymousClass0U0 r3 = null;
        do {
            r1 = r4.waiters;
            r2 = A00;
        } while (!r2.A03(r1, AnonymousClass0W5.A00, r4));
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
        } while (!r2.A02(r12, AnonymousClass0U0.A03, r4));
        while (r12 != null) {
            AnonymousClass0U0 r0 = r12.A00;
            r12.A00 = r3;
            r3 = r12;
            r12 = r0;
        }
        while (r3 != null) {
            AnonymousClass0U0 r22 = r3.A00;
            A03(r3.A01, r3.A02);
            r3 = r22;
        }
    }

    public static void A03(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            StringBuilder A0r = AnonymousClass000.A0r("RuntimeException while executing runnable ");
            A0r.append(runnable);
            logger.log(level, AnonymousClass000.A0e(executor, " with executor ", A0r), e2);
        }
    }

    public String A04() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder A0r = AnonymousClass000.A0r("remaining delay=[");
        A0r.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        return AnonymousClass000.A0h(" ms]", A0r);
    }

    public final void A05(AnonymousClass0W5 r6) {
        r6.thread = null;
        while (true) {
            AnonymousClass0W5 r3 = this.waiters;
            if (r3 != AnonymousClass0W5.A00) {
                AnonymousClass0W5 r2 = null;
                while (r3 != null) {
                    AnonymousClass0W5 r1 = r3.next;
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

    public void A06(Throwable th) {
        if (A00.A04(this, (Object) null, new C05930To(th))) {
            A02(this);
        }
    }

    public boolean A07(Object obj) {
        if (obj == null) {
            obj = A01;
        }
        if (!A00.A04(this, (Object) null, obj)) {
            return false;
        }
        A02(this);
        return true;
    }

    public final void A4b(Runnable runnable, Executor executor) {
        AnonymousClass0U0 r3 = this.listeners;
        AnonymousClass0U0 r2 = AnonymousClass0U0.A03;
        if (r3 != r2) {
            AnonymousClass0U0 r1 = new AnonymousClass0U0(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A00.A02(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
        }
        A03(runnable, executor);
    }

    public final boolean cancel(boolean z2) {
        Object obj = this.value;
        if (obj != null) {
            return false;
        }
        if (!A00.A04(this, obj, A03 ? new C05960Tr(new CancellationException("Future.cancel() was called.")) : z2 ? C05960Tr.A02 : C05960Tr.A01)) {
            return false;
        }
        A02(this);
        return true;
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj == null) {
                AnonymousClass0W5 r3 = this.waiters;
                AnonymousClass0W5 r2 = AnonymousClass0W5.A00;
                if (r3 != r2) {
                    AnonymousClass0W5 r1 = new AnonymousClass0W5();
                    while (true) {
                        r1.A00(r3);
                        if (!A00.A03(r3, r1, this)) {
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
                                    A05(r1);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    }
                } else {
                    obj = this.value;
                }
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (r2 > 1000) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r17, java.util.concurrent.TimeUnit r19) {
        /*
            r16 = this;
            r2 = r17
            r8 = r19
            long r0 = r8.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0141
            r7 = r16
            java.lang.Object r4 = r7.value
            if (r4 == 0) goto L_0x0019
            java.lang.Object r0 = A01(r4)
            return r0
        L_0x0019:
            r14 = 0
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x004b
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 + r0
        L_0x0024:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x0068
            X.0W5 r9 = r7.waiters
            X.0W5 r5 = X.AnonymousClass0W5.A00
            if (r9 == r5) goto L_0x0044
            X.0W5 r6 = new X.0W5
            r6.<init>()
        L_0x0035:
            r6.A00(r9)
            X.0Rt r4 = A00
            boolean r4 = r4.A03(r9, r6, r7)
            if (r4 != 0) goto L_0x004e
            X.0W5 r9 = r7.waiters
            if (r9 != r5) goto L_0x0035
        L_0x0044:
            java.lang.Object r0 = r7.value
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x004b:
            r10 = 0
            goto L_0x0024
        L_0x004e:
            java.util.concurrent.locks.LockSupport.parkNanos(r7, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0138
            java.lang.Object r0 = r7.value
            if (r0 != 0) goto L_0x0133
            long r4 = java.lang.System.nanoTime()
            long r0 = r10 - r4
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x004e
            r7.A05(r6)
        L_0x0068:
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x0083
            java.lang.Object r0 = r7.value
            if (r0 != 0) goto L_0x0133
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x007d
            long r4 = java.lang.System.nanoTime()
            long r0 = r10 - r4
            goto L_0x0068
        L_0x007d:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0083:
            java.lang.String r4 = r7.toString()
            java.lang.String r6 = r8.toString()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r10 = r6.toLowerCase(r5)
            java.lang.String r5 = "Waited "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r5)
            r5.append(r2)
            java.lang.String r9 = " "
            r5.append(r9)
            java.lang.String r3 = X.AnonymousClass000.A0h(r10, r5)
            long r5 = r0 + r12
            int r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0108
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r11 = X.AnonymousClass000.A0h(r2, r3)
            long r2 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r5 = r8.convert(r2, r0)
            long r0 = r8.toNanos(r5)
            long r2 = r2 - r0
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x00c8
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            r8 = 0
            if (r0 <= 0) goto L_0x00c9
        L_0x00c8:
            r8 = 1
        L_0x00c9:
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r11)
            r0.append(r5)
            r0.append(r9)
            java.lang.String r0 = X.AnonymousClass000.A0h(r10, r0)
            if (r8 == 0) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x00e7:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r0)
            java.lang.String r11 = X.AnonymousClass000.A0h(r9, r0)
        L_0x00ef:
            if (r8 == 0) goto L_0x00fe
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r11)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r11 = X.AnonymousClass000.A0h(r0, r1)
        L_0x00fe:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r11)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0h(r0, r1)
        L_0x0108:
            boolean r0 = r7.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            if (r0 == 0) goto L_0x0121
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0121:
            r1.append(r3)
            java.lang.String r0 = " for "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0133:
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x0138:
            r7.A05(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0141:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08980ei.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof C05960Tr;
    }

    public final boolean isDone() {
        return true & AnonymousClass000.A1V(this.value);
    }

    public String toString() {
        String str;
        Object obj;
        String str2;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(super.toString());
        A0o.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str2 = A04();
                } catch (RuntimeException e2) {
                    str2 = AnonymousClass000.A0f(e2.getClass(), AnonymousClass000.A0r("Exception thrown from implementation: "));
                }
                if (str2 != null && !str2.isEmpty()) {
                    A0o.append("PENDING, info=[");
                    A0o.append(str2);
                    A0o.append("]");
                    return AnonymousClass000.A0h("]", A0o);
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            boolean z2 = false;
            while (true) {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (ExecutionException e3) {
                    A0o.append("FAILURE, cause=[");
                    A0o.append(e3.getCause());
                    A0o.append("]");
                } catch (CancellationException unused2) {
                    str = "CANCELLED";
                } catch (RuntimeException e4) {
                    A0o.append("UNKNOWN, cause=[");
                    A0o.append(e4.getClass());
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
            A0o.append("SUCCESS, result=[");
            A0o.append(obj == this ? "this future" : String.valueOf(obj));
            A0o.append("]");
            return AnonymousClass000.A0h("]", A0o);
        }
        A0o.append(str);
        return AnonymousClass000.A0h("]", A0o);
    }
}
