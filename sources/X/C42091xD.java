package X;

/* renamed from: X.1xD  reason: invalid class name and case insensitive filesystem */
public class C42091xD {
    public static C42101xE A00(C16880tn r1, int i2) {
        switch (i2) {
            case 1:
                return new C42151xJ(r1);
            case 2:
            case 6:
                return new AnonymousClass33v(r1);
            case 3:
                return new C42461xp(r1);
            case 4:
                return new C42111xF(r1);
            case 5:
                return new C42161xK(r1);
            default:
                StringBuilder sb = new StringBuilder("Unknown type of interactive message does not support customizations: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public static C42101xE A01(C16840tj r1) {
        C16880tn AAt = r1.AAt();
        if (AAt == null) {
            return null;
        }
        return A00(AAt, AAt.A00);
    }
}
