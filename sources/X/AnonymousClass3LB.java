package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.3LB  reason: invalid class name */
public class AnonymousClass3LB extends Drawable {
    public final /* synthetic */ C30011bb A00;

    public AnonymousClass3LB(C30011bb r1) {
        this.A00 = r1;
    }

    public void draw(Canvas canvas) {
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onLevelChange(int i2) {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        return true;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean setState(int[] iArr) {
        invalidateSelf();
        return true;
    }
}
