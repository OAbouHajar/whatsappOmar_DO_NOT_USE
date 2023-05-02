package X;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0z8  reason: invalid class name and case insensitive filesystem */
public class C19870z8 {
    public final Set A00 = new HashSet();

    public void A00() {
        Runtime runtime = Runtime.getRuntime();
        synchronized (this) {
            for (WeakReference weakReference : this.A00) {
                C17870vm r1 = (C17870vm) weakReference.get();
                if (!(r1 == null || r1.AGG() == null)) {
                    r1.AGG();
                }
            }
        }
        runtime.freeMemory();
        runtime.totalMemory();
        runtime.maxMemory();
    }
}
