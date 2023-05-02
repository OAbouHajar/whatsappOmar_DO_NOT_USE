package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11790jL;
import androidx.car.app.model.CarText;

public final class PinSignInMethod implements C11790jL {
    public final CarText mPinCode = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinSignInMethod)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mPinCode, ((PinSignInMethod) obj).mPinCode);
    }

    public int hashCode() {
        return AnonymousClass000.A0F(this.mPinCode, new Object[1], 0);
    }
}
