package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxObjectShape25S0000000_I1;

/* renamed from: X.0Ek  reason: invalid class name and case insensitive filesystem */
public class C02680Ek extends C018308o {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape25S0000000_I1(4);
    public Parcelable A00;

    public C02680Ek(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? AnonymousClass02W.class.getClassLoader() : classLoader);
    }

    public C02680Ek(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.A00, 0);
    }
}
