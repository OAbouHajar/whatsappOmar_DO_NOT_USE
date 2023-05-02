package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1mL  reason: invalid class name and case insensitive filesystem */
public final class C35691mL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(6);
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C35691mL(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public C35691mL(String str, String str2, String str3, int i2, int i3) {
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = i2;
        this.A02 = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof C35691mL) && this.A04.equals(((C35691mL) obj).A04));
    }

    public int hashCode() {
        String str = this.A04;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }
}
