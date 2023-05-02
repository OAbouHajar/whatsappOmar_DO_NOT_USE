package X;

/* renamed from: X.2id  reason: invalid class name and case insensitive filesystem */
public class C55012id {
    public static int A00(int i2, boolean z2) {
        switch (i2) {
            case 1:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return z2 ? 2 : 10;
            case 2:
                return z2 ? 12 : 13;
            case 3:
                return z2 ? 7 : 21;
            case 4:
                return z2 ? 15 : 16;
            case 5:
                return z2 ? 18 : 19;
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid camera origin:");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            case 7:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid camera origin:");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            default:
                return 8;
        }
    }
}
