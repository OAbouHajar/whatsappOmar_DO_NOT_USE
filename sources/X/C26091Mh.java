package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Mh  reason: invalid class name and case insensitive filesystem */
public class C26091Mh {
    public static final Map A03 = new AnonymousClass5C7();
    public final C18200wJ A00;
    public final C14710pd A01;
    public final C16490t9 A02;

    public C26091Mh(C18200wJ r1, C14710pd r2, C16490t9 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r4.length() > 512) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r10.length() <= r3) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        r0 = A01(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3BB A00(android.net.Uri r21, boolean r22) {
        /*
            r20 = this;
            java.lang.String r1 = "token"
            r7 = r21
            java.lang.String r3 = r7.getQueryParameter(r1)
            r6 = r20
            X.0pd r0 = r6.A01
            r16 = r0
            r2 = 1823(0x71f, float:2.555E-42)
            X.0tM r13 = X.C16620tM.A02
            boolean r0 = r0.A0E(r13, r2)
            java.lang.String r2 = "lid"
            if (r0 == 0) goto L_0x00d5
            if (r3 == 0) goto L_0x00d5
            org.json.JSONObject r0 = r6.A01(r3)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = X.C812147h.A00(r2, r0)
            X.0rv r4 = X.C15830rv.A02(r0)
        L_0x002b:
            r3 = 1841(0x731, float:2.58E-42)
            r0 = r16
            int r3 = r0.A03(r13, r3)
            r5 = r22
            if (r22 == 0) goto L_0x00b7
            java.lang.String r0 = "data_filter_required"
            java.lang.String r10 = r7.getQueryParameter(r0)
            r8 = 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x009c
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x009c
            int r0 = r10.length()
            if (r0 > r8) goto L_0x009c
        L_0x004d:
            X.39a r9 = new X.39a
            r9.<init>()
            r9.A01 = r7
            r4 = 3
            com.facebook.redex.IDxLazyShape245S0100000_2_I0 r0 = new com.facebook.redex.IDxLazyShape245S0100000_2_I0
            r0.<init>(r6, r4)
            r9.A06 = r0
            r9.A00 = r3
            r9.A0J = r5
            r9.A08 = r10
            java.lang.String r0 = r7.getQueryParameter(r1)
            if (r22 == 0) goto L_0x0080
            java.lang.String r1 = "data_filter_required"
            java.lang.String r4 = r7.getQueryParameter(r1)
            r3 = 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0080
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0080
            int r1 = r4.length()
            r19 = 1
            if (r1 <= r3) goto L_0x0082
        L_0x0080:
            r19 = 0
        L_0x0082:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0224
            java.lang.String r14 = "context"
            java.lang.String r12 = "source_url"
            java.lang.String r18 = "productId"
            java.lang.String r11 = "show_keyboard"
            java.lang.String r8 = "show_ad_attribution"
            java.lang.String r5 = "have_wm"
            java.lang.String r4 = "have_ib"
            java.lang.String r3 = "1"
            goto L_0x00d8
        L_0x009c:
            X.0wJ r8 = r6.A00
            r0 = 7
            r8.A01(r4, r0)
            java.lang.String r0 = "data"
            java.lang.String r10 = r7.getQueryParameter(r0)
            if (r10 == 0) goto L_0x00ce
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00ce
            int r0 = r10.length()
            if (r0 > r3) goto L_0x00ce
            goto L_0x004d
        L_0x00b7:
            java.lang.String r0 = "data"
            java.lang.String r10 = r7.getQueryParameter(r0)
            if (r10 == 0) goto L_0x00cc
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00cc
            int r0 = r10.length()
            if (r0 > r3) goto L_0x00cc
            goto L_0x004d
        L_0x00cc:
            X.0wJ r8 = r6.A00
        L_0x00ce:
            r0 = 6
            r8.A01(r4, r0)
            r10 = 0
            goto L_0x004d
        L_0x00d5:
            r4 = 0
            goto L_0x002b
        L_0x00d8:
            org.json.JSONObject r1 = r6.A01(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r1 == 0) goto L_0x0224
            java.lang.String r0 = X.C812147h.A00(r2, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            X.0rv r2 = X.C15830rv.A02(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r2 == 0) goto L_0x00f4
            r0 = 1823(0x71f, float:2.555E-42)
            r15 = r0
            r0 = r16
            boolean r0 = r0.A0E(r13, r15)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 != 0) goto L_0x00f4
            r2 = 0
        L_0x00f4:
            java.lang.String r0 = "jid"
            java.lang.String r0 = X.C812147h.A00(r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            com.whatsapp.jid.UserJid r17 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            java.lang.String r15 = "source"
            java.lang.String r13 = X.C812147h.A00(r15, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 == 0) goto L_0x010f
            java.lang.String r13 = r7.getQueryParameter(r15)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
        L_0x010f:
            if (r13 == 0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r13 = 0
            goto L_0x0122
        L_0x0114:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 != 0) goto L_0x0112
            int r15 = r13.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r0 = 32
            if (r15 > r0) goto L_0x0112
        L_0x0122:
            boolean r0 = r1.has(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 != 0) goto L_0x019c
            java.lang.String r16 = r7.getQueryParameter(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
        L_0x012c:
            boolean r0 = r1.has(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 != 0) goto L_0x0193
            java.lang.String r15 = r7.getQueryParameter(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
        L_0x0136:
            boolean r0 = r1.has(r8)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 != 0) goto L_0x018a
            java.lang.String r5 = r7.getQueryParameter(r8)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
        L_0x0140:
            boolean r0 = r1.has(r11)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 != 0) goto L_0x0181
            java.lang.String r8 = r7.getQueryParameter(r11)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
        L_0x014a:
            java.lang.String r0 = X.C812147h.A00(r12, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 == 0) goto L_0x017c
            java.lang.String r11 = r7.getQueryParameter(r12)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
        L_0x0158:
            java.lang.String r0 = X.C812147h.A00(r14, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r12 = r7.getQueryParameter(r14)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
        L_0x0166:
            java.lang.String r14 = "icebreaker"
            java.lang.String r4 = X.C812147h.A00(r14, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 == 0) goto L_0x01a5
            java.lang.String r4 = r7.getQueryParameter(r14)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            goto L_0x01a5
        L_0x0177:
            java.lang.String r12 = X.C812147h.A00(r14, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            goto L_0x0166
        L_0x017c:
            java.lang.String r11 = X.C812147h.A00(r12, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            goto L_0x0158
        L_0x0181:
            int r0 = r1.getInt(r11)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            goto L_0x014a
        L_0x018a:
            int r0 = r1.getInt(r8)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            goto L_0x0140
        L_0x0193:
            int r0 = r1.getInt(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            goto L_0x0136
        L_0x019c:
            int r0 = r1.getInt(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            goto L_0x012c
        L_0x01a5:
            if (r4 == 0) goto L_0x01b0
            int r14 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r0 = 140(0x8c, float:1.96E-43)
            if (r14 < r0) goto L_0x01b0
            r4 = 0
        L_0x01b0:
            java.lang.String r0 = "banner"
            org.json.JSONObject r14 = r1.optJSONObject(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r0 = r18
            boolean r0 = r1.has(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            if (r0 != 0) goto L_0x01fb
            r0 = r18
            java.lang.String r1 = r7.getQueryParameter(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
        L_0x01c4:
            r9.A08 = r10     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A0B = r13     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r0 = r16
            boolean r0 = r3.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A0F = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            boolean r0 = r3.equalsIgnoreCase(r15)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A0G = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r0 = r19
            r9.A0E = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            boolean r0 = r3.equalsIgnoreCase(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A0H = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            boolean r0 = r3.equalsIgnoreCase(r8)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A0I = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A0C = r11     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A07 = r12     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A09 = r4     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A04 = r2     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r0 = r17
            r9.A05 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A0D = r14     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            r9.A0A = r1     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            X.3BB r0 = r9.A02()     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            return r0
        L_0x01fb:
            r0 = r18
            int r0 = r1.getInt(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0206 }
            goto L_0x01c4
        L_0x0206:
            r3 = move-exception
            r2 = 0
            java.lang.String r0 = "Error during parsing of payload object "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.A02(r0, r2)
            java.lang.String r0 = r3.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0224:
            r8 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x02c6
            java.lang.String r0 = "source"
            java.lang.String r15 = r7.getQueryParameter(r0)
            if (r15 == 0) goto L_0x02c6
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x02c6
            int r1 = r15.length()
            r0 = 32
            if (r1 > r0) goto L_0x02c6
        L_0x0242:
            java.lang.String r0 = "have_ib"
            java.lang.String r14 = r7.getQueryParameter(r0)
            java.lang.String r0 = "have_wm"
            java.lang.String r13 = r7.getQueryParameter(r0)
            java.lang.String r0 = "show_ad_attribution"
            java.lang.String r12 = r7.getQueryParameter(r0)
            java.lang.String r0 = "show_keyboard"
            java.lang.String r11 = r7.getQueryParameter(r0)
            java.lang.String r0 = "productId"
            java.lang.String r6 = r7.getQueryParameter(r0)
            java.lang.String r0 = "jid"
            java.lang.String r0 = r7.getQueryParameter(r0)
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.getNullable(r0)
            java.lang.String r0 = "source_url"
            java.lang.String r4 = r7.getQueryParameter(r0)
            java.lang.String r0 = "context"
            java.lang.String r3 = r7.getQueryParameter(r0)
            r2 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0291
            java.lang.String r0 = "icebreaker"
            java.lang.String r2 = r7.getQueryParameter(r0)
            if (r2 == 0) goto L_0x0291
            int r1 = r2.length()
            r0 = 140(0x8c, float:1.96E-43)
            if (r1 < r0) goto L_0x0291
            r2 = 0
        L_0x0291:
            r9.A08 = r10
            r9.A0B = r15
            java.lang.String r1 = "1"
            boolean r0 = r1.equalsIgnoreCase(r14)
            r9.A0F = r0
            boolean r0 = r1.equalsIgnoreCase(r13)
            r9.A0G = r0
            r0 = r19
            r9.A0E = r0
            boolean r0 = r1.equalsIgnoreCase(r12)
            r9.A0H = r0
            boolean r0 = r1.equalsIgnoreCase(r11)
            r9.A0I = r0
            r9.A0C = r4
            r9.A07 = r3
            r9.A09 = r2
            r9.A04 = r8
            r9.A05 = r5
            r9.A0D = r8
            r9.A0A = r6
            X.3BB r0 = r9.A02()
            return r0
        L_0x02c6:
            r15 = 0
            goto L_0x0242
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26091Mh.A00(android.net.Uri, boolean):X.3BB");
    }

    public final JSONObject A01(String str) {
        try {
            AnonymousClass3B9 r4 = new AnonymousClass3B9(str);
            JSONObject jSONObject = r4.A02;
            String str2 = (jSONObject == null || !jSONObject.has("kid")) ? null : (String) A03.get(jSONObject.getString("kid"));
            if (str2 != null) {
                if (r4.A01(KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(Base64.decode(str2.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", "").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "").trim(), 0))))) {
                    A02((String) null, true);
                    return r4.A03;
                }
                return null;
            }
            throw new IllegalArgumentException("Public key doesn't exist");
        } catch (AnonymousClass43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException e2) {
            A02(e2.getMessage(), false);
            Log.e(e2.getMessage());
        }
    }

    public void A02(String str, boolean z2) {
        if (this.A01.A0E(C16620tM.A02, 1823)) {
            C74613qp r1 = new C74613qp();
            int i2 = 0;
            if (z2) {
                i2 = 1;
            }
            r1.A00 = Integer.valueOf(i2);
            r1.A01 = str;
            this.A02.A06(r1);
        }
    }
}
