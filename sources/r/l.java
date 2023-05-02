package r;

import java.io.Closeable;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* compiled from: XFMFile */
public final class l extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaType f2439b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2440c;

    public /* synthetic */ l(MediaType mediaType, Object obj, int i2) {
        this.f2438a = i2;
        this.f2439b = mediaType;
        this.f2440c = obj;
    }

    public final long contentLength() {
        int i2 = this.f2438a;
        Object obj = this.f2440c;
        switch (i2) {
            case 0:
                return (long) ((ByteString) obj).size();
            default:
                return ((File) obj).length();
        }
    }

    public final MediaType contentType() {
        return this.f2439b;
    }

    public final void writeTo(BufferedSink bufferedSink) {
        int i2 = this.f2438a;
        Object obj = this.f2440c;
        switch (i2) {
            case 0:
                bufferedSink.write((ByteString) obj);
                return;
            default:
                Source source = null;
                try {
                    source = Okio.source((File) obj);
                    bufferedSink.writeAll(source);
                    return;
                } finally {
                    Util.closeQuietly((Closeable) source);
                }
        }
    }
}
