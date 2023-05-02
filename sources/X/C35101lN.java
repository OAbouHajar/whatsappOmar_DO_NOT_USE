package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lN  reason: invalid class name and case insensitive filesystem */
public class C35101lN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(91);
    public C35091lM A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    public C35101lN(C35091lM r2, String str) {
        this.A03 = str;
        this.A00 = r2;
        this.A04 = 2;
    }

    public C35101lN(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A00 = (C35091lM) parcel.readParcelable(C35091lM.class.getClassLoader());
    }

    public C35101lN(String str, String str2, String str3, int i2) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i2);
    }
}
