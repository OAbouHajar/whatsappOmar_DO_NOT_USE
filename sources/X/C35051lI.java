package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lI  reason: invalid class name and case insensitive filesystem */
public class C35051lI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(99);
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C35051lI(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A08 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A06 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public C35051lI(String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3, long j4) {
        this.A08 = str;
        this.A02 = j2;
        this.A03 = str2;
        this.A06 = str3;
        this.A00 = j3;
        this.A01 = j4;
        this.A07 = str4;
        this.A05 = str5;
        this.A04 = str6;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A02);
        parcel.writeString(this.A08);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }
}
