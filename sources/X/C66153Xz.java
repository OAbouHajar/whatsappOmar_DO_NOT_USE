package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xz  reason: invalid class name and case insensitive filesystem */
public final class C66153Xz extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92864iG();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public C66153Xz() {
    }

    public C66153Xz(float f2, int i2, int i3, int i4, boolean z2, boolean z3) {
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = z2;
        this.A05 = z3;
        this.A00 = f2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A01);
        C32251fv.A06(parcel, 3, this.A02);
        C32251fv.A06(parcel, 4, this.A03);
        C32251fv.A08(parcel, 5, this.A04);
        C32251fv.A08(parcel, 6, this.A05);
        C32251fv.A04(parcel, this.A00, 7);
        C32251fv.A05(parcel, A002);
    }
}
