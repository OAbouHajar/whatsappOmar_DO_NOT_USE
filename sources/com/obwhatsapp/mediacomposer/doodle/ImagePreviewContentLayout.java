package com.obwhatsapp.mediacomposer.doodle;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass2Ra;
import X.AnonymousClass39P;
import X.C1044955p;
import X.C1045956b;
import X.C108085Mp;
import X.C47782Km;
import X.C47792Kn;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.RunnableRunnableShape0S0220102_I0;
import com.obwhatsapp.R;

public class ImagePreviewContentLayout extends FrameLayout implements AnonymousClass006 {
    public Rect A00;
    public RectF A01;
    public AnonymousClass013 A02;
    public AnonymousClass2Ra A03;
    public C108085Mp A04;
    public C47792Kn A05;
    public C52662eE A06;
    public boolean A07;

    public ImagePreviewContentLayout(Context context) {
        super(context);
        A01();
        this.A01 = new RectF();
        this.A00 = new Rect();
        A02(context);
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A01 = new RectF();
        this.A00 = new Rect();
        A02(context);
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        this.A01 = new RectF();
        this.A00 = new Rect();
        A02(context);
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A01();
        this.A01 = new RectF();
        this.A00 = new Rect();
        A02(context);
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A01();
    }

    public void A00() {
        C47792Kn r3 = this.A05;
        C1045956b r1 = r3.A0H;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        r3.A0H = null;
        RunnableRunnableShape0S0220102_I0 runnableRunnableShape0S0220102_I0 = r3.A0F;
        if (runnableRunnableShape0S0220102_I0 != null) {
            runnableRunnableShape0S0220102_I0.A05 = false;
            runnableRunnableShape0S0220102_I0.A06 = true;
        }
        r3.A0F = null;
        RunnableRunnableShape0S0220102_I0 runnableRunnableShape0S0220102_I02 = r3.A0E;
        if (runnableRunnableShape0S0220102_I02 != null) {
            runnableRunnableShape0S0220102_I02.A05 = false;
            runnableRunnableShape0S0220102_I02.A06 = true;
        }
        r3.A0E = null;
        C1044955p r12 = r3.A0I;
        if (r12 != null) {
            r12.A01 = true;
        }
        r3.A0I = null;
        r3.A0C = null;
        r3.A0C = null;
    }

    public void A01() {
        if (!this.A07) {
            this.A07 = true;
            this.A02 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final void A02(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout02fa, this, true);
        setWillNotDraw(false);
        C47792Kn r0 = new C47792Kn(getContext(), this, new C47782Km(this));
        this.A05 = r0;
        r0.A0M = true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public GestureDetector.OnGestureListener getActionHandler() {
        return this.A05;
    }

    public void onDraw(Canvas canvas) {
        canvas.setMatrix(this.A05.A07);
        Rect rect = this.A00;
        canvas.getClipBounds(rect);
        AnonymousClass2Ra r2 = this.A03;
        float f2 = this.A05.A00;
        AnonymousClass39P r0 = r2.A0I;
        r0.A05 = rect;
        r0.A01 = f2;
        super.onDraw(canvas);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            RectF rectF = this.A01;
            rectF.set(0.0f, 0.0f, (float) ((getWidth() - getPaddingLeft()) - getPaddingRight()), (float) ((getHeight() - getPaddingTop()) - getPaddingBottom()));
            C47792Kn r1 = this.A05;
            r1.A09.set(rectF);
            r1.A00();
            C47792Kn r2 = this.A05;
            r2.A0K = true;
            Matrix matrix = r2.A06;
            if (matrix == null || matrix.equals(r2.A07)) {
                r2.A00();
            }
        }
    }

    public void setDoodleController(AnonymousClass2Ra r1) {
        this.A03 = r1;
    }

    public void setImagePreviewContentLayoutListener(C108085Mp r1) {
        this.A04 = r1;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A05.A0C = onClickListener;
    }

    public void setZoomableViewController(C47792Kn r1) {
        this.A05 = r1;
    }
}
