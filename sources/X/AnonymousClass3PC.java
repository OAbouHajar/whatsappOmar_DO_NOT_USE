package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxObjectShape26S0000000_2_I1;

/* renamed from: X.3PC  reason: invalid class name */
public class AnonymousClass3PC extends C018308o {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape26S0000000_2_I1(1);
    public final int A00;

    public AnonymousClass3PC(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
    }

    public AnonymousClass3PC(Parcelable parcelable, int i2) {
        super(parcelable);
        this.A00 = i2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00);
    }
}
