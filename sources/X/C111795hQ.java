package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5hQ  reason: invalid class name and case insensitive filesystem */
public class C111795hQ extends C39911tG {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(8);
    public int A00;
    public int A01 = 1;
    public String A02;
    public String A03;
    public boolean A04;

    public void A01(AnonymousClass173 r4, C28371Vv r5, int i2) {
        this.A05 = r5.A0N("country", (String) null);
        this.A06 = r5.A0N("credential-id", (String) null);
        this.A02 = C39841t9.A01(r5.A0N("account-number", (String) null), "bankAccountNumber");
        this.A01 = C39841t9.A01(r5.A0N("bank-name", (String) null), "bankName");
        String A0N = r5.A0N("code", (String) null);
        this.A02 = A0N;
        if (A0N == null) {
            this.A02 = r5.A0N("bank-code", (String) null);
        }
        this.A00 = C30671cl.A00(r5.A0N("verification-status", (String) null));
        this.A03 = r5.A0N("short-name", (String) null);
        this.A03 = r5.A0N("bank-image", (String) null);
        this.A04 = "1".equals(r5.A0N("accept-savings", (String) null));
    }

    public void A02(List list, int i2) {
        throw new UnsupportedOperationException("PAY: BrazilBankAccountMethodData toNetwork unsupported");
    }

    public String A03() {
        try {
            JSONObject A0B = A0B();
            A0B.put("v", this.A01);
            C35301lh r0 = this.A01;
            A0B.put("bankName", (r0 == null || C39841t9.A03(r0)) ? "" : this.A01.A00);
            A0B.put("bankCode", this.A02);
            A0B.put("verificationStatus", this.A00);
            return A0B.toString();
        } catch (JSONException e2) {
            Log.w(AnonymousClass000.A0g("PAY: BrazilBankAccountMethodData toDBString threw: ", e2));
            return null;
        }
    }

    public void A04(String str) {
        if (str != null) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                this.A03 = A0K.optString("bankImageURL", (String) null);
                this.A04 = A0K.optString("bankPhoneNumber", (String) null);
                this.A01 = A0K.optInt("v", 1);
                this.A01 = C39841t9.A00(A0K.optString("bankName"), "bankName");
                this.A02 = A0K.optString("bankCode");
                this.A00 = A0K.optInt("verificationStatus");
            } catch (JSONException e2) {
                Log.w(AnonymousClass000.A0g("PAY: BrazilBankAccountMethodData fromDBString threw: ", e2));
            }
        }
    }

    public C30671cl A05() {
        C30681cm A002 = C30681cm.A00("BR");
        if (A002 == null) {
            return null;
        }
        String str = this.A06;
        C35521m4 r4 = new C35521m4(A002, 0, 0, this.A00, -1);
        r4.A0A = str;
        r4.A09("");
        r4.A0B = (String) C110105dW.A0d(this.A01);
        r4.A0D = null;
        r4.A08 = this;
        r4.A04 = this.A00;
        return r4;
    }

    public C35301lh A06() {
        return null;
    }

    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C35481m0.A04));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ credentialId: ");
        A0r.append(this.A06);
        A0r.append("maskedAccountNumber: ");
        A0r.append(this.A02);
        A0r.append(" bankName: ");
        A0r.append(this.A01);
        A0r.append(" bankCode: ");
        A0r.append(this.A02);
        A0r.append(" verificationStatus: ");
        A0r.append(this.A00);
        A0r.append(" bankShortName: ");
        A0r.append(this.A03);
        A0r.append(" acceptSavings: ");
        A0r.append(this.A04);
        return AnonymousClass000.A0h("]", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A01, i2);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeLong(this.A00);
    }
}
