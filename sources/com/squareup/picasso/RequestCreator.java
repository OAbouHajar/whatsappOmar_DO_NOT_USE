package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import e.e0;
import e.h0;
import e.i;
import e.i0;
import e.k0;
import e.m;
import e.n;
import e.o0;
import e.r;
import e.t;
import e.u;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: XFMFile */
public class RequestCreator {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicInteger f1585m = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final Picasso f1586a;

    /* renamed from: b  reason: collision with root package name */
    public final Request.Builder f1587b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1588c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1589d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1590e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f1591f;

    /* renamed from: g  reason: collision with root package name */
    public int f1592g;

    /* renamed from: h  reason: collision with root package name */
    public int f1593h;

    /* renamed from: i  reason: collision with root package name */
    public int f1594i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f1595j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f1596k;

    /* renamed from: l  reason: collision with root package name */
    public Object f1597l;

    public RequestCreator(Picasso picasso, Uri uri, int i2) {
        if (!picasso.f1550o) {
            this.f1586a = picasso;
            this.f1587b = new Request.Builder(uri, i2, picasso.f1547l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    public final Request a(long j2) {
        int andIncrement = f1585m.getAndIncrement();
        Request build = this.f1587b.build();
        build.f1566a = andIncrement;
        build.f1567b = j2;
        boolean z2 = this.f1586a.f1549n;
        if (z2) {
            o0.f("Main", "created", build.c(), build.toString());
        }
        Picasso.RequestTransformer requestTransformer = this.f1586a.f1537b;
        Request transformRequest = requestTransformer.transformRequest(build);
        if (transformRequest != null) {
            if (transformRequest != build) {
                transformRequest.f1566a = andIncrement;
                transformRequest.f1567b = j2;
                if (z2) {
                    String a2 = transformRequest.a();
                    o0.f("Main", "changed", a2, "into " + transformRequest);
                }
            }
            return transformRequest;
        }
        throw new IllegalStateException("Request transformer " + requestTransformer.getClass().getCanonicalName() + " returned null for " + build);
    }

    public final Drawable b() {
        int i2 = this.f1591f;
        return i2 != 0 ? this.f1586a.f1540e.getDrawable(i2) : this.f1595j;
    }

    public final void c(k0 k0Var) {
        Bitmap d2;
        boolean a2 = MemoryPolicy.a(this.f1593h);
        Picasso picasso = this.f1586a;
        if (!a2 || (d2 = picasso.d(k0Var.f1613i)) == null) {
            int i2 = this.f1591f;
            if (i2 != 0) {
                k0Var.f1673m.setImageViewResource(k0Var.f1674n, i2);
                k0Var.e();
            }
            picasso.c(k0Var);
            return;
        }
        k0Var.b(d2, Picasso.LoadedFrom.MEMORY);
    }

    public RequestCreator centerCrop() {
        this.f1587b.centerCrop(17);
        return this;
    }

    public RequestCreator centerCrop(int i2) {
        this.f1587b.centerCrop(i2);
        return this;
    }

    public RequestCreator centerInside() {
        this.f1587b.centerInside();
        return this;
    }

    public RequestCreator config(@NonNull Bitmap.Config config) {
        this.f1587b.config(config);
        return this;
    }

    public RequestCreator error(@DrawableRes int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.f1596k == null) {
            this.f1592g = i2;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public RequestCreator error(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        } else if (this.f1592g == 0) {
            this.f1596k = drawable;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public void fetch() {
        fetch((Callback) null);
    }

    public void fetch(@Nullable Callback callback) {
        long nanoTime = System.nanoTime();
        if (this.f1589d) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        } else if (this.f1587b.a()) {
            Request.Builder builder = this.f1587b;
            if (!(builder.f1584q != null)) {
                builder.priority(Picasso.Priority.LOW);
            }
            Request a2 = a(nanoTime);
            String b2 = o0.b(a2, new StringBuilder());
            if (!MemoryPolicy.a(this.f1593h) || this.f1586a.d(b2) == null) {
                r rVar = new r(this.f1586a, a2, this.f1593h, this.f1594i, this.f1597l, b2, callback);
                n nVar = this.f1586a.f1541f.f1711i;
                nVar.sendMessage(nVar.obtainMessage(1, rVar));
                return;
            }
            if (this.f1586a.f1549n) {
                String c2 = a2.c();
                o0.f("Main", "completed", c2, "from " + Picasso.LoadedFrom.MEMORY);
            }
            if (callback != null) {
                callback.onSuccess();
            }
        }
    }

    public RequestCreator fit() {
        this.f1589d = true;
        return this;
    }

    public Bitmap get() {
        long nanoTime = System.nanoTime();
        StringBuilder sb = o0.f1699a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        } else if (this.f1589d) {
            throw new IllegalStateException("Fit cannot be used with get.");
        } else if (!this.f1587b.a()) {
            return null;
        } else {
            Request a2 = a(nanoTime);
            t tVar = new t(this.f1586a, a2, this.f1593h, this.f1594i, this.f1597l, o0.b(a2, new StringBuilder()));
            Picasso picasso = this.f1586a;
            return i.e(picasso, picasso.f1541f, picasso.f1542g, picasso.f1543h, tVar).f();
        }
    }

    public void into(ImageView imageView) {
        into(imageView, (Callback) null);
    }

    public void into(ImageView imageView, Callback callback) {
        Bitmap d2;
        ImageView imageView2 = imageView;
        Callback callback2 = callback;
        long nanoTime = System.nanoTime();
        o0.a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f1587b.a()) {
            this.f1586a.cancelRequest(imageView2);
            if (this.f1590e) {
                e0.b(imageView2, b());
            }
        } else {
            if (this.f1589d) {
                Request.Builder builder = this.f1587b;
                if (!((builder.f1571d == 0 && builder.f1572e == 0) ? false : true)) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f1590e) {
                            e0.b(imageView2, b());
                        }
                        Picasso picasso = this.f1586a;
                        m mVar = new m(this, imageView2, callback2);
                        WeakHashMap weakHashMap = picasso.f1545j;
                        if (weakHashMap.containsKey(imageView2)) {
                            picasso.a(imageView2);
                        }
                        weakHashMap.put(imageView2, mVar);
                        return;
                    }
                    this.f1587b.resize(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            Request a2 = a(nanoTime);
            StringBuilder sb = o0.f1699a;
            String b2 = o0.b(a2, sb);
            sb.setLength(0);
            if (!MemoryPolicy.a(this.f1593h) || (d2 = this.f1586a.d(b2)) == null) {
                if (this.f1590e) {
                    e0.b(imageView2, b());
                }
                this.f1586a.c(new u(this.f1586a, imageView, a2, this.f1593h, this.f1594i, this.f1592g, this.f1596k, b2, this.f1597l, callback, this.f1588c));
                return;
            }
            this.f1586a.cancelRequest(imageView2);
            Picasso picasso2 = this.f1586a;
            Context context = picasso2.f1540e;
            Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
            e0.a(imageView, context, d2, loadedFrom, this.f1588c, picasso2.f1548m);
            if (this.f1586a.f1549n) {
                String c2 = a2.c();
                o0.f("Main", "completed", c2, "from " + loadedFrom);
            }
            if (callback2 != null) {
                callback.onSuccess();
            }
        }
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i2, int i3, @NonNull Notification notification) {
        into(remoteViews, i2, i3, notification, (String) null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i2, int i3, @NonNull Notification notification, @Nullable String str) {
        into(remoteViews, i2, i3, notification, str, (Callback) null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i2, int i3, @NonNull Notification notification, @Nullable String str, Callback callback) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        } else if (notification == null) {
            throw new IllegalArgumentException("Notification must not be null.");
        } else if (this.f1589d) {
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        } else if (this.f1595j == null && this.f1591f == 0 && this.f1596k == null) {
            Request a2 = a(nanoTime);
            RemoteViews remoteViews2 = remoteViews;
            int i4 = i2;
            int i5 = i3;
            Notification notification2 = notification;
            String str2 = str;
            c(new i0(this.f1586a, a2, remoteViews2, i4, i5, notification2, str2, this.f1593h, this.f1594i, o0.b(a2, new StringBuilder()), this.f1597l, this.f1592g, callback));
        } else {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i2, @NonNull int[] iArr) {
        into(remoteViews, i2, iArr, (Callback) null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i2, @NonNull int[] iArr, Callback callback) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        } else if (iArr == null) {
            throw new IllegalArgumentException("appWidgetIds must not be null.");
        } else if (this.f1589d) {
            throw new IllegalStateException("Fit cannot be used with remote views.");
        } else if (this.f1595j == null && this.f1591f == 0 && this.f1596k == null) {
            Request a2 = a(nanoTime);
            RemoteViews remoteViews2 = remoteViews;
            int i3 = i2;
            int[] iArr2 = iArr;
            c(new h0(this.f1586a, a2, remoteViews2, i3, iArr2, this.f1593h, this.f1594i, o0.b(a2, new StringBuilder()), this.f1597l, this.f1592g, callback));
        } else {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
    }

    public void into(@NonNull Target target) {
        Bitmap d2;
        long nanoTime = System.nanoTime();
        o0.a();
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f1589d) {
            boolean a2 = this.f1587b.a();
            Drawable drawable = null;
            Picasso picasso = this.f1586a;
            if (!a2) {
                picasso.cancelRequest(target);
                if (this.f1590e) {
                    drawable = b();
                }
                target.onPrepareLoad(drawable);
                return;
            }
            Request a3 = a(nanoTime);
            StringBuilder sb = o0.f1699a;
            String b2 = o0.b(a3, sb);
            sb.setLength(0);
            if (!MemoryPolicy.a(this.f1593h) || (d2 = picasso.d(b2)) == null) {
                if (this.f1590e) {
                    drawable = b();
                }
                target.onPrepareLoad(drawable);
                picasso.c(new t(this.f1586a, target, a3, this.f1593h, this.f1594i, this.f1596k, b2, this.f1597l, this.f1592g));
                return;
            }
            picasso.cancelRequest(target);
            target.onBitmapLoaded(d2, Picasso.LoadedFrom.MEMORY);
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    public RequestCreator memoryPolicy(@NonNull MemoryPolicy memoryPolicy, @NonNull MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy != null) {
            this.f1593h = memoryPolicy.f1528a | this.f1593h;
            if (memoryPolicyArr != null) {
                if (memoryPolicyArr.length > 0) {
                    int length = memoryPolicyArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        MemoryPolicy memoryPolicy2 = memoryPolicyArr[i2];
                        if (memoryPolicy2 != null) {
                            this.f1593h = memoryPolicy2.f1528a | this.f1593h;
                            i2++;
                        } else {
                            throw new IllegalArgumentException("Memory policy cannot be null.");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        throw new IllegalArgumentException("Memory policy cannot be null.");
    }

    public RequestCreator networkPolicy(@NonNull NetworkPolicy networkPolicy, @NonNull NetworkPolicy... networkPolicyArr) {
        if (networkPolicy != null) {
            this.f1594i = networkPolicy.f1530a | this.f1594i;
            if (networkPolicyArr != null) {
                if (networkPolicyArr.length > 0) {
                    int length = networkPolicyArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        NetworkPolicy networkPolicy2 = networkPolicyArr[i2];
                        if (networkPolicy2 != null) {
                            this.f1594i = networkPolicy2.f1530a | this.f1594i;
                            i2++;
                        } else {
                            throw new IllegalArgumentException("Network policy cannot be null.");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        throw new IllegalArgumentException("Network policy cannot be null.");
    }

    public RequestCreator noFade() {
        this.f1588c = true;
        return this;
    }

    public RequestCreator noPlaceholder() {
        if (this.f1591f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        } else if (this.f1595j == null) {
            this.f1590e = false;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public RequestCreator onlyScaleDown() {
        this.f1587b.onlyScaleDown();
        return this;
    }

    public RequestCreator placeholder(@DrawableRes int i2) {
        if (!this.f1590e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i2 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f1595j == null) {
            this.f1591f = i2;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public RequestCreator placeholder(@NonNull Drawable drawable) {
        if (!this.f1590e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.f1591f == 0) {
            this.f1595j = drawable;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public RequestCreator priority(@NonNull Picasso.Priority priority) {
        this.f1587b.priority(priority);
        return this;
    }

    public RequestCreator purgeable() {
        this.f1587b.purgeable();
        return this;
    }

    public RequestCreator resize(int i2, int i3) {
        this.f1587b.resize(i2, i3);
        return this;
    }

    public RequestCreator resizeDimen(int i2, int i3) {
        Resources resources = this.f1586a.f1540e.getResources();
        return resize(resources.getDimensionPixelSize(i2), resources.getDimensionPixelSize(i3));
    }

    public RequestCreator rotate(float f2) {
        this.f1587b.rotate(f2);
        return this;
    }

    public RequestCreator rotate(float f2, float f3, float f4) {
        this.f1587b.rotate(f2, f3, f4);
        return this;
    }

    public RequestCreator stableKey(@NonNull String str) {
        this.f1587b.stableKey(str);
        return this;
    }

    public RequestCreator tag(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        } else if (this.f1597l == null) {
            this.f1597l = obj;
            return this;
        } else {
            throw new IllegalStateException("Tag already set.");
        }
    }

    public RequestCreator transform(@NonNull Transformation transformation) {
        this.f1587b.transform(transformation);
        return this;
    }

    public RequestCreator transform(@NonNull List<? extends Transformation> list) {
        this.f1587b.transform(list);
        return this;
    }
}
