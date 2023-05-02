package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.Arrays;

/* renamed from: X.1lY  reason: invalid class name and case insensitive filesystem */
public class C35211lY implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(79);
    public final int A00;
    public final long A01;
    public final String A02;

    public C35211lY(int i2, String str, long j2) {
        this.A01 = j2;
        this.A00 = i2;
        this.A02 = str;
    }

    public C35211lY(Parcel parcel) {
        long readLong = parcel.readLong();
        AnonymousClass00B.A06(Long.valueOf(readLong));
        this.A01 = readLong;
        int readInt = parcel.readInt();
        AnonymousClass00B.A06(Integer.valueOf(readInt));
        this.A00 = readInt;
        this.A02 = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35211lY r7 = (C35211lY) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && C34901l3.A00(this.A02, r7.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A01), Integer.valueOf(this.A00), this.A02});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }
}
