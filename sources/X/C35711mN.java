package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1mN  reason: invalid class name and case insensitive filesystem */
public class C35711mN extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(4);
    public int A00;

    public C35711mN(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public C35711mN(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00);
    }
}
