package X;

import android.view.View;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;

/* renamed from: X.26e  reason: invalid class name and case insensitive filesystem */
public class C449026e implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass26F A01;

    public C449026e(View view, AnonymousClass26F r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public void onViewAttachedToWindow(View view) {
        AnonymousClass26F r2 = this.A01;
        C37921px r0 = r2.A06;
        if (r0 == null || !r0.A0G) {
            this.A00.post(new RunnableRunnableShape4S0100000_I0_3(this, 48));
            return;
        }
        r2.A09.set(0, 0, 0, 0);
        this.A00.getViewTreeObserver().addOnGlobalLayoutListener(r2.A0E);
    }

    public void onViewDetachedFromWindow(View view) {
        AnonymousClass26F r2 = this.A01;
        r2.A0C.setVisibility(8);
        this.A00.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A0E);
    }
}
