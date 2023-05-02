package X;

/* renamed from: X.4JO  reason: invalid class name */
public class AnonymousClass4JO {
    public long A00 = -1;
    public int[] A01;
    public int[] A02;

    public AnonymousClass4JO(int[] iArr) {
        String str;
        int length = iArr.length;
        if (length % 2 == 0) {
            int i2 = length >> 1;
            int[] iArr2 = new int[i2];
            this.A01 = iArr2;
            int[] iArr3 = new int[i2];
            this.A02 = iArr3;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                iArr2[i3] = iArr[i4];
                i4 = i5 + 1;
                iArr3[i3] = iArr[i5];
                if (iArr2[i3] < 0 || iArr3[i3] < 0) {
                    str = "Int conditions should be > 0";
                } else {
                    i3++;
                }
            }
            return;
        }
        str = "Int conditions should come in pairs";
        throw AnonymousClass000.A0T(str);
    }
}
