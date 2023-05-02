package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Xs  reason: invalid class name and case insensitive filesystem */
public final class C06780Xs implements Parcelable.ClassLoaderCreator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (parcel.readParcelable((ClassLoader) null) == null) {
            return C018308o.A01;
        }
        throw AnonymousClass000.A0V("superState must be null");
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return C018308o.A01;
        }
        throw AnonymousClass000.A0V("superState must be null");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C018308o[i2];
    }
}
