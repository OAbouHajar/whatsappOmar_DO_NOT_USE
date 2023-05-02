package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0Bi  reason: invalid class name and case insensitive filesystem */
public class C02370Bi extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(12);
    public boolean A00;

    public C02370Bi(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass000.A1O(parcel.readByte());
    }

    public C02370Bi(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
