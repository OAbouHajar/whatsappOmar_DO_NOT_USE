package X;

import android.os.Build;
import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.2Vm  reason: invalid class name and case insensitive filesystem */
public class C49732Vm {
    public static void A00(View view, ScrollView scrollView) {
        if (Build.VERSION.SDK_INT >= 21) {
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C94354km(view, scrollView));
        }
    }

    public static boolean A01(ScrollView scrollView) {
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return scrollView.getHeight() < (childAt.getHeight() + scrollView.getPaddingTop()) + scrollView.getPaddingBottom();
    }
}
