package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5xB  reason: invalid class name */
public class AnonymousClass5xB {
    public long A00;
    public C35431lv A01;
    public C35301lh A02;
    @Deprecated
    public C35301lh A03;
    public C35301lh A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public AnonymousClass5xB(AnonymousClass173 r8, C28371Vv r9) {
        Class<String> cls = String.class;
        C28371Vv A0J = r9.A0J("amount");
        if (A0J == null) {
            String A052 = C28371Vv.A05(r9, "amount");
            if (A052 != null) {
                this.A03 = C110105dW.A0J(C110105dW.A0L(), cls, A052, "moneyStringValue");
            }
        } else {
            C28371Vv A0J2 = A0J.A0J("money");
            if (A0J2 != null) {
                try {
                    C35431lv A0H = C110105dW.A0H(r8, A0J2);
                    this.A01 = A0H;
                    this.A03 = C110105dW.A0J(C110105dW.A0L(), cls, A0H.A02.toString(), "moneyStringValue");
                } catch (Exception unused) {
                    Log.e("PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node");
                }
            }
        }
        String A0N = r9.A0N("amount-rule", (String) null);
        if (!TextUtils.isEmpty(A0N)) {
            this.A07 = A0N;
        }
        String A0N2 = r9.A0N("is-revocable", (String) null);
        if (A0N2 != null) {
            this.A06 = A0N2;
        }
        String A0N3 = r9.A0N("end-ts", (String) null);
        if (A0N3 != null) {
            this.A00 = C29501aj.A01(A0N3, 0) * 1000;
        }
        String A0N4 = r9.A0N("seq-no", (String) null);
        if (A0N4 != null) {
            this.A04 = C110105dW.A0J(C110105dW.A0L(), cls, A0N4, "upiSequenceNumber");
        }
        String A0N5 = r9.A0N("error-code", (String) null);
        if (A0N5 != null) {
            this.A05 = A0N5;
        }
        String A0N6 = r9.A0N("mandate-update-info", (String) null);
        if (A0N6 != null) {
            this.A02 = C110105dW.A0J(C110105dW.A0L(), cls, A0N6, "upiMandateUpdateInfo");
        }
        String A0N7 = r9.A0N("status", (String) null);
        this.A09 = A0N7 == null ? "INIT" : A0N7;
        String A0N8 = r9.A0N("action", (String) null);
        this.A08 = A0N8 == null ? "UNKNOWN" : A0N8;
    }

    public AnonymousClass5xB(C35431lv r2, C35301lh r3, long j2) {
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = j2;
        this.A08 = "UNKNOWN";
        this.A09 = "INIT";
    }

    public AnonymousClass5xB(String str) {
        C35431lv r2;
        C28411Vz r7 = null;
        long j2 = 0;
        Class<String> cls = String.class;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                C53852gP A0L = C110105dW.A0L();
                C35301lh r22 = this.A03;
                this.A03 = C110105dW.A0J(A0L, cls, A0K.optString("pendingAmount", (String) (r22 == null ? null : r22.A00)), "moneyStringValue");
                if (A0K.optJSONObject("pendingMoney") != null) {
                    JSONObject optJSONObject = A0K.optJSONObject("pendingMoney");
                    if (optJSONObject != null) {
                        j2 = optJSONObject.optLong("value", -1);
                        int optInt = optJSONObject.optInt("offset", -1);
                        int optInt2 = optJSONObject.optInt("currencyType", -1);
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("currency");
                        r7 = optJSONObject2 != null ? optInt2 != 1 ? new C35481m0(optJSONObject2) : new C35531m5(optJSONObject2) : C35481m0.A06;
                        if (optInt > 0) {
                            r2 = new C35431lv(r7, optInt, j2);
                            this.A01 = r2;
                        }
                    }
                    r2 = new C35431lv(r7, 1, j2);
                    this.A01 = r2;
                }
                this.A06 = A0K.optString("isRevocable", this.A06);
                this.A00 = A0K.optLong("mandateEndTs", this.A00);
                this.A07 = A0K.optString("mandateAmountRule", this.A07);
                C53852gP A0L2 = C110105dW.A0L();
                C35301lh r0 = this.A04;
                this.A04 = C110105dW.A0J(A0L2, cls, A0K.optString("seqNum", (String) (r0 == null ? null : r0.A00)), "upiMandateUpdateInfo");
                this.A05 = A0K.optString("errorCode", this.A05);
                this.A09 = A0K.optString("mandateUpdateStatus", this.A09);
                this.A08 = A0K.optString("mandateUpdateAction", this.A08);
                C53852gP A0L3 = C110105dW.A0L();
                C35301lh r02 = this.A02;
                this.A02 = C110105dW.A0J(A0L3, cls, A0K.optString("mandateUpdateInfo", (String) (r02 == null ? null : r02.A00)), "upiMandateUpdateInfo");
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata threw: ", e2);
            }
        }
    }

    public C28401Vy A00() {
        C35301lh r1 = this.A03;
        if (C39841t9.A04(r1)) {
            return null;
        }
        return C110115dX.A0B(C35481m0.A05, (String) r1.A00);
    }

    public boolean A01() {
        String str;
        String str2;
        String str3 = this.A08;
        if (!str3.equals("UNKNOWN")) {
            if (str3.equals("ACCEPT")) {
                str = this.A09;
                str2 = "PENDING";
            }
        }
        str = this.A09;
        str2 = "INIT";
        return str.equals(str2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ pendingAmount: ");
        C35301lh r2 = this.A03;
        if (AnonymousClass000.A0f(r2, A0r) == null) {
            return "";
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass5x3.A03(A0o, r2.toString());
        A0o.append(" errorCode: ");
        A0o.append(this.A05);
        A0o.append(" seqNum: ");
        A0o.append(this.A04);
        A0o.append(" mandateUpdateInfo: ");
        A0o.append(this.A02);
        A0o.append(" mandateUpdateAction: ");
        A0o.append(this.A08);
        A0o.append(" mandateUpdateStatus: ");
        A0o.append(this.A09);
        return AnonymousClass000.A0h("]", A0o);
    }
}
