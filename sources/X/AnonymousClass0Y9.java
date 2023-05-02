package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Y9  reason: invalid class name */
public class AnonymousClass0Y9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(16);
    public int A00;
    public String A01;

    public AnonymousClass0Y9(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public AnonymousClass0Y9(String str, int i2) {
        this.A01 = str;
        this.A00 = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
