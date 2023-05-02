package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XS  reason: invalid class name */
public class AnonymousClass3XS extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92254hG();
    public int A00;
    public Bundle A01;
    public final int A02;

    public AnonymousClass3XS(Bundle bundle, int i2, int i3) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A02);
        C32251fv.A06(parcel, 2, this.A00);
        C32251fv.A02(this.A01, parcel, 3);
        C32251fv.A05(parcel, A002);
    }
}
