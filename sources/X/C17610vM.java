package X;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0vM  reason: invalid class name and case insensitive filesystem */
public class C17610vM {
    public final C16900tq A00;
    public final AnonymousClass173 A01;
    public final C227018y A02;

    public C17610vM(C16900tq r1, AnonymousClass173 r2, C227018y r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static C35251lc A00(AnonymousClass173 r17, JSONObject jSONObject) {
        String str = null;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject2.optString("thumb");
        byte[] decode = !TextUtils.isEmpty(optString) ? Base64.decode(optString, 0) : null;
        String optString2 = jSONObject2.optString("title");
        C35211lY A012 = C39801t5.A01(jSONObject2.optJSONObject("total_amount"));
        String string = jSONObject2.getString("reference_id");
        C28411Vz A013 = r17.A01(jSONObject2.optString("currency"));
        String optString3 = jSONObject2.optString("payment_configuration");
        String optString4 = jSONObject2.optString("payment_type");
        String optString5 = jSONObject2.optString("transaction_id");
        if (TextUtils.isEmpty(optString5)) {
            optString5 = null;
        }
        String optString6 = jSONObject2.optString("payment_status", (String) null);
        String optString7 = jSONObject2.optString("payment_method");
        if (TextUtils.isEmpty(optString7)) {
            optString7 = null;
        }
        long optLong = jSONObject2.optLong("payment_timestamp");
        String optString8 = jSONObject2.optString("type");
        if (!TextUtils.isEmpty(optString8)) {
            str = optString8;
        }
        return new C35251lc(A013, C39801t5.A00(jSONObject2.getJSONObject("order")), A012, optString2, string, str, optString3, optString4, optString5, optString6, optString7, C39801t5.A04(jSONObject2.optJSONArray("external_payment_configurations")), decode, optLong, jSONObject2.optBoolean("is_interactive"));
    }

    public static C35201lX A01(JSONObject jSONObject) {
        String str = null;
        String optString = jSONObject.optString("title");
        if (!TextUtils.isEmpty(optString)) {
            str = optString;
        }
        String str2 = null;
        String optString2 = jSONObject.optString("sub_title");
        if (!TextUtils.isEmpty(optString2)) {
            str2 = optString2;
        }
        String str3 = null;
        String optString3 = jSONObject.optString("header_thumbnail");
        if (!TextUtils.isEmpty(optString3)) {
            str3 = optString3;
        }
        byte[] decode = !TextUtils.isEmpty(str3) ? Base64.decode(str3, 0) : null;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || decode != null) {
            return new C35201lX(str, str2, decode);
        }
        return null;
    }

    public static C35191lW A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            AnonymousClass00B.A06(str);
            JSONObject jSONObject = new JSONObject(str);
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    if (jSONObject2 != null) {
                        String optString = jSONObject2.optString(FacebookFacade.RequestParameter.NAME);
                        String optString2 = jSONObject2.optString("params");
                        arrayList.add(new C35181lV(new C35071lK(optString, optString2), jSONObject2.optBoolean("selected")));
                    }
                }
            }
            return new C35191lW((List) arrayList);
        } catch (JSONException e2) {
            Log.w("NativeFlowMessageConverter/parseJSON/deserialization error", e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0286 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x022c A[SYNTHETIC, Splitter:B:89:0x022c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(X.C16880tn r13) {
        /*
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            X.1lX r3 = r13.A02     // Catch:{ JSONException -> 0x0278 }
            r2 = 0
            if (r3 != 0) goto L_0x000c
            r0 = r2
            goto L_0x000e
        L_0x000c:
            java.lang.String r0 = r3.A01     // Catch:{ JSONException -> 0x0278 }
        L_0x000e:
            java.lang.String r4 = "title"
            r7.put(r4, r0)     // Catch:{ JSONException -> 0x0278 }
            if (r3 != 0) goto L_0x0018
            r1 = r2
            goto L_0x001a
        L_0x0018:
            java.lang.String r1 = r3.A00     // Catch:{ JSONException -> 0x0278 }
        L_0x001a:
            java.lang.String r0 = "sub_title"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            if (r3 == 0) goto L_0x002b
            byte[] r1 = r3.A02     // Catch:{ JSONException -> 0x0278 }
            if (r1 == 0) goto L_0x002b
            r0 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0278 }
        L_0x002b:
            java.lang.String r0 = "header_thumbnail"
            r7.put(r0, r2)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r10 = "description"
            java.lang.String r0 = r13.A07     // Catch:{ JSONException -> 0x0278 }
            r7.put(r10, r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r1 = "footerText"
            java.lang.String r0 = r13.A08     // Catch:{ JSONException -> 0x0278 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r1 = "buttonText"
            java.lang.String r0 = r13.A06     // Catch:{ JSONException -> 0x0278 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r1 = "selectListType"
            int r0 = r13.A00     // Catch:{ JSONException -> 0x0278 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r9 = "sections"
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0278 }
            r8.<init>()     // Catch:{ JSONException -> 0x0278 }
            java.util.List r0 = r13.A09     // Catch:{ JSONException -> 0x0278 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x0278 }
        L_0x005b:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0278 }
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r1 = r12.next()     // Catch:{ JSONException -> 0x0278 }
            X.1lP r1 = (X.C35121lP) r1     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0278 }
            r6.<init>()     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = r1.A00     // Catch:{ JSONException -> 0x0278 }
            r6.put(r4, r0)     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0278 }
            r5.<init>()     // Catch:{ JSONException -> 0x0278 }
            java.util.List r0 = r1.A01     // Catch:{ JSONException -> 0x0278 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ JSONException -> 0x0278 }
        L_0x007c:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0278 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r3 = r11.next()     // Catch:{ JSONException -> 0x0278 }
            X.1lO r3 = (X.C35111lO) r3     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0278 }
            r2.<init>()     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r1 = r3.A01     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = r3.A02     // Catch:{ JSONException -> 0x0278 }
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = r3.A00     // Catch:{ JSONException -> 0x0278 }
            r2.put(r10, r0)     // Catch:{ JSONException -> 0x0278 }
            r5.put(r2)     // Catch:{ JSONException -> 0x0278 }
            goto L_0x007c
        L_0x00a2:
            java.lang.String r0 = "items"
            r6.put(r0, r5)     // Catch:{ JSONException -> 0x0278 }
            r8.put(r6)     // Catch:{ JSONException -> 0x0278 }
            goto L_0x005b
        L_0x00ab:
            r7.put(r9, r8)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r6 = "product_info"
            X.1lU r8 = r13.A04     // Catch:{ JSONException -> 0x0278 }
            if (r8 != 0) goto L_0x00b7
            r5 = 0
            goto L_0x0147
        L_0x00b7:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0278 }
            r5.<init>()     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0278 }
            r10.<init>()     // Catch:{ JSONException -> 0x0278 }
            java.util.List r0 = r8.A02     // Catch:{ JSONException -> 0x0278 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x0278 }
        L_0x00c7:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0278 }
            if (r0 == 0) goto L_0x010f
            java.lang.Object r2 = r12.next()     // Catch:{ JSONException -> 0x0278 }
            X.1lR r2 = (X.C35141lR) r2     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0278 }
            r11.<init>()     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r1 = r2.A00     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "product_sections_title"
            r11.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0278 }
            r9.<init>()     // Catch:{ JSONException -> 0x0278 }
            java.util.List r0 = r2.A01     // Catch:{ JSONException -> 0x0278 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ JSONException -> 0x0278 }
        L_0x00ea:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x0278 }
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r3.next()     // Catch:{ JSONException -> 0x0278 }
            X.1lT r0 = (X.C35161lT) r0     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0278 }
            r2.<init>()     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "product_id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            r9.put(r2)     // Catch:{ JSONException -> 0x0278 }
            goto L_0x00ea
        L_0x0106:
            java.lang.String r0 = "product_section_products"
            r11.put(r0, r9)     // Catch:{ JSONException -> 0x0278 }
            r10.put(r11)     // Catch:{ JSONException -> 0x0278 }
            goto L_0x00c7
        L_0x010f:
            java.lang.String r0 = "product_sections"
            r5.put(r0, r10)     // Catch:{ JSONException -> 0x0278 }
            com.whatsapp.jid.UserJid r0 = r8.A00     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "business_owner_jid"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0278 }
            r3.<init>()     // Catch:{ JSONException -> 0x0278 }
            X.1lS r2 = r8.A01     // Catch:{ JSONException -> 0x0278 }
            byte[] r1 = r2.A02     // Catch:{ JSONException -> 0x0278 }
            if (r1 == 0) goto L_0x0134
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "product_header_info_thumb"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x0134:
            java.lang.String r1 = r2.A01     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "product_header_info_id"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            boolean r1 = r2.A00     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "product_header_is_rejected"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "product_header_info"
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x0278 }
        L_0x0147:
            r7.put(r6, r5)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r3 = "checkout_info"
            X.1lc r5 = r13.A01     // Catch:{ JSONException -> 0x0278 }
            if (r5 != 0) goto L_0x0153
            r2 = 0
            goto L_0x01f4
        L_0x0153:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0278 }
            r2.<init>()     // Catch:{ JSONException -> 0x0278 }
            byte[] r1 = r5.A0E     // Catch:{ JSONException -> 0x0278 }
            if (r1 == 0) goto L_0x0167
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "thumb"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x0167:
            java.lang.String r0 = r5.A0A     // Catch:{ JSONException -> 0x0278 }
            if (r0 == 0) goto L_0x016e
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x0278 }
        L_0x016e:
            X.1lY r0 = r5.A06     // Catch:{ JSONException -> 0x0278 }
            if (r0 == 0) goto L_0x017c
            org.json.JSONObject r1 = X.C39811t6.A02(r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "total_amount"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x017c:
            java.lang.String r1 = r5.A09     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "reference_id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            X.1Vz r0 = r5.A04     // Catch:{ JSONException -> 0x0278 }
            if (r0 == 0) goto L_0x0190
            X.1m1 r0 = (X.C35491m1) r0     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r1 = r0.A04     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "currency"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x0190:
            java.lang.String r1 = r5.A07     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "payment_configuration"
            if (r1 == 0) goto L_0x0199
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x0199:
            java.lang.String r1 = r5.A08     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "payment_type"
            if (r1 == 0) goto L_0x01a2
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x01a2:
            java.lang.String r1 = r5.A03     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "transaction_id"
            if (r1 == 0) goto L_0x01ac
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x01ac:
            java.lang.String r1 = r5.A01     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "payment_method"
            if (r1 == 0) goto L_0x01b5
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x01b5:
            java.lang.String r1 = r5.A02     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "payment_status"
            if (r1 == 0) goto L_0x01be
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x01be:
            long r0 = r5.A00     // Catch:{ JSONException -> 0x0278 }
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x01cb
            java.lang.String r4 = "payment_timestamp"
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x0278 }
        L_0x01cb:
            java.lang.String r1 = r5.A0B     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "type"
            if (r1 == 0) goto L_0x01d5
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x01d5:
            java.util.List r0 = r5.A0C     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONArray r1 = X.C39811t6.A00(r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "external_payment_configurations"
            if (r1 == 0) goto L_0x01e2
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x01e2:
            X.1lZ r0 = r5.A05     // Catch:{ JSONException -> 0x0278 }
            org.json.JSONObject r1 = X.C39811t6.A01(r0)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "order"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
            boolean r1 = r5.A0D     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r0 = "is_interactive"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x01f4:
            r7.put(r3, r2)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r4 = "shops_info"
            X.1lQ r3 = r13.A05     // Catch:{ JSONException -> 0x0278 }
            r8 = 0
            if (r3 == 0) goto L_0x0221
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x021b }
            r2.<init>()     // Catch:{ JSONException -> 0x021b }
            java.lang.String r1 = "id"
            java.lang.String r0 = r3.A02     // Catch:{ JSONException -> 0x021b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x021b }
            java.lang.String r1 = "shop_surface"
            int r0 = r3.A00     // Catch:{ JSONException -> 0x021b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x021b }
            java.lang.String r1 = "message_version"
            int r0 = r3.A01     // Catch:{ JSONException -> 0x021b }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x021b }
            goto L_0x0222
        L_0x021b:
            r1 = move-exception
            java.lang.String r0 = "ShopInfoContentConverter/toJsonObject error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x0278 }
        L_0x0221:
            r2 = r8
        L_0x0222:
            r7.put(r4, r2)     // Catch:{ JSONException -> 0x0278 }
            java.lang.String r6 = "native_flow_content"
            X.1lW r0 = r13.A03     // Catch:{ JSONException -> 0x0278 }
            r10 = 0
            if (r0 == 0) goto L_0x0274
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026f }
            r8.<init>()     // Catch:{ JSONException -> 0x026f }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x026f }
            r9.<init>()     // Catch:{ JSONException -> 0x026f }
            java.util.List r0 = r0.A00     // Catch:{ JSONException -> 0x026f }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ JSONException -> 0x026f }
        L_0x023c:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x026f }
            if (r0 == 0) goto L_0x0269
            java.lang.Object r4 = r5.next()     // Catch:{ JSONException -> 0x026f }
            X.1lV r4 = (X.C35181lV) r4     // Catch:{ JSONException -> 0x026f }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026f }
            r3.<init>()     // Catch:{ JSONException -> 0x026f }
            java.lang.String r1 = "name"
            X.1lK r2 = r4.A01     // Catch:{ JSONException -> 0x026f }
            java.lang.String r0 = r2.A00     // Catch:{ JSONException -> 0x026f }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x026f }
            java.lang.String r1 = "params"
            java.lang.String r0 = r2.A01     // Catch:{ JSONException -> 0x026f }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x026f }
            java.lang.String r1 = "selected"
            boolean r0 = r4.A00     // Catch:{ JSONException -> 0x026f }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x026f }
            r9.put(r3)     // Catch:{ JSONException -> 0x026f }
            goto L_0x023c
        L_0x0269:
            java.lang.String r0 = "buttons"
            r8.put(r0, r9)     // Catch:{ JSONException -> 0x026f }
            goto L_0x0274
        L_0x026f:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x0278 }
            r8 = r10
        L_0x0274:
            r7.put(r6, r8)     // Catch:{ JSONException -> 0x0278 }
            goto L_0x027f
        L_0x0278:
            r1 = move-exception
            java.lang.String r0 = "InteractiveMessageConverter/toJSONObject/serialization error"
            com.whatsapp.util.Log.w(r0, r1)
            r7 = 0
        L_0x027f:
            if (r7 == 0) goto L_0x0286
            java.lang.String r0 = r7.toString()
            return r0
        L_0x0286:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17610vM.A03(X.0tn):java.lang.String");
    }

    public int A04(C16880tn r7) {
        if (r7 == null) {
            return 0;
        }
        int i2 = r7.A00;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2 || i2 == 6) {
            return 3;
        }
        if (i2 == 3) {
            C35251lc r0 = r7.A01;
            return (r0 == null || r0.A05.A08.isEmpty()) ? 7 : 4;
        } else if (i2 != 4) {
            return i2 != 5 ? 0 : 6;
        } else {
            return 5;
        }
    }

    public final int A05(C39041rp r4) {
        C35101lN r0 = r4.A00;
        if (r0 != null) {
            int i2 = r0.A04;
            if (i2 != 1) {
                return i2 != 2 ? 0 : 8;
            }
            return 1;
        }
    }

    public final ContentValues A06(C39041rp r9) {
        String str;
        JSONObject jSONObject;
        ContentValues contentValues = new ContentValues();
        C35101lN r2 = r9.A00;
        if (r2 != null) {
            int A05 = A05(r9);
            contentValues.put("element_type", Integer.valueOf(A05));
            String str2 = r2.A03;
            contentValues.put("reply_values", str2);
            if (A05 == 8) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(FacebookFacade.RequestParameter.DESCRIPTION, str2);
                    jSONObject2.put("footer_text", r2.A01);
                    jSONObject2.put("response_message_type", r2.A04);
                    C35091lM r3 = r2.A00;
                    if (r3 == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put("native_flow_response_name", r3.A00);
                        jSONObject.put("native_flow_response_params_json", r3.A01);
                    }
                    jSONObject2.put("native_flow_response_content", jSONObject);
                } catch (JSONException e2) {
                    Log.w("InteractiveResponseMessageConverter/toJSONObject/serialization error", e2);
                    jSONObject2 = null;
                }
                str = jSONObject2 != null ? jSONObject2.toString() : null;
            } else {
                str = r2.A01;
            }
            contentValues.put("reply_description", str);
        }
        return contentValues;
    }

    public final void A07(ContentValues contentValues, String str, int i2, long j2) {
        C16800tf A022 = this.A00.A02();
        try {
            C16810tg r4 = A022.A02;
            if (r4.A00(str, contentValues, "element_type = ? AND message_row_id = ?", new String[]{String.valueOf(i2), String.valueOf(j2)}) == 0) {
                r4.A02(contentValues, str);
            }
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00cc */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x00c4=Splitter:B:32:0x00c4, B:37:0x00cc=Splitter:B:37:0x00cc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C16740tZ r19, java.lang.String r20, long r21) {
        /*
            r18 = this;
            r0 = r18
            X.0tq r0 = r0.A00
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x00d1 }
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00d1 }
            r7 = 0
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x00d1 }
            r1[r7] = r0     // Catch:{ all -> 0x00d1 }
            r0 = r20
            android.database.Cursor r4 = r2.A08(r0, r1)     // Catch:{ all -> 0x00d1 }
            if (r4 == 0) goto L_0x00cd
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "element_type"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c8 }
            int r1 = r4.getInt(r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "element_content"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = r4.getString(r0)     // Catch:{ all -> 0x00c8 }
            r0 = 2
            if (r1 != r0) goto L_0x00c4
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00c8 }
            r11 = 0
            if (r0 != 0) goto L_0x00c4
            X.AnonymousClass00B.A06(r2)     // Catch:{ JSONException -> 0x00be }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00be }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x00be }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00be }
            r5.<init>()     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "buttons"
            org.json.JSONArray r6 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x00be }
            if (r6 == 0) goto L_0x00a7
            r2 = 0
        L_0x0056:
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00be }
            if (r2 >= r0) goto L_0x00a7
            org.json.JSONObject r8 = r6.getJSONObject(r2)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "native_flow_info"
            org.json.JSONObject r10 = r8.optJSONObject(r0)     // Catch:{ JSONException -> 0x00be }
            if (r10 == 0) goto L_0x0078
            java.lang.String r0 = "name"
            java.lang.String r9 = r10.getString(r0)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r10.optJSONObject(r0)     // Catch:{ JSONException -> 0x00be }
            if (r0 != 0) goto L_0x007a
            r0 = r11
            goto L_0x007e
        L_0x0078:
            r13 = r11
            goto L_0x0083
        L_0x007a:
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00be }
        L_0x007e:
            X.1lK r13 = new X.1lK     // Catch:{ JSONException -> 0x00be }
            r13.<init>(r9, r0)     // Catch:{ JSONException -> 0x00be }
        L_0x0083:
            java.lang.String r0 = "id"
            java.lang.String r14 = r8.optString(r0)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "displayText"
            java.lang.String r15 = r8.optString(r0)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "selected"
            boolean r17 = r8.optBoolean(r0)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "button_type"
            int r16 = r8.optInt(r0, r7)     // Catch:{ JSONException -> 0x00be }
            X.1t7 r12 = new X.1t7     // Catch:{ JSONException -> 0x00be }
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ JSONException -> 0x00be }
            r5.add(r12)     // Catch:{ JSONException -> 0x00be }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x00a7:
            java.lang.String r0 = "content"
            java.lang.String r2 = r1.optString(r0)     // Catch:{ JSONException -> 0x00be }
            java.lang.String r0 = "footer"
            java.lang.String r1 = r1.optString(r0)     // Catch:{ JSONException -> 0x00be }
            X.1sB r0 = new X.1sB     // Catch:{ JSONException -> 0x00be }
            r0.<init>(r2, r1, r5)     // Catch:{ JSONException -> 0x00be }
            r1 = r19
            r1.A0f(r0)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c4
        L_0x00be:
            r1 = move-exception
            java.lang.String r0 = "ButtonsConverter/parseJSON/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00c8 }
        L_0x00c4:
            r4.close()     // Catch:{ all -> 0x00d1 }
            goto L_0x00cd
        L_0x00c8:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00cd:
            r3.close()
            return
        L_0x00d1:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17610vM.A08(X.0tZ, java.lang.String, long):void");
    }

    public final void A09(C39261sB r14, String str, long j2) {
        String str2;
        if (r14 != null) {
            ContentValues contentValues = new ContentValues();
            long j3 = j2;
            contentValues.put("message_row_id", Long.valueOf(j3));
            contentValues.put("element_type", 2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("content", r14.A00);
                jSONObject.put("footer", r14.A01);
                JSONArray jSONArray = new JSONArray();
                for (C39821t7 r2 : r14.A02) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", r2.A04);
                    String str3 = r2.A03;
                    if (str3 != null) {
                        jSONObject2.put("displayText", str3);
                    }
                    jSONObject2.put("selected", r2.A00);
                    jSONObject2.put("button_type", r2.A01);
                    C35071lK r22 = r2.A02;
                    if (r22 != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(FacebookFacade.RequestParameter.NAME, r22.A00);
                        String str4 = r22.A01;
                        if (str4 != null && str4.length() > 0) {
                            jSONObject3.put("params", new JSONObject(str4));
                        }
                        jSONObject2.put("native_flow_info", jSONObject3);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("buttons", jSONArray);
                str2 = jSONObject.toString();
            } catch (JSONException e2) {
                Log.w("ButtonsConverter/toJSONObject/serialization error", e2);
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                contentValues.put("element_content", str2);
            }
            A07(contentValues, str, 2, j3);
        }
    }

    public void A0A(C39051rq r8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("element_type", 2);
        contentValues.put("reply_values", r8.A0I());
        contentValues.put("reply_description", r8.A00);
        contentValues.put("message_row_id", Long.valueOf(r8.A13));
        A07(contentValues, "message_ui_elements_reply", 2, r8.A13);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0056=Splitter:B:11:0x0056, B:16:0x005e=Splitter:B:16:0x005e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C39051rq r8, java.lang.String r9) {
        /*
            r7 = this;
            long r3 = r8.A13
            r6 = 1
            r5 = 0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.String r0 = "MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r8.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            java.lang.String[] r2 = new java.lang.String[r6]
            long r0 = r8.A13
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r5] = r0
            X.0tq r0 = r7.A00
            X.0tf r3 = r0.get()
            X.0tg r0 = r3.A02     // Catch:{ all -> 0x0063 }
            android.database.Cursor r2 = r0.A08(r9, r2)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x005f
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "reply_values"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "reply_description"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x005a }
            r8.A0k(r1)     // Catch:{ all -> 0x005a }
            r8.A00 = r0     // Catch:{ all -> 0x005a }
        L_0x0056:
            r2.close()     // Catch:{ all -> 0x0063 }
            goto L_0x005f
        L_0x005a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x005f:
            r3.close()
            return
        L_0x0063:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17610vM.A0B(X.1rq, java.lang.String):void");
    }

    public final void A0C(C39051rq r8, String str, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("element_type", 2);
        contentValues.put("reply_values", r8.A0I());
        contentValues.put("reply_description", r8.A00);
        contentValues.put("message_row_id", Long.valueOf(j2));
        A07(contentValues, str, 2, j2);
    }

    public void A0D(C39041rp r9) {
        ContentValues A06 = A06(r9);
        A06.put("message_row_id", Long.valueOf(r9.A13));
        A07(A06, "message_ui_elements_reply", A05(r9), r9.A13);
    }

    public void A0E(C39041rp r9, long j2) {
        ContentValues A06 = A06(r9);
        A06.put("message_row_id", Long.valueOf(j2));
        A07(A06, "message_quoted_ui_elements_reply", A05(r9), j2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00bb */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x00b3=Splitter:B:33:0x00b3, B:38:0x00bb=Splitter:B:38:0x00bb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C39041rp r9, java.lang.String r10) {
        /*
            r8 = this;
            long r1 = r9.A13
            r6 = 1
            r5 = 0
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.String r0 = "MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r9.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            java.lang.String[] r3 = new java.lang.String[r6]
            long r0 = r9.A13
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r5] = r0
            X.0tq r0 = r8.A00
            X.0tf r2 = r0.get()
            X.0tg r0 = r2.A02     // Catch:{ all -> 0x00c0 }
            android.database.Cursor r4 = r0.A08(r10, r3)     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x00bc
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "element_type"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
            int r3 = r4.getInt(r0)     // Catch:{ all -> 0x00b7 }
            r1 = 1
            if (r3 == r6) goto L_0x0050
            r0 = 8
            r6 = 0
            if (r3 != r0) goto L_0x0050
            r6 = 2
        L_0x0050:
            java.lang.String r0 = "reply_description"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r5 = r4.getString(r0)     // Catch:{ all -> 0x00b7 }
            if (r1 == r6) goto L_0x00a1
            if (r6 == 0) goto L_0x00a1
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00b7 }
            r7 = 0
            if (r0 != 0) goto L_0x00b3
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r3.<init>(r5)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r0 = "response_message_type"
            int r1 = r3.optInt(r0)     // Catch:{ JSONException -> 0x009a }
            r0 = 2
            if (r0 != r1) goto L_0x00b3
            java.lang.String r0 = "description"
            java.lang.String r6 = ""
            java.lang.String r5 = r3.optString(r0, r6)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r0 = "native_flow_response_content"
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x009a }
            if (r3 == 0) goto L_0x0094
            java.lang.String r0 = "native_flow_response_name"
            java.lang.String r1 = r3.optString(r0, r6)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r0 = "native_flow_response_params_json"
            java.lang.String r0 = r3.optString(r0, r6)     // Catch:{ JSONException -> 0x009a }
            X.1lM r7 = new X.1lM     // Catch:{ JSONException -> 0x009a }
            r7.<init>(r1, r0)     // Catch:{ JSONException -> 0x009a }
        L_0x0094:
            X.1lN r3 = new X.1lN     // Catch:{ JSONException -> 0x009a }
            r3.<init>(r7, r5)     // Catch:{ JSONException -> 0x009a }
            goto L_0x00b1
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "InteractiveResponseMessageConverter/parseJSON/deserialization error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x00b3
        L_0x00a1:
            java.lang.String r0 = "reply_values"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = r4.getString(r0)     // Catch:{ all -> 0x00b7 }
            r0 = 0
            X.1lN r3 = new X.1lN     // Catch:{ all -> 0x00b7 }
            r3.<init>(r1, r5, r0, r6)     // Catch:{ all -> 0x00b7 }
        L_0x00b1:
            r9.A00 = r3     // Catch:{ all -> 0x00b7 }
        L_0x00b3:
            r4.close()     // Catch:{ all -> 0x00c0 }
            goto L_0x00bc
        L_0x00b7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00bc:
            r2.close()
            return
        L_0x00c0:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17610vM.A0F(X.1rp, java.lang.String):void");
    }

    public void A0G(C16840tj r9, long j2) {
        if (r9.AAt() != null) {
            ContentValues contentValues = new ContentValues();
            long j3 = j2;
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("element_type", Integer.valueOf(A04(r9.AAt())));
            String A03 = A03(r9.AAt());
            if (!TextUtils.isEmpty(A03)) {
                contentValues.put("element_content", A03);
            }
            A07(contentValues, "message_ui_elements", A04(r9.AAt()), j3);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C16840tj r10, long r11) {
        /*
            r9 = this;
            X.0tn r0 = r10.AAt()
            if (r0 == 0) goto L_0x0068
            r3 = r9
            X.0tq r0 = r9.A00     // Catch:{ SQLiteConstraintException -> 0x0056 }
            X.0tf r2 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x0056 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "message_row_id"
            r7 = r11
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0051 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "element_type"
            X.0tn r0 = r10.AAt()     // Catch:{ all -> 0x0051 }
            int r0 = r9.A04(r0)     // Catch:{ all -> 0x0051 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0051 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0051 }
            X.0tn r0 = r10.AAt()     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = A03(r0)     // Catch:{ all -> 0x0051 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "element_content"
            r4.put(r0, r1)     // Catch:{ all -> 0x0051 }
        L_0x0040:
            java.lang.String r5 = "message_quoted_ui_elements"
            X.0tn r0 = r10.AAt()     // Catch:{ all -> 0x0051 }
            int r6 = r9.A04(r0)     // Catch:{ all -> 0x0051 }
            r3.A07(r4, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            r2.close()     // Catch:{ SQLiteConstraintException -> 0x0056 }
            return
        L_0x0051:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            java.lang.String r1 = "MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage/fail to insert. Error quotedMessage is: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17610vM.A0H(X.0tj, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0274 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:96:0x0274=Splitter:B:96:0x0274, B:91:0x026c=Splitter:B:91:0x026c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.C16840tj r30, java.lang.String r31, long r32) {
        /*
            r29 = this;
            r4 = r29
            X.0tq r0 = r4.A00
            X.0tf r19 = r0.get()
            r0 = r19
            X.0tg r2 = r0.A02     // Catch:{ all -> 0x0279 }
            r5 = 1
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x0279 }
            r11 = 0
            java.lang.String r0 = java.lang.String.valueOf(r32)     // Catch:{ all -> 0x0279 }
            r1[r11] = r0     // Catch:{ all -> 0x0279 }
            r0 = r31
            android.database.Cursor r0 = r2.A08(r0, r1)     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0275
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0270 }
            if (r1 == 0) goto L_0x026c
            java.lang.String r1 = "element_type"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0270 }
            int r3 = r0.getInt(r1)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = "element_content"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = r0.getString(r1)     // Catch:{ all -> 0x0270 }
            if (r3 == r5) goto L_0x0049
            r1 = 3
            if (r3 == r1) goto L_0x0049
            r1 = 4
            if (r3 == r1) goto L_0x0049
            r1 = 7
            if (r3 == r1) goto L_0x0049
            r1 = 5
            if (r3 == r1) goto L_0x0049
            r1 = 6
            if (r3 != r1) goto L_0x026c
        L_0x0049:
            X.173 r1 = r4.A01     // Catch:{ all -> 0x0270 }
            r20 = r1
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0270 }
            r4 = 0
            if (r1 != 0) goto L_0x026c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0266 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r7 = "selectListType"
            int r15 = r3.optInt(r7)     // Catch:{ JSONException -> 0x0266 }
            r1 = 5
            if (r15 != r1) goto L_0x008c
            java.lang.String r1 = "native_flow_content"
            java.lang.String r1 = r3.getString(r1)     // Catch:{ JSONException -> 0x0266 }
            X.1lW r8 = A02(r1)     // Catch:{ JSONException -> 0x0266 }
            if (r8 == 0) goto L_0x026c
            X.1lX r7 = A01(r3)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "description"
            java.lang.String r9 = r3.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "footerText"
            java.lang.String r10 = r3.optString(r1, r4)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "buttonText"
            java.lang.String r11 = r3.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            X.0tn r6 = new X.0tn     // Catch:{ JSONException -> 0x0266 }
            r6.<init>((X.C35201lX) r7, (X.C35191lW) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11)     // Catch:{ JSONException -> 0x0266 }
            goto L_0x0260
        L_0x008c:
            r6 = 4
            if (r15 != r6) goto L_0x00ef
            java.lang.String r1 = "shops_info"
            java.lang.String r2 = r3.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0266 }
            if (r1 != 0) goto L_0x026c
            X.AnonymousClass00B.A06(r2)     // Catch:{ JSONException -> 0x00e7 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e7 }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r1 = "id"
            java.lang.String r4 = r5.optString(r1)     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r1 = "shop_surface"
            int r2 = r5.optInt(r1)     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r1 = "message_version"
            int r1 = r5.optInt(r1)     // Catch:{ JSONException -> 0x00e7 }
            X.1lQ r5 = new X.1lQ     // Catch:{ JSONException -> 0x00e7 }
            r5.<init>(r2, r4, r1)     // Catch:{ JSONException -> 0x00e7 }
            int r4 = r3.getInt(r7)     // Catch:{ JSONException -> 0x0266 }
            X.1lX r2 = A01(r3)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "description"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            if (r4 != r6) goto L_0x00d3
            X.0tn r6 = new X.0tn     // Catch:{ JSONException -> 0x0266 }
            r6.<init>(r2, r5, r1)     // Catch:{ JSONException -> 0x0266 }
            goto L_0x0260
        L_0x00d3:
            java.lang.String r2 = "Not a shop content: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0266 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0266 }
            r1.append(r4)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r2 = r1.toString()     // Catch:{ JSONException -> 0x0266 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0266 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0266 }
            throw r1     // Catch:{ JSONException -> 0x0266 }
        L_0x00e7:
            r2 = move-exception
            java.lang.String r1 = "ShopInfoContentConverter/parseJSON error"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ JSONException -> 0x0266 }
            goto L_0x026c
        L_0x00ef:
            r2 = 3
            java.lang.String r18 = "checkout_info"
            java.lang.String r1 = "footerText"
            java.lang.String r9 = "description"
            if (r15 != r2) goto L_0x0124
            X.1lX r8 = A01(r3)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r10 = r3.optString(r9)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r11 = r3.optString(r1, r4)     // Catch:{ JSONException -> 0x0266 }
            r1 = r18
            org.json.JSONObject r2 = r3.optJSONObject(r1)     // Catch:{ JSONException -> 0x0266 }
            r1 = r20
            X.1lc r7 = A00(r1, r2)     // Catch:{ JSONException -> 0x0266 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "native_flow_content"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            X.1lW r9 = A02(r1)     // Catch:{ JSONException -> 0x0266 }
            X.0tn r6 = new X.0tn     // Catch:{ JSONException -> 0x0266 }
            r6.<init>((X.C35251lc) r7, (X.C35201lX) r8, (X.C35191lW) r9, (java.lang.String) r10, (java.lang.String) r11)     // Catch:{ JSONException -> 0x0266 }
            goto L_0x0260
        L_0x0124:
            X.1lX r22 = A01(r3)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r24 = r3.optString(r9)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r25 = r3.optString(r1, r4)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "buttonText"
            java.lang.String r26 = r3.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "sections"
            org.json.JSONArray r10 = r3.optJSONArray(r1)     // Catch:{ JSONException -> 0x0266 }
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0266 }
            r17.<init>()     // Catch:{ JSONException -> 0x0266 }
            if (r10 == 0) goto L_0x0196
            r8 = 0
        L_0x0145:
            int r1 = r10.length()     // Catch:{ JSONException -> 0x0266 }
            if (r8 >= r1) goto L_0x0196
            org.json.JSONObject r2 = r10.getJSONObject(r8)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "items"
            org.json.JSONArray r7 = r2.optJSONArray(r1)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r6 = "title"
            java.lang.String r16 = r2.optString(r6)     // Catch:{ JSONException -> 0x0266 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0266 }
            r5.<init>()     // Catch:{ JSONException -> 0x0266 }
            if (r7 == 0) goto L_0x0187
            r2 = 0
        L_0x0164:
            int r1 = r7.length()     // Catch:{ JSONException -> 0x0266 }
            if (r2 >= r1) goto L_0x0187
            org.json.JSONObject r1 = r7.getJSONObject(r2)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r12 = "id"
            java.lang.String r14 = r1.optString(r12)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r13 = r1.optString(r6)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r12 = r1.optString(r9)     // Catch:{ JSONException -> 0x0266 }
            X.1lO r1 = new X.1lO     // Catch:{ JSONException -> 0x0266 }
            r1.<init>(r14, r13, r12)     // Catch:{ JSONException -> 0x0266 }
            r5.add(r1)     // Catch:{ JSONException -> 0x0266 }
            int r2 = r2 + 1
            goto L_0x0164
        L_0x0187:
            X.1lP r2 = new X.1lP     // Catch:{ JSONException -> 0x0266 }
            r1 = r16
            r2.<init>(r1, r5)     // Catch:{ JSONException -> 0x0266 }
            r1 = r17
            r1.add(r2)     // Catch:{ JSONException -> 0x0266 }
            int r8 = r8 + 1
            goto L_0x0145
        L_0x0196:
            java.lang.String r1 = "product_info"
            org.json.JSONObject r10 = r3.optJSONObject(r1)     // Catch:{ JSONException -> 0x0266 }
            r13 = 0
            if (r10 == 0) goto L_0x023e
            java.lang.String r1 = "business_owner_jid"
            java.lang.String r6 = r10.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            com.whatsapp.jid.UserJid r16 = com.whatsapp.jid.UserJid.get(r6)     // Catch:{ 1W4 -> 0x01fb }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0266 }
            r12.<init>()     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "product_sections"
            org.json.JSONArray r9 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x0266 }
            if (r9 == 0) goto L_0x020e
            r8 = 0
        L_0x01b7:
            int r1 = r9.length()     // Catch:{ JSONException -> 0x0266 }
            if (r8 >= r1) goto L_0x020e
            org.json.JSONObject r7 = r9.optJSONObject(r8)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "product_section_products"
            org.json.JSONArray r6 = r7.optJSONArray(r1)     // Catch:{ JSONException -> 0x0266 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0266 }
            r5.<init>()     // Catch:{ JSONException -> 0x0266 }
            if (r6 == 0) goto L_0x01ea
            r2 = 0
        L_0x01cf:
            int r1 = r6.length()     // Catch:{ JSONException -> 0x0266 }
            if (r2 >= r1) goto L_0x01ea
            org.json.JSONObject r14 = r6.optJSONObject(r2)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "product_id"
            java.lang.String r14 = r14.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            X.1lT r1 = new X.1lT     // Catch:{ JSONException -> 0x0266 }
            r1.<init>((java.lang.String) r14)     // Catch:{ JSONException -> 0x0266 }
            r5.add(r1)     // Catch:{ JSONException -> 0x0266 }
            int r2 = r2 + 1
            goto L_0x01cf
        L_0x01ea:
            java.lang.String r1 = "product_sections_title"
            java.lang.String r2 = r7.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            X.1lR r1 = new X.1lR     // Catch:{ JSONException -> 0x0266 }
            r1.<init>(r2, r5)     // Catch:{ JSONException -> 0x0266 }
            r12.add(r1)     // Catch:{ JSONException -> 0x0266 }
            int r8 = r8 + 1
            goto L_0x01b7
        L_0x01fb:
            r5 = move-exception
            java.lang.String r2 = "MultiElementConverter/parseProductListInfo/Invalid jid: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0266 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0266 }
            r1.append(r6)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0266 }
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ JSONException -> 0x0266 }
            goto L_0x023e
        L_0x020e:
            java.lang.String r1 = "product_header_info"
            org.json.JSONObject r2 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x0266 }
            if (r2 == 0) goto L_0x0258
            java.lang.String r1 = "product_header_info_thumb"
            java.lang.String r4 = r2.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0266 }
            if (r1 != 0) goto L_0x0226
            byte[] r13 = android.util.Base64.decode(r4, r11)     // Catch:{ JSONException -> 0x0266 }
        L_0x0226:
            java.lang.String r1 = "product_header_info_id"
            java.lang.String r4 = r2.optString(r1)     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "product_header_is_rejected"
            boolean r1 = r2.optBoolean(r1, r11)     // Catch:{ JSONException -> 0x0266 }
            X.1lS r2 = new X.1lS     // Catch:{ JSONException -> 0x0266 }
            r2.<init>(r4, r13, r1)     // Catch:{ JSONException -> 0x0266 }
        L_0x0237:
            X.1lU r4 = new X.1lU     // Catch:{ JSONException -> 0x0266 }
            r1 = r16
            r4.<init>(r1, r2, r12)     // Catch:{ JSONException -> 0x0266 }
        L_0x023e:
            r1 = r18
            org.json.JSONObject r2 = r3.optJSONObject(r1)     // Catch:{ JSONException -> 0x0266 }
            r1 = r20
            X.1lc r21 = A00(r1, r2)     // Catch:{ JSONException -> 0x0266 }
            X.0tn r6 = new X.0tn     // Catch:{ JSONException -> 0x0266 }
            r23 = r4
            r27 = r17
            r28 = r15
            r20 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ JSONException -> 0x0266 }
            goto L_0x0260
        L_0x0258:
            java.lang.String r1 = ""
            X.1lS r2 = new X.1lS     // Catch:{ JSONException -> 0x0266 }
            r2.<init>(r1, r4, r11)     // Catch:{ JSONException -> 0x0266 }
            goto L_0x0237
        L_0x0260:
            r1 = r30
            r1.Adh(r6)     // Catch:{ all -> 0x0270 }
            goto L_0x026c
        L_0x0266:
            r2 = move-exception
            java.lang.String r1 = "MultiElementConverter/parseJSON/deserialization error"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ all -> 0x0270 }
        L_0x026c:
            r0.close()     // Catch:{ all -> 0x0279 }
            goto L_0x0275
        L_0x0270:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0274 }
        L_0x0274:
            throw r1     // Catch:{ all -> 0x0279 }
        L_0x0275:
            r19.close()
            return
        L_0x0279:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x027d }
        L_0x027d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17610vM.A0I(X.0tj, java.lang.String, long):void");
    }
}
