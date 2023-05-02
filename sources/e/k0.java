package e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;

/* compiled from: XFMFile */
public abstract class k0 extends b {

    /* renamed from: m  reason: collision with root package name */
    public final RemoteViews f1673m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1674n;

    /* renamed from: o  reason: collision with root package name */
    public Callback f1675o;

    /* renamed from: p  reason: collision with root package name */
    public j0 f1676p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(Picasso picasso, Request request, RemoteViews remoteViews, int i2, int i3, int i4, int i5, Object obj, String str, Callback callback) {
        super(picasso, (Object) null, request, i4, i5, i3, (Drawable) null, str, obj, false);
        this.f1673m = remoteViews;
        this.f1674n = i2;
        this.f1675o = callback;
    }

    public final void a() {
        this.f1616l = true;
        if (this.f1675o != null) {
            this.f1675o = null;
        }
    }

    public final void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.f1673m.setImageViewBitmap(this.f1674n, bitmap);
        e();
        Callback callback = this.f1675o;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    public final void c(Exception exc) {
        int i2 = this.f1611g;
        if (i2 != 0) {
            this.f1673m.setImageViewResource(this.f1674n, i2);
            e();
        }
        Callback callback = this.f1675o;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    public abstract void e();
}
