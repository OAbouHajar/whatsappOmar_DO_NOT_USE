package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v4.view.MotionEventCompat;
import android.view.View;

/* renamed from: X.0IS  reason: invalid class name */
public final class AnonymousClass0IS extends AnonymousClass0IT {
    public static final Matrix A0X = AnonymousClass000.A0H();
    public static final Paint A0Y = new Paint(1);
    public static final Path A0Z = AnonymousClass000.A0I();
    public static final C05150Pm A0a = new C05150Pm();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;
    public View A0G;
    public AnonymousClass074 A0H;
    public C04660Nk A0I;
    public AnonymousClass020 A0J;
    public Object A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final float A0R;
    public final float A0S;
    public final int A0T;
    public final float[] A0U;
    public final float[] A0V;
    public final float[] A0W = new float[2];

    public AnonymousClass0IS(AnonymousClass074 r7, AnonymousClass0UE r8) {
        super(r7);
        float[] fArr = new float[2];
        this.A0V = fArr;
        float[] fArr2 = new float[2];
        this.A0U = fArr2;
        AnonymousClass020 r2 = r8.A01;
        this.A0J = r2;
        this.A00 = C06540Wn.A01(r2.A01);
        this.A01 = C06540Wn.A00(r2.A00);
        C04660Nk r0 = r8.A00;
        this.A0I = r0 == null ? AnonymousClass0Wt.A00() : r0;
        this.A0M = r8.A03;
        this.A0L = r8.A02;
        this.A04 = true;
        this.A02 = 0.0f;
        float[] fArr3 = r8.A06;
        fArr2[0] = fArr3[0];
        fArr2[1] = fArr3[1];
        float[] fArr4 = r8.A07;
        fArr[0] = fArr4[0];
        fArr[1] = fArr4[1];
        float f2 = this.A05;
        this.A0S = 48.0f * f2;
        this.A0T = (int) (8.0f * f2);
        this.A0R = f2 * 5.0f;
        A0H();
    }

    public int A00(float f2, float f3) {
        if (this.A0P) {
            Matrix matrix = A0X;
            matrix.setRotate(this.A05);
            float[] fArr = this.A0W;
            fArr[0] = this.A01 - this.A03;
            fArr[1] = this.A0A - this.A06;
            matrix.mapPoints(fArr);
            fArr[0] = fArr[0] + this.A0C;
            float f4 = fArr[1] + (this.A0D - this.A0R);
            fArr[1] = f4;
            int i2 = this.A0F;
            float f5 = (float) this.A0E;
            float f6 = f4 - f5;
            float f7 = fArr[0];
            float f8 = (float) (i2 >> 1);
            float f9 = f7 - f8;
            float f10 = f7 + f8;
            float f11 = this.A0S;
            if (f5 <= f11) {
                float f12 = this.A0B;
                f6 -= f12;
                f4 -= f12;
            }
            if (((float) i2) <= f11) {
                float f13 = this.A02;
                f9 -= f13;
                f10 += f13;
            }
            if (f2 >= f9 && f2 <= f10 && f3 >= f6 && f3 <= f4) {
                this.A0N = true;
                return 2;
            }
        }
        this.A0N = false;
        if (!A0K()) {
            return 0;
        }
        long nanoTime = System.nanoTime();
        try {
            float[] fArr2 = this.A0W;
            fArr2[0] = f2;
            fArr2[1] = f3;
            Matrix matrix2 = A0X;
            matrix2.setRotate(-this.A05, this.A0C, this.A0D);
            matrix2.mapPoints(fArr2);
            float f14 = fArr2[0];
            float f15 = this.A0C;
            float f16 = f15 - this.A03;
            if (f14 >= f16 && f14 <= this.A04 + f15) {
                float f17 = fArr2[1];
                float f18 = this.A0D;
                if (f17 >= f18 - this.A06 && f17 <= f18 + this.A00) {
                    return 2;
                }
            }
            float f19 = this.A02;
            if (f14 >= f16 - f19 && f14 <= f15 + this.A04 + f19) {
                float f20 = fArr2[1];
                float f21 = this.A0D;
                float f22 = this.A0B;
                if (f20 >= (f21 - this.A06) - f22 && f20 <= f21 + this.A00 + f22) {
                    AnonymousClass0V3.A01(AnonymousClass0V3.A0H, nanoTime);
                    return 1;
                }
            }
            AnonymousClass0V3.A01(AnonymousClass0V3.A0H, nanoTime);
            return 0;
        } finally {
            AnonymousClass0V3.A01(AnonymousClass0V3.A0H, nanoTime);
        }
    }

    public AnonymousClass020 A01() {
        return this.A0J;
    }

    public void A04() {
        A0E();
    }

    public void A06() {
        if (this.A0P) {
            A0E();
        }
        this.A09.A0C(this);
    }

    public void A08(float f2, float f3) {
        if (this.A0N) {
            this.A0O = true;
            A02();
        }
    }

    public void A09(float f2, float f3) {
        if (this.A0N && this.A0O) {
            this.A0O = false;
            A02();
        }
    }

    public boolean A0B(float f2, float f3) {
        AnonymousClass074 r0;
        C12790ky r02;
        AnonymousClass074 r4 = this.A09;
        if (!this.A0N || (r0 = this.A0H) == null || (r02 = r0.A0A) == null) {
            AnonymousClass074 r03 = this.A0H;
            if (r03 != null) {
                C12820l1 r04 = r03.A0D;
                if (r04 != null) {
                    r04.ATL(this);
                    return true;
                }
                A0F();
                AnonymousClass020 r05 = this.A0J;
                AnonymousClass076 r2 = new AnonymousClass076();
                r2.A06 = r05;
                r4.A0A(r2, (AnonymousClass077) null, 500);
                return true;
            }
        } else {
            r02.ASE(this);
        }
        return true;
    }

    public void A0D(Canvas canvas) {
        long nanoTime = System.nanoTime();
        try {
            Bitmap bitmap = this.A0I.A00;
            boolean z2 = this.A0P && !(this.A0M == null && this.A0L == null);
            if (A0K()) {
                Paint paint = A0Y;
                paint.setAlpha((int) (1.0f * 255.0f));
                Matrix matrix = A0X;
                matrix.setTranslate(this.A0C - this.A03, this.A0D - this.A06);
                matrix.postRotate(this.A05, this.A0C, this.A0D);
                Canvas canvas2 = canvas;
                canvas2.drawBitmap(bitmap, matrix, paint);
                paint.setAlpha(MotionEventCompat.ACTION_MASK);
                if (z2) {
                    float[] fArr = this.A0W;
                    fArr[0] = this.A01;
                    fArr[1] = this.A0A;
                    matrix.mapPoints(fArr);
                    long nanoTime2 = System.nanoTime();
                    int i2 = this.A0F / 2;
                    if (this.A0Q) {
                        Path path = A0Z;
                        path.reset();
                        float f2 = (float) i2;
                        float f3 = fArr[1] - ((float) this.A0E);
                        float f4 = this.A0R;
                        float f5 = f4 * ((float) 1);
                        path.moveTo(fArr[0] - f2, f3 - f5);
                        path.lineTo(fArr[0] + f2, (fArr[1] - ((float) this.A0E)) - f5);
                        path.lineTo(fArr[0] + f2, fArr[1] - f5);
                        path.lineTo(fArr[0] + f4, fArr[1] - f5);
                        path.lineTo(fArr[0], fArr[1]);
                        path.lineTo(fArr[0] - f4, fArr[1] - f5);
                        path.lineTo(fArr[0] - f2, fArr[1] - f5);
                        path.close();
                        paint.setColor(-16777216);
                        paint.setShadowLayer(12.0f, 0.0f, 0.0f, -16777216);
                        canvas2.drawPath(path, paint);
                        int i3 = -1;
                        if (this.A0O) {
                            i3 = -2236963;
                        }
                        paint.setColor(i3);
                        canvas2.drawPath(path, paint);
                    }
                    matrix.setTranslate(fArr[0] - ((float) i2), (fArr[1] - ((float) this.A0E)) - this.A0R);
                    this.A0G.setDrawingCacheEnabled(true);
                    canvas2.drawBitmap(this.A0G.getDrawingCache(), matrix, paint);
                    AnonymousClass0V3.A01(AnonymousClass0V3.A0D, nanoTime2);
                }
            }
        } finally {
            AnonymousClass0V3.A01(AnonymousClass0V3.A0G, nanoTime);
        }
    }

    public void A0E() {
        if (this.A0P && this.A03 != 1) {
            this.A03 = 1;
            AnonymousClass074 r0 = this.A0H;
            if (r0 != null) {
                r0.A0C(this);
                r0.A0B(this);
            }
        }
        this.A0P = false;
    }

    public void A0F() {
        A0G();
        if (this.A03 != 4) {
            this.A03 = 4;
            AnonymousClass074 r0 = this.A0H;
            if (r0 != null) {
                r0.A0C(this);
                r0.A0B(this);
            }
        }
        this.A0P = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c9, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r11 = this;
            r1 = 0
            r11.A0G = r1
            X.074 r6 = r11.A09
            X.0kw r0 = r6.A08
            r5 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0013
            android.view.View r1 = r0.ACl(r11)
            r11.A0G = r1
            r11.A0Q = r5
        L_0x0013:
            r2 = -2
            if (r1 == 0) goto L_0x005d
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 != 0) goto L_0x0026
            android.view.View r1 = r11.A0G
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r2)
            r1.setLayoutParams(r0)
        L_0x0026:
            android.view.View r4 = r11.A0G
            X.09W r3 = r6.A0R
            int r0 = r3.getWidth()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r3.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r4.measure(r1, r0)
            android.view.View r0 = r11.A0G
            int r0 = r0.getMeasuredWidth()
            r11.A0F = r0
            android.view.View r0 = r11.A0G
            int r2 = r0.getMeasuredHeight()
            r11.A0E = r2
            android.view.View r1 = r11.A0G
            int r0 = r11.A0F
            r1.layout(r5, r5, r0, r2)
            r11.A0H()
            r11.A02()
            return
        L_0x005d:
            r11.A0Q = r10
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r2, r2)
            android.content.Context r9 = r11.A08
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            r3.setLayoutParams(r4)
            r3.setOrientation(r10)
            java.lang.String r1 = r11.A0M
            r2 = 3
            if (r1 == 0) goto L_0x00c6
            java.lang.String r0 = r11.A0L
            if (r0 == 0) goto L_0x00c6
            int r8 = r11.A0T
            int r7 = r8 / r2
        L_0x007e:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            r1.setPadding(r8, r8, r8, r7)
            java.lang.String r0 = r11.A0M
            r1.setText(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            r1.setMaxLines(r10)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r0 = 17
            r1.setGravity(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = -1
            r4.width = r0
            r3.addView(r1, r4)
        L_0x00a2:
            java.lang.String r0 = r11.A0L
            if (r0 == 0) goto L_0x00c2
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            r1.setPadding(r8, r7, r8, r8)
            r1.setText(r0)
            r0 = 5
            r1.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            r0 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r4.gravity = r2
            r3.addView(r1, r4)
        L_0x00c2:
            r11.A0G = r3
            goto L_0x0026
        L_0x00c6:
            int r7 = r11.A0T
            r8 = r7
            if (r1 == 0) goto L_0x00a2
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IS.A0G():void");
    }

    public final void A0H() {
        Bitmap bitmap = this.A0I.A00;
        float width = (float) bitmap.getWidth();
        float[] fArr = this.A0U;
        float f2 = fArr[0] * width;
        this.A03 = f2;
        this.A04 = width - f2;
        float height = (float) bitmap.getHeight();
        float f3 = fArr[1] * height;
        this.A06 = f3;
        this.A00 = height - f3;
        float[] fArr2 = this.A0V;
        this.A01 = fArr2[0] * width;
        this.A0A = fArr2[1] * height;
        float f4 = this.A0S;
        if (width < f4) {
            this.A02 = (f4 - width) / 2.0f;
        } else {
            this.A02 = 0.0f;
        }
        if (height < f4) {
            this.A0B = (f4 - height) / 2.0f;
        } else {
            this.A0B = 0.0f;
        }
        Matrix matrix = A0X;
        matrix.setRotate(0.0f);
        float[] fArr3 = this.A0C;
        fArr3[0] = this.A03 - this.A01;
        fArr3[1] = this.A06 - this.A0A;
        matrix.mapPoints(fArr3);
        this.A09 = ((float) this.A0E) + this.A0R + fArr3[1];
        float f5 = (float) (this.A0F >> 1);
        float f6 = fArr3[0];
        this.A07 = f5 + f6;
        this.A08 = f5 - f6;
    }

    public void A0I(C04660Nk r1) {
        if (r1 == null) {
            r1 = AnonymousClass0Wt.A00();
        }
        this.A0I = r1;
        A0H();
        A02();
    }

    public void A0J(AnonymousClass020 r3) {
        this.A0J = r3;
        this.A00 = C06540Wn.A01(r3.A01);
        this.A01 = C06540Wn.A00(r3.A00);
        A02();
    }

    public final boolean A0K() {
        boolean z2 = this.A0P && !(this.A0M == null && this.A0L == null);
        this.A05 = 0.0f + 0.0f;
        C05150Pm r10 = A0a;
        double d2 = this.A00;
        C06540Wn r12 = this.A0A;
        double A032 = d2 - r12.A03(this.A03);
        r10.A01 = A032;
        double A033 = d2 + r12.A03(this.A04);
        r10.A02 = A033;
        double d3 = this.A01;
        double A034 = d3 - r12.A03(this.A06);
        r10.A03 = A034;
        r10.A00 = d3 + r12.A03(this.A00);
        if (z2) {
            double A035 = d3 - r12.A03(this.A09);
            if (A035 < A034) {
                r10.A03 = A035;
            }
            double A036 = d2 - r12.A03(this.A07);
            if (A036 < A032) {
                r10.A01 = A036;
            }
            double A037 = d2 + r12.A03(this.A08);
            if (A033 < A037) {
                r10.A02 = A037;
            }
        }
        float[] fArr = this.A0C;
        C05150Pm r4 = this.A0B;
        r12.A07(r4);
        if (r10.A00 >= r4.A03 && r10.A03 <= r4.A00) {
            fArr[0] = (float) ((int) Math.ceil(r4.A01 - r10.A02));
            float floor = (float) ((int) Math.floor(r4.A02 - r10.A01));
            fArr[1] = floor;
            float f2 = fArr[0];
            if (f2 <= floor) {
                r12.A08(fArr, d2 + ((double) f2), d3);
                this.A0C = fArr[0];
                this.A0D = fArr[1];
                return true;
            }
        }
        return false;
    }
}
