package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1Y3  reason: invalid class name */
public class AnonymousClass1Y3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(50);
    public final String A00;
    public final String A01;

    public AnonymousClass1Y3(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public AnonymousClass1Y3(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
