package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2j3  reason: invalid class name and case insensitive filesystem */
public final class C55212j3 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92554hk();
    public final int A00;
    public final String A01;

    public C55212j3(String str, int i2) {
        C13710nw.A01(str);
        this.A01 = str;
        this.A00 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A06(parcel, 1, 1);
        C32251fv.A0A(parcel, this.A01, 2, false);
        C32251fv.A06(parcel, 3, this.A00);
        C32251fv.A05(parcel, A012);
    }
}
