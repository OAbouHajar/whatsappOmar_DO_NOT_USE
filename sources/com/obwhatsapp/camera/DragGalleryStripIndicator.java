package com.obwhatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C52662eE;
import X.C87594Xo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.obwhatsapp.R;

public class DragGalleryStripIndicator extends View implements AnonymousClass006 {
    public float A00;
    public float A01;
    public C52662eE A02;
    public boolean A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Path A07;

    public DragGalleryStripIndicator(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = C13700nu.A06(1);
        this.A06 = C13700nu.A06(1);
        this.A07 = AnonymousClass000.A0I();
        this.A01 = 0.0f;
        A00(context);
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A05 = C13700nu.A06(1);
        this.A06 = C13700nu.A06(1);
        this.A07 = AnonymousClass000.A0I();
        this.A01 = 0.0f;
        A00(context);
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = C13700nu.A06(1);
        this.A06 = C13700nu.A06(1);
        this.A07 = AnonymousClass000.A0I();
        this.A01 = 0.0f;
        A00(context);
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A05 = C13700nu.A06(1);
        this.A06 = C13700nu.A06(1);
        this.A07 = AnonymousClass000.A0I();
        this.A01 = 0.0f;
        A00(context);
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final void A00(Context context) {
        Paint paint = this.A05;
        C13690nt.A0y(paint);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) C87594Xo.A00(context, 2.0f));
        paint.setColor(getResources().getColor(R.color.color090b));
        Paint paint2 = this.A06;
        C13690nt.A0y(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(C13680ns.A01(context) * 4.0f);
        paint2.setColor(getResources().getColor(R.color.color0098));
        this.A00 = TypedValue.applyDimension(1, 1.0f, C13690nt.A0H(this));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float A042 = (float) C13690nt.A04(this);
        float height = (float) (getHeight() - getPaddingBottom());
        float f2 = (height + paddingTop) / 2.0f;
        float f3 = this.A01;
        float f4 = (((height - paddingTop) / 4.0f) * f3) + f2;
        float f5 = f2 + (this.A00 * (-f3));
        Path path = this.A07;
        path.reset();
        path.moveTo(paddingLeft, f5);
        path.lineTo((paddingLeft + A042) / 2.0f, f4);
        path.lineTo(A042, f5);
        canvas.drawPath(path, this.A06);
        canvas.drawPath(path, this.A05);
        if (this.A04) {
            invalidate();
        }
    }

    public void setOffset(float f2) {
        this.A01 = f2 - 1.0f;
        invalidate();
    }

    public void setUpdating(boolean z2) {
        this.A04 = z2;
        if (z2) {
            invalidate();
        }
    }
}
