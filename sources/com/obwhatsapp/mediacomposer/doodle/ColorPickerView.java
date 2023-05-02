package com.obwhatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass4BW;
import X.C108075Mo;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import X.C64043Mn;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;
import java.util.Arrays;

public class ColorPickerView extends View implements AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Bitmap A07;
    public AnonymousClass013 A08;
    public C108075Mo A09;
    public C52662eE A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public final Paint A0E;
    public final Paint A0F;

    public ColorPickerView(Context context) {
        super(context);
        A00();
        this.A0E = C13700nu.A05();
        this.A0F = C13680ns.A0E();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0E = C13700nu.A05();
        this.A0F = C13680ns.A0E();
        A02(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A0E = C13700nu.A05();
        this.A0F = C13680ns.A0E();
        A02(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        this.A0E = C13700nu.A05();
        this.A0F = C13680ns.A0E();
        A02(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    private void setColor(int i2) {
        this.A02 = i2;
    }

    private void setSize(float f2) {
        this.A00 = f2;
    }

    public void A00() {
        if (!this.A0C) {
            this.A0C = true;
            this.A08 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public final void A01() {
        int i2;
        int i3 = this.A01;
        int i4 = i3 / 10;
        int i5 = i3 / 30;
        int i6 = ((i3 - i4) - i5) - i4;
        int i7 = 0;
        while (true) {
            if (i7 >= i4) {
                break;
            }
            int i8 = (i7 * MotionEventCompat.ACTION_MASK) / i4;
            this.A0D[i7] = i8 | -16777216 | (i8 << 16) | (i8 << 8);
            i7++;
        }
        for (i2 = 0; i2 < i5; i2++) {
            this.A0D[i4 + i2] = -1;
        }
        float[] fArr = new float[3];
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        for (int i9 = 0; i9 < i4; i9++) {
            fArr[1] = ((float) i9) / ((float) i4);
            this.A0D[i4 + i5 + i9] = Color.HSVToColor(fArr);
        }
        fArr[1] = 0.8f;
        fArr[2] = 1.0f;
        for (int i10 = 0; i10 < i6; i10++) {
            fArr[0] = (((float) i10) * 360.0f) / ((float) i6);
            this.A0D[i4 + i5 + i4 + i10] = Color.HSVToColor(fArr);
        }
        Path A0I = AnonymousClass000.A0I();
        A0I.setFillType(Path.FillType.WINDING);
        float[] fArr2 = new float[8];
        Arrays.fill(fArr2, ((float) this.A04) / 0.8f);
        A0I.addRoundRect(new RectF(1.0f, 1.0f, (float) (this.A04 - 1), (float) (this.A01 - 1)), fArr2, Path.Direction.CW);
        Bitmap bitmap = this.A07;
        if (!(bitmap != null && bitmap.getWidth() == this.A04 && this.A07.getHeight() == this.A01)) {
            this.A07 = Bitmap.createBitmap(this.A04, this.A01, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(this.A07);
        Paint paint = this.A0E;
        C13690nt.A0y(paint);
        canvas.save();
        canvas.clipPath(A0I);
        paint.setStrokeWidth(1.0f);
        for (int i11 = 0; i11 < this.A01; i11++) {
            paint.setColor(this.A0D[i11]);
            float f2 = (float) i11;
            canvas.drawLine(0.0f, f2, (float) this.A04, f2, paint);
        }
        canvas.restore();
        Paint paint2 = this.A0F;
        C13690nt.A0r(getContext(), paint2, R.color.color0155);
        C13690nt.A0y(paint2);
        paint2.setStrokeWidth((float) getResources().getDimensionPixelSize(R.dimen.dimen0771));
        canvas.drawPath(A0I, paint2);
    }

    public final void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A04);
            this.A04 = (int) obtainStyledAttributes.getDimension(2, 1.0f);
            this.A06 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A05 = (int) obtainStyledAttributes.getDimension(0, 1.0f);
            this.A00 = (float) this.A06;
            obtainStyledAttributes.recycle();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawBitmap(this.A07, (float) (C13680ns.A1Z(this.A08) ? C13690nt.A04(this) : this.A04 + getPaddingRight()), (float) getPaddingTop(), this.A0E);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public int getColor() {
        return this.A02;
    }

    public float getMinSize() {
        return (float) this.A06;
    }

    public float getSize() {
        return this.A00;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A03 != 0 && getMeasuredHeight() > this.A03) {
            setMeasuredDimension(getMeasuredWidth(), this.A03);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C64043Mn r2 = (C64043Mn) parcelable;
        this.A02 = r2.A01;
        this.A00 = r2.A00;
        super.onRestoreInstanceState(r2.getSuperState());
    }

    public Parcelable onSaveInstanceState() {
        return new C64043Mn(super.onSaveInstanceState(), this.A00, this.A02);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int max = Math.max(1, (i3 - getPaddingTop()) - getPaddingBottom());
        this.A01 = max;
        int[] iArr = this.A0D;
        if (iArr == null || iArr.length < max) {
            this.A0D = new int[max];
        }
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 != 6) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        if (r7 != 1) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r7 = r10.getActionMasked()
            int r0 = r10.getPointerCount()
            r6 = 0
            r5 = 1
            if (r0 > r5) goto L_0x0046
            r3 = 5
            r8 = 2
            if (r7 == r3) goto L_0x0012
            if (r7 != 0) goto L_0x0047
        L_0x0012:
            float r2 = r10.getX()
            int r1 = X.C13690nt.A04(r9)
            int r0 = r9.A04
            int r0 = r0 << 1
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            X.013 r0 = r9.A08
            boolean r0 = X.C13680ns.A1Z(r0)
            if (r0 != 0) goto L_0x0046
        L_0x002c:
            float r2 = r10.getX()
            int r1 = r9.getPaddingLeft()
            int r0 = r9.A04
            int r0 = r0 << 1
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            X.013 r0 = r9.A08
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            return r6
        L_0x0047:
            r4 = 6
            if (r7 == 0) goto L_0x0059
            if (r7 == r5) goto L_0x0059
            if (r7 == r8) goto L_0x0059
            r0 = 3
            if (r7 == r0) goto L_0x00cd
            if (r7 == r3) goto L_0x0059
            if (r7 == r4) goto L_0x0059
        L_0x0055:
            r9.invalidate()
            return r5
        L_0x0059:
            X.5Mo r0 = r9.A09
            if (r0 == 0) goto L_0x0055
            float r0 = r10.getY()
            int r1 = (int) r0
            int r0 = r9.getPaddingTop()
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x006a
            r1 = 0
        L_0x006a:
            int r0 = r9.A01
            if (r1 < r0) goto L_0x0070
            int r1 = r0 + -1
        L_0x0070:
            int[] r0 = r9.A0D
            r1 = r0[r1]
            int r0 = r9.A02
            if (r1 == r0) goto L_0x00c9
            r9.A02 = r1
            X.013 r0 = r9.A08
            boolean r0 = X.C13680ns.A1Z(r0)
            if (r0 == 0) goto L_0x0106
            int r0 = r9.getWidth()
            float r8 = (float) r0
            float r0 = r10.getX()
            float r8 = r8 - r0
        L_0x008c:
            int r1 = r9.A04
            int r0 = r9.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r9.getPaddingRight()
            int r1 = r1 + r0
            float r3 = (float) r1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b0
            int r1 = r9.A06
            float r2 = (float) r1
            int r0 = r9.A05
            int r0 = r0 - r1
            float r1 = (float) r0
            float r8 = r8 - r3
            float r1 = r1 * r8
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r0 = r0 - r3
            float r1 = r1 / r0
            float r2 = r2 + r1
            r9.A00 = r2
        L_0x00b0:
            r9.A0B = r5
            X.5Mo r3 = r9.A09
            float r2 = r9.A00
            int r1 = r9.A02
            X.4zU r3 = (X.C102764zU) r3
            X.29j r0 = r3.A02
            if (r0 == 0) goto L_0x00c1
            r0.Aej(r2, r1)
        L_0x00c1:
            X.5Ru r0 = r3.A00
            r0.AOo(r2, r1)
            r0.AZO()
        L_0x00c9:
            if (r7 == r4) goto L_0x00cd
            if (r7 != r5) goto L_0x0055
        L_0x00cd:
            r9.A0B = r6
            X.5Mo r4 = r9.A09
            X.4zU r4 = (X.C102764zU) r4
            X.29j r0 = r4.A02
            if (r0 == 0) goto L_0x00f6
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = (com.obwhatsapp.mediacomposer.doodle.DoodleView) r0
            X.29k r3 = r0.A0J
            X.29l r0 = r3.A02
            if (r0 == 0) goto L_0x00f6
            X.29l r2 = r3.A01
            if (r0 != r2) goto L_0x00f6
            X.4MV r0 = r3.A00
            X.332 r1 = new X.332
            r1.<init>(r0, r2)
            X.393 r0 = r3.A03
            java.util.LinkedList r0 = r0.A00
            r0.add(r1)
            r0 = 0
            r3.A02 = r0
            r3.A00 = r0
        L_0x00f6:
            X.5Ru r0 = r4.A00
            r0.AZO()
            com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r4.A01
            com.obwhatsapp.mediacomposer.doodle.ColorPickerView r0 = r1.A05
            int r0 = r0.A02
            r1.A02(r0)
            goto L_0x0055
        L_0x0106:
            float r8 = r10.getX()
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.doodle.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setColorAndInvalidate(int i2) {
        this.A02 = i2;
        invalidate();
    }

    public void setListener(C108075Mo r1) {
        this.A09 = r1;
    }

    public void setMaxHeight(int i2) {
        this.A03 = i2;
    }

    public void setSizeAndInvalidate(float f2) {
        this.A00 = f2;
        invalidate();
    }
}
