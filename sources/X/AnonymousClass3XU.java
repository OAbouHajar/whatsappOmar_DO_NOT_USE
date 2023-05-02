package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XU  reason: invalid class name */
public final class AnonymousClass3XU extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92834iD();
    public final int A00;
    public final C15700rh A01;
    public final C66003Xk A02;

    public AnonymousClass3XU(C15700rh r1, C66003Xk r2, int i2) {
        this.A00 = i2;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A09(parcel, this.A01, 2, i2, false);
        C32251fv.A09(parcel, this.A02, 3, i2, false);
        C32251fv.A05(parcel, A002);
    }
}
