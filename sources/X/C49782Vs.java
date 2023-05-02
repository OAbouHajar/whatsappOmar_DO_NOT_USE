package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.2Vs  reason: invalid class name and case insensitive filesystem */
public class C49782Vs extends Drawable {
    public Bitmap A00;
    public Bitmap A01;
    public Canvas A02;
    public Canvas A03;
    public Paint A04;
    public Path A05 = null;
    public final PorterDuffXfermode A06 = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public final Drawable A07;
    public final C49762Vq A08;

    public C49782Vs(Resources.Theme theme, Resources resources, C49762Vq r5, int i2) {
        Drawable A042 = AnonymousClass00X.A04(theme, resources, i2);
        AnonymousClass00B.A06(A042);
        this.A07 = A042;
        this.A08 = r5;
        A00();
    }

    public C49782Vs(Resources resources, Bitmap bitmap, C49762Vq r5) {
        this.A07 = new BitmapDrawable(resources, bitmap);
        this.A08 = r5;
        A00();
    }

    public C49782Vs(Drawable drawable, C49762Vq r4) {
        this.A07 = drawable;
        this.A08 = r4;
        A00();
    }

    public final void A00() {
        if (!C15450qv.A01()) {
            Paint paint = new Paint();
            this.A04 = paint;
            paint.setColor(-16777216);
            this.A04.setDither(true);
            this.A04.setFilterBitmap(true);
            this.A04.setStyle(Paint.Style.FILL);
            this.A04.setAntiAlias(true);
        }
    }

    public final void A01(int i2, int i3) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Drawable drawable = this.A07;
        if (drawable instanceof BitmapDrawable) {
            this.A01 = ((BitmapDrawable) drawable).getBitmap();
        } else {
            try {
                bitmap2 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError unused) {
                bitmap2 = null;
            }
            this.A01 = bitmap2;
            if (bitmap2 != null) {
                this.A03 = new Canvas(bitmap2);
            }
        }
        try {
            bitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            bitmap = null;
        }
        this.A00 = bitmap;
        if (bitmap != null) {
            this.A02 = new Canvas(bitmap);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        this.A07.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        return this.A07.canApplyTheme();
    }

    public void clearColorFilter() {
        this.A07.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Path path = this.A05;
        if (path == null) {
            path = (Path) this.A08.apply(new RectF(copyBounds()));
            this.A05 = path;
        }
        if (C15450qv.A01() || this.A04 == null || this.A00 == null || this.A01 == null) {
            canvas.drawARGB(0, 0, 0, 0);
            int save = canvas.save();
            canvas.clipPath(this.A05);
            this.A07.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        Canvas canvas2 = this.A02;
        AnonymousClass00B.A06(canvas2);
        canvas2.drawARGB(0, 0, 0, 0);
        this.A02.drawPath(path, this.A04);
        Paint paint = this.A04;
        AnonymousClass00B.A06(paint);
        paint.setXfermode(this.A06);
        Canvas canvas3 = this.A03;
        if (canvas3 != null) {
            this.A07.draw(canvas3);
        }
        this.A02.drawBitmap(this.A01, 0.0f, 0.0f, this.A04);
        this.A04.setXfermode((Xfermode) null);
        canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
    }

    public int getAlpha() {
        return this.A07.getAlpha();
    }

    public Drawable.Callback getCallback() {
        return this.A07.getCallback();
    }

    public int getChangingConfigurations() {
        return this.A07.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        return this.A07.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        return this.A07.getConstantState();
    }

    public Drawable getCurrent() {
        return this.A07.getCurrent();
    }

    public Rect getDirtyBounds() {
        return this.A07.getDirtyBounds();
    }

    public void getHotspotBounds(Rect rect) {
        this.A07.getHotspotBounds(rect);
    }

    public int getIntrinsicHeight() {
        return this.A07.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A07.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return this.A07.getLayoutDirection();
    }

    public int getMinimumHeight() {
        return this.A07.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A07.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A07.getOpacity();
    }

    public Insets getOpticalInsets() {
        return this.A07.getOpticalInsets();
    }

    public void getOutline(Outline outline) {
        this.A07.getOutline(outline);
    }

    public boolean getPadding(Rect rect) {
        return this.A07.getPadding(rect);
    }

    public int[] getState() {
        return this.A07.getState();
    }

    public Region getTransparentRegion() {
        return this.A07.getTransparentRegion();
    }

    public void invalidateSelf() {
        this.A07.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.A07.isAutoMirrored();
    }

    public boolean isFilterBitmap() {
        return this.A07.isFilterBitmap();
    }

    public boolean isProjected() {
        return this.A07.isProjected();
    }

    public boolean isStateful() {
        return this.A07.isStateful();
    }

    public void jumpToCurrentState() {
        this.A07.jumpToCurrentState();
    }

    public Drawable mutate() {
        return this.A07.mutate();
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.A07.onLayoutDirectionChanged(i2);
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        this.A07.scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.A07.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z2) {
        this.A07.setAutoMirrored(z2);
    }

    public void setBounds(int i2, int i3, int i4, int i5) {
        this.A07.setBounds(i2, i3, i4, i5);
        this.A05 = (Path) this.A08.apply(new RectF((float) i2, (float) i3, (float) i4, (float) i5));
        if (!C15450qv.A01()) {
            A01(i4 - i2, i5 - i3);
        }
    }

    public void setBounds(Rect rect) {
        this.A07.setBounds(rect);
        this.A05 = (Path) this.A08.apply(new RectF(rect));
        if (!C15450qv.A01()) {
            A01(rect.width(), rect.height());
        }
    }

    public void setChangingConfigurations(int i2) {
        this.A07.setChangingConfigurations(i2);
    }

    @Deprecated
    public void setColorFilter(int i2, PorterDuff.Mode mode) {
        this.A07.setColorFilter(i2, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    @Deprecated
    public void setDither(boolean z2) {
        this.A07.setDither(z2);
    }

    public void setFilterBitmap(boolean z2) {
        this.A07.setFilterBitmap(z2);
    }

    public void setHotspot(float f2, float f3) {
        this.A07.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.A07.setHotspotBounds(i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.A07.setState(iArr);
    }

    public void setTint(int i2) {
        this.A07.setTint(i2);
    }

    public void setTintBlendMode(BlendMode blendMode) {
        this.A07.setTintBlendMode(blendMode);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A07.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.A07.setTintMode(mode);
    }

    public boolean setVisible(boolean z2, boolean z3) {
        return this.A07.setVisible(z2, z3);
    }

    public void unscheduleSelf(Runnable runnable) {
        this.A07.unscheduleSelf(runnable);
    }
}
