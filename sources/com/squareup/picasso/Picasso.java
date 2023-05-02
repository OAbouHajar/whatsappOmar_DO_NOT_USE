package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.b;
import e.b0;
import e.c;
import e.c0;
import e.d0;
import e.g;
import e.g0;
import e.j;
import e.j0;
import e.k;
import e.l;
import e.l0;
import e.m;
import e.n;
import e.o0;
import e.q;
import e.s;
import e.y;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: XFMFile */
public class Picasso {

    /* renamed from: p  reason: collision with root package name */
    public static final c0 f1534p = new c0(Looper.getMainLooper(), 0);

    /* renamed from: q  reason: collision with root package name */
    public static volatile Picasso f1535q = null;

    /* renamed from: a  reason: collision with root package name */
    public final Listener f1536a;

    /* renamed from: b  reason: collision with root package name */
    public final RequestTransformer f1537b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f1538c;

    /* renamed from: d  reason: collision with root package name */
    public final List f1539d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f1540e;

    /* renamed from: f  reason: collision with root package name */
    public final q f1541f;

    /* renamed from: g  reason: collision with root package name */
    public final Cache f1542g;

    /* renamed from: h  reason: collision with root package name */
    public final l0 f1543h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakHashMap f1544i;

    /* renamed from: j  reason: collision with root package name */
    public final WeakHashMap f1545j;

    /* renamed from: k  reason: collision with root package name */
    public final ReferenceQueue f1546k;

    /* renamed from: l  reason: collision with root package name */
    public final Bitmap.Config f1547l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1548m;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f1549n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1550o;

    /* compiled from: XFMFile */
    public class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1551a;

        /* renamed from: b  reason: collision with root package name */
        public Downloader f1552b;

        /* renamed from: c  reason: collision with root package name */
        public ExecutorService f1553c;

        /* renamed from: d  reason: collision with root package name */
        public Cache f1554d;

        /* renamed from: e  reason: collision with root package name */
        public Listener f1555e;

        /* renamed from: f  reason: collision with root package name */
        public RequestTransformer f1556f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList f1557g;

        /* renamed from: h  reason: collision with root package name */
        public Bitmap.Config f1558h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1559i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1560j;

        public Builder(@NonNull Context context) {
            if (context != null) {
                this.f1551a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public Builder addRequestHandler(@NonNull RequestHandler requestHandler) {
            if (requestHandler != null) {
                if (this.f1557g == null) {
                    this.f1557g = new ArrayList();
                }
                if (!this.f1557g.contains(requestHandler)) {
                    this.f1557g.add(requestHandler);
                    return this;
                }
                throw new IllegalStateException("RequestHandler already registered.");
            }
            throw new IllegalArgumentException("RequestHandler must not be null.");
        }

        public Picasso build() {
            Context context = this.f1551a;
            if (this.f1552b == null) {
                this.f1552b = new OkHttp3Downloader(context);
            }
            if (this.f1554d == null) {
                this.f1554d = new LruCache(context);
            }
            if (this.f1553c == null) {
                this.f1553c = new g0();
            }
            if (this.f1556f == null) {
                this.f1556f = RequestTransformer.IDENTITY;
            }
            l0 l0Var = new l0(this.f1554d);
            Context context2 = context;
            return new Picasso(context2, new q(context2, this.f1553c, Picasso.f1534p, this.f1552b, this.f1554d, l0Var), this.f1554d, this.f1555e, this.f1556f, this.f1557g, l0Var, this.f1558h, this.f1559i, this.f1560j);
        }

        public Builder defaultBitmapConfig(@NonNull Bitmap.Config config) {
            if (config != null) {
                this.f1558h = config;
                return this;
            }
            throw new IllegalArgumentException("Bitmap config must not be null.");
        }

        public Builder downloader(@NonNull Downloader downloader) {
            if (downloader == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (this.f1552b == null) {
                this.f1552b = downloader;
                return this;
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }

        public Builder executor(@NonNull ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            } else if (this.f1553c == null) {
                this.f1553c = executorService;
                return this;
            } else {
                throw new IllegalStateException("Executor service already set.");
            }
        }

        public Builder indicatorsEnabled(boolean z2) {
            this.f1559i = z2;
            return this;
        }

        public Builder listener(@NonNull Listener listener) {
            if (listener == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            } else if (this.f1555e == null) {
                this.f1555e = listener;
                return this;
            } else {
                throw new IllegalStateException("Listener already set.");
            }
        }

        public Builder loggingEnabled(boolean z2) {
            this.f1560j = z2;
            return this;
        }

        public Builder memoryCache(@NonNull Cache cache) {
            if (cache == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            } else if (this.f1554d == null) {
                this.f1554d = cache;
                return this;
            } else {
                throw new IllegalStateException("Memory cache already set.");
            }
        }

        public Builder requestTransformer(@NonNull RequestTransformer requestTransformer) {
            if (requestTransformer == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            } else if (this.f1556f == null) {
                this.f1556f = requestTransformer;
                return this;
            } else {
                throw new IllegalStateException("Transformer already set.");
            }
        }
    }

    /* compiled from: XFMFile */
    public interface Listener {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc);
    }

    /* compiled from: XFMFile */
    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f1562a;

        /* access modifiers changed from: public */
        LoadedFrom(int i2) {
            this.f1562a = i2;
        }
    }

    /* compiled from: XFMFile */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH;

        /* access modifiers changed from: public */
        Priority() {
        }
    }

    /* compiled from: XFMFile */
    public interface RequestTransformer {
        public static final RequestTransformer IDENTITY = new j();

        Request transformRequest(Request request);
    }

    public Picasso(Context context, q qVar, Cache cache, Listener listener, RequestTransformer requestTransformer, ArrayList arrayList, l0 l0Var, Bitmap.Config config, boolean z2, boolean z3) {
        this.f1540e = context;
        this.f1541f = qVar;
        this.f1542g = cache;
        this.f1536a = listener;
        this.f1537b = requestTransformer;
        this.f1547l = config;
        ArrayList arrayList2 = new ArrayList((arrayList != null ? arrayList.size() : 0) + 7);
        arrayList2.add(new l(context, 1));
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        arrayList2.add(new k(context));
        arrayList2.add(new y(context));
        arrayList2.add(new l(context, 0));
        arrayList2.add(new c(context));
        arrayList2.add(new s(context));
        arrayList2.add(new b0(qVar.f1706d, l0Var));
        this.f1539d = Collections.unmodifiableList(arrayList2);
        this.f1543h = l0Var;
        this.f1544i = new WeakHashMap();
        this.f1545j = new WeakHashMap();
        this.f1548m = z2;
        this.f1549n = z3;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f1546k = referenceQueue;
        d0 d0Var = new d0(referenceQueue, f1534p);
        this.f1538c = d0Var;
        d0Var.start();
    }

    public static Picasso get() {
        if (f1535q == null) {
            synchronized (Picasso.class) {
                if (f1535q == null) {
                    Context context = PicassoProvider.f1564a;
                    if (context != null) {
                        f1535q = new Builder(context).build();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f1535q;
    }

    public static void setSingletonInstance(@NonNull Picasso picasso) {
        if (picasso != null) {
            synchronized (Picasso.class) {
                if (f1535q == null) {
                    f1535q = picasso;
                } else {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Picasso must not be null.");
    }

    public final void a(Object obj) {
        o0.a();
        b bVar = (b) this.f1544i.remove(obj);
        if (bVar != null) {
            bVar.a();
            n nVar = this.f1541f.f1711i;
            nVar.sendMessage(nVar.obtainMessage(2, bVar));
        }
        if (obj instanceof ImageView) {
            m mVar = (m) this.f1545j.remove((ImageView) obj);
            if (mVar != null) {
                mVar.a();
            }
        }
    }

    public boolean areIndicatorsEnabled() {
        return this.f1548m;
    }

    public final void b(Bitmap bitmap, LoadedFrom loadedFrom, b bVar, Exception exc) {
        String str;
        String str2;
        String str3;
        if (!bVar.f1616l) {
            if (!bVar.f1615k) {
                this.f1544i.remove(bVar.d());
            }
            if (bitmap == null) {
                bVar.c(exc);
                if (this.f1549n) {
                    str3 = bVar.f1606b.a();
                    str2 = exc.getMessage();
                    str = "errored";
                } else {
                    return;
                }
            } else if (loadedFrom != null) {
                bVar.b(bitmap, loadedFrom);
                if (this.f1549n) {
                    str3 = bVar.f1606b.a();
                    str2 = "from " + loadedFrom;
                    str = "completed";
                } else {
                    return;
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            o0.f("Main", str, str3, str2);
        }
    }

    public final void c(b bVar) {
        Object d2 = bVar.d();
        if (d2 != null) {
            WeakHashMap weakHashMap = this.f1544i;
            if (weakHashMap.get(d2) != bVar) {
                a(d2);
                weakHashMap.put(d2, bVar);
            }
        }
        n nVar = this.f1541f.f1711i;
        nVar.sendMessage(nVar.obtainMessage(1, bVar));
    }

    public void cancelRequest(@NonNull ImageView imageView) {
        if (imageView != null) {
            a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public void cancelRequest(@NonNull RemoteViews remoteViews, @IdRes int i2) {
        if (remoteViews != null) {
            a(new j0(remoteViews, i2));
            return;
        }
        throw new IllegalArgumentException("remoteViews cannot be null.");
    }

    public void cancelRequest(@NonNull Target target) {
        if (target != null) {
            a(target);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    public void cancelTag(@NonNull Object obj) {
        o0.a();
        if (obj != null) {
            ArrayList arrayList = new ArrayList(this.f1544i.values());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) arrayList.get(i2);
                if (obj.equals(bVar.f1614j)) {
                    a(bVar.d());
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f1545j.values());
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                m mVar = (m) arrayList2.get(i3);
                if (obj.equals(mVar.f1693a.f1597l)) {
                    mVar.a();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Cannot cancel requests with null tag.");
    }

    public final Bitmap d(String str) {
        Bitmap bitmap = this.f1542g.get(str);
        l0 l0Var = this.f1543h;
        if (bitmap != null) {
            l0Var.f1681c.sendEmptyMessage(0);
        } else {
            l0Var.f1681c.sendEmptyMessage(1);
        }
        return bitmap;
    }

    public StatsSnapshot getSnapshot() {
        return this.f1543h.a();
    }

    public void invalidate(@Nullable Uri uri) {
        if (uri != null) {
            this.f1542g.clearKeyUri(uri.toString());
        }
    }

    public void invalidate(@NonNull File file) {
        if (file != null) {
            invalidate(Uri.fromFile(file));
            return;
        }
        throw new IllegalArgumentException("file == null");
    }

    public void invalidate(@Nullable String str) {
        if (str != null) {
            invalidate(Uri.parse(str));
        }
    }

    public boolean isLoggingEnabled() {
        return this.f1549n;
    }

    public RequestCreator load(@DrawableRes int i2) {
        if (i2 != 0) {
            return new RequestCreator(this, (Uri) null, i2);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public RequestCreator load(@Nullable Uri uri) {
        return new RequestCreator(this, uri, 0);
    }

    public RequestCreator load(@NonNull File file) {
        return file == null ? new RequestCreator(this, (Uri) null, 0) : load(Uri.fromFile(file));
    }

    public RequestCreator load(@Nullable String str) {
        if (str == null) {
            return new RequestCreator(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return load(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void pauseTag(@NonNull Object obj) {
        if (obj != null) {
            n nVar = this.f1541f.f1711i;
            nVar.sendMessage(nVar.obtainMessage(11, obj));
            return;
        }
        throw new IllegalArgumentException("tag == null");
    }

    public void resumeTag(@NonNull Object obj) {
        if (obj != null) {
            n nVar = this.f1541f.f1711i;
            nVar.sendMessage(nVar.obtainMessage(12, obj));
            return;
        }
        throw new IllegalArgumentException("tag == null");
    }

    public void setIndicatorsEnabled(boolean z2) {
        this.f1548m = z2;
    }

    public void setLoggingEnabled(boolean z2) {
        this.f1549n = z2;
    }

    public void shutdown() {
        if (this == f1535q) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        } else if (!this.f1550o) {
            this.f1542g.clear();
            this.f1538c.interrupt();
            this.f1543h.f1679a.quit();
            q qVar = this.f1541f;
            ExecutorService executorService = qVar.f1705c;
            if (executorService instanceof g0) {
                executorService.shutdown();
            }
            qVar.f1706d.shutdown();
            qVar.f1703a.quit();
            f1534p.post(new g(qVar, 1));
            for (m a2 : this.f1545j.values()) {
                a2.a();
            }
            this.f1545j.clear();
            this.f1550o = true;
        }
    }
}
