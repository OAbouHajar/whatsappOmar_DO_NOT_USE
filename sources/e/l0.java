package e;

import android.os.HandlerThread;
import android.os.Looper;
import com.squareup.picasso.Cache;
import com.squareup.picasso.StatsSnapshot;

/* compiled from: XFMFile */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final HandlerThread f1679a;

    /* renamed from: b  reason: collision with root package name */
    public final Cache f1680b;

    /* renamed from: c  reason: collision with root package name */
    public final n f1681c;

    /* renamed from: d  reason: collision with root package name */
    public long f1682d;

    /* renamed from: e  reason: collision with root package name */
    public long f1683e;

    /* renamed from: f  reason: collision with root package name */
    public long f1684f;

    /* renamed from: g  reason: collision with root package name */
    public long f1685g;

    /* renamed from: h  reason: collision with root package name */
    public long f1686h;

    /* renamed from: i  reason: collision with root package name */
    public long f1687i;

    /* renamed from: j  reason: collision with root package name */
    public long f1688j;

    /* renamed from: k  reason: collision with root package name */
    public long f1689k;

    /* renamed from: l  reason: collision with root package name */
    public int f1690l;

    /* renamed from: m  reason: collision with root package name */
    public int f1691m;

    /* renamed from: n  reason: collision with root package name */
    public int f1692n;

    public l0(Cache cache) {
        this.f1680b = cache;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f1679a = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = o0.f1699a;
        c0 c0Var = new c0(looper, 1);
        c0Var.sendMessageDelayed(c0Var.obtainMessage(), 1000);
        this.f1681c = new n(handlerThread.getLooper(), this, 1);
    }

    public final StatsSnapshot a() {
        Cache cache = this.f1680b;
        return new StatsSnapshot(cache.maxSize(), cache.size(), this.f1682d, this.f1683e, this.f1684f, this.f1685g, this.f1686h, this.f1687i, this.f1688j, this.f1689k, this.f1690l, this.f1691m, this.f1692n, System.currentTimeMillis());
    }
}
