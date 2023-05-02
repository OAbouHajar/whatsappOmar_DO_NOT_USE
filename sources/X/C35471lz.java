package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import org.json.JSONObject;

/* renamed from: X.1lz  reason: invalid class name and case insensitive filesystem */
public class C35471lz implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(35);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C35471lz(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public C35471lz(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    public C35471lz(JSONObject jSONObject) {
        this.A02 = jSONObject.optString("offer-id");
        this.A01 = jSONObject.optString("offer-claim-id");
        this.A03 = jSONObject.optString("parent-transaction-id");
        this.A00 = jSONObject.optString("incentive-payment-id");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentIncentiveData{offerId='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", offerClaimId='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", parentTransactionId='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", incentiveTransactionId='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }
}
