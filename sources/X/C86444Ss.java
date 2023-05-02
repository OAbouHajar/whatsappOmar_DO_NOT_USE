package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4Ss  reason: invalid class name and case insensitive filesystem */
public abstract class C86444Ss {
    public final ThreadLocal A00 = new AnonymousClass5B6(this);

    public abstract Object A00();

    public synchronized Object A01() {
        Object obj;
        ThreadLocal threadLocal = this.A00;
        obj = ((WeakReference) threadLocal.get()).get();
        if (obj == null) {
            obj = A00();
            threadLocal.set(C13690nt.A0h(obj));
        }
        return obj;
    }
}
