package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.4op  reason: invalid class name and case insensitive filesystem */
public class C96744op implements C32371gD {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public C96744op(int i2, int i3, long j2, long j3) {
        long max;
        this.A05 = j2;
        this.A04 = j3;
        this.A01 = i3 == -1 ? 1 : i3;
        this.A00 = i2;
        if (j2 == -1) {
            this.A02 = -1;
            max = -9223372036854775807L;
        } else {
            long j4 = j2 - j3;
            this.A02 = j4;
            max = ((Math.max(0, j4) * 8) * SearchActionVerificationClientService.MS_TO_NS) / ((long) i2);
        }
        this.A03 = max;
    }

    public long A00(long j2) {
        return ((Math.max(0, j2 - this.A04) * 8) * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A00);
    }

    public long ABr() {
        return this.A03;
    }

    public AnonymousClass4VV AFq(long j2) {
        long j3 = this.A02;
        if (j3 == -1) {
            C89174bi r1 = new C89174bi(0, this.A04);
            return new AnonymousClass4VV(r1, r1);
        }
        long j4 = (long) this.A01;
        long A0T = this.A04 + AnonymousClass3K3.A0T((((j2 * ((long) this.A00)) / 8000000) / j4) * j4, j3 - j4);
        long A002 = A00(A0T);
        C89174bi r7 = new C89174bi(A002, A0T);
        if (A002 < j2) {
            long j5 = j4 + A0T;
            if (j5 < this.A05) {
                return AnonymousClass4VV.A00(r7, A00(j5), j5);
            }
        }
        return new AnonymousClass4VV(r7, r7);
    }

    public boolean AJe() {
        return AnonymousClass000.A1O((this.A02 > -1 ? 1 : (this.A02 == -1 ? 0 : -1)));
    }
}
