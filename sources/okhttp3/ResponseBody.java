package okhttp3;

import a.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import r.n;
import r.o;

/* compiled from: XFMFile */
public abstract class ResponseBody implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public o f2095a;

    public static ResponseBody create(@Nullable MediaType mediaType, long j2, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new n(mediaType, j2, bufferedSource);
        }
        throw new NullPointerException("source == null");
    }

    public static ResponseBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        Buffer writeString = new Buffer().writeString(str, charset);
        return create(mediaType, writeString.size(), writeString);
    }

    public static ResponseBody create(@Nullable MediaType mediaType, ByteString byteString) {
        return create(mediaType, (long) byteString.size(), new Buffer().write(byteString));
    }

    public static ResponseBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, (long) bArr.length, new Buffer().write(bArr));
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                byte[] readByteArray = source.readByteArray();
                Util.closeQuietly((Closeable) source);
                if (contentLength == -1 || contentLength == ((long) readByteArray.length)) {
                    return readByteArray;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + readByteArray.length + ") disagree");
            } catch (Throwable th) {
                Util.closeQuietly((Closeable) source);
                throw th;
            }
        } else {
            throw new IOException(a.e("Cannot buffer entire body for content length: ", contentLength));
        }
    }

    public final Reader charStream() {
        o oVar = this.f2095a;
        if (oVar == null) {
            BufferedSource source = source();
            MediaType contentType = contentType();
            oVar = new o(source, contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8);
            this.f2095a = oVar;
        }
        return oVar;
    }

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() {
        BufferedSource source = source();
        try {
            MediaType contentType = contentType();
            return source.readString(Util.bomAwareCharset(source, contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8));
        } finally {
            Util.closeQuietly((Closeable) source);
        }
    }
}
