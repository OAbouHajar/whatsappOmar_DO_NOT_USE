package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.material.appbar.AppBarLayout;
import com.obwhatsapp.scroller.RecyclerFastScroller;
import com.whatsapp.util.Log;

/* renamed from: X.3D2  reason: invalid class name */
public class AnonymousClass3D2 implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public final /* synthetic */ RecyclerFastScroller A03;

    public AnonymousClass3D2(RecyclerFastScroller recyclerFastScroller) {
        this.A03 = recyclerFastScroller;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int i3;
        AppBarLayout appBarLayout;
        if (motionEvent.getActionMasked() == 0) {
            RecyclerFastScroller recyclerFastScroller = this.A03;
            recyclerFastScroller.A03.setPressed(true);
            C54642hu r0 = recyclerFastScroller.A08;
            if (r0 != null) {
                r0.AhP();
            }
            View view2 = recyclerFastScroller.A02;
            if (!(view2 == null || view2.getVisibility() == 0)) {
                recyclerFastScroller.A02.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100);
                recyclerFastScroller.A02.startAnimation(alphaAnimation);
            }
            recyclerFastScroller.A06.A0S();
            recyclerFastScroller.A06.startNestedScroll(2);
            this.A00 = (float) recyclerFastScroller.getVisibleHeight();
            this.A01 = motionEvent.getY() + ((float) recyclerFastScroller.A03.getTop());
            i2 = recyclerFastScroller.A00;
        } else if (motionEvent.getActionMasked() == 2) {
            RecyclerFastScroller recyclerFastScroller2 = this.A03;
            View view3 = recyclerFastScroller2.A02;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            int A002 = recyclerFastScroller2.getVisibleHeight();
            float f2 = this.A00;
            float f3 = (float) A002;
            float y2 = (f2 - f3) + motionEvent.getY() + ((float) recyclerFastScroller2.A03.getTop());
            float f4 = (y2 - this.A01) / f2;
            int computeVerticalScrollRange = recyclerFastScroller2.A06.computeVerticalScrollRange();
            AppBarLayout appBarLayout2 = recyclerFastScroller2.A07;
            int totalScrollRange = (int) (f4 * ((float) (computeVerticalScrollRange + (appBarLayout2 == null ? 0 : appBarLayout2.getTotalScrollRange()))));
            if (!(recyclerFastScroller2.A04 == null || (appBarLayout = recyclerFastScroller2.A07) == null)) {
                appBarLayout.getLayoutParams();
            }
            if (!(recyclerFastScroller2.A06 == null || recyclerFastScroller2.A03 == null)) {
                int abs = Math.abs(totalScrollRange);
                if (abs > recyclerFastScroller2.getVisibleHeight()) {
                    int A0C = (int) ((((float) recyclerFastScroller2.A06.A0N.A0C()) * Math.min(Math.max(0.0f, y2), f3)) / f3);
                    recyclerFastScroller2.A06.A0Z(A0C);
                    i3 = A0C != 0 ? abs % A002 : 0;
                } else {
                    i3 = (totalScrollRange + this.A02) - recyclerFastScroller2.A00;
                }
                try {
                    recyclerFastScroller2.A06.scrollBy(0, i3);
                } catch (Throwable th) {
                    Log.e(th);
                }
            }
            this.A01 = y2;
            i2 = recyclerFastScroller2.A00;
        } else {
            if (motionEvent.getActionMasked() == 1) {
                this.A01 = -1.0f;
                RecyclerFastScroller recyclerFastScroller3 = this.A03;
                recyclerFastScroller3.A06.stopNestedScroll();
                recyclerFastScroller3.A03.setPressed(false);
                recyclerFastScroller3.A01();
                View view4 = recyclerFastScroller3.A02;
                if (!(view4 == null || view4.getVisibility() == 4)) {
                    recyclerFastScroller3.A02.setVisibility(4);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setDuration(300);
                    recyclerFastScroller3.A02.startAnimation(alphaAnimation2);
                    return true;
                }
            }
            return true;
        }
        this.A02 = i2;
        return true;
    }
}
