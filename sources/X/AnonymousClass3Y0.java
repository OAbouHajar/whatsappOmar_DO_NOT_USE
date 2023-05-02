package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: X.3Y0  reason: invalid class name */
public final class AnonymousClass3Y0 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92654hv();
    public double A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public LatLng A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public AnonymousClass3Y0() {
        this.A05 = null;
        this.A00 = 0.0d;
        this.A01 = 10.0f;
        this.A03 = -16777216;
        this.A04 = 0;
        this.A02 = 0.0f;
        this.A07 = true;
        this.A08 = false;
        this.A06 = null;
    }

    public AnonymousClass3Y0(LatLng latLng, List list, double d2, float f2, float f3, int i2, int i3, boolean z2, boolean z3) {
        this.A05 = latLng;
        this.A00 = d2;
        this.A01 = f2;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = f3;
        this.A07 = z2;
        this.A08 = z3;
        this.A06 = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A09(parcel, this.A05, 2, i2, false);
        double d2 = this.A00;
        parcel.writeInt(524291);
        parcel.writeDouble(d2);
        C32251fv.A04(parcel, this.A01, 4);
        C32251fv.A06(parcel, 5, this.A03);
        C32251fv.A06(parcel, 6, this.A04);
        C32251fv.A04(parcel, this.A02, 7);
        C32251fv.A08(parcel, 8, this.A07);
        C32251fv.A08(parcel, 9, this.A08);
        C32251fv.A0C(parcel, this.A06, 10, false);
        C32251fv.A05(parcel, A002);
    }
}
