package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4jU  reason: invalid class name and case insensitive filesystem */
public class C93614jU implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(41);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public C93614jU(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public C93614jU(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93614jU)) {
            return false;
        }
        C93614jU r4 = (C93614jU) obj;
        return C34901l3.A00(this.A03, r4.A03) && C34901l3.A00(this.A00, r4.A00) && C34901l3.A00(this.A01, r4.A01) && C34901l3.A00(this.A02, r4.A02);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A03, this.A00, this.A01, this.A02});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
