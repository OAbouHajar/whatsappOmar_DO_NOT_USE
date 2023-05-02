package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xd  reason: invalid class name and case insensitive filesystem */
public class C65933Xd extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92424hX();
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public C65933Xd(int i2, int i3, int i4, boolean z2, boolean z3) {
        this.A00 = i2;
        this.A03 = z2;
        this.A04 = z3;
        this.A01 = i3;
        this.A02 = i4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A08(parcel, 2, this.A03);
        C32251fv.A08(parcel, 3, this.A04);
        C32251fv.A06(parcel, 4, this.A01);
        C32251fv.A06(parcel, 5, this.A02);
        C32251fv.A05(parcel, A002);
    }
}
