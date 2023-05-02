package android.support.v4.view;

import android.os.Build;
import android.view.MotionEvent;

public class MotionEventCompat {
    public static final int ACTION_HOVER_ENTER = 9;
    public static final int ACTION_HOVER_EXIT = 10;
    public static final int ACTION_HOVER_MOVE = 7;
    public static final int ACTION_MASK = 255;
    public static final int ACTION_POINTER_DOWN = 5;
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    public static final int ACTION_POINTER_UP = 6;
    public static final int ACTION_SCROLL = 8;
    static final MotionEventVersionImpl IMPL;

    static class BaseMotionEventVersionImpl implements MotionEventVersionImpl {
        BaseMotionEventVersionImpl() {
        }

        public int findPointerIndex(MotionEvent motionEvent, int i2) {
            return i2 == 0 ? 0 : -1;
        }

        public int getPointerCount(MotionEvent motionEvent) {
            return 1;
        }

        public int getPointerId(MotionEvent motionEvent, int i2) {
            if (i2 == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        public float getX(MotionEvent motionEvent, int i2) {
            if (i2 == 0) {
                return motionEvent.getX();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        public float getY(MotionEvent motionEvent, int i2) {
            if (i2 == 0) {
                return motionEvent.getY();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
    }

    static class EclairMotionEventVersionImpl implements MotionEventVersionImpl {
        EclairMotionEventVersionImpl() {
        }

        public int findPointerIndex(MotionEvent motionEvent, int i2) {
            return MotionEventCompatEclair.findPointerIndex(motionEvent, i2);
        }

        public int getPointerCount(MotionEvent motionEvent) {
            return MotionEventCompatEclair.getPointerCount(motionEvent);
        }

        public int getPointerId(MotionEvent motionEvent, int i2) {
            return MotionEventCompatEclair.getPointerId(motionEvent, i2);
        }

        public float getX(MotionEvent motionEvent, int i2) {
            return MotionEventCompatEclair.getX(motionEvent, i2);
        }

        public float getY(MotionEvent motionEvent, int i2) {
            return MotionEventCompatEclair.getY(motionEvent, i2);
        }
    }

    interface MotionEventVersionImpl {
        int findPointerIndex(MotionEvent motionEvent, int i2);

        int getPointerCount(MotionEvent motionEvent);

        int getPointerId(MotionEvent motionEvent, int i2);

        float getX(MotionEvent motionEvent, int i2);

        float getY(MotionEvent motionEvent, int i2);
    }

    static {
        if (Build.VERSION.SDK_INT >= 5) {
            IMPL = new EclairMotionEventVersionImpl();
        } else {
            IMPL = new BaseMotionEventVersionImpl();
        }
    }

    public static int findPointerIndex(MotionEvent motionEvent, int i2) {
        return IMPL.findPointerIndex(motionEvent, i2);
    }

    public static int getActionIndex(MotionEvent motionEvent) {
        return (motionEvent.getAction() & ACTION_POINTER_INDEX_MASK) >> 8;
    }

    public static int getActionMasked(MotionEvent motionEvent) {
        return motionEvent.getAction() & ACTION_MASK;
    }

    public static int getPointerCount(MotionEvent motionEvent) {
        return IMPL.getPointerCount(motionEvent);
    }

    public static int getPointerId(MotionEvent motionEvent, int i2) {
        return IMPL.getPointerId(motionEvent, i2);
    }

    public static float getX(MotionEvent motionEvent, int i2) {
        return IMPL.getX(motionEvent, i2);
    }

    public static float getY(MotionEvent motionEvent, int i2) {
        return IMPL.getY(motionEvent, i2);
    }
}
