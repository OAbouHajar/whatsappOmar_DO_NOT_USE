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

/* renamed from: X.5hT  reason: invalid class name and case insensitive filesystem */
public class C111825hT extends C39931tI {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(11);
    public int A00 = 0;
    public String A01;
    public String A02;
    public String A03;

    public void A01(AnonymousClass173 r8, C28371Vv r9, int i2) {
        C30671cl A05;
        int i3;
        boolean equals = "1".equals(r9.A0N("can-sell", (String) null));
        boolean A1U = C110105dW.A1U(r9, "can-payout", "1");
        boolean A1U2 = C110105dW.A1U(r9, "can-add-payout", "1");
        int i4 = 0;
        if (A1U) {
            i4 = 2;
        }
        int i5 = (equals ? 1 : 0) + i4;
        int i6 = 0;
        if (A1U2) {
            i6 = 4;
        }
        this.A00 = i5 + i6;
        String A0N = r9.A0N("display-state", (String) null);
        if (TextUtils.isEmpty(A0N)) {
            A0N = "ACTIVE";
        }
        this.A06 = A0N;
        this.A08 = r9.A0N("merchant-id", (String) null);
        this.A0D = C110105dW.A1U(r9, "p2m-eligible", "1");
        this.A0E = C110105dW.A1U(r9, "p2p-eligible", "1");
        this.A0B = r9.A0N("support-phone-number", (String) null);
        this.A02 = r9.A0N("business-name", (String) null);
        this.A02 = r9.A0N("gateway-name", (String) null);
        this.A03 = r9.A0N("country", (String) null);
        this.A04 = r9.A0N("credential-id", (String) null);
        this.A01 = C29501aj.A01(r9.A0N("created", (String) null), 0);
        this.A05 = r9.A0N("dashboard-url", (String) null);
        this.A0A = r9.A0N("provider_contact_website", (String) null);
        this.A07 = r9.A0N("logo-uri", (String) null);
        this.A0C = AnonymousClass000.A0u();
        for (C28371Vv r2 : r9.A0O("payout")) {
            String A0N2 = r2.A0N("type", (String) null);
            if ("bank".equals(A0N2)) {
                C111795hQ r0 = new C111795hQ();
                r0.A01(r8, r2, 0);
                A05 = r0.A05();
                if (A05 != null) {
                    i3 = r0.A00;
                }
            } else if ("prepaid-card".equals(A0N2)) {
                C111815hS r1 = new C111815hS();
                r1.A01(r8, r2, 0);
                r1.A00 = 8;
                A05 = r1.A05();
                i3 = r1.A01;
            }
            A05.A04 = i3;
            A05.A0C = this.A04;
            this.A0C.add(A05);
        }
    }

    public void A02(List list, int i2) {
        throw new UnsupportedOperationException("PAY: BrazilMerchantMethodData toNetwork unsupported");
    }

    public String A03() {
        JSONObject A0A = A0A();
        try {
            A0A.put("v", 1);
            if (!TextUtils.isEmpty(this.A05)) {
                A0A.put("dashboardUrl", this.A05);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                A0A.put("notificationType", this.A03);
            }
            if (!TextUtils.isEmpty(this.A02)) {
                A0A.put("gatewayName", this.A02);
            }
            if (!TextUtils.isEmpty(this.A0A)) {
                A0A.put("providerContactWebsite", this.A0A);
            }
            A0A.put("p2mEligible", this.A0D);
            A0A.put("p2pEligible", this.A0E);
            return C110115dX.A0f(this.A07, "logoUri", A0A);
        } catch (JSONException e2) {
            Log.w(AnonymousClass000.A0g("PAY: BrazilMerchantMethodData toDBString threw: ", e2));
            return null;
        }
    }

    public void A04(String str) {
        if (str != null) {
            try {
                JSONObject A0K = C13700nu.A0K(str);
                A0B(A0K);
                this.A00 = A0K.optInt("state", 0);
                this.A08 = A0K.optString("merchantId", (String) null);
                this.A0D = A0K.optBoolean("p2mEligible", false);
                this.A0E = A0K.optBoolean("p2pEligible", false);
                this.A0B = A0K.optString("supportPhoneNumber", (String) null);
                this.A05 = A0K.optString("dashboardUrl", (String) null);
                this.A03 = A0K.optString("notificationType", (String) null);
                this.A02 = A0K.optString("gatewayName", (String) null);
                this.A0A = A0K.optString("providerContactWebsite", (String) null);
                this.A07 = A0K.optString("logoUri", (String) null);
            } catch (JSONException e2) {
                Log.w(AnonymousClass000.A0g("PAY: BrazilMerchantMethodData fromDBString threw: ", e2));
            }
        }
    }

    public C30671cl A05() {
        C30681cm A002 = C30681cm.A00("BR");
        if (A002 == null) {
            return null;
        }
        return new C35441lw(A002, this, this.A04, this.A07, this.A08, this.A02, this.A0D, this.A0E);
    }

    public LinkedHashSet A08() {
        return new LinkedHashSet(Collections.singletonList(C35481m0.A04));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ merchantId: ");
        String str = this.A08;
        A0r.append(str);
        A0r.append(" p2mEligible: ");
        A0r.append(this.A0D);
        A0r.append(" p2pEligible: ");
        A0r.append(this.A0E);
        A0r.append(" state: ");
        A0r.append(this.A00);
        A0r.append(" supportPhoneNumber: ");
        A0r.append(this.A0B);
        A0r.append(" dashboardUrl: ");
        A0r.append(this.A05);
        A0r.append(" merchantId: ");
        A0r.append(str);
        A0r.append(" businessName: ");
        A0r.append(this.A02);
        A0r.append(" displayState: ");
        A0r.append(this.A06);
        A0r.append(" providerContactWebsite: ");
        A0r.append(this.A0A);
        A0r.append(" logoUri: ");
        A0r.append(this.A07);
        return AnonymousClass000.A0h("]", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A02);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
    }
}
