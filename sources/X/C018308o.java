package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.08o  reason: invalid class name and case insensitive filesystem */
public abstract class C018308o implements Parcelable {
    public static final C018308o A01 = new C02660Ei();
    public static final Parcelable.Creator CREATOR = new C06780Xs();
    public final Parcelable A00;

    public C018308o() {
        this.A00 = null;
    }

    public C018308o(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A00 = readParcelable == null ? A01 : readParcelable;
    }

    public C018308o(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A01 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A00, i2);
    }
}
