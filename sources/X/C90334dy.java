package X;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4dy  reason: invalid class name and case insensitive filesystem */
public final class C90334dy {
    public static final ClassLoader A00 = C90334dy.class.getClassLoader();

    public static void A00(IInterface iInterface, Parcel parcel) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static void A01(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
