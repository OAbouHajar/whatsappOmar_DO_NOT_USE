package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.2zq  reason: invalid class name and case insensitive filesystem */
public class C60032zq extends C55382jV {
    public float A00 = 15.0f;
    public int A01 = 3;
    public int A02 = -1728053248;
    public int A03 = -1;
    public int A04 = 17;
    public Paint A05;
    public Rect A06;
    public RectF A07;
    public Drawable A08;
    public TextPaint A09;
    public CharSequence A0A;

    public C60032zq(Context context) {
        super(context);
    }

    public void A04(Canvas canvas) {
        float f2;
        Canvas canvas2 = canvas;
        super.A04(canvas2);
        if (!TextUtils.isEmpty(this.A0A)) {
            if (this.A05 == null) {
                Paint A052 = C13700nu.A05();
                this.A05 = A052;
                A052.setAntiAlias(true);
                this.A05.setStyle(Paint.Style.FILL);
                this.A05.setColor(this.A02);
            }
            if (this.A09 == null) {
                TextPaint textPaint = new TextPaint();
                this.A09 = textPaint;
                textPaint.setAntiAlias(true);
                this.A09.setColor(this.A03);
                this.A09.setTextSize(this.A00);
                this.A09.setTextAlign(Paint.Align.CENTER);
            }
            if (this.A07 == null) {
                this.A07 = AnonymousClass000.A0K();
            }
            if (this.A06 == null) {
                this.A06 = AnonymousClass000.A0J();
            }
            float f3 = this.A00;
            float f4 = f3 * 1.25f;
            float f5 = f4 - f3;
            Path A0I = AnonymousClass000.A0I();
            RectF rectF = this.A09;
            A0I.moveTo(rectF.left, rectF.bottom - f4);
            A0I.lineTo(rectF.right, rectF.bottom - f4);
            A0I.lineTo(rectF.right, rectF.bottom - this.A02);
            RectF rectF2 = this.A07;
            float f6 = rectF.right;
            float f7 = this.A02 * 2.0f;
            float f8 = rectF.bottom;
            rectF2.set(f6 - f7, f8 - f7, f6, f8);
            A0I.arcTo(this.A07, 0.0f, 90.0f);
            A0I.lineTo(rectF.left + this.A02, rectF.bottom);
            RectF rectF3 = this.A07;
            float f9 = rectF.left;
            float f10 = rectF.bottom;
            float f11 = this.A02 * 2.0f;
            rectF3.set(f9, f10 - f11, f11 + f9, f10);
            A0I.arcTo(this.A07, 90.0f, 90.0f);
            A0I.lineTo(rectF.left, rectF.bottom - f4);
            canvas2.drawPath(A0I, this.A05);
            String charSequence = TextUtils.ellipsize(this.A0A, this.A09, rectF.width() - this.A02, TextUtils.TruncateAt.END).toString();
            TextPaint textPaint2 = this.A09;
            int length = charSequence.length();
            textPaint2.getTextBounds(charSequence, 0, length, this.A06);
            int i2 = this.A04;
            if (i2 != 3) {
                float f12 = rectF.right;
                if (i2 != 5) {
                    f2 = (f12 + rectF.left) / 2.0f;
                } else {
                    Rect rect = this.A06;
                    f2 = (f12 - ((float) ((rect.right - rect.left) >> 1))) - f5;
                }
            } else {
                float f13 = rectF.left;
                Rect rect2 = this.A06;
                f2 = f13 + ((float) ((rect2.right - rect2.left) >> 1)) + f5;
            }
            canvas2.drawText(charSequence, 0, length, f2, ((rectF.bottom - (f4 / 2.0f)) + (this.A00 / 2.0f)) - (this.A09.descent() / 2.0f), this.A09);
            Drawable drawable = this.A08;
            if (drawable != null) {
                float intrinsicWidth = (((float) drawable.getIntrinsicWidth()) * this.A00) / ((float) this.A08.getIntrinsicHeight());
                int i3 = (int) (this.A01 != 5 ? rectF.left + f5 + this.A02 : ((rectF.right - f5) - this.A02) - intrinsicWidth);
                Drawable drawable2 = this.A08;
                float f14 = rectF.bottom;
                float f15 = f14 - f4;
                float f16 = (f4 - this.A00) / 2.0f;
                drawable2.setBounds(i3, (int) (f15 + f16), (int) (((float) i3) + intrinsicWidth), (int) (f14 - f16));
                this.A08.draw(canvas2);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A08 = drawable;
    }

    public void setIconGravity(int i2) {
        this.A01 = i2;
    }

    public void setText(CharSequence charSequence) {
        this.A0A = charSequence;
    }

    public void setTextBackgroundColor(int i2) {
        this.A02 = i2;
    }

    public void setTextColor(int i2) {
        this.A03 = i2;
    }

    public void setTextGravity(int i2) {
        this.A04 = i2;
    }

    public void setTextSize(float f2) {
        this.A00 = f2;
    }
}
