package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11770jJ;

public final class PlaceListMapTemplate implements C11770jJ {
    public final ActionStrip mActionStrip = null;
    public final Place mAnchor = null;
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final boolean mShowCurrentLocation = false;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListMapTemplate)) {
            return false;
        }
        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
        return this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && AnonymousClass09S.A00(this.mTitle, placeListMapTemplate.mTitle) && AnonymousClass09S.A00(this.mItemList, placeListMapTemplate.mItemList) && AnonymousClass09S.A00(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && AnonymousClass09S.A00(this.mActionStrip, placeListMapTemplate.mActionStrip) && AnonymousClass09S.A00(this.mAnchor, placeListMapTemplate.mAnchor);
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass000.A1N(objArr, this.mShowCurrentLocation);
        objArr[1] = Boolean.valueOf(this.mIsLoading);
        objArr[2] = this.mTitle;
        objArr[3] = this.mItemList;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionStrip;
        return AnonymousClass000.A0F(this.mAnchor, objArr, 6);
    }

    public String toString() {
        return "PlaceListMapTemplate";
    }
}
