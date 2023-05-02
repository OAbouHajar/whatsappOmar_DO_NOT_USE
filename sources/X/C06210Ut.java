package X;

/* renamed from: X.0Ut  reason: invalid class name and case insensitive filesystem */
public final class C06210Ut {
    public Object A00 = AnonymousClass4B9.A03;
    public final C11540iw A01;

    public C06210Ut(C11540iw r2) {
        this.A01 = r2;
    }

    public static final AnonymousClass5GN A00(AnonymousClass1UG r4) {
        int i2;
        if (!(r4 instanceof AnonymousClass5GM)) {
            i2 = 1;
        } else {
            AnonymousClass5GM r2 = (AnonymousClass5GM) r4;
            while (true) {
                Object obj = r2._reusableCancellableContinuation;
                if (obj == null) {
                    r2._reusableCancellableContinuation = C81984Ao.A00;
                    break;
                } else if (obj instanceof AnonymousClass5GN) {
                    if (AnonymousClass0LG.A00(r2, obj, C81984Ao.A00, AnonymousClass5GM.A04)) {
                        AnonymousClass5GN r3 = (AnonymousClass5GN) obj;
                        if (r3 != null) {
                            Object obj2 = r3._state;
                            if (!(obj2 instanceof AnonymousClass4WZ) || ((AnonymousClass4WZ) obj2).A00 == null) {
                                r3._decision = 0;
                                r3._state = AnonymousClass595.A00;
                                return r3;
                            }
                            r3.A05();
                        }
                    }
                } else if (obj != C81984Ao.A00 && !(obj instanceof Throwable)) {
                    throw AnonymousClass000.A0V(C18450wi.A06("Inconsistent state ", obj));
                }
            }
            i2 = 2;
        }
        return new AnonymousClass5GN(r4, i2);
    }

    public Object A01() {
        Object obj = this.A00;
        AnonymousClass4QY r0 = AnonymousClass4B9.A03;
        if (obj != r0) {
            this.A00 = r0;
            return obj;
        }
        throw AnonymousClass000.A0V("'hasNext' should be called prior to 'next' invocation");
    }

    public Object A02(AnonymousClass1UG r3) {
        Object obj = this.A00;
        AnonymousClass4QY r1 = AnonymousClass4B9.A03;
        if (obj == r1) {
            Object A04 = this.A01.A04();
            this.A00 = A04;
            if (A04 == r1) {
                return A03(r3);
            }
        }
        return true;
    }

    public final Object A03(AnonymousClass1UG r5) {
        AnonymousClass5GN A002 = A00(AnonymousClass4Y9.A00(r5));
        C107075Gh r2 = new C107075Gh(A002, this);
        while (true) {
            C11540iw r1 = this.A01;
            if (!r1.A07(r2)) {
                Object A04 = r1.A04();
                this.A00 = A04;
                if (A04 != AnonymousClass4B9.A03) {
                    A002.A09(true);
                    break;
                }
            } else {
                r1.A05(A002, r2);
                break;
            }
        }
        return A002.A03();
    }
}
