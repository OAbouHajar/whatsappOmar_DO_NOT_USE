package com.obwhatsapp.components.button;

import X.AnonymousClass2QI;
import X.AnonymousClass3L8;
import X.AnonymousClass3N4;
import X.C49762Vq;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ThumbnailButton extends AnonymousClass2QI {
    public static final int A0A;
    public float A00;
    public float A01;
    public float A02 = 0.0f;
    public int A03;
    public int A04 = A0A;
    public Paint A05;
    public C49762Vq A06;
    public boolean A07;
    public final Rect A08 = new Rect();
    public final RectF A09 = new RectF();

    static {
        int i2 = Build.VERSION.SDK_INT;
        A0A = (i2 < 19 || (i2 < 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) ? 1711315455 : 419430400;
    }

    public ThumbnailButton(Context context) {
        super(context);
        A02(context, (AttributeSet) null);
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02(context, attributeSet);
    }

    private void A02(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(new AnonymousClass3L8());
        boolean z2 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0P);
            this.A02 = obtainStyledAttributes.getDimension(4, this.A02);
            this.A00 = obtainStyledAttributes.getFloat(0, this.A00);
            this.A04 = obtainStyledAttributes.getInteger(5, this.A04);
            this.A01 = obtainStyledAttributes.getDimension(2, this.A01);
            this.A03 = obtainStyledAttributes.getInteger(1, this.A03);
            this.A07 = obtainStyledAttributes.getBoolean(3, this.A07);
            if (Build.VERSION.SDK_INT >= 21) {
                z2 = obtainStyledAttributes.getBoolean(6, false);
            }
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.A05 = paint;
        paint.setAntiAlias(true);
        this.A05.setDither(true);
        this.A05.setFilterBitmap(true);
        this.A05.setColor(-1);
        if (Build.VERSION.SDK_INT >= 21 && z2) {
            setOutlineProvider(new AnonymousClass3N4());
        }
    }

    public void A04(Canvas canvas) {
        int i2;
        if (this.A01 > 0.0f && (i2 = this.A03) != 0) {
            this.A05.setColor(i2);
            this.A05.setStrokeWidth(this.A01);
            this.A05.setStyle(Paint.Style.STROKE);
            C49762Vq r1 = this.A06;
            if (r1 != null) {
                canvas.drawPath((Path) r1.apply(this.A09), this.A05);
                return;
            }
            float f2 = this.A02;
            int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            RectF rectF = this.A09;
            Paint paint = this.A05;
            if (i3 >= 0) {
                canvas.drawRoundRect(rectF, f2, f2, paint);
            } else {
                canvas.drawOval(rectF, paint);
            }
        }
    }

    public float getBorderSize() {
        return this.A01;
    }

    public int getBorderSizeAdjustment() {
        return (int) ((this.A01 + 2.0f) / 2.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a5 A[Catch:{ RuntimeException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cd A[Catch:{ RuntimeException -> 0x019f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            int r2 = r11.getBorderSizeAdjustment()
            android.graphics.RectF r6 = r11.A09
            int r0 = r11.getPaddingLeft()
            int r0 = r0 + r2
            float r0 = (float) r0
            r6.left = r0
            int r1 = r11.getWidth()
            int r0 = r11.getPaddingRight()
            int r1 = r1 - r0
            int r1 = r1 - r2
            float r0 = (float) r1
            r6.right = r0
            int r0 = r11.getPaddingTop()
            int r0 = r0 + r2
            float r0 = (float) r0
            r6.top = r0
            int r1 = r11.getHeight()
            int r0 = r11.getPaddingBottom()
            int r1 = r1 - r0
            int r1 = r1 - r2
            float r0 = (float) r1
            r6.bottom = r0
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x01a7
            android.graphics.drawable.Drawable r0 = r11.getDrawable()
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x01a7
            float r0 = r11.A02
            r10 = 0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01a7
            android.graphics.drawable.Drawable r1 = r11.getDrawable()     // Catch:{ RuntimeException -> 0x019f }
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ RuntimeException -> 0x019f }
            if (r1 == 0) goto L_0x01aa
            android.graphics.Bitmap r0 = r1.getBitmap()     // Catch:{ RuntimeException -> 0x019f }
            if (r0 == 0) goto L_0x01aa
            android.graphics.Bitmap r5 = r1.getBitmap()     // Catch:{ RuntimeException -> 0x019f }
            int r8 = r5.getWidth()     // Catch:{ RuntimeException -> 0x019f }
            int r7 = r5.getHeight()     // Catch:{ RuntimeException -> 0x019f }
            android.widget.ImageView$ScaleType r1 = r11.getScaleType()     // Catch:{ RuntimeException -> 0x019f }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ RuntimeException -> 0x019f }
            r9 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            if (r1 != r0) goto L_0x0120
            android.graphics.Rect r3 = r11.A08     // Catch:{ RuntimeException -> 0x019f }
            r3.set(r4, r4, r8, r7)     // Catch:{ RuntimeException -> 0x019f }
            float r8 = (float) r8     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r6.height()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 * r8
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r6.width()     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r0 * r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x010a
            float r2 = r6.width()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 * r1
            float r2 = r2 / r8
            float r1 = r6.top     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r6.bottom     // Catch:{ RuntimeException -> 0x019f }
            float r1 = r1 + r0
            float r1 = r1 / r9
            float r0 = r2 / r9
            float r1 = r1 - r0
            r6.top = r1     // Catch:{ RuntimeException -> 0x019f }
        L_0x008e:
            float r1 = r1 + r2
            r6.bottom = r1     // Catch:{ RuntimeException -> 0x019f }
        L_0x0091:
            android.graphics.Paint r1 = r11.A05     // Catch:{ RuntimeException -> 0x019f }
            r0 = -1
            r1.setColor(r0)     // Catch:{ RuntimeException -> 0x019f }
            android.graphics.Paint r1 = r11.A05     // Catch:{ RuntimeException -> 0x019f }
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL     // Catch:{ RuntimeException -> 0x019f }
            r1.setStyle(r0)     // Catch:{ RuntimeException -> 0x019f }
            X.2Vq r0 = r11.A06     // Catch:{ RuntimeException -> 0x019f }
            r1 = 31
            r7 = 0
            if (r0 == 0) goto L_0x00cd
            int r4 = r12.saveLayer(r6, r7, r1)     // Catch:{ RuntimeException -> 0x019f }
            X.2Vq r0 = r11.A06     // Catch:{ RuntimeException -> 0x019f }
            java.lang.Object r0 = r0.apply(r6)     // Catch:{ RuntimeException -> 0x019f }
            android.graphics.Path r0 = (android.graphics.Path) r0     // Catch:{ RuntimeException -> 0x019f }
            r12.clipPath(r0)     // Catch:{ RuntimeException -> 0x019f }
        L_0x00b4:
            android.graphics.Paint r0 = r11.A05     // Catch:{ RuntimeException -> 0x019f }
            r12.drawBitmap(r5, r3, r6, r0)     // Catch:{ RuntimeException -> 0x019f }
            X.2Vq r0 = r11.A06     // Catch:{ RuntimeException -> 0x019f }
            if (r0 != 0) goto L_0x00c3
            float r0 = r11.A02     // Catch:{ RuntimeException -> 0x019f }
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01aa
        L_0x00c3:
            android.graphics.Paint r0 = r11.A05     // Catch:{ RuntimeException -> 0x019f }
            r0.setXfermode(r7)     // Catch:{ RuntimeException -> 0x019f }
            r12.restoreToCount(r4)     // Catch:{ RuntimeException -> 0x019f }
            goto L_0x01aa
        L_0x00cd:
            float r0 = r11.A02     // Catch:{ RuntimeException -> 0x019f }
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00b4
            int r8 = r12.saveLayer(r6, r7, r1)     // Catch:{ RuntimeException -> 0x019f }
            r12.drawARGB(r4, r4, r4, r4)     // Catch:{ RuntimeException -> 0x019f }
            float r1 = r11.A02     // Catch:{ RuntimeException -> 0x019f }
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00f2
            android.graphics.Paint r0 = r11.A05     // Catch:{ RuntimeException -> 0x019f }
            r12.drawRoundRect(r6, r1, r1, r0)     // Catch:{ RuntimeException -> 0x019f }
        L_0x00e5:
            android.graphics.Paint r2 = r11.A05     // Catch:{ RuntimeException -> 0x019f }
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ RuntimeException -> 0x019f }
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode     // Catch:{ RuntimeException -> 0x019f }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x019f }
            r2.setXfermode(r0)     // Catch:{ RuntimeException -> 0x019f }
            goto L_0x0108
        L_0x00f2:
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0102
            android.graphics.Path r1 = X.C37741pe.A03(r6)     // Catch:{ RuntimeException -> 0x019f }
            android.graphics.Paint r0 = r11.A05     // Catch:{ RuntimeException -> 0x019f }
            r12.drawPath(r1, r0)     // Catch:{ RuntimeException -> 0x019f }
            goto L_0x00e5
        L_0x0102:
            android.graphics.Paint r0 = r11.A05     // Catch:{ RuntimeException -> 0x019f }
            r12.drawOval(r6, r0)     // Catch:{ RuntimeException -> 0x019f }
            goto L_0x00e5
        L_0x0108:
            r4 = r8
            goto L_0x00b4
        L_0x010a:
            float r2 = r6.height()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 * r8
            float r2 = r2 / r1
            float r1 = r6.left     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r6.right     // Catch:{ RuntimeException -> 0x019f }
            float r1 = r1 + r0
            float r1 = r1 / r9
            float r0 = r2 / r9
            float r1 = r1 - r0
            r6.left = r1     // Catch:{ RuntimeException -> 0x019f }
            float r1 = r1 + r2
            r6.right = r1     // Catch:{ RuntimeException -> 0x019f }
            goto L_0x0091
        L_0x0120:
            android.widget.ImageView$ScaleType r1 = r11.getScaleType()     // Catch:{ RuntimeException -> 0x019f }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ RuntimeException -> 0x019f }
            android.graphics.Rect r3 = r11.A08     // Catch:{ RuntimeException -> 0x019f }
            if (r1 != r0) goto L_0x0146
            r3.set(r4, r4, r8, r7)     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r6.centerX()     // Catch:{ RuntimeException -> 0x019f }
            float r1 = (float) r8     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r1 / r9
            float r2 = r2 - r0
            r6.left = r2     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 + r1
            r6.right = r2     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r6.centerY()     // Catch:{ RuntimeException -> 0x019f }
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r1 / r9
            float r2 = r2 - r0
            r6.top = r2     // Catch:{ RuntimeException -> 0x019f }
            goto L_0x008e
        L_0x0146:
            r3.set(r4, r4, r8, r7)     // Catch:{ RuntimeException -> 0x019f }
            float r2 = (float) r8     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r6.height()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 * r0
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r6.width()     // Catch:{ RuntimeException -> 0x019f }
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x017c
            int r0 = r3.height()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = (float) r0     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r6.width()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 * r0
            float r0 = r6.height()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 / r0
            int r1 = r3.left     // Catch:{ RuntimeException -> 0x019f }
            int r0 = r3.right     // Catch:{ RuntimeException -> 0x019f }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ RuntimeException -> 0x019f }
            float r1 = r1 / r9
            float r0 = r2 / r9
            float r1 = r1 - r0
            int r0 = (int) r1     // Catch:{ RuntimeException -> 0x019f }
            r3.left = r0     // Catch:{ RuntimeException -> 0x019f }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r0 + r2
            int r0 = (int) r0     // Catch:{ RuntimeException -> 0x019f }
            r3.right = r0     // Catch:{ RuntimeException -> 0x019f }
            goto L_0x0091
        L_0x017c:
            int r0 = r3.width()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = (float) r0     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r6.height()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 * r0
            float r0 = r6.width()     // Catch:{ RuntimeException -> 0x019f }
            float r2 = r2 / r0
            int r1 = r3.top     // Catch:{ RuntimeException -> 0x019f }
            int r0 = r3.bottom     // Catch:{ RuntimeException -> 0x019f }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ RuntimeException -> 0x019f }
            float r1 = r1 / r9
            float r0 = r2 / r9
            float r1 = r1 - r0
            int r0 = (int) r1     // Catch:{ RuntimeException -> 0x019f }
            r3.top = r0     // Catch:{ RuntimeException -> 0x019f }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x019f }
            float r0 = r0 + r2
            int r0 = (int) r0     // Catch:{ RuntimeException -> 0x019f }
            r3.bottom = r0     // Catch:{ RuntimeException -> 0x019f }
            goto L_0x0091
        L_0x019f:
            r1 = move-exception
            java.lang.String r0 = "thumbnailbutton/"
            X.C53122f3.A00(r11, r0)
            throw r1
        L_0x01a7:
            super.onDraw(r12)
        L_0x01aa:
            r11.A04(r12)
            boolean r0 = r11.isEnabled()
            if (r0 == 0) goto L_0x01eb
            boolean r0 = r11.isSelected()
            if (r0 != 0) goto L_0x01bf
            boolean r0 = r11.isPressed()
            if (r0 == 0) goto L_0x01eb
        L_0x01bf:
            android.graphics.Paint r1 = r11.A05
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            android.graphics.Paint r1 = r11.A05
            int r0 = r11.A04
            r1.setColor(r0)
            X.2Vq r0 = r11.A06
            if (r0 == 0) goto L_0x01ec
            r1 = 0
            r0 = 31
            int r1 = r12.saveLayer(r6, r1, r0)
            X.2Vq r0 = r11.A06
            java.lang.Object r0 = r0.apply(r6)
            android.graphics.Path r0 = (android.graphics.Path) r0
            r12.clipPath(r0)
            android.graphics.Paint r0 = r11.A05
            r12.drawRect(r6, r0)
            r12.restoreToCount(r1)
        L_0x01eb:
            return
        L_0x01ec:
            float r1 = r11.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01f9
            android.graphics.Paint r0 = r11.A05
            r12.drawRoundRect(r6, r1, r1, r0)
            return
        L_0x01f9:
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0209
            android.graphics.Path r1 = X.C37741pe.A03(r6)
            android.graphics.Paint r0 = r11.A05
            r12.drawPath(r1, r0)
            return
        L_0x0209:
            android.graphics.Paint r0 = r11.A05
            r12.drawOval(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.components.button.ThumbnailButton.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i2, int i3) {
        if (this.A00 == 1.0f) {
            int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i2);
            setMeasuredDimension(defaultSize, defaultSize);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setBorderColor(int i2) {
        this.A03 = i2;
    }

    public void setBorderSize(float f2) {
        this.A01 = f2;
    }

    public void setClipPathProducer(C49762Vq r1) {
        this.A06 = r1;
    }

    public void setCornerRadius(float f2) {
        this.A02 = f2;
    }

    public void setForegroundOnly(boolean z2) {
        this.A07 = z2;
    }
}
