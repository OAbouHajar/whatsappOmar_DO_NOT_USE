package X;

import android.content.Context;
import android.text.TextUtils;
import com.AssemMods.translator.Language;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.google.android.gms.maps.model.LatLng;
import com.mod.bomfab.bomb.BuildConfig;
import com.obwhatsapp.Me;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0tP  reason: invalid class name and case insensitive filesystem */
public abstract class C16650tP {
    public String A00;
    public String A01;
    public final C16300so A02;
    public final C16670tR A03;
    public final C16710tV A04;
    public final C25551Kf A05;
    public final C16690tT A06 = new AnonymousClass2OL(this);
    public final C16320sq A07;

    public C16650tP(C16300so r2, C16670tR r3, C16710tV r4, C25551Kf r5, C16320sq r6, String str) {
        this.A02 = r2;
        this.A07 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.4VZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: X.4VZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: X.4VZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: X.4VZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: X.4Ol} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: X.4Wg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: X.4Wg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: X.4Ol} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: X.4DK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: X.4WH} */
    /* JADX WARNING: type inference failed for: r13v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C16650tP r22, X.C84384Ki r23, X.C83744Hw r24) {
        /*
            r6 = r24
            r3 = r22
            int r5 = r6.A00
            r0 = -1
            r12 = r23
            if (r5 == r0) goto L_0x0532
            r0 = 3
            if (r5 == r0) goto L_0x0532
            int r0 = r5 / 100
            java.lang.String r4 = ""
            r2 = 2
            if (r0 != r2) goto L_0x04a8
            org.json.JSONObject r0 = r6.A01
            if (r0 == 0) goto L_0x049f
            boolean r1 = r3 instanceof X.C59752yt
            if (r1 == 0) goto L_0x0137
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r1 = "request_id"
            java.lang.String r17 = r0.optString(r1)
            java.lang.String r6 = "business_profiles"
            org.json.JSONArray r9 = r0.optJSONArray(r6)
            r10 = 0
            if (r9 == 0) goto L_0x0099
            int r8 = r9.length()
            r1 = 0
        L_0x003b:
            if (r1 >= r8) goto L_0x0099
            int r16 = r1 + 1
            org.json.JSONObject r2 = r9.getJSONObject(r1)
            X.1US r7 = X.AnonymousClass1US.A00(r2)
            java.lang.String r1 = "categories"
            org.json.JSONArray r15 = r2.getJSONArray(r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r11 = 0
        L_0x0058:
            int r1 = r15.length()
            if (r11 >= r1) goto L_0x0083
            org.json.JSONObject r2 = r15.getJSONObject(r11)
            java.lang.String r1 = "name"
            java.lang.String r5 = r2.getString(r1)
            java.lang.String r1 = "icon_url"
            java.lang.String r3 = r2.getString(r1)
            java.lang.String r1 = "root_category_id"
            java.lang.String r2 = r2.getString(r1)
            r14.add(r5)
            X.4j9 r1 = new X.4j9
            r1.<init>(r5, r3, r2)
            r13.add(r1)
            int r11 = r11 + 1
            goto L_0x0058
        L_0x0083:
            java.util.List r1 = r7.A0H
            r1.addAll(r14)
            java.util.List r1 = r7.A0I
            r1.addAll(r13)
            r1 = r17
            r7.A03 = r1
            r1 = r18
            r1.add(r7)
            r1 = r16
            goto L_0x003b
        L_0x0099:
            java.lang.String r5 = "countries"
            org.json.JSONArray r7 = r0.optJSONArray(r5)
            java.lang.String r3 = "longitude"
            java.lang.String r2 = "latitude"
            java.lang.String r1 = "clusters"
            if (r7 != 0) goto L_0x00d4
            org.json.JSONArray r9 = r0.optJSONArray(r1)
            if (r9 == 0) goto L_0x00d4
            int r8 = r9.length()
            r7 = 0
        L_0x00b2:
            if (r7 >= r8) goto L_0x00d4
            int r13 = r7 + 1
            org.json.JSONObject r11 = r9.getJSONObject(r7)
            double r20 = r11.getDouble(r2)
            double r22 = r11.getDouble(r3)
            java.lang.String r7 = "count"
            int r24 = r11.getInt(r7)
            X.4j8 r7 = new X.4j8
            r19 = r7
            r19.<init>(r20, r22, r24)
            r4.add(r7)
            r7 = r13
            goto L_0x00b2
        L_0x00d4:
            org.json.JSONArray r8 = r0.optJSONArray(r5)
            if (r8 == 0) goto L_0x00fc
            int r7 = r8.length()
        L_0x00de:
            if (r10 >= r7) goto L_0x00fc
            int r11 = r10 + 1
            org.json.JSONObject r9 = r8.getJSONObject(r10)
            double r20 = r9.getDouble(r2)
            double r22 = r9.getDouble(r3)
            r24 = 0
            X.4j8 r9 = new X.4j8
            r19 = r9
            r19.<init>(r20, r22, r24)
            r4.add(r9)
            r10 = r11
            goto L_0x00de
        L_0x00fc:
            java.lang.String r2 = "view"
            java.lang.String r3 = r0.optString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x0133
            org.json.JSONArray r2 = r0.optJSONArray(r5)
            if (r2 == 0) goto L_0x011d
            java.lang.String r3 = "world"
        L_0x0112:
            X.4WH r13 = new X.4WH
            r1 = r18
            r0 = r17
            r13.<init>(r3, r0, r4, r1)
            goto L_0x04b6
        L_0x011d:
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            if (r1 == 0) goto L_0x0126
            java.lang.String r3 = "city"
            goto L_0x0112
        L_0x0126:
            org.json.JSONArray r0 = r0.optJSONArray(r6)
            if (r0 == 0) goto L_0x0130
            java.lang.String r3 = "street"
            goto L_0x0112
        L_0x0130:
            java.lang.String r3 = "microscope"
            goto L_0x0112
        L_0x0133:
            X.C18450wi.A0B(r3)
            goto L_0x0112
        L_0x0137:
            boolean r1 = r3 instanceof X.C59742ys
            if (r1 == 0) goto L_0x016a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r1 = "popular_categories"
            org.json.JSONArray r3 = r0.getJSONArray(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r3 == 0) goto L_0x0162
            r1 = 0
        L_0x014e:
            int r0 = r3.length()
            if (r1 >= r0) goto L_0x04ae
            org.json.JSONObject r0 = r3.getJSONObject(r1)
            X.3oM r0 = X.C73563oM.A00(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x014e
        L_0x0162:
            java.lang.String r1 = "PopularCategoriesWidget/fromJson categories not found"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x016a:
            boolean r1 = r3 instanceof X.C59732yr
            if (r1 == 0) goto L_0x01a3
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r1 = "tiles"
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            r3 = 0
        L_0x017b:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x019c
            org.json.JSONObject r2 = r4.getJSONObject(r3)
            java.lang.String r0 = "tile_id"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "imprecise_location_tile_level"
            int r0 = r2.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r1, r0)
            int r3 = r3 + 1
            goto L_0x017b
        L_0x019c:
            X.4DK r13 = new X.4DK
            r13.<init>(r5)
            goto L_0x04b6
        L_0x01a3:
            boolean r1 = r3 instanceof X.C59722yq
            if (r1 == 0) goto L_0x01da
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r1 = "categories"
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            r3 = 0
        L_0x01b3:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x04b6
            org.json.JSONObject r1 = r4.getJSONObject(r3)
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)
            X.AnonymousClass00B.A05(r2)
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.getString(r0)
            X.AnonymousClass00B.A05(r1)
            X.1dn r0 = new X.1dn
            r0.<init>(r2, r1)
            r13.add(r0)
            int r3 = r3 + 1
            goto L_0x01b3
        L_0x01da:
            boolean r1 = r3 instanceof X.C59762yu
            if (r1 == 0) goto L_0x02cf
            X.2yu r3 = (X.C59762yu) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r1 = "categories"
            org.json.JSONArray r7 = r0.getJSONArray(r1)
            r10 = 0
            r5 = 0
        L_0x01ed:
            int r1 = r7.length()
            if (r5 >= r1) goto L_0x0214
            org.json.JSONObject r2 = r7.getJSONObject(r5)
            java.lang.String r1 = "id"
            java.lang.String r4 = r2.getString(r1)
            X.AnonymousClass00B.A05(r4)
            java.lang.String r1 = "name"
            java.lang.String r2 = r2.getString(r1)
            X.AnonymousClass00B.A05(r2)
            X.1dn r1 = new X.1dn
            r1.<init>(r4, r2)
            r6.add(r1)
            int r5 = r5 + 1
            goto L_0x01ed
        L_0x0214:
            java.lang.String r1 = "request_id"
            java.lang.String r5 = r0.optString(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r1 = "businesses"
            org.json.JSONArray r7 = r0.getJSONArray(r1)
            r2 = 0
        L_0x0226:
            int r1 = r7.length()
            if (r2 >= r1) goto L_0x023c
            org.json.JSONObject r1 = r7.getJSONObject(r2)
            X.1US r1 = X.AnonymousClass1US.A00(r1)
            r1.A03 = r5
            r4.add(r1)
            int r2 = r2 + 1
            goto L_0x0226
        L_0x023c:
            java.lang.String r1 = "suggested_queries"
            org.json.JSONArray r9 = r0.optJSONArray(r1)
            r8 = 0
            if (r9 == 0) goto L_0x025c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2 = 0
        L_0x024c:
            int r1 = r9.length()
            if (r2 >= r1) goto L_0x025d
            java.lang.String r1 = r9.getString(r2)
            r7.add(r1)
            int r2 = r2 + 1
            goto L_0x024c
        L_0x025c:
            r7 = r8
        L_0x025d:
            java.lang.String r1 = "alternative_queries"
            org.json.JSONArray r9 = r0.optJSONArray(r1)
            if (r9 == 0) goto L_0x027b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2 = 0
        L_0x026b:
            int r1 = r9.length()
            if (r2 >= r1) goto L_0x027b
            java.lang.String r1 = r9.getString(r2)
            r8.add(r1)
            int r2 = r2 + 1
            goto L_0x026b
        L_0x027b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r1 = "filter_categories"
            org.json.JSONArray r9 = r0.optJSONArray(r1)
            if (r9 == 0) goto L_0x029c
        L_0x0288:
            int r1 = r9.length()
            if (r10 >= r1) goto L_0x029c
            org.json.JSONObject r1 = r9.getJSONObject(r10)
            X.3oM r1 = X.C73563oM.A00(r1)
            r2.add(r1)
            int r10 = r10 + 1
            goto L_0x0288
        L_0x029c:
            java.lang.String r1 = "proximity_weight"
            double r9 = r0.optDouble(r1)
            java.lang.Double r15 = java.lang.Double.valueOf(r9)
            java.lang.String r1 = "ranking_logic_ver"
            java.lang.String r18 = r0.optString(r1)
            java.lang.String r1 = "page_id"
            java.lang.String r16 = r0.optString(r1)
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            X.4Vm r14 = new X.4Vm
            r14.<init>(r7, r8)
            int r0 = r3.A00
            X.4Ol r13 = new X.4Ol
            r21 = r4
            r22 = r2
            r23 = r0
            r17 = r5
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x04b6
        L_0x02cf:
            boolean r1 = r3 instanceof X.C59712yp
            if (r1 == 0) goto L_0x031e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r1 = "request_id"
            java.lang.String r2 = r0.optString(r1)
            java.lang.String r1 = "business_profiles"
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            r1 = 0
        L_0x02e5:
            int r0 = r4.length()
            if (r1 >= r0) goto L_0x02fb
            org.json.JSONObject r0 = r4.getJSONObject(r1)
            X.1US r0 = X.AnonymousClass1US.A00(r0)
            r0.A03 = r2
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x02e5
        L_0x02fb:
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            r15 = 0
            r0 = 0
            java.lang.Double r14 = java.lang.Double.valueOf(r0)
            X.4Wg r13 = new X.4Wg
            r17 = r15
            r20 = r3
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x04b6
        L_0x031e:
            boolean r1 = r3 instanceof X.C59772yv
            if (r1 == 0) goto L_0x03b9
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r1 = "business_profiles"
            org.json.JSONArray r3 = r0.getJSONArray(r1)
            java.lang.String r1 = "request_id"
            java.lang.String r5 = r0.optString(r1)
            r7 = 0
            r2 = 0
        L_0x0335:
            int r1 = r3.length()
            if (r2 >= r1) goto L_0x034b
            org.json.JSONObject r1 = r3.getJSONObject(r2)
            X.1US r1 = X.AnonymousClass1US.A00(r1)
            r1.A03 = r5
            r6.add(r1)
            int r2 = r2 + 1
            goto L_0x0335
        L_0x034b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r1 = "subcategories"
            org.json.JSONArray r3 = r0.optJSONArray(r1)
            if (r3 == 0) goto L_0x036e
            r2 = 0
        L_0x035a:
            int r1 = r3.length()
            if (r2 >= r1) goto L_0x036e
            org.json.JSONObject r1 = r3.getJSONObject(r2)
            X.3oM r1 = X.C73563oM.A00(r1)
            r4.add(r1)
            int r2 = r2 + 1
            goto L_0x035a
        L_0x036e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r1 = "filter_categories"
            org.json.JSONArray r2 = r0.optJSONArray(r1)
            if (r2 == 0) goto L_0x038f
        L_0x037b:
            int r1 = r2.length()
            if (r7 >= r1) goto L_0x038f
            org.json.JSONObject r1 = r2.getJSONObject(r7)
            X.3oM r1 = X.C73563oM.A00(r1)
            r3.add(r1)
            int r7 = r7 + 1
            goto L_0x037b
        L_0x038f:
            java.lang.String r1 = "proximity_weight"
            double r1 = r0.optDouble(r1)
            java.lang.Double r14 = java.lang.Double.valueOf(r1)
            java.lang.String r1 = "ranking_logic_ver"
            java.lang.String r17 = r0.optString(r1)
            java.lang.String r1 = "page_id"
            java.lang.String r15 = r0.optString(r1)
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            X.4Wg r13 = new X.4Wg
            r20 = r6
            r21 = r3
            r16 = r5
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x04b6
        L_0x03b9:
            boolean r1 = r3 instanceof X.C59702yo
            if (r1 == 0) goto L_0x040d
            java.lang.String r1 = "business_profiles"
            org.json.JSONArray r7 = r0.getJSONArray(r1)
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            int r6 = r7.length()
            r0 = 0
        L_0x03cd:
            if (r0 >= r6) goto L_0x04b6
            int r8 = r0 + 1
            org.json.JSONObject r1 = r7.getJSONObject(r0)
            X.C18450wi.A0B(r1)
            java.lang.String r0 = "jid"
            java.lang.String r5 = r1.getString(r0)
            java.lang.String r0 = "product_images"
            org.json.JSONArray r4 = r1.getJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r2 = r4.length()
            r0 = 0
        L_0x03ee:
            if (r0 >= r2) goto L_0x03fe
            int r1 = r0 + 1
            java.lang.String r0 = r4.getString(r0)
            X.C18450wi.A0B(r0)
            r3.add(r0)
            r0 = r1
            goto L_0x03ee
        L_0x03fe:
            X.C18450wi.A0B(r5)
            X.4Va r1 = new X.4Va
            r1.<init>(r5, r3)
            java.lang.String r0 = r1.A00
            r13.put(r0, r1)
            r0 = r8
            goto L_0x03cd
        L_0x040d:
            boolean r1 = r3 instanceof X.AnonymousClass33J
            if (r1 == 0) goto L_0x0438
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            r15 = 0
            X.4Vm r14 = new X.4Vm
            r14.<init>(r15, r15)
            java.util.List r20 = X.AnonymousClass461.A00(r0)
            r23 = 4
            r17 = r15
            r18 = r15
            X.4Ol r13 = new X.4Ol
            r16 = r15
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x04b6
        L_0x0438:
            boolean r1 = r3 instanceof X.AnonymousClass33I
            if (r1 == 0) goto L_0x048e
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r1 = "biz_categories"
            org.json.JSONArray r7 = r0.optJSONArray(r1)
            if (r7 == 0) goto L_0x04b6
            r0 = 0
            int r6 = r7.length()
        L_0x044e:
            if (r0 >= r6) goto L_0x04b6
            int r8 = r0 + 1
            org.json.JSONObject r1 = r7.getJSONObject(r0)
            X.C18450wi.A0B(r1)
            java.lang.String r0 = "id"
            java.lang.String r5 = r1.getString(r0)
            X.AnonymousClass00B.A05(r5)
            X.C18450wi.A0B(r5)
            java.lang.String r0 = "name"
            java.lang.String r3 = r1.getString(r0)
            X.AnonymousClass00B.A05(r3)
            X.C18450wi.A0B(r3)
            java.lang.String r0 = "icon_url"
            java.lang.String r2 = r1.optString(r0, r4)
            java.lang.String r0 = "num_of_biz"
            int r0 = r1.optInt(r0)
            X.C18450wi.A0B(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.3oL r0 = new X.3oL
            r0.<init>(r1, r5, r3, r2)
            r13.add(r0)
            r0 = r8
            goto L_0x044e
        L_0x048e:
            java.util.List r3 = X.AnonymousClass461.A00(r0)
            java.lang.String r2 = "page_id"
            r1 = 0
            java.lang.String r0 = r0.optString(r2, r1)
            X.4VZ r13 = new X.4VZ
            r13.<init>(r0, r3)
            goto L_0x04b6
        L_0x049f:
            X.0so r1 = r3.A02
            java.lang.String r0 = "GraphApiACSNetworkRequest/parseNetworkResponse: cannot parse empty response from server"
            r2 = 1
            r1.AcB(r0, r4, r2)
            goto L_0x04b9
        L_0x04a8:
            r0 = 410(0x19a, float:5.75E-43)
            if (r5 != r0) goto L_0x04bc
            r2 = 4
            goto L_0x04b9
        L_0x04ae:
            X.4DL r0 = new X.4DL
            r0.<init>(r2)
            r13.add(r0)
        L_0x04b6:
            r12.A02 = r13
            r2 = 0
        L_0x04b9:
            r12.A00 = r2
            return
        L_0x04bc:
            java.lang.String r1 = "GraphApiACSNetworkRequest/parseNetworkResponse Request has failed with code "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r12.A00 = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.4NJ r2 = new X.4NJ
            r2.<init>(r0)
            org.json.JSONObject r1 = r6.A01
            if (r1 == 0) goto L_0x0527
            java.lang.String r0 = "error"
            org.json.JSONObject r3 = r1.optJSONObject(r0)
            if (r3 == 0) goto L_0x0527
            java.lang.String r1 = "code"
            boolean r0 = r3.has(r1)
            if (r0 == 0) goto L_0x0530
            int r0 = r3.optInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04f7:
            r2.A00 = r0
            java.lang.String r1 = "error_subcode"
            boolean r0 = r3.has(r1)
            if (r0 == 0) goto L_0x052e
            int r0 = r3.optInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0509:
            r2.A01 = r0
            java.lang.String r1 = "message"
            boolean r0 = r3.has(r1)
            if (r0 == 0) goto L_0x052c
            java.lang.String r0 = r3.optString(r1)
        L_0x0517:
            r2.A04 = r0
            java.lang.String r1 = "fbtrace_id"
            boolean r0 = r3.has(r1)
            if (r0 == 0) goto L_0x052a
            java.lang.String r0 = r3.optString(r1)
        L_0x0525:
            r2.A03 = r0
        L_0x0527:
            r12.A01 = r2
            return
        L_0x052a:
            r0 = 0
            goto L_0x0525
        L_0x052c:
            r0 = 0
            goto L_0x0517
        L_0x052e:
            r0 = 0
            goto L_0x0509
        L_0x0530:
            r0 = 0
            goto L_0x04f7
        L_0x0532:
            r12.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16650tP.A00(X.0tP, X.4Ki, X.4Hw):void");
    }

    public String A01() {
        return this instanceof C59752yt ? "map" : !(this instanceof C59742ys) ? this instanceof C59732yr ? "imprecise_location_tile" : this instanceof C59722yq ? "categories" : !(this instanceof C59762yu) ? this instanceof C59712yp ? "recommendations" : !(this instanceof C59772yv) ? this instanceof C59702yo ? "cached_data" : !(this instanceof AnonymousClass33J) ? this instanceof AnonymousClass33I ? "home" : "businesses" : "query" : "businesses" : "query" : "home";
    }

    public Map A02() {
        HashMap hashMap;
        String str;
        if (this instanceof C59752yt) {
            C59752yt r5 = (C59752yt) this;
            HashMap hashMap2 = new HashMap();
            AnonymousClass26B r4 = r5.A01;
            boolean A012 = r4.A01();
            hashMap2.put("latitude", A012 ? r4.A03 : r4.A01);
            hashMap2.put("longitude", A012 ? r4.A04 : r4.A02);
            hashMap2.put("search_radius_meters", r4.A05);
            String str2 = r5.A03;
            if (str2 != null) {
                hashMap2.put("category_id", str2);
            }
            hashMap2.put("zoom_level", Integer.valueOf(r5.A00));
            hashMap2.put("ranking_logic_ver", r5.A02.A06(C16620tM.A02, 1412));
            return hashMap2;
        } else if (this instanceof C59742ys) {
            C59742ys r42 = (C59742ys) this;
            HashMap hashMap3 = new HashMap();
            AnonymousClass26B r52 = r42.A01;
            String str3 = r52.A08;
            hashMap3.put("location_type", str3);
            if (str3.equals("country_default")) {
                String str4 = r52.A06;
                AnonymousClass00B.A06(str4);
                hashMap3.put("country_code", str4);
            } else {
                boolean A013 = r52.A01();
                hashMap3.put("wa_biz_directory_lat", A013 ? r52.A03 : r52.A01);
                hashMap3.put("wa_biz_directory_long", A013 ? r52.A04 : r52.A02);
            }
            hashMap3.put("ranking_logic_ver", r42.A02.A06(C16620tM.A02, 2878));
            hashMap3.put("screen_res", r42.A00 <= 240 ? "hdpi" : "xxhdpi");
            return hashMap3;
        } else if (this instanceof C59732yr) {
            C59732yr r6 = (C59732yr) this;
            HashMap hashMap4 = new HashMap();
            JSONObject jSONObject = new JSONObject();
            LatLng latLng = r6.A01;
            jSONObject.put("wa_biz_directory_lat", latLng.A00);
            jSONObject.put("wa_biz_directory_long", latLng.A01);
            hashMap4.put("location", jSONObject);
            hashMap4.put("max_tiles", Integer.valueOf(r6.A00));
            return hashMap4;
        } else if (this instanceof C59722yq) {
            C59722yq r1 = (C59722yq) this;
            HashMap hashMap5 = new HashMap();
            AnonymousClass32L.A01(r1.A00, hashMap5);
            hashMap5.put("tiered_onboarding_supported", Boolean.valueOf(r1.A01.A0E(C16620tM.A02, 1443)));
            return hashMap5;
        } else {
            if (this instanceof C59762yu) {
                C59762yu r43 = (C59762yu) this;
                hashMap = new HashMap();
                AnonymousClass32L.A01(r43.A03, hashMap);
                hashMap.put("query", r43.A05);
                int i2 = r43.A00;
                hashMap.put("search_type", i2 != 1 ? i2 != 2 ? null : "typeahead_business" : "typeahead_category");
                hashMap.put("business_load_all", Boolean.valueOf(r43.A08));
                hashMap.put("search_by_business_enabled", Boolean.valueOf(r43.A07));
                C14710pd r3 = r43.A04;
                C16620tM r2 = C16620tM.A02;
                hashMap.put("ranking_logic_ver", r3.A06(r2, 1413));
                hashMap.put("tiered_onboarding_supported", Boolean.valueOf(r3.A0E(r2, 1443)));
                AnonymousClass4HF r32 = r43.A01;
                if (r32 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("page_id", r32.A01);
                    jSONObject2.put("page_size", r32.A00);
                    hashMap.put("pagination", jSONObject2);
                }
                AnonymousClass4R9 r0 = r43.A02;
                if (r0 != null) {
                    hashMap.put("filters", r0.A00());
                }
                str = r43.A06;
            } else if (this instanceof C59712yp) {
                C59712yp r22 = (C59712yp) this;
                HashMap hashMap6 = new HashMap();
                hashMap6.put("business_jid", r22.A01.getRawString());
                hashMap6.put("nebula_experiment_id", Integer.valueOf(r22.A00.A03(C16620tM.A02, 1649)));
                return hashMap6;
            } else if (this instanceof C59772yv) {
                C59772yv r44 = (C59772yv) this;
                hashMap = new HashMap();
                AnonymousClass32L.A01(r44.A05, hashMap);
                C31241dn r02 = r44.A06;
                if (r02 != null) {
                    hashMap.put("category_id", r02.A00);
                }
                String str5 = r44.A00;
                AnonymousClass00B.A05(str5);
                hashMap.put("businesses_list_inclusion_level", str5);
                String str6 = r44.A01;
                AnonymousClass00B.A05(str6);
                hashMap.put("subcategories_list_inclusion_level", str6);
                String str7 = r44.A08;
                if (str7 != null) {
                    hashMap.put("browse_use_case", str7);
                }
                hashMap.put("ranking_formula_ver", "linear_weights_v1");
                C14710pd r33 = r44.A07;
                C16620tM r23 = C16620tM.A02;
                hashMap.put("ranking_logic_ver", r33.A06(r23, 1412));
                hashMap.put("tiered_onboarding_supported", Boolean.valueOf(r33.A0E(r23, 1443)));
                if (r33.A0E(r23, 1473)) {
                    hashMap.put("category_icons_resolution", r44.A02 <= 240 ? "hdpi" : "xxhdpi");
                }
                AnonymousClass4R9 r03 = r44.A04;
                if (r03 != null) {
                    hashMap.put("filters", r03.A00());
                }
                AnonymousClass4HF r34 = r44.A03;
                if (r34 != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("page_id", r34.A01);
                    jSONObject3.put("page_size", r34.A00);
                    hashMap.put("pagination", jSONObject3);
                }
                str = r44.A09;
            } else if (this instanceof C59702yo) {
                C59702yo r53 = (C59702yo) this;
                HashMap hashMap7 = new HashMap();
                JSONArray jSONArray = new JSONArray();
                for (AnonymousClass462 r24 : r53.A01) {
                    jSONArray.put("product_images");
                    if (r24 instanceof C71863lA) {
                        C71863lA r25 = (C71863lA) r24;
                        hashMap7.put("product_image_width", Integer.valueOf(r25.A01));
                        hashMap7.put("product_image_height", Integer.valueOf(r25.A00));
                    }
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("requested_fields", jSONArray);
                hashMap7.put("request_id", r53.A00);
                hashMap7.put("fields_config", jSONObject4);
                return hashMap7;
            } else if (this instanceof AnonymousClass33J) {
                AnonymousClass33J r54 = (AnonymousClass33J) this;
                HashMap hashMap8 = new HashMap();
                hashMap8.put("query", r54.A01);
                LinkedList linkedList = new LinkedList();
                linkedList.add("profile_pic");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("requested_fields", new JSONArray(linkedList));
                hashMap8.put("fields_config", jSONObject5);
                hashMap8.put("ranking_logic_ver", r54.A00.A06(C16620tM.A02, 2969));
                return hashMap8;
            } else if (this instanceof AnonymousClass33I) {
                HashMap hashMap9 = new HashMap();
                List<AnonymousClass4DI> singletonList = Collections.singletonList(new AnonymousClass4DI(((AnonymousClass33I) this).A00 <= 240 ? "hdpi" : "xxhdpi"));
                C18450wi.A0B(singletonList);
                ArrayList arrayList = new ArrayList();
                for (AnonymousClass4DI r12 : singletonList) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("module", "biz_categories");
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("icon_spec", r12.A00);
                    jSONObject6.put("config", jSONObject7);
                    arrayList.add(jSONObject6);
                }
                hashMap9.put("module_config", arrayList);
                return hashMap9;
            } else {
                AnonymousClass33K r55 = (AnonymousClass33K) this;
                HashMap hashMap10 = new HashMap();
                C73553oL r04 = r55.A00;
                if (r04 != null) {
                    hashMap10.put("category_id", r04.A00);
                }
                AnonymousClass4VT r45 = r55.A02;
                if (r45 != null) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("page_size", 150);
                    jSONObject8.put("page_id", r45.A00);
                    hashMap10.put("pagination", jSONObject8);
                }
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add("profile_pic");
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("requested_fields", new JSONArray(linkedList2));
                hashMap10.put("fields_config", jSONObject9);
                hashMap10.put("use_case", "search_by_category");
                if ("search_by_category".equals(hashMap10.get("use_case"))) {
                    hashMap10.put("ranking_logic_ver", r55.A01.A06(C16620tM.A02, 2968));
                }
                return hashMap10;
            }
            if (str != null) {
                hashMap.put("search_session_id", str);
            }
            return hashMap;
        }
    }

    public JSONObject A03() {
        JSONObject jSONObject;
        if (this instanceof AnonymousClass32K) {
            AnonymousClass32K r2 = (AnonymousClass32K) this;
            jSONObject = new JSONObject();
            C16040sK r0 = r2.A02.A00.A00;
            r0.A0B();
            Me me = r0.A00;
            AnonymousClass00B.A06(me);
            String A012 = C18160wF.A01(me.cc, me.number);
            String obj = new Locale(r2.A01.A06(), A012).toString();
            C18450wi.A0B(obj);
            if ("in_ID".equalsIgnoreCase(obj)) {
                obj = "id_ID";
            } else if (Language.ENGLISH.equalsIgnoreCase(obj)) {
                obj = "en_US";
            } else if ("iw_IL".equalsIgnoreCase(obj)) {
                obj = "he_IL";
            } else if ("ES".equalsIgnoreCase(obj)) {
                obj = "es_ES";
            }
            jSONObject.put("locale", obj);
            jSONObject.put("country_code", A012);
            if (!TextUtils.isEmpty(r2.A01)) {
                jSONObject.put("credential", r2.A01);
            }
            jSONObject.put("version", BuildConfig.VERSION_NAME);
            jSONObject.put("ranking_logic_ver", JSONObject.NULL);
            for (Map.Entry entry : r2.A02().entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } else {
            AnonymousClass32L r22 = (AnonymousClass32L) this;
            jSONObject = new JSONObject();
            jSONObject.put("locale", AnonymousClass013.A00(r22.A04.A00).toString());
            jSONObject.put("version", r22.A00);
            if (!TextUtils.isEmpty(r22.A01)) {
                jSONObject.put("credential", r22.A01);
            }
            for (Map.Entry entry2 : r22.A02().entrySet()) {
                jSONObject.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        return jSONObject;
    }

    public void A04() {
        this.A03.A9N(this, this.A00);
    }

    public final void A05() {
        int i2;
        if ((this instanceof AnonymousClass32K) || (this instanceof C59752yt) || (this instanceof C59742ys) || (this instanceof C59732yr) || (this instanceof C59722yq) || !(this instanceof C59762yu)) {
            this.A07.Ack(this.A06, new Void[0]);
            return;
        }
        C84384Ki r3 = new C84384Ki();
        try {
            C25551Kf r12 = this.A05;
            String str = AnonymousClass021.A0I;
            String str2 = AnonymousClass021.A07;
            JSONObject A032 = A03();
            String A012 = A01();
            AnonymousClass4TX r10 = new AnonymousClass4TX(this, r3);
            if (!r12.A01.A0A()) {
                i2 = -1;
            } else if (TextUtils.isEmpty(A032.toString())) {
                i2 = 3;
            } else {
                C25561Kg r2 = r12.A03;
                AnonymousClass4SB r9 = new AnonymousClass4SB(r10, this, r12, str, str2, A012, A032);
                synchronized (r2) {
                    if (C90414e6.A01()) {
                        r2.A00();
                        r9.A00();
                    } else {
                        synchronized (C25561Kg.class) {
                            if (!C90414e6.A01()) {
                                Context context = r2.A00.A00;
                                C13710nw.A02(context, "Context must not be null");
                                C14370p3 r5 = new C14370p3();
                                if (C90414e6.A01()) {
                                    r5.A01((Object) null);
                                } else {
                                    new Thread(new RunnableRunnableShape12S0200000_I1(context, 19, r5)).start();
                                }
                                C14210on r7 = r5.A00;
                                r7.A03.A00(new C98874t7(new C98794sz(r2, r9), C14500pH.A00));
                                r7.A04();
                            } else {
                                r2.A00();
                                r9.A00();
                            }
                        }
                    }
                }
                return;
            }
            r10.A00(new C83744Hw((JSONObject) null, i2));
        } catch (Exception e2) {
            if (e2 instanceof JSONException) {
                this.A02.AcB("GraphApiACSNetworkRequest/startCronetRequest: Error while generating the JSON: ", e2.getMessage(), true);
            } else {
                Log.e("GraphApiACSNetworkRequest/startCronetRequest: generic error - ", e2);
            }
            r3.A00 = 3;
            A07(r3);
        }
    }

    public void A06(int i2) {
        if (!this.A06.A02.isCancelled()) {
            C16710tV r1 = this.A04;
            if (r1 != null) {
                if (i2 == 4) {
                    r1.AQR(-1);
                } else {
                    A05();
                }
            }
            A08(Integer.valueOf(i2), (Integer) null);
        }
    }

    public final void A07(C84384Ki r11) {
        AnonymousClass4NJ r2;
        C16710tV r1 = this.A04;
        if (r1 != null) {
            int i2 = r11.A00;
            if (i2 == 0) {
                Object obj = r11.A02;
                if (obj != null) {
                    r1.AYB(obj);
                } else {
                    this.A02.AcB("GraphApiACSNetworkRequest/handleNetworkResult: Null response content", (String) null, true);
                }
            } else {
                r1.AQR(i2);
                if (r11.A00 != 4 && (r2 = r11.A01) != null) {
                    if (!(this instanceof AnonymousClass32K)) {
                        AnonymousClass32L r12 = (AnonymousClass32L) this;
                        r12.A02.A0D(r2.A02, r2.A00, r2.A01, r12.A01(), r2.A04, r2.A03);
                    }
                }
            }
        }
    }

    public void A08(Integer num, Integer num2) {
        String str;
        if (!(this instanceof AnonymousClass32K)) {
            C17210ui r4 = ((AnonymousClass32L) this).A02;
            C75773sh r3 = new C75773sh();
            r3.A00 = 1;
            r3.A09 = r4.A01;
            Long l2 = null;
            r3.A01 = num != null ? Long.valueOf(num.longValue()) : null;
            if (num2 != null) {
                l2 = Long.valueOf(num2.longValue());
            }
            r3.A02 = l2;
            r4.A04.A06(r3);
        } else if (num != null && num.intValue() != 4) {
            C16300so r32 = this.A02;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_code", num);
                if (num2 != null) {
                    jSONObject.put("error_reason", num2);
                }
            } catch (JSONException e2) {
                e2.getMessage();
            } catch (Throwable unused) {
                str = jSONObject.toString();
            }
            str = jSONObject.toString();
            r32.AcB("BusinessApiSearchNetworkRequest/onAcsError", str, false);
        }
    }
}
