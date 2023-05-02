package com.obwhatsapp.calling.callgrid.view;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass08E;
import X.C018208n;
import X.C14710pd;
import X.C16620tM;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.obwhatsapp.R;
import java.util.Random;

public class VoiceParticipantAudioWave extends View implements AnonymousClass006 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ValueAnimator A06;
    public ValueAnimator A07;
    public Paint A08;
    public Drawable A09;
    public C14710pd A0A;
    public C52662eE A0B;
    public boolean A0C;
    public boolean A0D;
    public double[] A0E;
    public double[] A0F;
    public double[] A0G;
    public final Interpolator A0H;
    public final Random A0I;

    public VoiceParticipantAudioWave(Context context) {
        super(context);
        A00();
        this.A0E = new double[0];
        this.A0G = new double[0];
        this.A0F = new double[0];
        this.A08 = new Paint(1);
        this.A0I = new Random();
        this.A0H = new LinearInterpolator();
        A03(context);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0E = new double[0];
        this.A0G = new double[0];
        this.A0F = new double[0];
        this.A08 = new Paint(1);
        this.A0I = new Random();
        this.A0H = new LinearInterpolator();
        A03(context);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A0E = new double[0];
        this.A0G = new double[0];
        this.A0F = new double[0];
        this.A08 = new Paint(1);
        this.A0I = new Random();
        this.A0H = new LinearInterpolator();
        A03(context);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        this.A0E = new double[0];
        this.A0G = new double[0];
        this.A0F = new double[0];
        this.A08 = new Paint(1);
        this.A0I = new Random();
        this.A0H = new LinearInterpolator();
        A03(context);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    private int getLineCount() {
        if (getWidth() == 0) {
            return 0;
        }
        int width = getWidth();
        int i2 = this.A03;
        int i3 = (width - i2) / (i2 << 1);
        if (i3 % 2 == 0) {
            i3--;
        }
        this.A05 = (getWidth() - ((i3 << 1) * this.A03)) >> 1;
        return i3;
    }

    public void A00() {
        if (!this.A0C) {
            this.A0C = true;
            this.A0A = (C14710pd) ((C52652eD) ((C52642eC) generatedComponent())).A07.A05.get();
        }
    }

    public final void A01() {
        int lineCount = getLineCount();
        if (lineCount > 0) {
            this.A0E = new double[lineCount];
            int i2 = lineCount >> 1;
            double pow = Math.pow(3.0d / ((double) getHeight()), 1.0d / ((double) i2));
            this.A0E[i2] = (double) getHeight();
            int i3 = 1;
            while (true) {
                int i4 = i2 - i3;
                if (i4 >= 0) {
                    double[] dArr = this.A0E;
                    dArr[i4] = dArr[i4 + 1] * pow;
                    int i5 = i2 + i3;
                    if (i5 < lineCount) {
                        dArr[i5] = dArr[i4];
                    }
                    i3++;
                } else {
                    this.A0F = new double[lineCount];
                    this.A0G = new double[lineCount];
                    return;
                }
            }
        }
    }

    public final void A02(float f2, boolean z2) {
        if (getVisibility() == 0) {
            ValueAnimator valueAnimator = this.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.A0F = this.A0G;
            this.A0G = new double[this.A0E.length];
            int i2 = this.A04;
            float f3 = (float) i2;
            float max = Math.max(f2, f3);
            float f4 = (max - f3) / ((float) (127 - i2));
            int i3 = 1;
            while (true) {
                double[] dArr = this.A0E;
                if (i3 >= dArr.length - 1) {
                    break;
                }
                double[] dArr2 = this.A0G;
                double d2 = dArr[i3];
                Random random = this.A0I;
                if (random.nextFloat() < 0.3f) {
                    d2 = ((double) ((random.nextFloat() * 0.7f) + 0.3f)) * d2;
                }
                dArr2[i3] = d2 * ((double) f4);
                i3++;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.A06 = ofFloat;
            ofFloat.setDuration(z2 ? (long) this.A02 : 0);
            this.A06.setInterpolator(this.A0H);
            this.A06.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 5));
            this.A06.start();
            this.A01 = max;
        }
    }

    public final void A03(Context context) {
        C14710pd r1 = this.A0A;
        C16620tM r2 = C16620tM.A02;
        this.A02 = r1.A03(r2, 1106);
        int min = Math.min(this.A0A.A03(r2, 1213), 127);
        this.A04 = min;
        if (min >= 127) {
            this.A04 = 0;
        }
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.dimen0824);
        Paint paint = this.A08;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(AnonymousClass00T.A00(getContext(), 17170443));
        paint.setStrokeWidth((float) this.A03);
        A01();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0B;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        int i2;
        Drawable drawable;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (!this.A0D || (drawable = this.A09) == null) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = (this.A0E.length - 5) >> 1;
            int i3 = this.A03;
            int i4 = i3 * 9;
            int i5 = i4 >> 1;
            int i6 = this.A03;
            drawable.setBounds(this.A05 + i3 + ((i3 << 1) * i2), (getHeight() >> 1) - i5, this.A05 + i6 + ((i6 << 1) * i2) + i4, (getHeight() >> 1) + i5);
            this.A09.draw(canvas2);
        }
        for (int i7 = 0; i7 < this.A0E.length; i7++) {
            if (i7 < i2 || i7 >= i2 + 5) {
                int i8 = this.A03;
                int i9 = this.A05 + i8 + ((i8 << 1) * i7);
                double d2 = this.A0G[i7];
                double d3 = this.A0F[i7];
                float f2 = (float) i9;
                float f3 = ((float) (((d2 - d3) * ((double) this.A00)) + d3)) / 2.0f;
                canvas2.drawLine(f2, ((float) (getHeight() >> 1)) - f3, f2, ((float) (getHeight() >> 1)) + f3, this.A08);
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        A01();
        A02(this.A01, true);
    }

    public void setAudioLevel(float f2) {
        A02(f2, true);
    }

    public void setColor(int i2) {
        Paint paint = this.A08;
        paint.setColor(i2);
        Drawable drawable = this.A09;
        if (drawable != null) {
            C018208n.A0A(drawable, paint.getColor());
        }
        invalidate();
    }

    public void setMuteIconVisibility(boolean z2) {
        if (this.A0D != z2) {
            this.A0D = z2;
            Drawable drawable = this.A09;
            if (drawable == null) {
                drawable = AnonymousClass08E.A01(getContext(), R.drawable.vec_ic_voip_voice_mute);
                this.A09 = drawable;
            }
            C018208n.A0A(drawable, this.A08.getColor());
            invalidate();
        }
    }
}
