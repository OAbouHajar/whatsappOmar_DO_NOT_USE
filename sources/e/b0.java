package e;

import android.net.NetworkInfo;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import com.squareup.picasso.RequestHandler;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Source;

/* compiled from: XFMFile */
public final class b0 extends RequestHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Downloader f1617a;

    /* renamed from: b  reason: collision with root package name */
    public final l0 f1618b;

    public b0(Downloader downloader, l0 l0Var) {
        this.f1617a = downloader;
        this.f1618b = l0Var;
    }

    public final int c() {
        return 2;
    }

    public final boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    public final boolean d(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    public final RequestHandler.Result load(Request request, int i2) {
        CacheControl cacheControl;
        if (i2 == 0) {
            cacheControl = null;
        } else if (NetworkPolicy.isOfflineOnly(i2)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i2)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i2)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(request.uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response load = this.f1617a.load(url.build());
        ResponseBody body = load.body();
        if (load.isSuccessful()) {
            Picasso.LoadedFrom loadedFrom = load.cacheResponse() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
            if (loadedFrom == Picasso.LoadedFrom.DISK && body.contentLength() == 0) {
                body.close();
                throw new z();
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && body.contentLength() > 0) {
                long contentLength = body.contentLength();
                n nVar = this.f1618b.f1681c;
                nVar.sendMessage(nVar.obtainMessage(4, Long.valueOf(contentLength)));
            }
            return new RequestHandler.Result((Source) body.source(), loadedFrom);
        }
        body.close();
        throw new a0(load.code());
    }
}
