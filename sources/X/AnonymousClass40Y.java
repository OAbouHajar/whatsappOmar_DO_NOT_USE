package X;

import java.io.InputStream;

/* renamed from: X.40Y  reason: invalid class name */
public class AnonymousClass40Y extends InputStream {
    public AnonymousClass40Z A00 = new AnonymousClass40Z();
    public C108115Ms A01;

    public AnonymousClass40Y(C108115Ms r2) {
        this.A01 = r2;
    }

    public int available() {
        return this.A00.available();
    }

    public void close() {
        this.A00.close();
    }

    public synchronized void mark(int i2) {
        this.A00.mark(i2);
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw AnonymousClass3K3.A0e("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) ((short) (bArr[0] & 255));
        } else {
            return -1;
        }
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw AnonymousClass3K3.A0e("Buffer is null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011b, code lost:
        r8.A0A(r0.ex, (byte) 2, r0.description, r0.errorTransient);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0126, code lost:
        r8.A0A(new javax.net.ssl.SSLException(X.AnonymousClass3K3.A0r(r0)), (byte) 2, (byte) 80, false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r12 = r19
            r10 = r21
            r11 = r20
            if (r19 == 0) goto L_0x0165
            r9 = 0
            if (r21 == 0) goto L_0x0173
            int r1 = r20 + r21
            int r0 = r12.length
            if (r1 <= r0) goto L_0x0017
            java.lang.String r0 = "Not enough space in destination buffer."
        L_0x0012:
            java.io.IOException r0 = X.AnonymousClass3K3.A0e(r0)
            throw r0
        L_0x0017:
            r1 = r18
            X.40Z r13 = r1.A00
            int r0 = r13.available()
            if (r0 <= 0) goto L_0x0037
            int r3 = java.lang.Math.min(r10, r0)
            int r2 = r13.read(r12, r11, r3)
            if (r2 > r3) goto L_0x0154
            int r11 = r11 + r3
            int r10 = r10 - r3
            int r9 = r9 + r3
        L_0x002e:
            int r0 = r13.available()
            if (r0 == 0) goto L_0x0173
            if (r9 < r10) goto L_0x0017
            return r9
        L_0x0037:
            X.5Ms r8 = r1.A01
            X.5Cj r8 = (X.C106065Cj) r8
            boolean r0 = r8.A0E
            r7 = 80
            r6 = 0
            r5 = 2
            r4 = 0
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r8.A0D
            if (r0 != 0) goto L_0x00fe
            X.4zw r1 = r8.A04
            boolean r0 = r1.A0Z
            if (r0 == 0) goto L_0x00fe
            java.util.List r0 = r1.A0R
            if (r0 == 0) goto L_0x00fe
            java.util.List r0 = r1.A0S
            if (r0 == 0) goto L_0x00fe
            r1.A0Y = r6     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.4QL r2 = r8.A08     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.3ve r0 = new X.3ve     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r2.A00(r0)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r8.A06()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.4zw r1 = r8.A04     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            boolean r0 = r1.A0f     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r16 = 0
            if (r0 != 0) goto L_0x00a4
            java.util.List r0 = r1.A0R     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r2 = 0
        L_0x0077:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x0092
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.4RH r14 = (X.AnonymousClass4RH) r14     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            long r2 = r2 + r0
            X.4QL r1 = r8.A08     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.3vY r0 = new X.3vY     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r1.A00(r0)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            goto L_0x0077
        L_0x0092:
            X.41Y r14 = X.AnonymousClass41Y.DEBUG     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.lang.String r0 = "Replayed early data len = "
            r1.append(r0)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.lang.String r0 = X.C13680ns.A0j(r1, r2)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.AnonymousClass4Yd.A00(r14, r0)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
        L_0x00a4:
            X.4zw r0 = r8.A04     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.util.List r0 = r0.A0S     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r2 = 0
        L_0x00ae:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.4RH r14 = (X.AnonymousClass4RH) r14     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            long r2 = r2 + r0
            X.4QL r1 = r8.A08     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.3vY r0 = new X.3vY     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            r1.A00(r0)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            goto L_0x00ae
        L_0x00c9:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f8
            X.41Y r14 = X.AnonymousClass41Y.DEBUG     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.lang.String r0 = "Spillover early data len = "
            r1.append(r0)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            java.lang.String r0 = X.C13680ns.A0j(r1, r2)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            X.AnonymousClass4Yd.A00(r14, r0)     // Catch:{ IOException -> 0x0169, 1aU -> 0x00ee, Exception -> 0x00e0 }
            goto L_0x00f8
        L_0x00e0:
            r0 = move-exception
            java.lang.Throwable r1 = X.AnonymousClass3K3.A0r(r0)     // Catch:{ all -> 0x016b }
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x016b }
            r0.<init>(r1)     // Catch:{ all -> 0x016b }
            r8.A0A(r0, r5, r7, r6)     // Catch:{ all -> 0x016b }
            goto L_0x00f8
        L_0x00ee:
            r0 = move-exception
            byte r2 = r0.description     // Catch:{ all -> 0x016b }
            boolean r1 = r0.errorTransient     // Catch:{ all -> 0x016b }
            javax.net.ssl.SSLException r0 = r0.ex     // Catch:{ all -> 0x016b }
            r8.A0A(r0, r5, r2, r1)     // Catch:{ all -> 0x016b }
        L_0x00f8:
            X.4zw r0 = r8.A04
            r0.A0R = r4
            r0.A0S = r4
        L_0x00fe:
            X.4zw r0 = r8.A04     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            X.4Wo r2 = r0.A0A     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            monitor-enter(r2)     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            X.4Eg r1 = r2.A01()     // Catch:{ all -> 0x0117 }
            monitor-exit(r2)     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            r4 = r1
            boolean r0 = r1 instanceof X.C77403vi     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            if (r0 != 0) goto L_0x0132
            boolean r0 = r1 instanceof X.C77283vW     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            if (r0 != 0) goto L_0x0148
            X.4QL r0 = r8.A08     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            r0.A00(r1)     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            goto L_0x0132
        L_0x0117:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
            throw r0     // Catch:{ 1aU -> 0x011a, Exception -> 0x0125 }
        L_0x011a:
            r0 = move-exception
            byte r2 = r0.description
            boolean r1 = r0.errorTransient
            javax.net.ssl.SSLException r0 = r0.ex
            r8.A0A(r0, r5, r2, r1)
            goto L_0x0132
        L_0x0125:
            r0 = move-exception
            java.lang.Throwable r1 = X.AnonymousClass3K3.A0r(r0)
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            r8.A0A(r0, r5, r7, r6)
        L_0x0132:
            X.4MX r0 = X.AnonymousClass4BR.A00
            java.lang.Class r1 = r0.getClass()
            X.4QL r0 = r8.A08
            X.4Kx r0 = r0.A00
            X.4MX r0 = r0.A00
            boolean r0 = r1.isInstance(r0)
            if (r0 == 0) goto L_0x0148
            boolean r0 = r4 instanceof X.C77293vX
            if (r0 == 0) goto L_0x00fe
        L_0x0148:
            boolean r0 = r4 instanceof X.C77283vW
            if (r0 == 0) goto L_0x002e
            r8.A09(r4)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        L_0x0154:
            java.lang.String r0 = "Read returned more than requested bytes. "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = " > "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r3)
            goto L_0x0012
        L_0x0165:
            java.lang.String r0 = "Buffer is null"
            goto L_0x0012
        L_0x0169:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x016b }
        L_0x016b:
            r1 = move-exception
            X.4zw r0 = r8.A04
            r0.A0R = r4
            r0.A0S = r4
            throw r1
        L_0x0173:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass40Y.read(byte[], int, int):int");
    }

    public synchronized void reset() {
        this.A00.reset();
    }

    public long skip(long j2) {
        return this.A00.skip(j2);
    }
}
