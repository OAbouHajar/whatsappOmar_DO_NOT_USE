package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0Yf  reason: invalid class name and case insensitive filesystem */
public final class C06870Yf implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final Runnable A02;

    public C06870Yf(View view, Runnable runnable) {
        this.A01 = view;
        this.A00 = view.getViewTreeObserver();
        this.A02 = runnable;
    }

    public static void A00(View view, Runnable runnable) {
        if (view != null) {
            C06870Yf r1 = new C06870Yf(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(r1);
            view.addOnAttachStateChangeListener(r1);
            return;
        }
        throw AnonymousClass000.A0W("view == null");
    }

    public boolean onPreDraw() {
        (this.A00.isAlive() ? this.A00 : this.A01.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.A01.removeOnAttachStateChangeListener(this);
        this.A02.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.A00 = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        (this.A00.isAlive() ? this.A00 : this.A01.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.A01.removeOnAttachStateChangeListener(this);
    }
}
