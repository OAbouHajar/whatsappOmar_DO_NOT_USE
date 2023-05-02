package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.4om  reason: invalid class name and case insensitive filesystem */
public final class C96714om implements C32371gD {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C85114Ne A04;

    public C96714om(C85114Ne r3, int i2, long j2, long j3) {
        this.A04 = r3;
        this.A00 = i2;
        this.A03 = j2;
        long j4 = (j3 - j2) / ((long) r3.A01);
        this.A01 = j4;
        this.A02 = AnonymousClass3K4.A0G(j4 * ((long) i2), (long) r3.A03);
    }

    public long ABr() {
        return this.A02;
    }

    public AnonymousClass4VV AFq(long j2) {
        C85114Ne r6 = this.A04;
        long j3 = (long) r6.A03;
        long j4 = (long) this.A00;
        long j5 = (j3 * j2) / (j4 * SearchActionVerificationClientService.MS_TO_NS);
        long j6 = this.A01 - 1;
        long A0T = AnonymousClass3K3.A0T(j5, j6);
        long j7 = this.A03;
        long j8 = (long) r6.A01;
        long A05 = AnonymousClass3C1.A05(A0T * j4, SearchActionVerificationClientService.MS_TO_NS, j3);
        C89174bi r10 = new C89174bi(A05, j7 + (j8 * A0T));
        if (A05 >= j2 || A0T == j6) {
            return new AnonymousClass4VV(r10, r10);
        }
        long j9 = A0T + 1;
        return AnonymousClass4VV.A00(r10, AnonymousClass3C1.A05(j9 * j4, SearchActionVerificationClientService.MS_TO_NS, j3), j7 + (j8 * j9));
    }

    public boolean AJe() {
        return true;
    }
}
