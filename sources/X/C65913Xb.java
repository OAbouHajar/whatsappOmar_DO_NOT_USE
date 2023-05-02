package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xb  reason: invalid class name and case insensitive filesystem */
public final class C65913Xb extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92764i6();
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final AnonymousClass3XT[] A03;

    public C65913Xb(AnonymousClass3XT[] r2, int i2, long j2, boolean z2) {
        this.A01 = j2;
        this.A03 = r2;
        this.A02 = z2;
        if (z2) {
            this.A00 = i2;
        } else {
            this.A00 = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A07(parcel, 2, this.A01);
        C32251fv.A0E(parcel, this.A03, 3, i2);
        C32251fv.A06(parcel, 4, this.A00);
        C32251fv.A08(parcel, 5, this.A02);
        C32251fv.A05(parcel, A002);
    }
}
