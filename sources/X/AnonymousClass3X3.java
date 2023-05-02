package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3X3  reason: invalid class name */
public final class AnonymousClass3X3 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93184im();
    public final int A00;

    public AnonymousClass3X3(int i2) {
        this.A00 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        C32251fv.A05(parcel, A002);
    }
}
