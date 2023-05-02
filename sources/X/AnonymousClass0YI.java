package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0YI  reason: invalid class name */
public class AnonymousClass0YI implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(26);
    public int A00;
    public int A01;
    public boolean A02;

    public AnonymousClass0YI() {
    }

    public AnonymousClass0YI(AnonymousClass0YI r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
    }

    public AnonymousClass0YI(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() != 1 ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
