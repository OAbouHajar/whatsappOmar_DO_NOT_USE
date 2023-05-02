package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XX  reason: invalid class name */
public final class AnonymousClass3XX extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93194in();
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass3XX(byte[] bArr, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A06(parcel, 2, this.A01);
        C32251fv.A0D(parcel, this.A02, 3, false);
        C32251fv.A05(parcel, A002);
    }
}
