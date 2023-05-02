package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lf  reason: invalid class name and case insensitive filesystem */
public class C35281lf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(73);
    public final C35271le A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C35281lf(C35271le r1, String str, String str2, String str3, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z2;
        this.A00 = r1;
        this.A03 = str3;
    }

    public C35281lf(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readInt() != 1 ? false : true;
        this.A00 = (C35271le) parcel.readParcelable(C35271le.class.getClassLoader());
        this.A03 = parcel.readString();
    }

    public static C35281lf A00(C28371Vv r9) {
        C35271le r4;
        try {
            String A0M = r9.A0M("step_up_id");
            String A0M2 = r9.A0M("service");
            boolean z2 = false;
            if (r9.A0A("sticky_service_hub_cta", 1) == 1) {
                z2 = true;
            }
            String A0N = r9.A0N("step_up_reason", (String) null);
            C28371Vv A0K = r9.A0K("step_up_challenge");
            String A0M3 = A0K.A0M("challenge_id");
            C28371Vv A0H = A0K.A0H();
            String str = A0H.A00;
            if (str.equals("webview")) {
                boolean z3 = true;
                try {
                    if (A0H.A0A("auth_required", 1) != 1) {
                        z3 = false;
                    }
                    r4 = new C35261ld(A0M3, z3);
                } catch (AnonymousClass1W9 e2) {
                    Log.e("PAY: Can't build WebViewChallenge ", e2);
                }
            } else {
                if (str.equals("document_upload")) {
                    r4 = new C77643w7(A0M3);
                }
                r4 = null;
            }
            return new C35281lf(r4, A0M2, A0M, A0N, z2);
        } catch (AnonymousClass1W9 e3) {
            Log.e("PAY: PaymentStepUpInfo/fromProtocolTreeNode ", e3);
            return null;
        }
    }

    public static C35281lf A01(String str) {
        C35271le r4;
        if (!AnonymousClass1ZW.A0E(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("service");
                String string2 = jSONObject.getString("step_up_id");
                boolean optBoolean = jSONObject.optBoolean("sticky_service_hub_cta", true);
                JSONObject jSONObject2 = jSONObject.getJSONObject("step_up_challenge");
                try {
                    String string3 = jSONObject2.getString("type");
                    if (string3.equals("WEBVIEW")) {
                        try {
                            r4 = new C35261ld(jSONObject2.getString("challenge_id"), jSONObject2.getBoolean("auth_required"));
                        } catch (JSONException e2) {
                            Log.e("PAY: WebViewChallenge fromJsonObject threw exception ", e2);
                        }
                        return new C35281lf(r4, string, string2, jSONObject.optString("step_up_reason", (String) null), optBoolean);
                    }
                    if (string3.equals("DOC_UPLOAD")) {
                        try {
                            r4 = new C77643w7(jSONObject2.getString("challenge_id"));
                        } catch (JSONException e3) {
                            Log.e("PAY: DocumentUploadChallenge fromJsonObject threw exception ", e3);
                        }
                        return new C35281lf(r4, string, string2, jSONObject.optString("step_up_reason", (String) null), optBoolean);
                    }
                    r4 = null;
                    return new C35281lf(r4, string, string2, jSONObject.optString("step_up_reason", (String) null), optBoolean);
                } catch (JSONException e4) {
                    Log.e("PAY: PaymentStepUpChallenge fromJsonObject threw exception ", e4);
                }
            } catch (JSONException e5) {
                Log.e("PAY: PaymentStepUpInfo fromJsonString threw exception ", e5);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[Catch:{ JSONException -> 0x007e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject A02() {
        /*
            r7 = this;
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r1 = "service"
            java.lang.String r0 = r7.A01     // Catch:{ JSONException -> 0x007e }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r1 = "step_up_id"
            java.lang.String r0 = r7.A02     // Catch:{ JSONException -> 0x007e }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r1 = "sticky_service_hub_cta"
            boolean r0 = r7.A04     // Catch:{ JSONException -> 0x007e }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x007e }
            X.1le r6 = r7.A00     // Catch:{ JSONException -> 0x007e }
            java.lang.String r1 = r6.A00     // Catch:{ JSONException -> 0x007e }
            java.lang.String r2 = "WEBVIEW"
            boolean r0 = r1.equals(r2)     // Catch:{ JSONException -> 0x007e }
            java.lang.String r4 = "step_up_challenge"
            if (r0 == 0) goto L_0x004f
            X.1ld r6 = (X.C35261ld) r6     // Catch:{ JSONException -> 0x007e }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007e }
            r5.<init>()     // Catch:{ JSONException -> 0x007e }
            java.lang.String r1 = "challenge_id"
            java.lang.String r0 = r6.A01     // Catch:{ JSONException -> 0x0048 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r0 = "type"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r1 = "auth_required"
            boolean r0 = r6.A00     // Catch:{ JSONException -> 0x0048 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x0070
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "PAY: WebViewChallenge toJson threw exception "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x007e }
            goto L_0x0070
        L_0x004f:
            java.lang.String r2 = "DOC_UPLOAD"
            boolean r0 = r1.equals(r2)     // Catch:{ JSONException -> 0x007e }
            if (r0 == 0) goto L_0x0073
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007e }
            r5.<init>()     // Catch:{ JSONException -> 0x007e }
            java.lang.String r1 = "challenge_id"
            java.lang.String r0 = r6.A01     // Catch:{ JSONException -> 0x006a }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x006a }
            java.lang.String r0 = "type"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x006a }
            goto L_0x0070
        L_0x006a:
            r1 = move-exception
            java.lang.String r0 = "PAY: DocumentUploadChallenge toJson threw exception "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x007e }
        L_0x0070:
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x007e }
        L_0x0073:
            java.lang.String r1 = r7.A03     // Catch:{ JSONException -> 0x007e }
            if (r1 == 0) goto L_0x0084
            java.lang.String r0 = "step_up_reason"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x007e }
            return r3
        L_0x007e:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentStepUpInfo toJson threw exception "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0084:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35281lf.A02():org.json.JSONObject");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A00, 0);
        String str = this.A03;
        if (str != null) {
            parcel.writeString(str);
        }
    }
}
