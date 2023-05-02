package com.obwhatsapp.status.playback.widget;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C13680ns;
import X.C13690nt;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.obwhatsapp.R;

public class AudioVolumeView extends View implements AnonymousClass006 {
    public float A00;
    public C52662eE A01;
    public boolean A02;
    public final Paint A03;
    public final Path A04;
    public final RectF A05;

    public AudioVolumeView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A03 = C13680ns.A0E();
        this.A05 = AnonymousClass000.A0K();
        this.A04 = AnonymousClass000.A0I();
        A00(context);
    }

    public AudioVolumeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A03 = C13680ns.A0E();
        this.A05 = AnonymousClass000.A0K();
        this.A04 = AnonymousClass000.A0I();
        A00(context);
    }

    public AudioVolumeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A03 = C13680ns.A0E();
        this.A05 = AnonymousClass000.A0K();
        this.A04 = AnonymousClass000.A0I();
        A00(context);
    }

    public AudioVolumeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A03 = C13680ns.A0E();
        this.A05 = AnonymousClass000.A0K();
        this.A04 = AnonymousClass000.A0I();
        A00(context);
    }

    public AudioVolumeView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final void A00(Context context) {
        Paint paint = this.A03;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        C13690nt.A0y(paint);
        paint.setColor(-1);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.dimen0089));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        float A032 = (float) C13680ns.A03(this);
        float f2 = 1.5f * A032;
        RectF rectF = this.A05;
        rectF.set(0.0f, (A032 - f2) / 2.0f, f2, (A032 + f2) / 2.0f);
        canvas2.translate((float) getPaddingLeft(), (float) getPaddingTop());
        Paint paint = this.A03;
        float strokeWidth = paint.getStrokeWidth();
        Path path = this.A04;
        path.reset();
        float f3 = A032 / 3.0f;
        path.moveTo(strokeWidth, f3);
        path.lineTo(f3, f3);
        float f4 = (A032 * 2.0f) / 3.0f;
        path.lineTo(f4, strokeWidth + 0.0f);
        path.lineTo(f4, A032 - strokeWidth);
        path.lineTo(f3, f4);
        path.lineTo(strokeWidth, f4);
        path.lineTo(strokeWidth, f3);
        paint.setColor(-1);
        canvas2.drawPath(path, paint);
        canvas2.translate(((-A032) / 2.0f) + strokeWidth, 0.0f);
        int i2 = 0;
        do {
            float f5 = this.A00;
            float f6 = (((float) i2) * 1.0f) / 8.0f;
            int i3 = 51;
            if (f5 >= f6) {
                i3 = f5 > (((float) (i2 + 1)) * 1.0f) / 8.0f ? MotionEventCompat.ACTION_MASK : 51 + ((int) ((f5 - f6) * 8.0f * 204.0f));
            }
            paint.setColor((i3 << 24) | ViewCompat.MEASURED_SIZE_MASK);
            canvas2.drawArc(rectF, -33.0f, 66.0f, false, paint);
            canvas2.translate(paint.getStrokeWidth() * 3.0f, 0.0f);
            i2++;
        } while (i2 < 8);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(((int) (((float) ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom())) + (this.A03.getStrokeWidth() * 3.0f * 8.0f) + ((float) getPaddingLeft()) + ((float) getPaddingRight()))) + 1, getMeasuredHeight());
    }

    public void setVolume(float f2) {
        this.A00 = f2;
        invalidate();
    }
}
