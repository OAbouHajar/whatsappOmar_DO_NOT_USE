package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1ZP;
import X.AnonymousClass5N4;
import X.C015607m;
import X.C015807o;
import X.C1038452y;
import X.C16620tM;
import X.C55322jK;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.CallDetailsLayout;

public class IDxLAdapterShape2S0100000_1_I0 extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape2S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static void A00(IDxLAdapterShape2S0100000_1_I0 iDxLAdapterShape2S0100000_1_I0) {
        C55322jK r2 = (C55322jK) iDxLAdapterShape2S0100000_1_I0.A00;
        View view = r2.A0C;
        if (view != null) {
            r2.A0K = false;
            view.setPivotX((float) (view.getMeasuredWidth() >> 1));
            View view2 = r2.A0C;
            view2.setPivotY((float) (view2.getMeasuredHeight() >> 1));
            AnonymousClass5N4 r0 = r2.A0H;
            if (r0 != null) {
                AnonymousClass1ZP r4 = ((C1038452y) r0).A00;
                if (r4.A0V.A0E(C16620tM.A02, 1052)) {
                    Rect A0J = AnonymousClass000.A0J();
                    Point point = new Point();
                    r4.A08.getGlobalVisibleRect(A0J, point);
                    A0J.offset(point.x - A0J.left, point.y - A0J.top);
                    r4.A0L.set(A0J);
                    if (r4.A0J) {
                        r4.A8r(false);
                    } else {
                        r4.A8Z();
                    }
                }
            }
        }
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A01 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        super.onAnimationCancel(animator);
        CallDetailsLayout callDetailsLayout = (CallDetailsLayout) this.A00;
        callDetailsLayout.A00 = 0;
        callDetailsLayout.clearAnimation();
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A01 != 0) {
            A00(this);
            return;
        }
        super.onAnimationCancel(animator);
        CallDetailsLayout callDetailsLayout = (CallDetailsLayout) this.A00;
        callDetailsLayout.A00 = 2;
        C015607m r2 = new C015607m();
        r2.A04(400);
        r2.A05(new AccelerateDecelerateInterpolator());
        C015807o.A02((ViewGroup) callDetailsLayout.getParent(), r2);
        callDetailsLayout.A03.setVisibility(8);
        CallDetailsLayout.A01(callDetailsLayout, Integer.valueOf(callDetailsLayout.getResources().getDimensionPixelSize(R.dimen.dimen04b5)), (Integer) null);
        callDetailsLayout.clearAnimation();
    }
}
