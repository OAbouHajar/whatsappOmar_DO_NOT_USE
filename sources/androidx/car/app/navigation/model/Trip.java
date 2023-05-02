package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;

public final class Trip {
    public final CarText mCurrentRoad = null;
    public final List mDestinationTravelEstimates = Collections.emptyList();
    public final List mDestinations = Collections.emptyList();
    public final boolean mIsLoading = false;
    public final List mStepTravelEstimates = Collections.emptyList();
    public final List mSteps = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trip)) {
            return false;
        }
        Trip trip = (Trip) obj;
        return AnonymousClass09S.A00(this.mDestinations, trip.mDestinations) && AnonymousClass09S.A00(this.mSteps, trip.mSteps) && AnonymousClass09S.A00(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && AnonymousClass09S.A00(this.mStepTravelEstimates, trip.mStepTravelEstimates) && AnonymousClass09S.A00(this.mCurrentRoad, trip.mCurrentRoad) && AnonymousClass09S.A01(Boolean.valueOf(this.mIsLoading), trip.mIsLoading);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mDestinations;
        objArr[1] = this.mSteps;
        objArr[2] = this.mDestinationTravelEstimates;
        objArr[3] = this.mStepTravelEstimates;
        return AnonymousClass000.A0F(this.mCurrentRoad, objArr, 4);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ destinations : ");
        AnonymousClass000.A1I(this.mDestinations, A0r);
        A0r.append(", steps: ");
        AnonymousClass000.A1I(this.mSteps, A0r);
        A0r.append(", dest estimates: ");
        AnonymousClass000.A1I(this.mDestinationTravelEstimates, A0r);
        A0r.append(", step estimates: ");
        AnonymousClass000.A1I(this.mStepTravelEstimates, A0r);
        A0r.append(", road: ");
        A0r.append(CarText.A00(this.mCurrentRoad));
        A0r.append(", isLoading: ");
        A0r.append(this.mIsLoading);
        return AnonymousClass000.A0h("]", A0r);
    }
}
