package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0FM  reason: invalid class name */
public class AnonymousClass0FM extends AnonymousClass0Bb {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(24);
    public int A00;
    public int A01;
    public int A02;

    public AnonymousClass0FM(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public AnonymousClass0FM(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
