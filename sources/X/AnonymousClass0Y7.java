package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Y7  reason: invalid class name */
public final class AnonymousClass0Y7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(13);
    public final Bundle A00;

    public AnonymousClass0Y7(Bundle bundle) {
        this.A00 = bundle;
    }

    public AnonymousClass0Y7(Object obj) {
        this.A00 = AnonymousClass0XL.A02(obj);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.A00);
    }
}
