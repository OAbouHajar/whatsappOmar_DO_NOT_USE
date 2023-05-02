package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lw  reason: invalid class name and case insensitive filesystem */
public final class C35441lw extends C30671cl {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(38);
    public String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public C35441lw(C30681cm r1, C39901tF r2, String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        this.A00 = str3;
        this.A02 = z2;
        this.A03 = z3;
        this.A01 = str2;
        AnonymousClass00B.A06(r1);
        this.A07 = r1;
        this.A0A = str;
        this.A08 = r2;
        A09(str4);
    }

    public C35441lw(Parcel parcel) {
        A08(parcel);
        this.A00 = parcel.readString();
        boolean z2 = false;
        this.A02 = parcel.readByte() == 1;
        this.A03 = parcel.readByte() == 1 ? true : z2;
        this.A01 = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ MERCHANT: ");
        sb.append(super.toString());
        sb.append(" merchantId: ");
        sb.append(this.A00);
        sb.append(" p2mEligible: ");
        sb.append(this.A02);
        sb.append(" p2pEligible: ");
        sb.append(this.A03);
        sb.append(" logoUri: ");
        sb.append(this.A01);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeString(this.A01);
    }
}
