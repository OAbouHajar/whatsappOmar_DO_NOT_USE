package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class CarIconSpan extends CarSpan {
    public final int mAlignment = 1;
    public final CarIcon mIcon = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIconSpan)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mIcon, ((CarIconSpan) obj).mIcon);
    }

    public int hashCode() {
        return AnonymousClass000.A0C(this.mIcon);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[icon: ");
        A0r.append(this.mIcon);
        A0r.append(", alignment: ");
        int i2 = this.mAlignment;
        A0r.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "center" : "baseline" : "bottom");
        return AnonymousClass000.A0h("]", A0r);
    }
}
