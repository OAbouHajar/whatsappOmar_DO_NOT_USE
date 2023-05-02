package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.facebook.redex.IDxLAdapterShape1S0100000_I1;
import com.facebook.rendercore.RootHostView;

/* renamed from: X.0CB  reason: invalid class name */
public class AnonymousClass0CB extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public C03570Ja A05;
    public C12720kr A06;
    public C12730ks A07;
    public RootHostView A08;
    public C49852We A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Animator.AnimatorListener A0D = new IDxLAdapterShape1S0100000_I1(this, 3);
    public final Animator.AnimatorListener A0E = new IDxLAdapterShape1S0100000_I1(this, 2);
    public final GestureDetector.OnGestureListener A0F;
    public final GestureDetector A0G;
    public final Runnable A0H = new C09680fu(this);

    public AnonymousClass0CB(Context context, C03570Ja r4, boolean z2) {
        super(context, (AttributeSet) null);
        GestureDetector.OnGestureListener r1 = new AnonymousClass0YV(this);
        this.A0F = r1;
        this.A0C = z2;
        this.A05 = r4;
        this.A0G = new GestureDetector(context, !z2 ? new AnonymousClass0Bd(this) : r1);
    }

    public final void A00() {
        if (this.A00 != 0 && !this.A0A) {
            Runnable runnable = this.A0H;
            removeCallbacks(runnable);
            postDelayed(runnable, (long) this.A00);
        }
    }

    public void A01(int i2) {
        ViewPropertyAnimator alpha;
        removeCallbacks(this.A0H);
        this.A0A = true;
        if (getContext() == null || !C004601z.A0t(this)) {
            C12720kr r0 = this.A06;
            if (r0 != null) {
                r0.APv();
                return;
            }
            return;
        }
        clearAnimation();
        if (this.A0C) {
            clearAnimation();
            alpha = animate().setDuration((long) i2).setInterpolator(this.A03).alpha(0.0f).scaleX(1.5f).scaleY(1.5f);
        } else {
            clearAnimation();
            boolean equals = this.A05.equals(C03570Ja.TOP);
            int height = getHeight();
            if (equals) {
                height = -height;
            }
            alpha = animate().setDuration((long) i2).translationY((float) height).setInterpolator(this.A03).alpha(0.0f);
        }
        alpha.setListener(this.A0D);
    }

    public void A02(Animator.AnimatorListener animatorListener, int i2) {
        clearAnimation();
        animate().setDuration((long) i2).translationY(0.0f).setInterpolator(this.A04).alpha(1.0f).setListener(animatorListener);
    }

    public final boolean A03() {
        if (!this.A0B) {
            if (getTranslationY() > ((float) getHeight()) / 2.0f) {
                A01(this.A01);
            } else {
                A02((Animator.AnimatorListener) null, this.A02);
                return true;
            }
        }
        return true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C49852We r0 = this.A09;
        if (r0 != null) {
            r0.A03();
            this.A09 = null;
            this.A08 = null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            removeCallbacks(this.A0H);
        } else if (action == 1 || action == 3) {
            A00();
            A03();
        }
        return this.A0G.onTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.A0G.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A0B = false;
            return true;
        } else if (action != 1 && action != 3) {
            return onTouchEvent || super.onTouchEvent(motionEvent);
        } else {
            A00();
            return A03();
        }
    }

    public void setAutoDismissDurationMs(int i2) {
        this.A00 = i2;
    }

    public void setBloksContentViewFromParseResult(C14990q7 r4, AnonymousClass2Wa r5) {
        C49852We r0 = this.A09;
        if (r0 != null) {
            r0.A03();
            this.A09 = null;
        }
        RootHostView rootHostView = this.A08;
        if (rootHostView != null) {
            removeView(rootHostView);
        }
        Context A002 = r4.A00();
        if (!A002.equals(getContext())) {
            C29691b2.A00("bk.action.toast.ShowToast", "Different Android context for BloksHostingComponent and FoABloksPopoverView");
        }
        this.A08 = new RootHostView(A002);
        C49862Wf A003 = C49852We.A00(A002, r5, r4.A01());
        A003.A01(1);
        C49852We A004 = A003.A00();
        this.A09 = A004;
        A004.A05(this.A08);
        setContentView(this.A09.A01());
    }

    public void setContentView(View view) {
        if (view == null) {
            C29691b2.A00("bk.action.toast.ShowToast", "Cannot add null Bloks content view to PopoverView container.");
        } else {
            addView(view);
        }
    }

    public void setDismissAnimationDurationMs(int i2) {
        this.A01 = i2;
    }

    public void setDismissAnimationEndListener(C12720kr r1) {
        this.A06 = r1;
    }

    public void setDismissAnimationInterpolator(Interpolator interpolator) {
        this.A03 = interpolator;
    }

    public void setIsLastGestureFling(boolean z2) {
        this.A0B = z2;
    }

    public void setShowAnimationDurationMs(int i2) {
        this.A02 = i2;
    }

    public void setShowAnimationEndListener(C12730ks r1) {
        this.A07 = r1;
    }

    public void setShowAnimationInterpolator(Interpolator interpolator) {
        this.A04 = interpolator;
    }
}
