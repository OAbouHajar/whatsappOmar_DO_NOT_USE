package r;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* compiled from: XFMFile */
public final class m extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaType f2441a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2442b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f2443c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2444d;

    public m(MediaType mediaType, byte[] bArr, int i2, int i3) {
        this.f2441a = mediaType;
        this.f2442b = i2;
        this.f2443c = bArr;
        this.f2444d = i3;
    }

    public final long contentLength() {
        return (long) this.f2442b;
    }

    public final MediaType contentType() {
        return this.f2441a;
    }

    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.write(this.f2443c, this.f2444d, this.f2442b);
    }
}
