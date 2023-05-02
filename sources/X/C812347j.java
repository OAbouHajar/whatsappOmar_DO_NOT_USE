package X;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.47j  reason: invalid class name and case insensitive filesystem */
public class C812347j {
    public static void A00(NestedScrollView nestedScrollView) {
        int childCount = nestedScrollView.getChildCount();
        if (childCount != 0) {
            View childAt = nestedScrollView.getChildAt(childCount - 1);
            nestedScrollView.A06(-nestedScrollView.getScrollX(), ((childAt.getScrollY() + childAt.getHeight()) + nestedScrollView.getPaddingBottom()) - nestedScrollView.getScrollY(), false);
        }
    }
}
