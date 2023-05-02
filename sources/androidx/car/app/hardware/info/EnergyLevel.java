package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class EnergyLevel {
    public final CarValue mBatteryPercent;
    public final CarValue mDistanceDisplayUnit;
    public final CarValue mEnergyIsLow = CarValue.A00;
    public final CarValue mFuelPercent;
    public final CarValue mFuelVolumeDisplayUnit;
    public final CarValue mRangeRemainingMeters;

    public EnergyLevel() {
        CarValue carValue = CarValue.A01;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mRangeRemainingMeters = carValue;
        CarValue carValue2 = CarValue.A03;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyLevel)) {
            return false;
        }
        EnergyLevel energyLevel = (EnergyLevel) obj;
        return AnonymousClass09S.A00(this.mBatteryPercent, energyLevel.mBatteryPercent) && AnonymousClass09S.A00(this.mFuelPercent, energyLevel.mFuelPercent) && AnonymousClass09S.A00(this.mEnergyIsLow, energyLevel.mEnergyIsLow) && AnonymousClass09S.A00(this.mRangeRemainingMeters, energyLevel.mRangeRemainingMeters) && AnonymousClass09S.A00(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && AnonymousClass09S.A00(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.mBatteryPercent;
        objArr[1] = this.mFuelPercent;
        objArr[2] = this.mEnergyIsLow;
        objArr[3] = this.mRangeRemainingMeters;
        objArr[4] = this.mDistanceDisplayUnit;
        return AnonymousClass000.A0F(this.mFuelVolumeDisplayUnit, objArr, 5);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ battery percent: ");
        A0r.append(this.mBatteryPercent);
        A0r.append(", fuel percent: ");
        A0r.append(this.mFuelPercent);
        A0r.append(", energyIsLow: ");
        A0r.append(this.mEnergyIsLow);
        A0r.append(", range remaining: ");
        A0r.append(this.mRangeRemainingMeters);
        A0r.append(", distance display unit: ");
        A0r.append(this.mDistanceDisplayUnit);
        A0r.append(", fuel volume display unit: ");
        A0r.append(this.mFuelVolumeDisplayUnit);
        return AnonymousClass000.A0h("]", A0r);
    }
}
