package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class ForegroundCarColorSpan extends CarSpan {
    public final CarColor mCarColor = CarColor.A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForegroundCarColorSpan)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
    }

    public int hashCode() {
        return AnonymousClass000.A0C(this.mCarColor);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[color: ");
        A0r.append(this.mCarColor);
        return AnonymousClass000.A0h("]", A0r);
    }
}
