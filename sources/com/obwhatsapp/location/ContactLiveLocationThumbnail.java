package com.obwhatsapp.location;

import X.C816749h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;

public class ContactLiveLocationThumbnail extends ThumbnailButton {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public final RectF A05;

    public ContactLiveLocationThumbnail(Context context) {
        super(context);
        A02();
        this.A05 = new RectF();
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A05 = new RectF();
        A02(context, attributeSet);
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A05 = new RectF();
        A02(context, attributeSet);
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    private void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C816749h.A00);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            this.A02 = obtainStyledAttributes.getInteger(2, this.A02);
            obtainStyledAttributes.recycle();
        }
    }

    public void A04(Canvas canvas) {
        RectF rectF = this.A05;
        rectF.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f2 = this.A00;
        if (f2 > 0.0f && this.A01 != 0) {
            float f3 = f2 / 2.0f;
            rectF.inset(f3, f3);
            this.A05.setColor(this.A01);
            this.A05.setStrokeWidth(this.A00);
            this.A05.setStyle(Paint.Style.STROKE);
            float f4 = this.A02;
            int i2 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            Paint paint = this.A05;
            if (i2 >= 0) {
                canvas.drawRoundRect(rectF, f4, f4, paint);
            } else {
                canvas.drawOval(rectF, paint);
            }
            float f5 = this.A00 / 2.0f;
            rectF.inset(f5, f5);
        }
        float f6 = this.A01;
        if (f6 > 0.0f && this.A03 != 0) {
            float f7 = f6 / 2.0f;
            rectF.inset(f7, f7);
            this.A05.setColor(this.A03);
            this.A05.setStrokeWidth(this.A01);
            this.A05.setStyle(Paint.Style.STROKE);
            float f8 = this.A02;
            int i3 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
            Paint paint2 = this.A05;
            if (i3 >= 0) {
                canvas.drawRoundRect(rectF, f8, f8, paint2);
            } else {
                canvas.drawOval(rectF, paint2);
            }
            float f9 = this.A01 / 2.0f;
            rectF.inset(f9, f9);
        }
        if (this.A03) {
            this.A05.setColor(getResources().getColor(R.color.color051c));
            this.A05.setStyle(Paint.Style.FILL);
            float f10 = this.A02;
            int i4 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            Paint paint3 = this.A05;
            if (i4 >= 0) {
                canvas.drawRoundRect(rectF, f10, f10, paint3);
            } else {
                canvas.drawOval(rectF, paint3);
            }
        }
        if (this.A02 > 1) {
            this.A05.setColor(1107296256);
            this.A05.setStyle(Paint.Style.FILL);
            float f11 = this.A02;
            int i5 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            Paint paint4 = this.A05;
            if (i5 >= 0) {
                canvas.drawRoundRect(rectF, f11, f11, paint4);
            } else {
                canvas.drawOval(rectF, paint4);
            }
            this.A05.setTextAlign(Paint.Align.CENTER);
            this.A05.setColor(-1);
            this.A05.setTextSize((float) getResources().getDimensionPixelSize(R.dimen.dimen07de));
            StringBuilder sb = new StringBuilder();
            sb.append(this.A02);
            canvas.drawText(sb.toString(), rectF.centerX(), rectF.centerY() - ((this.A05.ascent() + this.A05.descent()) / 2.0f), this.A05);
        }
    }

    public void setGlowColor(int i2) {
        this.A01 = i2;
    }

    public void setGlowSize(float f2) {
        this.A00 = f2;
    }

    public void setGreyOverlay(boolean z2) {
        this.A03 = z2;
    }

    public void setStackSize(int i2) {
        this.A02 = i2;
    }
}
