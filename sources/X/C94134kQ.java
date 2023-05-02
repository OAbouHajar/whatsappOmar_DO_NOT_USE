package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4kQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94134kQ implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener A01;

    public /* synthetic */ C94134kQ(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.A00 = view;
        this.A01 = onGlobalLayoutListener;
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        View view2 = this.A00;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.A01;
        int visibility = view2.getVisibility();
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (visibility == 0) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }
}
