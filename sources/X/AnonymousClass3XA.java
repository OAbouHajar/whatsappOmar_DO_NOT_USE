package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.3XA  reason: invalid class name */
public final class AnonymousClass3XA extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92964iQ();
    public final int A00;
    public final List A01;

    public AnonymousClass3XA(List list, int i2) {
        this.A00 = i2;
        this.A01 = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        C32251fv.A0C(parcel, this.A01, 3, false);
        C32251fv.A05(parcel, A002);
    }
}
