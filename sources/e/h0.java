package e;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;

/* compiled from: XFMFile */
public final class h0 extends k0 {

    /* renamed from: q  reason: collision with root package name */
    public final int[] f1642q;

    public h0(Picasso picasso, Request request, RemoteViews remoteViews, int i2, int[] iArr, int i3, int i4, String str, Object obj, int i5, Callback callback) {
        super(picasso, request, remoteViews, i2, i5, i3, i4, obj, str, callback);
        this.f1642q = iArr;
    }

    public final Object d() {
        if (this.f1676p == null) {
            this.f1676p = new j0(this.f1673m, this.f1674n);
        }
        return this.f1676p;
    }

    public final void e() {
        AppWidgetManager.getInstance(this.f1605a.f1540e).updateAppWidget(this.f1642q, this.f1673m);
    }
}
