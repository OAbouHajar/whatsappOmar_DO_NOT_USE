package r;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* compiled from: XFMFile */
public final class n extends ResponseBody {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaType f2445b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f2446c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BufferedSource f2447d;

    public n(MediaType mediaType, long j2, BufferedSource bufferedSource) {
        this.f2445b = mediaType;
        this.f2446c = j2;
        this.f2447d = bufferedSource;
    }

    public final long contentLength() {
        return this.f2446c;
    }

    public final MediaType contentType() {
        return this.f2445b;
    }

    public final BufferedSource source() {
        return this.f2447d;
    }
}
