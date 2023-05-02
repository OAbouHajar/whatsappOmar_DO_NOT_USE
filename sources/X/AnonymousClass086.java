package X;

import androidx.viewpager.widget.ViewPager;

/* renamed from: X.086  reason: invalid class name */
public class AnonymousClass086 implements Runnable {
    public final /* synthetic */ ViewPager A00;

    public AnonymousClass086(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void run() {
        ViewPager viewPager = this.A00;
        viewPager.setScrollState(0);
        viewPager.A09(viewPager.A0A);
    }
}
