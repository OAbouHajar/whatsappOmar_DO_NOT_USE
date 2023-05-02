package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.io.Serializable;

/* renamed from: X.1mI  reason: invalid class name and case insensitive filesystem */
public class C35661mI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(9);
    public final double A00;
    public final int A01;
    public final int A02;
    public final Double A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C35661mI(Parcel parcel) {
        this.A08 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = Integer.valueOf(parcel.readInt());
        this.A00 = parcel.readDouble();
        this.A02 = parcel.readInt();
        this.A07 = parcel.readString();
        Serializable readSerializable = parcel.readSerializable();
        this.A03 = readSerializable != null ? (Double) readSerializable : null;
        this.A06 = parcel.readString();
        this.A01 = parcel.readInt();
    }

    public C35661mI(Double d2, Integer num, String str, String str2, String str3, String str4, double d3, int i2, int i3) {
        this.A08 = str3;
        this.A04 = num;
        this.A05 = str4;
        this.A02 = i2;
        this.A00 = d3;
        this.A03 = d2;
        this.A07 = str;
        this.A06 = str2;
        this.A01 = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04.intValue());
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A07);
        parcel.writeSerializable(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
    }
}
