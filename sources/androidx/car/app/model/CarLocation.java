package androidx.car.app.model;

import X.AnonymousClass000;

public final class CarLocation {
    public final double mLat = 0.0d;
    public final double mLng = 0.0d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLocation)) {
            return false;
        }
        CarLocation carLocation = (CarLocation) obj;
        return Double.doubleToLongBits(this.mLat) == Double.doubleToLongBits(carLocation.mLat) && Double.doubleToLongBits(this.mLng) == Double.doubleToLongBits(carLocation.mLng);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.mLat);
        return AnonymousClass000.A0F(Double.valueOf(this.mLng), objArr, 1);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        A0r.append(this.mLat);
        A0r.append(", ");
        A0r.append(this.mLng);
        return AnonymousClass000.A0h("]", A0r);
    }
}
