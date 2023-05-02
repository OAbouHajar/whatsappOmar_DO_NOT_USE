package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lJ  reason: invalid class name and case insensitive filesystem */
public final class C35061lJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(98);
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public long A04;
    public C31621el A05;
    public AnonymousClass427 A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;

    public C35061lJ(AnonymousClass427 r2) {
        this.A06 = r2;
    }

    public C35061lJ(Parcel parcel) {
        boolean z2 = false;
        this.A06 = AnonymousClass427.values()[parcel.readInt()];
        this.A0B = parcel.readString();
        this.A0E = parcel.readString();
        this.A01 = parcel.readInt();
        this.A09 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A0L = parcel.readByte() != 0 ? true : z2;
        this.A0D = parcel.readString();
        this.A0F = parcel.readString();
        this.A0G = parcel.readString();
        this.A0H = parcel.readString();
        this.A0I = parcel.readString();
        this.A04 = parcel.readLong();
        this.A0C = parcel.readString();
        this.A03 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A0A = parcel.readString();
        this.A05 = (C31621el) parcel.readParcelable(C31621el.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A06.ordinal());
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A02);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A05, i2);
    }
}
