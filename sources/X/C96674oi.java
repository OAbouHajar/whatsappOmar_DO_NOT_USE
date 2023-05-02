package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.4oi  reason: invalid class name and case insensitive filesystem */
public final class C96674oi implements C32371gD {
    public final /* synthetic */ C96864p1 A00;

    public C96674oi(C96864p1 r1) {
        this.A00 = r1;
    }

    public long ABr() {
        C96864p1 r0 = this.A00;
        return (r0.A07 * SearchActionVerificationClientService.MS_TO_NS) / ((long) r0.A0B.A00);
    }

    public AnonymousClass4VV AFq(long j2) {
        C96864p1 r8 = this.A00;
        long A0S = AnonymousClass3K3.A0S((long) r8.A0B.A00, j2);
        long j3 = r8.A09;
        long j4 = r8.A08;
        C89174bi r1 = new C89174bi(j2, Math.max(j3, Math.min((j3 + ((A0S * (j4 - j3)) / r8.A07)) - AnonymousClass1NO.A0L, j4 - 1)));
        return new AnonymousClass4VV(r1, r1);
    }

    public boolean AJe() {
        return true;
    }
}
