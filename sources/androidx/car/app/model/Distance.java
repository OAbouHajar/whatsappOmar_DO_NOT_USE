package androidx.car.app.model;

import X.AnonymousClass000;
import java.util.Locale;

public final class Distance {
    public final double mDisplayDistance = 0.0d;
    public final int mDisplayUnit = 1;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Distance)) {
            return false;
        }
        Distance distance = (Distance) obj;
        return this.mDisplayUnit == distance.mDisplayUnit && this.mDisplayDistance == distance.mDisplayDistance;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.mDisplayDistance);
        return AnonymousClass000.A0F(Integer.valueOf(this.mDisplayUnit), objArr, 1);
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.mDisplayDistance);
        switch (this.mDisplayUnit) {
            case 1:
                str = "m";
                break;
            case 2:
                str = "km";
                break;
            case 3:
                str = "km_p1";
                break;
            case 4:
                str = "mi";
                break;
            case 5:
                str = "mi_p1";
                break;
            case 6:
                str = "ft";
                break;
            case 7:
                str = "yd";
                break;
            default:
                str = "?";
                break;
        }
        objArr[1] = str;
        return String.format(locale, "%.04f%s", objArr);
    }
}
