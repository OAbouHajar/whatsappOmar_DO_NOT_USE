package X;

/* renamed from: X.5Gc  reason: invalid class name and case insensitive filesystem */
public abstract class C107025Gc extends C11030i5 implements AnonymousClass1UG, C004001t, AnonymousClass1UB {
    public final AnonymousClass1UM A00;

    public C107025Gc(AnonymousClass1UM r2) {
        A0e((C004001t) r2.get(C004001t.A00));
        this.A00 = r2.plus(this);
    }

    public String A0K() {
        return C18450wi.A06(AnonymousClass000.A0c(this), " was cancelled");
    }

    public String A0L() {
        return super.A0L();
    }

    public final void A0Z(Throwable th) {
        AnonymousClass484.A00(this.A00, th);
    }

    public final void A0t(Object obj, AnonymousClass1UJ r14) {
        AnonymousClass1UG r0;
        AnonymousClass1UM AAx;
        Object A002;
        try {
            if (r14 instanceof AnonymousClass1UF) {
                r0 = ((AnonymousClass1UF) r14).A05(obj, this);
            } else {
                AnonymousClass1UM AAx2 = AAx();
                r0 = AAx2 == C1052258r.A00 ? new AnonymousClass5D3(obj, this, r14) : new AnonymousClass5D1(obj, this, AAx2, r14);
            }
            AnonymousClass1UG A003 = AnonymousClass4Y9.A00(r0);
            AnonymousClass22M r7 = AnonymousClass22M.A00;
            if (A003 instanceof AnonymousClass5GM) {
                AnonymousClass5GM r5 = (AnonymousClass5GM) A003;
                Object obj2 = r7;
                Throwable A004 = C41201vP.A00(r7);
                if (A004 != null) {
                    obj2 = new C90034dO(A004, false);
                }
                C11340ia r1 = r5.A03;
                AnonymousClass1UG r6 = r5.A02;
                if (r1.A03(r6.AAx())) {
                    r5.A00 = obj2;
                    r5.A00 = 1;
                    r1.A05(r5, r6.AAx());
                    return;
                }
                AnonymousClass5GR A005 = C89704cl.A00();
                long j2 = A005.A00;
                if (j2 >= 4294967296L) {
                    r5.A00 = obj2;
                    r5.A00 = 1;
                    A005.A09(r5);
                    return;
                }
                A005.A00 = j2 + 4294967296L;
                try {
                    C004001t r12 = (C004001t) r6.AAx().get(C004001t.A00);
                    if (r12 == null || r12.AIc()) {
                        Object obj3 = r5.A01;
                        AAx = r6.AAx();
                        A002 = C89804cx.A00(obj3, AAx);
                        if (A002 != C89804cx.A03) {
                            AnonymousClass483.A00(r6, AAx);
                        }
                        r6.Acd(r7);
                        C89804cx.A01(A002, AAx);
                    } else {
                        r5.Acd(new C41211vQ(r12.AAS()));
                    }
                    do {
                    } while (A005.A0B());
                } catch (Throwable th) {
                    try {
                        r5.A01(th, (Throwable) null);
                    } catch (Throwable th2) {
                        A005.A07();
                        throw th2;
                    }
                }
                A005.A07();
                return;
            }
            A003.Acd(r7);
        } catch (Throwable th3) {
            Acd(new C41211vQ(th3));
            throw th3;
        }
    }

    public final AnonymousClass1UM AAx() {
        return this.A00;
    }

    public AnonymousClass1UM AB0() {
        return this.A00;
    }

    public final void Acd(Object obj) {
        Throwable A002 = C41201vP.A00(obj);
        if (A002 != null) {
            obj = new C90034dO(A002, false);
        }
        A0V(obj);
    }
}
