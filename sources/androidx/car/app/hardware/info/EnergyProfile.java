package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class EnergyProfile {
    public final CarValue mEvConnectorTypes;
    public final CarValue mFuelTypes;

    public EnergyProfile() {
        CarValue carValue = CarValue.A04;
        this.mEvConnectorTypes = carValue;
        this.mFuelTypes = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyProfile)) {
            return false;
        }
        EnergyProfile energyProfile = (EnergyProfile) obj;
        return AnonymousClass09S.A00(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && AnonymousClass09S.A00(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mEvConnectorTypes;
        return AnonymousClass000.A0F(this.mFuelTypes, objArr, 1);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ evConnectorTypes: ");
        A0r.append(this.mEvConnectorTypes);
        A0r.append(", fuelTypes: ");
        A0r.append(this.mFuelTypes);
        return AnonymousClass000.A0h("]", A0r);
    }
}
