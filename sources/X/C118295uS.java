package X;

import org.json.JSONObject;

/* renamed from: X.5uS  reason: invalid class name and case insensitive filesystem */
public class C118295uS {
    public String A00;
    public String A01;
    public JSONObject A02;
    public AnonymousClass5wB A03;

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x019a, code lost:
        throw new X.C115045p1(r11, "Error while parsing XML Payload from input");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01a2, code lost:
        throw new X.C115045p1(r11, "Technical Issue, please try after some time");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b2, code lost:
        throw new X.C115045p1(r11, "Error while parsing Key Code from input");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016c, code lost:
        throw new X.C115045p1(r11, "Error while parsing XML Payload from input");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017c, code lost:
        throw new X.C115045p1(r11, "Error while parsing salt from input");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01b3 A[ExcHandler: 5p1 (r0v1 'e' X.5p1 A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.content.Context r11, android.os.Bundle r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r2 = "Error while parsing XML Payload from input"
            java.lang.String r0 = "keyCode"
            java.lang.String r0 = r12.getString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x01ab }
            r10.A00 = r0     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x01ab }
            if (r0 == 0) goto L_0x01a3
            boolean r0 = r0.isEmpty()     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x01ab }
            if (r0 != 0) goto L_0x01a3
            java.lang.String r0 = "keyXmlPayload"
            java.lang.String r1 = r12.getString(r0)     // Catch:{ 5p3 -> 0x019b, 5p1 -> 0x01b3, Exception -> 0x0195 }
            if (r1 == 0) goto L_0x018d
            boolean r0 = r1.isEmpty()     // Catch:{ 5p3 -> 0x019b, 5p1 -> 0x01b3, Exception -> 0x0195 }
            if (r0 != 0) goto L_0x018d
            X.5wB r0 = new X.5wB     // Catch:{ 5p3 -> 0x019b, 5p1 -> 0x01b3, Exception -> 0x0195 }
            r0.<init>(r1)     // Catch:{ 5p3 -> 0x019b, 5p1 -> 0x01b3, Exception -> 0x0195 }
            r10.A03 = r0     // Catch:{ 5p3 -> 0x019b, 5p1 -> 0x01b3, Exception -> 0x0195 }
            java.lang.String r0 = "controls"
            java.lang.String r1 = r12.getString(r0)     // Catch:{ Exception -> 0x0185 }
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0185 }
            if (r0 != 0) goto L_0x003b
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0185 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0185 }
            goto L_0x006b
        L_0x003b:
            org.json.JSONObject r4 = X.C13700nu.A0J()     // Catch:{ Exception -> 0x0185 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "PIN"
            r4.put(r1, r0)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r1 = "subtype"
            java.lang.String r0 = "MPIN"
            r4.put(r1, r0)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r1 = "dType"
            java.lang.String r0 = "NUM|ALPH"
            r4.put(r1, r0)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r1 = "dLength"
            r0 = 6
            r4.put(r1, r0)     // Catch:{ Exception -> 0x0185 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0185 }
            r3.<init>()     // Catch:{ Exception -> 0x0185 }
            r3.put(r4)     // Catch:{ Exception -> 0x0185 }
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ Exception -> 0x0185 }
            java.lang.String r0 = "CredAllowed"
            r1.put(r0, r3)     // Catch:{ Exception -> 0x0185 }
        L_0x006b:
            java.lang.String r0 = "configuration"
            java.lang.String r1 = r12.getString(r0)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x007f
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x017d }
            if (r0 != 0) goto L_0x007f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x017d }
            goto L_0x0084
        L_0x007f:
            java.lang.String r0 = "PAY: Configuration is not received"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x017d }
        L_0x0084:
            java.lang.String r0 = "salt"
            java.lang.String r1 = r12.getString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x016d
            boolean r0 = r1.isEmpty()     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0175 }
            if (r0 != 0) goto L_0x016d
            org.json.JSONObject r0 = X.C13700nu.A0K(r1)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0175 }
            r10.A02 = r0     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0175 }
            java.lang.String r0 = "trust"
            java.lang.String r0 = r12.getString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            r10.A01 = r0     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            if (r0 == 0) goto L_0x0157
            boolean r0 = r0.isEmpty()     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            if (r0 != 0) goto L_0x0157
            org.json.JSONObject r1 = r10.A02     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            java.lang.String r0 = "txnId"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            org.json.JSONObject r1 = r10.A02     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            java.lang.String r0 = "txnAmount"
            java.lang.String r4 = r1.optString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            org.json.JSONObject r1 = r10.A02     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            java.lang.String r0 = "appId"
            java.lang.String r5 = r1.optString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            org.json.JSONObject r1 = r10.A02     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            java.lang.String r0 = "deviceId"
            java.lang.String r6 = r1.optString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            org.json.JSONObject r1 = r10.A02     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            java.lang.String r0 = "mobileNumber"
            java.lang.String r7 = r1.optString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            org.json.JSONObject r1 = r10.A02     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            java.lang.String r0 = "payerAddr"
            java.lang.String r8 = r1.optString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            org.json.JSONObject r1 = r10.A02     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            java.lang.String r0 = "payeeAddr"
            java.lang.String r9 = r1.optString(r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            java.lang.String r0 = X.AnonymousClass5wB.A00(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ 5p3 -> 0x015f }
            java.lang.String r1 = r10.A01     // Catch:{ 5p3 -> 0x015f }
            byte[] r0 = X.AnonymousClass5xS.A02(r0)     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            byte[] r1 = android.util.Base64.decode(r1, r4)     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            byte[] r0 = X.AnonymousClass5xS.A01(r13)     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            byte[] r0 = X.AnonymousClass5xS.A03(r1, r0)     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            if (r0 == 0) goto L_0x010f
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            if (r0 != 0) goto L_0x010f
            X.5ob r1 = X.C114785ob.TRUST_NOT_VALID     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            X.5p3 r0 = new X.5p3     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
            throw r0     // Catch:{ Exception -> 0x014a, 5p1 -> 0x01b3 }
        L_0x010f:
            java.lang.String r0 = "payInfo"
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Exception -> 0x0142 }
            if (r0 == 0) goto L_0x011d
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0142 }
            if (r0 == 0) goto L_0x0122
        L_0x011d:
            java.lang.String r0 = "PAY: Pay Info not received"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x0142 }
        L_0x0122:
            java.lang.String r0 = "languagePref"
            java.lang.String r1 = r12.getString(r0)     // Catch:{ Exception -> 0x013a }
            if (r1 == 0) goto L_0x0136
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x013a }
            if (r0 != 0) goto L_0x0136
        L_0x0130:
            java.util.Locale r0 = new java.util.Locale     // Catch:{ Exception -> 0x013a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x013a }
            goto L_0x0139
        L_0x0136:
            java.lang.String r1 = "en_US"
            goto L_0x0130
        L_0x0139:
            return
        L_0x013a:
            java.lang.String r1 = "Error while parsing Locale from input"
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r1)
            throw r0
        L_0x0142:
            java.lang.String r1 = "Error while parsing Pay Info from input"
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r1)
            throw r0
        L_0x014a:
            java.lang.String r0 = "PAY: Failed to check the trust"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 5p3 -> 0x015f }
            X.5ob r1 = X.C114785ob.UNKNOWN_ERROR     // Catch:{ 5p3 -> 0x015f }
            X.5p3 r0 = new X.5p3     // Catch:{ 5p3 -> 0x015f }
            r0.<init>(r1)     // Catch:{ 5p3 -> 0x015f }
            throw r0     // Catch:{ 5p3 -> 0x015f }
        L_0x0157:
            java.lang.String r0 = "Trust has not been provided"
            X.5p1 r1 = new X.5p1     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            r1.<init>(r11, r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            goto L_0x0166
        L_0x015f:
            java.lang.String r0 = "Trust is not valid"
            X.5p1 r1 = new X.5p1     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
            r1.<init>(r11, r0)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
        L_0x0166:
            throw r1     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0167 }
        L_0x0167:
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r2)
            throw r0
        L_0x016d:
            java.lang.String r1 = "Salt has not been provided in input"
            X.5p1 r0 = new X.5p1     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0175 }
            r0.<init>(r11, r1)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0175 }
            throw r0     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x0175 }
        L_0x0175:
            java.lang.String r1 = "Error while parsing salt from input"
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r1)
            throw r0
        L_0x017d:
            java.lang.String r1 = "Error while parsing configuration from input"
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r1)
            throw r0
        L_0x0185:
            java.lang.String r1 = "Error while parsing controls from input"
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r1)
            throw r0
        L_0x018d:
            java.lang.String r1 = "XML Payload has not been provided in input"
            X.5p1 r0 = new X.5p1     // Catch:{ 5p3 -> 0x019b, 5p1 -> 0x01b3, Exception -> 0x0195 }
            r0.<init>(r11, r1)     // Catch:{ 5p3 -> 0x019b, 5p1 -> 0x01b3, Exception -> 0x0195 }
            throw r0     // Catch:{ 5p3 -> 0x019b, 5p1 -> 0x01b3, Exception -> 0x0195 }
        L_0x0195:
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r2)
            throw r0
        L_0x019b:
            java.lang.String r1 = "Technical Issue, please try after some time"
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r1)
            throw r0
        L_0x01a3:
            java.lang.String r1 = "Key code has not been provided in input"
            X.5p1 r0 = new X.5p1     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x01ab }
            r0.<init>(r11, r1)     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x01ab }
            throw r0     // Catch:{ 5p1 -> 0x01b3, Exception -> 0x01ab }
        L_0x01ab:
            java.lang.String r1 = "Error while parsing Key Code from input"
            X.5p1 r0 = new X.5p1
            r0.<init>(r11, r1)
            throw r0
        L_0x01b3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118295uS.A00(android.content.Context, android.os.Bundle, java.lang.String):void");
    }
}
