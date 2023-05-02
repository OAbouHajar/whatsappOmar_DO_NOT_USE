package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2iy  reason: invalid class name and case insensitive filesystem */
public final class C55162iy extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92574hm();
    public final String A00;
    public final byte[] A01;

    public C55162iy(String str, byte[] bArr) {
        C13710nw.A01(str);
        this.A00 = str;
        C13710nw.A01(bArr);
        this.A01 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A06(parcel, 1, 1);
        C32251fv.A0A(parcel, this.A00, 2, false);
        C32251fv.A0D(parcel, this.A01, 3, false);
        C32251fv.A05(parcel, A012);
    }
}
