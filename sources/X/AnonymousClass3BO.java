package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.text.TextPaint;
import android.view.View;

/* renamed from: X.3BO  reason: invalid class name */
public final class AnonymousClass3BO {
    public static final boolean A0j;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = 15.0f;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F = 15.0f;
    public float A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public int A0K = 16;
    public int A0L;
    public int A0M = 16;
    public TimeInterpolator A0N;
    public TimeInterpolator A0O;
    public ColorStateList A0P;
    public ColorStateList A0Q;
    public Bitmap A0R;
    public Paint A0S;
    public Typeface A0T;
    public Typeface A0U;
    public Typeface A0V;
    public CharSequence A0W;
    public CharSequence A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public final Rect A0d;
    public final Rect A0e;
    public final RectF A0f;
    public final TextPaint A0g;
    public final TextPaint A0h;
    public final View A0i;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 18) {
            z2 = true;
        }
        A0j = z2;
    }

    public AnonymousClass3BO(View view) {
        this.A0i = view;
        TextPaint textPaint = new TextPaint(129);
        this.A0g = textPaint;
        this.A0h = new TextPaint(textPaint);
        this.A0d = AnonymousClass000.A0J();
        this.A0e = AnonymousClass000.A0J();
        this.A0f = AnonymousClass000.A0K();
    }

    public static float A00(AnonymousClass3BO r2) {
        TextPaint textPaint = r2.A0h;
        textPaint.setTextSize(r2.A05);
        Typeface typeface = r2.A0T;
        return -textPaint.ascent();
    }

    public static int A01(float f2, int i2, int i3) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    public final Typeface A02(int i2) {
        TypedArray obtainStyledAttributes = this.A0i.getContext().obtainStyledAttributes(i2, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1.height() <= 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r2 = this;
            android.graphics.Rect r1 = r2.A0d
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x001d
            int r0 = r1.height()
            if (r0 <= 0) goto L_0x001d
            android.graphics.Rect r1 = r2.A0e
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x001d
            int r1 = r1.height()
            r0 = 1
            if (r1 > 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r2.A0Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BO.A03():void");
    }

    public void A04() {
        Rect rect;
        float f2;
        float f3;
        float f4;
        Rect rect2;
        float f5;
        float f6;
        float f7;
        View view = this.A0i;
        if (view.getHeight() > 0 && view.getWidth() > 0) {
            float f8 = this.A08;
            A07(this.A05);
            CharSequence charSequence = this.A0X;
            float f9 = 0.0f;
            float measureText = charSequence != null ? this.A0g.measureText(charSequence, 0, charSequence.length()) : 0.0f;
            int A002 = C05570Sc.A00(this.A0K, this.A0a ? 1 : 0);
            int i2 = A002 & 112;
            if (i2 == 48) {
                rect = this.A0d;
                f2 = ((float) rect.top) - this.A0g.ascent();
                this.A01 = f2;
            } else if (i2 != 80) {
                TextPaint textPaint = this.A0g;
                float descent = ((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent();
                rect = this.A0d;
                this.A01 = ((float) rect.centerY()) + descent;
            } else {
                rect = this.A0d;
                f2 = (float) rect.bottom;
                this.A01 = f2;
            }
            int i3 = A002 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            if (i3 == 1) {
                f3 = (float) rect.centerX();
                measureText /= 2.0f;
                f4 = f3 - measureText;
            } else if (i3 != 5) {
                f4 = (float) rect.left;
            } else {
                f3 = (float) rect.right;
                f4 = f3 - measureText;
            }
            this.A00 = f4;
            A07(this.A0F);
            CharSequence charSequence2 = this.A0X;
            if (charSequence2 != null) {
                f9 = this.A0g.measureText(charSequence2, 0, charSequence2.length());
            }
            int A003 = C05570Sc.A00(this.A0M, this.A0a ? 1 : 0);
            int i4 = A003 & 112;
            if (i4 == 48) {
                rect2 = this.A0e;
                f5 = ((float) rect2.top) - this.A0g.ascent();
                this.A0A = f5;
            } else if (i4 != 80) {
                TextPaint textPaint2 = this.A0g;
                float descent2 = ((textPaint2.descent() - textPaint2.ascent()) / 2.0f) - textPaint2.descent();
                rect2 = this.A0e;
                this.A0A = ((float) rect2.centerY()) + descent2;
            } else {
                rect2 = this.A0e;
                f5 = (float) rect2.bottom;
                this.A0A = f5;
            }
            int i5 = A003 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            if (i5 == 1) {
                f6 = (float) rect2.centerX();
                f9 /= 2.0f;
                f7 = f6 - f9;
            } else if (i5 != 5) {
                f7 = (float) rect2.left;
            } else {
                f6 = (float) rect2.right;
                f7 = f6 - f9;
            }
            this.A09 = f7;
            Bitmap bitmap = this.A0R;
            if (bitmap != null) {
                bitmap.recycle();
                this.A0R = null;
            }
            A08(f8);
            A06(this.A0B);
        }
    }

    public void A05(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.A0B) {
            this.A0B = f2;
            A06(f2);
        }
    }

    public final void A06(float f2) {
        int colorForState;
        float f3 = f2;
        RectF rectF = this.A0f;
        Rect rect = this.A0e;
        float f4 = (float) rect.left;
        Rect rect2 = this.A0d;
        float f5 = (float) rect2.left;
        TimeInterpolator timeInterpolator = this.A0N;
        float f6 = f2;
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f2);
        }
        rectF.left = AnonymousClass000.A01(f5, f4, f6);
        float f7 = this.A0A;
        float f8 = this.A01;
        TimeInterpolator timeInterpolator2 = this.A0N;
        float f9 = f2;
        if (timeInterpolator2 != null) {
            f9 = timeInterpolator2.getInterpolation(f2);
        }
        rectF.top = AnonymousClass000.A01(f8, f7, f9);
        float f10 = (float) rect.right;
        float f11 = (float) rect2.right;
        TimeInterpolator timeInterpolator3 = this.A0N;
        float f12 = f2;
        if (timeInterpolator3 != null) {
            f12 = timeInterpolator3.getInterpolation(f2);
        }
        rectF.right = AnonymousClass000.A01(f11, f10, f12);
        float f13 = (float) rect.bottom;
        float f14 = (float) rect2.bottom;
        TimeInterpolator timeInterpolator4 = this.A0N;
        if (timeInterpolator4 != null) {
            f3 = timeInterpolator4.getInterpolation(f2);
        }
        rectF.bottom = AnonymousClass000.A01(f14, f13, f3);
        float f15 = this.A09;
        float f16 = this.A00;
        TimeInterpolator timeInterpolator5 = this.A0N;
        float f17 = f2;
        if (timeInterpolator5 != null) {
            f17 = timeInterpolator5.getInterpolation(f2);
        }
        this.A06 = AnonymousClass000.A01(f16, f15, f17);
        float f18 = this.A0A;
        float f19 = this.A01;
        TimeInterpolator timeInterpolator6 = this.A0N;
        float f20 = f2;
        if (timeInterpolator6 != null) {
            f20 = timeInterpolator6.getInterpolation(f2);
        }
        this.A07 = AnonymousClass000.A01(f19, f18, f20);
        float f21 = this.A0F;
        float f22 = this.A05;
        TimeInterpolator timeInterpolator7 = this.A0O;
        float f23 = f2;
        if (timeInterpolator7 != null) {
            f23 = timeInterpolator7.getInterpolation(f2);
        }
        A08(AnonymousClass000.A01(f22, f21, f23));
        ColorStateList colorStateList = this.A0P;
        ColorStateList colorStateList2 = this.A0Q;
        TextPaint textPaint = this.A0g;
        int[] iArr = this.A0c;
        if (colorStateList != colorStateList2) {
            int colorForState2 = iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor();
            int[] iArr2 = this.A0c;
            colorForState = A01(f2, colorForState2, iArr2 != null ? this.A0P.getColorForState(iArr2, 0) : this.A0P.getDefaultColor());
        } else {
            colorForState = iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
        }
        textPaint.setColor(colorForState);
        textPaint.setShadowLayer(AnonymousClass000.A01(this.A04, this.A0E, f2), AnonymousClass000.A01(this.A02, this.A0C, f2), AnonymousClass000.A01(this.A03, this.A0D, f2), A01(f2, this.A0L, this.A0J));
        this.A0i.postInvalidateOnAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r0 != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(float r11) {
        /*
            r10 = this;
            java.lang.CharSequence r0 = r10.A0W
            if (r0 == 0) goto L_0x008c
            android.graphics.Rect r0 = r10.A0d
            int r0 = r0.width()
            float r8 = (float) r0
            android.graphics.Rect r0 = r10.A0e
            int r0 = r0.width()
            float r7 = (float) r0
            float r6 = r10.A05
            float r0 = r11 - r6
            float r1 = java.lang.Math.abs(r0)
            r0 = 981668463(0x3a83126f, float:0.001)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0023
            r0 = 1
        L_0x0023:
            r5 = 1065353216(0x3f800000, float:1.0)
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0092
            r10.A0G = r5
            android.graphics.Typeface r1 = r10.A0U
            android.graphics.Typeface r0 = r10.A0T
            if (r1 == r0) goto L_0x0090
            r10.A0U = r0
            r9 = 1
        L_0x0034:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            float r0 = r10.A08
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            boolean r0 = r10.A0Y
            if (r0 != 0) goto L_0x0047
            r0 = r9
            r9 = 0
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r9 = 1
        L_0x0048:
            r10.A08 = r6
            r10.A0Y = r3
        L_0x004c:
            java.lang.CharSequence r0 = r10.A0X
            if (r0 == 0) goto L_0x0052
            if (r9 == 0) goto L_0x008c
        L_0x0052:
            android.text.TextPaint r2 = r10.A0g
            float r0 = r10.A08
            r2.setTextSize(r0)
            android.graphics.Typeface r0 = r10.A0U
            float r0 = r10.A0G
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            r4 = 0
        L_0x0062:
            r2.setLinearText(r4)
            java.lang.CharSequence r1 = r10.A0W
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r1, r2, r8, r0)
            java.lang.CharSequence r0 = r10.A0X
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x008c
            r10.A0X = r2
            android.view.View r0 = r10.A0i
            int r1 = X.C004601z.A06(r0)
            r0 = 1
            if (r1 != r0) goto L_0x008d
            X.02F r1 = X.AnonymousClass02G.A02
        L_0x0082:
            int r0 = r2.length()
            boolean r0 = r1.AJb(r2, r3, r0)
            r10.A0a = r0
        L_0x008c:
            return
        L_0x008d:
            X.02F r1 = X.AnonymousClass02G.A01
            goto L_0x0082
        L_0x0090:
            r9 = 0
            goto L_0x0034
        L_0x0092:
            float r2 = r10.A0F
            android.graphics.Typeface r1 = r10.A0U
            android.graphics.Typeface r0 = r10.A0V
            if (r1 == r0) goto L_0x00c1
            r10.A0U = r0
            r9 = 1
        L_0x009d:
            float r0 = r11 - r2
            float r1 = java.lang.Math.abs(r0)
            r0 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
            r10.A0G = r5
        L_0x00ac:
            float r6 = r6 / r2
            float r0 = r7 * r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
            float r8 = r8 / r6
            float r8 = java.lang.Math.min(r8, r7)
        L_0x00b8:
            r6 = r2
            goto L_0x0034
        L_0x00bb:
            r8 = r7
            goto L_0x00b8
        L_0x00bd:
            float r11 = r11 / r2
            r10.A0G = r11
            goto L_0x00ac
        L_0x00c1:
            r9 = 0
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BO.A07(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r9.A0G == 1.0f) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(float r10) {
        /*
            r9 = this;
            r9.A07(r10)
            boolean r0 = A0j
            if (r0 == 0) goto L_0x0010
            float r1 = r9.A0G
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r9.A0b = r0
            if (r0 == 0) goto L_0x0080
            android.graphics.Bitmap r0 = r9.A0R
            if (r0 != 0) goto L_0x0080
            android.graphics.Rect r0 = r9.A0e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0080
            java.lang.CharSequence r0 = r9.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0080
            r0 = 0
            r9.A06(r0)
            android.text.TextPaint r8 = r9.A0g
            float r0 = r8.ascent()
            r9.A0H = r0
            float r0 = r8.descent()
            r9.A0I = r0
            java.lang.CharSequence r2 = r9.A0X
            r1 = 0
            int r0 = r2.length()
            float r0 = r8.measureText(r2, r1, r0)
            int r2 = java.lang.Math.round(r0)
            float r1 = r9.A0I
            float r0 = r9.A0H
            float r1 = r1 - r0
            int r1 = java.lang.Math.round(r1)
            if (r2 <= 0) goto L_0x0080
            if (r1 <= 0) goto L_0x0080
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r9.A0R = r0
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            java.lang.CharSequence r3 = r9.A0X
            r4 = 0
            int r5 = r3.length()
            r6 = 0
            float r7 = (float) r1
            float r0 = r8.descent()
            float r7 = r7 - r0
            r2.drawText(r3, r4, r5, r6, r7, r8)
            android.graphics.Paint r0 = r9.A0S
            if (r0 != 0) goto L_0x0080
            r0 = 3
            android.graphics.Paint r0 = X.C13700nu.A06(r0)
            r9.A0S = r0
        L_0x0080:
            android.view.View r0 = r9.A0i
            r0.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BO.A08(float):void");
    }

    public void A09(int i2) {
        Context context = this.A0i.getContext();
        AnonymousClass07T r2 = new AnonymousClass07T(context, context.obtainStyledAttributes(i2, AnonymousClass05L.A0M));
        TypedArray typedArray = r2.A02;
        if (typedArray.hasValue(3)) {
            this.A0P = r2.A01(3);
        }
        if (typedArray.hasValue(0)) {
            this.A05 = (float) typedArray.getDimensionPixelSize(0, (int) this.A05);
        }
        this.A0J = typedArray.getInt(6, 0);
        this.A02 = typedArray.getFloat(7, 0.0f);
        this.A03 = typedArray.getFloat(8, 0.0f);
        this.A04 = typedArray.getFloat(9, 0.0f);
        r2.A04();
        this.A0T = A02(i2);
        A04();
    }

    public void A0A(int i2) {
        Context context = this.A0i.getContext();
        AnonymousClass07T r2 = new AnonymousClass07T(context, context.obtainStyledAttributes(i2, AnonymousClass05L.A0M));
        TypedArray typedArray = r2.A02;
        if (typedArray.hasValue(3)) {
            this.A0Q = r2.A01(3);
        }
        if (typedArray.hasValue(0)) {
            this.A0F = (float) typedArray.getDimensionPixelSize(0, (int) this.A0F);
        }
        this.A0L = typedArray.getInt(6, 0);
        this.A0C = typedArray.getFloat(7, 0.0f);
        this.A0D = typedArray.getFloat(8, 0.0f);
        this.A0E = typedArray.getFloat(9, 0.0f);
        r2.A04();
        this.A0V = A02(i2);
        A04();
    }

    public void A0B(int i2, int i3, int i4, int i5) {
        Rect rect = this.A0d;
        if (rect.left != i2 || rect.top != i3 || rect.right != i4 || rect.bottom != i5) {
            rect.set(i2, i3, i4, i5);
            this.A0Y = true;
            A03();
        }
    }

    public void A0C(int i2, int i3, int i4, int i5) {
        Rect rect = this.A0e;
        if (rect.left != i2 || rect.top != i3 || rect.right != i4 || rect.bottom != i5) {
            rect.set(i2, i3, i4, i5);
            this.A0Y = true;
            A03();
        }
    }

    public void A0D(Canvas canvas) {
        boolean z2;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        if (this.A0X != null && this.A0Z) {
            float f2 = this.A06;
            float f3 = this.A07;
            if (!this.A0b || this.A0R == null) {
                z2 = false;
                TextPaint textPaint = this.A0g;
                textPaint.ascent();
                textPaint.descent();
            } else {
                z2 = true;
                f3 += this.A0H * this.A0G;
            }
            float f4 = this.A0G;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (z2) {
                canvas.drawBitmap(this.A0R, f2, f3, this.A0S);
            } else {
                CharSequence charSequence = this.A0X;
                canvas2.drawText(charSequence, 0, charSequence.length(), f2, f3, this.A0g);
            }
        }
        canvas.restoreToCount(save);
    }

    public void A0E(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.A0W)) {
            this.A0W = charSequence;
            this.A0X = null;
            Bitmap bitmap = this.A0R;
            if (bitmap != null) {
                bitmap.recycle();
                this.A0R = null;
            }
            A04();
        }
    }
}
