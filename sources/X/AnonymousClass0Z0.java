package X;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* renamed from: X.0Z0  reason: invalid class name */
public class AnonymousClass0Z0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ AnonymousClass0ZW A00;

    public AnonymousClass0Z0(AnonymousClass0ZW r1) {
        this.A00 = r1;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            AnonymousClass0ZW r3 = this.A00;
            PopupWindow popupWindow = r3.A0A;
            if (popupWindow.getInputMethodMode() != 2 && popupWindow.getContentView() != null) {
                Handler handler = r3.A0I;
                C09310fI r0 = r3.A0M;
                handler.removeCallbacks(r0);
                r0.run();
            }
        }
    }
}
