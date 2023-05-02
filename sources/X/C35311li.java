package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.obwhatsapp.location.PlaceInfo;
import java.util.ArrayList;

/* renamed from: X.1li  reason: invalid class name and case insensitive filesystem */
public class C35311li implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(70);
    public int A00;
    public long A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public ArrayList A08;
    public boolean A09;
    public boolean A0A;
    public final double A0B;
    public final double A0C;
    public final int A0D;
    public final int A0E;
    public final String A0F;
    public transient Location A0G;

    public C35311li() {
        this.A08 = new ArrayList();
        this.A09 = false;
        this.A04 = null;
        this.A0E = 0;
        this.A0B = Double.MAX_VALUE;
        this.A0C = Double.MAX_VALUE;
        this.A0D = 0;
        this.A0F = "";
        this.A09 = false;
        this.A04 = null;
    }

    public C35311li(Location location, String str, int i2) {
        this.A08 = new ArrayList();
        this.A09 = false;
        this.A04 = null;
        this.A0E = 3;
        this.A0B = location.getLatitude();
        this.A0C = location.getLongitude();
        this.A0D = i2;
        this.A0F = str == null ? "" : str;
        this.A09 = false;
        this.A04 = null;
    }

    public C35311li(Parcel parcel) {
        this.A08 = new ArrayList();
        boolean z2 = false;
        this.A09 = false;
        Integer num = null;
        this.A04 = null;
        this.A0B = parcel.readDouble();
        this.A0C = parcel.readDouble();
        this.A0D = parcel.readInt();
        this.A0F = parcel.readString();
        this.A0E = parcel.readInt();
        this.A08 = parcel.createTypedArrayList(PlaceInfo.CREATOR);
        this.A03 = parcel.readString();
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0A = parcel.readByte() != 0;
        this.A02 = parcel.readByte() != 0 ? Integer.valueOf(parcel.readInt()) : num;
        this.A06 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A09 = parcel.readByte() != 0 ? true : z2;
        this.A04 = parcel.readString();
    }

    public Location A00() {
        double d2 = this.A0B;
        if (d2 == Double.MAX_VALUE) {
            return null;
        }
        double d3 = this.A0C;
        if (d3 == Double.MAX_VALUE) {
            return null;
        }
        if (this.A0G == null) {
            Location location = new Location("");
            this.A0G = location;
            location.setLatitude(d2);
            this.A0G.setLongitude(d3);
        }
        return this.A0G;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeDouble(this.A0B);
        parcel.writeDouble(this.A0C);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A0E);
        parcel.writeTypedList(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        if (this.A02 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.A02.intValue());
        }
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeString(this.A04);
    }
}
