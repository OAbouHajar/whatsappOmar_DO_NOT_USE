package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.4pK  reason: invalid class name and case insensitive filesystem */
public final class C97054pK implements AnonymousClass5SO {
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C32491gT A04;
    public final C15060qG A05;
    public final C32481gS A06;
    public final C85114Ne A07;

    public C97054pK(C15060qG r7, C32481gS r8, C85114Ne r9, String str, int i2) {
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        int i3 = r9.A04;
        int i4 = (r9.A00 * i3) >> 3;
        int i5 = r9.A01;
        if (i5 == i4) {
            int i6 = r9.A03;
            int i7 = i6 * i4;
            int i8 = i7 << 3;
            int max = Math.max(i4, i7 / 10);
            this.A03 = max;
            C32471gR A0N = AnonymousClass3K4.A0N();
            A0N.A0R = str;
            A0N.A03 = i8;
            A0N.A0A = i8;
            A0N.A08 = max;
            A0N.A04 = i3;
            A0N.A0D = i6;
            A0N.A09 = i2;
            this.A04 = new C32491gT(A0N);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Expected block size: ");
        A0r.append(i4);
        throw AnonymousClass40M.A00(C13680ns.A0i("; got: ", A0r, i5));
    }

    public void AHw(int i2, long j2) {
        this.A05.AdD(new C96714om(this.A07, 1, (long) i2, j2));
        this.A06.A9D(this.A04);
    }

    public void AcO(long j2) {
        this.A02 = j2;
        this.A00 = 0;
        this.A01 = 0;
    }

    public boolean Acy(C55142iu r18, long j2) {
        int i2;
        int i3;
        long j3 = j2;
        while (true) {
            if (j3 <= 0 || (i2 = this.A00) >= (i3 = this.A03)) {
                break;
            }
            int Acz = this.A06.Acz(r18, (int) Math.min((long) (i3 - i2), j3), 0, true);
            if (Acz == -1) {
                j3 = 0;
                break;
            }
            this.A00 += Acz;
            j3 -= (long) Acz;
        }
        C85114Ne r4 = this.A07;
        int i4 = r4.A01;
        int i5 = this.A00;
        int i6 = i5 / i4;
        if (i6 > 0) {
            int i7 = i6 * i4;
            int i8 = i5 - i7;
            this.A06.Ad0((C86824Uh) null, 1, i7, i8, this.A02 + AnonymousClass3C1.A05(this.A01, SearchActionVerificationClientService.MS_TO_NS, (long) r4.A03));
            this.A01 += (long) i6;
            this.A00 = i8;
        }
        return AnonymousClass3K4.A18((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)));
    }
}
