package X;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0Yu  reason: invalid class name and case insensitive filesystem */
public class C07010Yu implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public C07010Yu(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    public boolean onPreDraw() {
        this.A00.A0A(0);
        return true;
    }
}
