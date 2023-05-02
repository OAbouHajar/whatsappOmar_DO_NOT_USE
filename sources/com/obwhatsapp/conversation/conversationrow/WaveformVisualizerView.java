package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C13690nt;
import X.C13700nu;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public class WaveformVisualizerView extends View implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public byte[] A02;
    public float[] A03;
    public final Paint A04;
    public final Path A05;
    public final Rect A06;

    public WaveformVisualizerView(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass000.A0J();
        this.A04 = C13700nu.A05();
        this.A05 = AnonymousClass000.A0I();
        A00();
    }

    public WaveformVisualizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A06 = AnonymousClass000.A0J();
        this.A04 = C13700nu.A05();
        this.A05 = AnonymousClass000.A0I();
        A00();
    }

    public WaveformVisualizerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass000.A0J();
        this.A04 = C13700nu.A05();
        this.A05 = AnonymousClass000.A0I();
        A00();
    }

    public WaveformVisualizerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final void A00() {
        this.A02 = null;
        Paint paint = this.A04;
        paint.setStrokeWidth(2.0f);
        C13690nt.A0y(paint);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        C13690nt.A0r(getContext(), paint, R.color.color090b);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        byte[] bArr = this.A02;
        if (bArr != null) {
            float[] fArr = this.A03;
            if (fArr == null || fArr.length < (bArr.length << 2)) {
                this.A03 = new float[(bArr.length << 2)];
            }
            Rect rect = this.A06;
            rect.set(0, 0, getWidth(), getHeight());
            rect.top += getPaddingTop();
            rect.bottom -= getPaddingBottom();
            rect.left += getPaddingLeft();
            rect.right -= getPaddingRight();
            Path path = this.A05;
            path.reset();
            path.moveTo((float) rect.left, (float) (rect.top + (rect.height() >> 1) + ((((byte) (this.A02[0] + 128)) * (rect.height() >> 1)) >> 7)));
            for (int i2 = 0; i2 < this.A02.length - 1; i2++) {
                path.lineTo((float) (rect.left + ((rect.width() * i2) / (this.A02.length - 1))), (float) (rect.top + (rect.height() >> 1) + ((((byte) (this.A02[i2] + 128)) * (rect.height() >> 1)) >> 7)));
            }
            canvas.drawPath(path, this.A04);
        }
    }

    public void setColor(int i2) {
        this.A04.setColor(i2);
    }
}
