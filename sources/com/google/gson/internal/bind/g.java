package com.google.gson.internal.bind;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Type;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import r.e;
import r.f;

/* compiled from: XFMFile */
public final class g implements JsonSerializationContext, JsonDeserializationContext, Callback, InternalCache, EventListener.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f389a;

    public /* synthetic */ g(Object obj) {
        this.f389a = obj;
    }

    public final EventListener create(Call call) {
        return (EventListener) this.f389a;
    }

    public final Object deserialize(JsonElement jsonElement, Type type) {
        return ((TreeTypeAdapter) this.f389a).f349c.fromJson(jsonElement, type);
    }

    public final Response get(Request request) {
        Cache cache = (Cache) this.f389a;
        cache.getClass();
        try {
            DiskLruCache.Snapshot snapshot = cache.f1876b.get(Cache.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                boolean z2 = false;
                f fVar = new f(snapshot.getSource(0));
                Headers headers = fVar.f2417b;
                String str = fVar.f2418c;
                String str2 = fVar.f2416a;
                Headers headers2 = fVar.f2422g;
                String str3 = headers2.get("Content-Type");
                String str4 = headers2.get("Content-Length");
                Response build = new Response.Builder().request(new Request.Builder().url(str2).method(str, (RequestBody) null).headers(headers).build()).protocol(fVar.f2419d).code(fVar.f2420e).message(fVar.f2421f).headers(headers2).body(new e(snapshot, str3, str4)).handshake(fVar.f2423h).sentRequestAtMillis(fVar.f2424i).receivedResponseAtMillis(fVar.f2425j).build();
                if (str2.equals(request.url().toString()) && str.equals(request.method()) && HttpHeaders.varyMatches(build, headers, request)) {
                    z2 = true;
                }
                if (z2) {
                    return build;
                }
                Util.closeQuietly((Closeable) build.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly((Closeable) snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public final void onFailure(Call call, IOException iOException) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e8 A[Catch:{ Exception -> 0x00f9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResponse(okhttp3.Call r8, okhttp3.Response r9) {
        /*
            r7 = this;
            java.lang.Object r8 = r7.f389a
            boolean r0 = r9.isSuccessful()
            if (r0 == 0) goto L_0x00f9
            okhttp3.ResponseBody r9 = r9.body()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r9 = r9.string()     // Catch:{ Exception -> 0x00f9 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f9 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x00f9 }
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            r1 = -2833024122305(0xfffffd6c629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x00f9 }
            r9.f916a = r1     // Catch:{ Exception -> 0x00f9 }
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            r1 = -2854498958785(0xfffffd67629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x00f9 }
            r9.f917b = r1     // Catch:{ Exception -> 0x00f9 }
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            r1 = -2875973795265(0xfffffd62629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x00f9 }
            r9.f918c = r1     // Catch:{ Exception -> 0x00f9 }
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            r1 = -2906038566337(0xfffffd5b629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            r9.f920e = r1     // Catch:{ Exception -> 0x00f9 }
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            r1 = -2953283206593(0xfffffd50629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            r9.f921f = r1     // Catch:{ Exception -> 0x00f9 }
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            r1 = -2996232879553(0xfffffd46629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            r9.f922g = r1     // Catch:{ Exception -> 0x00f9 }
            r1 = -3030592617921(0xfffffd3e629a823f, double:NaN)
            java.lang.String r9 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r1)     // Catch:{ Exception -> 0x00f9 }
            int r9 = r0.getInt(r9)     // Catch:{ Exception -> 0x00f9 }
            r0 = r8
            com.obwhatsapp.yo.z r0 = (com.obwhatsapp.yo.z) r0     // Catch:{ Exception -> 0x00f9 }
            r1 = 0
            r2 = 1
            if (r9 != r2) goto L_0x0097
            r9 = 1
            goto L_0x0098
        L_0x0097:
            r9 = 0
        L_0x0098:
            r0.f919d = r9     // Catch:{ Exception -> 0x00f9 }
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9 }
            r0.<init>()     // Catch:{ Exception -> 0x00f9 }
            r3 = -3082132225473(0xfffffd32629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r3)     // Catch:{ Exception -> 0x00f9 }
            r0.append(r3)     // Catch:{ Exception -> 0x00f9 }
            r3 = r8
            com.obwhatsapp.yo.z r3 = (com.obwhatsapp.yo.z) r3     // Catch:{ Exception -> 0x00f9 }
            int r3 = r3.f918c     // Catch:{ Exception -> 0x00f9 }
            r0.append(r3)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f9 }
            r9.f924i = r0     // Catch:{ Exception -> 0x00f9 }
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            int r9 = r9.f916a     // Catch:{ Exception -> 0x00f9 }
            int r0 = com.obwhatsapp.youbasha.task.utils.buildNo1     // Catch:{ Exception -> 0x00f9 }
            if (r9 > r0) goto L_0x00d8
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            int r9 = r9.f916a     // Catch:{ Exception -> 0x00f9 }
            if (r9 != r0) goto L_0x00d6
            r9 = r8
            com.obwhatsapp.yo.z r9 = (com.obwhatsapp.yo.z) r9     // Catch:{ Exception -> 0x00f9 }
            int r9 = r9.f917b     // Catch:{ Exception -> 0x00f9 }
            int r0 = com.obwhatsapp.youbasha.task.utils.buildNo2     // Catch:{ Exception -> 0x00f9 }
            if (r9 < r0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            r9 = 0
            goto L_0x00d9
        L_0x00d8:
            r9 = 1
        L_0x00d9:
            r0 = r8
            com.obwhatsapp.yo.z r0 = (com.obwhatsapp.yo.z) r0     // Catch:{ Exception -> 0x00f9 }
            int r0 = r0.f918c     // Catch:{ Exception -> 0x00f9 }
            long r3 = com.obwhatsapp.yo.z.b(r0)     // Catch:{ Exception -> 0x00f9 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00e9
            r1 = 1
        L_0x00e9:
            r0 = r8
            com.obwhatsapp.yo.z r0 = (com.obwhatsapp.yo.z) r0     // Catch:{ Exception -> 0x00f9 }
            boolean r0 = r0.f919d     // Catch:{ Exception -> 0x00f9 }
            if (r0 == 0) goto L_0x00f9
            if (r9 == 0) goto L_0x00f9
            if (r1 != 0) goto L_0x00f9
            com.obwhatsapp.yo.z r8 = (com.obwhatsapp.yo.z) r8     // Catch:{ Exception -> 0x00f9 }
            com.obwhatsapp.yo.z.a(r8)     // Catch:{ Exception -> 0x00f9 }
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.g.onResponse(okhttp3.Call, okhttp3.Response):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[SYNTHETIC, Splitter:B:19:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.cache.CacheRequest put(okhttp3.Response r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f389a
            okhttp3.Cache r0 = (okhttp3.Cache) r0
            r0.getClass()
            okhttp3.Request r1 = r6.request()
            java.lang.String r1 = r1.method()
            okhttp3.Request r2 = r6.request()
            java.lang.String r2 = r2.method()
            boolean r2 = okhttp3.internal.http.HttpMethod.invalidatesCache(r2)
            okhttp3.internal.cache.DiskLruCache r3 = r0.f1876b
            r4 = 0
            if (r2 == 0) goto L_0x0030
            okhttp3.Request r6 = r6.request()     // Catch:{ IOException -> 0x0068 }
            okhttp3.HttpUrl r6 = r6.url()     // Catch:{ IOException -> 0x0068 }
            java.lang.String r6 = okhttp3.Cache.key(r6)     // Catch:{ IOException -> 0x0068 }
            r3.remove(r6)     // Catch:{ IOException -> 0x0068 }
            goto L_0x0068
        L_0x0030:
            java.lang.String r2 = "GET"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0039
            goto L_0x0068
        L_0x0039:
            boolean r1 = okhttp3.internal.http.HttpHeaders.hasVaryAll((okhttp3.Response) r6)
            if (r1 == 0) goto L_0x0040
            goto L_0x0068
        L_0x0040:
            r.f r1 = new r.f
            r1.<init>((okhttp3.Response) r6)
            okhttp3.Request r6 = r6.request()     // Catch:{ IOException -> 0x0062 }
            okhttp3.HttpUrl r6 = r6.url()     // Catch:{ IOException -> 0x0062 }
            java.lang.String r6 = okhttp3.Cache.key(r6)     // Catch:{ IOException -> 0x0062 }
            okhttp3.internal.cache.DiskLruCache$Editor r6 = r3.edit(r6)     // Catch:{ IOException -> 0x0062 }
            if (r6 != 0) goto L_0x0058
            goto L_0x0068
        L_0x0058:
            r1.c(r6)     // Catch:{ IOException -> 0x0063 }
            r.c r1 = new r.c     // Catch:{ IOException -> 0x0063 }
            r1.<init>(r0, r6)     // Catch:{ IOException -> 0x0063 }
            r4 = r1
            goto L_0x0068
        L_0x0062:
            r6 = r4
        L_0x0063:
            if (r6 == 0) goto L_0x0068
            r6.abort()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.g.put(okhttp3.Response):okhttp3.internal.cache.CacheRequest");
    }

    public final void remove(Request request) {
        Cache cache = (Cache) this.f389a;
        cache.getClass();
        cache.f1876b.remove(Cache.key(request.url()));
    }

    public final JsonElement serialize(Object obj) {
        return ((TreeTypeAdapter) this.f389a).f349c.toJsonTree(obj);
    }

    public final JsonElement serialize(Object obj, Type type) {
        return ((TreeTypeAdapter) this.f389a).f349c.toJsonTree(obj, type);
    }

    public final void trackConditionalCacheHit() {
        Cache cache = (Cache) this.f389a;
        synchronized (cache) {
            cache.f1880f++;
        }
    }

    public final void trackResponse(CacheStrategy cacheStrategy) {
        Cache cache = (Cache) this.f389a;
        synchronized (cache) {
            cache.f1881g++;
            if (cacheStrategy.networkRequest != null) {
                cache.f1879e++;
            } else if (cacheStrategy.cacheResponse != null) {
                cache.f1880f++;
            }
        }
    }

    public final void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        ((Cache) this.f389a).getClass();
        f fVar = new f(response2);
        try {
            editor = ((e) response.body()).f2410b.edit();
            if (editor != null) {
                try {
                    fVar.c(editor);
                    editor.commit();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            editor = null;
            if (editor != null) {
                try {
                    editor.abort();
                } catch (IOException unused3) {
                }
            }
        }
    }
}
