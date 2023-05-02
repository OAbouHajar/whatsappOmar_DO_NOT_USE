package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lS  reason: invalid class name and case insensitive filesystem */
public class C35151lS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(86);
    public boolean A00;
    public final String A01;
    public final byte[] A02;

    public C35151lS(Parcel parcel) {
        this.A00 = parcel.readInt() != 0;
        this.A02 = parcel.createByteArray();
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A01 = readString;
    }

    public C35151lS(String str, byte[] bArr, boolean z2) {
        this.A02 = bArr;
        this.A01 = str;
        this.A00 = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A01);
    }
}
