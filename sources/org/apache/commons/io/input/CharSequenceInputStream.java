package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class CharSequenceInputStream extends InputStream {
    private final ByteBuffer bbuf;
    private final CharBuffer cbuf;
    private final CharsetEncoder encoder;
    private int mark;

    public CharSequenceInputStream(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    public CharSequenceInputStream(CharSequence charSequence, String str, int i2) {
        this(charSequence, Charset.forName(str), i2);
    }

    public CharSequenceInputStream(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public CharSequenceInputStream(CharSequence charSequence, Charset charset, int i2) {
        this.encoder = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        this.bbuf = allocate;
        allocate.flip();
        this.cbuf = CharBuffer.wrap(charSequence);
        this.mark = -1;
    }

    private void fillBuffer() throws CharacterCodingException {
        this.bbuf.compact();
        CoderResult encode = this.encoder.encode(this.cbuf, this.bbuf, true);
        if (encode.isError()) {
            encode.throwException();
        }
        this.bbuf.flip();
    }

    public int available() throws IOException {
        return this.cbuf.remaining();
    }

    public void close() throws IOException {
    }

    public synchronized void mark(int i2) {
        this.mark = this.cbuf.position();
    }

    public boolean markSupported() {
        return true;
    }

    public int read() throws IOException {
        while (!this.bbuf.hasRemaining()) {
            fillBuffer();
            if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                return -1;
            }
        }
        return this.bbuf.get() & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        } else if (i3 < 0 || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i2 + ", length=" + i3);
        } else if (i3 == 0) {
            return 0;
        } else {
            if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                return -1;
            }
            int i4 = 0;
            while (i3 > 0) {
                if (!this.bbuf.hasRemaining()) {
                    fillBuffer();
                    if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                        break;
                    }
                } else {
                    int min = Math.min(this.bbuf.remaining(), i3);
                    this.bbuf.get(bArr, i2, min);
                    i2 += min;
                    i3 -= min;
                    i4 += min;
                }
            }
            if (i4 != 0 || this.cbuf.hasRemaining()) {
                return i4;
            }
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        int i2 = this.mark;
        if (i2 != -1) {
            this.cbuf.position(i2);
            this.mark = -1;
        }
    }

    public long skip(long j2) throws IOException {
        int i2 = 0;
        while (j2 > 0 && this.cbuf.hasRemaining()) {
            this.cbuf.get();
            j2--;
            i2++;
        }
        return (long) i2;
    }
}
