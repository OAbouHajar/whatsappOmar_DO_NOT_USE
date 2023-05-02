package com.obwhatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass07V;
import X.AnonymousClass3NK;
import X.AnonymousClass4BW;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C52662eE;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public class QrScannerOverlay extends View implements AnonymousClass006 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public AnonymousClass3NK A05;
    public C52662eE A06;
    public String A07;
    public boolean A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Rect A0G;
    public final RectF A0H;

    public QrScannerOverlay(Context context) {
        this(context, (AttributeSet) null);
    }

    public QrScannerOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QrScannerOverlay(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A08) {
            this.A08 = true;
            generatedComponent();
        }
        this.A0E = C13700nu.A06(1);
        this.A0G = AnonymousClass000.A0J();
        this.A0H = AnonymousClass000.A0K();
        this.A01 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0B);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        this.A0D = i3;
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.A07 = context.getString(resourceId);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        }
        obtainStyledAttributes.recycle();
        this.A0A = getResources().getDimension(R.dimen.dimen0091);
        this.A09 = getResources().getDimension(R.dimen.dimen020e);
        this.A0C = AnonymousClass00T.A00(context, R.color.color066f);
        this.A0B = AnonymousClass00T.A00(context, R.color.color0671);
        if (i3 == 1) {
            this.A00 = 0.0125f;
            AnonymousClass07V A012 = AnonymousClass07V.A01((Resources.Theme) null, getResources(), R.drawable.vec_ic_qr_frame);
            AnonymousClass00B.A06(A012);
            this.A04 = A012;
            A012.setBounds(0, 0, A012.getIntrinsicWidth(), this.A04.getIntrinsicHeight());
        } else {
            this.A00 = 0.01f;
        }
        Paint A062 = C13700nu.A06(1);
        this.A0F = A062;
        A062.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass3NK r2 = new AnonymousClass3NK(this);
        this.A05 = r2;
        r2.setDuration(2000);
        this.A05.setRepeatCount(-1);
        this.A05.setRepeatMode(2);
        startAnimation(this.A05);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onDraw(Canvas canvas) {
        int A042 = C13680ns.A04(this);
        int A032 = C13680ns.A03(this);
        int min = (Math.min(A042, A032) * 3) >> 2;
        int paddingLeft = ((A042 - min) >> 1) + getPaddingLeft();
        int paddingTop = ((A032 - min) >> 1) + getPaddingTop();
        int i2 = paddingLeft + min;
        int i3 = min + paddingTop;
        float f2 = this.A01;
        float f3 = this.A00;
        float f4 = f2 + f3;
        this.A01 = f4;
        if (f4 > 1.0f || f4 < 0.0f) {
            if (f4 > 1.0f) {
                this.A01 = 1.0f;
            } else {
                this.A01 = 0.0f;
            }
            this.A00 = -f3;
        }
        Canvas canvas2 = canvas;
        canvas2.drawColor(this.A0B);
        RectF rectF = this.A0H;
        float f5 = (float) paddingLeft;
        float f6 = (float) paddingTop;
        float f7 = (float) i3;
        rectF.set(f5, f6, (float) i2, f7);
        if (this.A0D == 0) {
            canvas2.drawArc(rectF, 0.0f, 360.0f, true, this.A0F);
            Paint paint = this.A0E;
            C13690nt.A0y(paint);
            paint.setColor(this.A0C);
            paint.setAlpha(127);
            float f8 = this.A0A * 2.0f;
            paint.setStrokeWidth(f8);
            int i4 = (int) (f6 + f8);
            i3 = (int) (f7 - f8);
            float f9 = this.A01;
            float f10 = (f9 * 2.0f) - 1.0f;
            float f11 = (float) ((paddingLeft + i2) >> 1);
            float sqrt = (((float) (i2 - paddingLeft)) * ((float) Math.sqrt((double) (1.0f - (f10 * f10))))) / 2.0f;
            float f12 = (((float) (i3 - i4)) * f9) + ((float) i4);
            canvas2.drawLine(f11 - sqrt, f12, sqrt + f11, f12, paint);
        } else {
            float f13 = this.A09;
            canvas2.drawRoundRect(rectF, f13, f13, this.A0F);
            Drawable drawable = this.A04;
            drawable.setAlpha((int) (this.A01 * 255.0f));
            canvas2.save();
            canvas2.translate(f5, f6);
            drawable.draw(canvas2);
            canvas2.translate((float) (i2 - paddingLeft), 0.0f);
            canvas2.rotate(90.0f);
            drawable.draw(canvas2);
            canvas2.rotate(-90.0f);
            canvas2.translate(0.0f, (float) (i3 - paddingTop));
            canvas2.rotate(180.0f);
            drawable.draw(canvas2);
            canvas2.rotate(-180.0f);
            canvas2.translate((float) (paddingLeft - i2), 0.0f);
            canvas2.rotate(270.0f);
            drawable.draw(canvas2);
            canvas2.restore();
        }
        String str = this.A07;
        if (str != null) {
            Paint paint2 = this.A0E;
            C13690nt.A0n(-1, paint2);
            paint2.setTextSize((float) this.A02);
            int length = str.length();
            Rect rect = this.A0G;
            paint2.getTextBounds(str, 0, length, rect);
            canvas2.drawText(str, ((float) (A042 - rect.width())) / 2.0f, (float) (i3 + this.A03 + (rect.height() >> 1)), paint2);
        }
    }

    public void onVisibilityChanged(View view, int i2) {
        AnonymousClass3NK r0;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A05) != null) {
            startAnimation(r0);
        }
    }
}
