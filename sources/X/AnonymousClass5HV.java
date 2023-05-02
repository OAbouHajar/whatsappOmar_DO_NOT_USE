package X;

import java.io.OutputStream;

/* renamed from: X.5HV  reason: invalid class name */
public class AnonymousClass5HV extends AnonymousClass5IW {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5HV(X.C32391gH r5, int r6) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r2 = 0
        L_0x0006:
            int r0 = r5.A00
            if (r2 == r0) goto L_0x0029
            X.1fb r1 = r5.A01(r2)     // Catch:{ IOException -> 0x001c }
            X.1fa r1 = (X.C32061fa) r1     // Catch:{ IOException -> 0x001c }
            java.lang.String r0 = "BER"
            byte[] r0 = r1.A02(r0)     // Catch:{ IOException -> 0x001c }
            r3.write(r0)     // Catch:{ IOException -> 0x001c }
            int r2 = r2 + 1
            goto L_0x0006
        L_0x001c:
            r2 = move-exception
            java.lang.String r0 = "malformed object: "
            java.lang.String r1 = X.AnonymousClass000.A0g(r0, r2)
            X.44B r0 = new X.44B
            r0.<init>(r1, r2)
            throw r0
        L_0x0029:
            byte[] r1 = r3.toByteArray()
            r0 = 1
            r4.<init>(r1, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5HV.<init>(X.1gH, int):void");
    }

    public void A07(C33061hs r5, boolean z2) {
        int i2 = 64;
        if (this.A01) {
            i2 = 96;
        }
        int i3 = this.A00;
        byte[] bArr = this.A02;
        r5.A03(i2, i3, z2);
        OutputStream outputStream = r5.A00;
        outputStream.write(128);
        outputStream.write(bArr, 0, bArr.length);
        outputStream.write(0);
        outputStream.write(0);
    }
}
