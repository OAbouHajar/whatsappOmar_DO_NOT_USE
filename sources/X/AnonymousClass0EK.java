package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0EK  reason: invalid class name */
public class AnonymousClass0EK extends AnonymousClass05M {
    public final AnonymousClass05M A00 = new AnonymousClass0EI(this);
    public final RecyclerView A01;

    public AnonymousClass0EK(RecyclerView recyclerView) {
        this.A01 = recyclerView;
    }

    public void A01(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass02W layoutManager;
        super.A01(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !A08() && (layoutManager = ((RecyclerView) view).getLayoutManager()) != null) {
            layoutManager.A0r(accessibilityEvent);
        }
    }

    public boolean A03(View view, int i2, Bundle bundle) {
        AnonymousClass02W layoutManager;
        RecyclerView recyclerView;
        int i3;
        int i4;
        if (super.A03(view, i2, bundle)) {
            return true;
        }
        if (A08() || (layoutManager = this.A01.getLayoutManager()) == null || (recyclerView = layoutManager.A07) == null) {
            return false;
        }
        if (i2 == 4096) {
            i3 = recyclerView.canScrollVertically(1) ? (layoutManager.A00 - layoutManager.A0A()) - layoutManager.A07() : 0;
            if (layoutManager.A07.canScrollHorizontally(1)) {
                i4 = (layoutManager.A03 - layoutManager.A08()) - layoutManager.A09();
            }
            i4 = 0;
        } else if (i2 != 8192) {
            return false;
        } else {
            i3 = recyclerView.canScrollVertically(-1) ? -((layoutManager.A00 - layoutManager.A0A()) - layoutManager.A07()) : 0;
            if (layoutManager.A07.canScrollHorizontally(-1)) {
                i4 = -((layoutManager.A03 - layoutManager.A08()) - layoutManager.A09());
            }
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        layoutManager.A07.A0e(i4, i3);
        return true;
    }

    public void A06(View view, AnonymousClass031 r9) {
        AnonymousClass02W layoutManager;
        super.A06(view, r9);
        String name = RecyclerView.class.getName();
        AccessibilityNodeInfo accessibilityNodeInfo = r9.A01;
        accessibilityNodeInfo.setClassName(name);
        if (!A08() && (layoutManager = this.A01.getLayoutManager()) != null) {
            RecyclerView recyclerView = layoutManager.A07;
            AnonymousClass0SJ r4 = recyclerView.A0w;
            AnonymousClass0Ri r3 = recyclerView.A0y;
            if (recyclerView.canScrollVertically(-1) || layoutManager.A07.canScrollHorizontally(-1)) {
                accessibilityNodeInfo.addAction(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.A07.canScrollVertically(1) || layoutManager.A07.canScrollHorizontally(1)) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            r9.A0I(AnonymousClass09M.A01(layoutManager.A0W(r4, r3), layoutManager.A0V(r4, r3), 0, false));
        }
    }

    public AnonymousClass05M A07() {
        return this.A00;
    }

    public boolean A08() {
        RecyclerView recyclerView = this.A01;
        return !recyclerView.A0g || recyclerView.A0e || recyclerView.A0J.A04.size() > 0;
    }
}
