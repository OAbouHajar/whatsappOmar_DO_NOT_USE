package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3X9  reason: invalid class name */
public final class AnonymousClass3X9 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92954iP();
    public final int A00;
    public final int A01;

    public AnonymousClass3X9(int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        C32251fv.A06(parcel, 3, this.A01);
        C32251fv.A05(parcel, A002);
    }
}
