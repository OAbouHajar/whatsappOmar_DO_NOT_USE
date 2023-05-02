package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XB  reason: invalid class name */
public final class AnonymousClass3XB extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92974iR();
    public final int A00;
    public final C66033Xn A01;

    public AnonymousClass3XB(C66033Xn r1, int i2) {
        this.A00 = i2;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        AnonymousClass3K2.A0x(parcel, this.A01, i2, A002);
    }
}
