package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lK  reason: invalid class name and case insensitive filesystem */
public class C35071lK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(94);
    public final String A00;
    public final String A01;

    public C35071lK(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C35071lK(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
