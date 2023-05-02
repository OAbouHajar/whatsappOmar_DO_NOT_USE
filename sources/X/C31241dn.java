package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1dn  reason: invalid class name and case insensitive filesystem */
public class C31241dn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(14);
    public final String A00;
    public final String A01;

    public C31241dn(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A05(readString);
        this.A00 = readString;
        String readString2 = parcel.readString();
        AnonymousClass00B.A05(readString2);
        this.A01 = readString2;
    }

    public C31241dn(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C31241dn)) {
            return false;
        }
        C31241dn r4 = (C31241dn) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BizCategory:{'id'='");
        sb.append(this.A00);
        sb.append("', 'name'='");
        sb.append(this.A01);
        sb.append("'}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
