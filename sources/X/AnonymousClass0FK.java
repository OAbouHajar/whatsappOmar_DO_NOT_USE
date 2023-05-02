package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0FK  reason: invalid class name */
public class AnonymousClass0FK extends AnonymousClass0Bb {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(23);
    public int A00;

    public AnonymousClass0FK(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public AnonymousClass0FK(Parcelable parcelable, int i2) {
        super(parcelable);
        this.A00 = i2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00);
    }
}
