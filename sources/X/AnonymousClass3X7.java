package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3X7  reason: invalid class name */
public final class AnonymousClass3X7 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92824iC();
    public final int A00;
    public final C65903Xa A01;

    public AnonymousClass3X7(C65903Xa r1, int i2) {
        this.A00 = i2;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A09(parcel, this.A01, 2, i2, false);
        C32251fv.A05(parcel, A002);
    }
}
