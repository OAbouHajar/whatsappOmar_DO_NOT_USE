package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XO  reason: invalid class name */
public final class AnonymousClass3XO extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93134ih();
    public final int A00;
    public final AnonymousClass3Y7 A01;

    public AnonymousClass3XO(AnonymousClass3Y7 r1, int i2) {
        this.A00 = i2;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        AnonymousClass3K2.A0x(parcel, this.A01, i2, A002);
    }
}
