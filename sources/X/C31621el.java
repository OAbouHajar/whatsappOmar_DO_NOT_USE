package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1el  reason: invalid class name and case insensitive filesystem */
public final class C31621el implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(97);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C31621el(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readByte() != 0;
        this.A00 = parcel.readString();
    }

    public C31621el(String str, String str2, String str3, boolean z2) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z2;
        this.A00 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
    }
}
