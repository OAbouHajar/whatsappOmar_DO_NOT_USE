package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

public class EdgeEffectCompat {
    private static final EdgeEffectImpl IMPL;
    private Object mEdgeEffect;

    static class BaseEdgeEffectImpl implements EdgeEffectImpl {
        BaseEdgeEffectImpl() {
        }

        public boolean draw(Object obj, Canvas canvas) {
            return false;
        }

        public void finish(Object obj) {
        }

        public boolean isFinished(Object obj) {
            return true;
        }

        public Object newEdgeEffect(Context context) {
            return null;
        }

        public boolean onAbsorb(Object obj, int i2) {
            return false;
        }

        public boolean onPull(Object obj, float f2) {
            return false;
        }

        public boolean onRelease(Object obj) {
            return false;
        }

        public void setSize(Object obj, int i2, int i3) {
        }
    }

    static class EdgeEffectIcsImpl implements EdgeEffectImpl {
        EdgeEffectIcsImpl() {
        }

        public boolean draw(Object obj, Canvas canvas) {
            return EdgeEffectCompatIcs.draw(obj, canvas);
        }

        public void finish(Object obj) {
            EdgeEffectCompatIcs.finish(obj);
        }

        public boolean isFinished(Object obj) {
            return EdgeEffectCompatIcs.isFinished(obj);
        }

        public Object newEdgeEffect(Context context) {
            return EdgeEffectCompatIcs.newEdgeEffect(context);
        }

        public boolean onAbsorb(Object obj, int i2) {
            return EdgeEffectCompatIcs.onAbsorb(obj, i2);
        }

        public boolean onPull(Object obj, float f2) {
            return EdgeEffectCompatIcs.onPull(obj, f2);
        }

        public boolean onRelease(Object obj) {
            return EdgeEffectCompatIcs.onRelease(obj);
        }

        public void setSize(Object obj, int i2, int i3) {
            EdgeEffectCompatIcs.setSize(obj, i2, i3);
        }
    }

    interface EdgeEffectImpl {
        boolean draw(Object obj, Canvas canvas);

        void finish(Object obj);

        boolean isFinished(Object obj);

        Object newEdgeEffect(Context context);

        boolean onAbsorb(Object obj, int i2);

        boolean onPull(Object obj, float f2);

        boolean onRelease(Object obj);

        void setSize(Object obj, int i2, int i3);
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            IMPL = new EdgeEffectIcsImpl();
        } else {
            IMPL = new BaseEdgeEffectImpl();
        }
    }

    public EdgeEffectCompat(Context context) {
        this.mEdgeEffect = IMPL.newEdgeEffect(context);
    }

    public boolean draw(Canvas canvas) {
        return IMPL.draw(this.mEdgeEffect, canvas);
    }

    public void finish() {
        IMPL.finish(this.mEdgeEffect);
    }

    public boolean isFinished() {
        return IMPL.isFinished(this.mEdgeEffect);
    }

    public boolean onAbsorb(int i2) {
        return IMPL.onAbsorb(this.mEdgeEffect, i2);
    }

    public boolean onPull(float f2) {
        return IMPL.onPull(this.mEdgeEffect, f2);
    }

    public boolean onRelease() {
        return IMPL.onRelease(this.mEdgeEffect);
    }

    public void setSize(int i2, int i3) {
        IMPL.setSize(this.mEdgeEffect, i2, i3);
    }
}
