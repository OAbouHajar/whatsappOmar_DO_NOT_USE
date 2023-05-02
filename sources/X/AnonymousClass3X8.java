package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3X8  reason: invalid class name */
public final class AnonymousClass3X8 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92844iE();
    public final int A00;
    public final PointF[] A01;

    public AnonymousClass3X8(PointF[] pointFArr, int i2) {
        this.A01 = pointFArr;
        this.A00 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0E(parcel, this.A01, 2, i2);
        C32251fv.A06(parcel, 3, this.A00);
        C32251fv.A05(parcel, A002);
    }
}
