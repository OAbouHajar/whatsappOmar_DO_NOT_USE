package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;

public final class Step {
    public final CarText mCue = null;
    public final List mLanes = Collections.emptyList();
    public final CarIcon mLanesImage = null;
    public final Maneuver mManeuver = null;
    public final CarText mRoad = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return AnonymousClass09S.A00(this.mManeuver, step.mManeuver) && AnonymousClass09S.A00(this.mLanes, step.mLanes) && AnonymousClass09S.A00(this.mLanesImage, step.mLanesImage) && AnonymousClass09S.A00(this.mCue, step.mCue) && AnonymousClass09S.A00(this.mRoad, step.mRoad);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mManeuver;
        objArr[1] = this.mLanes;
        objArr[2] = this.mLanesImage;
        objArr[3] = this.mCue;
        return AnonymousClass000.A0F(this.mRoad, objArr, 4);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[maneuver: ");
        A0r.append(this.mManeuver);
        A0r.append(", lane count: ");
        List list = this.mLanes;
        A0r.append(list != null ? list.size() : 0);
        A0r.append(", lanes image: ");
        A0r.append(this.mLanesImage);
        A0r.append(", cue: ");
        A0r.append(CarText.A00(this.mCue));
        A0r.append(", road: ");
        A0r.append(CarText.A00(this.mRoad));
        return AnonymousClass000.A0h("]", A0r);
    }
}
