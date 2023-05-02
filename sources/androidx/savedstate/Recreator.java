package androidx.savedstate;

import X.AnonymousClass05T;
import X.AnonymousClass05X;
import X.AnonymousClass07H;
import X.C001300o;
import X.C001500q;
import X.C001600r;
import X.C003401n;
import X.C010505a;
import X.C011405n;
import X.C011805r;
import X.C18450wi;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class Recreator implements AnonymousClass05T {
    public final C001600r A00;

    public Recreator(C001600r r1) {
        this.A00 = r1;
    }

    public final void A00(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C011805r.class);
            C18450wi.A0B(asSubclass);
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    C18450wi.A0B(declaredConstructor.newInstance(new Object[0]));
                    C001600r r5 = this.A00;
                    if (r5 instanceof C001500q) {
                        C010505a AGy = ((C001500q) r5).AGy();
                        AnonymousClass05X AFh = r5.AFh();
                        HashMap hashMap = AGy.A00;
                        Iterator it = new HashSet(hashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            AnonymousClass07H.A00(r5.getLifecycle(), (C003401n) hashMap.get(it.next()), AFh);
                        }
                        if (!new HashSet(hashMap.keySet()).isEmpty()) {
                            AFh.A03();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder("Failed to instantiate ");
                    sb.append(str);
                    throw new RuntimeException(sb.toString(), e2);
                }
            } catch (NoSuchMethodException e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Class ");
                sb2.append(asSubclass.getSimpleName());
                sb2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb2.toString(), e3);
            }
        } catch (ClassNotFoundException e4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Class ");
            sb3.append(str);
            sb3.append(" wasn't found");
            throw new RuntimeException(sb3.toString(), e4);
        }
    }

    public void AXa(C011405n r3, C001300o r4) {
        C18450wi.A0H(r4, 0);
        C18450wi.A0H(r3, 1);
        if (r3 == C011405n.ON_CREATE) {
            r4.getLifecycle().A01(this);
            Bundle A01 = this.A00.AFh().A01("androidx.savedstate.Restarter");
            if (A01 != null) {
                ArrayList<String> stringArrayList = A01.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        A00(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
