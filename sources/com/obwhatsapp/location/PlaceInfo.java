package com.obwhatsapp.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

public class PlaceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(69);
    public double A00;
    public double A01;
    public double A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public transient Location A0C;
    public transient Object A0D;

    public PlaceInfo() {
    }

    public PlaceInfo(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A0B = parcel.readString();
        this.A08 = parcel.readString();
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        this.A0A = parcel.readString();
        this.A07 = parcel.readString();
        this.A04 = parcel.readString();
        this.A09 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A03 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A03);
    }
}