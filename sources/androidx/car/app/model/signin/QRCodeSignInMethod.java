package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11790jL;
import android.net.Uri;

public final class QRCodeSignInMethod implements C11790jL {
    public final Uri mUri = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCodeSignInMethod)) {
            return false;
        }
        return AnonymousClass09S.A00(this.mUri, ((QRCodeSignInMethod) obj).mUri);
    }

    public int hashCode() {
        return AnonymousClass000.A0F(this.mUri, new Object[1], 0);
    }
}
