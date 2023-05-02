package com.obwhatsapp.gesture;

import X.AnonymousClass06y;
import X.AnonymousClass0VE;
import X.C004601z;
import X.C109635Sz;
import X.C13690nt;
import X.C57152qD;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.RunnableRunnableShape1S0210000_I1;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

public class VerticalSwipeDismissBehavior extends AnonymousClass06y {
    public float A00;
    public float A01 = 0.0f;
    public int A02;
    public VelocityTracker A03;
    public AnonymousClass0VE A04;
    public C109635Sz A05;
    public WeakReference A06;
    public boolean A07 = true;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public VerticalSwipeDismissBehavior(Context context) {
        this.A00 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public void A09(View view, View view2, CoordinatorLayout coordinatorLayout, int i2) {
        float yVelocity;
        WeakReference weakReference = this.A06;
        if (weakReference != null && view2 == weakReference.get() && this.A09) {
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker == null) {
                yVelocity = 0.0f;
            } else {
                velocityTracker.computeCurrentVelocity(1000, this.A00);
                yVelocity = this.A03.getYVelocity(this.A02);
            }
            if (A0J(view, yVelocity, 0)) {
                this.A05.APs(view);
            } else if (this.A04.A0H(view, view.getLeft(), 0)) {
                view.postOnAnimation(new RunnableRunnableShape1S0210000_I1(this, view, 3, false));
            }
            this.A09 = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.view.View r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int[] r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.A06
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L_0x0040
            int r2 = r5.getTop()
            r1 = 1
            if (r10 <= 0) goto L_0x0041
            boolean r0 = r6.canScrollVertically(r1)
            if (r0 == 0) goto L_0x0051
            if (r2 <= 0) goto L_0x0021
            int r0 = java.lang.Math.min(r10, r2)
        L_0x001b:
            r8[r1] = r0
            int r0 = -r0
            X.C004601z.A0b(r5, r0)
        L_0x0021:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0040
            X.5Sz r3 = r4.A05
            int r0 = r5.getTop()
            int r0 = java.lang.Math.abs(r0)
            float r2 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r1
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = java.lang.Math.min(r1, r2)
            r3.AXK(r5, r0)
        L_0x0040:
            return
        L_0x0041:
            if (r10 >= 0) goto L_0x0021
            r0 = -1
            boolean r0 = r6.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0051
            if (r2 >= 0) goto L_0x0021
            int r0 = java.lang.Math.max(r10, r2)
            goto L_0x001b
        L_0x0051:
            r8[r1] = r10
            int r0 = -r10
            X.C004601z.A0b(r5, r0)
            r4.A09 = r1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gesture.VerticalSwipeDismissBehavior.A0A(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        View view2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A02 = -1;
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A03 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A03;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A03 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        boolean z2 = this.A08;
        if (actionMasked == 0) {
            z2 = coordinatorLayout.A0I(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A08 = z2;
            WeakReference weakReference = this.A06;
            if (!(weakReference == null || (view2 = (View) weakReference.get()) == null || !coordinatorLayout.A0I(view2, (int) motionEvent.getX(), (int) motionEvent.getY()))) {
                this.A02 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.A0B = true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A0B = false;
            this.A08 = false;
            this.A02 = -1;
        }
        if (!z2) {
            return false;
        }
        AnonymousClass0VE r3 = this.A04;
        if (r3 == null) {
            if (this.A0A) {
                float f2 = this.A01;
                r3 = new AnonymousClass0VE(coordinatorLayout.getContext(), coordinatorLayout, new C57152qD(coordinatorLayout, this));
                r3.A06 = (int) (((float) r3.A06) * (1.0f / f2));
            } else {
                r3 = new AnonymousClass0VE(coordinatorLayout.getContext(), coordinatorLayout, new C57152qD(coordinatorLayout, this));
            }
            this.A04 = r3;
        }
        return r3.A0E(motionEvent);
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (motionEvent.getActionMasked() == 0) {
            this.A02 = -1;
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A03 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A03;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A03 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        AnonymousClass0VE r0 = this.A04;
        if (r0 == null) {
            return false;
        }
        try {
            r0.A07(motionEvent);
            return true;
        } catch (IllegalArgumentException e2) {
            Log.e("VerticalSwipeDismissBehavior/onTouchEvent", e2);
            return false;
        }
    }

    public boolean A0D(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i2, int i3) {
        this.A09 = false;
        return (i2 & 2) != 0;
    }

    public boolean A0E(View view, View view2, CoordinatorLayout coordinatorLayout, float f2, float f3) {
        this.A06.get();
        return false;
    }

    public boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        int top2 = view.getTop();
        coordinatorLayout.A0D(view, i2);
        if (this.A09) {
            C004601z.A0b(view, top2 - view.getTop());
        }
        this.A06 = C13690nt.A0h(A0I(view));
        return true;
    }

    public final View A0I(View view) {
        if (C004601z.A0v(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View A0I = A0I(viewGroup.getChildAt(i2));
                if (A0I != null) {
                    return A0I;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r1 = java.lang.Math.round(((float) r5.getHeight()) * 0.2f);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0J(android.view.View r5, float r6, int r7) {
        /*
            r4 = this;
            float r1 = java.lang.Math.abs(r6)
            int r0 = r5.getHeight()
            int r0 = r0 << 1
            float r0 = (float) r0
            r3 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            int r2 = r5.getTop()
            int r2 = r2 - r7
            int r0 = r5.getHeight()
            float r1 = (float) r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r0 = java.lang.Math.abs(r2)
            if (r0 >= r1) goto L_0x0029
            r3 = 0
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gesture.VerticalSwipeDismissBehavior.A0J(android.view.View, float, int):boolean");
    }
}
