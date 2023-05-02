package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: X.3XC  reason: invalid class name */
public final class AnonymousClass3XC extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92984iS();
    public final int A00;
    public final ParcelFileDescriptor A01;

    public AnonymousClass3XC(ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.A00 = i2;
        this.A01 = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        AnonymousClass3K2.A0x(parcel, this.A01, i2, A002);
    }
}
