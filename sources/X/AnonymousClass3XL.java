package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XL  reason: invalid class name */
public final class AnonymousClass3XL extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93094id();
    public final int A00;
    public final String A01;

    public AnonymousClass3XL(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        AnonymousClass3K3.A12(parcel, this.A01, 3, A002);
    }
}
