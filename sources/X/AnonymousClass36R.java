package X;

import android.location.Location;

/* renamed from: X.36R  reason: invalid class name */
public class AnonymousClass36R extends C16690tT {
    public int A00;
    public Location A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final /* synthetic */ AnonymousClass29S A05;

    public AnonymousClass36R(Location location, AnonymousClass29S r2, String str, int i2, boolean z2, boolean z3) {
        this.A05 = r2;
        this.A01 = location;
        this.A02 = str;
        this.A00 = i2;
        this.A04 = z2;
        this.A03 = z3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: X.1li} */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:26|27|28|(1:30)|31|32|33|34|(1:36)|37|(3:39|40|(1:42))|43|44|(3:46|(11:49|50|(1:52)|53|(6:55|(3:57|(1:59)|60)|61|(3:63|(1:65)|66)|67|(3:69|(1:71)|72))|73|(2:75|(2:76|(2:78|(1:83)(3:136|82|84))(1:137)))|91|135|96|47)|133)(1:97)|98|99|100|(1:102)|113|(1:130)(2:115|(1:131)(1:117))) */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02fa, code lost:
        if (r12 != null) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02fc, code lost:
        r1 = r12.optJSONObject("icon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0302, code lost:
        if (r1 == null) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0304, code lost:
        r0 = r1.optString("prefix");
        r11.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x030c, code lost:
        if (r0 == null) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x030e, code lost:
        r11.A05 = X.AnonymousClass000.A0h("64.png", X.AnonymousClass000.A0q(r0));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x036f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x01aa */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0362 A[Catch:{ all -> 0x036f, JSONException -> 0x038a, IOException -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x007a A[EDGE_INSN: B:130:0x007a->B:13:0x007a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b2 A[Catch:{ JSONException -> 0x0320, all -> 0x036b }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x032a A[Catch:{ JSONException -> 0x0320, all -> 0x036b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r32) {
        /*
            r31 = this;
            r1 = r31
            X.29S r0 = r1.A05
            X.38t r5 = r0.A1P
            android.location.Location r4 = r1.A01
            int r3 = r1.A00
            java.lang.String r0 = r1.A02
            r21 = r0
            if (r0 != 0) goto L_0x0012
            java.lang.String r21 = ""
        L_0x0012:
            java.util.ArrayList r0 = r5.A05
            r30 = r0
            java.util.Iterator r11 = r30.iterator()
        L_0x001a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r20 = r11.next()
            r0 = r20
            X.1li r0 = (X.C35311li) r0
            r20 = r0
            java.lang.String r1 = r0.A0F
            r0 = r21
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x001a
            android.location.Location r0 = r20.A00()
            X.AnonymousClass00B.A06(r0)
            float r0 = r0.distanceTo(r4)
            double r1 = (double) r0
            r0 = r20
            int r10 = r0.A0D
            int r0 = r10 + r3
            double r6 = (double) r0
            r8 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r6 = r6 * r8
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r8
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            int r0 = X.AnonymousClass000.A09(r10, r3)
            double r1 = (double) r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            r0 = r20
            java.util.ArrayList r0 = r0.A08
            r0.size()
            r1 = 1
            r0 = r20
            r0.A0A = r1
            java.lang.String r1 = r5.A04
            r0.A07 = r1
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A06
            int r1 = r0.getAndIncrement()
            r0 = r20
            r0.A00 = r1
            r5.A00(r0)
        L_0x007a:
            X.AnonymousClass00B.A06(r20)
            r0 = r20
            java.lang.Integer r0 = r0.A02
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x009d
            r1 = r30
            r0 = r20
            r1.add(r0)
            int r1 = r30.size()
            r0 = 12
            if (r1 <= r0) goto L_0x009d
            r1 = 0
            r0 = r30
            r0.remove(r1)
        L_0x009d:
            r0 = r20
            java.util.ArrayList r5 = r0.A08
            java.util.Iterator r6 = r5.iterator()
        L_0x00a5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x03d2
            java.lang.Object r3 = r6.next()
            com.obwhatsapp.location.PlaceInfo r3 = (com.obwhatsapp.location.PlaceInfo) r3
            android.location.Location r0 = r3.A0C
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = ""
            android.location.Location r2 = new android.location.Location
            r2.<init>(r0)
            r3.A0C = r2
            double r0 = r3.A01
            r2.setLatitude(r0)
            android.location.Location r2 = r3.A0C
            double r0 = r3.A02
            r2.setLongitude(r0)
        L_0x00ca:
            android.location.Location r0 = r3.A0C
            float r0 = r0.distanceTo(r4)
            double r0 = (double) r0
            r3.A00 = r0
            goto L_0x00a5
        L_0x00d4:
            r19 = 1
            r2 = 0
        L_0x00d7:
            r6 = 3
            r18 = 4
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            X.1li r20 = new X.1li     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r1 = r20
            r0 = r21
            r1.<init>(r4, r0, r3)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            android.net.Uri$Builder r7 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r7.<init>()     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r0 = X.AnonymousClass021.A0A     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r7.encodedPath(r0)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r1 = X.AnonymousClass021.A0C     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r0 = "client_secret"
            r7.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r1 = X.AnonymousClass021.A0B     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r0 = "client_id"
            r7.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r1 = X.AnonymousClass021.A0D     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r0 = "v"
            r7.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            double r0 = r4.getLatitude()     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r8.append(r0)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r0 = ","
            r8.append(r0)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            double r0 = r4.getLongitude()     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r8.append(r0)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r1 = r8.toString()     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r0 = "ll"
            r7.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r0 = 99999(0x1869f, float:1.40128E-40)
            int r0 = java.lang.Math.min(r3, r0)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r0 = "radius"
            r7.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            if (r0 != 0) goto L_0x0144
            java.lang.String r1 = "query"
            r0 = r21
            r7.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
        L_0x0144:
            java.lang.String r24 = X.C13700nu.A0G(r7)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            X.0zG r0 = r5.A03     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            X.16H r0 = (X.AnonymousClass16H) r0     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.Integer r1 = X.C13690nt.A0U()     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r9 = 0
            r7 = 0
            r26 = r9
            r27 = r9
            r28 = 0
            r29 = 0
            r22 = r0
            r23 = r1
            r25 = r9
            X.1pl r8 = r22.A00(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            java.lang.String r0 = "X-RateLimit-Limit"
            java.lang.String r11 = r8.AHk(r0)     // Catch:{ all -> 0x036b }
            if (r11 == 0) goto L_0x017c
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x036b }
            java.lang.String r0 = "placelist/getplaces/foursquare/X-RateLimit-Limit:"
            r10.append(r0)     // Catch:{ all -> 0x036b }
            java.lang.String r0 = X.AnonymousClass000.A0h(r11, r10)     // Catch:{ all -> 0x036b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x036b }
        L_0x017c:
            java.lang.String r0 = "X-RateLimit-Remaining"
            java.lang.String r11 = r8.AHk(r0)     // Catch:{ all -> 0x036b }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x036b }
            java.lang.String r0 = "placelist/getplaces/foursquare/X-RateLimit-Remaining:"
            r10.append(r0)     // Catch:{ all -> 0x036b }
            java.lang.String r0 = X.AnonymousClass000.A0h(r11, r10)     // Catch:{ all -> 0x036b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x036b }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x036b }
            if (r0 != 0) goto L_0x01aa
            int r0 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x01aa }
            if (r0 != 0) goto L_0x01aa
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x01aa }
            r0 = r20
            r0.A02 = r10     // Catch:{ NumberFormatException -> 0x01aa }
            java.lang.String r10 = "error_out_of_quota"
            r0.A06 = r10     // Catch:{ NumberFormatException -> 0x01aa }
        L_0x01aa:
            int r10 = r8.A6O()     // Catch:{ all -> 0x036b }
            r0 = 200(0xc8, float:2.8E-43)
            if (r10 != r0) goto L_0x032a
            X.0ua r1 = r5.A01     // Catch:{ all -> 0x036b }
            r0 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x036b }
            java.io.InputStream r0 = r8.A9k(r1, r9, r0)     // Catch:{ all -> 0x036b }
            org.json.JSONObject r1 = X.C30311c8.A03(r0)     // Catch:{ all -> 0x036b }
            r0 = r20
            java.util.ArrayList r0 = r0.A08     // Catch:{ all -> 0x036b }
            r22 = r0
            java.lang.String r0 = "response"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ all -> 0x036b }
            java.lang.String r0 = "venues"
            org.json.JSONArray r10 = r1.getJSONArray(r0)     // Catch:{ all -> 0x036b }
            r9 = 0
        L_0x01d6:
            int r0 = r10.length()     // Catch:{ all -> 0x036b }
            if (r9 >= r0) goto L_0x034a
            org.json.JSONObject r12 = r10.getJSONObject(r9)     // Catch:{ JSONException -> 0x0320 }
            com.obwhatsapp.location.PlaceInfo r11 = new com.obwhatsapp.location.PlaceInfo     // Catch:{ JSONException -> 0x0320 }
            r11.<init>()     // Catch:{ JSONException -> 0x0320 }
            r11.A03 = r6     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = "name"
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x0320 }
            r11.A06 = r0     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = "url"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ JSONException -> 0x0320 }
            r11.A0A = r0     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = "id"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ JSONException -> 0x0320 }
            r11.A08 = r0     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = r11.A0A     // Catch:{ JSONException -> 0x0320 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0320 }
            if (r0 == 0) goto L_0x0216
            java.lang.String r0 = "https://foursquare.com/v/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = r11.A08     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ JSONException -> 0x0320 }
            r11.A0A = r0     // Catch:{ JSONException -> 0x0320 }
        L_0x0216:
            java.lang.String r0 = "location"
            org.json.JSONObject r13 = r12.getJSONObject(r0)     // Catch:{ JSONException -> 0x0320 }
            if (r13 == 0) goto L_0x02d3
            java.lang.String r0 = "lat"
            double r0 = r13.optDouble(r0)     // Catch:{ JSONException -> 0x0320 }
            r11.A01 = r0     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = "lng"
            double r0 = r13.optDouble(r0)     // Catch:{ JSONException -> 0x0320 }
            r11.A02 = r0     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = "address"
            java.lang.String r0 = r13.optString(r0)     // Catch:{ JSONException -> 0x0320 }
            r11.A04 = r0     // Catch:{ JSONException -> 0x0320 }
            r11.A0B = r0     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = "city"
            java.lang.String r14 = r13.optString(r0)     // Catch:{ JSONException -> 0x0320 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r15 = ", "
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0320 }
            if (r0 != 0) goto L_0x025d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            r1.append(r0)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r15, r1)     // Catch:{ JSONException -> 0x0320 }
            r11.A04 = r0     // Catch:{ JSONException -> 0x0320 }
        L_0x025d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            r1.append(r0)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r14, r1)     // Catch:{ JSONException -> 0x0320 }
            r11.A04 = r0     // Catch:{ JSONException -> 0x0320 }
        L_0x026c:
            java.lang.String r0 = "state"
            java.lang.String r14 = r13.optString(r0)     // Catch:{ JSONException -> 0x0320 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ JSONException -> 0x0320 }
            if (r0 != 0) goto L_0x029f
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0320 }
            if (r0 != 0) goto L_0x0290
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            r1.append(r0)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r15, r1)     // Catch:{ JSONException -> 0x0320 }
            r11.A04 = r0     // Catch:{ JSONException -> 0x0320 }
        L_0x0290:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            r1.append(r0)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r14, r1)     // Catch:{ JSONException -> 0x0320 }
            r11.A04 = r0     // Catch:{ JSONException -> 0x0320 }
        L_0x029f:
            java.lang.String r0 = "postalCode"
            java.lang.String r13 = r13.optString(r0)     // Catch:{ JSONException -> 0x0320 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ JSONException -> 0x0320 }
            if (r0 != 0) goto L_0x02d3
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0320 }
            if (r0 != 0) goto L_0x02c4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            r1.append(r0)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ JSONException -> 0x0320 }
            r11.A04 = r0     // Catch:{ JSONException -> 0x0320 }
        L_0x02c4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = r11.A04     // Catch:{ JSONException -> 0x0320 }
            r1.append(r0)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r13, r1)     // Catch:{ JSONException -> 0x0320 }
            r11.A04 = r0     // Catch:{ JSONException -> 0x0320 }
        L_0x02d3:
            java.lang.String r0 = "categories"
            org.json.JSONArray r14 = r12.optJSONArray(r0)     // Catch:{ JSONException -> 0x0320 }
            if (r14 == 0) goto L_0x031a
            r13 = 0
            org.json.JSONObject r12 = r14.optJSONObject(r7)     // Catch:{ JSONException -> 0x0320 }
        L_0x02e0:
            int r0 = r14.length()     // Catch:{ JSONException -> 0x0320 }
            if (r13 >= r0) goto L_0x02fa
            org.json.JSONObject r1 = r14.optJSONObject(r13)     // Catch:{ JSONException -> 0x0320 }
            if (r1 == 0) goto L_0x02f5
            java.lang.String r0 = "primary"
            boolean r0 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x0320 }
            if (r0 == 0) goto L_0x02f5
            goto L_0x02f8
        L_0x02f5:
            int r13 = r13 + 1
            goto L_0x02e0
        L_0x02f8:
            r12 = r1
            goto L_0x02fc
        L_0x02fa:
            if (r12 == 0) goto L_0x031a
        L_0x02fc:
            java.lang.String r0 = "icon"
            org.json.JSONObject r1 = r12.optJSONObject(r0)     // Catch:{ JSONException -> 0x0320 }
            if (r1 == 0) goto L_0x031a
            java.lang.String r0 = "prefix"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x0320 }
            r11.A05 = r0     // Catch:{ JSONException -> 0x0320 }
            if (r0 == 0) goto L_0x031a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)     // Catch:{ JSONException -> 0x0320 }
            java.lang.String r0 = "64.png"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ JSONException -> 0x0320 }
            r11.A05 = r0     // Catch:{ JSONException -> 0x0320 }
        L_0x031a:
            r0 = r22
            r0.add(r11)     // Catch:{ JSONException -> 0x0320 }
            goto L_0x0326
        L_0x0320:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/foursquare/json-exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x036b }
        L_0x0326:
            int r9 = r9 + 1
            goto L_0x01d6
        L_0x032a:
            r0 = r20
            r0.A02 = r1     // Catch:{ all -> 0x036b }
            int r0 = r8.A6O()     // Catch:{ all -> 0x036b }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x036b }
            r0 = r20
            r0.A06 = r6     // Catch:{ all -> 0x036b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x036b }
            java.lang.String r0 = "placelist/getplaces/foursquare/error-status:"
            r1.append(r0)     // Catch:{ all -> 0x036b }
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r1)     // Catch:{ all -> 0x036b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x036b }
        L_0x034a:
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x036b }
            long r6 = r6 - r16
            r0 = r20
            r0.A01 = r6     // Catch:{ all -> 0x036b }
            java.util.ArrayList r0 = r0.A08     // Catch:{ all -> 0x036b }
            r0.size()     // Catch:{ all -> 0x036b }
            r8.close()     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r0 = r20
            java.lang.Integer r0 = r0.A02     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            if (r0 != 0) goto L_0x03a5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            r0 = r20
            r0.A02 = r1     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
            goto L_0x03a5
        L_0x036b:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x036f }
        L_0x036f:
            throw r0     // Catch:{ JSONException -> 0x038a, IOException -> 0x0370 }
        L_0x0370:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/io-exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.1li r20 = new X.1li
            r1 = r20
            r0 = r21
            r1.<init>(r4, r0, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0 = r20
            r0.A02 = r1
            java.lang.String r1 = "error_communication"
            goto L_0x03a3
        L_0x038a:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/json-exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.1li r20 = new X.1li
            r1 = r20
            r0 = r21
            r1.<init>(r4, r0, r3)
            java.lang.Integer r1 = X.C13690nt.A0U()
            r0 = r20
            r0.A02 = r1
            java.lang.String r1 = "error_json"
        L_0x03a3:
            r0.A06 = r1
        L_0x03a5:
            java.lang.String r1 = r5.A04
            r0 = r20
            r0.A07 = r1
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A06
            int r1 = r0.getAndIncrement()
            r0 = r20
            r0.A00 = r1
            r5.A00(r0)
            java.util.ArrayList r0 = r0.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007a
            r0 = r20
            java.lang.Integer r0 = r0.A02
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x007a
            int r2 = r2 + 1
            r0 = 2
            if (r2 >= r0) goto L_0x007a
            goto L_0x00d7
        L_0x03d2:
            r0 = 20
            X.C13690nt.A1P(r5, r0)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36R.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r29) {
        /*
            r28 = this;
            r1 = r29
            X.1li r1 = (X.C35311li) r1
            r27 = r28
            boolean r0 = X.C16690tT.A02(r27)
            if (r0 != 0) goto L_0x018a
            r0 = r27
            X.29S r12 = r0.A05
            r12.A0h = r1
            android.widget.ProgressBar r0 = r12.A0V
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ProgressBar r0 = r12.A0W
            r0.setVisibility(r2)
            X.1li r0 = r12.A0h
            java.util.ArrayList r0 = r0.A08
            boolean r1 = r0.isEmpty()
            r26 = 0
            if (r1 == 0) goto L_0x0078
            X.0pt r2 = r12.A12
            r1 = 2131889670(0x7f120e06, float:1.941401E38)
            r0 = 1
            r2.A09(r1, r0)
            X.00k r2 = r12.A0Y
            r1 = 2131365347(0x7f0a0de3, float:1.8350557E38)
            r0 = 0
            X.C13680ns.A1I(r2, r1, r0)
        L_0x003c:
            r12.A09()
            r12.A0B()
            r12.A0E()
            r0 = r27
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0173
            X.1li r1 = r12.A0h
            java.util.ArrayList r0 = r1.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0173
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.util.ArrayList r0 = r1.A08
            java.util.Iterator r1 = r0.iterator()
        L_0x005f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r1.next()
            com.obwhatsapp.location.PlaceInfo r0 = (com.obwhatsapp.location.PlaceInfo) r0
            double r5 = r0.A01
            double r3 = r0.A02
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r5, r3)
            r2.add(r0)
            goto L_0x005f
        L_0x0078:
            X.00k r1 = r12.A0Y
            r0 = 2131365347(0x7f0a0de3, float:1.8350557E38)
            X.C13680ns.A1I(r1, r0, r2)
            goto L_0x003c
        L_0x0081:
            X.1li r0 = r12.A0h
            java.util.ArrayList r0 = r0.A08
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L_0x008e
            r26 = 1
        L_0x008e:
            r13 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r10 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r8 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Iterator r5 = r2.iterator()
        L_0x009a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r2 = r5.next()
            com.google.android.gms.maps.model.LatLng r2 = (com.google.android.gms.maps.model.LatLng) r2
            java.lang.String r0 = "point must not be null"
            X.C13710nw.A02(r2, r0)
            double r0 = r2.A00
            double r13 = java.lang.Math.min(r13, r0)
            double r10 = java.lang.Math.max(r10, r0)
            double r0 = r2.A01
            boolean r2 = java.lang.Double.isNaN(r8)
            if (r2 == 0) goto L_0x00c0
            r8 = r0
        L_0x00be:
            r6 = r0
            goto L_0x009a
        L_0x00c0:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00e1
            if (r2 > 0) goto L_0x00cc
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x009a
        L_0x00cc:
            double r17 = r8 - r0
            r15 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r17 = r17 + r15
            double r17 = r17 % r15
            double r3 = r0 - r6
            double r3 = r3 + r15
            double r3 = r3 % r15
            int r2 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00be
            r8 = r0
            goto L_0x009a
        L_0x00e1:
            if (r2 <= 0) goto L_0x009a
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x00cc
            goto L_0x009a
        L_0x00e8:
            boolean r17 = java.lang.Double.isNaN(r8)
            r1 = r17 ^ 1
            java.lang.String r25 = "no included points"
            r0 = r25
            X.C13710nw.A04(r0, r1)
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            r2.<init>(r13, r8)
            com.google.android.gms.maps.model.LatLng r1 = new com.google.android.gms.maps.model.LatLng
            r1.<init>(r10, r6)
            com.google.android.gms.maps.model.LatLngBounds r0 = new com.google.android.gms.maps.model.LatLngBounds
            r0.<init>(r2, r1)
            com.google.android.gms.maps.model.LatLng r2 = r0.A00
            double r4 = r2.A00
            com.google.android.gms.maps.model.LatLng r15 = r0.A01
            double r0 = r15.A00
            r23 = r0
            double r21 = r4 - r0
            double r2 = r2.A01
            double r0 = r15.A01
            double r19 = r2 - r0
            r15 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r21 = r21 / r15
            double r4 = r4 + r21
            double r19 = r19 / r15
            double r2 = r2 + r19
            com.google.android.gms.maps.model.LatLng r15 = new com.google.android.gms.maps.model.LatLng
            r15.<init>(r4, r2)
            double r2 = r15.A00
            double r13 = java.lang.Math.min(r13, r2)
            double r4 = java.lang.Math.max(r10, r2)
            double r2 = r15.A01
            if (r17 == 0) goto L_0x01b1
            r8 = r2
        L_0x0134:
            r6 = r2
        L_0x0135:
            double r23 = r23 - r21
            double r0 = r0 - r19
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            r2 = r23
            r10.<init>(r2, r0)
            double r2 = r10.A00
            double r0 = java.lang.Math.min(r13, r2)
            double r2 = java.lang.Math.max(r4, r2)
            double r4 = r10.A01
            boolean r10 = java.lang.Double.isNaN(r8)
            if (r10 == 0) goto L_0x018b
            r8 = r4
        L_0x0153:
            r6 = r4
        L_0x0154:
            boolean r4 = java.lang.Double.isNaN(r8)
            r5 = r4 ^ 1
            r4 = r25
            X.C13710nw.A04(r4, r5)
            com.google.android.gms.maps.model.LatLng r4 = new com.google.android.gms.maps.model.LatLng
            r4.<init>(r0, r8)
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r2, r6)
            com.google.android.gms.maps.model.LatLngBounds r1 = new com.google.android.gms.maps.model.LatLngBounds
            r1.<init>(r4, r0)
            r0 = r26
            r12.A0O(r1, r0)
        L_0x0173:
            r0 = r27
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x018a
            boolean r0 = r12.A0p
            if (r0 == 0) goto L_0x018a
            r0 = 0
            r12.A0p = r0
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 1
            r12.A0S(r1, r0)
        L_0x018a:
            return
        L_0x018b:
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x01aa
            if (r10 > 0) goto L_0x0197
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0154
        L_0x0197:
            double r15 = r8 - r4
            r10 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r15 = r15 + r10
            double r15 = r15 % r10
            double r13 = r4 - r6
            double r13 = r13 + r10
            double r13 = r13 % r10
            int r10 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x0153
            r8 = r4
            goto L_0x0154
        L_0x01aa:
            if (r10 <= 0) goto L_0x0154
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 > 0) goto L_0x0197
            goto L_0x0154
        L_0x01b1:
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 > 0) goto L_0x01d3
            if (r10 > 0) goto L_0x01bd
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0135
        L_0x01bd:
            double r17 = r8 - r2
            r10 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r17 = r17 + r10
            double r17 = r17 % r10
            double r15 = r2 - r6
            double r15 = r15 + r10
            double r15 = r15 % r10
            int r10 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x0134
            r8 = r2
            goto L_0x0135
        L_0x01d3:
            if (r10 <= 0) goto L_0x0135
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 > 0) goto L_0x01bd
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36R.A0A(java.lang.Object):void");
    }
}
