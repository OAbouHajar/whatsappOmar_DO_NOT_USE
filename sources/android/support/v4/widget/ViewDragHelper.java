package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private int mActivePointerId = -1;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private ScrollerCompat mScroller;
    private final Runnable mSetIdleRunnable = new Runnable() {
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

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
        } else if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.mParentView = viewGroup;
            this.mCallback = callback;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.mEdgeSize = (int) ((20.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            this.mMaxVelocity = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.mMinVelocity = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.mScroller = ScrollerCompat.create(context, sInterpolator);
        }
    }

    private boolean checkNewEdgeDrag(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.mInitialEdgesTouched[i2] & i3) != i3 || (this.mTrackingEdges & i3) == 0 || (this.mEdgeDragsLocked[i2] & i3) == i3 || (this.mEdgeDragsInProgress[i2] & i3) == i3) {
            return false;
        }
        if (abs <= ((float) this.mTouchSlop) && abs2 <= ((float) this.mTouchSlop)) {
            return false;
        }
        if (abs >= 0.5f * abs2 || !this.mCallback.onEdgeLock(i3)) {
            return (this.mEdgeDragsInProgress[i2] & i3) == 0 && abs > ((float) this.mTouchSlop);
        }
        int[] iArr = this.mEdgeDragsLocked;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private boolean checkTouchSlop(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z3 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (z2 && z3) {
            return (f2 * f2) + (f3 * f3) > ((float) (this.mTouchSlop * this.mTouchSlop));
        }
        if (z2) {
            return Math.abs(f2) > ((float) this.mTouchSlop);
        }
        if (z3) {
            return Math.abs(f3) > ((float) this.mTouchSlop);
        }
        return false;
    }

    private float clampMag(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 <= 0.0f ? -f4 : f4 : f2;
    }

    private int clampMag(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 <= 0 ? -i4 : i4 : i2;
    }

    private void clearMotionHistory() {
        if (this.mInitialMotionX != null) {
            Arrays.fill(this.mInitialMotionX, 0.0f);
            Arrays.fill(this.mInitialMotionY, 0.0f);
            Arrays.fill(this.mLastMotionX, 0.0f);
            Arrays.fill(this.mLastMotionY, 0.0f);
            Arrays.fill(this.mInitialEdgesTouched, 0);
            Arrays.fill(this.mEdgeDragsInProgress, 0);
            Arrays.fill(this.mEdgeDragsLocked, 0);
            this.mPointersDown = 0;
        }
    }

    private void clearMotionHistory(int i2) {
        if (this.mInitialMotionX != null) {
            this.mInitialMotionX[i2] = 0.0f;
            this.mInitialMotionY[i2] = 0.0f;
            this.mLastMotionX[i2] = 0.0f;
            this.mLastMotionY[i2] = 0.0f;
            this.mInitialEdgesTouched[i2] = 0;
            this.mEdgeDragsInProgress[i2] = 0;
            this.mEdgeDragsLocked[i2] = 0;
            this.mPointersDown &= (1 << i2) ^ -1;
        }
    }

    private int computeAxisDuration(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        int i5 = width / 2;
        float distanceInfluenceForSnapDuration = ((float) i5) + (((float) i5) * distanceInfluenceForSnapDuration(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))));
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(1000.0f * Math.abs(distanceInfluenceForSnapDuration / ((float) abs))) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), MAX_SETTLE_DURATION);
    }

    private int computeSettleDuration(View view, int i2, int i3, int i4, int i5) {
        int clampMag = clampMag(i4, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(i5, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        return (int) ((((float) computeAxisDuration(i2, clampMag, this.mCallback.getViewHorizontalDragRange(view))) * (clampMag != 0 ? ((float) abs3) / ((float) i6) : ((float) abs) / ((float) i7))) + (((float) computeAxisDuration(i3, clampMag2, this.mCallback.getViewVerticalDragRange(view))) * (clampMag2 != 0 ? ((float) abs4) / ((float) i6) : ((float) abs2) / ((float) i7))));
    }

    public static ViewDragHelper create(ViewGroup viewGroup, float f2, Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (((float) create.mTouchSlop) * (1.0f / f2));
        return create;
    }

    public static ViewDragHelper create(ViewGroup viewGroup, Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private void dispatchViewReleased(float f2, float f3) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f2, f3);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f2) {
        return (float) Math.sin((double) ((float) (((double) (f2 - 0.5f)) * 0.4712389167638204d)));
    }

    private void dragTo(int i2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        int left = this.mCapturedView.getLeft();
        int top2 = this.mCapturedView.getTop();
        if (i4 != 0) {
            i6 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i2, i4);
            this.mCapturedView.offsetLeftAndRight(i6 - left);
        }
        if (i5 != 0) {
            i7 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i3, i5);
            this.mCapturedView.offsetTopAndBottom(i7 - top2);
        }
        if (i4 != 0 || i5 != 0) {
            this.mCallback.onViewPositionChanged(this.mCapturedView, i6, i7, i6 - left, i7 - top2);
        }
    }

    private void ensureMotionHistorySizeForId(int i2) {
        if (this.mInitialMotionX == null || this.mInitialMotionX.length <= i2) {
            float[] fArr = new float[(i2 + 1)];
            float[] fArr2 = new float[(i2 + 1)];
            float[] fArr3 = new float[(i2 + 1)];
            float[] fArr4 = new float[(i2 + 1)];
            int[] iArr = new int[(i2 + 1)];
            int[] iArr2 = new int[(i2 + 1)];
            int[] iArr3 = new int[(i2 + 1)];
            if (this.mInitialMotionX != null) {
                System.arraycopy(this.mInitialMotionX, 0, fArr, 0, this.mInitialMotionX.length);
                System.arraycopy(this.mInitialMotionY, 0, fArr2, 0, this.mInitialMotionY.length);
                System.arraycopy(this.mLastMotionX, 0, fArr3, 0, this.mLastMotionX.length);
                System.arraycopy(this.mLastMotionY, 0, fArr4, 0, this.mLastMotionY.length);
                System.arraycopy(this.mInitialEdgesTouched, 0, iArr, 0, this.mInitialEdgesTouched.length);
                System.arraycopy(this.mEdgeDragsInProgress, 0, iArr2, 0, this.mEdgeDragsInProgress.length);
                System.arraycopy(this.mEdgeDragsLocked, 0, iArr3, 0, this.mEdgeDragsLocked.length);
            }
            this.mInitialMotionX = fArr;
            this.mInitialMotionY = fArr2;
            this.mLastMotionX = fArr3;
            this.mLastMotionY = fArr4;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private boolean forceSettleCapturedViewAt(int i2, int i3, int i4, int i5) {
        int left = this.mCapturedView.getLeft();
        int top2 = this.mCapturedView.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top2;
        if (i6 == 0 && i7 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top2, i6, i7, computeSettleDuration(this.mCapturedView, i6, i7, i4, i5));
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i2, int i3) {
        int i4 = 0;
        if (i2 < this.mParentView.getLeft() + this.mEdgeSize) {
            i4 = 0 | 1;
        }
        if (i3 < this.mParentView.getTop() + this.mEdgeSize) {
            i4 |= 4;
        }
        if (i2 > this.mParentView.getRight() - this.mEdgeSize) {
            i4 |= 2;
        }
        return i3 > this.mParentView.getBottom() - this.mEdgeSize ? i4 | 8 : i4;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    private void reportNewEdgeDrags(float f2, float f3, int i2) {
        int i3 = 0;
        if (checkNewEdgeDrag(f2, f3, i2, 1)) {
            i3 = 0 | 1;
        }
        if (checkNewEdgeDrag(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (checkNewEdgeDrag(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (checkNewEdgeDrag(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i2] = iArr[i2] | i3;
            this.mCallback.onEdgeDragStarted(i3, i2);
        }
    }

    private void saveInitialMotion(float f2, float f3, int i2) {
        ensureMotionHistorySizeForId(i2);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i2] = f3;
        fArr2[i2] = f3;
        this.mInitialEdgesTouched[i2] = getEdgesTouched((int) f2, (int) f3);
        this.mPointersDown |= 1 << i2;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = MotionEventCompat.getPointerId(motionEvent, i2);
            float x2 = MotionEventCompat.getX(motionEvent, i2);
            float y2 = MotionEventCompat.getY(motionEvent, i2);
            this.mLastMotionX[pointerId] = x2;
            this.mLastMotionY[pointerId] = y2;
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z2, int i2, int i3, int i4, int i5) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i4 + scrollX >= childAt.getLeft() && i4 + scrollX < childAt.getRight() && i5 + scrollY >= childAt.getTop() && i5 + scrollY < childAt.getBottom()) {
                    if (canScroll(childAt, true, i2, i3, (i4 + scrollX) - childAt.getLeft(), (i5 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z2 && (ViewCompat.canScrollHorizontally(view, -i2) || ViewCompat.canScrollVertically(view, -i3));
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void captureChildView(View view, int i2) {
        if (view.getParent() != this.mParentView) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + ")");
        }
        this.mCapturedView = view;
        this.mActivePointerId = i2;
        this.mCallback.onViewCaptured(view, i2);
        setDragState(1);
    }

    public boolean checkTouchSlop(int i2) {
        int length = this.mInitialMotionX.length;
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
        float f2 = this.mLastMotionX[i3] - this.mInitialMotionX[i3];
        float f3 = this.mLastMotionY[i3] - this.mInitialMotionY[i3];
        if (z2 && z3) {
            return (f2 * f2) + (f3 * f3) > ((float) (this.mTouchSlop * this.mTouchSlop));
        }
        if (z2) {
            return Math.abs(f2) > ((float) this.mTouchSlop);
        }
        if (z3) {
            return Math.abs(f3) > ((float) this.mTouchSlop);
        }
        return false;
    }

    public boolean continueSettling(boolean z2) {
        if (this.mDragState == 2) {
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top2 = currY - this.mCapturedView.getTop();
            if (left != 0) {
                this.mCapturedView.offsetLeftAndRight(left);
            }
            if (top2 != 0) {
                this.mCapturedView.offsetTopAndBottom(top2);
            }
            if (!(left == 0 && top2 == 0)) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top2);
            }
            if (computeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                computeScrollOffset = this.mScroller.isFinished();
            }
            if (!computeScrollOffset) {
                if (z2) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        return this.mDragState == 2;
    }

    public View findTopChildUnder(int i2, int i3) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i2, int i3, int i4, int i5) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), (int) VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId), i2, i4, i3, i5);
        setDragState(2);
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    public View getCapturedView() {
        return this.mCapturedView;
    }

    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public boolean isCapturedViewUnder(int i2, int i3) {
        return isViewUnder(this.mCapturedView, i2, i3);
    }

    public boolean isEdgeTouched(int i2) {
        int length = this.mInitialEdgesTouched.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (isEdgeTouched(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int i2, int i3) {
        return isPointerDown(i3) && (this.mInitialEdgesTouched[i3] & i2) != 0;
    }

    public boolean isPointerDown(int i2) {
        return (this.mPointersDown & (1 << i2)) != 0;
    }

    public boolean isViewUnder(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0237, code lost:
        r17 = android.support.v4.view.MotionEventCompat.getX(r22, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            int r3 = android.support.v4.view.MotionEventCompat.getActionMasked(r22)
            int r4 = android.support.v4.view.MotionEventCompat.getActionIndex(r22)
            if (r3 != 0) goto L_0x000d
            r21.cancel()
        L_0x000d:
            r0 = r21
            android.view.VelocityTracker r0 = r0.mVelocityTracker
            r19 = r0
            if (r19 != 0) goto L_0x001f
            android.view.VelocityTracker r19 = android.view.VelocityTracker.obtain()
            r0 = r19
            r1 = r21
            r1.mVelocityTracker = r0
        L_0x001f:
            r0 = r21
            android.view.VelocityTracker r0 = r0.mVelocityTracker
            r19 = r0
            r0 = r19
            r1 = r22
            r0.addMovement(r1)
            switch(r3) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0287;
                case 2: goto L_0x011a;
                case 3: goto L_0x029d;
                case 4: goto L_0x002f;
                case 5: goto L_0x008e;
                case 6: goto L_0x01fe;
                default: goto L_0x002f;
            }
        L_0x002f:
            return
        L_0x0030:
            float r17 = r22.getX()
            float r18 = r22.getY()
            r19 = 0
            r0 = r22
            r1 = r19
            int r15 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r1)
            r0 = r17
            int r0 = (int) r0
            r19 = r0
            r0 = r18
            int r0 = (int) r0
            r20 = r0
            r0 = r21
            r1 = r19
            r2 = r20
            android.view.View r16 = r0.findTopChildUnder(r1, r2)
            r0 = r21
            r1 = r17
            r2 = r18
            r0.saveInitialMotion(r1, r2, r15)
            r0 = r21
            r1 = r16
            r0.tryCaptureViewForDrag(r1, r15)
            r0 = r21
            int[] r0 = r0.mInitialEdgesTouched
            r19 = r0
            r7 = r19[r15]
            r0 = r21
            int r0 = r0.mTrackingEdges
            r19 = r0
            r19 = r19 & r7
            if (r19 == 0) goto L_0x002f
            r0 = r21
            android.support.v4.widget.ViewDragHelper$Callback r0 = r0.mCallback
            r19 = r0
            r0 = r21
            int r0 = r0.mTrackingEdges
            r20 = r0
            r20 = r20 & r7
            r0 = r19
            r1 = r20
            r0.onEdgeTouched(r1, r15)
            goto L_0x002f
        L_0x008e:
            r0 = r22
            int r15 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r4)
            r0 = r22
            float r17 = android.support.v4.view.MotionEventCompat.getX(r0, r4)
            r0 = r22
            float r18 = android.support.v4.view.MotionEventCompat.getY(r0, r4)
            r0 = r21
            r1 = r17
            r2 = r18
            r0.saveInitialMotion(r1, r2, r15)
            r0 = r21
            int r0 = r0.mDragState
            r19 = r0
            if (r19 != 0) goto L_0x00f5
            r0 = r17
            int r0 = (int) r0
            r19 = r0
            r0 = r18
            int r0 = (int) r0
            r20 = r0
            r0 = r21
            r1 = r19
            r2 = r20
            android.view.View r16 = r0.findTopChildUnder(r1, r2)
            r0 = r21
            r1 = r16
            r0.tryCaptureViewForDrag(r1, r15)
            r0 = r21
            int[] r0 = r0.mInitialEdgesTouched
            r19 = r0
            r7 = r19[r15]
            r0 = r21
            int r0 = r0.mTrackingEdges
            r19 = r0
            r19 = r19 & r7
            if (r19 == 0) goto L_0x002f
            r0 = r21
            android.support.v4.widget.ViewDragHelper$Callback r0 = r0.mCallback
            r19 = r0
            r0 = r21
            int r0 = r0.mTrackingEdges
            r20 = r0
            r20 = r20 & r7
            r0 = r19
            r1 = r20
            r0.onEdgeTouched(r1, r15)
            goto L_0x002f
        L_0x00f5:
            r0 = r17
            int r0 = (int) r0
            r19 = r0
            r0 = r18
            int r0 = (int) r0
            r20 = r0
            r0 = r21
            r1 = r19
            r2 = r20
            boolean r19 = r0.isCapturedViewUnder(r1, r2)
            if (r19 == 0) goto L_0x002f
            r0 = r21
            android.view.View r0 = r0.mCapturedView
            r19 = r0
            r0 = r21
            r1 = r19
            r0.tryCaptureViewForDrag(r1, r15)
            goto L_0x002f
        L_0x011a:
            r0 = r21
            int r0 = r0.mDragState
            r19 = r0
            r20 = 1
            r0 = r19
            r1 = r20
            if (r0 != r1) goto L_0x018e
            r0 = r21
            int r0 = r0.mActivePointerId
            r19 = r0
            r0 = r22
            r1 = r19
            int r12 = android.support.v4.view.MotionEventCompat.findPointerIndex(r0, r1)
            r0 = r22
            float r17 = android.support.v4.view.MotionEventCompat.getX(r0, r12)
            r0 = r22
            float r18 = android.support.v4.view.MotionEventCompat.getY(r0, r12)
            r0 = r21
            float[] r0 = r0.mLastMotionX
            r19 = r0
            r0 = r21
            int r0 = r0.mActivePointerId
            r20 = r0
            r19 = r19[r20]
            float r19 = r17 - r19
            r0 = r19
            int r10 = (int) r0
            r0 = r21
            float[] r0 = r0.mLastMotionY
            r19 = r0
            r0 = r21
            int r0 = r0.mActivePointerId
            r20 = r0
            r19 = r19[r20]
            float r19 = r18 - r19
            r0 = r19
            int r11 = (int) r0
            r0 = r21
            android.view.View r0 = r0.mCapturedView
            r19 = r0
            int r19 = r19.getLeft()
            int r19 = r19 + r10
            r0 = r21
            android.view.View r0 = r0.mCapturedView
            r20 = r0
            int r20 = r20.getTop()
            int r20 = r20 + r11
            r0 = r21
            r1 = r19
            r2 = r20
            r0.dragTo(r1, r2, r10, r11)
            r21.saveLastMotion(r22)
            goto L_0x002f
        L_0x018e:
            int r14 = android.support.v4.view.MotionEventCompat.getPointerCount(r22)
            r8 = 0
        L_0x0193:
            if (r8 >= r14) goto L_0x01ce
            r0 = r22
            int r15 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r8)
            r0 = r22
            float r17 = android.support.v4.view.MotionEventCompat.getX(r0, r8)
            r0 = r22
            float r18 = android.support.v4.view.MotionEventCompat.getY(r0, r8)
            r0 = r21
            float[] r0 = r0.mInitialMotionX
            r19 = r0
            r19 = r19[r15]
            float r5 = r17 - r19
            r0 = r21
            float[] r0 = r0.mInitialMotionY
            r19 = r0
            r19 = r19[r15]
            float r6 = r18 - r19
            r0 = r21
            r0.reportNewEdgeDrags(r5, r6, r15)
            r0 = r21
            int r0 = r0.mDragState
            r19 = r0
            r20 = 1
            r0 = r19
            r1 = r20
            if (r0 != r1) goto L_0x01d3
        L_0x01ce:
            r21.saveLastMotion(r22)
            goto L_0x002f
        L_0x01d3:
            r0 = r17
            int r0 = (int) r0
            r19 = r0
            r0 = r18
            int r0 = (int) r0
            r20 = r0
            r0 = r21
            r1 = r19
            r2 = r20
            android.view.View r16 = r0.findTopChildUnder(r1, r2)
            r0 = r21
            r1 = r16
            boolean r19 = r0.checkTouchSlop(r1, r5, r6)
            if (r19 == 0) goto L_0x01fb
            r0 = r21
            r1 = r16
            boolean r19 = r0.tryCaptureViewForDrag(r1, r15)
            if (r19 != 0) goto L_0x01ce
        L_0x01fb:
            int r8 = r8 + 1
            goto L_0x0193
        L_0x01fe:
            r0 = r22
            int r15 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r4)
            r0 = r21
            int r0 = r0.mDragState
            r19 = r0
            r20 = 1
            r0 = r19
            r1 = r20
            if (r0 != r1) goto L_0x0280
            r0 = r21
            int r0 = r0.mActivePointerId
            r19 = r0
            r0 = r19
            if (r15 != r0) goto L_0x0280
            r13 = -1
            int r14 = android.support.v4.view.MotionEventCompat.getPointerCount(r22)
            r8 = 0
        L_0x0222:
            if (r8 >= r14) goto L_0x0277
            r0 = r22
            int r9 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r8)
            r0 = r21
            int r0 = r0.mActivePointerId
            r19 = r0
            r0 = r19
            if (r9 != r0) goto L_0x0237
        L_0x0234:
            int r8 = r8 + 1
            goto L_0x0222
        L_0x0237:
            r0 = r22
            float r17 = android.support.v4.view.MotionEventCompat.getX(r0, r8)
            r0 = r22
            float r18 = android.support.v4.view.MotionEventCompat.getY(r0, r8)
            r0 = r17
            int r0 = (int) r0
            r19 = r0
            r0 = r18
            int r0 = (int) r0
            r20 = r0
            r0 = r21
            r1 = r19
            r2 = r20
            android.view.View r19 = r0.findTopChildUnder(r1, r2)
            r0 = r21
            android.view.View r0 = r0.mCapturedView
            r20 = r0
            r0 = r19
            r1 = r20
            if (r0 != r1) goto L_0x0234
            r0 = r21
            android.view.View r0 = r0.mCapturedView
            r19 = r0
            r0 = r21
            r1 = r19
            boolean r19 = r0.tryCaptureViewForDrag(r1, r9)
            if (r19 == 0) goto L_0x0234
            r0 = r21
            int r13 = r0.mActivePointerId
        L_0x0277:
            r19 = -1
            r0 = r19
            if (r13 != r0) goto L_0x0280
            r21.releaseViewForPointerUp()
        L_0x0280:
            r0 = r21
            r0.clearMotionHistory(r15)
            goto L_0x002f
        L_0x0287:
            r0 = r21
            int r0 = r0.mDragState
            r19 = r0
            r20 = 1
            r0 = r19
            r1 = r20
            if (r0 != r1) goto L_0x0298
            r21.releaseViewForPointerUp()
        L_0x0298:
            r21.cancel()
            goto L_0x002f
        L_0x029d:
            r0 = r21
            int r0 = r0.mDragState
            r19 = r0
            r20 = 1
            r0 = r19
            r1 = r20
            if (r0 != r1) goto L_0x02b8
            r19 = 0
            r20 = 0
            r0 = r21
            r1 = r19
            r2 = r20
            r0.dispatchViewReleased(r1, r2)
        L_0x02b8:
            r21.cancel()
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ViewDragHelper.processTouchEvent(android.view.MotionEvent):void");
    }

    /* access modifiers changed from: package-private */
    public void setDragState(int i2) {
        if (this.mDragState != i2) {
            this.mDragState = i2;
            this.mCallback.onViewDragStateChanged(i2);
            if (i2 == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeTrackingEnabled(int i2) {
        this.mTrackingEdges = i2;
    }

    public void setMinVelocity(float f2) {
        this.mMinVelocity = f2;
    }

    public boolean settleCapturedViewAt(int i2, int i3) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i2, i3, (int) VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), (int) VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean shouldInterceptTouchEvent(MotionEvent motionEvent) {
        View findTopChildUnder;
        View findTopChildUnder2;
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                int pointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                saveInitialMotion(x2, y2, pointerId);
                View findTopChildUnder3 = findTopChildUnder((int) x2, (int) y2);
                if (findTopChildUnder3 == this.mCapturedView && this.mDragState == 2) {
                    tryCaptureViewForDrag(findTopChildUnder3, pointerId);
                }
                int i2 = this.mInitialEdgesTouched[pointerId];
                if ((this.mTrackingEdges & i2) != 0) {
                    this.mCallback.onEdgeTouched(this.mTrackingEdges & i2, pointerId);
                    break;
                }
                break;
            case 1:
            case 3:
                cancel();
                break;
            case 2:
                int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
                int i3 = 0;
                while (i3 < pointerCount) {
                    int pointerId2 = MotionEventCompat.getPointerId(motionEvent, i3);
                    float x3 = MotionEventCompat.getX(motionEvent, i3);
                    float y3 = MotionEventCompat.getY(motionEvent, i3);
                    float f2 = x3 - this.mInitialMotionX[pointerId2];
                    float f3 = y3 - this.mInitialMotionY[pointerId2];
                    reportNewEdgeDrags(f2, f3, pointerId2);
                    if (this.mDragState != 1 && ((findTopChildUnder = findTopChildUnder((int) x3, (int) y3)) == null || !checkTouchSlop(findTopChildUnder, f2, f3) || !tryCaptureViewForDrag(findTopChildUnder, pointerId2))) {
                        i3++;
                    }
                    saveLastMotion(motionEvent);
                    break;
                }
                saveLastMotion(motionEvent);
            case 5:
                int pointerId3 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                float x4 = MotionEventCompat.getX(motionEvent, actionIndex);
                float y4 = MotionEventCompat.getY(motionEvent, actionIndex);
                saveInitialMotion(x4, y4, pointerId3);
                if (this.mDragState != 0) {
                    if (this.mDragState == 2 && (findTopChildUnder2 = findTopChildUnder((int) x4, (int) y4)) == this.mCapturedView) {
                        tryCaptureViewForDrag(findTopChildUnder2, pointerId3);
                        break;
                    }
                } else {
                    int i4 = this.mInitialEdgesTouched[pointerId3];
                    if ((this.mTrackingEdges & i4) != 0) {
                        this.mCallback.onEdgeTouched(this.mTrackingEdges & i4, pointerId3);
                        break;
                    }
                }
                break;
            case 6:
                clearMotionHistory(MotionEventCompat.getPointerId(motionEvent, actionIndex));
                break;
        }
        return this.mDragState == 1;
    }

    public boolean smoothSlideViewTo(View view, int i2, int i3) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        return forceSettleCapturedViewAt(i2, i3, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public boolean tryCaptureViewForDrag(View view, int i2) {
        if (view == this.mCapturedView && this.mActivePointerId == i2) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i2)) {
            return false;
        }
        this.mActivePointerId = i2;
        captureChildView(view, i2);
        return true;
    }
}
