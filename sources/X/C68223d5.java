package X;

import android.os.Bundle;

/* renamed from: X.3d5  reason: invalid class name and case insensitive filesystem */
public final class C68223d5 extends C14480pF {
    public C68223d5(int i2, Bundle bundle) {
        super(bundle, i2, 2);
    }

    public final void A00(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            A02((Object) null);
        } else {
            A01(new C14520pJ(4, "Invalid response to one way request"));
        }
    }

    public final boolean A03() {
        return true;
    }
}
