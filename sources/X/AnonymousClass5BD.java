package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.5BD  reason: invalid class name */
public final class AnonymousClass5BD extends WeakReference {
    public final int A00;

    public AnonymousClass5BD(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        this.A00 = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == AnonymousClass5BD.class) {
            if (this != obj) {
                AnonymousClass5BD r5 = (AnonymousClass5BD) obj;
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
