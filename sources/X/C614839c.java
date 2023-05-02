package X;

import java.net.DatagramPacket;

/* renamed from: X.39c  reason: invalid class name and case insensitive filesystem */
public class C614839c {
    public final byte[] A00 = new byte[48];
    public volatile DatagramPacket A01;

    public final int A00(int i2) {
        byte[] bArr = this.A00;
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public synchronized DatagramPacket A01() {
        if (this.A01 == null) {
            byte[] bArr = this.A00;
            this.A01 = new DatagramPacket(bArr, bArr.length);
            this.A01.setPort(123);
        }
        return this.A01;
    }

    public final AnonymousClass553 A02(int i2) {
        byte[] bArr = this.A00;
        return new AnonymousClass553((((long) (bArr[i2] & 255)) << 56) | (((long) (bArr[i2 + 1] & 255)) << 48) | (((long) (bArr[i2 + 2] & 255)) << 40) | (((long) (bArr[i2 + 3] & 255)) << 32) | (((long) (bArr[i2 + 4] & 255)) << 24) | (((long) (bArr[i2 + 5] & 255)) << 16) | (((long) (bArr[i2 + 6] & 255)) << 8) | ((long) (bArr[i2 + 7] & 255)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0073, code lost:
        if (r6 == 4) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.String r0 = "[version:"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            byte[] r4 = r7.A00
            r3 = 0
            byte r0 = r4[r3]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 >> 3
            r0 = r0 & 7
            r2.append(r0)
            java.lang.String r0 = ", mode:"
            r2.append(r0)
            int r1 = r1 >> r3
            r0 = r1 & 7
            r2.append(r0)
            java.lang.String r0 = ", poll:"
            r2.append(r0)
            r0 = 2
            byte r0 = r4[r0]
            r2.append(r0)
            java.lang.String r0 = ", precision:"
            r2.append(r0)
            r0 = 3
            byte r0 = r4[r0]
            r2.append(r0)
            java.lang.String r0 = ", delay:"
            r2.append(r0)
            r0 = 4
            int r0 = r7.A00(r0)
            r2.append(r0)
            java.lang.String r0 = ", dispersion(ms):"
            r2.append(r0)
            r0 = 8
            int r0 = r7.A00(r0)
            double r5 = (double) r0
            r0 = 4634312102955297276(0x4050624dd2f1a9fc, double:65.536)
            double r5 = r5 / r0
            r2.append(r5)
            java.lang.String r0 = ", id:"
            r2.append(r0)
            byte r0 = r4[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> 3
            r6 = r0 & 7
            r5 = 1
            byte r0 = r4[r5]
            r3 = r0 & 255(0xff, float:3.57E-43)
            r1 = 4
            r0 = 3
            if (r6 == r0) goto L_0x006f
            if (r6 != r1) goto L_0x00d3
        L_0x006f:
            if (r3 == 0) goto L_0x00be
            if (r3 == r5) goto L_0x00be
            if (r6 != r1) goto L_0x00d3
        L_0x0075:
            r0 = 12
            int r0 = r7.A00(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
        L_0x007f:
            r2.append(r0)
            java.lang.String r0 = ", xmitTime:"
            r2.append(r0)
            r0 = 40
            X.553 r5 = r7.A02(r0)
            java.text.DateFormat r0 = r5.simpleFormatter
            if (r0 != 0) goto L_0x00a3
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = "EEE, MMM dd yyyy HH:mm:ss.SSS"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0, r3)
            r5.simpleFormatter = r1
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            r1.setTimeZone(r0)
        L_0x00a3:
            long r0 = r5.ntpTime
            long r3 = X.AnonymousClass553.A00(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            java.text.DateFormat r0 = r5.simpleFormatter
            java.lang.String r0 = r0.format(r1)
            r2.append(r0)
            java.lang.String r0 = " ]"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            return r0
        L_0x00be:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            r1 = 0
        L_0x00c3:
            int r0 = r1 + 12
            byte r0 = r4[r0]
            char r0 = (char) r0
            if (r0 == 0) goto L_0x0109
            r3.append(r0)
            int r1 = r1 + 1
            r0 = 3
            if (r1 > r0) goto L_0x0109
            goto L_0x00c3
        L_0x00d3:
            r0 = 2
            if (r3 < r0) goto L_0x0075
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            r0 = 12
            byte r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.append(r0)
            java.lang.String r1 = "."
            r3.append(r1)
            r0 = 13
            byte r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.append(r0)
            r3.append(r1)
            r0 = 14
            byte r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.append(r0)
            r3.append(r1)
            r0 = 15
            byte r0 = r4[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.append(r0)
        L_0x0109:
            java.lang.String r0 = r3.toString()
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614839c.toString():java.lang.String");
    }
}
