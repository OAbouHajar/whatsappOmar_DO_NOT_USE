package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XE  reason: invalid class name */
public final class AnonymousClass3XE extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93004iU();
    public final int A00;
    public final boolean A01;

    public AnonymousClass3XE(int i2, boolean z2) {
        this.A00 = i2;
        this.A01 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        C32251fv.A08(parcel, 3, this.A01);
        C32251fv.A05(parcel, A002);
    }
}
