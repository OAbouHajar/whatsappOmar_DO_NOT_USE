package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class TollCard {
    public final CarValue mCardState = CarValue.A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TollCard)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mCardState, ((TollCard) obj).mCardState);
    }

    public int hashCode() {
        return AnonymousClass000.A0F(this.mCardState, new Object[1], 0);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ tollcard state: ");
        A0r.append(this.mCardState);
        return AnonymousClass000.A0h("]", A0r);
    }
}
