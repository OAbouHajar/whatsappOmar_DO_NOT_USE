package X;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: X.4QN  reason: invalid class name */
public final class AnonymousClass4QN {
    public final WeakReference A00;

    public AnonymousClass4QN(C14530pL r2) {
        this.A00 = C13690nt.A0h(r2);
    }

    public final boolean A00(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        Activity activity = (Activity) this.A00.get();
        if (activity == null) {
            return false;
        }
        activity.finish();
        return false;
    }
}
