package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class DateTimeWithZone {
    public final long mTimeSinceEpochMillis = 0;
    public final int mZoneOffsetSeconds = 0;
    public final String mZoneShortName = null;

    static {
        TimeUnit.HOURS.toSeconds(1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && AnonymousClass09S.A00(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(this.mTimeSinceEpochMillis);
        AnonymousClass000.A1L(objArr, this.mZoneOffsetSeconds);
        return AnonymousClass000.A0F(this.mZoneShortName, objArr, 2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[time since epoch (ms): ");
        long j2 = this.mTimeSinceEpochMillis;
        A0r.append(j2);
        A0r.append("( ");
        A0r.append(new Date(j2));
        A0r.append(")  zone offset (s): ");
        A0r.append(this.mZoneOffsetSeconds);
        A0r.append(", zone: ");
        A0r.append(this.mZoneShortName);
        return AnonymousClass000.A0h("]", A0r);
    }
}
