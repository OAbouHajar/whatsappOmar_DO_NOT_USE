package X;

/* renamed from: X.4S9  reason: invalid class name */
public final class AnonymousClass4S9 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C32481gS A07;

    public AnonymousClass4S9(C32481gS r1) {
        this.A07 = r1;
    }

    public void A00(byte[] bArr, int i2, int i3) {
        if (this.A04) {
            int i4 = this.A01;
            int i5 = (i2 + 1) - i4;
            if (i5 < i3) {
                this.A06 = AnonymousClass000.A1P((bArr[i5] & 192) >> 6);
                this.A04 = false;
                return;
            }
            this.A01 = i4 + (i3 - i2);
        }
    }
}
