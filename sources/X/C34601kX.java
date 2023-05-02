package X;

import java.util.Arrays;

/* renamed from: X.1kX  reason: invalid class name and case insensitive filesystem */
public class C34601kX {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public final C16740tZ A05;

    public C34601kX(C16740tZ r6) {
        this.A05 = r6;
        this.A04 = null;
        this.A00 = 0;
        this.A01 = Long.MAX_VALUE;
        this.A03 = null;
        this.A02 = null;
    }

    public C34601kX(C16740tZ r4, String str, long j2) {
        this.A05 = r4;
        this.A04 = str;
        this.A00 = j2;
        this.A01 = Long.MAX_VALUE;
        this.A03 = null;
        this.A02 = null;
    }

    public C34601kX(C16740tZ r3, String str, String str2, String str3, long j2) {
        this.A05 = r3;
        this.A04 = str;
        this.A00 = j2;
        this.A01 = Long.MAX_VALUE;
        this.A03 = str2;
        this.A02 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((X.C16730tY) r1).A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00() {
        /*
            r2 = this;
            X.0tZ r1 = r2.A05
            boolean r0 = r1 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0017
            X.0tY r1 = (X.C16730tY) r1
            java.lang.String r1 = r1.A08
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "static.whatsapp.net/downloadable?category=PSA"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0017
        L_0x0015:
            r1 = 0
        L_0x0016:
            return r1
        L_0x0017:
            java.lang.String r0 = r2.A04
            r1 = 1
            if (r0 == 0) goto L_0x0016
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34601kX.A00():boolean");
    }

    public boolean A01(long j2) {
        long j3 = this.A01;
        return j3 == Long.MAX_VALUE ? j2 > this.A00 : j3 + 86400000 < j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34601kX)) {
            return false;
        }
        C34601kX r7 = (C34601kX) obj;
        return C34901l3.A00(this.A05, r7.A05) && C34901l3.A00(this.A04, r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && C34901l3.A00(this.A03, r7.A03) && C34901l3.A00(this.A02, r7.A02);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A04, Long.valueOf(this.A00), Long.valueOf(this.A01), this.A03, this.A02});
    }
}
