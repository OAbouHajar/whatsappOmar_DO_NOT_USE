package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11800jM;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Distance;

public final class RoutingInfo implements C11800jM {
    public final Distance mCurrentDistance = null;
    public final Step mCurrentStep = null;
    public final boolean mIsLoading = false;
    public final CarIcon mJunctionImage = null;
    public final Step mNextStep = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutingInfo)) {
            return false;
        }
        RoutingInfo routingInfo = (RoutingInfo) obj;
        return this.mIsLoading == routingInfo.mIsLoading && AnonymousClass09S.A00(this.mCurrentStep, routingInfo.mCurrentStep) && AnonymousClass09S.A00(this.mCurrentDistance, routingInfo.mCurrentDistance) && AnonymousClass09S.A00(this.mNextStep, routingInfo.mNextStep) && AnonymousClass09S.A00(this.mJunctionImage, routingInfo.mJunctionImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mCurrentStep;
        objArr[1] = this.mCurrentDistance;
        objArr[2] = this.mNextStep;
        objArr[3] = this.mJunctionImage;
        return AnonymousClass000.A0F(Boolean.valueOf(this.mIsLoading), objArr, 4);
    }

    public String toString() {
        return "RoutingInfo";
    }
}
