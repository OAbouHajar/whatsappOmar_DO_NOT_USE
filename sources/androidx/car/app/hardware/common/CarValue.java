package androidx.car.app.hardware.common;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class CarValue {
    public static final CarValue A00 = new CarValue((Object) null, 0, 2);
    public static final CarValue A01 = new CarValue((Object) null, 0, 2);
    public static final CarValue A02 = new CarValue((Object) null, 0, 2);
    public static final CarValue A03 = new CarValue((Object) null, 0, 2);
    public static final CarValue A04 = new CarValue((Object) null, 0, 2);
    public static final CarValue A05 = new CarValue((Object) null, 0, 2);
    public final int mStatus = 0;
    public final long mTimestampMillis = 0;
    public final Object mValue = null;

    public CarValue() {
    }

    public CarValue(Object obj, long j2, int i2) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarValue)) {
            return false;
        }
        CarValue carValue = (CarValue) obj;
        return AnonymousClass09S.A00(this.mValue, carValue.mValue) && this.mTimestampMillis == carValue.mTimestampMillis && this.mStatus == carValue.mStatus;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mValue;
        objArr[1] = Long.valueOf(this.mTimestampMillis);
        return AnonymousClass000.A0F(Integer.valueOf(this.mStatus), objArr, 2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[value: ");
        A0r.append(this.mValue);
        A0r.append(", timestamp: ");
        A0r.append(this.mTimestampMillis);
        A0r.append(", Status: ");
        A0r.append(this.mStatus);
        return AnonymousClass000.A0h("]", A0r);
    }
}
