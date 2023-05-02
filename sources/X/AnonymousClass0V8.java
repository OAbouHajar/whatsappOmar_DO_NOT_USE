package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Arrays;

/* renamed from: X.0V8  reason: invalid class name */
public class AnonymousClass0V8 {
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public Scroller A09;
    public Scroller A0A;
    public boolean A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public float[] A0F;
    public final ViewGroup A0G;
    public final ViewDragHelper$Callback A0H;
    public final Runnable A0I = new C09660fs(this);

    public AnonymousClass0V8(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        this.A0G = viewGroup;
        this.A0H = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        context.getResources().getDisplayMetrics();
        this.A06 = viewConfiguration.getScaledTouchSlop();
        this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        Scroller scroller = new Scroller(context);
        this.A0A = scroller;
        this.A09 = scroller;
    }

    public View A00(int i2, int i3) {
        ViewGroup viewGroup = this.A0G;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public void A01() {
        this.A02 = -1;
        float[] fArr = this.A0C;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            Arrays.fill(this.A0F, 0.0f);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public void A02() {
        Scroller scroller = this.A0A;
        Scroller scroller2 = this.A09;
        if (scroller != scroller2) {
            A01();
            if (this.A03 == 2) {
                int currX = this.A0A.getCurrX();
                int currY = this.A0A.getCurrY();
                this.A0A.abortAnimation();
                int currX2 = this.A0A.getCurrX();
                int currY2 = this.A0A.getCurrY();
                this.A0H.A05(this.A08, currX2, currY2, currX2 - currX, currY2 - currY);
            }
            A04(0);
            this.A0A = scroller2;
        }
    }

    public final void A03(float f2, float f3) {
        this.A0B = true;
        this.A0H.A04(this.A08, f2, f3);
        this.A0B = false;
        if (this.A03 == 1) {
            A04(0);
        }
    }

    public void A04(int i2) {
        if (this.A03 != i2) {
            this.A03 = i2;
            this.A0H.A03(i2);
            if (i2 == 0) {
                this.A08 = null;
            }
        }
    }

    public final void A05(int i2) {
        float[] fArr = this.A0C;
        if (fArr != null && fArr.length > i2) {
            fArr[i2] = 0.0f;
            this.A0D[i2] = 0.0f;
            this.A0E[i2] = 0.0f;
            this.A0F[i2] = 0.0f;
            this.A05 = ((1 << i2) ^ -1) & this.A05;
        }
    }

    public final void A06(int i2, float f2, float f3) {
        float[] fArr = this.A0C;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0D;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0E;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0F;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            this.A0C = fArr2;
            fArr = fArr2;
            this.A0D = fArr3;
            this.A0E = fArr4;
            this.A0F = fArr5;
        }
        this.A0E[i2] = f2;
        fArr[i2] = f2;
        float[] fArr9 = this.A0D;
        this.A0F[i2] = f3;
        fArr9[i2] = f3;
        this.A05 |= 1 << i2;
    }

    public final void A07(int i2, int i3) {
        int left = this.A08.getLeft();
        int top2 = this.A08.getTop();
        ViewDragHelper$Callback viewDragHelper$Callback = this.A0H;
        View view = this.A08;
        int A012 = viewDragHelper$Callback.A01(view, top2, i3);
        int i4 = left + i2;
        int i5 = top2 + A012;
        if (i2 != 0) {
            i4 = 0;
            view.offsetLeftAndRight(-left);
        }
        if (A012 != 0) {
            i5 = viewDragHelper$Callback.A02(this.A08, i5, A012);
            this.A08.offsetTopAndBottom(i5 - top2);
        }
        if (i2 != 0 || A012 != 0) {
            viewDragHelper$Callback.A05(this.A08, i4, i5, i4 - left, i5 - top2);
        }
    }

    public final void A08(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (((1 << pointerId) & this.A05) != 0) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.A0E[pointerId] = x2;
                this.A0F[pointerId] = y2;
            }
        }
    }

    public final boolean A09(int i2, int i3, int i4) {
        int min;
        int i5 = i4;
        int i6 = i3;
        int left = this.A08.getLeft();
        int top2 = this.A08.getTop();
        int i7 = -left;
        int i8 = i2 - top2;
        if (i7 == 0 && i8 == 0) {
            this.A0A.abortAnimation();
            A04(0);
            return false;
        }
        if (i4 < 0) {
            View view = this.A08;
            int i9 = (int) this.A01;
            int i10 = (int) this.A00;
            int abs = Math.abs(i6);
            if (abs < i9) {
                i6 = 0;
            } else if (abs > i10) {
                if (i3 <= 0) {
                    i10 = -i10;
                }
                i6 = i10;
            }
            int abs2 = Math.abs(i7);
            int abs3 = Math.abs(i8);
            int i11 = abs2 + abs3;
            float f2 = 1.0f;
            if (i6 == 0) {
                f2 = ((float) abs3) / ((float) i11);
            }
            int A002 = this.A0H.A00(view);
            int width = this.A0G.getWidth();
            if (i8 == 0) {
                min = 0;
            } else {
                float f3 = (float) abs3;
                float f4 = (float) (width >> 1);
                min = Math.min(AnonymousClass000.A05(f4 + (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, f3 / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * f4), f3, i6, A002), 600);
            }
            i5 = (int) (((float) min) * f2);
        }
        this.A0A.startScroll(left, top2, i7, i8, i5);
        this.A04 = top2 + i8;
        A04(2);
        return true;
    }

    public boolean A0A(View view, int i2) {
        if (view == this.A08 && this.A02 == i2) {
            return true;
        }
        if (view == null) {
            return false;
        }
        this.A02 = i2;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0G;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i2;
            A04(1);
            return true;
        }
        StringBuilder A0r = AnonymousClass000.A0r("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A0r.append(viewGroup);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(")", A0r));
    }
}
