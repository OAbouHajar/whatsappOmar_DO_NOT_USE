package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4jZ  reason: invalid class name and case insensitive filesystem */
public class C93664jZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(39);
    public C93594jS A00;
    public C93614jU A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;

    public C93664jZ(C93594jS r1, C93614jU r2, Boolean bool, String str, String str2, String str3) {
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bool;
        this.A00 = r1;
        this.A01 = r2;
    }

    public C93664jZ(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        int readInt = parcel.readInt();
        this.A02 = readInt != -1 ? Boolean.valueOf(C13690nt.A1R(readInt)) : null;
        this.A00 = (C93594jS) AnonymousClass3K3.A0U(parcel, C93594jS.class);
        this.A01 = (C93614jU) AnonymousClass3K3.A0U(parcel, C93614jU.class);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93664jZ)) {
            return false;
        }
        C93664jZ r4 = (C93664jZ) obj;
        return C34901l3.A00(this.A03, r4.A03) && C34901l3.A00(this.A04, r4.A04) && C34901l3.A00(this.A05, r4.A05) && C34901l3.A00(this.A02, r4.A02) && C34901l3.A00(this.A00, r4.A00) && C34901l3.A00(this.A01, r4.A01);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A03, this.A04, this.A05, this.A02, this.A00, this.A01});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Boolean bool = this.A02;
        parcel.writeInt(bool == null ? -1 : AnonymousClass000.A1O(bool.booleanValue() ? 1 : 0));
        parcel.writeParcelable(this.A00, i2);
        parcel.writeParcelable(this.A01, i2);
    }
}
