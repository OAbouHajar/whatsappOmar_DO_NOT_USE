package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

public class GravityCompat {
    public static final int END = 8388613;
    static final GravityCompatImpl IMPL;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    interface GravityCompatImpl {
        void apply(int i2, int i3, int i4, Rect rect, int i5, int i6, Rect rect2, int i7);

        void apply(int i2, int i3, int i4, Rect rect, Rect rect2, int i5);

        void applyDisplay(int i2, Rect rect, Rect rect2, int i3);

        int getAbsoluteGravity(int i2, int i3);
    }

    static class GravityCompatImplBase implements GravityCompatImpl {
        GravityCompatImplBase() {
        }

        public void apply(int i2, int i3, int i4, Rect rect, int i5, int i6, Rect rect2, int i7) {
            Gravity.apply(i2, i3, i4, rect, i5, i6, rect2);
        }

        public void apply(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
            Gravity.apply(i2, i3, i4, rect, rect2);
        }

        public void applyDisplay(int i2, Rect rect, Rect rect2, int i3) {
            Gravity.applyDisplay(i2, rect, rect2);
        }

        public int getAbsoluteGravity(int i2, int i3) {
            return -8388609 & i2;
        }
    }

    static class GravityCompatImplJellybeanMr1 implements GravityCompatImpl {
        GravityCompatImplJellybeanMr1() {
        }

        public void apply(int i2, int i3, int i4, Rect rect, int i5, int i6, Rect rect2, int i7) {
            GravityCompatJellybeanMr1.apply(i2, i3, i4, rect, i5, i6, rect2, i7);
        }

        public void apply(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
            GravityCompatJellybeanMr1.apply(i2, i3, i4, rect, rect2, i5);
        }

        public void applyDisplay(int i2, Rect rect, Rect rect2, int i3) {
            GravityCompatJellybeanMr1.applyDisplay(i2, rect, rect2, i3);
        }

        public int getAbsoluteGravity(int i2, int i3) {
            return GravityCompatJellybeanMr1.getAbsoluteGravity(i2, i3);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            IMPL = new GravityCompatImplJellybeanMr1();
        } else {
            IMPL = new GravityCompatImplBase();
        }
    }

    public static void apply(int i2, int i3, int i4, Rect rect, int i5, int i6, Rect rect2, int i7) {
        IMPL.apply(i2, i3, i4, rect, i5, i6, rect2, i7);
    }

    public static void apply(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
        IMPL.apply(i2, i3, i4, rect, rect2, i5);
    }

    public static void applyDisplay(int i2, Rect rect, Rect rect2, int i3) {
        IMPL.applyDisplay(i2, rect, rect2, i3);
    }

    public static int getAbsoluteGravity(int i2, int i3) {
        return IMPL.getAbsoluteGravity(i2, i3);
    }
}
