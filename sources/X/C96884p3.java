package X;

import android.util.Log;

/* renamed from: X.4p3  reason: invalid class name and case insensitive filesystem */
public final class C96884p3 implements C109595St {
    public int A00;
    public int A01;
    public long A02;
    public C32481gS A03;
    public boolean A04;
    public final C90504eH A05 = C90504eH.A05(10);

    public void A6b(C90504eH r9) {
        C90524eJ.A01(this.A03);
        if (this.A04) {
            int i2 = r9.A00;
            int i3 = r9.A01;
            int i4 = i2 - i3;
            int i5 = this.A00;
            if (i5 < 10) {
                int min = Math.min(i4, 10 - i5);
                byte[] bArr = r9.A02;
                C90504eH r4 = this.A05;
                System.arraycopy(bArr, i3, r4.A02, i5, min);
                if (this.A00 + min == 10) {
                    r4.A0S(0);
                    if (73 == r4.A0C() && 68 == r4.A0C() && 51 == r4.A0C()) {
                        r4.A0T(3);
                        this.A01 = r4.A0B() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.A04 = false;
                        return;
                    }
                }
            }
            int A06 = AnonymousClass3K4.A06(this.A01, this.A00, i4);
            this.A03.Acw(r9, A06);
            this.A00 += A06;
        }
    }

    public void A7e(C15060qG r4, AnonymousClass4WV r5) {
        r5.A03();
        C32481gS Ah1 = r4.Ah1(r5.A01(), 5);
        this.A03 = Ah1;
        C32471gR A0N = AnonymousClass3K4.A0N();
        A0N.A0O = r5.A02();
        A0N.A0R = "application/id3";
        AnonymousClass3K3.A19(A0N, Ah1);
    }

    public void Aa7() {
        int i2;
        C32481gS r1 = this.A03;
        C90524eJ.A01(r1);
        if (this.A04 && (i2 = this.A01) != 0 && this.A00 == i2) {
            r1.Ad0((C86824Uh) null, 1, i2, 0, this.A02);
            this.A04 = false;
        }
    }

    public void Aa8(long j2, int i2) {
        if ((i2 & 4) != 0) {
            this.A04 = true;
            this.A02 = j2;
            this.A01 = 0;
            this.A00 = 0;
        }
    }

    public void AdB() {
        this.A04 = false;
    }
}
