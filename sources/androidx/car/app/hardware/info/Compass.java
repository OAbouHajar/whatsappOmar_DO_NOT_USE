package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class Compass {
    public final CarValue mOrientations = CarValue.A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Compass)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mOrientations, ((Compass) obj).mOrientations);
    }

    public int hashCode() {
        return AnonymousClass000.A0F(this.mOrientations, new Object[1], 0);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ orientations: ");
        A0r.append(this.mOrientations);
        return AnonymousClass000.A0h(" ]", A0r);
    }
}
