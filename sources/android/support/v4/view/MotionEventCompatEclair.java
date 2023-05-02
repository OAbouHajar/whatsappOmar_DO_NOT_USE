package android.support.v4.view;

import android.view.MotionEvent;

class MotionEventCompatEclair {
    MotionEventCompatEclair() {
    }

    public static int findPointerIndex(MotionEvent motionEvent, int i2) {
        return motionEvent.findPointerIndex(i2);
    }

    public static int getPointerCount(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    public static int getPointerId(MotionEvent motionEvent, int i2) {
        return motionEvent.getPointerId(i2);
    }

    public static float getX(MotionEvent motionEvent, int i2) {
        return motionEvent.getX(i2);
    }

    public static float getY(MotionEvent motionEvent, int i2) {
        return motionEvent.getY(i2);
    }
}
