package X;

/* renamed from: X.0Q3  reason: invalid class name */
public class AnonymousClass0Q3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public final /* synthetic */ AnonymousClass0W9 A09;

    public AnonymousClass0Q3(AnonymousClass0W9 r1, int i2, int i3) {
        this.A09 = r1;
        this.A00 = i2;
        this.A08 = i3;
        A00();
    }

    public final void A00() {
        AnonymousClass0W9 r0 = this.A09;
        int[] iArr = r0.A02;
        int[] iArr2 = r0.A03;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MIN_VALUE;
        int i8 = 0;
        for (int i9 = this.A00; i9 <= this.A08; i9++) {
            int i10 = iArr[i9];
            i8 += iArr2[i10];
            int i11 = (i10 >> 10) & 31;
            int i12 = (i10 >> 5) & 31;
            int i13 = i10 & 31;
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
            if (i13 > i7) {
                i7 = i13;
            }
            if (i13 < i4) {
                i4 = i13;
            }
        }
        this.A06 = i2;
        this.A03 = i5;
        this.A05 = i3;
        this.A02 = i6;
        this.A04 = i4;
        this.A01 = i7;
        this.A07 = i8;
    }
}
