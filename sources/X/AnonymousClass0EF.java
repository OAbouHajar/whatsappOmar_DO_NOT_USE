package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0EF  reason: invalid class name */
public class AnonymousClass0EF extends C019108x {
    public static Method A00;

    public AnonymousClass0EF(Resources resources, C019308z r2) {
        super(resources, r2);
        A00();
    }

    public AnonymousClass0EF(Drawable drawable) {
        super(drawable);
        A00();
    }

    public static final void A00() {
        if (A00 == null) {
            try {
                A00 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    public boolean A01() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.A02;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.A02.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.A02.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.A02;
        if (!(drawable == null || (method = A00) == null)) {
            try {
                return AnonymousClass000.A1Z(drawable, method, new Object[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    public void setHotspot(float f2, float f3) {
        this.A02.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.A02.setHotspotBounds(i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i2) {
        if (A01()) {
            super.setTint(i2);
        } else {
            this.A02.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (A01()) {
            super.setTintList(colorStateList);
        } else {
            this.A02.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (A01()) {
            super.setTintMode(mode);
        } else {
            this.A02.setTintMode(mode);
        }
    }
}
