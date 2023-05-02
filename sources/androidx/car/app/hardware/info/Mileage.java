package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class Mileage {
    public final CarValue mDistanceDisplayUnit = CarValue.A03;
    public final CarValue mOdometerMeters = CarValue.A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return AnonymousClass09S.A00(this.mOdometerMeters, mileage.mOdometerMeters) && AnonymousClass09S.A00(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mOdometerMeters;
        return AnonymousClass000.A0F(this.mDistanceDisplayUnit, objArr, 1);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ odometer: ");
        A0r.append(this.mOdometerMeters);
        A0r.append(", distance display unit: ");
        A0r.append(this.mDistanceDisplayUnit);
        return AnonymousClass000.A0h("]", A0r);
    }
}
