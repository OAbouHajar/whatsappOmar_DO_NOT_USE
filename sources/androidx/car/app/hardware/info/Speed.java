package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class Speed {
    public final CarValue mDisplaySpeedMetersPerSecond;
    public final CarValue mRawSpeedMetersPerSecond;
    public final CarValue mSpeedDisplayUnit = CarValue.A03;

    public Speed() {
        CarValue carValue = CarValue.A01;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Speed)) {
            return false;
        }
        Speed speed = (Speed) obj;
        return AnonymousClass09S.A00(this.mRawSpeedMetersPerSecond, speed.mRawSpeedMetersPerSecond) && AnonymousClass09S.A00(this.mDisplaySpeedMetersPerSecond, speed.mDisplaySpeedMetersPerSecond) && AnonymousClass09S.A00(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mRawSpeedMetersPerSecond;
        objArr[1] = this.mDisplaySpeedMetersPerSecond;
        return AnonymousClass000.A0F(this.mSpeedDisplayUnit, objArr, 2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ raw speed: ");
        A0r.append(this.mRawSpeedMetersPerSecond);
        A0r.append(", display speed: ");
        A0r.append(this.mDisplaySpeedMetersPerSecond);
        A0r.append(", speed display unit: ");
        A0r.append(this.mSpeedDisplayUnit);
        return AnonymousClass000.A0h("]", A0r);
    }
}
