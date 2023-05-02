package okhttp3.internal.http;

import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* compiled from: XFMFile */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: b  reason: collision with root package name */
    public final String f2212b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2213c;

    /* renamed from: d  reason: collision with root package name */
    public final BufferedSource f2214d;

    public RealResponseBody(@Nullable String str, long j2, BufferedSource bufferedSource) {
        this.f2212b = str;
        this.f2213c = j2;
        this.f2214d = bufferedSource;
    }

    public long contentLength() {
        return this.f2213c;
    }

    public MediaType contentType() {
        String str = this.f2212b;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public BufferedSource source() {
        return this.f2214d;
    }
}
