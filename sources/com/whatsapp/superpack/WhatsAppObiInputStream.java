package com.whatsapp.superpack;

import java.io.InputStream;

public class WhatsAppObiInputStream extends InputStream {
    public final byte[] oneByte = new byte[1];
    public long ptr;

    public WhatsAppObiInputStream(long j2) {
        if (j2 != 0) {
            this.ptr = j2;
            return;
        }
        throw null;
    }

    public static native void closeNative(long j2);

    public static WhatsAppObiInputStream openBytes(byte[] bArr) {
        return openBytes(bArr, 0, bArr.length);
    }

    public static WhatsAppObiInputStream openBytes(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i3 <= 0 || i2 + i3 > bArr.length) {
            throw new IllegalArgumentException("Invalid byte array offset/length");
        }
        long openBytesNative = openBytesNative(bArr, i2, i3);
        if (openBytesNative != 0) {
            return new WhatsAppObiInputStream(openBytesNative);
        }
        throw new IllegalStateException("Failed to open OBI input stream");
    }

    public static native long openBytesNative(byte[] bArr, int i2, int i3);

    public static native long openInputStreamNative(InputStream inputStream, int i2);

    public static WhatsAppObiInputStream openStream(InputStream inputStream, int i2) {
        long openInputStreamNative = openInputStreamNative(inputStream, i2);
        if (openInputStreamNative != 0) {
            return new WhatsAppObiInputStream(openInputStreamNative);
        }
        throw new IllegalStateException("Failed to open OBI input stream");
    }

    public static native int readNative(long j2, byte[] bArr, int i2, int i3);

    public synchronized void close() {
        closeNative(this.ptr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r2 = this;
            monitor-enter(r2)
            byte[] r0 = r2.oneByte     // Catch:{ all -> 0x0021 }
            int r1 = r2.read(r0)     // Catch:{ all -> 0x0021 }
            r0 = -1
            if (r1 == r0) goto L_0x001f
            r0 = 1
            if (r1 != r0) goto L_0x0015
            byte[] r1 = r2.oneByte     // Catch:{ all -> 0x0021 }
            r0 = 0
            byte r0 = r1[r0]     // Catch:{ all -> 0x0021 }
            if (r0 >= 0) goto L_0x001f
            goto L_0x001d
        L_0x0015:
            java.lang.String r1 = "Unexpected number of bytes read"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0021 }
            r0.<init>(r1)     // Catch:{ all -> 0x0021 }
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x001d:
            int r0 = r0 + 256
        L_0x001f:
            monitor-exit(r2)
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.superpack.WhatsAppObiInputStream.read():int");
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            if (i3 + i2 <= bArr.length) {
                if (readNative(this.ptr, bArr, i2, i3) <= 0) {
                    return -1;
                }
                return i3;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
