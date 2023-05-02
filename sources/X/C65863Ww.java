package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Ww  reason: invalid class name and case insensitive filesystem */
public final class C65863Ww extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92564hl();
    public final String A00;

    public C65863Ww(String str) {
        C13710nw.A01(str);
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, 1);
        AnonymousClass3K3.A12(parcel, this.A00, 2, A002);
    }
}
