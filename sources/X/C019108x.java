package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.08x  reason: invalid class name and case insensitive filesystem */
public class C019108x extends Drawable implements Drawable.Callback, AnonymousClass07X, C019208y {
    public static final PorterDuff.Mode A06 = PorterDuff.Mode.SRC_IN;
    public int A00;
    public PorterDuff.Mode A01;
    public Drawable A02;
    public C019308z A03;
    public boolean A04;
    public boolean A05;

    public C019108x(Resources resources, C019308z r3) {
        this.A03 = r3;
        Drawable.ConstantState constantState = r3.A03;
        if (constantState != null) {
            Af2(constantState.newDrawable(resources));
        }
    }

    public C019108x(Drawable drawable) {
        this.A03 = new C019308z(this.A03);
        Af2(drawable);
    }

    public final boolean A00(int[] iArr) {
        if (A01()) {
            C019308z r0 = this.A03;
            ColorStateList colorStateList = r0.A01;
            PorterDuff.Mode mode = r0.A02;
            if (colorStateList == null || mode == null) {
                this.A04 = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!(this.A04 && colorForState == this.A00 && mode == this.A01)) {
                    setColorFilter(colorForState, mode);
                    this.A00 = colorForState;
                    this.A01 = mode;
                    this.A04 = true;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A01() {
        return true;
    }

    public final void Af2(Drawable drawable) {
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A02 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C019308z r1 = this.A03;
            if (r1 != null) {
                r1.A03 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.A02.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C019308z r0 = this.A03;
        return changingConfigurations | (r0 != null ? r0.getChangingConfigurations() : 0) | this.A02.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C019308z r1 = this.A03;
        if (r1 == null || r1.A03 == null) {
            return null;
        }
        r1.A00 = getChangingConfigurations();
        return this.A03;
    }

    public Drawable getCurrent() {
        return this.A02.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.A02.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A02.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C018208n.A01(this.A02);
    }

    public int getMinimumHeight() {
        return this.A02.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A02.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A02.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.A02.getPadding(rect);
    }

    public int[] getState() {
        return this.A02.getState();
    }

    public Region getTransparentRegion() {
        return this.A02.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C018208n.A0F(this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (r0 = r2.A03).A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r2 = this;
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0014
            X.08z r0 = r2.A03
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r0 = r0.A01
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001d
        L_0x0014:
            android.graphics.drawable.Drawable r0 = r2.A02
            boolean r1 = r0.isStateful()
            r0 = 0
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019108x.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.A02.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.A05 && super.mutate() == this) {
            this.A03 = new C019308z(this.A03);
            Drawable drawable = this.A02;
            if (drawable != null) {
                drawable.mutate();
            }
            C019308z r1 = this.A03;
            if (r1 != null) {
                Drawable drawable2 = this.A02;
                r1.A03 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.A05 = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return C018208n.A0D(i2, this.A02);
    }

    public boolean onLevelChange(int i2) {
        return this.A02.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.A02.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z2) {
        C018208n.A0C(this.A02, z2);
    }

    public void setChangingConfigurations(int i2) {
        this.A02.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public void setDither(boolean z2) {
        this.A02.setDither(z2);
    }

    public void setFilterBitmap(boolean z2) {
        this.A02.setFilterBitmap(z2);
    }

    public boolean setState(int[] iArr) {
        return A00(iArr) || this.A02.setState(iArr);
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A03.A01 = colorStateList;
        A00(this.A02.getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.A03.A02 = mode;
        A00(this.A02.getState());
    }

    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.A02.setVisible(z2, z3);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
