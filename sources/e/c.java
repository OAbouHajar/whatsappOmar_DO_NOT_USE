package e;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import com.squareup.picasso.RequestHandler;
import okio.Okio;

/* compiled from: XFMFile */
public final class c extends RequestHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1619a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1620b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public AssetManager f1621c;

    public c(Context context) {
        this.f1619a = context;
    }

    public final boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public final RequestHandler.Result load(Request request, int i2) {
        if (this.f1621c == null) {
            synchronized (this.f1620b) {
                if (this.f1621c == null) {
                    this.f1621c = this.f1619a.getAssets();
                }
            }
        }
        return new RequestHandler.Result(Okio.source(this.f1621c.open(request.uri.toString().substring(22))), Picasso.LoadedFrom.DISK);
    }
}
