package X;

/* renamed from: X.0ia  reason: invalid class name and case insensitive filesystem */
public abstract class C11340ia extends C1051358i implements AnonymousClass5VC {
    public static final C106165Cu A00 = new C106165Cu();

    public C11340ia() {
        super(AnonymousClass5VC.A00);
    }

    public static AnonymousClass1UL A00(AnonymousClass5VC r3, AnonymousClass5NJ r4) {
        AnonymousClass1UL r0;
        C18450wi.A0H(r4, 1);
        if (r4 instanceof C1051658l) {
            C1051658l r42 = (C1051658l) r4;
            AnonymousClass5NJ key = r3.getKey();
            C18450wi.A0H(key, 0);
            if ((key == r42 || r42.A00 == key) && (r0 = (AnonymousClass1UL) r42.A01.AIU(r3)) != null) {
                return r0;
            }
            return null;
        } else if (AnonymousClass5VC.A00 != r4) {
            return null;
        } else {
            return r3;
        }
    }

    public static AnonymousClass1UM A01(AnonymousClass5VC r2, AnonymousClass5NJ r3) {
        C18450wi.A0H(r3, 1);
        if (r3 instanceof C1051658l) {
            C1051658l r32 = (C1051658l) r3;
            AnonymousClass5NJ key = r2.getKey();
            C18450wi.A0H(key, 0);
            if (!(key == r32 || r32.A00 == key) || r32.A01.AIU(r2) == null) {
                return r2;
            }
        } else if (AnonymousClass5VC.A00 != r3) {
            return r2;
        }
        return C1052258r.A00;
    }

    public C11340ia A02(int i2) {
        AnonymousClass487.A00(i2);
        return new C11500is(this, i2);
    }

    public boolean A03(AnonymousClass1UM r2) {
        return true;
    }

    public abstract void A05(Runnable runnable, AnonymousClass1UM r2);

    public AnonymousClass1UL get(AnonymousClass5NJ r2) {
        return A00(this, r2);
    }

    public AnonymousClass1UM minusKey(AnonymousClass5NJ r2) {
        return A01(this, r2);
    }

    public String toString() {
        StringBuilder A0p = AnonymousClass000.A0p(this);
        A0p.append('@');
        return AnonymousClass000.A0h(Integer.toHexString(System.identityHashCode(this)), A0p);
    }
}
