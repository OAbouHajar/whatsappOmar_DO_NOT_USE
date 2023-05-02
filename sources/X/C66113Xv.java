package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xv  reason: invalid class name and case insensitive filesystem */
public final class C66113Xv extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92434hY();
    public int A00;
    public Bundle A01;
    public C65943Xe A02;
    public AnonymousClass3Y2[] A03;

    public C66113Xv() {
    }

    public C66113Xv(Bundle bundle, C65943Xe r2, AnonymousClass3Y2[] r3, int i2) {
        this.A01 = bundle;
        this.A03 = r3;
        this.A00 = i2;
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A02(this.A01, parcel, 1);
        C32251fv.A0E(parcel, this.A03, 2, i2);
        C32251fv.A06(parcel, 3, this.A00);
        C32251fv.A09(parcel, this.A02, 4, i2, false);
        C32251fv.A05(parcel, A002);
    }
}
