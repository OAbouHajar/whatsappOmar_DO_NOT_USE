package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.2gt  reason: invalid class name and case insensitive filesystem */
public final class C54152gt extends FilterOutputStream {
    public boolean A00;
    public final ByteBuffer A01;

    public C54152gt(OutputStream outputStream) {
        super(outputStream);
        if (outputStream != null) {
            this.A01 = ByteBuffer.allocate(8192);
            return;
        }
        throw new NullPointerException("out may not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        java.lang.Thread.currentThread().stop(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void close() {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.flush()     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            java.io.OutputStream r2 = r3.out     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            java.lang.String r1 = "0\r\n\r\n"
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            r2.write(r0)     // Catch:{ UnsupportedCharsetException -> 0x0028, all -> 0x0013 }
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = move-exception
        L_0x0014:
            super.close()     // Catch:{ all -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r0 = move-exception
            if (r1 != 0) goto L_0x001f
            r1 = r0
            goto L_0x001f
        L_0x001d:
            if (r1 == 0) goto L_0x0026
        L_0x001f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002f }
            r0.stop(r1)     // Catch:{ all -> 0x002f }
        L_0x0026:
            monitor-exit(r3)
            return
        L_0x0028:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error     // Catch:{ all -> 0x002f }
            r0.<init>(r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54152gt.close():void");
    }

    public synchronized void flush() {
        if (!this.A00) {
            this.out.write("POST /chat HTTP/1.1\r\nHost: c.whatsapp.net\r\nUser-Agent: Mozilla/5.0 (compatible; WAChat/1.2; +http://www.whatsapp.com/contact)\r\nTransfer-Encoding: chunked\r\n\r\n".getBytes(AnonymousClass01S.A08));
            this.A00 = true;
        }
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer.position() > 0) {
            this.out.write(Integer.toHexString(byteBuffer.position()).getBytes(AnonymousClass01S.A08));
            this.out.write(13);
            this.out.write(10);
            this.out.write(byteBuffer.array(), 0, byteBuffer.position());
            this.out.write(13);
            this.out.write(10);
            byteBuffer.clear();
        }
        super.flush();
    }

    public synchronized void write(int i2) {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            flush();
        }
        byteBuffer.put((byte) i2);
    }

    public synchronized void write(byte[] bArr, int i2, int i3) {
        while (true) {
            ByteBuffer byteBuffer = this.A01;
            if (i3 > byteBuffer.remaining()) {
                int remaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i2, remaining);
                flush();
                i2 += remaining;
                i3 -= remaining;
            } else {
                byteBuffer.put(bArr, i2, i3);
            }
        }
    }
}
