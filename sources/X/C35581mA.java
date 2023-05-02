package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1mA  reason: invalid class name and case insensitive filesystem */
public class C35581mA implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(20);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C35581mA(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A00 = readString;
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public C35581mA(String str, String str2) {
        this.A03 = str;
        this.A00 = str2;
        this.A02 = null;
        this.A01 = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C35581mA)) {
            return false;
        }
        C35581mA r4 = (C35581mA) obj;
        return C34901l3.A00(this.A00, r4.A00) && C34901l3.A00(this.A02, r4.A02) && C34901l3.A00(this.A01, r4.A01) && C34901l3.A00(this.A03, r4.A03);
    }

    public int hashCode() {
        String str = this.A00;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A01;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.A03;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CoverPhoto:{'id'='");
        sb.append(this.A00);
        sb.append("', 'ts'='");
        sb.append(this.A02);
        sb.append("', 'token'='");
        sb.append(this.A01);
        sb.append("', 'url'='");
        sb.append(this.A03);
        sb.append("'}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }
}
