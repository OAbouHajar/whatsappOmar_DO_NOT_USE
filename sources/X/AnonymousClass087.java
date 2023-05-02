package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.087  reason: invalid class name */
public class AnonymousClass087 extends AnonymousClass05M {
    public final /* synthetic */ ViewPager A00;

    public AnonymousClass087(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void A01(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass012 r0;
        super.A01(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        ViewPager viewPager = this.A00;
        AnonymousClass012 r02 = viewPager.A0V;
        boolean z2 = true;
        if (r02 == null || r02.A01() <= 1) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        if (accessibilityEvent.getEventType() == 4096 && (r0 = viewPager.A0V) != null) {
            accessibilityEvent.setItemCount(r0.A01());
            accessibilityEvent.setFromIndex(viewPager.A0A);
            accessibilityEvent.setToIndex(viewPager.A0A);
        }
    }

    public boolean A03(View view, int i2, Bundle bundle) {
        ViewPager viewPager;
        int i3;
        if (!super.A03(view, i2, bundle)) {
            if (i2 != 4096) {
                if (i2 == 8192) {
                    viewPager = this.A00;
                    if (viewPager.canScrollHorizontally(-1)) {
                        i3 = viewPager.A0A - 1;
                    }
                }
                return false;
            }
            viewPager = this.A00;
            if (viewPager.canScrollHorizontally(1)) {
                i3 = viewPager.A0A + 1;
            }
            return false;
            viewPager.setCurrentItem(i3);
        }
        return true;
    }

    public void A06(View view, AnonymousClass031 r6) {
        super.A06(view, r6);
        String name = ViewPager.class.getName();
        AccessibilityNodeInfo accessibilityNodeInfo = r6.A01;
        accessibilityNodeInfo.setClassName(name);
        ViewPager viewPager = this.A00;
        AnonymousClass012 r0 = viewPager.A0V;
        boolean z2 = true;
        if (r0 == null || r0.A01() <= 1) {
            z2 = false;
        }
        accessibilityNodeInfo.setScrollable(z2);
        if (viewPager.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
        }
    }
}
