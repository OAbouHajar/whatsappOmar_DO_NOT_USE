package X;

import android.accounts.Account;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.DefaultHttpRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: X.2GM  reason: invalid class name */
public class AnonymousClass2GM {
    public static final ConnPerRoute A0L = new AnonymousClass59K();
    public String A00;
    public boolean A01 = false;
    public boolean A02 = true;
    public final Context A03;
    public final C16300so A04;
    public final C17130ua A05;
    public final C16200sd A06;
    public final AnonymousClass59I A07;
    public final AnonymousClass12T A08;
    public final C18260wP A09;
    public final C16190sc A0A;
    public final C16260sj A0B;
    public final C14710pd A0C;
    public final C16510tB A0D;
    public final C16320sq A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final AtomicInteger A0I = new AtomicInteger(0);
    public final SSLSocketFactory A0J;
    public final DefaultHttpClient A0K;

    public AnonymousClass2GM(Context context, C16300so r10, C17130ua r11, C16200sd r12, AnonymousClass12T r13, C18260wP r14, C16190sc r15, C16260sj r16, C14710pd r17, C16510tB r18, C17660vR r19, C16320sq r20, String str, String str2) {
        String str3;
        this.A03 = context;
        this.A0C = r17;
        this.A04 = r10;
        this.A05 = r11;
        this.A0A = r15;
        this.A06 = r12;
        this.A08 = r13;
        this.A0B = r16;
        this.A0D = r18;
        this.A0F = str;
        this.A09 = r14;
        this.A0E = r20;
        C17660vR r2 = r19;
        synchronized (r2) {
            str3 = r2.A01;
            if (str3 == null) {
                str3 = r2.A01(r2.A04, "2.23.1.76");
                r2.A01 = str3;
            }
        }
        this.A0H = str3;
        this.A0J = new C106075Ck(r11);
        AnonymousClass59I r6 = new AnonymousClass59I(r11);
        this.A07 = r6;
        AnonymousClass59J r5 = new AnonymousClass59J(r11);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        basicHttpParams.setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, A0L);
        ConnManagerParams.getMaxConnectionsPerRoute(basicHttpParams).getMaxForRoute(new HttpRoute(new HttpHost("backup.googleapis.com")));
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, true);
        HttpProtocolParams.setUserAgent(basicHttpParams, this.A0H);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("https", new AnonymousClass59L(), 443));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        defaultHttpClient.setRoutePlanner(new DefaultHttpRoutePlanner(schemeRegistry));
        defaultHttpClient.addResponseInterceptor(r5);
        defaultHttpClient.addRequestInterceptor(r6);
        this.A0K = defaultHttpClient;
        this.A0G = str2;
    }

    public static /* synthetic */ HttpResponse A00(AnonymousClass2GM r2, HttpRequestBase httpRequestBase) {
        httpRequestBase.getURI();
        httpRequestBase.setHeader("Host", "backup.googleapis.com");
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(r2.A00);
        httpRequestBase.setHeader("Authorization", sb.toString());
        return r2.A0K.execute(httpRequestBase);
    }

    public static void A01(C16300so r3, String str, int i2) {
        if (i2 >= 400 && i2 < 500) {
            StringBuilder sb = new StringBuilder("GoogleBackupApi/unhandled/error/");
            sb.append(str);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder("status-code = ");
            sb2.append(i2);
            r3.AcB(obj, sb2.toString(), false);
        }
    }

    public static final void A02(C61743Ad r5, File file) {
        String str;
        long j2 = r5.A01;
        if (j2 <= 0) {
            StringBuilder sb = new StringBuilder("GoogleBackupApi/set-local-creation-date-from-remote-file remote file update time is:");
            sb.append(j2);
            str = sb.toString();
        } else if (!file.setLastModified(j2)) {
            str = "GoogleBackupApi/set-local-creation-date-from-remote-file/set-last-modified time failed";
        } else {
            return;
        }
        Log.i(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A03(java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            r17 = this;
            java.lang.String r4 = "clients/wa/backups/"
            java.lang.String r2 = " transaction="
            r7 = r17
            boolean r0 = r7.A0B()
            r13 = 0
            r6 = r18
            r3 = r20
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = "GoogleBackupApi/list-files/api is disabled for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r13
        L_0x0029:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ IOException -> 0x0179 }
            r11.<init>()     // Catch:{ IOException -> 0x0179 }
            java.lang.String r1 = "pageSize"
            java.lang.String r0 = java.lang.Integer.toString(r21)     // Catch:{ IOException -> 0x0179 }
            r11.put(r1, r0)     // Catch:{ IOException -> 0x0179 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x0179 }
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "transaction_id"
            r11.put(r0, r3)     // Catch:{ IOException -> 0x0179 }
        L_0x0048:
            r1 = r19
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x0179 }
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "pageToken"
            r11.put(r0, r1)     // Catch:{ IOException -> 0x0179 }
        L_0x0055:
            java.lang.String r8 = "GET"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0179 }
            r1.<init>()     // Catch:{ IOException -> 0x0179 }
            r1.append(r4)     // Catch:{ IOException -> 0x0179 }
            r1.append(r6)     // Catch:{ IOException -> 0x0179 }
            java.lang.String r0 = "/files"
            r1.append(r0)     // Catch:{ IOException -> 0x0179 }
            java.lang.String r9 = r1.toString()     // Catch:{ IOException -> 0x0179 }
            java.lang.String r10 = "application/json; charset=UTF-8"
            r12 = 0
            javax.net.ssl.HttpsURLConnection r2 = r7.A07(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0179 }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x00a5
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x0115
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x009f
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r5 = "list-files"
            if (r3 == r0) goto L_0x008a
            goto L_0x0146
        L_0x008a:
            X.0pd r3 = r7.A0C     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r1 = 916(0x394, float:1.284E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            boolean r0 = r3.A0E(r0, r1)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            X.AnonymousClass3BQ.A01(r5, r2, r0)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            throw r0     // Catch:{ IOException -> 0x0176, all -> 0x018c }
        L_0x009f:
            X.3iQ r0 = new X.3iQ     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r0.<init>()     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            throw r0     // Catch:{ IOException -> 0x0176, all -> 0x018c }
        L_0x00a5:
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ JSONException -> 0x0135 }
            org.json.JSONObject r5 = X.C30311c8.A03(r0)     // Catch:{ JSONException -> 0x0135 }
            if (r5 == 0) goto L_0x0127
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0135 }
            r1.<init>()     // Catch:{ JSONException -> 0x0135 }
            r1.append(r4)     // Catch:{ JSONException -> 0x0135 }
            r1.append(r6)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "/files/"
            r1.append(r0)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r12 = r1.toString()     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "files"
            org.json.JSONArray r6 = r5.optJSONArray(r0)     // Catch:{ JSONException -> 0x0135 }
            if (r6 == 0) goto L_0x0115
            int r0 = r6.length()     // Catch:{ JSONException -> 0x0135 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0135 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0135 }
            r3 = 0
        L_0x00d5:
            int r0 = r6.length()     // Catch:{ JSONException -> 0x0135 }
            if (r3 >= r0) goto L_0x0104
            org.json.JSONObject r14 = r6.getJSONObject(r3)     // Catch:{ JSONException -> 0x0135 }
            X.0sd r11 = r7.A06     // Catch:{ JSONException -> 0x0135 }
            r15 = -1
            X.3Ad r0 = X.C61743Ad.A00(r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x0135 }
            if (r0 == 0) goto L_0x00ed
            r4.add(r0)     // Catch:{ JSONException -> 0x0135 }
            goto L_0x0101
        L_0x00ed:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0135 }
            r1.<init>()     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "GoogleBackupApi/list-files/missing some attrs "
            r1.append(r0)     // Catch:{ JSONException -> 0x0135 }
            r1.append(r14)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = r1.toString()     // Catch:{ JSONException -> 0x0135 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0135 }
        L_0x0101:
            int r3 = r3 + 1
            goto L_0x00d5
        L_0x0104:
            java.lang.String r0 = "nextPageToken"
            java.lang.String r0 = r5.optString(r0, r13)     // Catch:{ JSONException -> 0x0135 }
            android.util.Pair r0 = android.util.Pair.create(r4, r0)     // Catch:{ JSONException -> 0x0135 }
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x0115:
            r7.A0A()     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            java.util.List r0 = java.util.Collections.emptyList()
            android.util.Pair r0 = android.util.Pair.create(r0, r13)
            return r0
        L_0x0127:
            java.lang.String r0 = "GoogleBackupApi/list-files/empty response"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "empty file list"
            r1 = -1
            X.1da r0 = new X.1da     // Catch:{ JSONException -> 0x0135 }
            r0.<init>(r3, r1)     // Catch:{ JSONException -> 0x0135 }
            throw r0     // Catch:{ JSONException -> 0x0135 }
        L_0x0135:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/list-files/invalid stream"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            java.lang.String r1 = r1.getMessage()     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r0 = -1
            X.1da r3 = new X.1da     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r3.<init>(r1, r0)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            goto L_0x0175
        L_0x0146:
            java.io.InputStream r0 = r2.getErrorStream()     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            java.lang.String r4 = X.C30311c8.A00(r0)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r1.<init>()     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            java.lang.String r0 = "GoogleBackupApi/list-files weird status code: "
            r1.append(r0)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r1.append(r3)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r1.append(r4)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            X.0so r0 = r7.A04     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            A01(r0, r5, r3)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r0 = -1
            X.1da r3 = new X.1da     // Catch:{ IOException -> 0x0176, all -> 0x018c }
            r3.<init>(r4, r0)     // Catch:{ IOException -> 0x0176, all -> 0x018c }
        L_0x0175:
            throw r3     // Catch:{ IOException -> 0x0176, all -> 0x018c }
        L_0x0176:
            r1 = move-exception
            r13 = r2
            goto L_0x017a
        L_0x0179:
            r1 = move-exception
        L_0x017a:
            java.lang.String r0 = "GoogleBackupApi/list-files failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x018a }
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x018a }
            r1 = -1
            X.1da r0 = new X.1da     // Catch:{ all -> 0x018a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x018a }
        L_0x018a:
            r0 = move-exception
            goto L_0x018e
        L_0x018c:
            r0 = move-exception
            r13 = r2
        L_0x018e:
            if (r13 == 0) goto L_0x0193
            r13.disconnect()
        L_0x0193:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GM.A03(java.lang.String, java.lang.String, java.lang.String, int):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3BK A04(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r1 = "GoogleBackupApi/get-backup/failed "
            r4 = r11
            boolean r0 = r11.A0B()
            r7 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "GoogleBackupApi/get-backup/api disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r7
        L_0x0010:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r5 = "GET"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bc }
            r2.<init>()     // Catch:{ IOException -> 0x00bc }
            java.lang.String r0 = "clients/wa/backups/"
            r2.append(r0)     // Catch:{ IOException -> 0x00bc }
            r10 = r12
            r2.append(r12)     // Catch:{ IOException -> 0x00bc }
            java.lang.String r6 = r2.toString()     // Catch:{ IOException -> 0x00bc }
            r9 = 0
            r8 = r7
            javax.net.ssl.HttpsURLConnection r2 = r4.A07(r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x00bc }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x00a0
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x0096
            r0 = 429(0x1ad, float:6.01E-43)
            if (r3 == r0) goto L_0x007f
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x0079
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L_0x006b
            r2.getURL()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.io.InputStream r0 = r2.getErrorStream()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r3 = X.C30311c8.A00(r0)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r0.<init>()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r0.append(r1)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r0.append(r3)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r1 = -1
            X.1da r0 = new X.1da     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            throw r0     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
        L_0x006b:
            java.io.InputStream r0 = r2.getErrorStream()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r1 = X.C30311c8.A00(r0)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            X.3iM r0 = new X.3iM     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            throw r0     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
        L_0x0079:
            X.3iQ r0 = new X.3iQ     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r0.<init>()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            throw r0     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
        L_0x007f:
            X.0pd r3 = r11.A0C     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r1 = 916(0x394, float:1.284E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            boolean r1 = r3.A0E(r0, r1)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r0 = "get-backup"
            X.AnonymousClass3BQ.A01(r0, r2, r1)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            throw r0     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
        L_0x0096:
            r11.A0A()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r7
        L_0x00a0:
            X.0pd r8 = r11.A0C     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            X.0so r5 = r11.A04     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            X.0sd r6 = r11.A06     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r7 = r11
            X.3BK r0 = X.AnonymousClass3BK.A00(r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00b6:
            r0 = move-exception
            r7 = r2
            goto L_0x00cc
        L_0x00b9:
            r0 = move-exception
            r7 = r2
            goto L_0x00bd
        L_0x00bc:
            r0 = move-exception
        L_0x00bd:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00cb }
            r1 = -1
            X.1da r0 = new X.1da     // Catch:{ all -> 0x00cb }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
        L_0x00cc:
            if (r7 == 0) goto L_0x00d1
            r7.disconnect()
        L_0x00d1:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GM.A04(java.lang.String):X.3BK");
    }

    public C61743Ad A05(C108475Od r16, AnonymousClass2GJ r17, AnonymousClass3BK r18, C615839m r19, int i2) {
        TrafficStats.setThreadStatsTag(13);
        try {
            C14710pd r12 = this.A0C;
            C16300so r1 = this.A04;
            C16190sc r10 = this.A0A;
            return new AnonymousClass3AX(r1, this.A06, r16, this.A08, r17, r18, this, r19, this.A09, r10, this.A0B, r12, this.A0E, i2).A01();
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final String A06(String str, Map map) {
        String str2 = this.A0G;
        if (str2 != null) {
            if (map == null) {
                map = new HashMap(1);
            }
            AnonymousClass00B.A0B("mode param should not be included in params", true ^ map.containsKey("mode"));
            map.put("mode", str2);
        }
        if (map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public HttpsURLConnection A07(String str, String str2, String str3, Map map, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/v1/");
            sb.append(str2);
            return A08(str, new URI("https", (String) null, "backup.googleapis.com", -1, sb.toString(), (String) null, (String) null).toASCIIString(), str3, map, z2);
        } catch (URISyntaxException e2) {
            throw new IOException(e2);
        }
    }

    public HttpsURLConnection A08(String str, String str2, String str3, Map map, boolean z2) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(A06(str2, map)).openConnection();
        httpsURLConnection.setSSLSocketFactory(this.A0J);
        httpsURLConnection.setRequestProperty("Host", "backup.googleapis.com");
        httpsURLConnection.setHostnameVerifier(new C38011q6("backup.googleapis.com", new BrowserCompatHostnameVerifier()));
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(this.A00);
        httpsURLConnection.setRequestProperty("Authorization", sb.toString());
        httpsURLConnection.setRequestProperty("User-Agent", this.A0H);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod(str);
        if (str3 != null) {
            httpsURLConnection.setRequestProperty("Content-Type", str3);
        }
        httpsURLConnection.setDoOutput(z2);
        this.A0I.incrementAndGet();
        return httpsURLConnection;
    }

    public synchronized void A09(boolean z2) {
        if (this.A02 != z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleBackupApi/");
            sb.append(z2 ? "enabled" : "disabled");
            Log.i(sb.toString());
            this.A02 = z2;
        }
    }

    public boolean A0A() {
        String str = this.A0F;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleBackupApi/auth-request asking GoogleAuthUtil for auth token: ");
            sb.append(AnonymousClass2GK.A0B(str));
            Log.i(sb.toString());
            String str2 = this.A00;
            if (str2 != null) {
                C62103Bq.A04(this.A03, str2);
            }
            this.A00 = C62103Bq.A01(new Account(str, "com.google"), this.A03);
            Log.i("GoogleBackupApi/auth-request/received-auth-token");
            return true;
        } catch (AnonymousClass3W3 e2) {
            Log.e("GoogleBackupApi/auth-request Google Play services is unavailable, if it was unavailable from the beginning code would not have reached here, so, most likely it became unavailable while the backup/restore was in progress");
            Log.e("GoogleBackupApi/auth-request", e2);
            this.A00 = null;
            throw new C71043iO(e2);
        } catch (AnonymousClass2RG e3) {
            StringBuilder sb2 = new StringBuilder("GoogleBackupApi/auth-request permission to access Google Drive for ");
            sb2.append(AnonymousClass2GK.A0B(str));
            sb2.append(" is not available and we cannot ask user for permission either.");
            Log.i(sb2.toString());
            throw new C71043iO(e3);
        } catch (AnonymousClass3W2 e4) {
            Log.i("GoogleBackupApi/auth-request user recoverable exception happened and notification was published by the system to resolve it.");
            throw new C71043iO(e4);
        } catch (IOException e5) {
            Log.e("GoogleBackupApi/auth-request", e5);
            this.A00 = null;
            return false;
        } catch (AnonymousClass2RH e6) {
            Log.e("GoogleBackupApi/auth-request", e6);
            if ("BadUsername".equals(e6.getMessage())) {
                throw new C71163ia(e6);
            } else if ("ServiceUnavailable".equals(e6.getMessage())) {
                return false;
            } else {
                this.A00 = null;
                throw new C71043iO(e6);
            }
        } catch (SecurityException e7) {
            Log.e("GoogleBackupApi/auth-request", e7);
            this.A00 = null;
            throw new C71043iO(e7);
        } catch (NullPointerException e8) {
            StringBuilder sb3 = new StringBuilder("GoogleBackupApi/auth-request unexpected NullPointerException while trying to get  auth token for the account ");
            sb3.append(AnonymousClass2GK.A0B(str));
            Log.e(sb3.toString());
            Log.e("GoogleBackupApi/auth-request", e8);
            this.A00 = null;
            throw new C71043iO(e8);
        }
    }

    public synchronized boolean A0B() {
        return !this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03b3, code lost:
        if (r3 == null) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (A0E(r4, r33.A03, r4.length()) != false) goto L_0x0093;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x03a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x03b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(X.C108465Oc r35, X.AnonymousClass2GJ r36, X.C61743Ad r37, java.io.File r38) {
        /*
            r34 = this;
            r5 = r34
            boolean r0 = r5.A0B()
            r8 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "restore>GoogleBackupApi/save-file/api disabled"
        L_0x000b:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        L_0x000f:
            java.lang.String r1 = "restore>GoogleBackupApi/save-file/check "
            r33 = r37
            r0 = r33
            java.lang.String r2 = r0.A05
            r32 = r38
            r32.getAbsolutePath()
            long r9 = r0.A00
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002a
            java.lang.String r0 = "restore>GoogleBackupApi/save-file/check size cannot be negative, exiting."
        L_0x0026:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r8
        L_0x002a:
            boolean r0 = r32.exists()
            if (r0 == 0) goto L_0x004d
            boolean r0 = r32.isDirectory()
            if (r0 == 0) goto L_0x004d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r0 = r32
            r2.append(r0)
            java.lang.String r0 = " exists and is a directory, cannot proceed further."
        L_0x0045:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0026
        L_0x004d:
            java.io.File r1 = r32.getParentFile()
            if (r1 == 0) goto L_0x006b
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x006b
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "restore>GoogleBackupApi/save-file/check failed to create "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            goto L_0x0045
        L_0x006b:
            java.io.File r3 = r32.getParentFile()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r32.getName()
            r1.append(r0)
            java.lang.String r0 = ".incomplete"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r3, r0)
            boolean r0 = r4.exists()
            r6 = 1
            if (r0 != 0) goto L_0x00b6
            r4.getAbsolutePath()
        L_0x0093:
            r13 = 0
            if (r6 != 0) goto L_0x00f3
            boolean r0 = r4.delete()
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "restore>GoogleBackupApi/delete-local-file/failed "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r4.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.getAbsolutePath()
            return r8
        L_0x00b6:
            long r0 = r4.length()
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e0
            java.lang.String r6 = "restore>GoogleBackupApi/is-invalid-download-file/true size of a file ("
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r0)
            java.lang.String r0 = ") is more than size of remote file "
            r3.append(r0)
            java.lang.String r0 = r33.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.getAbsolutePath()
        L_0x00de:
            r6 = 0
            goto L_0x0093
        L_0x00e0:
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0093
            long r0 = r4.length()
            r3 = r33
            java.lang.String r3 = r3.A03
            boolean r0 = r5.A0E(r4, r3, r0)
            if (r0 == 0) goto L_0x00de
            goto L_0x0093
        L_0x00f3:
            r4.length()
            goto L_0x00fa
        L_0x00f7:
            r4.getAbsolutePath()
        L_0x00fa:
            long r0 = r4.length()
            r24 = 1
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r11 = r35
            if (r3 != 0) goto L_0x0117
            r2 = r33
            A02(r2, r4)
            r2 = r32
            boolean r2 = r5.A0D(r4, r2)
            if (r2 == 0) goto L_0x0124
            r11.APO(r0)
            return r24
        L_0x0117:
            r11.APO(r0)
            boolean r3 = r36.A05()
            if (r3 != 0) goto L_0x012e
            java.lang.String r0 = "restore>GoogleBackupApi/save-file/failed-waiting-for-suitable-conditions"
            goto L_0x000b
        L_0x0124:
            java.lang.String r0 = r32.getName()
            X.3iX r2 = new X.3iX
            r2.<init>(r0)
            throw r2
        L_0x012e:
            r3 = 13
            android.net.TrafficStats.setThreadStatsTag(r3)
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0492 }
            r3.<init>()     // Catch:{ IOException -> 0x0492 }
            java.lang.String r7 = "alt"
            java.lang.String r6 = "media"
            r3.put(r7, r6)     // Catch:{ IOException -> 0x0492 }
            java.lang.String r26 = "GET"
            r17 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x048b }
            r7.<init>()     // Catch:{ URISyntaxException -> 0x048b }
            java.lang.String r6 = "/v1/"
            r7.append(r6)     // Catch:{ URISyntaxException -> 0x048b }
            r7.append(r2)     // Catch:{ URISyntaxException -> 0x048b }
            java.lang.String r20 = r7.toString()     // Catch:{ URISyntaxException -> 0x048b }
            java.lang.String r16 = "https"
            java.lang.String r18 = "backup.googleapis.com"
            r2 = -1
            r19 = -1
            r22 = r17
            java.net.URI r15 = new java.net.URI     // Catch:{ URISyntaxException -> 0x048b }
            r21 = r17
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ URISyntaxException -> 0x048b }
            java.lang.String r12 = r15.toASCIIString()     // Catch:{ URISyntaxException -> 0x048b }
            java.lang.String r7 = "\\+"
            java.lang.String r6 = "%2B"
            java.lang.String r27 = r12.replaceAll(r7, r6)     // Catch:{ URISyntaxException -> 0x048b }
            r30 = 0
            r25 = r5
            r28 = r17
            r29 = r3
            javax.net.ssl.HttpsURLConnection r12 = r25.A08(r26, r27, r28, r29, r30)     // Catch:{ URISyntaxException -> 0x048b }
            r12.getURL()
            r12.getRequestMethod()
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a0
            java.util.Locale r7 = java.util.Locale.ENGLISH
            r3 = r24
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r6[r8] = r3
            java.lang.String r3 = "bytes=%d-"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            java.lang.String r3 = "Range"
            r12.setRequestProperty(r3, r6)
            r12.getRequestProperty(r3)
        L_0x01a0:
            r16 = -1
            int r7 = r12.getResponseCode()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 == r3) goto L_0x0231
            r3 = 206(0xce, float:2.89E-43)
            if (r7 == r3) goto L_0x0231
            r3 = 401(0x191, float:5.62E-43)
            java.lang.String r9 = " statusLine "
            java.lang.String r6 = "restore>GoogleBackupApi/save-file status of the response is "
            if (r7 != r3) goto L_0x01be
            r12.getResponseMessage()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r5.A0A()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            goto L_0x0472
        L_0x01be:
            r3 = 403(0x193, float:5.65E-43)
            if (r7 == r3) goto L_0x022b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r4.<init>()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r4.append(r6)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r4.append(r7)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r4.append(r9)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r3 = r12.getResponseMessage()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r4.append(r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r3 = r4.toString()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.io.InputStream r3 = r12.getErrorStream()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r4 = X.C30311c8.A00(r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r6.<init>()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r3 = "restore>GoogleBackupApi/save-file "
            r6.append(r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r6.append(r4)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r3 = r6.toString()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3 = 404(0x194, float:5.66E-43)
            if (r7 == r3) goto L_0x0225
            r3 = 429(0x1ad, float:6.01E-43)
            java.lang.String r6 = "save-file"
            if (r7 != r3) goto L_0x021a
            X.0pd r4 = r5.A0C     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3 = 916(0x394, float:1.284E-42)
            X.0tM r2 = X.C16620tM.A02     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            boolean r2 = r4.A0E(r2, r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            X.AnonymousClass3BQ.A01(r6, r12, r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r3 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r2.<init>(r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            throw r2     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
        L_0x021a:
            X.0so r3 = r5.A04     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            A01(r3, r6, r7)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            X.1da r3 = new X.1da     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3.<init>(r4, r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            throw r3     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
        L_0x0225:
            X.3ib r2 = new X.3ib     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r2.<init>()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            throw r2     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
        L_0x022b:
            X.3iQ r2 = new X.3iQ     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r2.<init>()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            throw r2     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
        L_0x0231:
            r4.getAbsolutePath()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r2 = "Content-Length"
            r12.getHeaderField(r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            X.0wP r2 = r5.A09     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r31 = r2
            X.0sq r7 = r5.A0E     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            android.os.Handler r13 = new android.os.Handler     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r13.<init>(r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.util.concurrent.atomic.AtomicBoolean r15 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r2 = r24
            r15.<init>(r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3 = 0
            java.io.InputStream r6 = r12.getInputStream()     // Catch:{ all -> 0x03b8 }
            java.io.BufferedInputStream r23 = new java.io.BufferedInputStream     // Catch:{ all -> 0x03b8 }
            r2 = r23
            r2.<init>(r6)     // Catch:{ all -> 0x03b8 }
            java.io.FileOutputStream r22 = new java.io.FileOutputStream     // Catch:{ all -> 0x03ab }
            r6 = r22
            r2 = r24
            r6.<init>(r4, r2)     // Catch:{ all -> 0x03ab }
            X.4x4 r21 = new X.4x4     // Catch:{ all -> 0x039f }
            r25 = r21
            r26 = r7
            r27 = r23
            r28 = r4
            r29 = r15
            r30 = r12
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x039f }
            r14 = 48
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r7 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0     // Catch:{ all -> 0x039f }
            r6 = r21
            r2 = r31
            r7.<init>(r6, r14, r2)     // Catch:{ all -> 0x039f }
            r13.post(r7)     // Catch:{ all -> 0x039f }
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x03a1 }
            r18 = r2
            r6 = 0
        L_0x028b:
            boolean r2 = r36.A05()     // Catch:{ all -> 0x039b }
            if (r2 != 0) goto L_0x029a
            r15.set(r8)     // Catch:{ all -> 0x039b }
            r12.disconnect()     // Catch:{ all -> 0x039b }
            X.C30311c8.A04(r23)     // Catch:{ all -> 0x039b }
        L_0x029a:
            boolean r2 = r15.get()     // Catch:{ all -> 0x039b }
            if (r2 != 0) goto L_0x02cf
            java.util.Locale r20 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x039b }
            java.lang.String r14 = "gdrive-util/write-file/disconnected after downloading %d bytes from %s to %s (new size: %d)"
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x039b }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x039b }
            r3[r8] = r2     // Catch:{ all -> 0x039b }
            java.net.URL r2 = r12.getURL()     // Catch:{ all -> 0x039b }
            r3[r24] = r2     // Catch:{ all -> 0x039b }
            r15 = 2
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ all -> 0x039b }
            r3[r15] = r2     // Catch:{ all -> 0x039b }
            r15 = 3
            long r18 = r4.length()     // Catch:{ all -> 0x039b }
            java.lang.Long r2 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x039b }
            r3[r15] = r2     // Catch:{ all -> 0x039b }
            r2 = r20
            java.lang.String r2 = java.lang.String.format(r2, r14, r3)     // Catch:{ all -> 0x039b }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x039b }
            goto L_0x02ec
        L_0x02cf:
            r14 = 8192(0x2000, float:1.14794E-41)
            r3 = r23
            r2 = r18
            int r14 = r3.read(r2, r8, r14)     // Catch:{ IllegalStateException -> 0x02e6 }
            if (r14 <= 0) goto L_0x02ec
            r3 = r22
            r3.write(r2, r8, r14)     // Catch:{ all -> 0x039b }
            long r2 = (long) r14     // Catch:{ all -> 0x039b }
            long r6 = r6 + r2
            r11.APO(r2)     // Catch:{ all -> 0x039b }
            goto L_0x028b
        L_0x02e6:
            r3 = move-exception
            java.lang.String r2 = "gdrive-util/write-file/connection-disconnected-during-read"
            com.whatsapp.util.Log.i(r2, r3)     // Catch:{ all -> 0x039b }
        L_0x02ec:
            r22.close()     // Catch:{ all -> 0x0397 }
            r23.close()     // Catch:{ all -> 0x0393 }
            r3 = 49
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r2 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r15 = r21
            r14 = r31
            r2.<init>(r15, r3, r14)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r13.post(r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            long r6 = r6 * r16
            r11.APO(r6)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r4.getAbsolutePath()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r4.length()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            long r6 = r4.length()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0345
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r7.<init>()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r2 = "restore>GoogleBackupApi/"
            r7.append(r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.util.Locale r13 = java.util.Locale.ENGLISH     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r6 = "save-file/incomplete download, expected: %d bytes, received: %d bytes"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3[r8] = r2     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            long r9 = r4.length()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3[r24] = r2     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r2 = java.lang.String.format(r13, r6, r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r7.append(r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r2 = r7.toString()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            goto L_0x0472
        L_0x0345:
            long r2 = r4.length()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r6 = r33
            java.lang.String r6 = r6.A03     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            boolean r2 = r5.A0E(r4, r6, r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            if (r2 != 0) goto L_0x0370
            boolean r2 = r4.delete()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            if (r2 != 0) goto L_0x0472
            java.lang.String r2 = "restore>GoogleBackupApi/delete-local-file/failed "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3.<init>(r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r3.append(r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            java.lang.String r2 = r3.toString()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            goto L_0x0472
        L_0x0370:
            r2 = r33
            A02(r2, r4)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r2 = r32
            boolean r2 = r5.A0D(r4, r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            if (r2 == 0) goto L_0x0389
            long r0 = r0 * r16
            r11.APO(r0)
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r24
        L_0x0389:
            java.lang.String r3 = r32.getName()     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            X.3iX r2 = new X.3iX     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r2.<init>(r3)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            throw r2     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
        L_0x0393:
            r10 = move-exception
            r3 = r21
            goto L_0x03b5
        L_0x0397:
            r2 = move-exception
            r3 = r21
            goto L_0x03ae
        L_0x039b:
            r2 = move-exception
            r3 = r21
            goto L_0x03a5
        L_0x039f:
            r2 = move-exception
            goto L_0x03a3
        L_0x03a1:
            r2 = move-exception
            r3 = r6
        L_0x03a3:
            r6 = 0
        L_0x03a5:
            r22.close()     // Catch:{ all -> 0x03a8 }
        L_0x03a8:
            throw r2     // Catch:{ all -> 0x03a9 }
        L_0x03a9:
            r2 = move-exception
            goto L_0x03ae
        L_0x03ab:
            r2 = move-exception
            r6 = 0
        L_0x03ae:
            r23.close()     // Catch:{ all -> 0x03b1 }
        L_0x03b1:
            throw r2     // Catch:{ all -> 0x03b2 }
        L_0x03b2:
            r10 = move-exception
            if (r3 == 0) goto L_0x03c6
        L_0x03b5:
            r9 = 49
            goto L_0x03bc
        L_0x03b8:
            r10 = move-exception
            r6 = 0
            goto L_0x03c6
        L_0x03bc:
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r4 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r2 = r31
            r4.<init>(r3, r9, r2)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            r13.post(r4)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
        L_0x03c6:
            long r6 = r6 * r16
            r11.APO(r6)     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
            throw r10     // Catch:{ UnknownHostException -> 0x0459, IOException -> 0x03cc }
        L_0x03cc:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x047e }
            r4.<init>()     // Catch:{ all -> 0x047e }
            java.lang.String r2 = "restore>GoogleBackupApi/save-file error while downloading file "
            r4.append(r2)     // Catch:{ all -> 0x047e }
            r2 = r32
            r4.append(r2)     // Catch:{ all -> 0x047e }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x047e }
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x047e }
            java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x047e }
            if (r6 == 0) goto L_0x03fc
            java.lang.String r2 = "ENOSPC"
            boolean r2 = r6.contains(r2)     // Catch:{ all -> 0x047e }
            if (r2 == 0) goto L_0x03fc
            java.lang.String r2 = "restore>GoogleBackupApi/save-file no space left on the device."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x047e }
            X.3iU r2 = new X.3iU     // Catch:{ all -> 0x047e }
            r2.<init>()     // Catch:{ all -> 0x047e }
            throw r2     // Catch:{ all -> 0x047e }
        L_0x03fc:
            if (r6 == 0) goto L_0x0419
            java.lang.String r2 = "ENAMETOOLONG"
            boolean r2 = r6.contains(r2)     // Catch:{ all -> 0x047e }
            if (r2 != 0) goto L_0x040e
            java.lang.String r2 = "(File name too long)"
            boolean r2 = r6.contains(r2)     // Catch:{ all -> 0x047e }
            if (r2 == 0) goto L_0x0419
        L_0x040e:
            java.lang.String r2 = "restore>GoogleBackupApi/save-file name too long"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x047e }
            X.3ib r2 = new X.3ib     // Catch:{ all -> 0x047e }
            r2.<init>(r6)     // Catch:{ all -> 0x047e }
            throw r2     // Catch:{ all -> 0x047e }
        L_0x0419:
            X.0sc r4 = r5.A0A     // Catch:{ all -> 0x047e }
            r2 = r32
            boolean r2 = r4.A0B(r2)     // Catch:{ all -> 0x047e }
            if (r2 == 0) goto L_0x0431
            X.0sj r2 = r5.A0B     // Catch:{ all -> 0x047e }
            boolean r2 = r2.A0E()     // Catch:{ all -> 0x047e }
            if (r2 == 0) goto L_0x0431
            X.3iZ r2 = new X.3iZ     // Catch:{ all -> 0x047e }
            r2.<init>(r3)     // Catch:{ all -> 0x047e }
            throw r2     // Catch:{ all -> 0x047e }
        L_0x0431:
            if (r6 == 0) goto L_0x0472
            java.lang.String r2 = "EACCES"
            boolean r2 = r6.contains(r2)     // Catch:{ all -> 0x047e }
            if (r2 != 0) goto L_0x044e
            java.lang.String r2 = "EPERM"
            boolean r2 = r6.contains(r2)     // Catch:{ all -> 0x047e }
            if (r2 == 0) goto L_0x0472
            java.lang.String r2 = "restore>GoogleBackupApi/save-file EPERM"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x047e }
            X.3iW r2 = new X.3iW     // Catch:{ all -> 0x047e }
            r2.<init>(r3)     // Catch:{ all -> 0x047e }
            throw r2     // Catch:{ all -> 0x047e }
        L_0x044e:
            java.lang.String r2 = "restore>GoogleBackupApi/save-file EACCES"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x047e }
            X.3iZ r2 = new X.3iZ     // Catch:{ all -> 0x047e }
            r2.<init>(r3)     // Catch:{ all -> 0x047e }
            throw r2     // Catch:{ all -> 0x047e }
        L_0x0459:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x047e }
            r3.<init>()     // Catch:{ all -> 0x047e }
            java.lang.String r2 = "restore>GoogleBackupApi/save-file unable to access "
            r3.append(r2)     // Catch:{ all -> 0x047e }
            java.net.URL r2 = r12.getURL()     // Catch:{ all -> 0x047e }
            r3.append(r2)     // Catch:{ all -> 0x047e }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x047e }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x047e }
        L_0x0472:
            long r0 = r0 * r16
            r11.APO(r0)
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r8
        L_0x047e:
            r2 = move-exception
            long r0 = r0 * r16
            r11.APO(r0)
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r2
        L_0x048b:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0492 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0492 }
            throw r0     // Catch:{ IOException -> 0x0492 }
        L_0x0492:
            r1 = move-exception
            java.lang.String r0 = "restore>GoogleBackupApi/save-file"
            com.whatsapp.util.Log.e(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GM.A0C(X.5Oc, X.2GJ, X.3Ad, java.io.File):boolean");
    }

    public final boolean A0D(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("restore>GoogleBackupApi/rename-local/file/failed copying and deleting:");
        sb.append(file.getAbsolutePath());
        sb.append(" -> ");
        sb.append(file2.getAbsolutePath());
        Log.w(sb.toString());
        try {
            AnonymousClass1XI.A0B(this.A0D, file, file2);
            if (AnonymousClass1XI.A0N(file)) {
                return true;
            }
            Log.e("restore>GoogleBackupApi/rename-local/file/failed to delete file after copy");
            return false;
        } catch (IOException | SecurityException e2) {
            Log.e("restore>GoogleBackupApi/rename-local/file/failed with exception", e2);
            return false;
        }
    }

    public final boolean A0E(File file, String str, long j2) {
        String A092 = AnonymousClass2GK.A09(this.A0A, this.A0B, file, j2);
        if (str.equals(A092)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("restore>GoogleBackupApi/save-file/check-md5 ");
        sb.append(file.getAbsolutePath());
        sb.append(" downloaded but its MD5(");
        sb.append(A092);
        sb.append(") does not match remote md5(");
        sb.append(str);
        sb.append(").");
        Log.e(sb.toString());
        return false;
    }
}
