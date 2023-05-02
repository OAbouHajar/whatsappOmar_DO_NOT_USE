package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5x7  reason: invalid class name */
public class AnonymousClass5x7 {
    public final C16980tz A00;

    public AnonymousClass5x7(C16980tz r1) {
        this.A00 = r1;
    }

    public static JSONArray A00(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C111795hQ r3 = (C111795hQ) it.next();
                JSONObject A0J = C13700nu.A0J();
                A0J.put("bank_code", r3.A02);
                A0J.put("bank_name", r3.A01);
                A0J.put("short_name", r3.A03);
                A0J.put("accept_savings", r3.A04 ? "1" : "0");
                jSONArray.put(A0J);
            }
            return jSONArray;
        } catch (JSONException e2) {
            Log.e(AnonymousClass000.A0g("PAY: BrazilPayBloksActivity payoutBanksToJsonArrayException: ", e2), e2);
            return null;
        }
    }

    public static boolean A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((AnonymousClass638) it.next()).A0C) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
        r7 = X.C13680ns.A0d(r4, r2.A04, new java.lang.Object[1], 0, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONArray A02(java.util.List r17) {
        /*
            r16 = this;
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01cb }
            r6.<init>()     // Catch:{ JSONException -> 0x01cb }
            java.util.Iterator r15 = r17.iterator()     // Catch:{ JSONException -> 0x01cb }
        L_0x0009:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r2 = r15.next()     // Catch:{ JSONException -> 0x01cb }
            X.638 r2 = (X.AnonymousClass638) r2     // Catch:{ JSONException -> 0x01cb }
            org.json.JSONObject r5 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r1 = "card_verify_identifier"
            java.lang.String r0 = r2.A03     // Catch:{ JSONException -> 0x01cb }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "card_verify_type"
            java.lang.String r7 = r2.A0B     // Catch:{ JSONException -> 0x01cb }
            r5.put(r0, r7)     // Catch:{ JSONException -> 0x01cb }
            X.AnonymousClass00B.A06(r7)     // Catch:{ JSONException -> 0x01cb }
            r9 = -1
            int r3 = r7.hashCode()     // Catch:{ JSONException -> 0x01cb }
            r0 = -1302107194(0xffffffffb2636bc6, float:-1.3237644E-8)
            r4 = 2
            r8 = 0
            r1 = 1
            if (r3 == r0) goto L_0x0054
            r0 = -119226117(0xfffffffff8e4c0fb, float:-3.711743E34)
            if (r3 == r0) goto L_0x004a
            r0 = 110379(0x1af2b, float:1.54674E-40)
            if (r3 != r0) goto L_0x005f
            java.lang.String r0 = "otp"
            boolean r0 = r7.equals(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x005f
            goto L_0x005e
        L_0x004a:
            java.lang.String r0 = "app-to-app"
            boolean r0 = r7.equals(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x005f
            r9 = 2
            goto L_0x005f
        L_0x0054:
            java.lang.String r0 = "customer-service"
            boolean r0 = r7.equals(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x005f
            r9 = 1
            goto L_0x005f
        L_0x005e:
            r9 = 0
        L_0x005f:
            java.lang.String r3 = "card_verify_method_disabled_state"
            java.lang.String r7 = ""
            r0 = r16
            if (r9 == 0) goto L_0x0093
            if (r9 == r1) goto L_0x006e
            if (r9 == r4) goto L_0x014d
            r4 = r7
            goto L_0x019e
        L_0x006e:
            X.0tz r4 = r0.A00     // Catch:{ JSONException -> 0x01cb }
            r0 = 2131886753(0x7f1202a1, float:1.9408094E38)
            java.lang.String r7 = r4.A02(r0)     // Catch:{ JSONException -> 0x01cb }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r2 = r2.A0A     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = X.C115295pW.A00(r2)     // Catch:{ JSONException -> 0x01cb }
            r3[r8] = r0     // Catch:{ JSONException -> 0x01cb }
            r1 = 2131886752(0x7f1202a0, float:1.9408092E38)
            android.content.res.Resources r0 = X.C16980tz.A00(r4)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r4 = r0.getString(r1, r3)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "support_phone_number"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x019e
        L_0x0093:
            X.0tz r0 = r0.A00     // Catch:{ JSONException -> 0x01cb }
            android.content.Context r4 = r0.A00     // Catch:{ JSONException -> 0x01cb }
            r10 = r7
            java.lang.String r9 = r2.A05     // Catch:{ JSONException -> 0x01cb }
            int r0 = r9.hashCode()     // Catch:{ JSONException -> 0x01cb }
            switch(r0) {
                case 82233: goto L_0x0115;
                case 2467610: goto L_0x00fe;
                case 66081660: goto L_0x00eb;
                case 81425707: goto L_0x00db;
                default: goto L_0x00a1;
            }     // Catch:{ JSONException -> 0x01cb }
        L_0x00a1:
            X.01Q r0 = new X.01Q     // Catch:{ JSONException -> 0x01cb }
            r0.<init>(r10, r7)     // Catch:{ JSONException -> 0x01cb }
            java.lang.Object r7 = r0.A00     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x01cb }
            java.lang.Object r4 = r0.A01     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "card_verify_otp_type"
            r5.put(r0, r9)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r1 = r2.A04     // Catch:{ JSONException -> 0x01cb }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01cb }
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "card_verify_otp_receiver_info"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x01cb }
        L_0x00be:
            java.lang.String r1 = "card_verify_otp_resend_interval_sec"
            int r0 = r2.A01     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x01cb }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r1 = "otp_length"
            int r10 = r2.A00     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ JSONException -> 0x01cb }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r9 = "otp_mask"
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x01cb }
            goto L_0x0131
        L_0x00db:
            java.lang.String r0 = "VACAT"
            boolean r0 = r9.equals(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x00a1
            r0 = 2131886759(0x7f1202a7, float:1.9408106E38)
            java.lang.String r10 = r4.getString(r0)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x00a1
        L_0x00eb:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r9.equals(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x00a1
            r0 = 2131886757(0x7f1202a5, float:1.9408102E38)
            java.lang.String r10 = r4.getString(r0)     // Catch:{ JSONException -> 0x01cb }
            r7 = 2131886756(0x7f1202a4, float:1.94081E38)
            goto L_0x0127
        L_0x00fe:
            java.lang.String r0 = "PUSH"
            boolean r0 = r9.equals(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x00a1
            r0 = 2131886755(0x7f1202a3, float:1.9408098E38)
            java.lang.String r10 = r4.getString(r0)     // Catch:{ JSONException -> 0x01cb }
            r0 = 2131886754(0x7f1202a2, float:1.9408096E38)
            java.lang.String r7 = r4.getString(r0)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x00a1
        L_0x0115:
            java.lang.String r0 = "SMS"
            boolean r0 = r9.equals(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x00a1
            r0 = 2131886759(0x7f1202a7, float:1.9408106E38)
            java.lang.String r10 = r4.getString(r0)     // Catch:{ JSONException -> 0x01cb }
            r7 = 2131886758(0x7f1202a6, float:1.9408104E38)
        L_0x0127:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = r2.A04     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r7 = X.C13680ns.A0d(r4, r0, r1, r8, r7)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x00a1
        L_0x0131:
            r1 = 0
        L_0x0132:
            if (r1 >= r10) goto L_0x013c
            java.lang.String r0 = "#  "
            r8.append(r0)     // Catch:{ JSONException -> 0x01cb }
            int r1 = r1 + 1
            goto L_0x0132
        L_0x013c:
            java.lang.String r0 = r8.toString()     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x01cb }
            r5.put(r9, r0)     // Catch:{ JSONException -> 0x01cb }
            boolean r0 = r2.A0C     // Catch:{ JSONException -> 0x01cb }
            r5.put(r3, r0)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x019e
        L_0x014d:
            java.lang.String r10 = r2.A07     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r9 = r2.A08     // Catch:{ JSONException -> 0x01cb }
            X.01Q r4 = X.C119095vw.A00(r10, r9)     // Catch:{ JSONException -> 0x01cb }
            X.0tz r11 = r0.A00     // Catch:{ JSONException -> 0x01cb }
            r0 = 2131886751(0x7f12029f, float:1.940809E38)
            java.lang.String r7 = r11.A02(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r4 == 0) goto L_0x01b3
            java.lang.Object r14 = r4.A00     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ JSONException -> 0x01cb }
            java.lang.Object r13 = r4.A01     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r12 = r2.A09     // Catch:{ JSONException -> 0x01cb }
            android.content.Intent r4 = X.C13680ns.A09()     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "android.intent.extra.TEXT"
            r4.putExtra(r0, r12)     // Catch:{ JSONException -> 0x01cb }
            r4.setPackage(r14)     // Catch:{ JSONException -> 0x01cb }
            r4.setAction(r13)     // Catch:{ JSONException -> 0x01cb }
            android.content.Context r0 = r11.A00     // Catch:{ JSONException -> 0x01cb }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ JSONException -> 0x01cb }
            android.content.ComponentName r0 = r4.resolveActivity(r0)     // Catch:{ JSONException -> 0x01cb }
            if (r0 == 0) goto L_0x01b3
            java.lang.String r4 = r2.A06     // Catch:{ JSONException -> 0x01cb }
            r3 = r4
        L_0x0188:
            java.lang.String r1 = "app_to_app_request_payload"
            java.lang.String r0 = r2.A09     // Catch:{ JSONException -> 0x01cb }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "app_to_app_partner_app_package"
            r5.put(r0, r10)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "app_to_app_partner_app_name"
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "app_to_app_partner_intent_action"
            r5.put(r0, r9)     // Catch:{ JSONException -> 0x01cb }
        L_0x019e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x01cb }
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = "card_verify_method_title"
            r5.put(r0, r7)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "card_verify_method_description"
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x01cb }
        L_0x01ae:
            r6.put(r5)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x0009
        L_0x01b3:
            r5.put(r3, r1)     // Catch:{ JSONException -> 0x01cb }
            r2.A0C = r1     // Catch:{ JSONException -> 0x01cb }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r3 = r2.A06     // Catch:{ JSONException -> 0x01cb }
            r4[r8] = r3     // Catch:{ JSONException -> 0x01cb }
            r1 = 2131886750(0x7f12029e, float:1.9408088E38)
            android.content.res.Resources r0 = X.C16980tz.A00(r11)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r4 = r0.getString(r1, r4)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x0188
        L_0x01ca:
            return r6
        L_0x01cb:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilPayBloksActivity cardVerifyMethodsToJsonArray: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5x7.A02(java.util.List):org.json.JSONArray");
    }
}
