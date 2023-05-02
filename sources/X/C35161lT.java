package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lT  reason: invalid class name and case insensitive filesystem */
public class C35161lT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(85);
    public final String A00;

    public C35161lT(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public C35161lT(String str) {
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
    }
}
