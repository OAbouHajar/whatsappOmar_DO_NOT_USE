package e;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.squareup.picasso.Cache;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: XFMFile */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final o f1703a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1704b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f1705c;

    /* renamed from: d  reason: collision with root package name */
    public final Downloader f1706d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f1707e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap f1708f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final WeakHashMap f1709g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashSet f1710h = new LinkedHashSet();

    /* renamed from: i  reason: collision with root package name */
    public final n f1711i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f1712j;

    /* renamed from: k  reason: collision with root package name */
    public final Cache f1713k;

    /* renamed from: l  reason: collision with root package name */
    public final l0 f1714l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f1715m;

    /* renamed from: n  reason: collision with root package name */
    public final p f1716n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1717o;

    public q(Context context, ExecutorService executorService, c0 c0Var, Downloader downloader, Cache cache, l0 l0Var) {
        o oVar = new o();
        this.f1703a = oVar;
        oVar.start();
        Looper looper = oVar.getLooper();
        StringBuilder sb = o0.f1699a;
        boolean z2 = true;
        c0 c0Var2 = new c0(looper, 1);
        c0Var2.sendMessageDelayed(c0Var2.obtainMessage(), 1000);
        this.f1704b = context;
        this.f1705c = executorService;
        this.f1711i = new n(oVar.getLooper(), this, 0);
        this.f1706d = downloader;
        this.f1712j = c0Var;
        this.f1713k = cache;
        this.f1714l = l0Var;
        this.f1715m = new ArrayList(4);
        try {
            int i2 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f1717o = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 ? false : z2;
        p pVar = new p(this);
        this.f1716n = pVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        q qVar = pVar.f1702a;
        if (qVar.f1717o) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        qVar.f1704b.registerReceiver(pVar, intentFilter);
    }

    public final void a(i iVar) {
        Future future = iVar.f1660n;
        if (!(future != null && future.isCancelled())) {
            Bitmap bitmap = iVar.f1659m;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f1715m.add(iVar);
            n nVar = this.f1711i;
            if (!nVar.hasMessages(7)) {
                nVar.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    public final void b(i iVar) {
        n nVar = this.f1711i;
        nVar.sendMessage(nVar.obtainMessage(4, iVar));
    }

    public final void c(i iVar) {
        n nVar = this.f1711i;
        nVar.sendMessage(nVar.obtainMessage(6, iVar));
    }

    public final void d(i iVar, boolean z2) {
        if (iVar.f1648b.f1549n) {
            o0.f("Dispatcher", "batched", o0.c(iVar), "for error".concat(z2 ? " (will replay)" : ""));
        }
        this.f1707e.remove(iVar.f1652f);
        a(iVar);
    }

    public final void e(b bVar, boolean z2) {
        String str;
        String str2;
        if (this.f1710h.contains(bVar.f1614j)) {
            this.f1709g.put(bVar.d(), bVar);
            if (bVar.f1605a.f1549n) {
                String a2 = bVar.f1606b.a();
                o0.f("Dispatcher", "paused", a2, "because tag '" + bVar.f1614j + "' is paused");
                return;
            }
            return;
        }
        i iVar = (i) this.f1707e.get(bVar.f1613i);
        if (iVar != null) {
            boolean z3 = iVar.f1648b.f1549n;
            Request request = bVar.f1606b;
            if (iVar.f1657k == null) {
                iVar.f1657k = bVar;
                if (z3) {
                    ArrayList arrayList = iVar.f1658l;
                    if (arrayList == null || arrayList.isEmpty()) {
                        str2 = request.a();
                        str = "to empty hunter";
                    } else {
                        str2 = request.a();
                        str = o0.d(iVar, "to ");
                    }
                    o0.f("Hunter", "joined", str2, str);
                    return;
                }
                return;
            }
            if (iVar.f1658l == null) {
                iVar.f1658l = new ArrayList(3);
            }
            iVar.f1658l.add(bVar);
            if (z3) {
                o0.f("Hunter", "joined", request.a(), o0.d(iVar, "to "));
            }
            Picasso.Priority priority = bVar.f1606b.priority;
            if (priority.ordinal() > iVar.f1665s.ordinal()) {
                iVar.f1665s = priority;
            }
        } else if (!this.f1705c.isShutdown()) {
            i e2 = i.e(bVar.f1605a, this, this.f1713k, this.f1714l, bVar);
            e2.f1660n = this.f1705c.submit(e2);
            this.f1707e.put(bVar.f1613i, e2);
            if (z2) {
                this.f1708f.remove(bVar.d());
            }
            if (bVar.f1605a.f1549n) {
                o0.e("Dispatcher", "enqueued", bVar.f1606b.a());
            }
        } else if (bVar.f1605a.f1549n) {
            o0.f("Dispatcher", "ignored", bVar.f1606b.a(), "because shut down");
        }
    }
}
