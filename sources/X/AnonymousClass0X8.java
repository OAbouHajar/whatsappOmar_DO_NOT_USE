package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0X8  reason: invalid class name */
public class AnonymousClass0X8 {
    public static void A00(View view, View view2, ViewParent viewParent, int i2) {
        viewParent.onNestedScrollAccepted(view, view2, i2);
    }

    public static void A01(View view, ViewParent viewParent) {
        viewParent.onStopNestedScroll(view);
    }

    public static void A02(View view, ViewParent viewParent, int i2, int i3, int i4, int i5) {
        viewParent.onNestedScroll(view, i2, i3, i4, i5);
    }

    public static void A03(View view, ViewParent viewParent, int[] iArr, int i2, int i3) {
        viewParent.onNestedPreScroll(view, i2, i3, iArr);
    }

    public static boolean A04(View view, View view2, ViewParent viewParent, int i2) {
        return viewParent.onStartNestedScroll(view, view2, i2);
    }

    public static boolean A05(View view, ViewParent viewParent, float f2, float f3) {
        return viewParent.onNestedPreFling(view, f2, f3);
    }

    public static boolean A06(View view, ViewParent viewParent, float f2, float f3, boolean z2) {
        return viewParent.onNestedFling(view, f2, f3, z2);
    }
}
