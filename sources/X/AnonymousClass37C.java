package X;

import android.app.ProgressDialog;
import android.net.Uri;
import com.facebook.redex.IDxSCallbackShape222S0100000_2_I1;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.37C  reason: invalid class name */
public class AnonymousClass37C extends C16690tT {
    public long A00;
    public ProgressDialog A01;
    public String A02;
    public String A03;
    public final C17130ua A04;
    public final C32301g2 A05 = new IDxSCallbackShape222S0100000_2_I1(this, 1);
    public final AnonymousClass12W A06;
    public final C15860rz A07;
    public final AnonymousClass013 A08;
    public final C14730pf A09;
    public final AnonymousClass1Y3 A0A;
    public final AnonymousClass15W A0B;
    public final AnonymousClass1YA A0C;
    public final C16050sL A0D;
    public final AnonymousClass1BY A0E;
    public final C17220uj A0F;
    public final C23251Bb A0G;
    public final C18160wF A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final WeakReference A0L;
    public final List A0M;
    public final Uri[] A0N;

    public AnonymousClass37C(C14550pN r3, C17130ua r4, AnonymousClass12W r5, C15860rz r6, AnonymousClass013 r7, C14730pf r8, AnonymousClass1Y3 r9, AnonymousClass15W r10, AnonymousClass1YA r11, C16050sL r12, AnonymousClass1BY r13, C17220uj r14, C23251Bb r15, C18160wF r16, String str, String str2, String str3, List list, Uri[] uriArr) {
        this.A0L = C13690nt.A0h(r3);
        this.A04 = r4;
        this.A0H = r16;
        this.A09 = r8;
        this.A0F = r14;
        this.A08 = r7;
        this.A0G = r15;
        this.A06 = r5;
        this.A0B = r10;
        this.A07 = r6;
        this.A0E = r13;
        this.A0C = r11;
        this.A0I = str;
        this.A0K = str2;
        this.A0M = list;
        this.A0J = str3;
        this.A0N = uriArr;
        this.A0A = r9;
        this.A0D = r12;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x023c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0246 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x0231=Splitter:B:48:0x0231, B:56:0x023c=Splitter:B:56:0x023c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r30) {
        /*
            r29 = this;
            r8 = r29
            java.lang.ref.WeakReference r0 = r8.A0L
            java.lang.Object r14 = r0.get()
            android.content.Context r14 = (android.content.Context) r14
            if (r14 == 0) goto L_0x0256
            X.0pf r2 = r8.A09
            long r25 = r2.A02()
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r8.A03 = r0
            X.12W r1 = r8.A06
            X.1g2 r0 = r8.A05
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0028
            long r0 = r2.A01()
            r8.A00 = r0
        L_0x0028:
            X.1BY r0 = r8.A0E
            android.util.Pair r15 = r0.A00()
            X.1Bb r13 = r8.A0G
            java.lang.String r12 = r8.A0I
            java.lang.String r11 = r8.A0K
            r7 = 0
            r6 = 1
            long r0 = r8.A00
            java.lang.String r5 = r8.A03
            java.util.List r4 = r8.A0M
            X.1Y3 r10 = r8.A0A
            if (r10 != 0) goto L_0x0068
            r3 = r7
        L_0x0041:
            X.0sL r2 = r8.A0D
            r27 = 1
            r28 = 1
            r22 = r3
            r23 = r0
            r20 = r5
            r21 = r4
            r19 = r7
            r18 = r11
            r17 = r12
            r16 = r2
            java.lang.String r1 = r13.A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            r8.A02 = r1
            java.lang.String r0 = "searchSupportTask/doInBackground/debugInfo: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0087
        L_0x0068:
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            java.lang.String r9 = r10.A01
            if (r9 == 0) goto L_0x0079
            java.lang.String r2 = "Entry point"
            android.util.Pair r2 = X.C13690nt.A0I(r2, r9)
            r3.add(r2)
        L_0x0079:
            java.lang.String r9 = r10.A00
            if (r9 == 0) goto L_0x0041
            java.lang.String r2 = "Cms ids"
            android.util.Pair r2 = X.C13690nt.A0I(r2, r9)
            r3.add(r2)
            goto L_0x0041
        L_0x0087:
            X.0uj r0 = r8.A0F     // Catch:{ IOException | JSONException -> 0x0247 }
            android.net.Uri$Builder r2 = r0.A01()     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r0 = "client_search.php"
            r2.appendPath(r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = "platform"
            java.lang.String r0 = "android"
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = "lg"
            X.013 r3 = r8.A08     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r0 = r3.A06()     // Catch:{ IOException | JSONException -> 0x0247 }
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = "lc"
            java.lang.String r0 = r3.A05()     // Catch:{ IOException | JSONException -> 0x0247 }
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = "eea"
            X.0wF r0 = r8.A0H     // Catch:{ IOException | JSONException -> 0x0247 }
            boolean r0 = r0.A04()     // Catch:{ IOException | JSONException -> 0x0247 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "1"
        L_0x00b9:
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r0 = "query"
            java.lang.String r12 = r8.A0J     // Catch:{ IOException | JSONException -> 0x0247 }
            r2.appendQueryParameter(r0, r12)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = "manufacturer"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ IOException | JSONException -> 0x0247 }
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = "os_version"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException | JSONException -> 0x0247 }
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = "ccode"
            X.0rz r0 = r8.A07     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r0 = r0.A0O()     // Catch:{ IOException | JSONException -> 0x0247 }
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = "app_version"
            java.lang.String r0 = "2.23.1.76"
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.Object r1 = r15.first     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.Object r0 = r15.second     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException | JSONException -> 0x0247 }
            r2.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException | JSONException -> 0x0247 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException | JSONException -> 0x0247 }
            r0.<init>(r1)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.net.URLConnection r9 = r0.openConnection()     // Catch:{ IOException | JSONException -> 0x0247 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r9.setConnectTimeout(r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            r9.setReadTimeout(r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r0 = "POST"
            r9.setRequestMethod(r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            r9.setDoOutput(r6)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r6 = r0.toString()     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r2 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r0 = "multipart/form-data; boundary="
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r1)     // Catch:{ IOException | JSONException -> 0x0247 }
            r9.setRequestProperty(r2, r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            X.0ua r5 = r8.A04     // Catch:{ IOException | JSONException -> 0x0247 }
            r0 = 20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x0247 }
            r15 = 0
            goto L_0x0134
        L_0x0131:
            java.lang.String r0 = "0"
            goto L_0x00b9
        L_0x0134:
            java.io.OutputStream r1 = r9.getOutputStream()     // Catch:{ IOException | JSONException -> 0x024a }
            X.1pm r0 = new X.1pm     // Catch:{ IOException | JSONException -> 0x024a }
            r0.<init>(r5, r1, r7, r3)     // Catch:{ IOException | JSONException -> 0x024a }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException | JSONException -> 0x024a }
            r2.<init>(r0)     // Catch:{ IOException | JSONException -> 0x024a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = "--"
            r1.append(r0)     // Catch:{ all -> 0x0242 }
            r1.append(r6)     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = "\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0242 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0242 }
            r2.write(r0)     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"debug_info\"\r\n\r\n"
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0242 }
            r2.write(r0)     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0242 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0242 }
            r2.write(r0)     // Catch:{ all -> 0x0242 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = "\r\n--"
            r1.append(r0)     // Catch:{ all -> 0x0242 }
            r1.append(r6)     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = "--\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0242 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0242 }
            r2.write(r0)     // Catch:{ all -> 0x0242 }
            r2.flush()     // Catch:{ all -> 0x0242 }
            r2.close()     // Catch:{ IOException | JSONException -> 0x024a }
            java.io.InputStream r0 = r9.getInputStream()     // Catch:{ IOException | JSONException -> 0x024a }
            X.1qW r11 = new X.1qW     // Catch:{ IOException | JSONException -> 0x024a }
            r11.<init>(r5, r0, r7, r3)     // Catch:{ IOException | JSONException -> 0x024a }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x023d }
            r0.<init>(r11)     // Catch:{ all -> 0x023d }
            java.io.BufferedReader r13 = new java.io.BufferedReader     // Catch:{ all -> 0x023d }
            r13.<init>(r0)     // Catch:{ all -> 0x023d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0238 }
        L_0x01a3:
            java.lang.String r0 = r13.readLine()     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x01ad
            r1.append(r0)     // Catch:{ all -> 0x0238 }
            goto L_0x01a3
        L_0x01ad:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0238 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0238 }
            if (r0 != 0) goto L_0x0231
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x0238 }
            r1.<init>(r2)     // Catch:{ all -> 0x0238 }
            int r14 = r1.length()     // Catch:{ all -> 0x0238 }
            if (r14 == 0) goto L_0x0231
            java.util.ArrayList r10 = X.C13690nt.A0i(r14)     // Catch:{ all -> 0x0238 }
            java.util.ArrayList r9 = X.C13690nt.A0i(r14)     // Catch:{ all -> 0x0238 }
            java.util.ArrayList r6 = X.C13690nt.A0i(r14)     // Catch:{ all -> 0x0238 }
            java.util.ArrayList r5 = X.C13690nt.A0i(r14)     // Catch:{ all -> 0x0238 }
            r7 = 0
            r2 = 0
        L_0x01d4:
            if (r2 >= r14) goto L_0x0203
            org.json.JSONObject r3 = r1.optJSONObject(r2)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "title"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0238 }
            r10.add(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "description"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0238 }
            r9.add(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "url"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0238 }
            r6.add(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0238 }
            r5.add(r0)     // Catch:{ all -> 0x0238 }
            int r2 = r2 + 1
            goto L_0x01d4
        L_0x0203:
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0238 }
            android.net.Uri[] r2 = r8.A0N     // Catch:{ all -> 0x0238 }
            int r1 = r2.length     // Catch:{ all -> 0x0238 }
        L_0x020a:
            if (r7 >= r1) goto L_0x0216
            r0 = r2[r7]     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x0213
            r3.add(r0)     // Catch:{ all -> 0x0238 }
        L_0x0213:
            int r7 = r7 + 1
            goto L_0x020a
        L_0x0216:
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0238 }
            X.4Od r7 = new X.4Od     // Catch:{ all -> 0x0238 }
            r16 = r7
            r17 = r12
            r18 = r0
            r19 = r10
            r20 = r9
            r21 = r6
            r22 = r5
            r23 = r3
            r24 = r4
            r25 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0238 }
        L_0x0231:
            r13.close()     // Catch:{ all -> 0x023d }
            r11.close()     // Catch:{ IOException | JSONException -> 0x024a }
            return r7
        L_0x0238:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x023c }
        L_0x023c:
            throw r0     // Catch:{ all -> 0x023d }
        L_0x023d:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0246 }
            goto L_0x0246
        L_0x0242:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0246 }
        L_0x0246:
            throw r0     // Catch:{ IOException | JSONException -> 0x024a }
        L_0x0247:
            r1 = move-exception
            r15 = 0
            goto L_0x024b
        L_0x024a:
            r1 = move-exception
        L_0x024b:
            java.lang.String r0 = "searchSupportTask/doInBackground/error: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            return r15
        L_0x0256:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37C.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C85364Od r4 = (C85364Od) obj;
        if (this.A0L.get() != null) {
            if (r4 != null) {
                try {
                    int i2 = r4.A00;
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("searchSupportTask/onPostExecute/result/count: ");
                    A0o.append(i2);
                    C13680ns.A1V(A0o);
                    if (i2 > 0) {
                        AnonymousClass1YA r0 = this.A0C;
                        if (r0 != null) {
                            r0.AWo(r4);
                        }
                        ProgressDialog progressDialog = this.A01;
                        if (progressDialog != null && progressDialog.isShowing()) {
                            this.A01.cancel();
                            return;
                        }
                        return;
                    }
                } catch (Exception e2) {
                    Log.e(AnonymousClass000.A0g("searchSupportTask/onPostExecute/error: ", e2), e2);
                }
            }
            AnonymousClass1YA r02 = this.A0C;
            if (r02 != null) {
                r02.AQK();
            }
            ProgressDialog progressDialog2 = this.A01;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.A01.cancel();
            }
        }
    }
}
