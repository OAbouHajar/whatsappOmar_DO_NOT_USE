package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;

public class VelocityTrackerCompat {
    static final VelocityTrackerVersionImpl IMPL;

    static class BaseVelocityTrackerVersionImpl implements VelocityTrackerVersionImpl {
        BaseVelocityTrackerVersionImpl() {
        }

        public float getXVelocity(VelocityTracker velocityTracker, int i2) {
            return velocityTracker.getXVelocity();
        }

        public float getYVelocity(VelocityTracker velocityTracker, int i2) {
            return velocityTracker.getYVelocity();
        }
    }

    static class HoneycombVelocityTrackerVersionImpl implements VelocityTrackerVersionImpl {
        HoneycombVelocityTrackerVersionImpl() {
        }

        public float getXVelocity(VelocityTracker velocityTracker, int i2) {
            return VelocityTrackerCompatHoneycomb.getXVelocity(velocityTracker, i2);
        }

        public float getYVelocity(VelocityTracker velocityTracker, int i2) {
            return VelocityTrackerCompatHoneycomb.getYVelocity(velocityTracker, i2);
        }
    }

    interface VelocityTrackerVersionImpl {
        float getXVelocity(VelocityTracker velocityTracker, int i2);

        float getYVelocity(VelocityTracker velocityTracker, int i2);
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombVelocityTrackerVersionImpl();
        } else {
            IMPL = new BaseVelocityTrackerVersionImpl();
        }
    }

    public static float getXVelocity(VelocityTracker velocityTracker, int i2) {
        return IMPL.getXVelocity(velocityTracker, i2);
    }

    public static float getYVelocity(VelocityTracker velocityTracker, int i2) {
        return IMPL.getYVelocity(velocityTracker, i2);
    }
}
