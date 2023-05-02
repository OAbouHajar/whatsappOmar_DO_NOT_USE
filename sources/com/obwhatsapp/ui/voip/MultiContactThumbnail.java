package com.obwhatsapp.ui.voip;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass2Ao;
import X.AnonymousClass2OY;
import X.AnonymousClass4BW;
import X.C13700nu;
import X.C16010sH;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

public class MultiContactThumbnail extends ViewGroup implements AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public Canvas A03;
    public Paint A04;
    public RectF A05;
    public AnonymousClass013 A06;
    public C52662eE A07;
    public boolean A08;

    public MultiContactThumbnail(Context context) {
        this(context, (AttributeSet) null);
    }

    public MultiContactThumbnail(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiContactThumbnail(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A08) {
            this.A08 = true;
            this.A06 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
        this.A00 = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass4BW.A08);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, this.A02);
            obtainStyledAttributes.recycle();
        }
        int i3 = ((int) this.A00) << 1;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        this.A03 = new Canvas(createBitmap);
        float f2 = (float) i3;
        this.A05 = new RectF(0.0f, 0.0f, f2, f2);
        this.A04 = C13700nu.A06(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A04.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        setWillNotDraw(false);
    }

    private void setNumImages(int i2) {
        if (i2 == this.A01) {
            invalidate();
            return;
        }
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        if (i2 <= childCount) {
            int i3 = childCount2 - i2;
            int childCount3 = getChildCount();
            for (int i4 = 0; i4 < i3; i4++) {
                getChildAt((childCount3 - 1) - i4).setVisibility(8);
            }
        } else {
            int i5 = i2 - childCount2;
            for (int i6 = 0; i6 < i5; i6++) {
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                addView(imageView);
            }
        }
        for (int i7 = 0; i7 < i2; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 0) {
                childAt.setVisibility(0);
            }
        }
        this.A01 = i2;
    }

    public void A00(AnonymousClass2OY r6, AnonymousClass2Ao r7, List list) {
        boolean z2 = true;
        if (list.size() < 1) {
            z2 = false;
        }
        AnonymousClass00B.A0B(AnonymousClass000.A0l(AnonymousClass000.A0r("Value %d out of bounds for numImages"), this.A01), z2);
        int i2 = 4;
        if (list.size() <= 4) {
            i2 = list.size();
        }
        setNumImages(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            r7.A03((ImageView) getChildAt(i3), r6, (C16010sH) list.get(i3), false);
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = this.A03;
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        super.draw(canvas2);
        RectF rectF = this.A05;
        float f2 = this.A00;
        canvas.drawRoundRect(rectF, f2, f2, this.A04);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A07;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r0 <= 1) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            int r0 = r14.A01
            r11 = 1
            if (r0 < r11) goto L_0x0081
            int r7 = r14.getPaddingLeft()
            int r10 = r14.getPaddingTop()
            int r6 = r14.getMeasuredWidth()
            int r0 = r14.getPaddingRight()
            int r6 = r6 - r0
            int r9 = r14.getMeasuredHeight()
            int r0 = r14.getPaddingBottom()
            int r9 = r9 - r0
            X.013 r0 = r14.A06
            boolean r13 = r0.A0T()
            int r6 = r6 - r7
            int r9 = r9 - r10
            int r12 = r6 >> 1
            int r0 = r14.A02
            int r1 = r12 - r0
            int r5 = r9 >> 1
            int r4 = r5 - r0
            int r12 = r12 + r7
            int r12 = r12 + r0
            int r5 = r5 + r10
            int r5 = r5 + r0
            int r0 = r14.A01
            if (r0 == r11) goto L_0x003a
            r6 = r1
        L_0x003a:
            r8 = 3
            r3 = r4
            if (r0 > r8) goto L_0x003f
            r3 = r9
        L_0x003f:
            if (r13 == 0) goto L_0x0044
            r2 = r12
            if (r0 > r11) goto L_0x0045
        L_0x0044:
            r2 = r7
        L_0x0045:
            r0 = 0
            android.view.View r1 = r14.getChildAt(r0)
            int r0 = r2 + r6
            int r3 = r3 + r10
            r1.layout(r2, r10, r0, r3)
            int r0 = r14.A01
            if (r0 == r11) goto L_0x0081
            r3 = r12
            if (r13 == 0) goto L_0x0058
            r3 = r7
        L_0x0058:
            r2 = 2
            if (r0 <= r2) goto L_0x005c
            r9 = r4
        L_0x005c:
            android.view.View r0 = r14.getChildAt(r11)
            int r1 = r3 + r6
            int r9 = r9 + r10
            r0.layout(r3, r10, r1, r9)
            int r0 = r14.A01
            if (r0 == r2) goto L_0x0081
            android.view.View r0 = r14.getChildAt(r2)
            int r4 = r4 + r5
            r0.layout(r3, r5, r1, r4)
            int r0 = r14.A01
            if (r0 == r8) goto L_0x0081
            if (r13 == 0) goto L_0x0079
            r7 = r12
        L_0x0079:
            android.view.View r0 = r14.getChildAt(r8)
            int r6 = r6 + r7
            r0.layout(r7, r5, r6, r4)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.ui.voip.MultiContactThumbnail.onLayout(boolean, int, int, int, int):void");
    }
}
