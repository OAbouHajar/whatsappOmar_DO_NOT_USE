package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4jY  reason: invalid class name and case insensitive filesystem */
public class C93654jY implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(36);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C93654jY(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C93654jY(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A03 = str5;
        this.A01 = str6;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93654jY)) {
            return false;
        }
        C93654jY r4 = (C93654jY) obj;
        return C34901l3.A00(this.A04, r4.A04) && C34901l3.A00(this.A05, r4.A05) && C34901l3.A00(this.A02, r4.A02) && C34901l3.A00(this.A00, r4.A00) && C34901l3.A00(this.A03, r4.A03) && C34901l3.A00(this.A01, r4.A01);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A04, this.A05, this.A02, this.A00, this.A03, this.A01});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }
}
