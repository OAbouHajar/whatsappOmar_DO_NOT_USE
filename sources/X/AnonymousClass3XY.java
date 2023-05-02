package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.3XY  reason: invalid class name */
public final class AnonymousClass3XY extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93214ip();
    public final int A00;
    public final long A01;
    public final List A02;

    public AnonymousClass3XY(List list, int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        C32251fv.A07(parcel, 3, this.A01);
        C32251fv.A0C(parcel, this.A02, 4, false);
        C32251fv.A05(parcel, A002);
    }
}
