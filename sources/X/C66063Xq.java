package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.3Xq  reason: invalid class name and case insensitive filesystem */
public final class C66063Xq extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92714i1();
    public final LatLng A00;
    public final LatLng A01;
    public final LatLng A02;
    public final LatLng A03;
    public final LatLngBounds A04;

    public C66063Xq(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.A02 = latLng;
        this.A03 = latLng2;
        this.A00 = latLng3;
        this.A01 = latLng4;
        this.A04 = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66063Xq) {
                C66063Xq r5 = (C66063Xq) obj;
                if (!this.A02.equals(r5.A02) || !this.A03.equals(r5.A03) || !this.A00.equals(r5.A00) || !this.A01.equals(r5.A01) || !this.A04.equals(r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = this.A00;
        objArr[3] = this.A01;
        return AnonymousClass000.A0F(this.A04, objArr, 4);
    }

    public String toString() {
        C13930oJ r2 = new C13930oJ(this);
        r2.A00(this.A02, "nearLeft");
        r2.A00(this.A03, "nearRight");
        r2.A00(this.A00, "farLeft");
        r2.A00(this.A01, "farRight");
        r2.A00(this.A04, "latLngBounds");
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A09(parcel, this.A02, 2, i2, false);
        C32251fv.A09(parcel, this.A03, 3, i2, false);
        C32251fv.A09(parcel, this.A00, 4, i2, false);
        C32251fv.A09(parcel, this.A01, 5, i2, false);
        C32251fv.A09(parcel, this.A04, 6, i2, false);
        C32251fv.A05(parcel, A002);
    }
}
