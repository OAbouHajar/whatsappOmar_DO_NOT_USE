package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Ac  reason: invalid class name and case insensitive filesystem */
public abstract class C02170Ac extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03 = 119;
    public int A04 = 160;
    public boolean A05 = true;
    public boolean A06;
    public final Bitmap A07;
    public final BitmapShader A08;
    public final Matrix A09 = AnonymousClass000.A0H();
    public final Paint A0A = new Paint(3);
    public final Rect A0B = AnonymousClass000.A0J();
    public final RectF A0C = AnonymousClass000.A0K();

    public C02170Ac(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.A04 = resources.getDisplayMetrics().densityDpi;
        }
        this.A07 = bitmap;
        int i2 = this.A04;
        this.A02 = bitmap.getScaledWidth(i2);
        this.A01 = bitmap.getScaledHeight(i2);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A08 = new BitmapShader(bitmap, tileMode, tileMode);
    }

    public void A00() {
        Rect rect;
        if (this.A05) {
            if (this.A06) {
                int min = Math.min(this.A02, this.A01);
                int i2 = this.A03;
                Rect bounds = getBounds();
                rect = this.A0B;
                A01(i2, min, min, bounds, rect);
                int min2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - min2) >> 1), Math.max(0, (rect.height() - min2) >> 1));
                this.A00 = ((float) min2) * 0.5f;
            } else {
                int i3 = this.A03;
                int i4 = this.A02;
                int i5 = this.A01;
                Rect bounds2 = getBounds();
                rect = this.A0B;
                A01(i3, i4, i5, bounds2, rect);
            }
            RectF rectF = this.A0C;
            rectF.set(rect);
            BitmapShader bitmapShader = this.A08;
            if (bitmapShader != null) {
                Matrix matrix = this.A09;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.A07;
                matrix.preScale(width / ((float) bitmap.getWidth()), rectF.height() / ((float) bitmap.getHeight()));
                bitmapShader.setLocalMatrix(matrix);
                this.A0A.setShader(bitmapShader);
            }
            this.A05 = false;
        }
    }

    public abstract void A01(int i2, int i3, int i4, Rect rect, Rect rect2);

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.A07;
        if (bitmap != null) {
            A00();
            Paint paint = this.A0A;
            if (paint.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.A0B, paint);
                return;
            }
            RectF rectF = this.A0C;
            float f2 = this.A00;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public int getAlpha() {
        return this.A0A.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.A0A.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.A01;
    }

    public int getIntrinsicWidth() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getOpacity() {
        /*
            r3 = this;
            int r1 = r3.A03
            r2 = -3
            r0 = 119(0x77, float:1.67E-43)
            if (r1 != r0) goto L_0x0029
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0029
            android.graphics.Bitmap r0 = r3.A07
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L_0x0029
            android.graphics.Paint r0 = r3.A0A
            int r1 = r0.getAlpha()
            r0 = 255(0xff, float:3.57E-43)
            if (r1 < r0) goto L_0x0029
            float r1 = r3.A00
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            r2 = -1
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02170Ac.getOpacity():int");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.A06) {
            this.A00 = (float) (Math.min(this.A01, this.A02) >> 1);
        }
        this.A05 = true;
    }

    public void setAlpha(int i2) {
        Paint paint = this.A0A;
        if (i2 != paint.getAlpha()) {
            paint.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z2) {
        this.A0A.setDither(z2);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z2) {
        this.A0A.setFilterBitmap(z2);
        invalidateSelf();
    }
}
