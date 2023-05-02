package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass3NH;
import X.AnonymousClass440;
import X.AnonymousClass4R5;
import X.C004601z;
import X.C51232bE;
import X.C51242bF;
import X.C51252bG;
import X.C51262bH;
import X.C52662eE;
import X.C53072ew;
import X.C94564l7;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class QrImageView extends View implements AnonymousClass006 {
    public static final Random A09 = new Random();
    public int A00;
    public Paint A01;
    public RectF A02;
    public Drawable A03;
    public C51252bG A04;
    public C52662eE A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;

    public QrImageView(Context context) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A01 = new Paint();
        this.A02 = new RectF();
        A00(context, (AttributeSet) null);
    }

    public QrImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A01 = new Paint();
        this.A02 = new RectF();
        A00(context, attributeSet);
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A01 = new Paint();
        this.A02 = new RectF();
        A00(context, attributeSet);
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        this.A01 = new Paint();
        this.A02 = new RectF();
        A00(context, attributeSet);
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0F);
            this.A08 = obtainStyledAttributes.getBoolean(1, true);
            this.A00 = obtainStyledAttributes.getInt(0, -16777216);
            this.A03 = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            try {
                this.A04 = C51242bF.A00(C51232bE.A03, "This is a sample QR Code", (Map) null);
            } catch (AnonymousClass440 e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void A01(C51262bH r5) {
        ArrayList arrayList = this.A06;
        if (arrayList == null || arrayList.isEmpty()) {
            AnonymousClass4R5 r0 = this.A04.A04;
            int i2 = r0.A01 * r0.A00;
            ArrayList arrayList2 = new ArrayList(i2);
            this.A06 = arrayList2;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList2.add(Integer.valueOf(i3));
            }
        }
        AnonymousClass3NH r2 = new AnonymousClass3NH(this);
        r2.setDuration(1200);
        r2.setInterpolator(new LinearInterpolator());
        if (r5 != null) {
            r2.setAnimationListener(new C94564l7(r5, this));
        }
        startAnimation(r2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A05;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A08 && this.A04 != null) {
            A01((C51262bH) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A06 = null;
        clearAnimation();
    }

    public void onDraw(Canvas canvas) {
        C51252bG r0 = this.A04;
        if (r0 != null) {
            AnonymousClass4R5 r15 = r0.A04;
            int i2 = r15.A01;
            int i3 = r15.A00;
            RectF rectF = this.A02;
            float width = rectF.width() / ((float) i2);
            float height = rectF.height() / ((float) i3);
            Paint paint = this.A01;
            paint.setColor(-1);
            float paddingLeft = (float) getPaddingLeft();
            float paddingTop = (float) getPaddingTop();
            Canvas canvas2 = canvas;
            Paint paint2 = paint;
            Canvas canvas3 = canvas2;
            float f2 = paddingLeft;
            canvas3.drawRect(f2, paddingTop, (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), paint2);
            paint.setColor(this.A00);
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    if (r15.A02[i5][i4] == 1) {
                        float f3 = rectF.left;
                        float f4 = (float) ((int) ((((float) i4) * width) + f3));
                        float f5 = rectF.top;
                        float f6 = f4;
                        canvas3.drawRect(f6, (float) ((int) ((((float) i5) * height) + f5)), f3 + (((float) (i4 + 1)) * width), f5 + (((float) (i5 + 1)) * height), paint2);
                    }
                }
            }
            paint.setColor(-1);
            if (this.A06 != null && !isInEditMode()) {
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    int i6 = intValue % i2;
                    int i7 = intValue / i2;
                    float f7 = rectF.left;
                    float f8 = (float) ((int) ((((float) i6) * width) + f7));
                    float f9 = rectF.top;
                    float f10 = f8;
                    canvas3.drawRect(f10, (float) ((int) ((((float) i7) * height) + f9)), f7 + (((float) (i6 + 1)) * width), f9 + (((float) (i7 + 1)) * height), paint2);
                }
            }
            if (this.A03 != null) {
                ArrayList arrayList = this.A06;
                if (arrayList == null || arrayList.isEmpty() || isInEditMode()) {
                    this.A03.draw(canvas2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r6 = r9.getMeasuredWidth()
            int r0 = r9.getPaddingLeft()
            int r6 = r6 - r0
            int r0 = r9.getPaddingRight()
            int r6 = r6 - r0
            int r5 = r9.getMeasuredHeight()
            int r0 = r9.getPaddingTop()
            int r5 = r5 - r0
            int r0 = r9.getPaddingBottom()
            int r5 = r5 - r0
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            if (r6 <= r5) goto L_0x0069
            int r0 = r6 - r5
            float r4 = (float) r0
            float r4 = r4 / r8
            r1 = r5
        L_0x0029:
            r0 = 0
        L_0x002a:
            android.graphics.RectF r3 = r9.A02
            float r2 = (float) r1
            r3.set(r7, r7, r2, r2)
            r3.offset(r4, r0)
            int r0 = r9.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r9.getPaddingTop()
            float r0 = (float) r0
            r3.offset(r1, r0)
            android.graphics.drawable.Drawable r0 = r9.A03
            if (r0 == 0) goto L_0x0068
            r0 = 1049414861(0x3e8ccccd, float:0.275)
            float r2 = r2 * r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r4 = (int) r2
            int r6 = r6 - r4
            float r0 = (float) r6
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r3 = (int) r0
            int r0 = r9.getPaddingLeft()
            int r3 = r3 + r0
            int r5 = r5 - r4
            float r0 = (float) r5
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r2 = (int) r0
            int r0 = r9.getPaddingTop()
            int r2 = r2 + r0
            int r1 = r3 + r4
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r0 = r9.A03
            r0.setBounds(r3, r2, r1, r4)
        L_0x0068:
            return
        L_0x0069:
            if (r5 <= r6) goto L_0x0072
            int r0 = r5 - r6
            float r0 = (float) r0
            float r0 = r0 / r8
            r1 = r6
            r4 = 0
            goto L_0x002a
        L_0x0072:
            r1 = r6
            r4 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.QrImageView.onMeasure(int, int):void");
    }

    public void setQrCode(C51252bG r2) {
        setQrCode(r2, (C51262bH) null);
    }

    public void setQrCode(C51252bG r2, C51262bH r3) {
        this.A04 = r2;
        if (this.A08 && C004601z.A0t(this) && r2 != null) {
            A01(r3);
        } else if (r3 != null) {
            r3.AOx(this);
        }
    }
}
