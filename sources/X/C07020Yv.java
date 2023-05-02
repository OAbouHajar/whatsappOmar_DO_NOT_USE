package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.0Yv  reason: invalid class name and case insensitive filesystem */
public class C07020Yv implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C02430Bw A00;

    public C07020Yv(C02430Bw r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        View view;
        C02430Bw r2 = this.A00;
        r2.postInvalidateOnAnimation();
        ViewGroup viewGroup = r2.A03;
        if (viewGroup == null || (view = r2.A02) == null) {
            return true;
        }
        viewGroup.endViewTransition(view);
        r2.A03.postInvalidateOnAnimation();
        r2.A03 = null;
        r2.A02 = null;
        return true;
    }
}
