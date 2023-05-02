package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import java.util.Collections;
import java.util.List;

public final class ActionStrip {
    public final List mActions = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionStrip)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mActions, ((ActionStrip) obj).mActions);
    }

    public int hashCode() {
        return AnonymousClass000.A0C(this.mActions);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[action count: ");
        A0r.append(this.mActions.size());
        return AnonymousClass000.A0h("]", A0r);
    }
}
