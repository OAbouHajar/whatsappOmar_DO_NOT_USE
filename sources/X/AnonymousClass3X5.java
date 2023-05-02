package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.3X5  reason: invalid class name */
public class AnonymousClass3X5 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92384hT();
    public List A00;
    public final int A01;

    public AnonymousClass3X5(List list, int i2) {
        this.A01 = i2;
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A01);
        C32251fv.A0C(parcel, this.A00, 2, false);
        C32251fv.A05(parcel, A002);
    }
}
