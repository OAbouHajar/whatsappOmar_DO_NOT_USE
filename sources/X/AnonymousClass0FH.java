package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0FH  reason: invalid class name */
public class AnonymousClass0FH extends AnonymousClass0Bb {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(19);
    public String A00;

    public AnonymousClass0FH(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public AnonymousClass0FH(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A00);
    }
}
