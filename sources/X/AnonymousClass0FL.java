package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0FL  reason: invalid class name */
public class AnonymousClass0FL extends AnonymousClass0Bb {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(25);
    public boolean A00;

    public AnonymousClass0FL(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt() != 1 ? false : true;
    }

    public AnonymousClass0FL(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
