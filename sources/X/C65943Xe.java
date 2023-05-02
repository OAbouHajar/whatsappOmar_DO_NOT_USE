package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xe  reason: invalid class name and case insensitive filesystem */
public class C65943Xe extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92444hZ();
    public final int A00;
    public final C65933Xd A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    public C65943Xe(C65933Xd r1, int[] iArr, int[] iArr2, int i2, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A02 = z2;
        this.A03 = z3;
        this.A04 = iArr;
        this.A00 = i2;
        this.A05 = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A09(parcel, this.A01, 1, i2, false);
        C32251fv.A08(parcel, 2, this.A02);
        C32251fv.A08(parcel, 3, this.A03);
        AnonymousClass3K3.A13(parcel, this.A04, 4);
        C32251fv.A06(parcel, 5, this.A00);
        AnonymousClass3K3.A13(parcel, this.A05, 6);
        C32251fv.A05(parcel, A002);
    }
}
