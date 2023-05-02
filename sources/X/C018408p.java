package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.08p  reason: invalid class name and case insensitive filesystem */
public class C018408p extends Drawable implements Drawable.Callback {
    public Drawable A00;

    public C018408p(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A00 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.A00.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.A00.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.A00.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A00.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A00.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.A00.getPadding(rect);
    }

    public int[] getState() {
        return this.A00.getState();
    }

    public Region getTransparentRegion() {
        return this.A00.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C018208n.A0F(this.A00);
    }

    public boolean isStateful() {
        return this.A00.isStateful();
    }

    public void jumpToCurrentState() {
        this.A00.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.A00.setBounds(rect);
    }

    public boolean onLevelChange(int i2) {
        return this.A00.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.A00.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z2) {
        C018208n.A0C(this.A00, z2);
    }

    public void setChangingConfigurations(int i2) {
        this.A00.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public void setDither(boolean z2) {
        this.A00.setDither(z2);
    }

    public void setFilterBitmap(boolean z2) {
        this.A00.setFilterBitmap(z2);
    }

    public void setHotspot(float f2, float f3) {
        C018208n.A09(this.A00, f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        C018208n.A0B(this.A00, i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.A00.setState(iArr);
    }

    public void setTint(int i2) {
        C018208n.A0A(this.A00, i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        C018208n.A04(colorStateList, this.A00);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C018208n.A07(mode, this.A00);
    }

    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.A00.setVisible(z2, z3);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
