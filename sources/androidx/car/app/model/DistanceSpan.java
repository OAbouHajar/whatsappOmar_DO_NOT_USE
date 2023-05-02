package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class DistanceSpan extends CarSpan {
    public final Distance mDistance = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceSpan)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mDistance, ((DistanceSpan) obj).mDistance);
    }

    public int hashCode() {
        return AnonymousClass000.A0C(this.mDistance);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[distance: ");
        A0r.append(this.mDistance);
        return AnonymousClass000.A0h("]", A0r);
    }
}
