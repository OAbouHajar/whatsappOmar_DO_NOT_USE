package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jF  reason: invalid class name and case insensitive filesystem */
public class C93464jF implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(49);
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C93464jF(Parcel parcel) {
        this.A01 = AnonymousClass3K4.A0X(parcel);
        this.A02 = C13690nt.A1R(parcel.readInt());
        this.A00 = AnonymousClass3K4.A0X(parcel);
    }

    public C93464jF(String str, String str2, boolean z2) {
        this.A01 = str;
        this.A02 = z2;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
    }
}
