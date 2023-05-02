package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.60V  reason: invalid class name */
public class AnonymousClass60V implements C227219a {
    public final C16440t3 A00;
    public final C14710pd A01;
    public final AnonymousClass175 A02;
    public final C18300wT A03;

    public AnonymousClass60V(C16440t3 r1, C14710pd r2, AnonymousClass175 r3, C18300wT r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static String A00(AnonymousClass60V r0) {
        return (String) r0.A05().A00;
    }

    public static JSONObject A01(C18300wT r1) {
        String A04 = r1.A04();
        return TextUtils.isEmpty(A04) ? new JSONObject() : new JSONObject(A04);
    }

    public static final JSONObject A02(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str2);
            if (optJSONObject == null) {
                optJSONObject = C13700nu.A0J();
                jSONObject.put(str2, optJSONObject);
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
            if (optJSONObject2 != null) {
                return optJSONObject2;
            }
            JSONObject A0J = C13700nu.A0J();
            optJSONObject.put(str, A0J);
            return A0J;
        } catch (JSONException e2) {
            StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUpiPaymentSharedPrefs getOrInsertFieldByPsP for field: ");
            A0r.append(str2);
            Log.w(AnonymousClass000.A0h(" threw: ", A0r), e2);
            return null;
        }
    }

    public static void A03(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.put(str, AnonymousClass5x3.A00(optString));
        }
    }

    public synchronized int A04() {
        int i2;
        try {
            String A04 = this.A03.A04();
            if (!TextUtils.isEmpty(A04)) {
                i2 = C13700nu.A0K(A04).optInt("device_binding_sim_subscripiton_id", -1);
            }
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getSimIndex threw: ", e2);
        }
        i2 = 0;
        return i2;
    }

    public synchronized C35301lh A05() {
        String str;
        str = null;
        try {
            String A04 = this.A03.A04();
            if (!TextUtils.isEmpty(A04)) {
                str = C13700nu.A0K(A04).optString("vpa", (String) null);
            }
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readAccountHandle threw: ", e2);
        }
        return C110105dW.A0J(C110105dW.A0L(), String.class, str, "upiHandle");
    }

    public synchronized C35301lh A06() {
        byte[] bArr;
        bArr = null;
        try {
            String A04 = this.A03.A04();
            if (!TextUtils.isEmpty(A04)) {
                JSONObject A0K = C13700nu.A0K(A04);
                String optString = A0K.optString("token", (String) null);
                long optLong = A0K.optLong("tokenTs", 0);
                long millis = TimeUnit.DAYS.toMillis(20);
                if (!TextUtils.isEmpty(optString) && this.A00.A00() - optLong < millis) {
                    bArr = Base64.decode(optString, 0);
                }
            }
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readToken threw: ", e2);
        }
        return C110105dW.A0J(C110105dW.A0L(), byte[].class, bArr, "sessionToken");
    }

    public String A07() {
        try {
            String A04 = this.A03.A04();
            if (!TextUtils.isEmpty(A04)) {
                return C13700nu.A0K(A04).optString("sequenceNumberPrefix", "ICIWC");
            }
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPaymentSequenceNumberPrefix threw: ", e2);
        }
        return "ICIWC";
    }

    public String A08() {
        try {
            String A04 = this.A03.A04();
            if (!TextUtils.isEmpty(A04)) {
                return C13700nu.A0K(A04).optString("psp", (String) null);
            }
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPsp threw: ", e2);
        }
        return null;
    }

    public synchronized String A09() {
        return this.A03.A01().getString("payments_upi_aliases", (String) null);
    }

    public synchronized String A0A() {
        String[] A0U;
        A0U = A0U("device_binding_sim_iccid");
        if (A0U[0] == null) {
            A0U = A0U("device_binding_sim_id");
        }
        return A0U[0];
    }

    public synchronized String A0B() {
        return this.A03.A01().getString("payments_upi_international_status", (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[Catch:{ JSONException -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0C() {
        /*
            r10 = this;
            monitor-enter(r10)
            r6 = 0
            X.0wT r0 = r10.A03     // Catch:{ JSONException -> 0x003b }
            java.lang.String r1 = r0.A04()     // Catch:{ JSONException -> 0x003b }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x003b }
            if (r0 != 0) goto L_0x0046
            org.json.JSONObject r3 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r0 = "listKeys"
            java.lang.String r9 = r3.optString(r0, r6)     // Catch:{ JSONException -> 0x003b }
            java.lang.String r2 = "listKeysTs"
            r0 = 0
            long r7 = r3.optLong(r2, r0)     // Catch:{ JSONException -> 0x003b }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ JSONException -> 0x003b }
            r0 = 1
            long r4 = r2.toMillis(r0)     // Catch:{ JSONException -> 0x003b }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x003b }
            if (r0 != 0) goto L_0x0042
            X.0t3 r0 = r10.A00     // Catch:{ JSONException -> 0x003b }
            long r2 = r0.A00()     // Catch:{ JSONException -> 0x003b }
            long r2 = r2 - r7
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0043
            goto L_0x0042
        L_0x003b:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readListKeys threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            r6 = r9
        L_0x0046:
            monitor-exit(r10)
            return r6
        L_0x0048:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60V.A0C():java.lang.String");
    }

    public synchronized String A0D() {
        String str;
        str = null;
        try {
            String A04 = this.A03.A04();
            if (!TextUtils.isEmpty(A04)) {
                str = C13700nu.A0K(A04).optString("vpaId", (String) null);
            }
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readVpaId threw: ", e2);
        }
        return str;
    }

    public synchronized void A0E() {
        try {
            C18300wT r2 = this.A03;
            JSONObject A012 = A01(r2);
            A012.remove("listKeys");
            A012.remove("listKeysTs");
            C110105dW.A1J(r2, A012);
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e2);
        }
        return;
    }

    public synchronized void A0F() {
        try {
            C18300wT r2 = this.A03;
            JSONObject A012 = A01(r2);
            A012.remove("token");
            A012.remove("tokenTs");
            A012.remove("listKeys");
            A012.remove("listKeysTs");
            C110105dW.A1J(r2, A012);
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e2);
        }
        return;
    }

    public synchronized void A0G(int i2) {
        try {
            C18300wT r2 = this.A03;
            JSONObject A012 = A01(r2);
            A012.put("device_binding_sim_subscripiton_id", i2);
            C110105dW.A1J(r2, A012);
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs setSimIndex threw: ", e2);
        }
        return;
    }

    public synchronized void A0H(C35301lh r3, String str) {
        try {
            C18300wT r1 = this.A03;
            JSONObject A012 = A01(r1);
            A0I(r3, str, A012);
            C110105dW.A1J(r1, A012);
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeVpaHandle threw: ", e2);
        }
        return;
    }

    public final synchronized void A0I(C35301lh r4, String str, JSONObject jSONObject) {
        jSONObject.put("v", "2");
        Object obj = r4.A00;
        AnonymousClass00B.A06(obj);
        jSONObject.put("vpa", obj);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("vpaId", str);
        }
        jSONObject.put("vpaTs", this.A00.A00());
    }

    public synchronized void A0J(String str) {
        try {
            C18300wT r5 = this.A03;
            String A04 = r5.A04();
            long A002 = this.A00.A00();
            JSONObject A0J = TextUtils.isEmpty(A04) ? C13700nu.A0J() : C13700nu.A0K(A04);
            A0J.put("v", "2");
            A0J.put("listKeys", str);
            A0J.put("listKeysTs", A002);
            C110105dW.A1J(r5, A0J);
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("PAY: IndiaUpiPaymentSharedPrefs storeListKeys at timestamp: ");
            A0o.append(A002);
            C13680ns.A1V(A0o);
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeListKeys threw: ", e2);
        }
        return;
    }

    public synchronized void A0K(String str, String str2, String str3) {
        try {
            C18300wT r2 = this.A03;
            JSONObject A0k = C110105dW.A0k(r2);
            A0L(str, str2, A0k);
            if (!TextUtils.isEmpty(str3)) {
                A0k.put("device_binding_sim_id", str3);
            }
            A0k.remove("device_binding_sim_subscripiton_id");
            C110105dW.A1J(r2, A0k);
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeDeviceBinding threw: ", e2);
        }
        return;
    }

    public final synchronized void A0L(String str, String str2, JSONObject jSONObject) {
        jSONObject.put("v", "2");
        jSONObject.put("psp", str);
        jSONObject.put("sequenceNumberPrefix", str2);
        JSONObject A022 = A02(str, "devBindingByPsp", jSONObject);
        if (A022 != null) {
            A022.put("devBinding", true);
        }
    }

    public synchronized void A0M(JSONArray jSONArray) {
        C18300wT r0 = this.A03;
        C13680ns.A0y(C110105dW.A06(r0), "payments_upi_aliases", jSONArray.toString());
    }

    public synchronized void A0N(JSONArray jSONArray) {
        C18300wT r0 = this.A03;
        C13680ns.A0y(C110105dW.A06(r0), "payments_upi_international_status", jSONArray.toString());
    }

    public synchronized void A0O(boolean z2) {
        C13680ns.A0z(C110105dW.A06(this.A03), "is_payment_account_created", z2);
    }

    public synchronized boolean A0P() {
        return this.A03.A01().getBoolean("is_payment_account_created", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2.A01.A0C(1644) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0Q() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.0wT r0 = r2.A03     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.A0P()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            X.0pd r1 = r2.A01     // Catch:{ all -> 0x0017 }
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r1 = r1.A0C(r0)     // Catch:{ all -> 0x0017 }
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            monitor-exit(r2)
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60V.A0Q():boolean");
    }

    public synchronized boolean A0R() {
        boolean z2;
        if (A0Q()) {
            String A08 = A08();
            if (TextUtils.isEmpty(A08) || !A0T(A08)) {
                z2 = true;
            }
        }
        z2 = false;
        return z2;
    }

    public boolean A0S(C111805hR r7, AnonymousClass61W r8, String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str) || !A0T(str)) {
            return false;
        }
        if (!this.A01.A0C(1661)) {
            return true;
        }
        if (r7 == null || (arrayList = r7.A0G) == null) {
            return false;
        }
        boolean contains = arrayList.contains(str);
        if (!contains) {
            C53842gO r2 = new C53842gO();
            r2.A0a = "redo_device_binding";
            C110115dX.A10(r2, 0);
            r2.A01 = Boolean.valueOf(this.A02.A0G("add_bank"));
            r8.AKR(r2);
            A7n(str, true);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r0 = (r1 = r0.optJSONObject(r5)).optBoolean("devBinding", false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0T(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
            X.0wT r0 = r4.A03     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r0.A04()     // Catch:{ JSONException -> 0x0030 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0030 }
            if (r0 != 0) goto L_0x0038
            org.json.JSONObject r2 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r0 = "devBindingByPsp"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            org.json.JSONObject r1 = r0.optJSONObject(r5)     // Catch:{ JSONException -> 0x0030 }
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = "devBinding"
            boolean r0 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0029
            goto L_0x0037
        L_0x0029:
            java.lang.String r0 = "devBinding"
            boolean r3 = r2.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0037:
            r3 = r0
        L_0x0038:
            monitor-exit(r4)
            return r3
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60V.A0T(java.lang.String):boolean");
    }

    public final String[] A0U(String... strArr) {
        try {
            String A04 = this.A03.A04();
            if (!TextUtils.isEmpty(A04)) {
                JSONObject A0K = C13700nu.A0K(A04);
                int length = strArr.length;
                String[] strArr2 = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr2[i2] = A0K.optString(strArr[i2], (String) null);
                }
                return strArr2;
            }
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readFromPaymentInfo for keys threw: ", e2);
        }
        return new String[strArr.length];
    }

    public void A7m() {
        C18300wT r2 = this.A03;
        C110105dW.A06(r2).remove("payments_upi_aliases").apply();
        try {
            JSONObject A0k = C110105dW.A0k(r2);
            A0k.remove("token");
            A0k.remove("tokenTs");
            A0k.remove("vpa");
            A0k.remove("vpaId");
            A0k.remove("vpaTs");
            A0k.remove("listKeys");
            A0k.remove("listKeysTs");
            A0k.remove("skipDevBinding");
            A0k.remove("devBindingByPsp");
            A0k.remove("psp");
            A0k.remove("sequenceNumberPrefix");
            A0k.remove("devBinding");
            A0k.remove("signedQrCode");
            A0k.remove("signedQrCodeTs");
            C110105dW.A1J(r2, A0k);
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e2);
        }
    }

    public synchronized boolean A7n(String str, boolean z2) {
        boolean z3;
        try {
            C18300wT r2 = this.A03;
            String A04 = r2.A04();
            if (!TextUtils.isEmpty(A04)) {
                JSONObject A0K = C13700nu.A0K(A04);
                if (TextUtils.isEmpty(str)) {
                    A0K.remove("smsVerifDataSentToPsp");
                    A0K.remove("devBindingByPsp");
                } else {
                    JSONObject optJSONObject = A0K.optJSONObject("smsVerifDataSentToPsp");
                    if (optJSONObject != null) {
                        optJSONObject.remove(str);
                    }
                    JSONObject optJSONObject2 = A0K.optJSONObject("devBindingByPsp");
                    if (optJSONObject2 != null) {
                        optJSONObject2.remove(str);
                    }
                }
                if (z2) {
                    A0K.remove("psp");
                }
                A0K.remove("sequenceNumberPrefix");
                A0K.remove("skipDevBinding");
                A0K.remove("smsVerifData");
                A0K.remove("smsVerifDataGateway");
                A0K.remove("devBinding");
                A0K.remove("smsVerifDataGen");
                A0K.remove("device_binding_sim_iccid");
                A0K.remove("device_binding_sim_id");
                A0K.remove("device_binding_sim_subscripiton_id");
                C110105dW.A1J(r2, A0K);
            }
            z3 = true;
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteDeviceBinding threw: ", e2);
            z3 = false;
        }
        return z3;
    }

    public boolean Af9(AnonymousClass1W2 r3) {
        return !this.A02.A0E() && A05().A00();
    }

    public synchronized boolean AhN(long j2, boolean z2) {
        this.A02.A09("tos_no_wallet");
        C13680ns.A0z(C110105dW.A06(this.A03), "payment_account_recovered", true);
        return true;
    }

    public synchronized boolean AhX(C39901tF r6) {
        boolean z2;
        synchronized (this) {
            if (r6 != null) {
                if (r6 instanceof C111805hR) {
                    C111805hR r62 = (C111805hR) r6;
                    A0H(r62.A09, r62.A0F);
                    String str = r62.A0A;
                    try {
                        C18300wT r2 = this.A03;
                        JSONObject A0k = C110105dW.A0k(r2);
                        if (!TextUtils.isEmpty(str)) {
                            A0k.put("psp", str);
                        }
                        C110105dW.A1J(r2, A0k);
                    } catch (JSONException unused) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storePsp threw");
                    }
                    z2 = true;
                }
            }
            z2 = false;
        }
        return z2;
    }

    public String toString() {
        try {
            JSONObject A0k = C110105dW.A0k(this.A03);
            A0k.put("listKeys", !TextUtils.isEmpty(A0k.optString("listKeys")) ? "[keys exist]" : "[no keys]");
            String optString = A0k.optString("vpa");
            if (!TextUtils.isEmpty(optString)) {
                A0k.put("vpa", AnonymousClass5x3.A02(optString));
            }
            String optString2 = A0k.optString("smsVerifDataGateway");
            if (!TextUtils.isEmpty(optString2)) {
                A0k.put("smsVerifDataGateway", optString2);
            }
            A03("smsVerifDataGen", A0k);
            A03("smsVerifData", A0k);
            A03("token", A0k);
            JSONObject optJSONObject = A0k.optJSONObject("smsVerifDataSentToPsp");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(AnonymousClass000.A0m(keys));
                    if (optJSONObject2 != null) {
                        A03("smsVerifData", optJSONObject2);
                    }
                }
            }
            return A0k.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs toString threw: ", e2);
            return "";
        }
    }
}
