package e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;

/* compiled from: XFMFile */
public final class r extends b {

    /* renamed from: m  reason: collision with root package name */
    public final Object f1718m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public Callback f1719n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Picasso picasso, Request request, int i2, int i3, Object obj, String str, Callback callback) {
        super(picasso, (Object) null, request, i2, i3, 0, (Drawable) null, str, obj, false);
        this.f1719n = callback;
    }

    public final void a() {
        this.f1616l = true;
        this.f1719n = null;
    }

    public final void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        Callback callback = this.f1719n;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    public final void c(Exception exc) {
        Callback callback = this.f1719n;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    public final Object d() {
        return this.f1718m;
    }
}
