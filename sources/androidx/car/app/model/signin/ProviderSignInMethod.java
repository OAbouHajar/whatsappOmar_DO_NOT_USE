package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11790jL;
import androidx.car.app.model.Action;

public final class ProviderSignInMethod implements C11790jL {
    public final Action mAction = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderSignInMethod)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mAction, ((ProviderSignInMethod) obj).mAction);
    }

    public int hashCode() {
        return AnonymousClass000.A0F(this.mAction, new Object[1], 0);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[action:");
        A0r.append(this.mAction);
        return AnonymousClass000.A0h("]", A0r);
    }
}
