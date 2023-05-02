package X;

import android.app.ProgressDialog;
import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.profile.WebImagePicker;
import com.whatsapp.util.Log;

/* renamed from: X.37E  reason: invalid class name */
public class AnonymousClass37E extends C16690tT {
    public ProgressDialog A00;
    public final AnonymousClass4V7 A01;
    public final /* synthetic */ WebImagePicker A02;

    public AnonymousClass37E(AnonymousClass4V7 r1, WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
        this.A01 = r1;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13, types: [java.io.OutputStream, java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0190, code lost:
        if (r4 != 0) goto L_0x0192;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0184 A[Catch:{ all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0189 A[Catch:{ all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0162 A[Catch:{ all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x016e A[Catch:{ all -> 0x019c }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:93:0x0172=Splitter:B:93:0x0172, B:84:0x015c=Splitter:B:84:0x015c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r14) {
        /*
            r13 = this;
            r4 = 0
            r5 = 1
            X.4V7 r10 = r13.A01     // Catch:{ IOException -> 0x016f, Exception -> 0x0159, all -> 0x0155 }
            java.lang.String r2 = r10.A05     // Catch:{ IOException -> 0x016f, Exception -> 0x0159, all -> 0x0155 }
            java.lang.String r1 = " "
            java.lang.String r0 = "%20"
            java.lang.String r0 = r2.replace(r1, r0)     // Catch:{ IOException -> 0x016f, Exception -> 0x0159, all -> 0x0155 }
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x016f, Exception -> 0x0159, all -> 0x0155 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x016f, Exception -> 0x0159, all -> 0x0155 }
            java.lang.String r8 = ""
            r9 = 0
            r12 = r4
            r7 = 0
        L_0x0018:
            r0 = 20
            if (r7 >= r0) goto L_0x00cf
            java.net.URLConnection r2 = r3.openConnection()     // Catch:{ IOException -> 0x0150, Exception -> 0x014b, all -> 0x019e }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0150, Exception -> 0x014b, all -> 0x019e }
            r0 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            r0 = 30000(0x7530, float:4.2039E-41)
            r2.setReadTimeout(r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            java.lang.String r1 = "User-Agent"
            com.obwhatsapp.profile.WebImagePicker r0 = r13.A02     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            X.0vR r0 = r0.A0F     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            java.lang.String r0 = r0.A00()     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "Cookie"
            r2.setRequestProperty(r0, r8)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
        L_0x0044:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 == r0) goto L_0x004d
            goto L_0x00a1
        L_0x004d:
            java.lang.String r0 = "Location"
            java.lang.String r0 = r2.getHeaderField(r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            if (r0 == 0) goto L_0x00b5
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            r6.<init>(r3, r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            java.lang.String r0 = "webimage/download/bg redirected from "
            r1.append(r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            r1.append(r3)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            r1.append(r6)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            X.C13680ns.A1V(r1)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            java.lang.String r0 = "Set-Cookie"
            java.lang.String r3 = r2.getHeaderField(r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            if (r3 == 0) goto L_0x009d
            java.lang.String r0 = ";"
            java.lang.String[] r1 = r3.split(r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            int r0 = r1.length     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            if (r0 <= 0) goto L_0x0085
            r3 = r1[r9]     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
        L_0x0085:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            if (r0 != 0) goto L_0x0095
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r8)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            java.lang.String r0 = "; "
            java.lang.String r8 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
        L_0x0095:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r8)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            java.lang.String r8 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
        L_0x009d:
            r2.disconnect()     // Catch:{ IOException -> 0x00c9, Exception -> 0x00c3, all -> 0x00bd }
            goto L_0x00b7
        L_0x00a1:
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 303(0x12f, float:4.25E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 308(0x134, float:4.32E-43)
            if (r1 == r0) goto L_0x004d
        L_0x00b5:
            r12 = r2
            goto L_0x00cf
        L_0x00b7:
            int r7 = r7 + 1
            r12 = r2
            r3 = r6
            goto L_0x0018
        L_0x00bd:
            r0 = move-exception
            r3 = r4
            r6 = r4
            r4 = r2
            goto L_0x01a2
        L_0x00c3:
            r1 = move-exception
            r6 = r4
            r3 = r4
            r4 = r2
            goto L_0x015c
        L_0x00c9:
            r1 = move-exception
            r6 = r4
            r3 = r4
            r4 = r2
            goto L_0x0172
        L_0x00cf:
            com.obwhatsapp.profile.WebImagePicker r6 = r13.A02     // Catch:{ IOException -> 0x0150, Exception -> 0x014b, all -> 0x019e }
            X.0ua r2 = r6.A08     // Catch:{ IOException -> 0x0150, Exception -> 0x014b, all -> 0x019e }
            r0 = 25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0150, Exception -> 0x014b, all -> 0x019e }
            java.io.InputStream r0 = r12.getInputStream()     // Catch:{ IOException -> 0x0150, Exception -> 0x014b, all -> 0x019e }
            X.1qW r3 = new X.1qW     // Catch:{ IOException -> 0x0150, Exception -> 0x014b, all -> 0x019e }
            r3.<init>(r2, r0, r4, r1)     // Catch:{ IOException -> 0x0150, Exception -> 0x014b, all -> 0x019e }
            X.01V r0 = r6.A08     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            android.content.ContentResolver r1 = r0.A0C()     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            if (r1 != 0) goto L_0x00f1
            java.lang.String r0 = "webimage/download/bg cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            goto L_0x00f7
        L_0x00f1:
            android.net.Uri r0 = r6.A02     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            java.io.OutputStream r4 = r1.openOutputStream(r0)     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
        L_0x00f7:
            if (r4 != 0) goto L_0x0104
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            r12.disconnect()
            X.C30311c8.A04(r3)
            return r0
        L_0x0104:
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r8]     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            r11 = 0
            r6 = 0
        L_0x010a:
            X.0tU r2 = r13.A02     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            boolean r0 = r2.isCancelled()     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            if (r0 != 0) goto L_0x0131
            int r1 = r3.read(r7, r9, r8)     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            r0 = -1
            if (r1 == r0) goto L_0x0131
            r4.write(r7, r9, r1)     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            int r11 = r11 + r1
            int r0 = r10.A02     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            r1 = 0
            if (r0 == 0) goto L_0x0125
            int r1 = r11 * 100
            int r1 = r1 / r0
        L_0x0125:
            if (r1 == r6) goto L_0x010a
            java.lang.Integer[] r0 = new java.lang.Integer[r5]     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            X.AnonymousClass000.A1M(r0, r1, r9)     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            r13.A07(r0)     // Catch:{ IOException -> 0x0148, Exception -> 0x0145, all -> 0x0143 }
            r6 = r1
            goto L_0x010a
        L_0x0131:
            r12.disconnect()
            X.C30311c8.A04(r3)
            X.C30311c8.A04(r4)
            boolean r0 = r2.isCancelled()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0143:
            r0 = move-exception
            goto L_0x01a0
        L_0x0145:
            r1 = move-exception
            r6 = r4
            goto L_0x014e
        L_0x0148:
            r1 = move-exception
            r6 = r4
            goto L_0x0153
        L_0x014b:
            r1 = move-exception
            r6 = r4
            r3 = r4
        L_0x014e:
            r4 = r12
            goto L_0x015c
        L_0x0150:
            r1 = move-exception
            r6 = r4
            r3 = r4
        L_0x0153:
            r4 = r12
            goto L_0x0172
        L_0x0155:
            r0 = move-exception
            r3 = r4
            r6 = r4
            goto L_0x01a2
        L_0x0159:
            r1 = move-exception
            r6 = r4
            r3 = r4
        L_0x015c:
            boolean r0 = X.C16690tT.A02(r13)     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x0168
            java.lang.String r0 = "webimage/download/bg/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x019c }
        L_0x0168:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x019c }
            if (r4 == 0) goto L_0x0195
            goto L_0x0192
        L_0x016f:
            r1 = move-exception
            r6 = r4
            r3 = r4
        L_0x0172:
            boolean r0 = X.C16690tT.A02(r13)     // Catch:{ all -> 0x019c }
            if (r0 != 0) goto L_0x0189
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x0189
            boolean r0 = X.C13690nt.A1T(r1)     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x0189
            java.lang.Integer r0 = X.C13680ns.A0Z()     // Catch:{ all -> 0x019c }
            goto L_0x0190
        L_0x0189:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x019c }
            if (r4 == 0) goto L_0x0195
            goto L_0x0192
        L_0x0190:
            if (r4 == 0) goto L_0x0195
        L_0x0192:
            r4.disconnect()
        L_0x0195:
            X.C30311c8.A04(r3)
            X.C30311c8.A04(r6)
            return r0
        L_0x019c:
            r0 = move-exception
            goto L_0x01a2
        L_0x019e:
            r0 = move-exception
            r3 = r4
        L_0x01a0:
            r6 = r4
            r4 = r12
        L_0x01a2:
            if (r4 == 0) goto L_0x01a7
            r4.disconnect()
        L_0x01a7:
            X.C30311c8.A04(r3)
            X.C30311c8.A04(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37E.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Number number = (Number) obj;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.A00 = null;
        WebImagePicker webImagePicker = this.A02;
        if (webImagePicker.A0B == this) {
            webImagePicker.A0B = null;
        }
        int intValue = number.intValue();
        if (intValue == 0) {
            Intent A09 = C13680ns.A09();
            A09.putExtra("webImageSource", this.A01.A06);
            A09.setDataAndType(webImagePicker.A02, "image/*");
            C13680ns.A0r(webImagePicker, A09);
        } else if (!C16690tT.A02(this)) {
            Log.e(AnonymousClass000.A0g("webimage/download/error ", number));
            if (intValue == 2) {
                boolean A002 = C14730pf.A00();
                int i2 = R.string.str0b9f;
                if (A002) {
                    i2 = R.string.str0b9c;
                }
                webImagePicker.Afg(i2);
                return;
            }
            webImagePicker.A05.A09(R.string.str0848, 1);
        }
    }
}
