package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.37v  reason: invalid class name and case insensitive filesystem */
public class C611637v extends InputStream {
    public ByteArrayInputStream A00;
    public boolean A01;
    public final InputStream A02;
    public final Cipher A03;
    public final Mac A04;

    public C611637v(C43061zH r5, InputStream inputStream) {
        this.A02 = inputStream;
        byte[] bArr = r5.A01;
        this.A03 = C61873At.A01(bArr, r5.A00, 1);
        this.A04 = C61873At.A02(bArr, r5.A02);
    }

    public void close() {
        this.A02.close();
    }

    public int read() {
        byte[] bArr = new byte[1];
        while (true) {
            int read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
            if (read != 0) {
                return bArr[0];
            }
            Thread.yield();
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5.A01 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            java.io.ByteArrayInputStream r0 = r5.A00
            r3 = -1
            if (r0 == 0) goto L_0x0013
            int r2 = r0.read(r6, r7, r8)
            if (r2 > 0) goto L_0x0081
            r0 = 0
            r5.A00 = r0
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            return r3
        L_0x0013:
            java.io.InputStream r0 = r5.A02
            int r2 = r0.read(r6, r7, r8)
            if (r2 != r3) goto L_0x0022
            r0 = 42
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r0)
            goto L_0x0039
        L_0x0022:
            if (r2 <= 0) goto L_0x0081
            javax.crypto.Cipher r0 = r5.A03
            byte[] r1 = r0.update(r6, r7, r2)
            r3 = 0
            if (r1 == 0) goto L_0x0012
            javax.crypto.Mac r0 = r5.A04
            r0.update(r1)
            int r2 = r1.length
            if (r2 > r8) goto L_0x0075
            java.lang.System.arraycopy(r1, r3, r6, r7, r2)
            return r2
        L_0x0039:
            javax.crypto.Cipher r0 = r5.A03     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x006e }
            byte[] r1 = r0.doFinal()     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x006e }
            r4.put(r1)
            javax.crypto.Mac r0 = r5.A04
            byte[] r3 = r0.doFinal(r1)
            r2 = 10
            byte[] r1 = new byte[r2]
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)
            r4.put(r1)
            r4.flip()
            int r0 = r4.remaining()
            byte[] r0 = new byte[r0]
            r4.get(r0)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            r5.A00 = r1
            r0 = 1
            r5.A01 = r0
            int r0 = r1.read(r6, r7, r8)
            return r0
        L_0x006e:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0075:
            java.lang.System.arraycopy(r1, r3, r6, r7, r8)
            int r2 = r2 - r8
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1, r8, r2)
            r5.A00 = r0
            return r8
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611637v.read(byte[], int, int):int");
    }
}
