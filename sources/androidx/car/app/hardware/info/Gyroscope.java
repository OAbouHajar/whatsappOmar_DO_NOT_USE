package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class Gyroscope {
    public final CarValue mRotations = CarValue.A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gyroscope)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mRotations, ((Gyroscope) obj).mRotations);
    }

    public int hashCode() {
        return AnonymousClass000.A0F(this.mRotations, new Object[1], 0);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ rotations: ");
        A0r.append(this.mRotations);
        return AnonymousClass000.A0h(" ]", A0r);
    }
}
