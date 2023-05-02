package org.apache.commons.io.output;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.input.ClosedInputStream;

public class ByteArrayOutputStream extends OutputStream {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private final List<byte[]> buffers;
    private int count;
    private byte[] currentBuffer;
    private int currentBufferIndex;
    private int filledBufferSum;

    public ByteArrayOutputStream() {
        this(1024);
    }

    public ByteArrayOutputStream(int i2) {
        this.buffers = new ArrayList();
        if (i2 >= 0) {
            synchronized (this) {
                needNewBuffer(i2);
            }
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i2);
    }

    private void needNewBuffer(int i2) {
        int i3;
        if (this.currentBufferIndex < this.buffers.size() - 1) {
            this.filledBufferSum += this.currentBuffer.length;
            int i4 = this.currentBufferIndex + 1;
            this.currentBufferIndex = i4;
            this.currentBuffer = this.buffers.get(i4);
            return;
        }
        byte[] bArr = this.currentBuffer;
        if (bArr == null) {
            i3 = i2;
            this.filledBufferSum = 0;
        } else {
            i3 = Math.max(bArr.length << 1, i2 - this.filledBufferSum);
            this.filledBufferSum += this.currentBuffer.length;
        }
        this.currentBufferIndex++;
        byte[] bArr2 = new byte[i3];
        this.currentBuffer = bArr2;
        this.buffers.add(bArr2);
    }

    private InputStream toBufferedInputStream() {
        int i2 = this.count;
        if (i2 == 0) {
            return new ClosedInputStream();
        }
        ArrayList arrayList = new ArrayList(this.buffers.size());
        for (byte[] next : this.buffers) {
            int min = Math.min(next.length, i2);
            arrayList.add(new ByteArrayInputStream(next, 0, min));
            i2 -= min;
            if (i2 == 0) {
                break;
            }
        }
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(inputStream);
        return byteArrayOutputStream.toBufferedInputStream();
    }

    public void close() throws IOException {
    }

    public synchronized void reset() {
        this.count = 0;
        this.filledBufferSum = 0;
        this.currentBufferIndex = 0;
        this.currentBuffer = this.buffers.get(0);
    }

    public synchronized int size() {
        return this.count;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized byte[] toByteArray() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.count     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0009
            byte[] r1 = EMPTY_BYTE_ARRAY     // Catch:{ all -> 0x002f }
            monitor-exit(r7)
            return r1
        L_0x0009:
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x002f }
            r2 = 0
            java.util.List<byte[]> r3 = r7.buffers     // Catch:{ all -> 0x002f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002f }
        L_0x0012:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x002d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x002f }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x002f }
            int r5 = r4.length     // Catch:{ all -> 0x002f }
            int r5 = java.lang.Math.min(r5, r0)     // Catch:{ all -> 0x002f }
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r1, r2, r5)     // Catch:{ all -> 0x002f }
            int r2 = r2 + r5
            int r0 = r0 - r5
            if (r0 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            goto L_0x0012
        L_0x002d:
            monitor-exit(r7)
            return r1
        L_0x002f:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x0033
        L_0x0032:
            throw r0
        L_0x0033:
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.output.ByteArrayOutputStream.toByteArray():byte[]");
    }

    public String toString() {
        return new String(toByteArray());
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    public synchronized int write(InputStream inputStream) throws IOException {
        int i2;
        i2 = 0;
        int i3 = this.count - this.filledBufferSum;
        byte[] bArr = this.currentBuffer;
        int read = inputStream.read(bArr, i3, bArr.length - i3);
        while (read != -1) {
            i2 += read;
            i3 += read;
            this.count += read;
            byte[] bArr2 = this.currentBuffer;
            if (i3 == bArr2.length) {
                needNewBuffer(bArr2.length);
                i3 = 0;
            }
            byte[] bArr3 = this.currentBuffer;
            read = inputStream.read(bArr3, i3, bArr3.length - i3);
        }
        return i2;
    }

    public synchronized void write(int i2) {
        int i3 = this.count;
        int i4 = i3 - this.filledBufferSum;
        if (i4 == this.currentBuffer.length) {
            needNewBuffer(i3 + 1);
            i4 = 0;
        }
        this.currentBuffer[i4] = (byte) i2;
        this.count++;
    }

    public void write(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || i2 + i3 > bArr.length || i2 + i3 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i3 != 0) {
            synchronized (this) {
                int i4 = this.count;
                int i5 = i4 + i3;
                int i6 = i3;
                int i7 = i4 - this.filledBufferSum;
                while (i6 > 0) {
                    int min = Math.min(i6, this.currentBuffer.length - i7);
                    System.arraycopy(bArr, (i2 + i3) - i6, this.currentBuffer, i7, min);
                    i6 -= min;
                    if (i6 > 0) {
                        needNewBuffer(i5);
                        i7 = 0;
                    }
                }
                this.count = i5;
            }
        }
    }

    public synchronized void writeTo(OutputStream outputStream) throws IOException {
        int i2 = this.count;
        for (byte[] next : this.buffers) {
            int min = Math.min(next.length, i2);
            outputStream.write(next, 0, min);
            i2 -= min;
            if (i2 == 0) {
                break;
            }
        }
    }
}
