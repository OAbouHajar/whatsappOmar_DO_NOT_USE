package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1KC  reason: invalid class name */
public abstract class AnonymousClass1KC implements AnonymousClass1KD {
    public String A00 = "";
    public final long A01;
    public final C17130ua A02;
    public final C15860rz A03;
    public final C14710pd A04;
    public final AnonymousClass168 A05;
    public final AnonymousClass01D A06;
    public final String A07;
    public final Map A08;
    public final AnonymousClass01J A09;
    public final AnonymousClass01J A0A;

    public AnonymousClass1KC(C17130ua r2, C15860rz r3, C14710pd r4, AnonymousClass168 r5, AnonymousClass01D r6, String str, Map map, AnonymousClass01J r9, AnonymousClass01J r10, long j2) {
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = r6;
        this.A09 = r9;
        this.A0A = r10;
        this.A01 = j2;
        this.A07 = str;
        this.A08 = map;
        this.A05 = r5;
    }

    public String A00() {
        return null;
    }

    public String A01() {
        String str;
        if ((this instanceof AnonymousClass32O) || (this instanceof AnonymousClass32N)) {
            return "";
        }
        if (!(this instanceof AnonymousClass26V)) {
            return null;
        }
        AnonymousClass26V r0 = (AnonymousClass26V) this;
        C17660vR r1 = r0.A01;
        Map A032 = r0.A03();
        synchronized (r1) {
            str = r1.A03;
            if (str == null) {
                str = r1.A02(A032);
                r1.A03 = str;
            }
        }
        return str;
    }

    public String A02() {
        return Locale.getDefault().toString();
    }

    public Map A03() {
        HashMap hashMap = new HashMap();
        String A062 = this.A04.A06(C16620tM.A02, 2014);
        if (A062 != null) {
            try {
                JSONObject jSONObject = new JSONObject(A062);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        hashMap.put(jSONArray.getString(i2), next);
                    }
                }
            } catch (JSONException e2) {
                StringBuilder sb = new StringBuilder("GraphqlRequestBase/getLocaleFallbackMap/failed to parse locale fallback map from JSON/");
                sb.append(e2);
                Log.e(sb.toString());
                return hashMap;
            }
        }
        return hashMap;
    }

    public void A04(String str) {
        if (!str.startsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append("/");
            sb.append(str);
            str = sb.toString();
        }
        this.A00 = str;
    }

    public void A05(JSONObject jSONObject) {
        int indexOf;
        int indexOf2;
        if (this instanceof AnonymousClass32O) {
            AnonymousClass32O r5 = (AnonymousClass32O) this;
            JSONObject jSONObject2 = new JSONObject();
            String str = r5.A00;
            if (str.startsWith("AesKey=") && (indexOf = str.indexOf(";IV=")) > 0 && (indexOf2 = str.indexOf(";Data=")) > 0) {
                String substring = str.substring(7, indexOf);
                String substring2 = str.substring(indexOf + 4, indexOf2);
                String substring3 = str.substring(indexOf2 + 6);
                byte[] decode = Base64.decode(substring, 2);
                byte[] decode2 = Base64.decode(substring2, 2);
                byte[] decode3 = Base64.decode(substring3, 2);
                if (!(decode == null || decode2 == null || decode3 == null)) {
                    AnonymousClass22Y r3 = new AnonymousClass22Y(decode, decode3, decode2);
                    jSONObject2.put("encrypted_flow_data", Base64.encodeToString(r3.A00, 2));
                    jSONObject2.put("encrypted_aes_key", Base64.encodeToString(r3.A01, 2));
                    jSONObject2.put("initial_vector", Base64.encodeToString(r3.A02, 2));
                }
            }
            if (r5.A03.equals("1")) {
                jSONObject2.put("flow_data_endpoint", r5.A02);
            } else {
                try {
                    String str2 = r5.A01;
                    AnonymousClass00B.A06(str2);
                    jSONObject2.put("extension_id", Long.parseLong(str2));
                } catch (NumberFormatException e2) {
                    StringBuilder sb = new StringBuilder("ExtensionsDataExchangeGraphqlRequest/addVersionSpecificVariables: Exception when parsing extensionId:");
                    sb.append(r5.A01);
                    Log.w(sb.toString(), e2);
                }
            }
            jSONObject.put("variables", jSONObject2.toString());
        } else if (this instanceof AnonymousClass32N) {
            AnonymousClass32N r7 = (AnonymousClass32N) this;
            C18450wi.A0H(jSONObject, 0);
            JSONObject jSONObject3 = new JSONObject();
            C55222j6 r52 = r7.A00;
            jSONObject3.put("jid", r52.A00.getRawString());
            JSONArray jSONArray = new JSONArray();
            for (Object next : r52.A03) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("retailer_id", next);
                jSONArray.put(jSONObject4);
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("id", r7.A01);
            jSONObject3.put("catalog", jSONObject5);
            jSONObject3.put("products", jSONArray);
            jSONObject3.put("width", r52.A02);
            jSONObject3.put("height", r52.A01);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("product_list", jSONObject3);
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("request", jSONObject6);
            jSONObject.put("variables", jSONObject7);
        } else if (this instanceof AnonymousClass1KB) {
            AnonymousClass1KB r32 = (AnonymousClass1KB) this;
            JSONObject jSONObject8 = new JSONObject();
            String str3 = r32.A01;
            if (str3 != null) {
                jSONObject8.put("fbid", str3);
                Boolean bool = true;
                jSONObject8.put("stitch_images", bool.toString());
                String str4 = r32.A00;
                if (str4 != null) {
                    jSONObject8.put("ent_type", str4);
                }
                jSONObject.put("variables", jSONObject8);
                return;
            }
            throw new IllegalStateException("GraphqlRequest: fbId is required");
        } else if (this instanceof AnonymousClass2FG) {
            AnonymousClass2FG r33 = (AnonymousClass2FG) this;
            String str5 = r33.A01;
            if (str5 == null || str5.length() == 0) {
                throw new IllegalArgumentException("GetBanReportRequest: auth_token cannot be null. ");
            }
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("auth_token", Base64.encodeToString(str5.getBytes(), 2));
            jSONObject9.put("app_id", "com.obwhatsapp.w4b");
            jSONObject9.put("user_agent", r33.A00.A00());
            jSONObject9.put("version", "1");
            jSONObject.put("variables", jSONObject9);
        } else if (this instanceof AnonymousClass26V) {
            JSONObject jSONObject10 = new JSONObject();
            C448225r r53 = ((AnonymousClass26V) this).A04;
            jSONObject10.put("wa_business_jid", r53.A03.getRawString());
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("height", r53.A01);
            jSONObject11.put("width", r53.A02);
            JSONObject jSONObject12 = new JSONObject();
            jSONObject12.put("limit", 12);
            jSONObject12.put("image_dimensions", jSONObject11);
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("posts", jSONObject12);
            jSONObject10.put(r53.A00 == 0 ? "linked_fb_page" : "linked_ig_professional", jSONObject13);
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("request", jSONObject10);
            jSONObject.put("variables", jSONObject14);
        } else if (this instanceof C55262jA) {
            C55262jA r4 = (C55262jA) this;
            JSONObject jSONObject15 = new JSONObject();
            C55252j9 r54 = r4.A00;
            UserJid userJid = r54.A03;
            jSONObject15.put("biz_jid", userJid.getRawString());
            jSONObject15.put("id", r54.A05);
            jSONObject15.put("limit", r54.A01);
            jSONObject15.put("width", r54.A02);
            jSONObject15.put("height", r54.A00);
            jSONObject15.put("is_category", r54.A07);
            String str6 = r54.A06;
            if (str6 != null) {
                jSONObject15.put("catalog_session_id", str6);
            }
            String str7 = r54.A04;
            if (str7 != null) {
                jSONObject15.put("after", str7);
            }
            r4.A07(userJid, "collection", jSONObject, jSONObject15);
        } else if (this instanceof C55232j7) {
            C55232j7 r55 = (C55232j7) this;
            JSONObject jSONObject16 = new JSONObject();
            C55222j6 r8 = r55.A00;
            UserJid userJid2 = r8.A00;
            jSONObject16.put("jid", userJid2.getRawString());
            JSONArray jSONArray2 = new JSONArray();
            for (Object next2 : r8.A03) {
                JSONObject jSONObject17 = new JSONObject();
                jSONObject17.put("id", next2);
                jSONArray2.put(jSONObject17);
            }
            jSONObject16.put("products", jSONArray2);
            jSONObject16.put("width", r8.A02);
            jSONObject16.put("height", r8.A01);
            String str8 = r55.A01;
            if (str8 != null) {
                jSONObject16.put("catalog_session_id", str8);
            }
            r55.A07(userJid2, "product_list", jSONObject, jSONObject16);
        } else if (this instanceof AnonymousClass26T) {
            AnonymousClass26T r42 = (AnonymousClass26T) this;
            JSONObject jSONObject18 = new JSONObject();
            AnonymousClass26S r56 = r42.A00;
            UserJid userJid3 = r56.A00;
            jSONObject18.put("jid", userJid3.getRawString());
            jSONObject18.put("product_id", r56.A03);
            jSONObject18.put("width", String.valueOf(r56.A02));
            jSONObject18.put("height", String.valueOf(r56.A01));
            jSONObject18.put("catalog_session_id", r56.A04);
            if (r56.A05) {
                jSONObject18.put("fetch_compliance_info", "true");
            }
            r42.A07(userJid3, "product", jSONObject, jSONObject18);
        } else if (this instanceof AnonymousClass26P) {
            AnonymousClass26P r6 = (AnonymousClass26P) this;
            JSONObject jSONObject19 = new JSONObject();
            AnonymousClass26O r2 = r6.A01;
            UserJid userJid4 = r2.A05;
            jSONObject19.put("jid", userJid4.getRawString());
            jSONObject19.put("limit", String.valueOf(r2.A02));
            jSONObject19.put("width", String.valueOf(r2.A04));
            jSONObject19.put("height", String.valueOf(r2.A03));
            String str9 = r2.A06;
            if (str9 != null) {
                jSONObject19.put("after", str9);
            }
            String str10 = r2.A07;
            if (str10 != null) {
                jSONObject19.put("catalog_session_id", str10);
            }
            if (Boolean.TRUE.equals(r2.A01)) {
                jSONObject19.put("allow_shop_source", "ALLOWSHOPSOURCE_TRUE");
            }
            C84304Ka r34 = r2.A00;
            if (r34 != null) {
                JSONObject jSONObject20 = new JSONObject();
                jSONObject20.put("value", r34.A00);
                jSONObject20.put("version", r34.A01);
                jSONObject19.put("query", jSONObject20);
            }
            r6.A07(userJid4, "product_catalog", jSONObject, jSONObject19);
        } else if (this instanceof C59622yb) {
            C59622yb r43 = (C59622yb) this;
            JSONObject jSONObject21 = new JSONObject();
            AnonymousClass4O7 r57 = r43.A00;
            UserJid userJid5 = r57.A04;
            jSONObject21.put("biz_jid", userJid5.getRawString());
            jSONObject21.put("collection_limit", r57.A00);
            jSONObject21.put("item_limit", 3);
            jSONObject21.put("width", r57.A02);
            jSONObject21.put("height", r57.A01);
            String str11 = r57.A06;
            if (str11 != null) {
                jSONObject21.put("catalog_session_id", str11);
            }
            String str12 = r57.A05;
            if (str12 != null) {
                jSONObject21.put("after", str12);
            }
            r43.A07(userJid5, "collections", jSONObject, jSONObject21);
        } else {
            C59612ya r82 = (C59612ya) this;
            C86124Rh r9 = r82.A00;
            UserJid userJid6 = r9.A02;
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("width", r9.A01);
            jSONObject22.put("height", r9.A00);
            JSONObject jSONObject23 = new JSONObject();
            jSONObject23.put("biz_jid", userJid6.getRawString());
            jSONObject23.put("image_dimensions", jSONObject22);
            Set set = r9.A04;
            if (!set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set);
                JSONArray jSONArray3 = new JSONArray();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    JSONObject jSONObject24 = new JSONObject();
                    jSONObject24.put("category_id", arrayList.get(i2));
                    jSONArray3.put(jSONObject24);
                }
                jSONObject23.put("category_ids", jSONArray3);
            }
            jSONObject23.put("catalog_session_id", r9.A03);
            r82.A07(userJid6, "categories", jSONObject, jSONObject23);
        }
    }

    public boolean A06() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:82|83) */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r5.A00 = 1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0222 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00f6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0139 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x01d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x01e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Aah(X.C448025p r19) {
        /*
            r18 = this;
            r3 = r18
            java.lang.String r6 = r3.A00()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x001f
            X.0rz r0 = r3.A03
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "pref_graphql_domain"
            java.lang.String r0 = "whatsapp.com"
            java.lang.String r6 = r2.getString(r1, r0)
        L_0x001f:
            X.0pd r7 = r3.A04
            r0 = 549(0x225, float:7.7E-43)
            X.0tM r5 = X.C16620tM.A02
            boolean r0 = r7.A0E(r5, r0)
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x002f
            java.lang.String r4 = "?_emp=1"
        L_0x002f:
            r2 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0231 }
            r1.<init>()     // Catch:{ MalformedURLException -> 0x0231 }
            java.lang.String r0 = "https://graph."
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x0231 }
            r1.append(r6)     // Catch:{ MalformedURLException -> 0x0231 }
            java.lang.String r0 = "/graphql"
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x0231 }
            java.lang.String r0 = r3.A00     // Catch:{ MalformedURLException -> 0x0231 }
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x0231 }
            r1.append(r4)     // Catch:{ MalformedURLException -> 0x0231 }
            java.lang.String r0 = r1.toString()     // Catch:{ MalformedURLException -> 0x0231 }
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0231 }
            r6.<init>(r0)     // Catch:{ MalformedURLException -> 0x0231 }
            r0 = 539(0x21b, float:7.55E-43)
            boolean r17 = r7.A0E(r5, r0)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ IOException -> 0x022c }
            r7.<init>()     // Catch:{ IOException -> 0x022c }
            r3.A05(r7)     // Catch:{ IOException -> 0x022c }
            java.lang.String r1 = r3.A07     // Catch:{ IOException -> 0x022c }
            if (r1 != 0) goto L_0x0068
            java.lang.String r1 = "WA|1015890928915437|3201f239340c1c8ec6262a6dad04200e"
        L_0x0068:
            java.lang.String r0 = "access_token"
            r7.put(r0, r1)     // Catch:{ IOException -> 0x022c }
            long r0 = r3.A01     // Catch:{ IOException -> 0x022c }
            java.lang.String r4 = "doc_id"
            r7.put(r4, r0)     // Catch:{ IOException -> 0x022c }
            java.lang.String r5 = r3.A02()     // Catch:{ IOException -> 0x022c }
            java.lang.String r4 = "lang"
            r7.put(r4, r5)     // Catch:{ IOException -> 0x022c }
            java.lang.String r5 = "Content-Type"
            java.lang.String r4 = "application/json"
            r7.put(r5, r4)     // Catch:{ IOException -> 0x022c }
            java.lang.String r13 = r7.toString()     // Catch:{ IOException -> 0x022c }
            X.01D r4 = r3.A06     // Catch:{ IOException -> 0x022c }
            java.lang.Object r10 = r4.get()     // Catch:{ IOException -> 0x022c }
            X.0zG r10 = (X.C19950zG) r10     // Catch:{ IOException -> 0x022c }
            java.lang.String r12 = r6.toString()     // Catch:{ IOException -> 0x022c }
            java.lang.String r14 = r3.A01()     // Catch:{ IOException -> 0x022c }
            boolean r16 = r3.A06()     // Catch:{ IOException -> 0x022c }
            java.util.Map r15 = r3.A08     // Catch:{ IOException -> 0x022c }
            r4 = 15
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x022c }
            X.16H r10 = (X.AnonymousClass16H) r10     // Catch:{ IOException -> 0x022c }
            if (r14 != 0) goto L_0x00bb
            X.0vR r5 = r10.A01     // Catch:{ IOException -> 0x022c }
            monitor-enter(r5)     // Catch:{ IOException -> 0x022c }
            java.lang.String r14 = r5.A02     // Catch:{ all -> 0x00b7 }
            if (r14 != 0) goto L_0x00ba
            r4 = 0
            java.lang.String r14 = r5.A02(r4)     // Catch:{ all -> 0x00b7 }
            r5.A02 = r14     // Catch:{ all -> 0x00b7 }
            goto L_0x00ba
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x022c }
            throw r0     // Catch:{ IOException -> 0x022c }
        L_0x00ba:
            monitor-exit(r5)     // Catch:{ IOException -> 0x022c }
        L_0x00bb:
            X.1pl r8 = r10.A00(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x022c }
            java.lang.String r10 = r8.AAv()
            java.lang.String r7 = "unknown error: "
            r5 = 190(0xbe, float:2.66E-43)
            java.lang.String r9 = "error"
            r6 = 1
            if (r10 == 0) goto L_0x0143
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto L_0x0143
            java.lang.String r4 = "gzip"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x013a
            X.0ua r10 = r3.A02     // Catch:{ Exception -> 0x00f7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00f7 }
            java.io.InputStream r10 = r8.A9k(r10, r4, r11)     // Catch:{ Exception -> 0x00f7 }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x00f7 }
            r4.<init>(r10)     // Catch:{ Exception -> 0x00f7 }
            org.json.JSONObject r10 = X.C30311c8.A03(r4)     // Catch:{ all -> 0x00f2 }
            r4.close()     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0156
        L_0x00f2:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            throw r0     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            X.0ua r1 = r3.A02     // Catch:{ Exception -> 0x0236 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0236 }
            java.io.InputStream r0 = r8.A9j(r1, r0, r11)     // Catch:{ Exception -> 0x0236 }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x0236 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0236 }
            org.json.JSONObject r0 = X.C30311c8.A03(r4)     // Catch:{ all -> 0x0135 }
            org.json.JSONObject r0 = r0.getJSONObject(r9)     // Catch:{ all -> 0x0135 }
            X.1fg r3 = new X.1fg     // Catch:{ all -> 0x0135 }
            r3.<init>((org.json.JSONObject) r0)     // Catch:{ all -> 0x0135 }
            int r1 = r3.A01     // Catch:{ all -> 0x0135 }
            if (r1 == r5) goto L_0x0129
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r0.<init>()     // Catch:{ all -> 0x0135 }
            r0.append(r7)     // Catch:{ all -> 0x0135 }
            r0.append(r1)     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0135 }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0135 }
        L_0x0129:
            X.43b r0 = new X.43b     // Catch:{ all -> 0x0135 }
            r0.<init>(r3)     // Catch:{ all -> 0x0135 }
            r2.AQa(r0)     // Catch:{ all -> 0x0135 }
            r4.close()     // Catch:{ Exception -> 0x0236 }
            return
        L_0x0135:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0139 }
        L_0x0139:
            throw r0     // Catch:{ Exception -> 0x0236 }
        L_0x013a:
            java.lang.String r0 = "Unknown Content-Encoding sent by server"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r0)
            goto L_0x024b
        L_0x0143:
            X.0ua r10 = r3.A02     // Catch:{ Exception -> 0x01e1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e1 }
            java.io.InputStream r4 = r8.A9k(r10, r4, r11)     // Catch:{ Exception -> 0x01e1 }
            org.json.JSONObject r10 = X.C30311c8.A03(r4)     // Catch:{ all -> 0x01da }
            if (r4 == 0) goto L_0x0156
            r4.close()     // Catch:{ Exception -> 0x01e1 }
        L_0x0156:
            X.01J r4 = r3.A09
            java.lang.Object r4 = r4.get()
            X.14O r4 = (X.AnonymousClass14O) r4
            X.01J r3 = r3.A0A
            java.lang.Object r3 = r3.get()
            X.14R r3 = (X.AnonymousClass14R) r3
            X.2JT r5 = new X.2JT
            r5.<init>(r4, r3, r10)
            r5.A01 = r0
            java.lang.String r0 = "errors"
            org.json.JSONArray r8 = r10.optJSONArray(r0)     // Catch:{ JSONException -> 0x01d8 }
            if (r8 == 0) goto L_0x019e
            r5.A00 = r6     // Catch:{ JSONException -> 0x01d8 }
            X.14R r7 = r5.A03     // Catch:{ JSONException -> 0x01d8 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x01d8 }
            r0.<init>()     // Catch:{ JSONException -> 0x01d8 }
            r7.A00 = r0     // Catch:{ JSONException -> 0x01d8 }
            int r6 = r8.length()     // Catch:{ JSONException -> 0x01d8 }
            r4 = 0
        L_0x0185:
            if (r4 >= r6) goto L_0x01bf
            org.json.JSONObject r0 = r8.getJSONObject(r4)     // Catch:{ JSONException -> 0x01d8 }
            X.1fg r3 = new X.1fg     // Catch:{ JSONException -> 0x01d8 }
            r3.<init>((org.json.JSONObject) r0)     // Catch:{ JSONException -> 0x01d8 }
            java.util.Map r1 = r7.A00     // Catch:{ JSONException -> 0x01d8 }
            int r0 = r3.A01     // Catch:{ JSONException -> 0x01d8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x01d8 }
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x01d8 }
            int r4 = r4 + 1
            goto L_0x0185
        L_0x019e:
            org.json.JSONObject r4 = r10.optJSONObject(r9)     // Catch:{ JSONException -> 0x01d8 }
            if (r4 == 0) goto L_0x01c3
            r5.A00 = r6     // Catch:{ JSONException -> 0x01d8 }
            X.14R r1 = r5.A03     // Catch:{ JSONException -> 0x01d8 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x01d8 }
            r0.<init>()     // Catch:{ JSONException -> 0x01d8 }
            r1.A00 = r0     // Catch:{ JSONException -> 0x01d8 }
            X.1fg r3 = new X.1fg     // Catch:{ JSONException -> 0x01d8 }
            r3.<init>((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x01d8 }
            java.util.Map r1 = r1.A00     // Catch:{ JSONException -> 0x01d8 }
            int r0 = r3.A01     // Catch:{ JSONException -> 0x01d8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x01d8 }
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x01d8 }
        L_0x01bf:
            r2.A5s(r5)     // Catch:{ JSONException -> 0x01d8 }
            goto L_0x01d7
        L_0x01c3:
            java.lang.String r0 = "data"
            org.json.JSONObject r4 = r10.getJSONObject(r0)     // Catch:{ JSONException -> 0x01d4 }
            X.14O r3 = r5.A02     // Catch:{ JSONException -> 0x01d4 }
            long r0 = r5.A01     // Catch:{ JSONException -> 0x01d4 }
            r3.A00(r4, r0)     // Catch:{ JSONException -> 0x01d4 }
            r0 = 0
            r5.A00 = r0     // Catch:{ JSONException -> 0x01d4 }
            goto L_0x01bf
        L_0x01d4:
            r5.A00 = r6     // Catch:{ JSONException -> 0x01d8 }
            goto L_0x01bf
        L_0x01d7:
            return
        L_0x01d8:
            r3 = move-exception
            goto L_0x024b
        L_0x01da:
            r0 = move-exception
            if (r4 == 0) goto L_0x01e0
            r4.close()     // Catch:{ all -> 0x01e0 }
        L_0x01e0:
            throw r0     // Catch:{ Exception -> 0x01e1 }
        L_0x01e1:
            X.0ua r1 = r3.A02     // Catch:{ Exception -> 0x0223 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0223 }
            java.io.InputStream r4 = r8.A9j(r1, r0, r11)     // Catch:{ Exception -> 0x0223 }
            org.json.JSONObject r0 = X.C30311c8.A03(r4)     // Catch:{ all -> 0x021c }
            org.json.JSONObject r0 = r0.getJSONObject(r9)     // Catch:{ all -> 0x021c }
            X.1fg r3 = new X.1fg     // Catch:{ all -> 0x021c }
            r3.<init>((org.json.JSONObject) r0)     // Catch:{ all -> 0x021c }
            int r1 = r3.A01     // Catch:{ all -> 0x021c }
            if (r1 == r5) goto L_0x020e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            r0.<init>()     // Catch:{ all -> 0x021c }
            r0.append(r7)     // Catch:{ all -> 0x021c }
            r0.append(r1)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x021c }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x021c }
        L_0x020e:
            X.43b r0 = new X.43b     // Catch:{ all -> 0x021c }
            r0.<init>(r3)     // Catch:{ all -> 0x021c }
            r2.AQa(r0)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x024e
            r4.close()     // Catch:{ Exception -> 0x0223 }
            return
        L_0x021c:
            r0 = move-exception
            if (r4 == 0) goto L_0x0222
            r4.close()     // Catch:{ all -> 0x0222 }
        L_0x0222:
            throw r0     // Catch:{ Exception -> 0x0223 }
        L_0x0223:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to parse the error response: "
            goto L_0x023e
        L_0x022c:
            r0 = move-exception
            r2.APZ(r0)
            return
        L_0x0231:
            r3 = move-exception
            X.AnonymousClass00B.A0E(r3)
            goto L_0x024b
        L_0x0236:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Exception in Decompression: "
        L_0x023e:
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x024b:
            r2.AQa(r3)
        L_0x024e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KC.Aah(X.25p):void");
    }
}
