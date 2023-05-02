package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1m9  reason: invalid class name and case insensitive filesystem */
public class C35571m9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(21);
    public boolean A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C35571m9(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A03 = readString;
        String readString2 = parcel.readString();
        AnonymousClass00B.A06(readString2);
        this.A02 = readString2;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readByte() != 0;
    }

    public C35571m9(String str, String str2, int i2, boolean z2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = i2;
        this.A00 = z2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C35571m9)) {
            return false;
        }
        C35571m9 r4 = (C35571m9) obj;
        return this.A03.equals(r4.A03) && this.A02.equals(r4.A02) && this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return (((((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01) * 31) + (this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectedAccount:{'id'='");
        sb.append(this.A03);
        sb.append("', 'name'='");
        sb.append(this.A02);
        sb.append("', 'likes'='");
        sb.append(this.A01);
        sb.append("', 'hasMediaPost'='");
        sb.append(this.A00);
        sb.append("'}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
