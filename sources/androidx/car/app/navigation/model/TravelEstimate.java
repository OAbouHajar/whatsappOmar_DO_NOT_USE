package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;

public final class TravelEstimate {
    public final DateTimeWithZone mArrivalTimeAtDestination = null;
    public final Distance mRemainingDistance = null;
    public final CarColor mRemainingDistanceColor;
    public final CarColor mRemainingTimeColor;
    public final long mRemainingTimeSeconds = 0;

    public TravelEstimate() {
        CarColor carColor = CarColor.A00;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelEstimate)) {
            return false;
        }
        TravelEstimate travelEstimate = (TravelEstimate) obj;
        return AnonymousClass09S.A00(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && AnonymousClass09S.A00(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && AnonymousClass09S.A00(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && AnonymousClass09S.A00(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mRemainingDistance;
        objArr[1] = Long.valueOf(this.mRemainingTimeSeconds);
        objArr[2] = this.mArrivalTimeAtDestination;
        objArr[3] = this.mRemainingTimeColor;
        return AnonymousClass000.A0F(this.mRemainingDistanceColor, objArr, 4);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ remaining distance: ");
        A0r.append(this.mRemainingDistance);
        A0r.append(", time (s): ");
        A0r.append(this.mRemainingTimeSeconds);
        A0r.append(", ETA: ");
        A0r.append(this.mArrivalTimeAtDestination);
        return AnonymousClass000.A0h("]", A0r);
    }
}
