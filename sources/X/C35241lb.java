package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lb  reason: invalid class name and case insensitive filesystem */
public class C35241lb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(76);
    public final long A00;
    public final String A01;

    public C35241lb(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readString();
    }

    public C35241lb(String str, long j2) {
        this.A00 = j2;
        this.A01 = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }
}
