package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11770jJ;
import X.C11810jN;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;

public final class RoutePreviewNavigationTemplate implements C11770jJ {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final ActionStrip mMapActionStrip = null;
    public final Action mNavigateAction = null;
    public final C11810jN mPanModeDelegate = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutePreviewNavigationTemplate)) {
            return false;
        }
        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
        return this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && AnonymousClass09S.A00(this.mTitle, routePreviewNavigationTemplate.mTitle) && AnonymousClass09S.A00(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && AnonymousClass09S.A00(this.mItemList, routePreviewNavigationTemplate.mItemList) && AnonymousClass09S.A00(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && AnonymousClass09S.A00(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && AnonymousClass09S.A00(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip) && AnonymousClass09S.A01(Boolean.valueOf(AnonymousClass000.A1W(this.mPanModeDelegate)), AnonymousClass000.A1W(routePreviewNavigationTemplate.mPanModeDelegate));
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        boolean z2 = false;
        objArr[0] = this.mTitle;
        objArr[1] = Boolean.valueOf(this.mIsLoading);
        objArr[2] = this.mNavigateAction;
        objArr[3] = this.mItemList;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mMapActionStrip;
        if (this.mPanModeDelegate == null) {
            z2 = true;
        }
        return AnonymousClass000.A0F(Boolean.valueOf(z2), objArr, 7);
    }

    public String toString() {
        return "RoutePreviewNavigationTemplate";
    }
}
