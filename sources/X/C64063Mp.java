package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3Mp  reason: invalid class name and case insensitive filesystem */
public class C64063Mp extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(38);
    public long A00;
    public long A01;
    public boolean A02;

    public C64063Mp(Parcel parcel) {
        super(parcel);
        this.A01 = (long) parcel.readInt();
        this.A00 = (long) parcel.readInt();
        this.A02 = C13690nt.A1R(parcel.readInt());
    }

    public C64063Mp(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
