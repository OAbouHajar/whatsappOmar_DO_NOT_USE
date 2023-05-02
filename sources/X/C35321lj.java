package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.Arrays;

/* renamed from: X.1lj  reason: invalid class name and case insensitive filesystem */
public class C35321lj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(49);
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;

    public C35321lj() {
    }

    public C35321lj(Parcel parcel) {
        if (parcel != null) {
            this.A04 = parcel.readString();
            this.A03 = parcel.readString();
            this.A01 = parcel.readInt();
            this.A02 = parcel.readInt();
            this.A00 = parcel.readInt();
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C35321lj)) {
            return false;
        }
        C35321lj r4 = (C35321lj) obj;
        return r4.A04.equals(this.A04) && r4.A03.equals(this.A03) && r4.A01 == this.A01 && r4.A02 == this.A02 && r4.A00 == this.A00;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A00)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}
