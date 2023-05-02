package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public abstract class ProxyReader extends FilterReader {
    public ProxyReader(Reader reader) {
        super(reader);
    }

    /* access modifiers changed from: protected */
    public void afterRead(int i2) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void beforeRead(int i2) throws IOException {
    }

    public void close() throws IOException {
        try {
            this.in.close();
        } catch (IOException e2) {
            handleIOException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }

    public synchronized void mark(int i2) throws IOException {
        try {
            this.in.mark(i2);
        } catch (IOException e2) {
            handleIOException(e2);
        }
        return;
    }

    public boolean markSupported() {
        return this.in.markSupported();
    }

    public int read() throws IOException {
        int i2 = 1;
        try {
            beforeRead(1);
            int read = this.in.read();
            if (read == -1) {
                i2 = -1;
            }
            afterRead(i2);
            return read;
        } catch (IOException e2) {
            handleIOException(e2);
            return -1;
        }
    }

    public int read(CharBuffer charBuffer) throws IOException {
        int i2;
        if (charBuffer != null) {
            try {
                i2 = charBuffer.length();
            } catch (IOException e2) {
                handleIOException(e2);
                return -1;
            }
        } else {
            i2 = 0;
        }
        beforeRead(i2);
        int read = this.in.read(charBuffer);
        afterRead(read);
        return read;
    }

    public int read(char[] cArr) throws IOException {
        int i2;
        if (cArr != null) {
            try {
                i2 = cArr.length;
            } catch (IOException e2) {
                handleIOException(e2);
                return -1;
            }
        } else {
            i2 = 0;
        }
        beforeRead(i2);
        int read = this.in.read(cArr);
        afterRead(read);
        return read;
    }

    public int read(char[] cArr, int i2, int i3) throws IOException {
        try {
            beforeRead(i3);
            int read = this.in.read(cArr, i2, i3);
            afterRead(read);
            return read;
        } catch (IOException e2) {
            handleIOException(e2);
            return -1;
        }
    }

    public boolean ready() throws IOException {
        try {
            return this.in.ready();
        } catch (IOException e2) {
            handleIOException(e2);
            return false;
        }
    }

    public synchronized void reset() throws IOException {
        try {
            this.in.reset();
        } catch (IOException e2) {
            handleIOException(e2);
        }
        return;
    }

    public long skip(long j2) throws IOException {
        try {
            return this.in.skip(j2);
        } catch (IOException e2) {
            handleIOException(e2);
            return 0;
        }
    }
}
