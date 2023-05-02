package com.google.android.gms.maps.model;

import X.AnonymousClass000;
import X.C13690nt;
import X.C13700nu;
import X.C13710nw;
import X.C13930oJ;
import X.C15710ri;
import X.C32251fv;
import X.C92664hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LatLngBounds extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92664hw();
    public final LatLng A00;
    public final LatLng A01;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C13710nw.A02(latLng, "southwest must not be null.");
        C13710nw.A02(latLng2, "northeast must not be null.");
        double d2 = latLng2.A00;
        double d3 = latLng.A00;
        boolean A0f = C13700nu.A0f((d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)));
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = Double.valueOf(d3);
        A1Z[1] = Double.valueOf(d2);
        if (A0f) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        throw AnonymousClass000.A0T(String.format("southern latitude exceeds northern latitude (%s > %s)", A1Z));
    }

    public boolean A00(LatLng latLng) {
        C13710nw.A02(latLng, "point must not be null.");
        double d2 = latLng.A00;
        LatLng latLng2 = this.A01;
        if (latLng2.A00 > d2) {
            return false;
        }
        LatLng latLng3 = this.A00;
        if (d2 > latLng3.A00) {
            return false;
        }
        double d3 = latLng.A01;
        double d4 = latLng2.A01;
        double d5 = latLng3.A01;
        int i2 = (d4 > d3 ? 1 : (d4 == d3 ? 0 : -1));
        if (d4 <= d5) {
            if (i2 > 0) {
                return false;
            }
        } else if (i2 <= 0) {
            return true;
        }
        return d3 <= d5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LatLngBounds) {
                LatLngBounds latLngBounds = (LatLngBounds) obj;
                if (!this.A01.equals(latLngBounds.A01) || !this.A00.equals(latLngBounds.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A01;
        return AnonymousClass000.A0F(this.A00, A1Z, 1);
    }

    public String toString() {
        C13930oJ r2 = new C13930oJ(this);
        r2.A00(this.A01, "southwest");
        r2.A00(this.A00, "northeast");
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A09(parcel, this.A01, 2, i2, false);
        C32251fv.A09(parcel, this.A00, 3, i2, false);
        C32251fv.A05(parcel, A012);
    }
}
