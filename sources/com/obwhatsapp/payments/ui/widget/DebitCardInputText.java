package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.C110105dW;
import X.C115725qD;
import X.C16150sX;
import X.C52652eD;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;

public class DebitCardInputText extends WaEditText {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public Paint A07;
    public Paint A08;
    public boolean A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public RectF[] A0D;
    public final int A0E;
    public final int A0F;

    public DebitCardInputText(Context context) {
        super(context);
        int A022 = C110105dW.A02(this);
        this.A0F = getResources().getColor(R.color.left);
        this.A0E = getResources().getColor(R.color.color0605);
        this.A09 = false;
        this.A0C = new float[A022];
    }

    public DebitCardInputText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int A022 = C110105dW.A02(this);
        this.A0F = getResources().getColor(R.color.left);
        this.A0E = getResources().getColor(R.color.color0605);
        this.A09 = false;
        this.A0C = new float[A022];
        A05(context, attributeSet);
    }

    public DebitCardInputText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int A022 = C110105dW.A02(this);
        this.A0F = getResources().getColor(R.color.left);
        this.A0E = getResources().getColor(R.color.color0605);
        this.A09 = false;
        this.A0C = new float[A022];
        A05(context, attributeSet);
    }

    public DebitCardInputText(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    private CharSequence getFullText() {
        return getText();
    }

    private void setFontSize(float f2) {
        this.A07.setTextSize(f2);
    }

    public void A02() {
        if (!this.A0A) {
            this.A0A = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A03 = C16150sX.A0Z(A002);
            this.A02 = C16150sX.A0T(A002);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A05(Context context, AttributeSet attributeSet) {
        this.A01 = C110105dW.A00(this, this.A01);
        this.A02 = C110105dW.A00(this, this.A02);
        this.A03 = C110105dW.A00(this, this.A03);
        this.A04 = C110105dW.A00(this, this.A04);
        int i2 = this.A0F;
        this.A05 = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C115725qD.A00, 0, 0);
        try {
            this.A01 = obtainStyledAttributes.getDimension(3, this.A01);
            this.A00 = obtainStyledAttributes.getDimension(0, 0.0f);
            this.A03 = obtainStyledAttributes.getDimension(1, this.A03);
            this.A04 = obtainStyledAttributes.getDimension(6, this.A04);
            this.A06 = obtainStyledAttributes.getInteger(5, 4);
            this.A05 = obtainStyledAttributes.getInteger(2, this.A05);
            int integer = obtainStyledAttributes.getInteger(4, i2);
            obtainStyledAttributes.recycle();
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A06)});
            this.A07 = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A08 = paint;
            paint.setStrokeWidth(this.A01);
            this.A08.setColor(integer);
            setFontSize(this.A00);
            setBackgroundResource(0);
            setFilterTouchesWhenObscured(true);
            setCursorVisible(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A06(Canvas canvas, float f2) {
        Canvas canvas2 = canvas;
        float height = (float) canvas.getHeight();
        float textSize = getTextSize();
        Paint paint = new Paint(getPaint());
        paint.setColor(this.A09 ? this.A0F : this.A0E);
        this.A09 = !this.A09;
        paint.setStrokeWidth(5.0f);
        float f3 = f2 + 5.0f;
        float f4 = height / 2.0f;
        float f5 = textSize / 2.0f;
        canvas2.drawLine(f3, f4 - f5, f3, f4 + f5, paint);
    }

    public int getMaxNumberOfChars() {
        return this.A06;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        Editable text = getText();
        int length = text.length();
        float[] fArr = this.A0C;
        int length2 = fArr.length;
        if (length2 < length) {
            float[] fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, length2);
            fArr = fArr2;
        }
        this.A0C = fArr;
        getPaint().getTextWidths(text, 0, length, this.A0C);
        int i3 = 0;
        while (true) {
            i2 = this.A06;
            Canvas canvas2 = canvas;
            if (i3 >= i2) {
                break;
            }
            float f2 = this.A0D[i3].left + (this.A00 / 2.0f);
            if (length > i3) {
                canvas2.drawText(text, i3, i3 + 1, f2 - (this.A0C[i3] / 2.0f), this.A0B[i3], this.A07);
            }
            if (length == i3 && hasFocus()) {
                A06(canvas, this.A0D[i3].left);
            }
            RectF rectF = this.A0D[i3];
            canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A08);
            i3++;
        }
        if (length == i2 && hasFocus()) {
            A06(canvas, this.A0D[i3 - 1].right);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            super.onSizeChanged(r11, r12, r13, r14)
            android.graphics.Paint r1 = r10.A07
            int r0 = r10.A05
            r1.setColor(r0)
            int r1 = r10.getWidth()
            int r0 = X.C004601z.A07(r10)
            int r1 = r1 - r0
            int r0 = X.C004601z.A08(r10)
            int r1 = r1 - r0
            float r4 = r10.A03
            r3 = 1065353216(0x3f800000, float:1.0)
            r9 = 1073741824(0x40000000, float:2.0)
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x008f
            float r2 = (float) r1
            int r0 = r10.A06
            float r0 = (float) r0
            float r0 = r0 * r9
            float r0 = r0 - r3
            float r2 = r2 / r0
        L_0x002a:
            r10.A00 = r2
        L_0x002c:
            int r1 = r10.A06
            android.graphics.RectF[] r0 = new android.graphics.RectF[r1]
            r10.A0D = r0
            float[] r0 = new float[r1]
            r10.A0B = r0
            int r6 = r10.getHeight()
            int r0 = r10.getPaddingTop()
            int r6 = r6 - r0
            X.013 r0 = r10.A03
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0089
            r5 = -1
            int r1 = r10.getWidth()
            int r0 = X.C004601z.A08(r10)
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = r10.A00
            float r1 = r1 - r0
            int r7 = (int) r1
        L_0x0056:
            r4 = 0
        L_0x0057:
            int r0 = r10.A06
            if (r4 >= r0) goto L_0x009f
            android.graphics.RectF[] r3 = r10.A0D
            float r7 = (float) r7
            float r2 = (float) r6
            float r1 = r10.A00
            float r1 = r1 + r7
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r2, r1, r2)
            r3[r4] = r0
            float r3 = r10.A03
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            float r1 = (float) r5
            float r0 = r10.A00
            if (r2 >= 0) goto L_0x0086
            float r1 = r1 * r0
            float r1 = r1 * r9
        L_0x0074:
            float r7 = r7 + r1
            int r7 = (int) r7
            float[] r2 = r10.A0B
            android.graphics.RectF[] r0 = r10.A0D
            r0 = r0[r4]
            float r1 = r0.bottom
            float r0 = r10.A04
            float r1 = r1 - r0
            r2[r4] = r1
            int r4 = r4 + 1
            goto L_0x0057
        L_0x0086:
            float r0 = r0 + r3
            float r1 = r1 * r0
            goto L_0x0074
        L_0x0089:
            int r7 = X.C004601z.A08(r10)
            r5 = 1
            goto L_0x0056
        L_0x008f:
            float r0 = r10.A00
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            float r2 = (float) r1
            int r0 = r10.A06
            float r1 = (float) r0
            float r0 = r1 - r3
            float r4 = r4 * r0
            float r2 = r2 - r4
            float r2 = r2 / r1
            goto L_0x002a
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.widget.DebitCardInputText.onSizeChanged(int, int, int, int):void");
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw AnonymousClass000.A0a("setCustomSelectionActionModeCallback() not supported.");
    }
}
