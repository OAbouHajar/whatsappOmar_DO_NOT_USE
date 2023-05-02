package X;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import com.obwhatsapp.calling.views.CallResponseLayout;

/* renamed from: X.2qB  reason: invalid class name and case insensitive filesystem */
public class C57132qB extends AnonymousClass055 {
    public int A00;
    public int A01;
    public final /* synthetic */ CallResponseLayout A02;

    public C57132qB(CallResponseLayout callResponseLayout) {
        this.A02 = callResponseLayout;
    }

    public int A04(View view, int i2, int i3) {
        return view.getLeft();
    }

    public int A05(View view, int i2, int i3) {
        CallResponseLayout callResponseLayout = this.A02;
        int paddingTop = callResponseLayout.getPaddingTop();
        return Math.min(Math.max(i2, paddingTop), callResponseLayout.getHeight() - view.getHeight());
    }

    public void A06(View view, float f2, float f3) {
        AnonymousClass5PA r0;
        CallResponseLayout callResponseLayout = this.A02;
        AccessibilityManager A0P = callResponseLayout.A03.A0P();
        if (A0P == null || !A0P.isTouchExplorationEnabled()) {
            if (this.A01 - view.getTop() > callResponseLayout.getHeight() / 3 && (r0 = callResponseLayout.A02) != null) {
                r0.ANw();
                if (!callResponseLayout.A07) {
                    return;
                }
            }
            callResponseLayout.A09.A0C(this.A00, this.A01);
            if (callResponseLayout.A06) {
                callResponseLayout.A01.startAnimation(C62043Bk.A01(callResponseLayout.A01));
                callResponseLayout.A00.setVisibility(0);
            }
            callResponseLayout.invalidate();
            return;
        }
        callResponseLayout.A02.ANw();
    }

    public void A07(View view, int i2) {
        this.A00 = view.getLeft();
        this.A01 = view.getTop();
        CallResponseLayout callResponseLayout = this.A02;
        if (callResponseLayout.A06) {
            callResponseLayout.A01.setAnimation((Animation) null);
            callResponseLayout.A00.setVisibility(8);
        }
    }

    public void A08(View view, int i2, int i3, int i4, int i5) {
        CallResponseLayout callResponseLayout = this.A02;
        if (!callResponseLayout.A06 && this.A01 - view.getTop() > callResponseLayout.A08.getScaledTouchSlop() && callResponseLayout.A00.getVisibility() == 0) {
            callResponseLayout.A00.clearAnimation();
            callResponseLayout.A00.setVisibility(4);
        }
    }

    public boolean A09(View view, int i2) {
        return AnonymousClass000.A1Y(view, this.A02.A01);
    }
}
