package X;

/* renamed from: X.35t  reason: invalid class name */
public class AnonymousClass35t extends C16690tT {
    public final /* synthetic */ C56692oL A00;

    public AnonymousClass35t(C56692oL r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:66|67|(1:69)(8:74|(1:76)|71|(4:73|77|78|79)|80|81|(2:87|110)|88)|70|71|(0)|80|81|83|85|87|110|88|64) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0227 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0104 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x012d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x01d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0212 */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116 A[Catch:{ all -> 0x0227, IOException | JSONException -> 0x0228 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b8 A[Catch:{ JSONException -> 0x01e6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r15) {
        /*
            r14 = this;
            X.2oL r0 = r14.A00     // Catch:{ IOException | JSONException -> 0x0228 }
            com.obwhatsapp.profile.WebImagePicker r0 = r0.A02     // Catch:{ IOException | JSONException -> 0x0228 }
            X.4OZ r2 = r0.A0D     // Catch:{ IOException | JSONException -> 0x0228 }
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()     // Catch:{ IOException | JSONException -> 0x0228 }
            r2.A03 = r0     // Catch:{ IOException | JSONException -> 0x0228 }
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ IOException | JSONException -> 0x0228 }
            r4.<init>()     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = X.AnonymousClass021.A01     // Catch:{ IOException | JSONException -> 0x0228 }
            r4.encodedPath(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r1 = X.AnonymousClass021.A04     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = "SafeSearch"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r1 = X.AnonymousClass021.A02     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = "appid"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r1 = X.AnonymousClass021.A03     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = "aspect"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = r2.A02     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = "q"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r1 = r0.getLanguage()     // Catch:{ IOException | JSONException -> 0x0228 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r3 = r0.getCountry()     // Catch:{ IOException | JSONException -> 0x0228 }
            boolean r0 = r3.isEmpty()     // Catch:{ IOException | JSONException -> 0x0228 }
            if (r0 != 0) goto L_0x0059
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
        L_0x0059:
            java.util.List r0 = r2.A07     // Catch:{ IOException | JSONException -> 0x0228 }
            boolean r0 = r0.contains(r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r1 = "en-US"
        L_0x0063:
            java.lang.String r0 = "mkt"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            int r0 = r2.A00     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = "offset"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            r0 = 50
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = "count"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r8 = X.C13700nu.A0G(r4)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r1 = X.C004101u.A02(r8)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.io.File r0 = r2.A06     // Catch:{ IOException | JSONException -> 0x0228 }
            java.io.File r5 = X.C13700nu.A0C(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            boolean r0 = r5.exists()     // Catch:{ IOException | JSONException -> 0x0228 }
            r9 = 0
            if (r0 == 0) goto L_0x00c4
            long r6 = r5.lastModified()     // Catch:{ IOException | JSONException -> 0x0228 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 + r0
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | JSONException -> 0x0228 }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c4
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x00bf }
            r0.<init>(r5)     // Catch:{ IOException | ClassNotFoundException -> 0x00bf }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x00bf }
            r3.<init>(r0)     // Catch:{ IOException | ClassNotFoundException -> 0x00bf }
            java.lang.Object r1 = r3.readObject()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00ba }
            r3.close()     // Catch:{ IOException | ClassNotFoundException -> 0x00b7 }
            goto L_0x0114
        L_0x00b7:
            r0 = move-exception
            r9 = r1
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00be }
        L_0x00be:
            throw r0     // Catch:{ IOException | ClassNotFoundException -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
        L_0x00c0:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            goto L_0x0113
        L_0x00c4:
            r5.delete()     // Catch:{ IOException | JSONException -> 0x0228 }
            X.0zG r6 = r2.A05     // Catch:{ IOException | JSONException -> 0x0228 }
            X.16H r6 = (X.AnonymousClass16H) r6     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.Integer r7 = X.C13690nt.A0U()     // Catch:{ IOException | JSONException -> 0x0228 }
            r12 = 0
            r11 = r9
            r13 = 0
            r10 = r9
            X.1pl r4 = r6.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException | JSONException -> 0x0228 }
            int r3 = r4.A6O()     // Catch:{ all -> 0x0223 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 != r0) goto L_0x0213
            X.0ua r1 = r2.A04     // Catch:{ all -> 0x0223 }
            r0 = 25
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0223 }
            java.io.InputStream r3 = r4.A9k(r1, r9, r0)     // Catch:{ all -> 0x0223 }
            java.lang.String r9 = X.C30311c8.A00(r3)     // Catch:{ all -> 0x020c }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0105 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0105 }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0105 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0105 }
            r1.writeObject(r9)     // Catch:{ all -> 0x0100 }
            r1.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x010b
        L_0x0100:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0104 }
        L_0x0104:
            throw r0     // Catch:{ IOException -> 0x0105 }
        L_0x0105:
            r1 = move-exception
            java.lang.String r0 = "WebImageSearcher/next"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x020c }
        L_0x010b:
            if (r3 == 0) goto L_0x0110
            r3.close()     // Catch:{ all -> 0x0223 }
        L_0x0110:
            r4.close()     // Catch:{ IOException | JSONException -> 0x0228 }
        L_0x0113:
            r1 = r9
        L_0x0114:
            if (r1 == 0) goto L_0x0209
            org.json.JSONObject r1 = X.C13700nu.A0K(r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            r5 = 0
            r4 = 0
            java.lang.String r0 = "value"
            org.json.JSONArray r4 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x012d }
            java.lang.String r0 = "totalEstimatedMatches"
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x012d }
            r2.A01 = r0     // Catch:{ JSONException -> 0x012d }
            goto L_0x012f
        L_0x012d:
            r2.A01 = r5     // Catch:{ IOException | JSONException -> 0x0228 }
        L_0x012f:
            if (r4 == 0) goto L_0x0209
            java.lang.String r0 = "results.length() = "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0228 }
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = ", total:"
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            int r0 = r2.A01     // Catch:{ IOException | JSONException -> 0x0228 }
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            X.C13680ns.A1V(r1)     // Catch:{ IOException | JSONException -> 0x0228 }
        L_0x014c:
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0228 }
            if (r5 >= r0) goto L_0x01ea
            X.4V7 r3 = new X.4V7     // Catch:{ JSONException -> 0x01e6 }
            r3.<init>()     // Catch:{ JSONException -> 0x01e6 }
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r0 = "contentUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01e6 }
            r3.A05 = r0     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r0 = "hostPageUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01e6 }
            r3.A06 = r0     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r0 = "contentSize"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01e6 }
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ JSONException -> 0x01e6 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x01e6 }
            int r0 = r1.nextInt()     // Catch:{ JSONException -> 0x01e6 }
            r3.A02 = r0     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r1 = r1.next()     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r0 = "KB"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x01e6 }
            if (r0 == 0) goto L_0x01b9
            int r0 = r3.A02     // Catch:{ JSONException -> 0x01e6 }
            int r1 = r0 * 1000
        L_0x018c:
            r3.A02 = r1     // Catch:{ JSONException -> 0x01e6 }
        L_0x018e:
            java.lang.String r0 = "width"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x01e6 }
            r3.A03 = r0     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r0 = "height"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x01e6 }
            r3.A01 = r0     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r0 = "thumbnailUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x01e6 }
            r3.A07 = r0     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r0 = "name"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x01e6 }
            r3.A04 = r0     // Catch:{ JSONException -> 0x01e6 }
            java.lang.String r0 = "accentColor"
            java.lang.String r1 = r6.optString(r0)     // Catch:{ JSONException -> 0x01e6 }
            if (r1 == 0) goto L_0x01d0
            goto L_0x01c8
        L_0x01b9:
            java.lang.String r0 = "MB"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x01e6 }
            if (r0 == 0) goto L_0x018e
            int r1 = r3.A02     // Catch:{ JSONException -> 0x01e6 }
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 * r0
            goto L_0x018c
        L_0x01c8:
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x01d0 }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x01d0 }
        L_0x01d0:
            int r0 = r3.A03     // Catch:{ JSONException -> 0x01e6 }
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 < r1) goto L_0x01e6
            int r0 = r3.A01     // Catch:{ JSONException -> 0x01e6 }
            if (r0 < r1) goto L_0x01e6
            int r1 = r3.A02     // Catch:{ JSONException -> 0x01e6 }
            r0 = 512000(0x7d000, float:7.17465E-40)
            if (r1 > r0) goto L_0x01e6
            java.util.ArrayList r0 = r2.A03     // Catch:{ JSONException -> 0x01e6 }
            r0.add(r3)     // Catch:{ JSONException -> 0x01e6 }
        L_0x01e6:
            int r5 = r5 + 1
            goto L_0x014c
        L_0x01ea:
            int r1 = r2.A00     // Catch:{ IOException | JSONException -> 0x0228 }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0228 }
            int r1 = r1 + r0
            r2.A00 = r1     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException | JSONException -> 0x0228 }
            java.util.ArrayList r0 = r2.A03     // Catch:{ IOException | JSONException -> 0x0228 }
            int r0 = r0.size()     // Catch:{ IOException | JSONException -> 0x0228 }
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0228 }
            java.lang.String r0 = " images"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException | JSONException -> 0x0228 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | JSONException -> 0x0228 }
        L_0x0209:
            java.util.ArrayList r0 = r2.A03     // Catch:{ IOException | JSONException -> 0x0228 }
            return r0
        L_0x020c:
            r0 = move-exception
            if (r3 == 0) goto L_0x0212
            r3.close()     // Catch:{ all -> 0x0212 }
        L_0x0212:
            throw r0     // Catch:{ all -> 0x0223 }
        L_0x0213:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "Communication failed, status="
            java.lang.String r1 = X.C13680ns.A0i(r0, r1, r3)     // Catch:{ all -> 0x0223 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0223 }
            r0.<init>(r1)     // Catch:{ all -> 0x0223 }
            throw r0     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0227 }
        L_0x0227:
            throw r0     // Catch:{ IOException | JSONException -> 0x0228 }
        L_0x0228:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35t.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r6.A0J.size() >= 100) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.List r9 = (java.util.List) r9
            X.2oL r4 = r8.A00
            com.obwhatsapp.profile.WebImagePicker r6 = r4.A02
            android.widget.ProgressBar r0 = r6.A06
            r7 = 8
            r0.setVisibility(r7)
            X.4OZ r0 = r6.A0D
            int r1 = r0.A01
            int r0 = r0.A00
            boolean r0 = X.C13700nu.A0g(r1, r0)
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0026
            java.util.ArrayList r0 = r6.A0J
            int r3 = r0.size()
            r0 = 100
            r2 = 1
            if (r3 < r0) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r4.A01 = r2
            android.view.View r0 = r6.A04
            if (r2 == 0) goto L_0x0071
            r0.setVisibility(r7)
            android.view.View r0 = r6.A05
            r0.setVisibility(r5)
        L_0x0035:
            r0 = 0
            r4.A00 = r0
            if (r9 == 0) goto L_0x0042
            java.util.ArrayList r0 = r6.A0J
            r9.removeAll(r0)
            r0.addAll(r9)
        L_0x0042:
            java.util.ArrayList r0 = r6.A0J
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005c
            android.widget.ListView r0 = r6.ADA()
            android.view.View r3 = r0.getEmptyView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r9 != 0) goto L_0x0060
            r0 = 2131890849(0x7f1212a1, float:1.9416401E38)
            r3.setText(r0)
        L_0x005c:
            r4.notifyDataSetChanged()
            return
        L_0x0060:
            r2 = 2131890844(0x7f12129c, float:1.9416391E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.4OZ r0 = r6.A0D
            java.lang.String r0 = r0.A02
            java.lang.String r0 = X.C13680ns.A0d(r6, r0, r1, r5, r2)
            r3.setText(r0)
            goto L_0x005c
        L_0x0071:
            r0.setVisibility(r5)
            android.view.View r0 = r6.A05
            r0.setVisibility(r7)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35t.A0A(java.lang.Object):void");
    }
}
