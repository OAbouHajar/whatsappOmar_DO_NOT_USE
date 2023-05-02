package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XW  reason: invalid class name */
public final class AnonymousClass3XW extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93154ij();
    public final long A00;
    public final String A01;
    public final String A02;

    public AnonymousClass3XW(String str, String str2, long j2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0A(parcel, this.A02, 3, AnonymousClass3K3.A1R(parcel, this.A01));
        C32251fv.A07(parcel, 4, this.A00);
        C32251fv.A05(parcel, A002);
    }
}
