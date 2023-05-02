package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

public class BoundedInputStream extends InputStream {
    private final InputStream in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1);
    }

    public BoundedInputStream(InputStream inputStream, long j2) {
        this.pos = 0;
        this.mark = -1;
        this.propagateClose = true;
        this.max = j2;
        this.in = inputStream;
    }

    public int available() throws IOException {
        long j2 = this.max;
        if (j2 < 0 || this.pos < j2) {
            return this.in.available();
        }
        return 0;
    }

    public void close() throws IOException {
        if (this.propagateClose) {
            this.in.close();
        }
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    public synchronized void mark(int i2) {
        this.in.mark(i2);
        this.mark = this.pos;
    }

    public boolean markSupported() {
        return this.in.markSupported();
    }

    public int read() throws IOException {
        long j2 = this.max;
        if (j2 >= 0 && this.pos >= j2) {
            return -1;
        }
        int read = this.in.read();
        this.pos++;
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.max;
        if (j2 >= 0 && this.pos >= j2) {
            return -1;
        }
        int read = this.in.read(bArr, i2, (int) (j2 >= 0 ? Math.min((long) i3, j2 - this.pos) : (long) i3));
        if (read == -1) {
            return -1;
        }
        this.pos += (long) read;
        return read;
    }

    public synchronized void reset() throws IOException {
        this.in.reset();
        this.pos = this.mark;
    }

    public void setPropagateClose(boolean z2) {
        this.propagateClose = z2;
    }

    public long skip(long j2) throws IOException {
        long j3 = this.max;
        long skip = this.in.skip(j3 >= 0 ? Math.min(j2, j3 - this.pos) : j2);
        this.pos += skip;
        return skip;
    }

    public String toString() {
        return this.in.toString();
    }
}
