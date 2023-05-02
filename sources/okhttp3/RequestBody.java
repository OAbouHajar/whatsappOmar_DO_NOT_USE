package okhttp3;

import java.io.File;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import r.l;
import r.m;

/* compiled from: XFMFile */
public abstract class RequestBody {
    public static RequestBody create(@Nullable MediaType mediaType, File file) {
        if (file != null) {
            return new l(mediaType, file, 1);
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(@Nullable MediaType mediaType, ByteString byteString) {
        return new l(mediaType, byteString, 0);
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i2, (long) i3);
            return new m(mediaType, bArr, i3, i2);
        }
        throw new NullPointerException("content == null");
    }

    public long contentLength() {
        return -1;
    }

    @Nullable
    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink);
}
