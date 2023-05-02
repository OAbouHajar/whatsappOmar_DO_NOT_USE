package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xc  reason: invalid class name and case insensitive filesystem */
public final class C65923Xc extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92874iH();
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public C65923Xc(float f2, float f3, int i2, int i3) {
        this.A03 = i2;
        this.A00 = f2;
        this.A01 = f3;
        this.A02 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A03);
        C32251fv.A04(parcel, this.A00, 2);
        C32251fv.A04(parcel, this.A01, 3);
        C32251fv.A06(parcel, 4, this.A02);
        C32251fv.A05(parcel, A002);
    }
}
