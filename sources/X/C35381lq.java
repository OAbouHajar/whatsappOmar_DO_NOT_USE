package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lq  reason: invalid class name and case insensitive filesystem */
public class C35381lq implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(42);
    public String A00;
    public boolean A01;

    public C35381lq() {
        this.A00 = "";
        this.A01 = true;
    }

    public C35381lq(Parcel parcel) {
        this.A00 = "";
        boolean z2 = true;
        this.A01 = true;
        this.A00 = parcel.readString();
        this.A01 = parcel.readByte() == 0 ? false : z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }
}
