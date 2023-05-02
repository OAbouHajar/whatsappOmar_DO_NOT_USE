package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3Ml  reason: invalid class name and case insensitive filesystem */
public class C64023Ml extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(34);
    public int A00;

    public C64023Ml(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public C64023Ml(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00);
    }
}
