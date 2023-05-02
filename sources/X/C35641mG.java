package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1mG  reason: invalid class name and case insensitive filesystem */
public class C35641mG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(12);
    public long A00;

    public C35641mG(long j2) {
        this.A00 = j2;
    }

    public C35641mG(Parcel parcel) {
        this.A00 = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A00);
    }
}
