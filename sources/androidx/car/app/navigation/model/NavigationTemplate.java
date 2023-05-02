package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11770jJ;
import X.C11800jM;
import X.C11810jN;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Toggle;

public final class NavigationTemplate implements C11770jJ {
    public final ActionStrip mActionStrip = null;
    public final CarColor mBackgroundColor = null;
    public final TravelEstimate mDestinationTravelEstimate = null;
    public final ActionStrip mMapActionStrip = null;
    public final C11800jM mNavigationInfo = null;
    public final C11810jN mPanModeDelegate = null;
    public final Toggle mPanModeToggle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
        return AnonymousClass09S.A00(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && AnonymousClass09S.A00(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && AnonymousClass09S.A00(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && AnonymousClass09S.A00(this.mActionStrip, navigationTemplate.mActionStrip) && AnonymousClass09S.A00(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && AnonymousClass09S.A00(this.mPanModeToggle, navigationTemplate.mPanModeToggle) && AnonymousClass09S.A01(Boolean.valueOf(AnonymousClass000.A1W(this.mPanModeDelegate)), AnonymousClass000.A1W(navigationTemplate.mPanModeDelegate));
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        boolean z2 = false;
        objArr[0] = this.mNavigationInfo;
        objArr[1] = this.mBackgroundColor;
        objArr[2] = this.mDestinationTravelEstimate;
        objArr[3] = this.mActionStrip;
        objArr[4] = this.mMapActionStrip;
        objArr[5] = this.mPanModeToggle;
        if (this.mPanModeDelegate == null) {
            z2 = true;
        }
        return AnonymousClass000.A0F(Boolean.valueOf(z2), objArr, 6);
    }

    public String toString() {
        return "NavigationTemplate";
    }
}
