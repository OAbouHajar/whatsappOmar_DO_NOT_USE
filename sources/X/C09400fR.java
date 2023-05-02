package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0fR  reason: invalid class name and case insensitive filesystem */
public class C09400fR implements Runnable {
    public final WeakReference A00;

    public C09400fR(AnonymousClass0F6 r2) {
        this.A00 = new WeakReference(r2);
    }

    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass0F6) weakReference.get()).A0K = false;
        }
    }
}
