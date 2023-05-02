package e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;

/* compiled from: XFMFile */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Picasso f1605a;

    /* renamed from: b  reason: collision with root package name */
    public final Request f1606b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1607c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1608d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1609e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1610f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1611g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f1612h;

    /* renamed from: i  reason: collision with root package name */
    public final String f1613i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f1614j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1615k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1616l;

    public b(Picasso picasso, Object obj, Request request, int i2, int i3, int i4, Drawable drawable, String str, Object obj2, boolean z2) {
        this.f1605a = picasso;
        this.f1606b = request;
        this.f1607c = obj == null ? null : new a(this, obj, picasso.f1546k);
        this.f1609e = i2;
        this.f1610f = i3;
        this.f1608d = z2;
        this.f1611g = i4;
        this.f1612h = drawable;
        this.f1613i = str;
        this.f1614j = obj2 == null ? this : obj2;
    }

    public void a() {
        this.f1616l = true;
    }

    public abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void c(Exception exc);

    public Object d() {
        a aVar = this.f1607c;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }
}
