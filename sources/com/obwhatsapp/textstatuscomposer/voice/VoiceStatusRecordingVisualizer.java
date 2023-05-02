package com.obwhatsapp.textstatuscomposer.voice;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass5QX;
import X.C13690nt;
import X.C13700nu;
import X.C16150sX;
import X.C16440t3;
import X.C52652eD;
import X.C52662eE;
import X.C87594Xo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;
import java.util.List;

public class VoiceStatusRecordingVisualizer extends View implements AnonymousClass006 {
    public long A00;
    public long A01;
    public C16440t3 A02;
    public AnonymousClass5QX A03;
    public C52662eE A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final Paint A0A;
    public final List A0B;

    public VoiceStatusRecordingVisualizer(Context context) {
        this(context, (AttributeSet) null);
    }

    public VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A05) {
            this.A05 = true;
            this.A02 = C16150sX.A0U(C52652eD.A00(generatedComponent()));
        }
        this.A0B = AnonymousClass000.A0u();
        Paint A062 = C13700nu.A06(5);
        this.A09 = A062;
        this.A00 = 0;
        this.A01 = 750;
        this.A07 = (float) C87594Xo.A00(context, 4.3f);
        this.A08 = (float) C87594Xo.A00(context, 2.5f);
        A062.setStrokeCap(Paint.Cap.ROUND);
        C13690nt.A0r(context, A062, R.color.color08f2);
        Paint paint = new Paint(A062);
        this.A0A = paint;
        C13690nt.A0r(context, paint, R.color.color0896);
    }

    private int getTotalSegmentsCount() {
        return ((int) Math.floor((double) ((((float) C13690nt.A04(this)) - this.A08) / this.A07))) + 1;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        float f2;
        Paint paint;
        double pow;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        long j2 = this.A00;
        float f3 = 1.0f;
        if (j2 != 0) {
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - j2)) / ((float) this.A01);
            if (elapsedRealtime > 1.0f) {
                this.A06 = false;
            } else {
                f3 = elapsedRealtime;
            }
        } else {
            f3 = 0.0f;
        }
        int height = (canvas2.getHeight() - getPaddingTop()) - getPaddingBottom();
        int totalSegmentsCount = getTotalSegmentsCount();
        int i2 = 0;
        while (i2 < totalSegmentsCount) {
            List list = this.A0B;
            float f4 = 1.0f;
            if (i2 < list.size()) {
                f2 = AnonymousClass000.A04(list.get(i2));
                if (i2 == list.size() - 1) {
                    f4 = f3;
                }
                paint = this.A09;
                if (f4 < 0.5f) {
                    pow = (double) (4.0f * f4 * f4 * f4);
                }
                pow = 1.0d - (Math.pow((double) ((f4 * -2.0f) + 2.0f), 3.0d) / 2.0d);
            } else {
                paint = i2 == list.size() ? this.A09 : this.A0A;
                f2 = 0.006f;
                pow = 1.0d - (Math.pow((double) ((f4 * -2.0f) + 2.0f), 3.0d) / 2.0d);
            }
            float f5 = this.A08;
            float f6 = (f5 / 2.0f) + (this.A07 * ((float) i2));
            float f7 = (float) height;
            float max = Math.max(0.006f, f2) * f7 * ((float) pow);
            float paddingTop = ((float) getPaddingTop()) + ((f7 - max) / 2.0f);
            paint.setStrokeWidth(f5);
            canvas2.drawLine(f6, paddingTop, f6, paddingTop + max, paint);
            i2++;
        }
        if (this.A06) {
            invalidate();
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        AnonymousClass5QX r1 = this.A03;
        if (r1 != null) {
            r1.AWu(getTotalSegmentsCount());
        }
    }

    public void setListener(AnonymousClass5QX r2) {
        this.A03 = r2;
        if (getWidth() > 0 && r2 != null) {
            r2.AWu(getTotalSegmentsCount());
        }
    }
}
