package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.GravityCompat;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.facebook.redex.IDxIListenerShape217S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape2S0100000_1_I0;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2jK  reason: invalid class name and case insensitive filesystem */
public class C55322jK extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener, AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Rect A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public C23061Ai A0F;
    public AnonymousClass5N3 A0G;
    public AnonymousClass5N4 A0H;
    public AnonymousClass2Cx A0I;
    public C52662eE A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int[] A0R;
    public final ScaleGestureDetector A0S;
    public final View A0T;
    public final AnonymousClass0VE A0U;
    public final ArrayList A0V;

    public C55322jK(Context context, View view) {
        super(context);
        if (!this.A0O) {
            this.A0O = true;
            this.A0F = (C23061Ai) ((C52652eD) ((C52642eC) generatedComponent())).A07.AC0.get();
        }
        this.A00 = 1.0f;
        this.A0L = true;
        this.A06 = 0;
        this.A0V = new ArrayList(4);
        if (view == null) {
            this.A0T = this;
            view = this;
        } else {
            this.A0T = view;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        this.A0B = new Rect(i2, iArr[1], i2 + this.A0T.getWidth(), iArr[1] + this.A0T.getHeight());
        AnonymousClass0VE r1 = new AnonymousClass0VE(getContext(), this, new AnonymousClass2PN(this));
        r1.A06 = (int) (((float) r1.A06) * (1.0f / 1.0f));
        this.A0U = r1;
        r1.A01 = 2000.0f;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A0S = scaleGestureDetector;
        C04170Ll.A00(scaleGestureDetector);
        View decorView = C19980zJ.A00(context).getWindow().getDecorView();
        C004601z.A0k(decorView, new IDxIListenerShape217S0100000_2_I0(this, 5));
        C004601z.A0T(decorView);
    }

    public static /* synthetic */ int A00(C55322jK r3, int i2) {
        return (r3.getRightOfDraggableArea() - i2) + ((int) (((1.0f - r3.A00) * ((float) i2)) / 2.0f));
    }

    public static /* synthetic */ int A01(C55322jK r3, int i2) {
        return r3.getLeftOfDraggableArea() - ((int) (((1.0f - r3.A00) * ((float) i2)) / 2.0f));
    }

    public static /* synthetic */ AnonymousClass030 A02(View view, AnonymousClass030 r7, C55322jK r8) {
        boolean z2 = r8.A0N;
        View view2 = r8.A0D;
        if (z2) {
            if (view2 != null) {
                view2.setPadding(r7.A04(), r8.A0D.getPaddingTop(), r7.A05(), r8.A0D.getPaddingBottom());
            }
            AnonymousClass030 A0K2 = C004601z.A0K(view, r7);
            return A0K2.A08(0, A0K2.A06(), 0, A0K2.A03());
        }
        if (view2 != null) {
            view2.setPadding(0, 0, 0, 0);
        }
        return C004601z.A0K(view, r7);
    }

    private int getBottomOfDraggableArea() {
        return this.A0B.bottom - this.A01;
    }

    private int getLeftOfDraggableArea() {
        return this.A01 + this.A0B.left;
    }

    private int getRightOfDraggableArea() {
        return this.A0B.right - this.A01;
    }

    private int getTopOfDraggableArea() {
        return this.A01 + this.A0B.top;
    }

    public final int A03(int i2) {
        int i3 = this.A04;
        int leftOfDraggableArea = getLeftOfDraggableArea();
        int i4 = (int) (((1.0f - this.A00) * ((float) i2)) / 2.0f);
        int i5 = leftOfDraggableArea - i4;
        int rightOfDraggableArea = (getRightOfDraggableArea() - i2) + i4;
        return i3 <= (rightOfDraggableArea >> 1) + i5 ? i5 : rightOfDraggableArea;
    }

    public final int A04(int i2) {
        int A062 = A06(i2);
        int A052 = A05(i2);
        int i3 = this.A05;
        return Math.abs(i3 - A062) >= Math.abs(i3 - A052) ? A052 : A062;
    }

    public final int A05(int i2) {
        int i3 = (int) (((1.0f - this.A00) * ((float) i2)) / 2.0f);
        return Math.max((getBottomOfDraggableArea() - i2) + i3, getTopOfDraggableArea() - i3);
    }

    public final int A06(int i2) {
        int i3 = (int) (((1.0f - this.A00) * ((float) i2)) / 2.0f);
        return Math.min((getBottomOfDraggableArea() - i2) + i3, getTopOfDraggableArea() - i3);
    }

    public void A07() {
        int[] iArr = new int[2];
        View view = this.A0T;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        this.A0B = new Rect(i2, iArr[1], i2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    public final void A08(float f2) {
        if (this.A0C != null) {
            Iterator it = this.A0V.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                try {
                    int i2 = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity;
                    if ((i2 & 48) == 48) {
                        view.setPivotY(0.0f);
                        view.setPadding(view.getPaddingLeft(), (int) (((float) this.A06) * f2), view.getPaddingRight(), view.getPaddingBottom());
                    }
                    if ((i2 & 80) == 80) {
                        view.setPivotY((float) view.getMeasuredHeight());
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) (((float) this.A06) * f2));
                    }
                    if ((i2 & GravityCompat.START) == 8388611) {
                        view.setPivotX(0.0f);
                        view.setPadding((int) (((float) this.A06) * f2), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                    }
                    if ((i2 & GravityCompat.END) == 8388613) {
                        view.setPivotX((float) view.getMeasuredWidth());
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), (int) (((float) this.A06) * f2), view.getPaddingBottom());
                    }
                } catch (Exception unused) {
                }
                float f3 = 1.0f / f2;
                view.setScaleX(f3);
                view.setScaleY(f3);
            }
        }
    }

    public void A09(boolean z2) {
        if (this.A0C != null && !this.A0K) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new C94404kr(viewTreeObserver, this, z2));
            requestLayout();
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A0U.A0A()) {
            postInvalidateOnAnimation();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.A0L) {
            canvas.clipRect(this.A0B);
        }
        super.dispatchDraw(canvas);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0J;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0J = r0;
        }
        return r0.generatedComponent();
    }

    public float getCurrentChildScale() {
        return this.A00;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0U.A0E(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        View view = this.A0C;
        if (view != null && !this.A0N) {
            if (!this.A0K) {
                view.setScaleX(this.A00);
                this.A0C.setScaleY(this.A00);
            }
            View view2 = this.A0C;
            int i6 = this.A04;
            view2.layout(i6, this.A05, view2.getWidth() + i6, this.A05 + this.A0C.getHeight());
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0C == null) {
            return false;
        }
        float scaleFactor = this.A00 * scaleGestureDetector.getScaleFactor();
        this.A00 = scaleFactor;
        if (scaleFactor > 1.0f) {
            this.A00 = 1.0f;
            scaleFactor = 1.0f;
        } else if (scaleFactor < 0.67f) {
            this.A00 = 0.67f;
            scaleFactor = 0.67f;
        }
        this.A0C.setScaleX(scaleFactor);
        this.A0C.setScaleY(this.A00);
        A08(this.A00);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return this.A0C != null;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        View view = this.A0C;
        if (view != null) {
            boolean z2 = this.A0N;
            float f2 = this.A00;
            if (z2) {
                if (f2 <= 0.85f) {
                    this.A0M = true;
                    AnonymousClass5N3 r0 = this.A0G;
                    if (r0 != null) {
                        ((C1038352x) r0).A00.A8r(true);
                    }
                    AnonymousClass2Cx r5 = this.A0I;
                    if (r5 != null) {
                        r5.A08(0, getResources().getColor(R.color.color0092));
                        this.A0I.setPlayerElevation(6);
                        this.A0I.setVisibility(0);
                    }
                }
                this.A0C.animate().scaleX(this.A00).scaleY(this.A00).setDuration(125);
            } else {
                int i2 = (f2 > 0.85f ? 1 : (f2 == 0.85f ? 0 : -1));
                ViewPropertyAnimator animate = view.animate();
                float f3 = 1.0f;
                if (i2 <= 0) {
                    f3 = 0.67f;
                }
                animate.scaleX(f3).scaleY(f3).setDuration(125);
                this.A00 = f3;
            }
            this.A0C.setScaleX(this.A00);
            this.A0C.setScaleY(this.A00);
            A08(this.A00);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0VE r4 = this.A0U;
        if (r4.A03 != 1 && !this.A0S.isInProgress()) {
            if (this.A0C == null) {
                return false;
            }
            if (motionEvent.getX() < ((float) (this.A04 + ((int) (((1.0f - this.A00) * ((float) this.A0C.getWidth())) / 2.0f))))) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((this.A04 + this.A0C.getWidth()) - ((int) (((1.0f - this.A00) * ((float) this.A0C.getWidth())) / 2.0f))))) {
                return false;
            }
            if (motionEvent.getY() < ((float) (this.A05 + ((int) (((1.0f - this.A00) * ((float) this.A0C.getHeight())) / 2.0f))))) {
                return false;
            }
            if (motionEvent.getY() > ((float) ((this.A05 + this.A0C.getHeight()) - ((int) (((1.0f - this.A00) * ((float) this.A0C.getHeight())) / 2.0f))))) {
                return false;
            }
        }
        if (this.A0Q || this.A0K) {
            return false;
        }
        this.A0S.onTouchEvent(motionEvent);
        r4.A07(motionEvent);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        View view2 = this.A0C;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0E = null;
        this.A0C = view;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.A0C, "scaleX", new float[]{this.A00}), ObjectAnimator.ofFloat(this.A0C, "scaleY", new float[]{this.A00}), ObjectAnimator.ofFloat(this.A0C, "translationX", new float[]{0.0f}), ObjectAnimator.ofFloat(this.A0C, "translationY", new float[]{0.0f}), ObjectAnimator.ofFloat(this.A0C, "alpha", new float[]{0.0f, 1.0f})});
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(130);
        animatorSet.addListener(new IDxLAdapterShape2S0100000_1_I0(this, 1));
        animatorSet.start();
        int[] iArr = this.A0R;
        if (iArr != null) {
            for (int findViewById : iArr) {
                View findViewById2 = this.A0C.findViewById(findViewById);
                if (findViewById2 != null) {
                    this.A0V.add(findViewById2);
                }
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A0V.clear();
        this.A0C = null;
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setChildPadding(int i2) {
        this.A01 = i2;
    }

    public void setClipToDependentView(boolean z2) {
        this.A0L = z2;
    }

    public void setControlView(AnonymousClass2Cx r2) {
        this.A0I = r2;
        this.A0D = r2.findViewById(R.id.header);
    }

    public void setDismissListener(AnonymousClass5N3 r1) {
        this.A0G = r1;
    }

    public void setExitingFullScreen(boolean z2) {
        this.A0M = z2;
    }

    public void setFullscreen(boolean z2) {
        this.A0N = z2;
    }

    public void setLockChild(boolean z2) {
        this.A0Q = z2;
    }

    public void setViewAddedListener(AnonymousClass5N4 r1) {
        this.A0H = r1;
    }
}
