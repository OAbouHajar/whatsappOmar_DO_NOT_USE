package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.redex.IDxCreatorShape17S0000000_3_I1;

/* renamed from: X.5dq  reason: invalid class name and case insensitive filesystem */
public class C110305dq extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape17S0000000_3_I1(0);
    public float A00;
    public float A01;

    public C110305dq(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public C110305dq(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }
}
