package X;

import android.view.View;

/* renamed from: X.0Yc  reason: invalid class name and case insensitive filesystem */
public class C06840Yc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass0WQ A01;

    public C06840Yc(View view, AnonymousClass0WQ r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public void onViewAttachedToWindow(View view) {
        View view2 = this.A00;
        view2.removeOnAttachStateChangeListener(this);
        C004601z.A0T(view2);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
