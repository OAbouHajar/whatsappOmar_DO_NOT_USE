package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class CarHardwareLocation {
    public static final CarValue A00 = new CarValue((Object) null, 0, 2);
    public final CarValue mLocation = A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarHardwareLocation)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mLocation, ((CarHardwareLocation) obj).mLocation);
    }

    public int hashCode() {
        return AnonymousClass000.A0F(this.mLocation, new Object[1], 0);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ location: ");
        A0r.append(this.mLocation);
        return AnonymousClass000.A0h(" ]", A0r);
    }
}
