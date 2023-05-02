package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0Ym  reason: invalid class name and case insensitive filesystem */
public class C06930Ym implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass0ZW A00;

    public C06930Ym(AnonymousClass0ZW r1) {
        this.A00 = r1;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (action == 0) {
            AnonymousClass0ZW r2 = this.A00;
            PopupWindow popupWindow = r2.A0A;
            if (popupWindow == null || !popupWindow.isShowing() || x2 < 0 || x2 >= popupWindow.getWidth() || y2 < 0 || y2 >= popupWindow.getHeight()) {
                return false;
            }
            r2.A0I.postDelayed(r2.A0M, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            AnonymousClass0ZW r0 = this.A00;
            r0.A0I.removeCallbacks(r0.A0M);
            return false;
        }
    }
}
