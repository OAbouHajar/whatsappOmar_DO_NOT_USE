package androidx.versionedparcelable;

import X.AnonymousClass000;
import X.AnonymousClass04J;
import X.AnonymousClass0GW;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(29);
    public final AnonymousClass04J A00;

    public ParcelImpl(Parcel parcel) {
        this.A00 = new AnonymousClass0GW(parcel).A03();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        new AnonymousClass0GW(parcel).A08(this.A00);
    }
}
