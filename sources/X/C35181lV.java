package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lV  reason: invalid class name and case insensitive filesystem */
public class C35181lV implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(83);
    public boolean A00;
    public final C35071lK A01;

    public C35181lV(C35071lK r1, boolean z2) {
        this.A00 = z2;
        this.A01 = r1;
    }

    public C35181lV(Parcel parcel) {
        this.A01 = (C35071lK) parcel.readParcelable(C35071lK.class.getClassLoader());
        this.A00 = parcel.readByte() != 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A01, i2);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
