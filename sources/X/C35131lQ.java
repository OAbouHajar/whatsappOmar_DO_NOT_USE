package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lQ  reason: invalid class name and case insensitive filesystem */
public class C35131lQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(88);
    public int A00;
    public int A01;
    public String A02;

    public C35131lQ(int i2, String str, int i3) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = i3;
    }

    public C35131lQ(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
