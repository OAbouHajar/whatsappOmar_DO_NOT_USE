package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.0ej  reason: invalid class name and case insensitive filesystem */
public abstract class C08990ej implements C29981bY {
    public static final AnonymousClass0Ru A00;
    public static final Object A01 = new Object();
    public static final Logger A02;
    public static final boolean A03 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile AnonymousClass0U4 listeners;
    public volatile Object value;
    public volatile AnonymousClass0W7 waiters;

    static {
        AnonymousClass0Ru r4;
        Class<AnonymousClass0W7> cls = AnonymousClass0W7.class;
        Class<C08990ej> cls2 = C08990ej.class;
        A02 = Logger.getLogger(cls2.getName());
        try {
            r4 = new AnonymousClass0H8(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "next"), AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls2, AnonymousClass0U4.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls2, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            r4 = new AnonymousClass0H7();
        }
        A00 = r4;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A01(C29981bY r5) {
        Throwable th;
        if (r5 instanceof C08990ej) {
            Object obj = ((C08990ej) r5).value;
            if (!(obj instanceof C06020Tx)) {
                return obj;
            }
            C06020Tx r1 = (C06020Tx) obj;
            if (!r1.A01) {
                return obj;
            }
            Throwable th2 = r1.A00;
            if (th2 != null) {
                return new C06020Tx(th2, false);
            }
        } else {
            boolean isCancelled = r5.isCancelled();
            if (!(!A03) || !isCancelled) {
                try {
                    Object A032 = A03(r5);
                    return A032 == null ? A01 : A032;
                } catch (ExecutionException e2) {
                    th = e2.getCause();
                    return new C05940Tp(th);
                } catch (CancellationException e3) {
                    if (isCancelled) {
                        return new C06020Tx(e3, false);
                    }
                    th = new IllegalArgumentException(AnonymousClass000.A0g("get() threw CancellationException, despite reporting isCancelled() == false: ", r5), e3);
                    return new C05940Tp(th);
                } catch (Throwable th3) {
                    th = th3;
                    return new C05940Tp(th);
                }
            }
        }
        return C06020Tx.A02;
    }

    public static final Object A02(Object obj) {
        if (obj instanceof C06020Tx) {
            Throwable th = ((C06020Tx) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C05940Tp) {
            throw new ExecutionException(((C05940Tp) obj).A00);
        } else if (obj == A01) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object A03(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
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
        return obj;
    }

    public static void A04(C08990ej r5) {
        AnonymousClass0U4 r1;
        AnonymousClass0U4 r4 = null;
        while (true) {
            AnonymousClass0W7 r2 = r5.waiters;
            AnonymousClass0Ru r3 = A00;
            if (r3.A03(r2, AnonymousClass0W7.A00, r5)) {
                while (r2 != null) {
                    Thread thread = r2.thread;
                    if (thread != null) {
                        r2.thread = null;
                        LockSupport.unpark(thread);
                    }
                    r2 = r2.next;
                }
                do {
                    r1 = r5.listeners;
                } while (!r3.A02(r1, AnonymousClass0U4.A03, r5));
                while (r1 != null) {
                    AnonymousClass0U4 r0 = r1.A00;
                    r1.A00 = r4;
                    r4 = r1;
                    r1 = r0;
                }
                while (true) {
                    AnonymousClass0U4 r22 = r4;
                    if (r4 != null) {
                        r4 = r4.A00;
                        Runnable runnable = r22.A01;
                        if (runnable instanceof C10070gX) {
                            C10070gX r12 = (C10070gX) runnable;
                            r5 = r12.A00;
                            if (r5.value == r12 && r3.A04(r5, r12, A01(r12.A01))) {
                                break;
                            }
                        } else {
                            A05(runnable, r22.A02);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A05(Runnable runnable, Executor executor) {
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

    public String A06() {
        Object obj = this.value;
        if (obj instanceof C10070gX) {
            StringBuilder A0r = AnonymousClass000.A0r("setFuture=[");
            C29981bY r0 = ((C10070gX) obj).A01;
            A0r.append(r0 == this ? "this future" : String.valueOf(r0));
            return AnonymousClass000.A0h("]", A0r);
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder A0r2 = AnonymousClass000.A0r("remaining delay=[");
            A0r2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            return AnonymousClass000.A0h(" ms]", A0r2);
        }
    }

    public final void A07(AnonymousClass0W7 r6) {
        r6.thread = null;
        while (true) {
            AnonymousClass0W7 r3 = this.waiters;
            if (r3 != AnonymousClass0W7.A00) {
                AnonymousClass0W7 r2 = null;
                while (r3 != null) {
                    AnonymousClass0W7 r1 = r3.next;
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

    public void A08(C29981bY r6) {
        C10070gX r3;
        AnonymousClass0Ru r2;
        C05940Tp r0;
        Object obj = this.value;
        if (obj == null) {
            if (r6.isDone()) {
                if (A00.A04(this, (Object) null, A01(r6))) {
                    A04(this);
                    return;
                }
                return;
            }
            r3 = new C10070gX(this, r6);
            r2 = A00;
            if (r2.A04(this, (Object) null, r3)) {
                try {
                    r6.A4b(r3, C03900Ki.A01);
                    return;
                } catch (Throwable unused) {
                    r0 = C05940Tp.A01;
                }
            } else {
                obj = this.value;
            }
        }
        if (obj instanceof C06020Tx) {
            r6.cancel(((C06020Tx) obj).A01);
            return;
        }
        return;
        r2.A04(this, r3, r0);
    }

    public void A09(Object obj) {
        if (obj == null) {
            obj = A01;
        }
        if (A00.A04(this, (Object) null, obj)) {
            A04(this);
        }
    }

    public void A0A(Throwable th) {
        if (A00.A04(this, (Object) null, new C05940Tp(th))) {
            A04(this);
        }
    }

    public final void A4b(Runnable runnable, Executor executor) {
        AnonymousClass0U4 r3 = this.listeners;
        AnonymousClass0U4 r2 = AnonymousClass0U4.A03;
        if (r3 != r2) {
            AnonymousClass0U4 r1 = new AnonymousClass0U4(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A00.A02(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
        }
        A05(runnable, executor);
    }

    public final boolean cancel(boolean z2) {
        Object obj = this.value;
        if (!AnonymousClass000.A1W(obj) && !(obj instanceof C10070gX)) {
            return false;
        }
        C06020Tx r3 = A03 ? new C06020Tx(new CancellationException("Future.cancel() was called."), z2) : z2 ? C06020Tx.A03 : C06020Tx.A02;
        boolean z3 = false;
        C08990ej r2 = this;
        while (true) {
            if (A00.A04(r2, obj, r3)) {
                A04(r2);
                if (!(obj instanceof C10070gX)) {
                    break;
                }
                C29981bY r22 = ((C10070gX) obj).A01;
                if (!(r22 instanceof C08990ej)) {
                    r22.cancel(z2);
                    break;
                }
                r2 = (C08990ej) r22;
                obj = r2.value;
                if (!AnonymousClass000.A1W(obj) && !(obj instanceof C10070gX)) {
                    break;
                }
                z3 = true;
            } else {
                obj = r2.value;
                if (!(obj instanceof C10070gX)) {
                    return z3;
                }
            }
        }
        return true;
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (!AnonymousClass000.A1V(obj) || !(!(obj instanceof C10070gX))) {
                AnonymousClass0W7 r3 = this.waiters;
                AnonymousClass0W7 r1 = AnonymousClass0W7.A00;
                if (r3 != r1) {
                    AnonymousClass0W7 r2 = new AnonymousClass0W7();
                    while (true) {
                        r2.A00(r3);
                        if (!A00.A03(r3, r2, this)) {
                            r3 = this.waiters;
                            if (r3 == r1) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A07(r2);
                                    throw new InterruptedException();
                                }
                            } while (!(AnonymousClass000.A1V(obj) & (!(obj instanceof C10070gX))));
                        }
                    }
                    obj = this.value;
                } else {
                    obj = this.value;
                }
            }
            return A02(obj);
        }
        throw new InterruptedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e1, code lost:
        if (r2 > 1000) goto L_0x00e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r17, java.util.concurrent.TimeUnit r19) {
        /*
            r16 = this;
            r2 = r17
            r8 = r19
            long r0 = r8.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x015c
            r7 = r16
            java.lang.Object r6 = r7.value
            boolean r5 = X.AnonymousClass000.A1V(r6)
            boolean r4 = r6 instanceof X.C10070gX
            r4 = r4 ^ 1
            r5 = r5 & r4
            if (r5 == 0) goto L_0x0022
            java.lang.Object r0 = A02(r6)
            return r0
        L_0x0022:
            r14 = 0
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x0054
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 + r0
        L_0x002d:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x007a
            X.0W7 r9 = r7.waiters
            X.0W7 r5 = X.AnonymousClass0W7.A00
            if (r9 == r5) goto L_0x004d
            X.0W7 r6 = new X.0W7
            r6.<init>()
        L_0x003e:
            r6.A00(r9)
            X.0Ru r4 = A00
            boolean r4 = r4.A03(r9, r6, r7)
            if (r4 != 0) goto L_0x0057
            X.0W7 r9 = r7.waiters
            if (r9 != r5) goto L_0x003e
        L_0x004d:
            java.lang.Object r0 = r7.value
            java.lang.Object r0 = A02(r0)
            return r0
        L_0x0054:
            r10 = 0
            goto L_0x002d
        L_0x0057:
            java.util.concurrent.locks.LockSupport.parkNanos(r7, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0153
            java.lang.Object r4 = r7.value
            boolean r1 = X.AnonymousClass000.A1V(r4)
            boolean r0 = r4 instanceof X.C10070gX
            r0 = r0 ^ 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x014e
            long r4 = java.lang.System.nanoTime()
            long r0 = r10 - r4
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0057
            r7.A07(r6)
        L_0x007a:
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x009e
            java.lang.Object r4 = r7.value
            boolean r1 = X.AnonymousClass000.A1V(r4)
            boolean r0 = r4 instanceof X.C10070gX
            r0 = r0 ^ 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x014e
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0098
            long r4 = java.lang.System.nanoTime()
            long r0 = r10 - r4
            goto L_0x007a
        L_0x0098:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x009e:
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
            if (r2 >= 0) goto L_0x0123
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r11 = X.AnonymousClass000.A0h(r2, r3)
            long r2 = -r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r5 = r8.convert(r2, r0)
            long r0 = r8.toNanos(r5)
            long r2 = r2 - r0
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            r8 = 0
            if (r0 <= 0) goto L_0x00e4
        L_0x00e3:
            r8 = 1
        L_0x00e4:
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x010a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r11)
            r0.append(r5)
            r0.append(r9)
            java.lang.String r0 = X.AnonymousClass000.A0h(r10, r0)
            if (r8 == 0) goto L_0x0102
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x0102:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r0)
            java.lang.String r11 = X.AnonymousClass000.A0h(r9, r0)
        L_0x010a:
            if (r8 == 0) goto L_0x0119
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r11)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r11 = X.AnonymousClass000.A0h(r0, r1)
        L_0x0119:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r11)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0h(r0, r1)
        L_0x0123:
            boolean r0 = r7.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            if (r0 == 0) goto L_0x013c
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x013c:
            r1.append(r3)
            java.lang.String r0 = " for "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x014e:
            java.lang.Object r0 = A02(r4)
            return r0
        L_0x0153:
            r7.A07(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x015c:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08990ej.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof C06020Tx;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof C10070gX)) & AnonymousClass000.A1V(obj);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(super.toString());
        A0o.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str2 = A06();
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
            try {
                Object A032 = A03(this);
                A0o.append("SUCCESS, result=[");
                A0o.append(A032 == this ? "this future" : String.valueOf(A032));
                A0o.append("]");
            } catch (ExecutionException e3) {
                A0o.append("FAILURE, cause=[");
                A0o.append(e3.getCause());
                A0o.append("]");
            } catch (CancellationException unused) {
                str = "CANCELLED";
            } catch (RuntimeException e4) {
                A0o.append("UNKNOWN, cause=[");
                A0o.append(e4.getClass());
                str = " thrown from get()]";
            }
            return AnonymousClass000.A0h("]", A0o);
        }
        A0o.append(str);
        return AnonymousClass000.A0h("]", A0o);
    }
}
