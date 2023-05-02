package com.google.android.gms.maps.model;

import X.C15710ri;
import X.C32251fv;
import X.C92674hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LatLng extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92674hx();
    public final double A00;
    public final double A01;

    public LatLng(double d2, double d3) {
        this.A01 = (d3 < -180.0d || d3 >= 180.0d) ? ((((d3 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d : d3;
        this.A00 = Math.max(-90.0d, Math.min(90.0d, d2));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LatLng) {
                LatLng latLng = (LatLng) obj;
                if (!(Double.doubleToLongBits(this.A00) == Double.doubleToLongBits(latLng.A00) && Double.doubleToLongBits(this.A01) == Double.doubleToLongBits(latLng.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        long doubleToLongBits2 = Double.doubleToLongBits(this.A01);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d2 = this.A00;
        double d3 = this.A01;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d2);
        sb.append(",");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        double d2 = this.A00;
        parcel.writeInt(524290);
        parcel.writeDouble(d2);
        double d3 = this.A01;
        parcel.writeInt(524291);
        parcel.writeDouble(d3);
        C32251fv.A05(parcel, A012);
    }
}
