package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xx  reason: invalid class name and case insensitive filesystem */
public final class C66133Xx extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92624hs();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    public C66133Xx() {
    }

    public C66133Xx(int i2, int i3, int i4, long j2, int i5) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A04 = j2;
        this.A03 = i5;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        C32251fv.A06(parcel, 3, this.A01);
        C32251fv.A06(parcel, 4, this.A02);
        C32251fv.A07(parcel, 5, this.A04);
        C32251fv.A06(parcel, 6, this.A03);
        C32251fv.A05(parcel, A002);
    }
}
