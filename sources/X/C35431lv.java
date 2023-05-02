package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lv  reason: invalid class name and case insensitive filesystem */
public class C35431lv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(39);
    public final int A00;
    public final C28411Vz A01;
    public final C28401Vy A02;

    public C35431lv(C28411Vz r6, int i2, long j2) {
        AnonymousClass00B.A0C("offset must be a number greater or equal to zero", true);
        this.A00 = i2;
        this.A01 = r6;
        this.A02 = new C28401Vy(new BigDecimal(((double) j2) / ((double) i2)), ((C35491m1) r6).A01);
    }

    public C35431lv(Parcel parcel) {
        this.A02 = (C28401Vy) parcel.readParcelable(C28401Vy.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A01 = AnonymousClass173.A00(parcel);
    }

    public int A00() {
        return (int) (this.A02.A00.doubleValue() * ((double) this.A00));
    }

    public JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            double doubleValue = this.A02.A00.doubleValue();
            int i2 = this.A00;
            jSONObject.put("value", (int) (doubleValue * ((double) i2)));
            jSONObject.put("offset", i2);
            C28411Vz r2 = this.A01;
            jSONObject.put("currencyType", ((C35491m1) r2).A00);
            jSONObject.put("currency", r2.Ags());
            return jSONObject;
        } catch (JSONException e2) {
            Log.w("PAY: PaymentMoney toJson threw: ", e2);
            return jSONObject;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35431lv r5 = (C35431lv) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (31 * this.A02.hashCode()) + this.A00 + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentMoney{amount=");
        sb.append(this.A02);
        sb.append(", offset=");
        sb.append(this.A00);
        sb.append(", currency=");
        sb.append(((C35491m1) this.A01).A04);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A02, 1);
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i2);
    }
}
