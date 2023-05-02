package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.2sL  reason: invalid class name and case insensitive filesystem */
public final class C58012sL extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92694hz();
    public float A00 = 0.5f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.5f;
    public float A04 = 0.0f;
    public float A05 = 1.0f;
    public float A06;
    public AnonymousClass4C4 A07;
    public LatLng A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D = false;

    public C58012sL() {
    }

    public C58012sL(IBinder iBinder, LatLng latLng, String str, String str2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3, boolean z4) {
        this.A08 = latLng;
        this.A09 = str;
        this.A0A = str2;
        this.A07 = iBinder == null ? null : new AnonymousClass4C4(C31371e2.A00(iBinder));
        this.A00 = f2;
        this.A01 = f3;
        this.A0B = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A02 = f4;
        this.A03 = f5;
        this.A04 = f6;
        this.A05 = f7;
        this.A06 = f8;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A09(parcel, this.A08, 2, i2, false);
        C32251fv.A0A(parcel, this.A09, 3, false);
        C32251fv.A0A(parcel, this.A0A, 4, false);
        AnonymousClass4C4 r0 = this.A07;
        C32251fv.A03(r0 == null ? null : r0.A00.asBinder(), parcel, 5);
        C32251fv.A04(parcel, this.A00, 6);
        C32251fv.A04(parcel, this.A01, 7);
        C32251fv.A08(parcel, 8, this.A0B);
        C32251fv.A08(parcel, 9, this.A0C);
        C32251fv.A08(parcel, 10, this.A0D);
        C32251fv.A04(parcel, this.A02, 11);
        C32251fv.A04(parcel, this.A03, 12);
        C32251fv.A04(parcel, this.A04, 13);
        C32251fv.A04(parcel, this.A05, 14);
        C32251fv.A04(parcel, this.A06, 15);
        C32251fv.A05(parcel, A012);
    }
}
