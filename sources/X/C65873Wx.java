package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Wx  reason: invalid class name and case insensitive filesystem */
public final class C65873Wx extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92744i4();
    public final String A00;

    public C65873Wx(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        AnonymousClass3K3.A12(parcel, this.A00, 2, C32251fv.A00(parcel));
    }
}
