package X;

/* renamed from: X.4Yu  reason: invalid class name */
public final class AnonymousClass4Yu {
    public static final byte[] A00 = {0, 0, 0, 1};
    public static final String[] A01 = {"", "A", "B", "C"};

    public static String A00(AnonymousClass4XN r13) {
        r13.A05(24);
        int A02 = r13.A02(2);
        boolean A06 = r13.A06();
        int A022 = r13.A02(5);
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (r13.A06()) {
                i2 |= 1 << i3;
            }
        }
        int i4 = 6;
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = r13.A02(8);
        }
        int A023 = r13.A02(8);
        Object[] objArr = new Object[5];
        objArr[0] = A01[A02];
        AnonymousClass000.A1M(objArr, A022, 1);
        AnonymousClass000.A1M(objArr, i2, 2);
        char c2 = 'L';
        if (A06) {
            c2 = 'H';
        }
        objArr[3] = Character.valueOf(c2);
        AnonymousClass000.A1M(objArr, A023, 4);
        StringBuilder A0r = AnonymousClass000.A0r(AnonymousClass3K4.A0b("hvc1.%s%d.%X.%c%d", objArr));
        while (true) {
            if (iArr[i4 - 1] != 0) {
                int i6 = 0;
                do {
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1M(objArr2, iArr[i6], 0);
                    A0r.append(String.format(".%02X", objArr2));
                    i6++;
                } while (i6 < i4);
                break;
            }
            i4--;
            if (i4 <= 0) {
                break;
            }
        }
        return A0r.toString();
    }
}
