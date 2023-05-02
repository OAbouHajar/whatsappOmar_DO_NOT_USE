package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;

/* renamed from: X.4V5  reason: invalid class name */
public final class AnonymousClass4V5 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public final boolean[] A07 = new boolean[15];

    public void A00() {
        this.A03 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A00 = 0;
        Arrays.fill(this.A07, false);
    }

    public void A01(long j2) {
        int i2;
        long j3 = this.A03;
        if (j3 == 0) {
            this.A02 = j2;
        } else if (j3 == 1) {
            long j4 = j2 - this.A02;
            this.A01 = j4;
            this.A06 = j4;
            this.A05 = 1;
        } else {
            long j5 = j2 - this.A04;
            int i3 = (int) (j3 % 15);
            if (Math.abs(j5 - this.A01) <= SearchActionVerificationClientService.MS_TO_NS) {
                this.A05++;
                this.A06 += j5;
                boolean[] zArr = this.A07;
                if (zArr[i3]) {
                    zArr[i3] = false;
                    i2 = this.A00 - 1;
                }
            } else {
                boolean[] zArr2 = this.A07;
                if (!zArr2[i3]) {
                    zArr2[i3] = true;
                    i2 = this.A00 + 1;
                }
            }
            this.A00 = i2;
        }
        this.A03 = j3 + 1;
        this.A04 = j2;
    }
}
