package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.4oj  reason: invalid class name and case insensitive filesystem */
public final class C96684oj implements C32371gD {
    public final long A00;
    public final C90654eW A01;

    public C96684oj(C90654eW r1, long j2) {
        this.A01 = r1;
        this.A00 = j2;
    }

    public long ABr() {
        return this.A01.A02();
    }

    public AnonymousClass4VV AFq(long j2) {
        long j3;
        C90654eW r1 = this.A01;
        AnonymousClass4G8 r0 = r1.A0A;
        C90524eJ.A01(r0);
        long[] jArr = r0.A01;
        long[] jArr2 = r0.A00;
        long j4 = (long) r1.A07;
        int A04 = AnonymousClass3C1.A04(jArr, AnonymousClass3K3.A0T(AnonymousClass3K3.A0S(j2, j4), r1.A09 - 1), false);
        long j5 = 0;
        if (A04 == -1) {
            j3 = 0;
        } else {
            j3 = jArr[A04];
            if (A04 != -1) {
                j5 = jArr2[A04];
            }
        }
        long j6 = this.A00;
        C89174bi r12 = new C89174bi((j3 * SearchActionVerificationClientService.MS_TO_NS) / j4, j6 + j5);
        if (r12.A01 == j2 || A04 == jArr.length - 1) {
            return new AnonymousClass4VV(r12, r12);
        }
        int i2 = A04 + 1;
        return AnonymousClass4VV.A00(r12, (jArr[i2] * SearchActionVerificationClientService.MS_TO_NS) / j4, j6 + jArr2[i2]);
    }

    public boolean AJe() {
        return true;
    }
}
