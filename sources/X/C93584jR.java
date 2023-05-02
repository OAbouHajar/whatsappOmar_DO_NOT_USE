package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4jR  reason: invalid class name and case insensitive filesystem */
public class C93584jR implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(35);
    public final C93654jY A00;
    public final String A01;
    public final String A02;

    public C93584jR(C93654jY r1, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public C93584jR(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = (C93654jY) AnonymousClass3K3.A0U(parcel, C93654jY.class);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93584jR)) {
            return false;
        }
        C93584jR r4 = (C93584jR) obj;
        return C34901l3.A00(this.A01, r4.A01) && C34901l3.A00(this.A02, r4.A02) && C34901l3.A00(this.A00, r4.A00);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A02, this.A00});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i2);
    }
}
