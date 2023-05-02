package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.05X  reason: invalid class name */
public final class AnonymousClass05X {
    public Bundle A00;
    public AnonymousClass05s A01;
    public boolean A02;
    public boolean A03 = true;
    public boolean A04;
    public final AnonymousClass03P A05 = new AnonymousClass03P();

    public static final void A00(C011405n r2, AnonymousClass05X r3) {
        C18450wi.A0H(r2, 2);
        if (r2 == C011405n.ON_START) {
            r3.A03 = true;
        } else if (r2 == C011405n.ON_STOP) {
            r3.A03 = false;
        }
    }

    public final Bundle A01(String str) {
        C18450wi.A0H(str, 0);
        if (this.A04) {
            Bundle bundle = this.A00;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.A00;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.A00 = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void A02() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C18450wi.A09(entry);
            Object key = entry.getKey();
            entry.getValue();
            if (C18450wi.A0R(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return;
            }
        }
    }

    public final void A03() {
        Class<C011705q> cls = C011705q.class;
        if (this.A03) {
            AnonymousClass05s r0 = this.A01;
            if (r0 == null) {
                r0 = new AnonymousClass05s(this);
            }
            this.A01 = r0;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                AnonymousClass05s r02 = this.A01;
                if (r02 != null) {
                    String name = cls.getName();
                    C18450wi.A0B(name);
                    r02.A00.add(name);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder sb = new StringBuilder("Class ");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void A04(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        AnonymousClass03P r0 = this.A05;
        C011505o r2 = new C011505o(r0);
        r0.A03.put(r2, Boolean.FALSE);
        while (r2.hasNext()) {
            Map.Entry entry = (Map.Entry) r2.next();
            bundle2.putBundle((String) entry.getKey(), ((AnonymousClass05Y) entry.getValue()).Ad1());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void A05(AnonymousClass05Y r3, String str) {
        C18450wi.A0H(str, 0);
        C18450wi.A0H(r3, 1);
        if (this.A05.A02(str, r3) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
