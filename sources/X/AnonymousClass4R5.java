package X;

import java.lang.reflect.Array;

/* renamed from: X.4R5  reason: invalid class name */
public final class AnonymousClass4R5 {
    public final int A00;
    public final int A01;
    public final byte[][] A02;

    public AnonymousClass4R5(int i2, int i3) {
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i3;
        this.A02 = (byte[][]) Array.newInstance(byte.class, iArr);
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        int i2 = this.A01;
        int i3 = this.A00;
        StringBuilder A0g = C13690nt.A0g(((i2 << 1) * i3) + 2);
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr = this.A02[i4];
            for (int i5 = 0; i5 < i2; i5++) {
                byte b2 = bArr[i5];
                A0g.append(b2 != 0 ? b2 != 1 ? "  " : " 1" : " 0");
            }
            A0g.append(10);
        }
        return A0g.toString();
    }
}
