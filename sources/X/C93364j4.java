package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4j4  reason: invalid class name and case insensitive filesystem */
public final class C93364j4 implements Parcelable {
    public static final C93304iy CREATOR = new C93304iy();
    public final String A00;

    public C93364j4(String str) {
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeString(this.A00);
    }
}
