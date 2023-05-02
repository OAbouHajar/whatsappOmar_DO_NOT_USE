package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import java.util.Collections;
import java.util.List;

public final class Lane {
    public final List mDirections = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lane)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mDirections, ((Lane) obj).mDirections);
    }

    public int hashCode() {
        return AnonymousClass000.A0C(this.mDirections);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[direction count: ");
        List list = this.mDirections;
        A0r.append(list != null ? list.size() : 0);
        return AnonymousClass000.A0h("]", A0r);
    }
}
