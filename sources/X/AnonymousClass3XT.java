package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XT  reason: invalid class name */
public class AnonymousClass3XT extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92754i5();
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public AnonymousClass3XT(String str, byte[] bArr, int i2) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0D(parcel, this.A02, 3, AnonymousClass3K3.A1R(parcel, this.A01));
        C32251fv.A06(parcel, 4, this.A00);
        C32251fv.A05(parcel, A002);
    }
}
