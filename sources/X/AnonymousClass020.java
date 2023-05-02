package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.020  reason: invalid class name */
public final class AnonymousClass020 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C06800Xu();
    public final double A00;
    public final double A01;

    public AnonymousClass020(double d2, double d3) {
        this.A00 = d2;
        this.A01 = d3;
    }

    public AnonymousClass020(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }

    public double A00(AnonymousClass020 r9) {
        double d2 = this.A00;
        double d3 = r9.A00;
        return Math.sqrt(Math.pow(d2 - d3, 2.0d) + Math.pow((this.A01 - r9.A01) * Math.cos(Math.toRadians(d3)), 2.0d)) * 110250.0d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass020)) {
            return false;
        }
        AnonymousClass020 r7 = (AnonymousClass020) obj;
        return Math.abs(this.A00 - r7.A00) < 0.002d && Math.abs(this.A01 - r7.A01) < 2.0E-4d;
    }

    public int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LatLng");
        sb.append("{latitude=");
        sb.append(this.A00);
        sb.append(", longitude=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }
}
