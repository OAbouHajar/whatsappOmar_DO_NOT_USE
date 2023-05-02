package X;

import android.view.View;

/* renamed from: X.55D  reason: invalid class name */
public class AnonymousClass55D implements Runnable {
    public final /* synthetic */ C49662Uu A00;

    public AnonymousClass55D(C49662Uu r1) {
        this.A00 = r1;
    }

    public void run() {
        C49662Uu r3 = this.A00;
        View childAt = r3.A0H.getChildAt(0);
        if (childAt != null && r3.A0H.getFirstVisiblePosition() == 0) {
            int top2 = childAt.getTop();
            int i2 = r3.A08;
            if (top2 != i2) {
                r3.A0H.setSelectionFromTop(0, i2);
                r3.A0H.post(this);
                return;
            }
            ((C001000l) C19980zJ.A02(r3)).A0c();
            r3.A0H.setOnScrollListener(new C94604lB(this));
        }
    }
}
