package X;

/* renamed from: X.1f6  reason: invalid class name and case insensitive filesystem */
public class C31831f6 {
    public static AnonymousClass1XK A00(byte b2) {
        if (b2 == 0) {
            return AnonymousClass1XK.A0H;
        }
        if (b2 == 1) {
            return AnonymousClass1XK.A0C;
        }
        if (b2 == 3) {
            return AnonymousClass1XK.A0Y;
        }
        if (b2 == 9) {
            return AnonymousClass1XK.A09;
        }
        if (b2 == 13) {
            return AnonymousClass1XK.A0A;
        }
        if (b2 == 26) {
            return AnonymousClass1XK.A0T;
        }
        StringBuilder sb = new StringBuilder("media-file-type: The media type is not supported: type=");
        sb.append(b2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static AnonymousClass1XK A01(byte b2, int i2) {
        if (b2 == 1) {
            return i2 == 6 ? AnonymousClass1XK.A0G : AnonymousClass1XK.A0B;
        }
        if (b2 == 2) {
            return i2 == 1 ? AnonymousClass1XK.A0I : AnonymousClass1XK.A05;
        }
        if (b2 == 3) {
            return AnonymousClass1XK.A0X;
        }
        if (b2 == 9) {
            return AnonymousClass1XK.A08;
        }
        if (b2 == 13) {
            return AnonymousClass1XK.A04;
        }
        if (b2 == 20) {
            return AnonymousClass1XK.A0S;
        }
        if (b2 == 23) {
            return AnonymousClass1XK.A0R;
        }
        if (b2 == 35) {
            return AnonymousClass1XK.A0K;
        }
        if (b2 == 37) {
            return AnonymousClass1XK.A06;
        }
        if (b2 == 57) {
            return AnonymousClass1XK.A0E;
        }
        if (b2 == 65) {
            return AnonymousClass1XK.A0P;
        }
        if (b2 == 80) {
            return AnonymousClass1XK.A0J;
        }
        if (b2 == 25) {
            return AnonymousClass1XK.A0V;
        }
        if (b2 == 26) {
            return AnonymousClass1XK.A0T;
        }
        if (b2 == 28) {
            return AnonymousClass1XK.A0W;
        }
        if (b2 == 29) {
            return AnonymousClass1XK.A0U;
        }
        if (b2 == 62) {
            return AnonymousClass1XK.A0F;
        }
        if (b2 == 63) {
            return AnonymousClass1XK.A0D;
        }
        switch (b2) {
            case 42:
                return AnonymousClass1XK.A0Z;
            case 43:
                return AnonymousClass1XK.A0a;
            case 44:
                return AnonymousClass1XK.A0O;
            default:
                StringBuilder sb = new StringBuilder("media-file-type: The media type is not supported: type=");
                sb.append(b2);
                sb.append(", mediaOrigin=");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static boolean A02(AnonymousClass1XK r2) {
        return r2 == AnonymousClass1XK.A0B || r2 == AnonymousClass1XK.A0Z || r2 == AnonymousClass1XK.A0V || r2 == AnonymousClass1XK.A0R || r2 == AnonymousClass1XK.A06 || r2 == AnonymousClass1XK.A0G || r2 == AnonymousClass1XK.A0P || r2 == AnonymousClass1XK.A0L || r2 == AnonymousClass1XK.A07;
    }

    public static boolean A03(AnonymousClass1XK r2) {
        return r2 == AnonymousClass1XK.A0X || r2 == AnonymousClass1XK.A0a || r2 == AnonymousClass1XK.A04;
    }

    public static boolean A04(AnonymousClass1XK r2) {
        return A03(r2) || r2 == AnonymousClass1XK.A0W || r2 == AnonymousClass1XK.A0U;
    }
}
