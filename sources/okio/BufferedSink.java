package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* compiled from: XFMFile */
public interface BufferedSink extends Sink, WritableByteChannel {
    Buffer buffer();

    BufferedSink emit();

    BufferedSink emitCompleteSegments();

    void flush();

    OutputStream outputStream();

    BufferedSink write(ByteString byteString);

    BufferedSink write(Source source, long j2);

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i2, int i3);

    long writeAll(Source source);

    BufferedSink writeByte(int i2);

    BufferedSink writeDecimalLong(long j2);

    BufferedSink writeHexadecimalUnsignedLong(long j2);

    BufferedSink writeInt(int i2);

    BufferedSink writeIntLe(int i2);

    BufferedSink writeLong(long j2);

    BufferedSink writeLongLe(long j2);

    BufferedSink writeShort(int i2);

    BufferedSink writeShortLe(int i2);

    BufferedSink writeString(String str, int i2, int i3, Charset charset);

    BufferedSink writeString(String str, Charset charset);

    BufferedSink writeUtf8(String str);

    BufferedSink writeUtf8(String str, int i2, int i3);

    BufferedSink writeUtf8CodePoint(int i2);
}
