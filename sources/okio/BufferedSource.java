package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* compiled from: XFMFile */
public interface BufferedSource extends Source, ReadableByteChannel {
    Buffer buffer();

    boolean exhausted();

    long indexOf(byte b2);

    long indexOf(byte b2, long j2);

    long indexOf(byte b2, long j2, long j3);

    long indexOf(ByteString byteString);

    long indexOf(ByteString byteString, long j2);

    long indexOfElement(ByteString byteString);

    long indexOfElement(ByteString byteString, long j2);

    InputStream inputStream();

    boolean rangeEquals(long j2, ByteString byteString);

    boolean rangeEquals(long j2, ByteString byteString, int i2, int i3);

    int read(byte[] bArr);

    int read(byte[] bArr, int i2, int i3);

    long readAll(Sink sink);

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j2);

    ByteString readByteString();

    ByteString readByteString(long j2);

    long readDecimalLong();

    void readFully(Buffer buffer, long j2);

    void readFully(byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLong();

    long readLongLe();

    short readShort();

    short readShortLe();

    String readString(long j2, Charset charset);

    String readString(Charset charset);

    String readUtf8();

    String readUtf8(long j2);

    int readUtf8CodePoint();

    @Nullable
    String readUtf8Line();

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j2);

    boolean request(long j2);

    void require(long j2);

    int select(Options options);

    void skip(long j2);
}
