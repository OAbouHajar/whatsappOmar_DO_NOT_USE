package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xs  reason: invalid class name and case insensitive filesystem */
public final class C66083Xs extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92474hc();
    public final int A00;
    public final int A01;
    public final String A02;

    public C66083Xs(int i2, String str, int i3) {
        this.A00 = i2;
        this.A02 = str;
        this.A01 = i3;
    }

    public C66083Xs(String str, int i2) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A0A(parcel, this.A02, 2, false);
        C32251fv.A06(parcel, 3, this.A01);
        C32251fv.A05(parcel, A002);
    }
}
