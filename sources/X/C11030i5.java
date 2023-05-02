package X;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0i5  reason: invalid class name and case insensitive filesystem */
public class C11030i5 implements C004001t, C13650mo, C13660mp {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C11030i5.class, Object.class, "_state");
    public volatile /* synthetic */ Object _parentHandle = null;
    public volatile /* synthetic */ Object _state = C90764el.A00;

    public static Object A00(Object obj, AnonymousClass1UJ r1, C004001t r2) {
        return C90274ds.A00(obj, r2, r1);
    }

    public static final String A01(Object obj) {
        if (!(obj instanceof AnonymousClass594)) {
            return obj instanceof AnonymousClass5SE ? !((AnonymousClass5SE) obj).AIc() ? "New" : "Active" : obj instanceof C90034dO ? "Cancelled" : "Completed";
        }
        AnonymousClass594 r2 = (AnonymousClass594) obj;
        return r2.A08() ? "Cancelling" : r2.A09() ? "Completing" : "Active";
    }

    public static final Throwable A03(Object obj) {
        C90034dO r2;
        if (!(obj instanceof C90034dO) || (r2 = (C90034dO) obj) == null) {
            return null;
        }
        return r2.A00;
    }

    public static AnonymousClass1UL A05(AnonymousClass5NJ r0, C004001t r1) {
        return C90274ds.A01(r1, r0);
    }

    public static AnonymousClass1UM A06(AnonymousClass5NJ r0, C004001t r1) {
        return C90274ds.A02(r1, r0);
    }

    public static AnonymousClass1UM A07(AnonymousClass1UM r0, C004001t r1) {
        return C90274ds.A03(r1, r0);
    }

    public static final AnonymousClass5GW A08(C89474cF r1) {
        while (r1.A08()) {
            r1 = r1.A04();
        }
        while (true) {
            r1 = r1.A03();
            if (!r1.A08()) {
                if (r1 instanceof AnonymousClass5GW) {
                    return (AnonymousClass5GW) r1;
                }
                if (r1 instanceof C107095Gj) {
                    return null;
                }
            }
        }
    }

    public static /* synthetic */ C109115Qt A09(AnonymousClass22J r2, C004001t r3, int i2, boolean z2) {
        boolean z3 = false;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        return r3.AIb(r2, z2, z3);
    }

    public static final void A0B(Throwable th, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C813647w.A00(th, th2);
                }
            }
        }
    }

    public final int A0C(Object obj) {
        if (obj instanceof AnonymousClass593) {
            if (!((AnonymousClass593) obj).AIc()) {
                if (!AnonymousClass0LG.A00(this, obj, C90764el.A00, A00)) {
                    return -1;
                }
            }
            return 0;
        }
        if (obj instanceof AnonymousClass592) {
            if (!AnonymousClass0LG.A00(this, obj, ((AnonymousClass592) obj).AD9(), A00)) {
                return -1;
            }
        }
        return 0;
        return 1;
    }

    public final Object A0D() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AnonymousClass4SY)) {
                return obj;
            }
            ((AnonymousClass4SY) obj).A00(this);
        }
    }

    public final Object A0E(Object obj) {
        Object A0G;
        do {
            Object A0D = A0D();
            if (!(A0D instanceof AnonymousClass5SE) || ((A0D instanceof AnonymousClass594) && ((AnonymousClass594) A0D).A09())) {
                return C90764el.A01;
            }
            A0G = A0G(A0D, new C90034dO(A0N(obj)));
        } while (A0G == C90764el.A02);
        return A0G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r4 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        A0a(r4, r2.AD9());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(java.lang.Object r7) {
        /*
            r6 = this;
            r4 = 0
            r5 = r4
        L_0x0002:
            java.lang.Object r3 = r6.A0D()
            boolean r0 = r3 instanceof X.AnonymousClass594
            if (r0 == 0) goto L_0x003b
            monitor-enter(r3)
            r2 = r3
            X.594 r2 = (X.AnonymousClass594) r2     // Catch:{ all -> 0x006f }
            boolean r0 = r2.A0A()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x001a
            X.4QY r0 = X.C90764el.A05     // Catch:{ all -> 0x006f }
            monitor-exit(r3)
            return r0
        L_0x001a:
            boolean r0 = r2.A08()     // Catch:{ all -> 0x006f }
            if (r5 != 0) goto L_0x0024
            java.lang.Throwable r5 = r6.A0N(r7)     // Catch:{ all -> 0x006f }
        L_0x0024:
            r2.A06(r5)     // Catch:{ all -> 0x006f }
            java.lang.Throwable r1 = r2.A02()     // Catch:{ all -> 0x006f }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0030
            r4 = r1
        L_0x0030:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0054
            X.5Gj r0 = r2.AD9()
            r6.A0a(r4, r0)
            goto L_0x0054
        L_0x003b:
            boolean r0 = r3 instanceof X.AnonymousClass5SE
            if (r0 == 0) goto L_0x007d
            if (r5 != 0) goto L_0x0045
            java.lang.Throwable r5 = r6.A0N(r7)
        L_0x0045:
            r1 = r3
            X.5SE r1 = (X.AnonymousClass5SE) r1
            boolean r0 = r1.AIc()
            if (r0 == 0) goto L_0x0059
            boolean r0 = r6.A0s(r5, r1)
            if (r0 == 0) goto L_0x0002
        L_0x0054:
            X.4QY r0 = X.C90764el.A01
            return r0
        L_0x0059:
            X.4dO r0 = new X.4dO
            r0.<init>(r5)
            java.lang.Object r1 = r6.A0G(r3, r0)
            X.4QY r0 = X.C90764el.A01
            if (r1 == r0) goto L_0x0072
            X.4QY r0 = X.C90764el.A02
            if (r1 == r0) goto L_0x0002
            return r1
        L_0x006f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0072:
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = X.C18450wi.A06(r0, r3)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x007d:
            X.4QY r0 = X.C90764el.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11030i5.A0F(java.lang.Object):java.lang.Object");
    }

    public final Object A0G(Object obj, Object obj2) {
        return !(obj instanceof AnonymousClass5SE) ? C90764el.A01 : (((obj instanceof AnonymousClass593) || (obj instanceof AnonymousClass5GH)) && !(obj instanceof AnonymousClass5GW) && !(obj2 instanceof C90034dO)) ? A0n(obj2, (AnonymousClass5SE) obj) ? obj2 : C90764el.A02 : A0H(obj2, (AnonymousClass5SE) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r4 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        A0a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        r0 = A0R(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        if (A0m(r7, r0, r3) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        return X.C90764el.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0072, code lost:
        return A0I(r7, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0H(java.lang.Object r7, X.AnonymousClass5SE r8) {
        /*
            r6 = this;
            X.5Gj r5 = r6.A0U(r8)
            if (r5 != 0) goto L_0x000b
            X.4QY r0 = X.C90764el.A02
            return r0
        L_0x000b:
            boolean r0 = r8 instanceof X.AnonymousClass594
            r4 = 0
            if (r0 == 0) goto L_0x001c
            r3 = r8
            X.594 r3 = (X.AnonymousClass594) r3
        L_0x0013:
            if (r3 != 0) goto L_0x001a
            X.594 r3 = new X.594
            r3.<init>(r4, r5)
        L_0x001a:
            monitor-enter(r3)
            goto L_0x001e
        L_0x001c:
            r3 = r4
            goto L_0x0013
        L_0x001e:
            boolean r0 = r3.A09()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0029
            X.4QY r0 = X.C90764el.A01     // Catch:{ all -> 0x0073 }
            goto L_0x003b
        L_0x0029:
            r2 = 1
            r3.A04()     // Catch:{ all -> 0x0073 }
            if (r3 == r8) goto L_0x003d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A00     // Catch:{ all -> 0x0073 }
            boolean r0 = X.AnonymousClass0LG.A00(r6, r8, r3, r0)     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x003d
            X.4QY r0 = X.C90764el.A02     // Catch:{ all -> 0x0073 }
        L_0x003b:
            monitor-exit(r3)
            return r0
        L_0x003d:
            boolean r1 = r3.A08()     // Catch:{ all -> 0x0073 }
            boolean r0 = r7 instanceof X.C90034dO     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0049
            r0 = r7
            X.4dO r0 = (X.C90034dO) r0     // Catch:{ all -> 0x0073 }
            goto L_0x004a
        L_0x0049:
            r0 = r4
        L_0x004a:
            if (r0 == 0) goto L_0x0051
            java.lang.Throwable r0 = r0.A00     // Catch:{ all -> 0x0073 }
            r3.A06(r0)     // Catch:{ all -> 0x0073 }
        L_0x0051:
            java.lang.Throwable r0 = r3.A02()     // Catch:{ all -> 0x0073 }
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x0059
            r4 = r0
        L_0x0059:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x005f
            r6.A0a(r4, r5)
        L_0x005f:
            X.5GW r0 = r6.A0R(r8)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r6.A0m(r7, r0, r3)
            if (r0 == 0) goto L_0x006e
            X.4QY r0 = X.C90764el.A03
            return r0
        L_0x006e:
            java.lang.Object r0 = r6.A0I(r7, r3)
            return r0
        L_0x0073:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11030i5.A0H(java.lang.Object, X.5SE):java.lang.Object");
    }

    public final Object A0I(Object obj, AnonymousClass594 r6) {
        Throwable A0O;
        boolean z2 = true;
        Throwable th = null;
        C90034dO r0 = obj instanceof C90034dO ? (C90034dO) obj : null;
        if (r0 != null) {
            th = r0.A00;
        }
        synchronized (r6) {
            List A03 = r6.A03(th);
            A0O = A0O(A03, r6);
            if (A0O != null) {
                A0B(A0O, A03);
            }
        }
        if (!(A0O == null || A0O == th)) {
            obj = new C90034dO(A0O);
        }
        if (A0O != null) {
            if (!A0r(A0O) && !A0q(A0O)) {
                z2 = false;
            }
            if (z2) {
                if (obj != null) {
                    ((C90034dO) obj).A00();
                } else {
                    throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        AnonymousClass0LG.A00(this, r6, C90764el.A00(obj), A00);
        A0X(obj, r6);
        return obj;
    }

    public final Object A0J(AnonymousClass1UG r4) {
        AnonymousClass5GN r1 = new AnonymousClass5GN(AnonymousClass4Y9.A00(r4), 1);
        r1.A04();
        AnonymousClass482.A00(r1, A0S(new C107005Ga(r1)));
        Object A03 = r1.A03();
        return A03 == C106185Cw.A01() ? A03 : AnonymousClass22M.A00;
    }

    public String A0K() {
        return "Job was cancelled";
    }

    public String A0L() {
        return AnonymousClass000.A0c(this);
    }

    public final String A0M() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(A0L());
        A0o.append('{');
        A0o.append(A01(A0D()));
        return AnonymousClass000.A0k(A0o);
    }

    public final Throwable A0N(Object obj) {
        if (!(obj instanceof Throwable)) {
            return ((C13660mp) obj).AAa();
        }
        Throwable th = (Throwable) obj;
        return th == null ? new AnonymousClass5CW(A0K(), (Throwable) null, this) : th;
    }

    public final Throwable A0O(List list, AnonymousClass594 r6) {
        Object obj;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(obj instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            return th == null ? (Throwable) list.get(0) : th;
        } else if (r6.A08()) {
            return new AnonymousClass5CW(A0K(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    public final CancellationException A0P(String str, Throwable th) {
        CancellationException cancellationException;
        if ((th instanceof CancellationException) && (cancellationException = (CancellationException) th) != null) {
            return cancellationException;
        }
        if (str == null) {
            str = A0K();
        }
        return new AnonymousClass5CW(str, th, this);
    }

    public final C13640mn A0Q() {
        return (C13640mn) this._parentHandle;
    }

    public final AnonymousClass5GW A0R(AnonymousClass5SE r3) {
        AnonymousClass5GW r0;
        if ((r3 instanceof AnonymousClass5GW) && (r0 = (AnonymousClass5GW) r3) != null) {
            return r0;
        }
        C107095Gj AD9 = r3.AD9();
        if (AD9 != null) {
            return A08(AD9);
        }
        return null;
    }

    public final C109115Qt A0S(AnonymousClass22J r3) {
        return AIb(r3, false, true);
    }

    public final AnonymousClass5GH A0T(AnonymousClass22J r2, boolean z2) {
        AnonymousClass5GH r0;
        if (z2) {
            if (!(r2 instanceof AnonymousClass5GY) || (r0 = (AnonymousClass5GH) r2) == null) {
                r0 = new AnonymousClass5GV(r2);
            }
        } else if (!(r2 instanceof AnonymousClass5GH) || (r0 = (AnonymousClass5GH) r2) == null) {
            r0 = new AnonymousClass5GZ(r2);
        }
        r0.A0B(this);
        return r0;
    }

    public final C107095Gj A0U(AnonymousClass5SE r2) {
        C107095Gj AD9 = r2.AD9();
        if (AD9 != null) {
            return AD9;
        }
        if (r2 instanceof AnonymousClass593) {
            return new C107095Gj();
        }
        if (r2 instanceof AnonymousClass5GH) {
            A0f((AnonymousClass5GH) r2);
            return null;
        }
        throw AnonymousClass000.A0V(C18450wi.A06("State should have list: ", r2));
    }

    public final void A0V(Object obj) {
        Object A0G;
        do {
            A0G = A0G(A0D(), obj);
            if (A0G == C90764el.A01) {
                StringBuilder A0r = AnonymousClass000.A0r("Job ");
                A0r.append(this);
                throw new IllegalStateException(AnonymousClass000.A0e(obj, " is already complete or completing, but is being completed with ", A0r), A03(obj));
            }
        } while (A0G == C90764el.A02);
    }

    public final void A0W(Object obj, AnonymousClass5GW r3, AnonymousClass594 r4) {
        AnonymousClass5GW A08 = A08(r3);
        if (A08 == null || !A0m(obj, A08, r4)) {
            A0I(obj, r4);
        }
    }

    public final void A0X(Object obj, AnonymousClass5SE r5) {
        C90034dO r4;
        C13640mn A0Q = A0Q();
        if (A0Q != null) {
            A0Q.dispose();
            A0c(AnonymousClass591.A00);
        }
        Throwable th = null;
        if ((obj instanceof C90034dO) && (r4 = (C90034dO) obj) != null) {
            th = r4.A00;
        }
        if (r5 instanceof AnonymousClass5GH) {
            try {
                ((AnonymousClass5GH) r5).A0A(th);
            } catch (Throwable th2) {
                StringBuilder A0r = AnonymousClass000.A0r("Exception in completion handler ");
                A0r.append(r5);
                A0Z(new C105595Af(AnonymousClass000.A0e(this, " for ", A0r), th2));
            }
        } else {
            C107095Gj AD9 = r5.AD9();
            if (AD9 != null) {
                A0b(th, AD9);
            }
        }
    }

    public void A0Y(Throwable th) {
        A0l(th);
    }

    public void A0Z(Throwable th) {
        throw th;
    }

    public final void A0a(Throwable th, C107095Gj r7) {
        C105595Af r1 = null;
        for (C89474cF r4 = (C89474cF) r7.A01(); !C18450wi.A0R(r4, r7); r4 = r4.A03()) {
            if (r4 instanceof AnonymousClass5GY) {
                C107155Gp r3 = (C107155Gp) r4;
                try {
                    r3.A0A(th);
                } catch (Throwable th2) {
                    if (r1 == null) {
                        StringBuilder A0r = AnonymousClass000.A0r("Exception in completion handler ");
                        A0r.append(r3);
                        r1 = new C105595Af(AnonymousClass000.A0e(this, " for ", A0r), th2);
                    } else {
                        C813647w.A00(r1, th2);
                    }
                }
            }
        }
        if (r1 != null) {
            A0Z(r1);
        }
        A0r(th);
    }

    public final void A0b(Throwable th, C107095Gj r7) {
        C105595Af r1 = null;
        for (C89474cF r4 = (C89474cF) r7.A01(); !C18450wi.A0R(r4, r7); r4 = r4.A03()) {
            if (r4 instanceof AnonymousClass5GH) {
                C107155Gp r3 = (C107155Gp) r4;
                try {
                    r3.A0A(th);
                } catch (Throwable th2) {
                    if (r1 == null) {
                        StringBuilder A0r = AnonymousClass000.A0r("Exception in completion handler ");
                        A0r.append(r3);
                        r1 = new C105595Af(AnonymousClass000.A0e(this, " for ", A0r), th2);
                    } else {
                        C813647w.A00(r1, th2);
                    }
                }
            }
        }
        if (r1 != null) {
            A0Z(r1);
        }
    }

    public final void A0c(C13640mn r1) {
        this._parentHandle = r1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.592] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d(X.AnonymousClass593 r3) {
        /*
            r2 = this;
            X.5Gj r1 = new X.5Gj
            r1.<init>()
            boolean r0 = r3.AIc()
            if (r0 != 0) goto L_0x0011
            X.592 r0 = new X.592
            r0.<init>(r1)
            r1 = r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A00
            X.AnonymousClass0LG.A00(r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11030i5.A0d(X.593):void");
    }

    public final void A0e(C004001t r3) {
        if (r3 != null) {
            r3.Ag1();
            C13640mn A5D = r3.A5D(this);
            A0c(A5D);
            if (A0j()) {
                A5D.dispose();
            } else {
                return;
            }
        }
        A0c(AnonymousClass591.A00);
    }

    public final void A0f(AnonymousClass5GH r3) {
        r3.A06(new C107095Gj());
        AnonymousClass0LG.A00(this, r3, r3.A03(), A00);
    }

    public final void A0g(AnonymousClass5GH r4) {
        Object A0D;
        do {
            A0D = A0D();
            if (A0D instanceof AnonymousClass5GH) {
                if (A0D == r4) {
                } else {
                    return;
                }
            } else if ((A0D instanceof AnonymousClass5SE) && ((AnonymousClass5SE) A0D).AD9() != null) {
                r4.A09();
                return;
            } else {
                return;
            }
        } while (!AnonymousClass0LG.A00(this, A0D, C90764el.A00, A00));
    }

    public boolean A0h() {
        return true;
    }

    public boolean A0i() {
        return false;
    }

    public final boolean A0j() {
        return !(A0D() instanceof AnonymousClass5SE);
    }

    public final boolean A0k() {
        Object A0D;
        do {
            A0D = A0D();
            if (!(A0D instanceof AnonymousClass5SE)) {
                return false;
            }
        } while (A0C(A0D) < 0);
        return true;
    }

    public final boolean A0l(Object obj) {
        Object A02 = C90764el.A01;
        Object obj2 = A02;
        if (!A0i() || (A02 = A0E(obj)) != C90764el.A03) {
            if (A02 == obj2) {
                A02 = A0F(obj);
            }
            return A02 == obj2 || A02 == C90764el.A03 || A02 != C90764el.A05;
        }
    }

    public final boolean A0m(Object obj, AnonymousClass5GW r6, AnonymousClass594 r7) {
        do {
            if (A09(new C107015Gb(obj, r6, r7, this), r6.A00, 1, false) != AnonymousClass591.A00) {
                return true;
            }
            r6 = A08(r6);
        } while (r6 != null);
        return false;
    }

    public final boolean A0n(Object obj, AnonymousClass5SE r6) {
        if (!AnonymousClass0LG.A00(this, r6, C90764el.A00(obj), A00)) {
            return false;
        }
        A0X(obj, r6);
        return true;
    }

    public final boolean A0o(Object obj, AnonymousClass5GH r5, C107095Gj r6) {
        int A002;
        C107115Gl r2 = new C107115Gl(obj, this, r5);
        do {
            A002 = r6.A04().A00(r2, r5, r6);
            if (A002 == 1) {
                return true;
            }
        } while (A002 != 2);
        return false;
    }

    public boolean A0p(Throwable th) {
        return (th instanceof CancellationException) || (A0l(th) && A0h());
    }

    public boolean A0q(Throwable th) {
        return false;
    }

    public final boolean A0r(Throwable th) {
        boolean z2 = th instanceof CancellationException;
        C13640mn A0Q = A0Q();
        return (A0Q == null || A0Q == AnonymousClass591.A00) ? z2 : A0Q.A67(th) || z2;
    }

    public final boolean A0s(Throwable th, AnonymousClass5SE r7) {
        C107095Gj A0U = A0U(r7);
        if (A0U == null || !AnonymousClass0LG.A00(this, r7, new AnonymousClass594(th, A0U), A00)) {
            return false;
        }
        A0a(th, A0U);
        return true;
    }

    public final C13640mn A5D(C13650mo r4) {
        return (C13640mn) A09(new AnonymousClass5GW(r4), this, 2, true);
    }

    public void A62(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new AnonymousClass5CW(A0K(), (Throwable) null, this);
        }
        A0Y(cancellationException);
    }

    public final CancellationException AAS() {
        Object A0D = A0D();
        if (A0D instanceof AnonymousClass594) {
            Throwable A02 = ((AnonymousClass594) A0D).A02();
            if (A02 != null) {
                return A0P(C18450wi.A06(AnonymousClass000.A0c(this), " is cancelling"), A02);
            }
        } else if (!(A0D instanceof AnonymousClass5SE)) {
            return A0D instanceof C90034dO ? A0P((String) null, ((C90034dO) A0D).A00) : new AnonymousClass5CW(C18450wi.A06(AnonymousClass000.A0c(this), " has completed normally"), (Throwable) null, this);
        }
        throw AnonymousClass000.A0V(C18450wi.A06("Job is still new or active: ", this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r1 = (java.util.concurrent.CancellationException) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.concurrent.CancellationException AAa() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0D()
            boolean r0 = r3 instanceof X.AnonymousClass594
            r2 = 0
            if (r0 == 0) goto L_0x0029
            r0 = r3
            X.594 r0 = (X.AnonymousClass594) r0
            java.lang.Throwable r2 = r0.A02()
        L_0x0010:
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x0019
            r1 = r2
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            if (r1 != 0) goto L_0x0028
        L_0x0019:
            java.lang.String r1 = A01(r3)
            java.lang.String r0 = "Parent job is "
            java.lang.String r0 = X.C18450wi.A06(r0, r1)
            X.5CW r1 = new X.5CW
            r1.<init>(r0, r2, r4)
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r3 instanceof X.C90034dO
            if (r0 == 0) goto L_0x0033
            r0 = r3
            X.4dO r0 = (X.C90034dO) r0
            java.lang.Throwable r2 = r0.A00
            goto L_0x0010
        L_0x0033:
            boolean r0 = r3 instanceof X.AnonymousClass5SE
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "Cannot be cancelling child in this state: "
            java.lang.String r0 = X.C18450wi.A06(r0, r3)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11030i5.AAa():java.util.concurrent.CancellationException");
    }

    public final C109115Qt AIb(AnonymousClass22J r8, boolean z2, boolean z3) {
        boolean A0o;
        AnonymousClass5GH A0T = A0T(r8, z2);
        while (true) {
            Object A0D = A0D();
            if (A0D instanceof AnonymousClass593) {
                AnonymousClass593 r1 = (AnonymousClass593) A0D;
                if (r1.AIc()) {
                    A0o = AnonymousClass0LG.A00(this, A0D, A0T, A00);
                } else {
                    A0d(r1);
                }
            } else {
                Throwable th = null;
                if (A0D instanceof AnonymousClass5SE) {
                    C107095Gj AD9 = ((AnonymousClass5SE) A0D).AD9();
                    if (AD9 != null) {
                        C109115Qt r2 = AnonymousClass591.A00;
                        if (z2 && (A0D instanceof AnonymousClass594)) {
                            synchronized (A0D) {
                                AnonymousClass594 r12 = (AnonymousClass594) A0D;
                                th = r12.A02();
                                if (th == null || ((r8 instanceof AnonymousClass5GW) && !r12.A09())) {
                                    if (A0o(A0D, A0T, AD9)) {
                                        if (th == null) {
                                            return A0T;
                                        }
                                        r2 = A0T;
                                    }
                                }
                            }
                        }
                        if (th != null) {
                            if (z3) {
                                r8.AIU(th);
                            }
                            return r2;
                        }
                        A0o = A0o(A0D, A0T, AD9);
                    } else if (A0D != null) {
                        A0f((AnonymousClass5GH) A0D);
                    } else {
                        throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z3) {
                        C90034dO r5 = A0D instanceof C90034dO ? (C90034dO) A0D : null;
                        if (r5 != null) {
                            th = r5.A00;
                        }
                        r8.AIU(th);
                    }
                    return AnonymousClass591.A00;
                }
            }
            if (A0o) {
                return A0T;
            }
        }
    }

    public boolean AIc() {
        Object A0D = A0D();
        return (A0D instanceof AnonymousClass5SE) && ((AnonymousClass5SE) A0D).AIc();
    }

    public final Object AK0(AnonymousClass1UG r3) {
        if (!A0k()) {
            C06300Ve.A01(r3.AAx());
        } else {
            Object A0J = A0J(r3);
            if (A0J == C106185Cw.A01()) {
                return A0J;
            }
        }
        return AnonymousClass22M.A00;
    }

    public final void AaA(C13660mp r1) {
        A0l(r1);
    }

    public final boolean Ag1() {
        int A0C;
        do {
            A0C = A0C(A0D());
            if (A0C == 0) {
                return false;
            }
        } while (A0C != 1);
        return true;
    }

    public Object fold(Object obj, AnonymousClass1UJ r3) {
        return A00(obj, r3, this);
    }

    public AnonymousClass1UL get(AnonymousClass5NJ r2) {
        return A05(r2, this);
    }

    public final AnonymousClass5NJ getKey() {
        return C004001t.A00;
    }

    public AnonymousClass1UM minusKey(AnonymousClass5NJ r2) {
        return A06(r2, this);
    }

    public AnonymousClass1UM plus(AnonymousClass1UM r2) {
        return A07(r2, this);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(A0M());
        A0o.append('@');
        return AnonymousClass000.A0h(Integer.toHexString(System.identityHashCode(this)), A0o);
    }
}
