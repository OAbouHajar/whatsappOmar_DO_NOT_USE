package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.5BE  reason: invalid class name */
public final class AnonymousClass5BE extends WeakReference {
    public final int A00;

    public AnonymousClass5BE(Throwable th) {
        super(th, (ReferenceQueue) null);
        this.A00 = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == AnonymousClass5BE.class) {
            if (this != obj) {
                AnonymousClass5BE r5 = (AnonymousClass5BE) obj;
                if (!(this.A00 == r5.A00 && get() == r5.get())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }
}
