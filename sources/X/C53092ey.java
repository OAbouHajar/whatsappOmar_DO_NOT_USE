package X;

import android.os.Build;
import android.view.View;
import com.obwhatsapp.PagerSlidingTabStrip;

/* renamed from: X.2ey  reason: invalid class name and case insensitive filesystem */
public class C53092ey extends AnonymousClass05M {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public C53092ey(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    public void A06(View view, AnonymousClass031 r4) {
        super.A06(view, r4);
        if (view.isSelected()) {
            r4.A0A(AnonymousClass032.A05);
            r4.A01.setClickable(false);
        }
        if (Build.VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(this.A00.A0N.getId());
        }
    }
}
