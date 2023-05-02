package X;

import com.obwhatsapp.PagerSlidingTabStrip;

/* renamed from: X.2et  reason: invalid class name and case insensitive filesystem */
public class C53042et implements C015507l {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public C53042et(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    public void AUN(int i2) {
        if (i2 == 0) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
            PagerSlidingTabStrip.A00(pagerSlidingTabStrip, pagerSlidingTabStrip.A0N.getCurrentItem(), 0);
        }
        C015507l r0 = this.A00.A0M;
        if (r0 != null) {
            r0.AUN(i2);
        }
    }

    public void AUO(int i2, float f2, int i3) {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
        pagerSlidingTabStrip.A01 = i2;
        pagerSlidingTabStrip.A00 = f2;
        PagerSlidingTabStrip.A00(pagerSlidingTabStrip, i2, (int) (((float) pagerSlidingTabStrip.A0L.getChildAt(i2).getWidth()) * f2));
        pagerSlidingTabStrip.invalidate();
        C015507l r0 = pagerSlidingTabStrip.A0M;
        if (r0 != null) {
            r0.AUO(i2, f2, i3);
        }
    }

    public void AUP(int i2) {
        C015507l r0 = this.A00.A0M;
        if (r0 != null) {
            r0.AUP(i2);
        }
    }
}
