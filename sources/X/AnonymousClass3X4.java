package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3X4  reason: invalid class name */
public class AnonymousClass3X4 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92304hL();
    public final boolean A00;
    public final byte[] A01;

    public AnonymousClass3X4(byte[] bArr, boolean z2) {
        this.A01 = bArr;
        this.A00 = z2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0D(parcel, this.A01, 1, false);
        C32251fv.A08(parcel, 2, this.A00);
        C32251fv.A05(parcel, A002);
    }
}
