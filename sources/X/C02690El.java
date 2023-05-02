package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxObjectShape25S0000000_I1;

/* renamed from: X.0El  reason: invalid class name and case insensitive filesystem */
public class C02690El extends C018308o {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape25S0000000_I1(1);
    public int A00;
    public boolean A01;

    public C02690El(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
        this.A01 = AnonymousClass000.A1O(parcel.readInt());
    }

    public C02690El(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
