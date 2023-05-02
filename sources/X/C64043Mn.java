package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3Mn  reason: invalid class name and case insensitive filesystem */
public class C64043Mn extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(56);
    public final float A00;
    public final int A01;

    public C64043Mn(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
    }

    public C64043Mn(Parcelable parcelable, float f2, int i2) {
        super(parcelable);
        this.A01 = i2;
        this.A00 = f2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
