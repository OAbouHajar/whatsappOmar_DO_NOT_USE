package e;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.widget.RemoteViews;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;

/* compiled from: XFMFile */
public final class i0 extends k0 {

    /* renamed from: q  reason: collision with root package name */
    public final int f1666q;

    /* renamed from: r  reason: collision with root package name */
    public final String f1667r;

    /* renamed from: s  reason: collision with root package name */
    public final Notification f1668s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(Picasso picasso, Request request, RemoteViews remoteViews, int i2, int i3, Notification notification, String str, int i4, int i5, String str2, Object obj, int i6, Callback callback) {
        super(picasso, request, remoteViews, i2, i6, i4, i5, obj, str2, callback);
        this.f1666q = i3;
        this.f1667r = str;
        this.f1668s = notification;
    }

    public final Object d() {
        if (this.f1676p == null) {
            this.f1676p = new j0(this.f1673m, this.f1674n);
        }
        return this.f1676p;
    }

    public final void e() {
        Context context = this.f1605a.f1540e;
        StringBuilder sb = o0.f1699a;
        ((NotificationManager) context.getSystemService("notification")).notify(this.f1667r, this.f1666q, this.f1668s);
    }
}
