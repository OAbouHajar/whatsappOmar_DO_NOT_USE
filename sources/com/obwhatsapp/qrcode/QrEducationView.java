package com.obwhatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass2SR;
import X.C13690nt;
import X.C13700nu;
import X.C52662eE;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.obwhatsapp.R;

public class QrEducationView extends View implements AnonymousClass006 {
    public float A00;
    public float A01;
    public int A02;
    public ValueAnimator A03;
    public Paint A04;
    public RectF A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public Drawable A0A;
    public C52662eE A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public QrEducationView(Context context) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            generatedComponent();
        }
        this.A0D = false;
        this.A0E = true;
        this.A05 = AnonymousClass000.A0K();
        A02(context);
    }

    public QrEducationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A0D = false;
        this.A0E = true;
        this.A05 = AnonymousClass000.A0K();
        A02(context);
    }

    public QrEducationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0C) {
            this.A0C = true;
            generatedComponent();
        }
        this.A0D = false;
        this.A0E = true;
        this.A05 = AnonymousClass000.A0K();
        A02(context);
    }

    public QrEducationView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            generatedComponent();
        }
    }

    public static float A00(float f2, float f3, float f4, float f5, float f6) {
        return f5 + ((f6 - f5) * (f4 <= f2 ? 0.0f : f4 >= f3 ? 1.0f : (f4 - f2) / (f3 - f2)));
    }

    public final void A01() {
        if (this.A03 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.A03 = ofFloat;
            ofFloat.setDuration(8000);
            this.A03.setRepeatCount(-1);
            this.A03.setInterpolator(new LinearInterpolator());
            C13690nt.A0p(this.A03, this, 9);
        }
        this.A03.start();
    }

    public final void A02(Context context) {
        Resources resources = context.getResources();
        this.A0A = resources.getDrawable(R.drawable.anim_qr_normal);
        this.A09 = resources.getDrawable(R.drawable.anim_qr_blurred);
        this.A07 = resources.getDrawable(R.drawable.anim_laptop);
        this.A08 = resources.getDrawable(R.drawable.anim_phone);
        this.A06 = AnonymousClass2SR.A02(context, R.drawable.anim_frame, R.color.color0670);
        int A002 = AnonymousClass00T.A00(context, R.color.color066d);
        this.A02 = AnonymousClass00T.A00(context, R.color.color066e);
        Paint A052 = C13700nu.A05();
        this.A04 = A052;
        A052.setAntiAlias(true);
        this.A04.setColor(A002);
        this.A01 = getResources().getDimension(R.dimen.dimen020e);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0B;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A01();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.A03 = null;
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int i2;
        int i3;
        int width = getWidth();
        int height = getHeight();
        Canvas canvas2 = canvas;
        canvas2.translate((float) (width >> 1), (float) (height >> 1));
        if (this.A08.getIntrinsicHeight() + (this.A08.getIntrinsicWidth() / 3) > height) {
            float intrinsicHeight = ((float) height) / ((float) (this.A08.getIntrinsicHeight() + (this.A08.getIntrinsicWidth() / 3)));
            canvas2.scale(intrinsicHeight, intrinsicHeight);
        }
        float f2 = this.A00;
        if (f2 < 0.14f) {
            f2 = (f2 * f2) / 0.14f;
        } else if (f2 >= 0.2f && f2 < 0.3f) {
            f2 = ((float) (Math.sqrt((double) (f2 - 0.2f)) * Math.sqrt(0.10000000894069672d))) + 0.2f;
        }
        if (this.A0E) {
            this.A07.setAlpha(MotionEventCompat.ACTION_MASK);
            int intrinsicWidth = (int) ((((float) this.A07.getIntrinsicWidth()) * 1.0f) / 2.0f);
            int intrinsicHeight2 = (int) ((((float) this.A07.getIntrinsicHeight()) * 1.0f) / 2.0f);
            this.A07.setBounds(-intrinsicWidth, -intrinsicHeight2, intrinsicWidth, intrinsicHeight2);
            drawable = this.A07;
        } else {
            int intrinsicWidth2 = (int) ((((float) this.A0A.getIntrinsicWidth()) / 2.0f) * 1.3f);
            int intrinsicHeight3 = (int) ((((float) this.A0A.getIntrinsicHeight()) / 2.0f) * 1.3f);
            RectF rectF = this.A05;
            int i4 = intrinsicWidth2 << 1;
            rectF.left = (float) (-i4);
            rectF.top = (float) (intrinsicHeight3 * -2);
            rectF.bottom = (float) (intrinsicHeight3 << 1);
            rectF.right = (float) i4;
            float f3 = this.A01;
            canvas2.drawRoundRect(rectF, f3, f3, this.A04);
            this.A0A.setBounds(-intrinsicWidth2, -intrinsicHeight3, intrinsicWidth2, intrinsicHeight3);
            this.A0A.setColorFilter(this.A02, PorterDuff.Mode.SRC_IN);
            this.A0A.setAlpha(MotionEventCompat.ACTION_MASK);
            drawable = this.A0A;
        }
        drawable.draw(canvas2);
        float intrinsicWidth3 = (float) (this.A08.getIntrinsicWidth() >> 1);
        float intrinsicHeight4 = (float) (this.A08.getIntrinsicHeight() >> 1);
        float f4 = (-intrinsicWidth3) - ((intrinsicWidth3 * 3.0f) / 4.0f);
        float sin = (((float) Math.sin((double) (f2 < 0.14f ? A00(0.0f, 0.14f, f2, 0.0f, 1.2566371f) : A00(0.14f, 0.2f, f2, 1.2566371f, 1.5707964f)))) * intrinsicWidth3) + f4;
        float f5 = intrinsicWidth3 / 6.0f;
        int i5 = (int) intrinsicWidth3;
        int i6 = (int) sin;
        int i7 = (int) intrinsicHeight4;
        int i8 = (int) f5;
        this.A08.setBounds((-i5) - i6, (-i7) + i8, i5 - i6, i7 + i8);
        this.A08.draw(canvas2);
        int i9 = this.A08.getBounds().left;
        int i10 = this.A08.getBounds().right;
        int i11 = (i10 - i9) / 7;
        canvas2.clipRect(i9 + i11, this.A08.getBounds().top, i10 - i11, this.A08.getBounds().bottom);
        float intrinsicWidth4 = (float) (this.A0A.getIntrinsicWidth() >> 1);
        float intrinsicHeight5 = (float) (this.A0A.getIntrinsicHeight() >> 1);
        float intrinsicWidth5 = (float) (this.A09.getIntrinsicWidth() >> 1);
        float intrinsicHeight6 = (float) (this.A09.getIntrinsicHeight() >> 1);
        float sin2 = sin - ((sin - (f4 + (((float) Math.sin(1.5707963267948966d)) * intrinsicWidth3))) / 3.0f);
        int i12 = (int) intrinsicWidth4;
        int i13 = (int) sin2;
        int i14 = (int) intrinsicHeight5;
        int i15 = (int) (f5 - (intrinsicHeight4 / 8.0f));
        this.A0A.setBounds((-i12) - i13, (-i14) + i15, i12 - i13, i14 + i15);
        int i16 = (int) intrinsicWidth5;
        int i17 = (int) intrinsicHeight6;
        this.A09.setBounds((-i16) - i13, (-i17) + i15, i16 - i13, i17 + i15);
        if (f2 > 0.2f) {
            i3 = (int) A00(0.2f, 0.3f, f2, 0.0f, 255.0f);
            i2 = (int) A00(0.2f, 0.3f, f2, 255.0f, 0.0f);
        } else {
            i2 = MotionEventCompat.ACTION_MASK;
            i3 = 0;
        }
        this.A0A.setColorFilter((ColorFilter) null);
        this.A0A.setAlpha(i3);
        this.A09.setAlpha(i2);
        this.A0A.draw(canvas2);
        this.A09.draw(canvas2);
        this.A06.setAlpha(((int) (Math.sin((double) (this.A00 * 30.0f)) * 127.0d)) + 127);
        int intrinsicWidth6 = (int) (((float) this.A06.getIntrinsicWidth()) / 2.0f);
        int intrinsicHeight7 = (int) (((float) this.A06.getIntrinsicHeight()) / 2.0f);
        this.A06.setBounds((-intrinsicWidth6) - i6, (-intrinsicHeight7) + i15, intrinsicWidth6 - i6, intrinsicHeight7 + i15);
        this.A06.draw(canvas2);
        canvas2.translate((float) ((-width) >> 1), (float) ((-height) >> 1));
    }

    public void onMeasure(int i2, int i3) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i2), View.getDefaultSize(getSuggestedMinimumHeight(), i3));
        setMeasuredDimension(min, min);
    }

    public void onVisibilityChanged(View view, int i2) {
        if (getVisibility() == 0) {
            A01();
            return;
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.A03 = null;
    }

    public void setShowLaptop(boolean z2) {
        this.A0E = z2;
    }
}
