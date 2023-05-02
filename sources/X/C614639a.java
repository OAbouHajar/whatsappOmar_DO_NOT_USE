package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.39a  reason: invalid class name and case insensitive filesystem */
public class C614639a {
    public int A00;
    public Uri A01;
    public Bundle A02;
    public C16490t9 A03;
    public C15830rv A04;
    public UserJid A05;
    public AnonymousClass01D A06 = new AnonymousClass54F();
    public String A07;
    public String A08 = null;
    public String A09;
    public String A0A;
    public String A0B = null;
    public String A0C;
    public JSONObject A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public static String A00(Uri uri, String str, JSONObject jSONObject) {
        return !jSONObject.has(str) ? uri.getQueryParameter(str) : String.valueOf(jSONObject.getInt(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r4.length() > r3) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3BB A01() {
        /*
            r31 = this;
            r0 = r31
            android.net.Uri r2 = r0.A01
            if (r2 != 0) goto L_0x0080
            android.os.Bundle r1 = r0.A02
            if (r1 == 0) goto L_0x007b
            java.lang.String r2 = "biz_info"
            java.lang.String r0 = r1.getString(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r1.getString(r2)     // Catch:{ JSONException -> 0x0020 }
            org.json.JSONObject r11 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x0020 }
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0024:
            r11 = r3
        L_0x0025:
            java.lang.String r0 = "data"
            java.lang.String r5 = r1.getString(r0, r3)
            java.lang.String r0 = "source"
            java.lang.String r6 = r1.getString(r0, r3)
            java.lang.String r0 = "has_ib"
            boolean r12 = r1.getBoolean(r0)
            java.lang.String r0 = "has_wm"
            boolean r13 = r1.getBoolean(r0)
            java.lang.String r0 = "ads_logging_requires_tos"
            boolean r14 = r1.getBoolean(r0)
            java.lang.String r0 = "show_ad_attribution"
            boolean r15 = r1.getBoolean(r0)
            java.lang.String r0 = "show_keyboard"
            boolean r16 = r1.getBoolean(r0)
            java.lang.String r0 = "source_url"
            java.lang.String r7 = r1.getString(r0)
            java.lang.String r0 = "ctwa_context"
            java.lang.String r8 = r1.getString(r0)
            java.lang.String r0 = "icebreaker"
            java.lang.String r9 = r1.getString(r0)
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.getNullable(r0)
            java.lang.String r0 = "productId"
            java.lang.String r10 = r1.getString(r0)
            X.3BB r2 = new X.3BB
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r2
        L_0x007b:
            X.3BB r2 = r0.A02()
            return r2
        L_0x0080:
            java.lang.String r1 = "token"
            java.lang.String r1 = r2.getQueryParameter(r1)
            boolean r2 = r0.A0J
            if (r2 == 0) goto L_0x00f2
            android.net.Uri r5 = r0.A01
            int r4 = r0.A00
            java.lang.String r3 = "data_filter_required"
            java.lang.String r19 = r5.getQueryParameter(r3)
            if (r19 == 0) goto L_0x00da
            boolean r2 = android.text.TextUtils.isEmpty(r19)
            if (r2 != 0) goto L_0x00da
            int r2 = r19.length()
            if (r2 > r4) goto L_0x00da
        L_0x00a3:
            android.net.Uri r2 = r0.A01
            java.lang.String r4 = r2.getQueryParameter(r3)
            int r3 = r0.A00
            if (r4 == 0) goto L_0x00bb
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x00bb
            int r2 = r4.length()
            r28 = 1
            if (r2 <= r3) goto L_0x00bd
        L_0x00bb:
            r28 = 0
        L_0x00bd:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0258
            android.net.Uri r6 = r0.A01
            java.lang.String r7 = "context"
            java.lang.String r9 = "source_url"
            java.lang.String r5 = "productId"
            java.lang.String r16 = "show_keyboard"
            java.lang.String r15 = "show_ad_attribution"
            java.lang.String r14 = "have_wm"
            java.lang.String r8 = "have_ib"
            java.lang.String r2 = "1"
            r11 = 0
            goto L_0x010e
        L_0x00da:
            java.lang.String r2 = "data"
            java.lang.String r19 = r5.getQueryParameter(r2)
            if (r19 == 0) goto L_0x00ef
            boolean r2 = android.text.TextUtils.isEmpty(r19)
            if (r2 != 0) goto L_0x00ef
            int r2 = r19.length()
            if (r2 > r4) goto L_0x00ef
            goto L_0x00a3
        L_0x00ef:
            r19 = 0
            goto L_0x00a3
        L_0x00f2:
            android.net.Uri r4 = r0.A01
            int r3 = r0.A00
            java.lang.String r2 = "data"
            java.lang.String r19 = r4.getQueryParameter(r2)
            if (r19 == 0) goto L_0x010b
            boolean r2 = android.text.TextUtils.isEmpty(r19)
            if (r2 != 0) goto L_0x010b
            int r2 = r19.length()
            if (r2 > r3) goto L_0x010b
            goto L_0x00bb
        L_0x010b:
            r19 = 0
            goto L_0x00bb
        L_0x010e:
            java.lang.String r13 = "kid"
            java.lang.String r12 = ""
            r10 = 0
            X.3B9 r4 = new X.3B9     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            r4.<init>(r1)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            org.json.JSONObject r3 = r4.A02     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            if (r3 == 0) goto L_0x022f
            boolean r1 = r3.has(r13)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            if (r1 == 0) goto L_0x022f
            java.util.Map r1 = X.AnonymousClass3BB.A0E     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            java.lang.String r3 = r3.getString(r13)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            java.lang.String r3 = X.C13690nt.A0e(r3, r1)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            if (r3 == 0) goto L_0x022f
            java.lang.String r1 = "-----BEGIN PUBLIC KEY-----\n"
            java.lang.String r3 = r3.replace(r1, r12)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            java.lang.String r1 = "-----END PUBLIC KEY-----"
            java.lang.String r3 = r3.replace(r1, r12)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            java.lang.String r1 = "\n"
            java.lang.String r1 = r3.replaceAll(r1, r12)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            java.lang.String r1 = r1.trim()     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            byte[] r1 = android.util.Base64.decode(r1, r10)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            java.security.spec.X509EncodedKeySpec r3 = new java.security.spec.X509EncodedKeySpec     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            r3.<init>(r1)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            java.lang.String r1 = "EC"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            java.security.PublicKey r1 = r1.generatePublic(r3)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            boolean r1 = r4.A01(r1)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            if (r1 == 0) goto L_0x0258
            r1 = 1
            r0.A03(r11, r1)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            org.json.JSONObject r4 = r4.A03     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            if (r4 == 0) goto L_0x0258
            java.lang.String r1 = "lid"
            java.lang.String r1 = X.C812147h.A00(r1, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            X.0rv r17 = X.C15830rv.A02(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            if (r17 == 0) goto L_0x017f
            X.01D r1 = r0.A06     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            java.lang.Object r1 = r1.get()     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r1 = X.AnonymousClass000.A1X(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            if (r1 != 0) goto L_0x017f
            r17 = r11
        L_0x017f:
            java.lang.String r1 = "jid"
            java.lang.String r1 = X.C812147h.A00(r1, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            com.whatsapp.jid.UserJid r18 = com.whatsapp.jid.UserJid.getNullable(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            java.lang.String r1 = "source"
            java.lang.String r20 = X.C812147h.A00(r1, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r3 = android.text.TextUtils.isEmpty(r20)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            if (r3 == 0) goto L_0x019a
            java.lang.String r20 = r6.getQueryParameter(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
        L_0x019a:
            if (r20 == 0) goto L_0x019d
            goto L_0x01a0
        L_0x019d:
            r20 = 0
            goto L_0x01ae
        L_0x01a0:
            boolean r1 = android.text.TextUtils.isEmpty(r20)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            if (r1 != 0) goto L_0x019d
            int r3 = r20.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            r1 = 32
            if (r3 > r1) goto L_0x019d
        L_0x01ae:
            java.lang.String r3 = A00(r6, r8, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            java.lang.String r8 = A00(r6, r14, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            java.lang.String r10 = A00(r6, r15, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            r1 = r16
            java.lang.String r11 = A00(r6, r1, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            java.lang.String r1 = X.C812147h.A00(r9, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            if (r1 == 0) goto L_0x01f2
            java.lang.String r21 = r6.getQueryParameter(r9)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
        L_0x01ce:
            java.lang.String r1 = X.C812147h.A00(r7, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            if (r1 == 0) goto L_0x01ed
            java.lang.String r22 = r6.getQueryParameter(r7)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
        L_0x01dc:
            java.lang.String r1 = "icebreaker"
            java.lang.String r23 = X.C812147h.A00(r1, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r7 = android.text.TextUtils.isEmpty(r23)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            if (r7 == 0) goto L_0x01f7
            java.lang.String r23 = r6.getQueryParameter(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            goto L_0x01f7
        L_0x01ed:
            java.lang.String r22 = X.C812147h.A00(r7, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            goto L_0x01dc
        L_0x01f2:
            java.lang.String r21 = X.C812147h.A00(r9, r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            goto L_0x01ce
        L_0x01f7:
            if (r23 == 0) goto L_0x0203
            int r7 = r23.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            r1 = 140(0x8c, float:1.96E-43)
            if (r7 < r1) goto L_0x0203
            r23 = 0
        L_0x0203:
            java.lang.String r1 = "banner"
            org.json.JSONObject r25 = r4.optJSONObject(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r1 = r4.has(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            if (r1 != 0) goto L_0x0229
            java.lang.String r24 = r6.getQueryParameter(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
        L_0x0213:
            boolean r26 = r2.equalsIgnoreCase(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r27 = r2.equalsIgnoreCase(r8)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r29 = r2.equalsIgnoreCase(r10)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            boolean r30 = r2.equalsIgnoreCase(r11)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            X.3BB r16 = new X.3BB     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            goto L_0x022e
        L_0x0229:
            java.lang.String r24 = r4.getString(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            goto L_0x0213
        L_0x022e:
            return r16
        L_0x022f:
            java.lang.String r1 = "Public key doesn't exist"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0T(r1)     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
            throw r1     // Catch:{ 43R | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0236 }
        L_0x0236:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            r0.A03(r1, r10)     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            r2.printStackTrace()     // Catch:{ IllegalArgumentException | JSONException -> 0x0242 }
            goto L_0x0258
        L_0x0242:
            r4 = move-exception
            r3 = 0
            java.lang.String r1 = "Error during parsing of payload object "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)
            java.lang.String r1 = r4.getMessage()
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
            r0.A03(r1, r3)
            r4.printStackTrace()
        L_0x0258:
            android.net.Uri r1 = r0.A01
            r23 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r23)
            if (r0 == 0) goto L_0x02e4
            java.lang.String r0 = "source"
            java.lang.String r20 = r1.getQueryParameter(r0)
            if (r20 == 0) goto L_0x02e4
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x02e4
            int r2 = r20.length()
            r0 = 32
            if (r2 > r0) goto L_0x02e4
        L_0x0279:
            java.lang.String r0 = "have_ib"
            java.lang.String r5 = r1.getQueryParameter(r0)
            java.lang.String r0 = "have_wm"
            java.lang.String r4 = r1.getQueryParameter(r0)
            java.lang.String r0 = "show_ad_attribution"
            java.lang.String r3 = r1.getQueryParameter(r0)
            java.lang.String r0 = "show_keyboard"
            java.lang.String r2 = r1.getQueryParameter(r0)
            java.lang.String r0 = "productId"
            java.lang.String r24 = r1.getQueryParameter(r0)
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getQueryParameter(r0)
            com.whatsapp.jid.UserJid r18 = com.whatsapp.jid.UserJid.getNullable(r0)
            java.lang.String r0 = "source_url"
            java.lang.String r21 = r1.getQueryParameter(r0)
            java.lang.String r0 = "context"
            java.lang.String r22 = r1.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r23)
            if (r0 == 0) goto L_0x02c8
            java.lang.String r0 = "icebreaker"
            java.lang.String r23 = r1.getQueryParameter(r0)
            if (r23 == 0) goto L_0x02c8
            int r1 = r23.length()
            r0 = 140(0x8c, float:1.96E-43)
            if (r1 < r0) goto L_0x02c8
            r23 = 0
        L_0x02c8:
            java.lang.String r0 = "1"
            boolean r26 = r0.equalsIgnoreCase(r5)
            boolean r27 = r0.equalsIgnoreCase(r4)
            boolean r29 = r0.equalsIgnoreCase(r3)
            boolean r30 = r0.equalsIgnoreCase(r2)
            r17 = 0
            X.3BB r16 = new X.3BB
            r25 = r17
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r16
        L_0x02e4:
            r20 = 0
            goto L_0x0279
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614639a.A01():X.3BB");
    }

    public AnonymousClass3BB A02() {
        String str = this.A08;
        String str2 = this.A0B;
        boolean z2 = this.A0F;
        boolean z3 = this.A0G;
        boolean z4 = this.A0E;
        boolean z5 = this.A0H;
        boolean z6 = this.A0I;
        String str3 = this.A0C;
        String str4 = this.A07;
        String str5 = this.A09;
        return new AnonymousClass3BB(this.A04, this.A05, str, str2, str3, str4, str5, this.A0A, this.A0D, z2, z3, z4, z5, z6);
    }

    public final void A03(String str, boolean z2) {
        if (AnonymousClass000.A1X(this.A06.get())) {
            C74613qp r1 = new C74613qp();
            r1.A00 = Integer.valueOf(z2 ? 1 : 0);
            r1.A01 = str;
            this.A03.A06(r1);
        }
    }
}
