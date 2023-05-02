package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.0fp  reason: invalid class name and case insensitive filesystem */
public class C09630fp implements Runnable {
    public final /* synthetic */ AnonymousClass0Q0 A00;

    public C09630fp(AnonymousClass0Q0 r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0Q0 r2 = this.A00;
        FrameLayout frameLayout = r2.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(r2.A00);
            }
            r2.A00.removeAllViews();
        }
    }
}
