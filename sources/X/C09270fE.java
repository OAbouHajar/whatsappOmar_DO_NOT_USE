package X;

import android.view.ViewParent;

/* renamed from: X.0fE  reason: invalid class name and case insensitive filesystem */
public class C09270fE implements Runnable {
    public final /* synthetic */ C06970Yq A00;

    public C09270fE(C06970Yq r1) {
        this.A00 = r1;
    }

    public void run() {
        ViewParent parent = this.A00.A07.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
