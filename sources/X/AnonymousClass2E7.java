package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2E7  reason: invalid class name */
public final class AnonymousClass2E7 {
    public static final AnonymousClass2E7 A00 = new AnonymousClass2E7();

    public static /* synthetic */ C34171jo A00(AnonymousClass2E7 r17, JSONObject jSONObject, int i2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        int i3 = i2;
        JSONObject jSONObject2 = jSONObject;
        try {
            int i4 = jSONObject2.getInt("policyVersion");
            AnonymousClass2Dp r6 = null;
            AnonymousClass2E7 r3 = r17;
            if (jSONObject2.has("banner") && (optJSONObject2 = jSONObject2.optJSONObject("banner")) != null) {
                String string = optJSONObject2.getString("text");
                String string2 = optJSONObject2.getString("iconDescription");
                String string3 = optJSONObject2.getString("action");
                JSONObject jSONObject3 = optJSONObject2.getJSONObject("icon");
                String string4 = jSONObject3.getString("light");
                String string5 = jSONObject3.getString("dark");
                JSONObject jSONObject4 = optJSONObject2.getJSONObject("timing");
                C18450wi.A0B(jSONObject4);
                r6 = new AnonymousClass2Dp(r3.A03(jSONObject4), string, string4, string5, string2, string3);
            }
            C46322Dr A04 = r3.A04("modal", jSONObject2, true);
            C46322Dr A042 = r3.A04("blocking-modal", jSONObject2, false);
            AnonymousClass2Do r9 = null;
            if (jSONObject2.has("badged-notice") && (optJSONObject = jSONObject2.optJSONObject("badged-notice")) != null) {
                String string6 = optJSONObject.getString("text");
                String string7 = optJSONObject.getString("action");
                JSONObject jSONObject5 = optJSONObject.getJSONObject("timing");
                C18450wi.A0B(jSONObject5);
                C46312Dn A03 = r3.A03(jSONObject5);
                C18450wi.A0B(string6);
                C18450wi.A0B(string7);
                r9 = new AnonymousClass2Do(A03, string6, string7);
            }
            return new C34171jo(r6, A04, A042, r9, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, i3, i4);
        } catch (IOException | JSONException e2) {
            Log.e(C18450wi.A06("Failed to parse user notice content for notice id: ", Integer.valueOf(i3)), e2);
            return null;
        }
    }

    public static final AnonymousClass2Dy A01(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("time");
        String string2 = jSONObject.getString("reference");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        try {
            simpleDateFormat.setTimeZone("utc".equalsIgnoreCase(string2) ? TimeZone.getTimeZone("UTC") : TimeZone.getDefault());
            Date parse = simpleDateFormat.parse(string);
            AnonymousClass00B.A06(parse);
            return new AnonymousClass2Dy(parse.getTime());
        } catch (ParseException e2) {
            StringBuilder sb = new StringBuilder("UserNoticeTiming/getDate/Unable to parse date: ");
            sb.append(string);
            sb.append(" reference: ");
            sb.append(string2);
            Log.e(sb.toString());
            throw new RuntimeException(e2);
        }
    }

    public final C34171jo A02(InputStream inputStream, int i2) {
        try {
            JSONObject A03 = C30311c8.A03(inputStream);
            AnonymousClass00B.A06(A03);
            C18450wi.A09(A03);
            return A00(this, A03, i2);
        } catch (IOException | JSONException e2) {
            Log.e(C18450wi.A06("Failed to parse user notice content for notice id: ", Integer.valueOf(i2)), e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.2Dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: long[]} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C46312Dn A03(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "start"
            org.json.JSONObject r0 = r13.optJSONObject(r0)
            X.2Dy r10 = A01(r0)
            java.lang.String r0 = "duration"
            org.json.JSONObject r4 = r13.optJSONObject(r0)
            r11 = 0
            if (r4 == 0) goto L_0x004c
            java.lang.String r0 = "static"
            r1 = -1
            int r0 = r4.optInt(r0, r1)
            r2 = -1
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == r1) goto L_0x0025
            long r2 = (long) r0
            long r2 = r2 * r8
        L_0x0025:
            java.lang.String r0 = "repeat"
            org.json.JSONArray r7 = r4.optJSONArray(r0)
            if (r7 == 0) goto L_0x0046
            int r0 = r7.length()
            long[] r11 = new long[r0]
            r6 = 0
            int r5 = r7.length()
        L_0x0038:
            if (r6 >= r5) goto L_0x0046
            int r4 = r6 + 1
            int r0 = r7.getInt(r6)
            long r0 = (long) r0
            long r0 = r0 * r8
            r11[r6] = r0
            r6 = r4
            goto L_0x0038
        L_0x0046:
            X.2Dx r0 = new X.2Dx
            r0.<init>(r11, r2)
            r11 = r0
        L_0x004c:
            java.lang.String r0 = "end"
            org.json.JSONObject r0 = r13.optJSONObject(r0)
            X.2Dy r1 = A01(r0)
            X.2Dn r0 = new X.2Dn
            r0.<init>(r11, r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2E7.A03(org.json.JSONObject):X.2Dn");
    }

    public final C46322Dr A04(String str, JSONObject jSONObject, boolean z2) {
        JSONObject optJSONObject;
        String string;
        String string2;
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        String str3 = null;
        if (!jSONObject2.has(str2) || (optJSONObject = jSONObject2.optJSONObject(str2)) == null) {
            return null;
        }
        String string3 = optJSONObject.getString("title");
        String string4 = optJSONObject.getString("iconDescription");
        String string5 = optJSONObject.getString("buttonText");
        JSONObject jSONObject3 = optJSONObject.getJSONObject("icon");
        String string6 = jSONObject3.getString("light");
        String string7 = jSONObject3.getString("dark");
        JSONObject jSONObject4 = optJSONObject.getJSONObject("timing");
        C18450wi.A0B(jSONObject4);
        C46312Dn A03 = A03(jSONObject4);
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = optJSONObject.getJSONArray("bullets");
        int length = jSONArray.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            JSONObject jSONObject5 = jSONArray.getJSONObject(i2);
            String string8 = jSONObject5.getString("text");
            JSONObject optJSONObject2 = jSONObject5.optJSONObject("icon");
            if (optJSONObject2 == null) {
                string2 = null;
                string = null;
            } else {
                string = optJSONObject2.getString("light");
                string2 = optJSONObject2.getString("dark");
            }
            arrayList.add(new AnonymousClass4W6(string8, string, string2));
            i2 = i3;
        }
        String optString = optJSONObject.optString("body");
        if (!(optString == null || optString.length() == 0)) {
            str3 = optString;
        }
        String optString2 = optJSONObject.optString("footer");
        if (!(optString2 == null || optString2.length() == 0)) {
            str4 = optString2;
        }
        if (z2) {
            str5 = optJSONObject.getString("dismissText");
        }
        return new C46322Dr(A03, string6, string7, string4, string3, string5, str3, str4, str5, arrayList);
    }
}
