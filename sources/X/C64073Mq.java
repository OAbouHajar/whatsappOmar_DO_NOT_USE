package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3Mq  reason: invalid class name and case insensitive filesystem */
public class C64073Mq extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(50);
    public int A00;
    public int A01;
    public boolean A02;

    public C64073Mq(Parcel parcel) {
        super(parcel);
        this.A02 = C13690nt.A1R(parcel.readInt());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public C64073Mq(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
