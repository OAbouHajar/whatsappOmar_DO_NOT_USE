package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.Locale;

/* renamed from: X.1ll  reason: invalid class name and case insensitive filesystem */
public class C35341ll implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(47);
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04 = false;
    public boolean A05;

    public C35341ll() {
    }

    public C35341ll(Parcel parcel) {
        boolean z2 = false;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A05 = parcel.readInt() != 0;
        this.A04 = parcel.readInt() != 0 ? true : z2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "ImageListParam{loc=%s,inc=%d,sort=%d,bucket=%s,empty=%b,favorite=%b}", new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A03, Boolean.valueOf(this.A05), Boolean.valueOf(this.A04)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
