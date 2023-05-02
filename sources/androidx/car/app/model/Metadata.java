package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class Metadata {
    public static final Metadata A00 = new Metadata((Place) null);
    public final Place mPlace = null;

    public Metadata() {
    }

    public Metadata(Place place) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mPlace, ((Metadata) obj).mPlace);
    }

    public int hashCode() {
        return AnonymousClass000.A0C(this.mPlace);
    }
}
