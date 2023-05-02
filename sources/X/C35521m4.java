package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1m4  reason: invalid class name and case insensitive filesystem */
public final class C35521m4 extends C30671cl {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(30);

    public C35521m4(C30681cm r1, int i2, int i3, long j2, long j3) {
        AnonymousClass00B.A06(r1);
        this.A07 = r1;
        this.A05 = j2;
        this.A06 = j3;
        this.A00 = i3;
        this.A01 = i2;
    }

    public C35521m4(Parcel parcel) {
        A08(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ BANK:");
        sb.append(super.toString());
        sb.append(" ]");
        return sb.toString();
    }
}
