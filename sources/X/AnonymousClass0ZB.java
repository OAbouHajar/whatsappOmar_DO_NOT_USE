package X;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: X.0ZB  reason: invalid class name */
public class AnonymousClass0ZB implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener A00;
    public final /* synthetic */ AnonymousClass0DD A01;

    public AnonymousClass0ZB(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, AnonymousClass0DD r2) {
        this.A01 = r2;
        this.A00 = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.A01.A04.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A00);
        }
    }
}
