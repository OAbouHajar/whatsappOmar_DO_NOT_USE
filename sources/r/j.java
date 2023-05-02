package r;

import okhttp3.Callback;
import okhttp3.internal.NamedRunnable;

/* compiled from: XFMFile */
public final class j extends NamedRunnable {

    /* renamed from: a  reason: collision with root package name */
    public final Callback f2430a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2431b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(k kVar, Callback callback) {
        super("OkHttp %s", kVar.f2435d.url().redact());
        this.f2431b = kVar;
        this.f2430a = callback;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035 A[SYNTHETIC, Splitter:B:14:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e A[Catch:{ all -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute() {
        /*
            r6 = this;
            okhttp3.Callback r0 = r6.f2430a
            r.k r1 = r6.f2431b
            java.lang.String r2 = "Callback failure for "
            r3 = 0
            okhttp3.Response r4 = r1.a()     // Catch:{ IOException -> 0x0030 }
            okhttp3.internal.http.RetryAndFollowUpInterceptor r5 = r1.f2433b     // Catch:{ IOException -> 0x0030 }
            boolean r3 = r5.isCanceled()     // Catch:{ IOException -> 0x0030 }
            r5 = 1
            if (r3 == 0) goto L_0x001f
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x002c }
            java.lang.String r4 = "Canceled"
            r3.<init>(r4)     // Catch:{ IOException -> 0x002c }
            r0.onFailure(r1, r3)     // Catch:{ IOException -> 0x002c }
            goto L_0x0022
        L_0x001f:
            r0.onResponse(r1, r4)     // Catch:{ IOException -> 0x002c }
        L_0x0022:
            okhttp3.OkHttpClient r0 = r1.f2432a
            okhttp3.Dispatcher r0 = r0.dispatcher()
            r0.d(r6)
            goto L_0x0057
        L_0x002c:
            r3 = move-exception
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            goto L_0x0058
        L_0x0030:
            r4 = move-exception
            r3 = r4
            r5 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x004e
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()     // Catch:{ all -> 0x002e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
            r4.<init>(r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r1.b()     // Catch:{ all -> 0x002e }
            r4.append(r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x002e }
            r4 = 4
            r0.log(r4, r2, r3)     // Catch:{ all -> 0x002e }
            goto L_0x0022
        L_0x004e:
            okhttp3.EventListener r2 = r1.f2434c     // Catch:{ all -> 0x002e }
            r2.callFailed(r1, r3)     // Catch:{ all -> 0x002e }
            r0.onFailure(r1, r3)     // Catch:{ all -> 0x002e }
            goto L_0x0022
        L_0x0057:
            return
        L_0x0058:
            okhttp3.OkHttpClient r1 = r1.f2432a
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.d(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.j.execute():void");
    }
}
