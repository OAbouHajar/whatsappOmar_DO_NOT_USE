package org.npci.commonlibrary.widget;

import X.AnonymousClass000;
import X.C110105dW;
import X.C110115dX;
import X.C115685q9;
import X.C119435xs;
import X.C119665yq;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import com.facebook.redex.IDxUListenerShape142S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;

public class FormItemEditText extends WaEditText {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public ColorStateList A07;
    public Paint A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public Drawable A0C;
    public View.OnClickListener A0D;
    public String A0E;
    public String A0F;
    public StringBuilder A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float[] A0L;
    public float[] A0M;
    public float[] A0N;
    public RectF[] A0O;
    public final Rect A0P = new Rect();
    public final int[] A0Q;
    public final int[][] A0R;

    public FormItemEditText(Context context) {
        super(context);
        boolean A1X = C110105dW.A1X(this);
        int[][] A1b = C110105dW.A1b(this, A1X);
        this.A0R = A1b;
        int[] iArr = {-16711936, -65536, -16777216, -7829368};
        this.A0Q = iArr;
        C110115dX.A16(this, iArr, A1b);
    }

    public FormItemEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean A1X = C110105dW.A1X(this);
        int[][] A1b = C110105dW.A1b(this, A1X);
        this.A0R = A1b;
        int[] iArr = {-16711936, -65536, -16777216, -7829368};
        this.A0Q = iArr;
        C110115dX.A16(this, iArr, A1b);
        A05(context, attributeSet);
    }

    public FormItemEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean A1X = C110105dW.A1X(this);
        int[][] A1b = C110105dW.A1b(this, A1X);
        this.A0R = A1b;
        int[] iArr = {-16711936, -65536, -16777216, -7829368};
        this.A0Q = iArr;
        C110115dX.A16(this, iArr, A1b);
        A05(context, attributeSet);
    }

    private CharSequence getFullText() {
        return this.A0E == null ? getText() : getMaskChars();
    }

    private StringBuilder getMaskChars() {
        if (this.A0G == null) {
            this.A0G = AnonymousClass000.A0o();
        }
        int length = getText().length();
        while (true) {
            StringBuilder sb = this.A0G;
            if (sb.length() == length) {
                return sb;
            }
            if (sb.length() < length) {
                sb.append(this.A0E);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    private void setError(boolean z2) {
        this.A0I = z2;
    }

    /* JADX INFO: finally extract failed */
    public final void A05(Context context, AttributeSet attributeSet) {
        this.A01 = C110105dW.A00(this, this.A01);
        this.A02 = C110105dW.A00(this, this.A02);
        this.A04 = C110105dW.A00(this, this.A04);
        this.A05 = C110105dW.A00(this, this.A05);
        boolean z2 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C115685q9.A00, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(0, typedValue);
            this.A06 = typedValue.data;
            this.A0E = obtainStyledAttributes.getString(3);
            this.A0F = obtainStyledAttributes.getString(11);
            this.A01 = obtainStyledAttributes.getDimension(8, this.A01);
            this.A02 = obtainStyledAttributes.getDimension(10, this.A02);
            this.A0K = obtainStyledAttributes.getBoolean(9, false);
            this.A00 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A04 = obtainStyledAttributes.getDimension(5, this.A04);
            this.A05 = obtainStyledAttributes.getDimension(12, this.A05);
            this.A0J = obtainStyledAttributes.getBoolean(2, this.A0J);
            this.A0C = obtainStyledAttributes.getDrawable(1);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(7);
            if (colorStateList != null) {
                this.A07 = colorStateList;
            }
            obtainStyledAttributes.recycle();
            this.A08 = new Paint(getPaint());
            this.A09 = new Paint(getPaint());
            this.A0B = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A0A = paint;
            paint.setStrokeWidth(this.A01);
            setFontSize(this.A00);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.attr00ea, typedValue2, true);
            int i2 = typedValue2.data;
            int[] iArr = this.A0Q;
            iArr[0] = i2;
            iArr[1] = -7829368;
            iArr[2] = -7829368;
            setBackgroundResource(0);
            this.A03 = (float) attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
            super.setOnClickListener(C110115dX.A06(this, 149));
            super.setOnLongClickListener(new C119665yq(this));
            if (((getInputType() & 128) == 128 && TextUtils.isEmpty(this.A0E)) || ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.A0E))) {
                this.A0E = "●";
            }
            if (!TextUtils.isEmpty(this.A0E)) {
                this.A0G = getMaskChars();
            }
            getPaint().getTextBounds("|", 0, 1, this.A0P);
            if (this.A06 > -1) {
                z2 = true;
            }
            this.A0H = z2;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void onDraw(Canvas canvas) {
        int i2;
        Paint paint;
        int[] iArr;
        int i3;
        int i4;
        float f2;
        float f3;
        Paint paint2;
        int[] iArr2;
        int i5;
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = this.A0N;
        int length2 = fArr.length;
        if (length2 < length) {
            float[] fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, length2);
            fArr = fArr2;
        }
        this.A0N = fArr;
        getPaint().getTextWidths(fullText, 0, length, this.A0N);
        String str = this.A0F;
        float f4 = 0.0f;
        if (str != null) {
            float[] fArr3 = this.A0L;
            int length3 = str.length();
            int length4 = fArr3.length;
            if (length4 < length3) {
                float[] fArr4 = new float[length3];
                System.arraycopy(fArr3, 0, fArr4, 0, length4);
                fArr3 = fArr4;
            }
            this.A0L = fArr3;
            getPaint().getTextWidths(this.A0F, this.A0L);
            for (int i6 = 0; i6 < this.A0F.length(); i6++) {
                f4 += this.A0L[i6];
            }
        }
        for (int i7 = 0; ((float) i7) < this.A03; i7++) {
            Drawable drawable = this.A0C;
            boolean z2 = true;
            Canvas canvas2 = canvas;
            if (drawable != null) {
                boolean z3 = false;
                if (i7 < length) {
                    z3 = true;
                }
                boolean A1R = AnonymousClass000.A1R(i7, length);
                if (this.A0I) {
                    iArr2 = new int[1];
                    i5 = 16842914;
                } else {
                    boolean isFocused = isFocused();
                    drawable = this.A0C;
                    iArr2 = new int[1];
                    if (isFocused) {
                        iArr2[0] = 16842908;
                        drawable.setState(iArr2);
                        if (A1R) {
                            drawable = this.A0C;
                            iArr2 = new int[]{16842908, 16842913};
                        } else {
                            if (z3) {
                                drawable = this.A0C;
                                iArr2 = new int[]{16842908, 16842912};
                            }
                            Drawable drawable2 = this.A0C;
                            RectF rectF = this.A0O[i7];
                            drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            this.A0C.draw(canvas2);
                        }
                        drawable.setState(iArr2);
                        Drawable drawable22 = this.A0C;
                        RectF rectF2 = this.A0O[i7];
                        drawable22.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        this.A0C.draw(canvas2);
                    } else {
                        i5 = -16842908;
                    }
                }
                iArr2[0] = i5;
                drawable.setState(iArr2);
                Drawable drawable222 = this.A0C;
                RectF rectF22 = this.A0O[i7];
                drawable222.setBounds((int) rectF22.left, (int) rectF22.top, (int) rectF22.right, (int) rectF22.bottom);
                this.A0C.draw(canvas2);
            }
            float f5 = this.A0O[i7].left + (this.A00 / 2.0f);
            if (length > i7) {
                if (!this.A0H || i7 != length - 1) {
                    i4 = i7 + 1;
                    f2 = f5 - (this.A0N[i7] / 2.0f);
                    f3 = this.A0M[i7];
                    paint2 = this.A08;
                } else {
                    i4 = i7 + 1;
                    f2 = f5 - (this.A0N[i7] / 2.0f);
                    f3 = this.A0M[i7];
                    paint2 = this.A09;
                }
                canvas2.drawText(fullText, i7, i4, f2, f3, paint2);
            } else {
                String str2 = this.A0F;
                if (str2 != null) {
                    canvas2.drawText(str2, f5 - (f4 / 2.0f), this.A0M[i7], this.A0B);
                }
            }
            if (this.A0C == null) {
                boolean z4 = false;
                if (i7 < length) {
                    z4 = true;
                }
                if (i7 != length) {
                    z2 = false;
                }
                if (this.A0I) {
                    paint = this.A0A;
                    iArr = new int[1];
                    i3 = 16842914;
                } else {
                    this.A0A.setStrokeWidth(isFocused() ? this.A02 : this.A01);
                    if (z4) {
                        paint = this.A0A;
                        iArr = new int[1];
                        i3 = 16842913;
                    } else {
                        boolean isFocused2 = isFocused();
                        int[] iArr3 = new int[1];
                        if (z2) {
                            i2 = -16842918;
                            if (isFocused2) {
                                i2 = 16842918;
                            }
                        } else {
                            i2 = -16842908;
                            if (isFocused2) {
                                i2 = 16842908;
                            }
                        }
                        iArr3[0] = i2;
                        this.A0A.setColor(this.A07.getColorForState(iArr3, -7829368));
                        RectF rectF3 = this.A0O[i7];
                        canvas2.drawLine(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, this.A0A);
                    }
                }
                iArr[0] = i3;
                paint.setColor(this.A07.getColorForState(iArr, -7829368));
                RectF rectF32 = this.A0O[i7];
                canvas2.drawLine(rectF32.left, rectF32.top, rectF32.right, rectF32.bottom, this.A0A);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            super.onSizeChanged(r11, r12, r13, r14)
            android.content.res.ColorStateList r2 = r10.getTextColors()
            if (r2 == 0) goto L_0x0024
            android.graphics.Paint r1 = r10.A09
            int r0 = r2.getDefaultColor()
            r1.setColor(r0)
            android.graphics.Paint r1 = r10.A08
            int r0 = r2.getDefaultColor()
            r1.setColor(r0)
            android.graphics.Paint r1 = r10.A0B
            int r0 = r10.getCurrentHintTextColor()
            r1.setColor(r0)
        L_0x0024:
            int r1 = r10.getWidth()
            int r0 = X.C004601z.A07(r10)
            int r1 = r1 - r0
            int r0 = X.C004601z.A08(r10)
            int r1 = r1 - r0
            float r4 = r10.A04
            r3 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f2
            float r2 = (float) r1
            float r0 = r10.A03
            float r0 = r0 * r8
            float r0 = r0 - r3
            float r2 = r2 / r0
        L_0x0043:
            r10.A00 = r2
        L_0x0045:
            float r0 = r10.A03
            int r1 = (int) r0
            android.graphics.RectF[] r0 = new android.graphics.RectF[r1]
            r10.A0O = r0
            float[] r0 = new float[r1]
            r10.A0M = r0
            int r5 = r10.getHeight()
            int r0 = r10.getPaddingBottom()
            int r5 = r5 - r0
            int r0 = r10.getPaddingTop()
            int r5 = r5 - r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = X.C012406c.A00(r0)
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L_0x00ed
            r3 = -1
            int r1 = r10.getWidth()
            int r0 = X.C004601z.A08(r10)
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = r10.A00
            float r1 = r1 - r0
            int r7 = (int) r1
        L_0x0079:
            float r1 = (float) r4
            float r0 = r10.A03
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0102
            android.graphics.RectF[] r6 = r10.A0O
            float r7 = (float) r7
            float r2 = (float) r5
            float r1 = r10.A00
            float r1 = r1 + r7
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r2, r1, r2)
            r6[r4] = r0
            android.graphics.drawable.Drawable r0 = r10.A0C
            if (r0 == 0) goto L_0x00ac
            boolean r1 = r10.A0J
            android.graphics.RectF[] r0 = r10.A0O
            r6 = r0[r4]
            if (r1 == 0) goto L_0x00dc
            int r0 = r10.getPaddingTop()
            float r0 = (float) r0
            r6.top = r0
            android.graphics.RectF[] r0 = r10.A0O
            r1 = r0[r4]
            float r0 = r1.height()
            float r0 = r0 + r7
            r1.right = r0
        L_0x00ac:
            float r6 = r10.A04
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            float r1 = (float) r3
            float r0 = r10.A00
            if (r2 >= 0) goto L_0x00d9
            float r1 = r1 * r0
            float r1 = r1 * r8
        L_0x00b7:
            float r7 = r7 + r1
            int r7 = (int) r7
            float[] r6 = r10.A0M
            android.graphics.RectF[] r2 = r10.A0O
            r0 = r2[r4]
            float r1 = r0.bottom
            float r0 = r10.A05
            float r1 = r1 - r0
            r6[r4] = r1
            boolean r0 = r10.A0K
            if (r0 == 0) goto L_0x00d6
            r1 = r2[r4]
            float r0 = r1.top
            float r0 = r0 / r8
            r1.top = r0
            float r0 = r1.bottom
            float r0 = r0 / r8
            r1.bottom = r0
        L_0x00d6:
            int r4 = r4 + 1
            goto L_0x0079
        L_0x00d9:
            float r0 = r0 + r6
            float r1 = r1 * r0
            goto L_0x00b7
        L_0x00dc:
            float r2 = r6.top
            android.graphics.Rect r0 = r10.A0P
            int r0 = r0.height()
            float r1 = (float) r0
            float r0 = r10.A05
            float r0 = r0 * r8
            float r1 = r1 + r0
            float r2 = r2 - r1
            r6.top = r2
            goto L_0x00ac
        L_0x00ed:
            int r7 = X.C004601z.A08(r10)
            goto L_0x0079
        L_0x00f2:
            float r0 = r10.A00
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            float r2 = (float) r1
            float r1 = r10.A03
            float r0 = r1 - r3
            float r4 = r4 * r0
            float r2 = r2 - r4
            float r2 = r2 / r1
            goto L_0x0043
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.commonlibrary.widget.FormItemEditText.onSizeChanged(int, int, int, int):void");
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.A0I = false;
        RectF[] rectFArr = this.A0O;
        if (rectFArr != null && this.A0H) {
            int i5 = this.A06;
            if (i5 == -1) {
                invalidate();
            } else if (i4 <= i3) {
            } else {
                if (i5 == 0) {
                    this.A09.setAlpha(125);
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{125, MotionEventCompat.ACTION_MASK});
                    ofInt.setDuration(150);
                    ofInt.addUpdateListener(new IDxUListenerShape142S0100000_3_I1(this, 1));
                    AnimatorSet animatorSet = new AnimatorSet();
                    charSequence.length();
                    animatorSet.playTogether(new Animator[]{ofInt});
                    animatorSet.start();
                    return;
                }
                float[] fArr = this.A0M;
                float f2 = rectFArr[i2].bottom - this.A05;
                fArr[i2] = f2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2 + getPaint().getTextSize(), this.A0M[i2]});
                ofFloat.setDuration(300);
                ofFloat.setInterpolator(new OvershootInterpolator());
                ofFloat.addUpdateListener(new C119435xs(this, i2));
                this.A09.setAlpha(MotionEventCompat.ACTION_MASK);
                ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0, MotionEventCompat.ACTION_MASK});
                ofInt2.setDuration(300);
                ofInt2.addUpdateListener(new IDxUListenerShape142S0100000_3_I1(this, 2));
                AnimatorSet animatorSet2 = new AnimatorSet();
                charSequence.length();
                animatorSet2.playTogether(new Animator[]{ofFloat, ofInt2});
                animatorSet2.start();
            }
        }
    }

    public boolean performClick() {
        return super.performClick();
    }

    public void setCharSize(float f2) {
        this.A00 = f2;
        invalidate();
    }

    public void setColorStates(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        invalidate();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw AnonymousClass000.A0a("setCustomSelectionActionModeCallback() not supported.");
    }

    public void setFontSize(float f2) {
        this.A08.setTextSize(f2);
        this.A09.setTextSize(f2);
        this.A0B.setTextSize(f2);
    }

    public void setLineStroke(float f2) {
        this.A01 = f2;
        invalidate();
    }

    public void setLineStrokeCentered(boolean z2) {
        this.A0K = z2;
        invalidate();
    }

    public void setLineStrokeSelected(float f2) {
        this.A02 = f2;
        invalidate();
    }

    public void setMargin(int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        setLayoutParams(marginLayoutParams);
    }

    public void setMaxLength(int i2) {
        this.A03 = (float) i2;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0D = onClickListener;
    }

    public void setSpace(float f2) {
        this.A04 = f2;
        invalidate();
    }
}
