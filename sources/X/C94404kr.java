package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4kr  reason: invalid class name and case insensitive filesystem */
public class C94404kr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver A00;
    public final /* synthetic */ C55322jK A01;
    public final /* synthetic */ boolean A02;

    public C94404kr(ViewTreeObserver viewTreeObserver, C55322jK r2, boolean z2) {
        this.A01 = r2;
        this.A00 = viewTreeObserver;
        this.A02 = z2;
    }

    public void onGlobalLayout() {
        int A03;
        int A04;
        this.A00.removeOnGlobalLayoutListener(this);
        C55322jK r4 = this.A01;
        View view = r4.A0C;
        if (view == null) {
            return;
        }
        if (r4.A0M) {
            view.setPivotX((float) (view.getMeasuredWidth() >> 1));
            View view2 = r4.A0C;
            view2.setPivotY((float) (view2.getMeasuredHeight() >> 1));
            if (this.A02) {
                A03 = r4.A09;
                A04 = r4.A0A;
            } else {
                A03 = r4.A03(r4.A0C.getWidth());
                A04 = r4.A04(r4.A0C.getHeight());
            }
            r4.A07();
            r4.A0U.A0H(r4.A0C, A03, A04);
            r4.A04 = A03;
            r4.A05 = A04;
            r4.A0M = false;
        } else if (!r4.A0N) {
            int A032 = r4.A03(view.getWidth());
            int A042 = r4.A04(r4.A0C.getHeight());
            r4.A07();
            r4.A0U.A0H(r4.A0C, A032, A042);
            r4.A04 = A032;
            r4.A05 = A042;
        }
    }
}
