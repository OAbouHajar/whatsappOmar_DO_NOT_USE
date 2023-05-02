package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class ReaderInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private final CharsetEncoder encoder;
    private final CharBuffer encoderIn;
    private final ByteBuffer encoderOut;
    private boolean endOfInput;
    private CoderResult lastCoderResult;
    private final Reader reader;

    public ReaderInputStream(Reader reader2) {
        this(reader2, Charset.defaultCharset());
    }

    public ReaderInputStream(Reader reader2, String str) {
        this(reader2, str, 1024);
    }

    public ReaderInputStream(Reader reader2, String str, int i2) {
        this(reader2, Charset.forName(str), i2);
    }

    public ReaderInputStream(Reader reader2, Charset charset) {
        this(reader2, charset, 1024);
    }

    public ReaderInputStream(Reader reader2, Charset charset, int i2) {
        this(reader2, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i2);
    }

    public ReaderInputStream(Reader reader2, CharsetEncoder charsetEncoder) {
        this(reader2, charsetEncoder, 1024);
    }

    public ReaderInputStream(Reader reader2, CharsetEncoder charsetEncoder, int i2) {
        this.reader = reader2;
        this.encoder = charsetEncoder;
        CharBuffer allocate = CharBuffer.allocate(i2);
        this.encoderIn = allocate;
        allocate.flip();
        ByteBuffer allocate2 = ByteBuffer.allocate(128);
        this.encoderOut = allocate2;
        allocate2.flip();
    }

    private void fillBuffer() throws IOException {
        CoderResult coderResult;
        if (!this.endOfInput && ((coderResult = this.lastCoderResult) == null || coderResult.isUnderflow())) {
            this.encoderIn.compact();
            int position = this.encoderIn.position();
            int read = this.reader.read(this.encoderIn.array(), position, this.encoderIn.remaining());
            if (read == -1) {
                this.endOfInput = true;
            } else {
                this.encoderIn.position(position + read);
            }
            this.encoderIn.flip();
        }
        this.encoderOut.compact();
        this.lastCoderResult = this.encoder.encode(this.encoderIn, this.encoderOut, this.endOfInput);
        this.encoderOut.flip();
    }

    public void close() throws IOException {
        this.reader.close();
    }

    public int read() throws IOException {
        while (!this.encoderOut.hasRemaining()) {
            fillBuffer();
            if (this.endOfInput && !this.encoderOut.hasRemaining()) {
                return -1;
            }
        }
        return this.encoderOut.get() & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array must not be null");
        } else if (i3 < 0 || i2 < 0 || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i2 + ", length=" + i3);
        } else {
            int i4 = 0;
            if (i3 == 0) {
                return 0;
            }
            while (i3 > 0) {
                if (!this.encoderOut.hasRemaining()) {
                    fillBuffer();
                    if (this.endOfInput && !this.encoderOut.hasRemaining()) {
                        break;
                    }
                } else {
                    int min = Math.min(this.encoderOut.remaining(), i3);
                    this.encoderOut.get(bArr, i2, min);
                    i2 += min;
                    i3 -= min;
                    i4 += min;
                }
            }
            if (i4 != 0 || !this.endOfInput) {
                return i4;
            }
            return -1;
        }
    }
}
