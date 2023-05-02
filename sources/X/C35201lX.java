package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lX  reason: invalid class name and case insensitive filesystem */
public class C35201lX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(81);
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public C35201lX(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.createByteArray();
    }

    public C35201lX(String str, String str2, byte[] bArr) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A02);
    }
}
