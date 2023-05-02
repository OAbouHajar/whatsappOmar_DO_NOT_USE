package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.06y  reason: invalid class name */
public abstract class AnonymousClass06y {
    public AnonymousClass06y() {
    }

    public AnonymousClass06y(Context context, AttributeSet attributeSet) {
    }

    @Deprecated
    public void A00(View view, View view2, CoordinatorLayout coordinatorLayout, int i2, int i3, int i4, int i5) {
    }

    public void A01(View view, View view2, CoordinatorLayout coordinatorLayout, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            A00(view, view2, coordinatorLayout, i2, i3, i4, i5);
        }
    }

    public boolean A02(Rect rect, View view, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public boolean A03(Rect rect, View view, CoordinatorLayout coordinatorLayout, boolean z2) {
        return false;
    }

    @Deprecated
    public boolean A04(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i2) {
        return false;
    }

    public boolean A05(View view, View view2, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public boolean A06(View view, CoordinatorLayout coordinatorLayout, int i2, int i3, int i4, int i5) {
        return false;
    }

    public Parcelable A07(View view, CoordinatorLayout coordinatorLayout) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public void A08(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
    }

    public void A09(View view, View view2, CoordinatorLayout coordinatorLayout, int i2) {
    }

    public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i2, int i3, int i4) {
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public boolean A0D(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i2, int i3) {
        if (i3 == 0) {
            return A04(view, view2, view3, coordinatorLayout, i2);
        }
        return false;
    }

    public boolean A0E(View view, View view2, CoordinatorLayout coordinatorLayout, float f2, float f3) {
        return false;
    }

    public boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        return false;
    }

    public void A0G(AnonymousClass0Bo r1) {
    }

    public boolean A0H(View view, View view2, CoordinatorLayout coordinatorLayout) {
        return false;
    }
}
