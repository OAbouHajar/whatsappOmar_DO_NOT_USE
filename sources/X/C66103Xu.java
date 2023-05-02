package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xu  reason: invalid class name and case insensitive filesystem */
public final class C66103Xu extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92494he();
    public final int A00;
    public final AnonymousClass3Y5 A01;
    public final String A02;

    public C66103Xu(AnonymousClass3Y5 r2, String str) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = r2;
    }

    public C66103Xu(AnonymousClass3Y5 r1, String str, int i2) {
        this.A00 = i2;
        this.A02 = str;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A09(parcel, this.A01, 3, i2, AnonymousClass3K3.A1R(parcel, this.A02));
        C32251fv.A05(parcel, A002);
    }
}
