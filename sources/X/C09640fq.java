package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.0fq  reason: invalid class name and case insensitive filesystem */
public class C09640fq implements Runnable {
    public final /* synthetic */ AnonymousClass0QZ A00;

    public C09640fq(AnonymousClass0QZ r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0QZ r2 = this.A00;
        FrameLayout frameLayout = r2.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(r2.A00);
                r2.A00.removeAllViews();
            }
        }
    }
}
