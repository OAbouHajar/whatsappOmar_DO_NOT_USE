package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

public class ViewDragHelper {
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;

    /* renamed from: v  reason: collision with root package name */
    private static final Interpolator f60v = new Interpolator() {
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private int f61a;

    /* renamed from: b  reason: collision with root package name */
    private int f62b;

    /* renamed from: c  reason: collision with root package name */
    private int f63c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f64d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f65e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f66f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f67g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f68h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f69i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f70j;

    /* renamed from: k  reason: collision with root package name */
    private int f71k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f72l;

    /* renamed from: m  reason: collision with root package name */
    private float f73m;

    /* renamed from: n  reason: collision with root package name */
    private float f74n;

    /* renamed from: o  reason: collision with root package name */
    private int f75o;

    /* renamed from: p  reason: collision with root package name */
    private int f76p;

    /* renamed from: q  reason: collision with root package name */
    private OverScroller f77q;

    /* renamed from: r  reason: collision with root package name */
    private final Callback f78r;

    /* renamed from: s  reason: collision with root package name */
    private View f79s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f80t;

    /* renamed from: u  reason: collision with root package name */
    private final ViewGroup f81u;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f82w = new Runnable() {
        public final void run() {
            ViewDragHelper.this.a(0);
        }
    };

    public static abstract class Callback {
        public int clampViewPositionHorizontal(View view, int i2, int i3) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i2, int i3) {
            return 0;
        }

        public int getOrderedChildIndex(int i2) {
            return i2;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i2, int i3) {
        }

        public boolean onEdgeLock(int i2) {
            return false;
        }

        public void onEdgeTouched(int i2, int i3) {
        }

        public void onViewCaptured(View view, int i2) {
        }

        public void onViewDragStateChanged(int i2) {
        }

        public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
        }

        public void onViewReleased(View view, float f2, float f3) {
        }

        public abstract boolean tryCaptureView(View view, int i2);
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (callback != null) {
            this.f81u = viewGroup;
            this.f78r = callback;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f75o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f62b = viewConfiguration.getScaledTouchSlop();
            this.f73m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f74n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f77q = new OverScroller(context, f60v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private static float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private static float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int a(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.f81u.getWidth();
        float f2 = (float) (width / 2);
        float a2 = f2 + (a(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(a2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int b2 = b(i4, (int) this.f74n, (int) this.f73m);
        int b3 = b(i5, (int) this.f74n, (int) this.f73m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(b2);
        int abs4 = Math.abs(b3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (b2 != 0) {
            f3 = (float) abs3;
            f2 = (float) i6;
        } else {
            f3 = (float) abs;
            f2 = (float) i7;
        }
        float f6 = f3 / f2;
        if (b3 != 0) {
            f5 = (float) abs4;
            f4 = (float) i6;
        } else {
            f5 = (float) abs2;
            f4 = (float) i7;
        }
        float f7 = f5 / f4;
        return (int) ((((float) a(i2, b2, this.f78r.getViewHorizontalDragRange(view))) * f6) + (((float) a(i3, b3, this.f78r.getViewVerticalDragRange(view))) * f7));
    }

    private void a() {
        this.f72l.computeCurrentVelocity(1000, this.f73m);
        a(a(this.f72l.getXVelocity(this.f63c), this.f74n, this.f73m), a(this.f72l.getYVelocity(this.f63c), this.f74n, this.f73m));
    }

    private void a(float f2, float f3) {
        this.f80t = true;
        this.f78r.onViewReleased(this.f79s, f2, f3);
        this.f80t = false;
        if (this.f61a == 1) {
            a(0);
        }
    }

    private void a(float f2, float f3, int i2) {
        float[] fArr = this.f64d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            float[] fArr6 = this.f64d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f65e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f66f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f67g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f68h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f69i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f70j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f64d = fArr2;
            this.f65e = fArr3;
            this.f66f = fArr4;
            this.f67g = fArr5;
            this.f68h = iArr;
            this.f69i = iArr2;
            this.f70j = iArr3;
        }
        float[] fArr10 = this.f64d;
        this.f66f[i2] = f2;
        fArr10[i2] = f2;
        float[] fArr11 = this.f65e;
        this.f67g[i2] = f3;
        fArr11[i2] = f3;
        int[] iArr7 = this.f68h;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.f81u.getLeft() + this.f75o) {
            i3 = 1;
        }
        if (i6 < this.f81u.getTop() + this.f75o) {
            i3 |= 4;
        }
        if (i5 > this.f81u.getRight() - this.f75o) {
            i3 |= 2;
        }
        if (i6 > this.f81u.getBottom() - this.f75o) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.f71k |= 1 << i2;
    }

    private void a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (c(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f66f[pointerId] = x2;
                this.f67g[pointerId] = y2;
            }
        }
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if (!((this.f68h[i2] & i3) != i3 || (this.f76p & i3) == 0 || (this.f70j[i2] & i3) == i3 || (this.f69i[i2] & i3) == i3)) {
            int i4 = this.f62b;
            if (abs > ((float) i4) || abs2 > ((float) i4)) {
                if (abs >= abs2 * 0.5f || !this.f78r.onEdgeLock(i3)) {
                    return (this.f69i[i2] & i3) == 0 && abs > ((float) this.f62b);
                }
                int[] iArr = this.f70j;
                iArr[i2] = iArr[i2] | i3;
                return false;
            }
        }
    }

    private boolean a(int i2, int i3, int i4, int i5) {
        int left = this.f79s.getLeft();
        int top2 = this.f79s.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top2;
        if (i6 == 0 && i7 == 0) {
            this.f77q.abortAnimation();
            a(0);
            return false;
        }
        this.f77q.startScroll(left, top2, i6, i7, a(this.f79s, i6, i7, i4, i5));
        a(2);
        return true;
    }

    private boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.f78r.getViewHorizontalDragRange(view) > 0;
        boolean z3 = this.f78r.getViewVerticalDragRange(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f62b) : z3 && Math.abs(f3) > ((float) this.f62b);
        }
        int i2 = this.f62b;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }

    private boolean a(View view, int i2) {
        if (view == this.f79s && this.f63c == i2) {
            return true;
        }
        if (view == null || !this.f78r.tryCaptureView(view, i2)) {
            return false;
        }
        this.f63c = i2;
        captureChildView(view, i2);
        return true;
    }

    private static int b(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private void b(float f2, float f3, int i2) {
        boolean a2 = a(f2, f3, i2, 1);
        if (a(f3, f2, i2, 4)) {
            a2 |= true;
        }
        if (a(f2, f3, i2, 2)) {
            a2 |= true;
        }
        if (a(f3, f2, i2, 8)) {
            a2 |= true;
        }
        if (a2) {
            int[] iArr = this.f69i;
            iArr[i2] = iArr[i2] | a2;
            this.f78r.onEdgeDragStarted(a2 ? 1 : 0, i2);
        }
    }

    private void b(int i2) {
        if (this.f64d != null && isPointerDown(i2)) {
            this.f64d[i2] = 0.0f;
            this.f65e[i2] = 0.0f;
            this.f66f[i2] = 0.0f;
            this.f67g[i2] = 0.0f;
            this.f68h[i2] = 0;
            this.f69i[i2] = 0;
            this.f70j[i2] = 0;
            this.f71k = ((1 << i2) ^ -1) & this.f71k;
        }
    }

    private boolean c(int i2) {
        if (isPointerDown(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public static ViewDragHelper create(ViewGroup viewGroup, float f2, Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.f62b = (int) (((float) create.f62b) * (1.0f / f2));
        return create;
    }

    public static ViewDragHelper create(ViewGroup viewGroup, Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.f81u.removeCallbacks(this.f82w);
        if (this.f61a != i2) {
            this.f61a = i2;
            this.f78r.onViewDragStateChanged(i2);
            if (this.f61a == 0) {
                this.f79s = null;
            }
        }
    }

    public void abort() {
        cancel();
        if (this.f61a == 2) {
            int currX = this.f77q.getCurrX();
            int currY = this.f77q.getCurrY();
            this.f77q.abortAnimation();
            int currX2 = this.f77q.getCurrX();
            int currY2 = this.f77q.getCurrY();
            this.f78r.onViewPositionChanged(this.f79s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        a(0);
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i2, i3, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z2) {
            return view.canScrollHorizontally(-i2) || view.canScrollVertically(-i3);
        }
        return false;
    }

    public void cancel() {
        this.f63c = -1;
        float[] fArr = this.f64d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f65e, 0.0f);
            Arrays.fill(this.f66f, 0.0f);
            Arrays.fill(this.f67g, 0.0f);
            Arrays.fill(this.f68h, 0);
            Arrays.fill(this.f69i, 0);
            Arrays.fill(this.f70j, 0);
            this.f71k = 0;
        }
        VelocityTracker velocityTracker = this.f72l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f72l = null;
        }
    }

    public void captureChildView(View view, int i2) {
        if (view.getParent() == this.f81u) {
            this.f79s = view;
            this.f63c = i2;
            this.f78r.onViewCaptured(view, i2);
            a(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f81u + ")");
    }

    public boolean checkTouchSlop(int i2) {
        int length = this.f64d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (checkTouchSlop(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i2, int i3) {
        if (!isPointerDown(i3)) {
            return false;
        }
        boolean z2 = (i2 & 1) == 1;
        boolean z3 = (i2 & 2) == 2;
        float f2 = this.f66f[i3] - this.f64d[i3];
        float f3 = this.f67g[i3] - this.f65e[i3];
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f62b) : z3 && Math.abs(f3) > ((float) this.f62b);
        }
        int i4 = this.f62b;
        return (f2 * f2) + (f3 * f3) > ((float) (i4 * i4));
    }

    public boolean continueSettling(boolean z2) {
        if (this.f61a == 2) {
            boolean computeScrollOffset = this.f77q.computeScrollOffset();
            int currX = this.f77q.getCurrX();
            int currY = this.f77q.getCurrY();
            int left = currX - this.f79s.getLeft();
            int top2 = currY - this.f79s.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.f79s, left);
            }
            if (top2 != 0) {
                ViewCompat.offsetTopAndBottom(this.f79s, top2);
            }
            if (!(left == 0 && top2 == 0)) {
                this.f78r.onViewPositionChanged(this.f79s, currX, currY, left, top2);
            }
            if (computeScrollOffset && currX == this.f77q.getFinalX() && currY == this.f77q.getFinalY()) {
                this.f77q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z2) {
                    this.f81u.post(this.f82w);
                } else {
                    a(0);
                }
            }
        }
        return this.f61a == 2;
    }

    public View findTopChildUnder(int i2, int i3) {
        for (int childCount = this.f81u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f81u.getChildAt(this.f78r.getOrderedChildIndex(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i2, int i3, int i4, int i5) {
        if (this.f80t) {
            this.f77q.fling(this.f79s.getLeft(), this.f79s.getTop(), (int) this.f72l.getXVelocity(this.f63c), (int) this.f72l.getYVelocity(this.f63c), i2, i4, i3, i5);
            a(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    public int getActivePointerId() {
        return this.f63c;
    }

    public View getCapturedView() {
        return this.f79s;
    }

    public int getEdgeSize() {
        return this.f75o;
    }

    public float getMinVelocity() {
        return this.f74n;
    }

    public int getTouchSlop() {
        return this.f62b;
    }

    public int getViewDragState() {
        return this.f61a;
    }

    public boolean isCapturedViewUnder(int i2, int i3) {
        return isViewUnder(this.f79s, i2, i3);
    }

    public boolean isEdgeTouched(int i2) {
        int length = this.f68h.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (isEdgeTouched(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int i2, int i3) {
        return isPointerDown(i3) && (i2 & this.f68h[i3]) != 0;
    }

    public boolean isPointerDown(int i2) {
        return ((1 << i2) & this.f71k) != 0;
    }

    public boolean isViewUnder(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void processTouchEvent(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.f72l == null) {
            this.f72l = VelocityTracker.obtain();
        }
        this.f72l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View findTopChildUnder = findTopChildUnder((int) x2, (int) y2);
            a(x2, y2, pointerId);
            a(findTopChildUnder, pointerId);
            int i4 = this.f68h[pointerId];
            int i5 = this.f76p;
            if ((i4 & i5) != 0) {
                this.f78r.onEdgeTouched(i4 & i5, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f61a == 1) {
                a();
            }
            cancel();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f61a == 1) {
                    a(0.0f, 0.0f);
                }
                cancel();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                a(x3, y3, pointerId2);
                if (this.f61a == 0) {
                    a(findTopChildUnder((int) x3, (int) y3), pointerId2);
                    int i6 = this.f68h[pointerId2];
                    int i7 = this.f76p;
                    if ((i6 & i7) != 0) {
                        this.f78r.onEdgeTouched(i6 & i7, pointerId2);
                    }
                } else if (isCapturedViewUnder((int) x3, (int) y3)) {
                    a(this.f79s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f61a == 1 && pointerId3 == this.f63c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i3);
                        if (pointerId4 != this.f63c) {
                            View findTopChildUnder2 = findTopChildUnder((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view = this.f79s;
                            if (findTopChildUnder2 == view && a(view, pointerId4)) {
                                i2 = this.f63c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        a();
                    }
                }
                b(pointerId3);
            }
        } else if (this.f61a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i3);
                if (c(pointerId5)) {
                    float x4 = motionEvent.getX(i3);
                    float y4 = motionEvent.getY(i3);
                    float f2 = x4 - this.f64d[pointerId5];
                    float f3 = y4 - this.f65e[pointerId5];
                    b(f2, f3, pointerId5);
                    if (this.f61a == 1) {
                        break;
                    }
                    View findTopChildUnder3 = findTopChildUnder((int) x4, (int) y4);
                    if (a(findTopChildUnder3, f2, f3) && a(findTopChildUnder3, pointerId5)) {
                        break;
                    }
                }
                i3++;
            }
            a(motionEvent);
        } else if (c(this.f63c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f63c);
            float x5 = motionEvent.getX(findPointerIndex);
            float y5 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f66f;
            int i8 = this.f63c;
            int i9 = (int) (x5 - fArr[i8]);
            int i10 = (int) (y5 - this.f67g[i8]);
            int left = this.f79s.getLeft() + i9;
            int top2 = this.f79s.getTop() + i10;
            int left2 = this.f79s.getLeft();
            int top3 = this.f79s.getTop();
            if (i9 != 0) {
                left = this.f78r.clampViewPositionHorizontal(this.f79s, left, i9);
                ViewCompat.offsetLeftAndRight(this.f79s, left - left2);
            }
            int i11 = left;
            if (i10 != 0) {
                top2 = this.f78r.clampViewPositionVertical(this.f79s, top2, i10);
                ViewCompat.offsetTopAndBottom(this.f79s, top2 - top3);
            }
            int i12 = top2;
            if (!(i9 == 0 && i10 == 0)) {
                this.f78r.onViewPositionChanged(this.f79s, i11, i12, i11 - left2, i12 - top3);
            }
            a(motionEvent);
        }
    }

    public void setEdgeTrackingEnabled(int i2) {
        this.f76p = i2;
    }

    public void setMinVelocity(float f2) {
        this.f74n = f2;
    }

    public boolean settleCapturedViewAt(int i2, int i3) {
        if (this.f80t) {
            return a(i2, i3, (int) this.f72l.getXVelocity(this.f63c), (int) this.f72l.getYVelocity(this.f63c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r12 != r11) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.cancel()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f72l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f72l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f72l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00fe
            if (r2 == r6) goto L_0x00fa
            if (r2 == r4) goto L_0x0072
            r7 = 3
            if (r2 == r7) goto L_0x00fa
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x012f
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.b(r1)
            goto L_0x012f
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.a((float) r7, (float) r1, (int) r2)
            int r3 = r0.f61a
            if (r3 != 0) goto L_0x0061
            int[] r1 = r0.f68h
            r1 = r1[r2]
            int r3 = r0.f76p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x012f
            androidx.customview.widget.ViewDragHelper$Callback r4 = r0.f78r
            r1 = r1 & r3
            r4.onEdgeTouched(r1, r2)
            goto L_0x012f
        L_0x0061:
            if (r3 != r4) goto L_0x012f
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.findTopChildUnder(r3, r1)
            android.view.View r3 = r0.f79s
            if (r1 != r3) goto L_0x012f
            r0.a((android.view.View) r1, (int) r2)
            goto L_0x012f
        L_0x0072:
            float[] r2 = r0.f64d
            if (r2 == 0) goto L_0x012f
            float[] r2 = r0.f65e
            if (r2 == 0) goto L_0x012f
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x00f6
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.c(r4)
            if (r7 == 0) goto L_0x00f3
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f64d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f65e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.findTopChildUnder(r7, r8)
            if (r7 == 0) goto L_0x00af
            boolean r8 = r0.a((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00af
            r8 = 1
            goto L_0x00b0
        L_0x00af:
            r8 = 0
        L_0x00b0:
            if (r8 == 0) goto L_0x00e4
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            androidx.customview.widget.ViewDragHelper$Callback r14 = r0.f78r
            int r12 = r14.clampViewPositionHorizontal(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            androidx.customview.widget.ViewDragHelper$Callback r5 = r0.f78r
            int r5 = r5.clampViewPositionVertical(r7, r15, r14)
            androidx.customview.widget.ViewDragHelper$Callback r14 = r0.f78r
            int r14 = r14.getViewHorizontalDragRange(r7)
            androidx.customview.widget.ViewDragHelper$Callback r15 = r0.f78r
            int r15 = r15.getViewVerticalDragRange(r7)
            if (r14 == 0) goto L_0x00de
            if (r14 <= 0) goto L_0x00e4
            if (r12 != r11) goto L_0x00e4
        L_0x00de:
            if (r15 == 0) goto L_0x00f6
            if (r15 <= 0) goto L_0x00e4
            if (r5 == r13) goto L_0x00f6
        L_0x00e4:
            r0.b((float) r9, (float) r10, (int) r4)
            int r5 = r0.f61a
            if (r5 == r6) goto L_0x00f6
            if (r8 == 0) goto L_0x00f3
            boolean r4 = r0.a((android.view.View) r7, (int) r4)
            if (r4 != 0) goto L_0x00f6
        L_0x00f3:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x00f6:
            r16.a((android.view.MotionEvent) r17)
            goto L_0x012f
        L_0x00fa:
            r16.cancel()
            goto L_0x012f
        L_0x00fe:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.a((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.findTopChildUnder(r2, r3)
            android.view.View r3 = r0.f79s
            if (r2 != r3) goto L_0x011f
            int r3 = r0.f61a
            if (r3 != r4) goto L_0x011f
            r0.a((android.view.View) r2, (int) r1)
        L_0x011f:
            int[] r2 = r0.f68h
            r2 = r2[r1]
            int r3 = r0.f76p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x012f
            androidx.customview.widget.ViewDragHelper$Callback r4 = r0.f78r
            r2 = r2 & r3
            r4.onEdgeTouched(r2, r1)
        L_0x012f:
            int r1 = r0.f61a
            if (r1 != r6) goto L_0x0134
            return r6
        L_0x0134:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(View view, int i2, int i3) {
        this.f79s = view;
        this.f63c = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.f61a == 0 && this.f79s != null) {
            this.f79s = null;
        }
        return a2;
    }
}
