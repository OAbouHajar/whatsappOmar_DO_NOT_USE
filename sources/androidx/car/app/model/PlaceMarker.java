package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class PlaceMarker {
    public final CarColor mColor = null;
    public final CarIcon mIcon = null;
    public final int mIconType = 0;
    public final CarText mLabel = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceMarker)) {
            return false;
        }
        PlaceMarker placeMarker = (PlaceMarker) obj;
        return AnonymousClass09S.A00(this.mIcon, placeMarker.mIcon) && AnonymousClass09S.A00(this.mLabel, placeMarker.mLabel) && AnonymousClass09S.A00(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mIcon;
        objArr[1] = this.mLabel;
        objArr[2] = this.mColor;
        return AnonymousClass000.A0F(Integer.valueOf(this.mIconType), objArr, 3);
    }

    public String toString() {
        String A00;
        StringBuilder A0r = AnonymousClass000.A0r("[");
        CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            A00 = carIcon.toString();
        } else {
            CarText carText = this.mLabel;
            A00 = carText != null ? CarText.A00(carText) : super.toString();
        }
        A0r.append(A00);
        return AnonymousClass000.A0h("]", A0r);
    }
}
