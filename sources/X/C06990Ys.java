package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0Ys  reason: invalid class name and case insensitive filesystem */
public class C06990Ys implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver A01;
    public final /* synthetic */ Runnable A02;

    public C06990Ys(View view, ViewTreeObserver viewTreeObserver, Runnable runnable) {
        this.A02 = runnable;
        this.A01 = viewTreeObserver;
        this.A00 = view;
    }

    public void onGlobalLayout() {
        try {
            this.A02.run();
            ViewTreeObserver viewTreeObserver = this.A01;
            if ((viewTreeObserver.isAlive() || (viewTreeObserver = this.A00.getViewTreeObserver()) != null) && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            }
        } catch (Throwable th) {
            ViewTreeObserver viewTreeObserver2 = this.A01;
            if ((viewTreeObserver2.isAlive() || (viewTreeObserver2 = this.A00.getViewTreeObserver()) != null) && viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this);
                throw th;
            }
        }
        throw AnonymousClass000.A0T("Given null or dead view tree observer.");
    }
}
