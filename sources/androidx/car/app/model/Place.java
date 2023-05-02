package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class Place {
    public final CarLocation mLocation = null;
    public final PlaceMarker mMarker = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return AnonymousClass09S.A00(this.mLocation, place.mLocation) && AnonymousClass09S.A00(this.mMarker, place.mMarker);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mLocation;
        return AnonymousClass000.A0F(this.mMarker, objArr, 1);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ location: ");
        A0r.append(this.mLocation);
        A0r.append(", marker: ");
        A0r.append(this.mMarker);
        return AnonymousClass000.A0h("]", A0r);
    }
}
