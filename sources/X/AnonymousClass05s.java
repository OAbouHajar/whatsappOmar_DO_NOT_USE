package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.05s  reason: invalid class name */
public final class AnonymousClass05s implements AnonymousClass05Y {
    public final Set A00 = new LinkedHashSet();

    public AnonymousClass05s(AnonymousClass05X r2) {
        r2.A05(this, "androidx.savedstate.Restarter");
    }

    public Bundle Ad1() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList(this.A00));
        return bundle;
    }
}
