package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.model.CarIcon;

public final class Maneuver {
    public final CarIcon mIcon = null;
    public final int mRoundaboutExitAngle = 0;
    public final int mRoundaboutExitNumber = 0;
    public final int mType = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Maneuver)) {
            return false;
        }
        Maneuver maneuver = (Maneuver) obj;
        return this.mType == maneuver.mType && this.mRoundaboutExitNumber == maneuver.mRoundaboutExitNumber && this.mRoundaboutExitAngle == maneuver.mRoundaboutExitAngle && AnonymousClass09S.A00(this.mIcon, maneuver.mIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1K(objArr, this.mType);
        AnonymousClass000.A1L(objArr, this.mRoundaboutExitNumber);
        objArr[2] = Integer.valueOf(this.mRoundaboutExitAngle);
        return AnonymousClass000.A0F(this.mIcon, objArr, 3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[type: ");
        A0r.append(this.mType);
        A0r.append(", exit #: ");
        A0r.append(this.mRoundaboutExitNumber);
        A0r.append(", exit angle: ");
        A0r.append(this.mRoundaboutExitAngle);
        A0r.append(", icon: ");
        A0r.append(this.mIcon);
        return AnonymousClass000.A0h("]", A0r);
    }
}
