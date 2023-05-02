package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class Accelerometer {
    public final CarValue mForces = CarValue.A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Accelerometer)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mForces, ((Accelerometer) obj).mForces);
    }

    public int hashCode() {
        return AnonymousClass000.A0F(this.mForces, new Object[1], 0);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ forces: ");
        A0r.append(this.mForces);
        return AnonymousClass000.A0h(" ]", A0r);
    }
}
