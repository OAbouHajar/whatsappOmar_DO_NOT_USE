package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XK  reason: invalid class name */
public final class AnonymousClass3XK extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93084ic();
    public final int A00;
    public final C65993Xj A01;

    public AnonymousClass3XK(C65993Xj r1, int i2) {
        this.A00 = i2;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        AnonymousClass3K2.A0x(parcel, this.A01, i2, A002);
    }
}
