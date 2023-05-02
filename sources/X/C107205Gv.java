package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5Gv  reason: invalid class name and case insensitive filesystem */
public abstract class C107205Gv extends AnonymousClass55A {
    public int A00;

    public C107205Gv(int i2) {
        super(AnonymousClass4BM.A06, 0);
        this.A00 = i2;
    }

    public void A00(Throwable th) {
        String str;
        if (!(this instanceof AnonymousClass5GM)) {
            AnonymousClass5GN r1 = (AnonymousClass5GN) this;
            while (true) {
                Object obj = r1._state;
                if (obj instanceof AnonymousClass5NK) {
                    str = "Not completed";
                    break;
                } else if (!(obj instanceof C90034dO)) {
                    Throwable th2 = th;
                    if (obj instanceof AnonymousClass4WZ) {
                        AnonymousClass4WZ r2 = (AnonymousClass4WZ) obj;
                        if (r2.A02 != null) {
                            str = "Must be called at most once";
                            break;
                        }
                        Object obj2 = r2.A01;
                        AnonymousClass5GF r7 = r2.A04;
                        AnonymousClass22J r6 = r2.A03;
                        if (AnonymousClass0LG.A00(r1, obj, new AnonymousClass4WZ(obj2, r2.A00, th2, r6, r7), AnonymousClass5GN.A04)) {
                            if (r7 != null) {
                                r1.A0E(th, r7);
                            }
                            if (r6 != null) {
                                try {
                                    r6.AIU(th);
                                    return;
                                } catch (Throwable th3) {
                                    AnonymousClass484.A00(r1.A02, new C105595Af(C18450wi.A06("Exception in resume onCancellation handler for ", r1), th3));
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        if (AnonymousClass0LG.A00(r1, obj, new AnonymousClass4WZ(obj, (Object) null, th, (AnonymousClass22J) null, (AnonymousClass5GF) null), AnonymousClass5GN.A04)) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            throw AnonymousClass000.A0V(str);
        }
    }

    public final void A01(Throwable th, Throwable th2) {
        if (th == null) {
            if (th2 != null) {
                th = th2;
            } else {
                return;
            }
        } else if (th2 != null) {
            C813647w.A00(th, th2);
        }
        StringBuilder A0r = AnonymousClass000.A0r("Fatal exception in coroutines machinery for ");
        A0r.append(this);
        AnonymousClass43I r2 = new AnonymousClass43I(AnonymousClass000.A0h(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", A0r), th);
        AnonymousClass484.A00((this instanceof AnonymousClass5GM ? (AnonymousClass5GM) this : ((AnonymousClass5GN) this).A01).AAx(), r2);
    }

    public Throwable A02(Object obj) {
        C90034dO r3;
        if (!(obj instanceof C90034dO) || (r3 = (C90034dO) obj) == null) {
            return null;
        }
        return r3.A00;
    }

    public final void run() {
        Object obj;
        AnonymousClass1UM AAx;
        Object A002;
        Object obj2;
        C41211vQ r0;
        try {
            boolean z2 = this instanceof AnonymousClass5GM;
            AnonymousClass5GM r02 = (AnonymousClass5GM) (z2 ? (AnonymousClass5GM) this : ((AnonymousClass5GN) this).A01);
            AnonymousClass1UG r5 = r02.A02;
            Object obj3 = r02.A01;
            AAx = r5.AAx();
            A002 = C89804cx.A00(obj3, AAx);
            th = null;
            if (A002 != C89804cx.A03) {
                AnonymousClass483.A00(r5, AAx);
            }
            AnonymousClass1UM AAx2 = r5.AAx();
            if (z2) {
                AnonymousClass5GM r8 = (AnonymousClass5GM) this;
                obj2 = r8.A00;
                r8.A00 = C81984Ao.A01;
            } else {
                obj2 = ((AnonymousClass5GN) this)._state;
            }
            Throwable A02 = A02(obj2);
            if (A02 == null) {
                int i2 = this.A00;
                if (i2 != 1) {
                    if (i2 == 2) {
                    }
                    if ((this instanceof AnonymousClass5GN) && (obj2 instanceof AnonymousClass4WZ)) {
                        obj2 = ((AnonymousClass4WZ) obj2).A01;
                    }
                    r5.Acd(obj2);
                    obj = AnonymousClass22M.A00;
                    C89804cx.A01(A002, AAx);
                    A01(th, C41201vP.A00(obj));
                }
                C004001t r1 = (C004001t) AAx2.get(C004001t.A00);
                if (r1 != null && !r1.AIc()) {
                    CancellationException AAS = r1.AAS();
                    A00(AAS);
                    r0 = new C41211vQ(AAS);
                }
                obj2 = ((AnonymousClass4WZ) obj2).A01;
                r5.Acd(obj2);
                obj = AnonymousClass22M.A00;
                C89804cx.A01(A002, AAx);
                A01(th, C41201vP.A00(obj));
            }
            r0 = new C41211vQ(A02);
            r5.Acd(r0);
            obj = AnonymousClass22M.A00;
            C89804cx.A01(A002, AAx);
        } catch (Throwable th) {
            th = th;
            try {
                obj = AnonymousClass22M.A00;
            } catch (Throwable th2) {
                obj = new C41211vQ(th2);
            }
        }
        A01(th, C41201vP.A00(obj));
    }
}
