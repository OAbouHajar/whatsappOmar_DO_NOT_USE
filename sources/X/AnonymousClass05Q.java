package X;

import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: X.05Q  reason: invalid class name */
public final class AnonymousClass05Q {
    public final Runnable A00;
    public final ArrayDeque A01;

    public AnonymousClass05Q() {
        this((Runnable) null);
    }

    public AnonymousClass05Q(Runnable runnable) {
        this.A01 = new ArrayDeque();
        this.A00 = runnable;
    }

    public void A00() {
        Iterator descendingIterator = this.A01.descendingIterator();
        while (descendingIterator.hasNext()) {
            AnonymousClass068 r1 = (AnonymousClass068) descendingIterator.next();
            if (r1.A01) {
                r1.A00();
                return;
            }
        }
        this.A00.run();
    }

    public void A01(AnonymousClass068 r4, C001300o r5) {
        C009704q lifecycle = r5.getLifecycle();
        if (((C009604p) lifecycle).A02 != C011005f.DESTROYED) {
            r4.A00.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(r4, this, lifecycle));
        }
    }
}
