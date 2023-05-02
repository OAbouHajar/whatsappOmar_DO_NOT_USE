package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xr  reason: invalid class name and case insensitive filesystem */
public final class C66073Xr extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92454ha();
    public final int A00;
    public final AnonymousClass3YI A01;

    public C66073Xr(AnonymousClass3YI r2) {
        this.A00 = 1;
        this.A01 = r2;
    }

    public C66073Xr(AnonymousClass3YI r1, int i2) {
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
