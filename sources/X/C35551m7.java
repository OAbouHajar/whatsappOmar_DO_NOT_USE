package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1m7  reason: invalid class name and case insensitive filesystem */
public class C35551m7 implements Parcelable {
    public static final C35551m7 A04 = new C35551m7(C35591mB.A04, (String) null, (String) null);
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(24);
    public final C35591mB A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C35551m7(C35591mB r2, String str, String str2) {
        this.A01 = "";
        this.A03 = str == null ? "" : str;
        this.A02 = str2 == null ? "" : str2;
        this.A00 = r2;
    }

    public C35551m7(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A01 = readString;
        String readString2 = parcel.readString();
        AnonymousClass00B.A06(readString2);
        this.A03 = readString2;
        String readString3 = parcel.readString();
        AnonymousClass00B.A06(readString3);
        this.A02 = readString3;
        Parcelable readParcelable = parcel.readParcelable(C35591mB.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable);
        this.A00 = (C35591mB) readParcelable;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C35551m7 r4 = (C35551m7) obj;
            if (this.A01.equals(r4.A01) && this.A03.equals(r4.A03) && this.A02.equals(r4.A02)) {
                return this.A00.equals(r4.A00);
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append(" ");
        sb.append(this.A02);
        sb.append(" ");
        sb.append(this.A00);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i2);
    }
}
