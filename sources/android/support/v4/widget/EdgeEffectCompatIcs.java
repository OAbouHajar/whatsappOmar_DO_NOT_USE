package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class EdgeEffectCompatIcs {
    EdgeEffectCompatIcs() {
    }

    public static boolean draw(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    public static void finish(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    public static boolean isFinished(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    public static Object newEdgeEffect(Context context) {
        return new EdgeEffect(context);
    }

    public static boolean onAbsorb(Object obj, int i2) {
        ((EdgeEffect) obj).onAbsorb(i2);
        return true;
    }

    public static boolean onPull(Object obj, float f2) {
        ((EdgeEffect) obj).onPull(f2);
        return true;
    }

    public static boolean onRelease(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }

    public static void setSize(Object obj, int i2, int i3) {
        ((EdgeEffect) obj).setSize(i2, i3);
    }
}
