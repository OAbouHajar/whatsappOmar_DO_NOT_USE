package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Ab  reason: invalid class name */
public class AnonymousClass0Ab extends Drawable {
    public float A00;
    public float A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04 = PorterDuff.Mode.SRC_IN;
    public PorterDuffColorFilter A05;
    public boolean A06 = false;
    public boolean A07 = true;
    public final Paint A08;
    public final Rect A09;
    public final RectF A0A;

    public AnonymousClass0Ab(ColorStateList colorStateList, float f2) {
        this.A01 = f2;
        this.A08 = new Paint(5);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.A02 = colorStateList;
        this.A08.setColor(colorStateList.getColorForState(getState(), this.A02.getDefaultColor()));
        this.A0A = AnonymousClass000.A0K();
        this.A09 = AnonymousClass000.A0J();
    }

    public final void A00(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.A0A;
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        Rect rect2 = this.A09;
        rect2.set(rect);
        if (this.A06) {
            float f2 = this.A00;
            float f3 = this.A01;
            boolean z2 = this.A07;
            float f4 = f2 * 1.5f;
            if (z2) {
                f4 = AnonymousClass000.A00(f4, f3);
            }
            if (z2) {
                f2 = AnonymousClass000.A00(f2, f3);
            }
            rect2.inset((int) Math.ceil((double) f2), (int) Math.ceil((double) f4));
            rectF.set(rect2);
        }
    }

    public void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.A08;
        if (this.A05 == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.A05);
            z2 = true;
        }
        RectF rectF = this.A0A;
        float f2 = this.A01;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z2) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.A09, this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r2 = this;
            android.content.res.ColorStateList r0 = r2.A03
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001b
        L_0x000a:
            android.content.res.ColorStateList r0 = r2.A02
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001b
        L_0x0014:
            boolean r1 = super.isStateful()
            r0 = 0
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ab.isStateful():boolean");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00(rect);
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.A02;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.A08;
        boolean z2 = false;
        if (colorForState != paint.getColor()) {
            z2 = true;
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.A03;
        if (colorStateList2 == null || (mode = this.A04) == null) {
            return z2;
        }
        this.A05 = new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode);
        return true;
    }

    public void setAlpha(int i2) {
        this.A08.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A03 = colorStateList;
        PorterDuff.Mode mode = this.A04;
        this.A05 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.A04 = mode;
        ColorStateList colorStateList = this.A03;
        this.A05 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        invalidateSelf();
    }
}
