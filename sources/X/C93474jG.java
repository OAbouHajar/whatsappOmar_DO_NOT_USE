package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jG  reason: invalid class name and case insensitive filesystem */
public class C93474jG implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(67);
    public final long A00;
    public final String A01;
    public final String A02;

    public C93474jG(Parcel parcel) {
        this.A01 = AnonymousClass3K4.A0X(parcel);
        this.A02 = AnonymousClass3K4.A0X(parcel);
        this.A00 = parcel.readLong();
    }

    public C93474jG(String str, String str2, long j2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
    }
}
