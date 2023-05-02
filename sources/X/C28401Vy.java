package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Vy  reason: invalid class name and case insensitive filesystem */
public class C28401Vy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(29);
    public final BigDecimal A00;

    public C28401Vy(Parcel parcel) {
        this.A00 = (BigDecimal) parcel.readSerializable();
    }

    public C28401Vy(BigDecimal bigDecimal, int i2) {
        this.A00 = bigDecimal.setScale(i2, 6);
    }

    public static C28401Vy A00(String str, int i2) {
        try {
            return new C28401Vy(new BigDecimal(str), i2);
        } catch (NumberFormatException e2) {
            Log.i("Pay: PaymentTransactionInfo.MethodInfo createFromParcel threw: ", e2);
            return null;
        }
    }

    public JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount", toString());
            return jSONObject;
        } catch (JSONException e2) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e2);
            return jSONObject;
        }
    }

    public boolean A02() {
        BigDecimal bigDecimal = this.A00;
        return bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) >= 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BigDecimal bigDecimal = this.A00;
                BigDecimal bigDecimal2 = ((C28401Vy) obj).A00;
                if (bigDecimal == null) {
                    if (bigDecimal2 != null) {
                        return false;
                    }
                } else if (bigDecimal.compareTo(bigDecimal2) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.A00;
        return 31 + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return this.A00.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.A00);
    }
}
