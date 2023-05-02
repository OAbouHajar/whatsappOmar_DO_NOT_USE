package X;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1m1  reason: invalid class name and case insensitive filesystem */
public abstract class C35491m1 implements C28411Vz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public C35491m1(int i2, Parcel parcel) {
        this.A00 = i2;
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
    }

    public C35491m1(String str, String str2, int i2, int i3, int i4, int i5) {
        boolean z2 = false;
        AnonymousClass00B.A0B("BasePaymentCurrency offset should be >= 1", i3 >= 1);
        AnonymousClass00B.A0B("BasePaymentCurrency display exponent should be >= 0", i4 >= 0 ? true : z2);
        this.A04 = str;
        this.A05 = str2;
        this.A00 = i2;
        this.A02 = i3;
        this.A03 = i5;
        this.A01 = i4;
    }

    public C35491m1(JSONObject jSONObject) {
        this.A04 = jSONObject.optString("code");
        this.A05 = jSONObject.optString("symbol");
        this.A00 = jSONObject.optInt("currencyType");
        this.A02 = jSONObject.optInt("offset");
        this.A03 = jSONObject.optInt("weight");
        this.A01 = jSONObject.optInt("displayExponent");
    }

    public /* synthetic */ CharSequence A9E(Context context, String str) {
        return this instanceof C35531m5 ? C39791t4.A00(context, str) : str;
    }

    public String ABH(AnonymousClass013 r4) {
        if (!(this instanceof C35481m0)) {
            return this.A05;
        }
        String str = this.A04;
        String str2 = this.A05;
        if (C39741sz.A00.contains(str)) {
            return str2;
        }
        C39651sq r1 = C39651sq.A02;
        if (!TextUtils.isEmpty(str)) {
            r1 = new C39651sq(str);
        }
        return r1.A02(r4);
    }

    public JSONObject Ags() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.A04);
            jSONObject.put("symbol", this.A05);
            jSONObject.put("offset", this.A02);
            jSONObject.put("displayExponent", this.A01);
            jSONObject.put("weight", this.A03);
            jSONObject.put("currencyType", this.A00);
            return jSONObject;
        } catch (JSONException e2) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e2);
            return jSONObject;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35491m1)) {
            return false;
        }
        C35491m1 r4 = (C35491m1) obj;
        return this.A04.equals(r4.A04) && this.A05.equals(r4.A05) && this.A00 == r4.A00 && this.A02 == r4.A02 && this.A01 == r4.A01 && this.A03 == r4.A03;
    }

    public int hashCode() {
        return (this.A04.hashCode() * 31) + (this.A05.hashCode() * 31) + this.A00 + this.A02 + this.A01 + this.A03;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
    }
}
