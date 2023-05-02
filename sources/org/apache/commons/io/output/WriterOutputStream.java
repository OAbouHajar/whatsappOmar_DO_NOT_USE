package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class WriterOutputStream extends OutputStream {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private final CharsetDecoder decoder;
    private final ByteBuffer decoderIn;
    private final CharBuffer decoderOut;
    private final boolean writeImmediately;
    private final Writer writer;

    public WriterOutputStream(Writer writer2) {
        this(writer2, Charset.defaultCharset(), 1024, false);
    }

    public WriterOutputStream(Writer writer2, String str) {
        this(writer2, str, 1024, false);
    }

    public WriterOutputStream(Writer writer2, String str, int i2, boolean z2) {
        this(writer2, Charset.forName(str), i2, z2);
    }

    public WriterOutputStream(Writer writer2, Charset charset) {
        this(writer2, charset, 1024, false);
    }

    public WriterOutputStream(Writer writer2, Charset charset, int i2, boolean z2) {
        this(writer2, charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith("?"), i2, z2);
    }

    public WriterOutputStream(Writer writer2, CharsetDecoder charsetDecoder) {
        this(writer2, charsetDecoder, 1024, false);
    }

    public WriterOutputStream(Writer writer2, CharsetDecoder charsetDecoder, int i2, boolean z2) {
        this.decoderIn = ByteBuffer.allocate(128);
        this.writer = writer2;
        this.decoder = charsetDecoder;
        this.writeImmediately = z2;
        this.decoderOut = CharBuffer.allocate(i2);
    }

    private void flushOutput() throws IOException {
        if (this.decoderOut.position() > 0) {
            this.writer.write(this.decoderOut.array(), 0, this.decoderOut.position());
            this.decoderOut.rewind();
        }
    }

    private void processInput(boolean z2) throws IOException {
        CoderResult decode;
        this.decoderIn.flip();
        while (true) {
            decode = this.decoder.decode(this.decoderIn, this.decoderOut, z2);
            if (!decode.isOverflow()) {
                break;
            }
            flushOutput();
        }
        if (decode.isUnderflow()) {
            this.decoderIn.compact();
            return;
        }
        throw new IOException("Unexpected coder result");
    }

    public void close() throws IOException {
        processInput(true);
        flushOutput();
        this.writer.close();
    }

    public void flush() throws IOException {
        flushOutput();
        this.writer.flush();
    }

    public void write(int i2) throws IOException {
        write(new byte[]{(byte) i2}, 0, 1);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) throws IOException {
        while (i3 > 0) {
            int min = Math.min(i3, this.decoderIn.remaining());
            this.decoderIn.put(bArr, i2, min);
            processInput(false);
            i3 -= min;
            i2 += min;
        }
        if (this.writeImmediately) {
            flushOutput();
        }
    }
}
