package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class NullReader extends Reader {
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullReader(long j2) {
        this(j2, true, false);
    }

    public NullReader(long j2, boolean z2, boolean z3) {
        this.mark = -1;
        this.size = j2;
        this.markSupported = z2;
        this.throwEofException = z3;
    }

    private int doEndOfFile() throws EOFException {
        this.eof = true;
        if (!this.throwEofException) {
            return -1;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        this.eof = false;
        this.position = 0;
        this.mark = -1;
    }

    public long getPosition() {
        return this.position;
    }

    public long getSize() {
        return this.size;
    }

    public synchronized void mark(int i2) {
        if (this.markSupported) {
            this.mark = this.position;
            this.readlimit = (long) i2;
        } else {
            throw new UnsupportedOperationException("Mark not supported");
        }
    }

    public boolean markSupported() {
        return this.markSupported;
    }

    /* access modifiers changed from: protected */
    public int processChar() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void processChars(char[] cArr, int i2, int i3) {
    }

    public int read() throws IOException {
        if (!this.eof) {
            long j2 = this.position;
            if (j2 == this.size) {
                return doEndOfFile();
            }
            this.position = j2 + 1;
            return processChar();
        }
        throw new IOException("Read after end of file");
    }

    public int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    public int read(char[] cArr, int i2, int i3) throws IOException {
        if (!this.eof) {
            long j2 = this.position;
            long j3 = this.size;
            if (j2 == j3) {
                return doEndOfFile();
            }
            long j4 = j2 + ((long) i3);
            this.position = j4;
            int i4 = i3;
            if (j4 > j3) {
                i4 = i3 - ((int) (j4 - j3));
                this.position = j3;
            }
            processChars(cArr, i2, i4);
            return i4;
        }
        throw new IOException("Read after end of file");
    }

    public synchronized void reset() throws IOException {
        if (this.markSupported) {
            long j2 = this.mark;
            if (j2 < 0) {
                throw new IOException("No position has been marked");
            } else if (this.position <= this.readlimit + j2) {
                this.position = j2;
                this.eof = false;
            } else {
                throw new IOException("Marked position [" + this.mark + "] is no longer valid - passed the read limit [" + this.readlimit + "]");
            }
        } else {
            throw new UnsupportedOperationException("Mark not supported");
        }
    }

    public long skip(long j2) throws IOException {
        if (!this.eof) {
            long j3 = this.position;
            long j4 = this.size;
            if (j3 == j4) {
                return (long) doEndOfFile();
            }
            long j5 = j3 + j2;
            this.position = j5;
            long j6 = j2;
            if (j5 <= j4) {
                return j6;
            }
            long j7 = j2 - (j5 - j4);
            this.position = j4;
            return j7;
        }
        throw new IOException("Skip after end of file");
    }
}
