package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.1lt  reason: invalid class name and case insensitive filesystem */
public class C35411lt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(41);
    public final C35401ls A00;

    public C35411lt(C35401ls r1) {
        this.A00 = r1;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        JSONObject A07 = AnonymousClass1W1.A07(this.A00, true);
        return A07 != null ? A07.toString() : "<json serialization failed>";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C35401ls r2 = this.A00;
        C30671cl r1 = r2.A01;
        parcel.writeInt(r1.A04());
        parcel.writeString((String) null);
        parcel.writeString(r1.A07.A03);
        parcel.writeString(r1.A0A);
        C35301lh r0 = r1.A09;
        parcel.writeString((String) (r0 == null ? null : r0.A00));
        if (r1 instanceof C35391lr) {
            parcel.writeInt(((C35391lr) r1).A01);
        }
        BigDecimal bigDecimal = r2.A02.A00;
        parcel.writeInt(bigDecimal.scale());
        parcel.writeString(bigDecimal.toString());
        parcel.writeInt(r2.A00);
    }
}
