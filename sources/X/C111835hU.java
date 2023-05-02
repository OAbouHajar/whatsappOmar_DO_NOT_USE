package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5hU  reason: invalid class name and case insensitive filesystem */
public class C111835hU extends C39931tI {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(1);
    public C35301lh A00;
    public C111805hR A01;
    public String A02;

    public void A01(AnonymousClass173 r4, C28371Vv r5, int i2) {
        String A05 = C28371Vv.A05(r5, "display-state");
        if (TextUtils.isEmpty(A05)) {
            A05 = "ACTIVE";
        }
        this.A06 = A05;
        this.A08 = r5.A0N("merchant-id", (String) null);
        this.A02 = r5.A0N("business-name", (String) null);
        this.A03 = r5.A0N("country", (String) null);
        this.A04 = r5.A0N("credential-id", (String) null);
        this.A00 = C39841t9.A01(r5.A0N("vpa", (String) null), "upiHandle");
        this.A02 = r5.A0N("vpa-id", (String) null);
        C28371Vv A0J = r5.A0J("bank");
        if (A0J != null) {
            C111805hR r0 = new C111805hR();
            this.A01 = r0;
            r0.A01(r4, A0J, i2);
        }
    }

    public void A02(List list, int i2) {
        throw new UnsupportedOperationException("PAY: IndiaUpiMerchantData toNetwork unsupported");
    }

    public String A03() {
        return A0A().toString();
    }

    public void A04(String str) {
        if (str != null) {
            try {
                A0B(C13700nu.A0K(str));
            } catch (JSONException unused) {
                Log.e("PAY: IndiaUpiMerchantMethodData fromDBString threw JSONException");
            }
        }
    }

    public C30671cl A05() {
        return new C35441lw(C30681cm.A00("IN"), this, this.A04, this.A07, this.A08, this.A02, this.A0D, this.A0E);
    }

    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C35481m0.A05));
    }

    public JSONObject A0A() {
        JSONObject A0A = super.A0A();
        try {
            C35301lh r1 = this.A00;
            if (!C39841t9.A04(r1)) {
                C110115dX.A11(r1, "vpaHandle", A0A);
            }
            String str = this.A02;
            if (str != null) {
                A0A.put("vpaId", str);
            }
            if (this.A01 != null) {
                JSONObject A0J = C13700nu.A0J();
                C35301lh r12 = this.A01.A02;
                if (r12 != null) {
                    C110115dX.A11(r12, "accountNumber", A0J);
                }
                C35301lh r13 = this.A01.A01;
                if (r13 != null) {
                    C110115dX.A11(r13, "bankName", A0J);
                }
                A0A.put("bank", A0J);
                return A0A;
            }
        } catch (JSONException unused) {
            Log.e("PAY: IndiaUpiMerchantMethodData toJSONObject threw JSONException");
        }
        return A0A;
    }

    public void A0B(JSONObject jSONObject) {
        super.A0B(jSONObject);
        this.A00 = C39841t9.A01(jSONObject.optString("vpaHandle"), "upiHandle");
        this.A02 = jSONObject.optString("vpaId");
        JSONObject optJSONObject = jSONObject.optJSONObject("bank");
        if (optJSONObject != null) {
            C111805hR r2 = new C111805hR();
            this.A01 = r2;
            r2.A02 = C39841t9.A01(optJSONObject.optString("accountNumber", (String) null), "bankAccountNumber");
            this.A01.A01 = C39841t9.A01(optJSONObject.optString("bankName"), "bankName");
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiMerchantMethodData{version=");
        A0r.append(1);
        A0r.append(", vpaId='");
        A0r.append(this.A02);
        A0r.append('\'');
        A0r.append(", vpaHandle=");
        A0r.append(this.A00);
        A0r.append("} ");
        return AnonymousClass000.A0h(super.toString(), A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i2);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i2);
    }
}
