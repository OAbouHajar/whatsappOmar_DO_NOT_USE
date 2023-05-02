package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lD  reason: invalid class name and case insensitive filesystem */
public class C35001lD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(105);
    public long A00;
    public String A01;
    public boolean A02;

    public C35001lD(Parcel parcel) {
        String readString = parcel.readString();
        this.A01 = readString == null ? "UNKNOWN" : readString;
        this.A00 = parcel.readLong();
        this.A02 = parcel.readInt() != 1 ? false : true;
    }

    public C35001lD(String str, long j2, boolean z2) {
        this.A01 = str;
        this.A00 = j2;
        this.A02 = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
