package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lH  reason: invalid class name and case insensitive filesystem */
public class C35041lH implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(100);
    public final int A00;
    public final String A01;
    public final String A02;

    public C35041lH(Parcel parcel) {
        this.A00 = parcel.readInt();
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A02 = readString;
        this.A01 = parcel.readString();
    }

    public C35041lH(String str, String str2, int i2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35041lH r5 = (C35041lH) obj;
            if (!(this.A01 == r5.A01 && this.A02.equals(r5.A02) && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 527 + this.A00;
        String str = this.A01;
        if (str != null) {
            i2 = (i2 * 31) + str.hashCode();
        }
        return (i2 * 31) + this.A02.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
