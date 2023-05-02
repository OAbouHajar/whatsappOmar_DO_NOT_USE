package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.4X5  reason: invalid class name */
public final class AnonymousClass4X5 {
    public long A00;
    public long A01 = -9223372036854775807L;
    public long A02;

    public AnonymousClass4X5(long j2) {
        this.A00 = j2;
    }

    public synchronized long A00() {
        long j2;
        j2 = -9223372036854775807L;
        if (this.A00 == Long.MAX_VALUE) {
            j2 = 0;
        } else if (this.A01 != -9223372036854775807L) {
            j2 = this.A02;
        }
        return j2;
    }

    public synchronized long A01(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A01 != -9223372036854775807L) {
            this.A01 = j2;
        } else {
            long j3 = this.A00;
            if (j3 != Long.MAX_VALUE) {
                this.A02 = j3 - j2;
            }
            this.A01 = j2;
            notifyAll();
        }
        return j2 + this.A02;
    }

    public synchronized long A02(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.A01;
        if (j3 != -9223372036854775807L) {
            long A0S = AnonymousClass3K3.A0S(j3, 90000);
            long j4 = (4294967296L + A0S) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j2;
            j2 += j4 * 8589934592L;
            if (Math.abs(j5 - A0S) < Math.abs(j2 - A0S)) {
                j2 = j5;
            }
        }
        return A01((j2 * SearchActionVerificationClientService.MS_TO_NS) / 90000);
    }
}
