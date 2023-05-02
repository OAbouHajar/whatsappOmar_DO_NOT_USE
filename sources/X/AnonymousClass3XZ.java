package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3XZ  reason: invalid class name */
public class AnonymousClass3XZ extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92244hF();
    public long A00;
    public boolean A01;
    public final int A02;
    public final boolean A03;

    public AnonymousClass3XZ(int i2, long j2, boolean z2, boolean z3) {
        this.A02 = i2;
        this.A01 = z2;
        this.A00 = j2;
        this.A03 = z3;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A02);
        C32251fv.A08(parcel, 2, this.A01);
        C32251fv.A07(parcel, 3, this.A00);
        C32251fv.A08(parcel, 4, this.A03);
        C32251fv.A05(parcel, A002);
    }
}
