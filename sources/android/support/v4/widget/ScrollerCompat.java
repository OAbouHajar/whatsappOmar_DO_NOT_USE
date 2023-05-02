package android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class ScrollerCompat {
    static final ScrollerCompatImpl IMPL;
    Object mScroller;

    interface ScrollerCompatImpl {
        void abortAnimation(Object obj);

        boolean computeScrollOffset(Object obj);

        Object createScroller(Context context, Interpolator interpolator);

        void fling(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

        void fling(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11);

        float getCurrVelocity(Object obj);

        int getCurrX(Object obj);

        int getCurrY(Object obj);

        int getFinalX(Object obj);

        int getFinalY(Object obj);

        boolean isFinished(Object obj);

        boolean isOverScrolled(Object obj);

        void notifyHorizontalEdgeReached(Object obj, int i2, int i3, int i4);

        void notifyVerticalEdgeReached(Object obj, int i2, int i3, int i4);

        void startScroll(Object obj, int i2, int i3, int i4, int i5);

        void startScroll(Object obj, int i2, int i3, int i4, int i5, int i6);
    }

    static class ScrollerCompatImplBase implements ScrollerCompatImpl {
        ScrollerCompatImplBase() {
        }

        public void abortAnimation(Object obj) {
            ((Scroller) obj).abortAnimation();
        }

        public boolean computeScrollOffset(Object obj) {
            return ((Scroller) obj).computeScrollOffset();
        }

        public Object createScroller(Context context, Interpolator interpolator) {
            return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
        }

        public void fling(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            ((Scroller) obj).fling(i2, i3, i4, i5, i6, i7, i8, i9);
        }

        public void fling(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            ((Scroller) obj).fling(i2, i3, i4, i5, i6, i7, i8, i9);
        }

        public float getCurrVelocity(Object obj) {
            return 0.0f;
        }

        public int getCurrX(Object obj) {
            return ((Scroller) obj).getCurrX();
        }

        public int getCurrY(Object obj) {
            return ((Scroller) obj).getCurrY();
        }

        public int getFinalX(Object obj) {
            return ((Scroller) obj).getFinalX();
        }

        public int getFinalY(Object obj) {
            return ((Scroller) obj).getFinalY();
        }

        public boolean isFinished(Object obj) {
            return ((Scroller) obj).isFinished();
        }

        public boolean isOverScrolled(Object obj) {
            return false;
        }

        public void notifyHorizontalEdgeReached(Object obj, int i2, int i3, int i4) {
        }

        public void notifyVerticalEdgeReached(Object obj, int i2, int i3, int i4) {
        }

        public void startScroll(Object obj, int i2, int i3, int i4, int i5) {
            ((Scroller) obj).startScroll(i2, i3, i4, i5);
        }

        public void startScroll(Object obj, int i2, int i3, int i4, int i5, int i6) {
            ((Scroller) obj).startScroll(i2, i3, i4, i5, i6);
        }
    }

    static class ScrollerCompatImplGingerbread implements ScrollerCompatImpl {
        ScrollerCompatImplGingerbread() {
        }

        public void abortAnimation(Object obj) {
            ScrollerCompatGingerbread.abortAnimation(obj);
        }

        public boolean computeScrollOffset(Object obj) {
            return ScrollerCompatGingerbread.computeScrollOffset(obj);
        }

        public Object createScroller(Context context, Interpolator interpolator) {
            return ScrollerCompatGingerbread.createScroller(context, interpolator);
        }

        public void fling(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            ScrollerCompatGingerbread.fling(obj, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        public void fling(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            ScrollerCompatGingerbread.fling(obj, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
        }

        public float getCurrVelocity(Object obj) {
            return 0.0f;
        }

        public int getCurrX(Object obj) {
            return ScrollerCompatGingerbread.getCurrX(obj);
        }

        public int getCurrY(Object obj) {
            return ScrollerCompatGingerbread.getCurrY(obj);
        }

        public int getFinalX(Object obj) {
            return ScrollerCompatGingerbread.getFinalX(obj);
        }

        public int getFinalY(Object obj) {
            return ScrollerCompatGingerbread.getFinalY(obj);
        }

        public boolean isFinished(Object obj) {
            return ScrollerCompatGingerbread.isFinished(obj);
        }

        public boolean isOverScrolled(Object obj) {
            return ScrollerCompatGingerbread.isOverScrolled(obj);
        }

        public void notifyHorizontalEdgeReached(Object obj, int i2, int i3, int i4) {
            ScrollerCompatGingerbread.notifyHorizontalEdgeReached(obj, i2, i3, i4);
        }

        public void notifyVerticalEdgeReached(Object obj, int i2, int i3, int i4) {
            ScrollerCompatGingerbread.notifyVerticalEdgeReached(obj, i2, i3, i4);
        }

        public void startScroll(Object obj, int i2, int i3, int i4, int i5) {
            ScrollerCompatGingerbread.startScroll(obj, i2, i3, i4, i5);
        }

        public void startScroll(Object obj, int i2, int i3, int i4, int i5, int i6) {
            ScrollerCompatGingerbread.startScroll(obj, i2, i3, i4, i5, i6);
        }
    }

    static class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread {
        ScrollerCompatImplIcs() {
        }

        public float getCurrVelocity(Object obj) {
            return ScrollerCompatIcs.getCurrVelocity(obj);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 14) {
            IMPL = new ScrollerCompatImplIcs();
        } else if (i2 >= 9) {
            IMPL = new ScrollerCompatImplGingerbread();
        } else {
            IMPL = new ScrollerCompatImplBase();
        }
    }

    ScrollerCompat(Context context, Interpolator interpolator) {
        this.mScroller = IMPL.createScroller(context, interpolator);
    }

    public static ScrollerCompat create(Context context) {
        return create(context, (Interpolator) null);
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }

    public void abortAnimation() {
        IMPL.abortAnimation(this.mScroller);
    }

    public boolean computeScrollOffset() {
        return IMPL.computeScrollOffset(this.mScroller);
    }

    public void fling(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        IMPL.fling(this.mScroller, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public void fling(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        IMPL.fling(this.mScroller, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
    }

    public float getCurrVelocity() {
        return IMPL.getCurrVelocity(this.mScroller);
    }

    public int getCurrX() {
        return IMPL.getCurrX(this.mScroller);
    }

    public int getCurrY() {
        return IMPL.getCurrY(this.mScroller);
    }

    public int getFinalX() {
        return IMPL.getFinalX(this.mScroller);
    }

    public int getFinalY() {
        return IMPL.getFinalY(this.mScroller);
    }

    public boolean isFinished() {
        return IMPL.isFinished(this.mScroller);
    }

    public boolean isOverScrolled() {
        return IMPL.isOverScrolled(this.mScroller);
    }

    public void notifyHorizontalEdgeReached(int i2, int i3, int i4) {
        IMPL.notifyHorizontalEdgeReached(this.mScroller, i2, i3, i4);
    }

    public void notifyVerticalEdgeReached(int i2, int i3, int i4) {
        IMPL.notifyVerticalEdgeReached(this.mScroller, i2, i3, i4);
    }

    public void startScroll(int i2, int i3, int i4, int i5) {
        IMPL.startScroll(this.mScroller, i2, i3, i4, i5);
    }

    public void startScroll(int i2, int i3, int i4, int i5, int i6) {
        IMPL.startScroll(this.mScroller, i2, i3, i4, i5, i6);
    }
}
