package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.2nV  reason: invalid class name and case insensitive filesystem */
public class C56352nV extends Drawable implements Drawable.Callback, AnonymousClass07X {
    public static final int[] A0w = {16842910};
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
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorStateList A0P;
    public ColorStateList A0Q;
    public ColorStateList A0R;
    public ColorFilter A0S;
    public PorterDuff.Mode A0T;
    public PorterDuffColorFilter A0U;
    public Drawable A0V;
    public Drawable A0W;
    public Drawable A0X;
    public TextUtils.TruncateAt A0Y;
    public C53422fg A0Z;
    public C53422fg A0a;
    public C615239g A0b;
    public CharSequence A0c;
    public CharSequence A0d;
    public CharSequence A0e;
    public WeakReference A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public int[] A0o;
    public final Context A0p;
    public final Paint.FontMetrics A0q;
    public final Paint A0r;
    public final PointF A0s;
    public final RectF A0t;
    public final TextPaint A0u;
    public final C017508g A0v = new AnonymousClass3P1(this);

    public C56352nV(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.A0u = textPaint;
        this.A0r = C13700nu.A06(1);
        this.A0q = new Paint.FontMetrics();
        this.A0t = AnonymousClass000.A0K();
        this.A0s = new PointF();
        this.A0E = MotionEventCompat.ACTION_MASK;
        this.A0T = PorterDuff.Mode.SRC_IN;
        this.A0f = C13690nt.A0h((Object) null);
        this.A0m = true;
        this.A0p = context;
        this.A0d = "";
        textPaint.density = C13680ns.A01(context);
        int[] iArr = A0w;
        setState(iArr);
        if (!Arrays.equals(this.A0o, iArr)) {
            this.A0o = iArr;
            if (A0P()) {
                A0Q(getState(), iArr);
            }
        }
        this.A0l = true;
    }

    public float A00() {
        if (A0O() || A0N()) {
            return this.A0A + this.A02 + this.A09;
        }
        return 0.0f;
    }

    public final float A01() {
        if (A0P()) {
            return this.A08 + this.A07 + this.A06;
        }
        return 0.0f;
    }

    public Drawable A02() {
        Drawable drawable = this.A0X;
        if (drawable != null) {
            return drawable instanceof C019208y ? ((C019108x) ((C019208y) drawable)).A02 : drawable;
        }
        return null;
    }

    public void A03() {
        AnonymousClass2UK r0 = (AnonymousClass2UK) this.A0f.get();
        if (r0 != null) {
            r0.AOS();
        }
    }

    public void A04(float f2) {
        if (this.A02 != f2) {
            float A002 = A00();
            this.A02 = f2;
            float A003 = A00();
            invalidateSelf();
            if (A002 != A003) {
                A03();
            }
        }
    }

    public void A05(float f2) {
        if (this.A06 != f2) {
            this.A06 = f2;
            invalidateSelf();
            if (A0P()) {
                A03();
            }
        }
    }

    public void A06(float f2) {
        if (this.A07 != f2) {
            this.A07 = f2;
            invalidateSelf();
            if (A0P()) {
                A03();
            }
        }
    }

    public void A07(float f2) {
        if (this.A08 != f2) {
            this.A08 = f2;
            invalidateSelf();
            if (A0P()) {
                A03();
            }
        }
    }

    public void A08(float f2) {
        if (this.A09 != f2) {
            float A002 = A00();
            this.A09 = f2;
            float A003 = A00();
            invalidateSelf();
            if (A002 != A003) {
                A03();
            }
        }
    }

    public void A09(float f2) {
        if (this.A0A != f2) {
            float A002 = A00();
            this.A0A = f2;
            float A003 = A00();
            invalidateSelf();
            if (A002 != A003) {
                A03();
            }
        }
    }

    public void A0A(ColorStateList colorStateList) {
        if (this.A0M != colorStateList) {
            this.A0M = colorStateList;
            if (A0O()) {
                C018208n.A04(colorStateList, this.A0W);
            }
            onStateChange(getState());
        }
    }

    public void A0B(ColorStateList colorStateList) {
        if (this.A0O != colorStateList) {
            this.A0O = colorStateList;
            if (A0P()) {
                C018208n.A04(colorStateList, this.A0X);
            }
            onStateChange(getState());
        }
    }

    public void A0C(ColorStateList colorStateList) {
        if (this.A0Q != colorStateList) {
            this.A0Q = colorStateList;
            this.A0P = this.A0n ? C53732gB.A02(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final void A0D(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (A0O() || A0N()) {
            float f2 = this.A04 + this.A0A;
            if (C018208n.A01(this) == 0) {
                float f3 = ((float) rect.left) + f2;
                rectF.left = f3;
                rectF.right = f3 + this.A02;
            } else {
                float f4 = ((float) rect.right) - f2;
                rectF.right = f4;
                rectF.left = f4 - this.A02;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.A02;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public void A0E(Drawable drawable) {
        if (this.A0V != drawable) {
            float A002 = A00();
            this.A0V = drawable;
            float A003 = A00();
            C13700nu.A0N(drawable);
            A0H(this.A0V);
            invalidateSelf();
            if (A002 != A003) {
                A03();
            }
        }
    }

    public void A0F(Drawable drawable) {
        Drawable drawable2 = this.A0W;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof C019208y) {
            drawable2 = ((C019108x) ((C019208y) drawable2)).A02;
        }
        if (drawable2 != drawable) {
            float A002 = A00();
            this.A0W = drawable != null ? C018208n.A03(drawable).mutate() : null;
            float A003 = A00();
            C13700nu.A0N(drawable2);
            if (A0O()) {
                A0H(this.A0W);
            }
            invalidateSelf();
            if (A002 != A003) {
                A03();
            }
        }
    }

    public void A0G(Drawable drawable) {
        Drawable A022 = A02();
        if (A022 != drawable) {
            float A012 = A01();
            this.A0X = drawable != null ? C018208n.A03(drawable).mutate() : null;
            float A013 = A01();
            C13700nu.A0N(A022);
            if (A0P()) {
                A0H(this.A0X);
            }
            invalidateSelf();
            if (A012 != A013) {
                A03();
            }
        }
    }

    public final void A0H(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C018208n.A0D(C018208n.A01(this), drawable);
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            Drawable drawable2 = this.A0X;
            boolean isStateful = drawable.isStateful();
            if (drawable == drawable2) {
                if (isStateful) {
                    drawable.setState(this.A0o);
                }
                C018208n.A04(this.A0O, drawable);
            } else if (isStateful) {
                drawable.setState(getState());
            }
        }
    }

    public void A0I(C615239g r4) {
        if (this.A0b != r4) {
            this.A0b = r4;
            if (r4 != null) {
                r4.A02(this.A0p, this.A0u, this.A0v);
                this.A0m = true;
            }
            onStateChange(getState());
            A03();
        }
    }

    public void A0J(boolean z2) {
        if (this.A0g != z2) {
            this.A0g = z2;
            float A002 = A00();
            if (!z2 && this.A0k) {
                this.A0k = false;
            }
            float A003 = A00();
            invalidateSelf();
            if (A002 != A003) {
                A03();
            }
        }
    }

    public void A0K(boolean z2) {
        if (this.A0h != z2) {
            boolean A0N2 = A0N();
            this.A0h = z2;
            boolean A0N3 = A0N();
            if (A0N2 != A0N3) {
                Drawable drawable = this.A0V;
                if (A0N3) {
                    A0H(drawable);
                } else {
                    C13700nu.A0N(drawable);
                }
                invalidateSelf();
                A03();
            }
        }
    }

    public void A0L(boolean z2) {
        if (this.A0i != z2) {
            boolean A0O2 = A0O();
            this.A0i = z2;
            boolean A0O3 = A0O();
            if (A0O2 != A0O3) {
                Drawable drawable = this.A0W;
                if (A0O3) {
                    A0H(drawable);
                } else {
                    C13700nu.A0N(drawable);
                }
                invalidateSelf();
                A03();
            }
        }
    }

    public void A0M(boolean z2) {
        if (this.A0j != z2) {
            boolean A0P2 = A0P();
            this.A0j = z2;
            boolean A0P3 = A0P();
            if (A0P2 != A0P3) {
                Drawable drawable = this.A0X;
                if (A0P3) {
                    A0H(drawable);
                } else {
                    C13700nu.A0N(drawable);
                }
                invalidateSelf();
                A03();
            }
        }
    }

    public final boolean A0N() {
        return this.A0h && this.A0V != null && this.A0k;
    }

    public final boolean A0O() {
        return this.A0i && this.A0W != null;
    }

    public final boolean A0P() {
        return this.A0j && this.A0X != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (r8.A0g == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007f, code lost:
        if (r1 == A00()) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0Q(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r7 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.A0L
            r3 = 0
            if (r1 == 0) goto L_0x00f9
            int r0 = r8.A0F
            int r1 = r1.getColorForState(r9, r0)
        L_0x000f:
            int r0 = r8.A0F
            r6 = 1
            if (r0 == r1) goto L_0x0017
            r8.A0F = r1
            r7 = 1
        L_0x0017:
            android.content.res.ColorStateList r1 = r8.A0N
            if (r1 == 0) goto L_0x00f6
            int r0 = r8.A0G
            int r1 = r1.getColorForState(r9, r0)
        L_0x0021:
            int r0 = r8.A0G
            if (r0 == r1) goto L_0x0028
            r8.A0G = r1
            r7 = 1
        L_0x0028:
            android.content.res.ColorStateList r1 = r8.A0P
            if (r1 == 0) goto L_0x00f3
            int r0 = r8.A0H
            int r1 = r1.getColorForState(r9, r0)
        L_0x0032:
            int r0 = r8.A0H
            if (r0 == r1) goto L_0x003d
            r8.A0H = r1
            boolean r0 = r8.A0n
            if (r0 == 0) goto L_0x003d
            r7 = 1
        L_0x003d:
            X.39g r0 = r8.A0b
            if (r0 == 0) goto L_0x00f0
            android.content.res.ColorStateList r1 = r0.A0A
            if (r1 == 0) goto L_0x00f0
            int r0 = r8.A0I
            int r1 = r1.getColorForState(r9, r0)
        L_0x004b:
            int r0 = r8.A0I
            if (r0 == r1) goto L_0x0052
            r8.A0I = r1
            r7 = 1
        L_0x0052:
            int[] r5 = r8.getState()
            r4 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r5 == 0) goto L_0x0068
            int r2 = r5.length
            r1 = 0
        L_0x005d:
            if (r1 >= r2) goto L_0x0068
            r0 = r5[r1]
            if (r0 != r4) goto L_0x00ec
            boolean r0 = r8.A0g
            r2 = 1
            if (r0 != 0) goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            boolean r0 = r8.A0k
            if (r0 == r2) goto L_0x0081
            android.graphics.drawable.Drawable r0 = r8.A0V
            if (r0 == 0) goto L_0x0081
            float r1 = r8.A00()
            r8.A0k = r2
            float r0 = r8.A00()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r7 = 1
            r4 = 1
            if (r0 != 0) goto L_0x0082
        L_0x0081:
            r4 = 0
        L_0x0082:
            android.content.res.ColorStateList r1 = r8.A0R
            if (r1 == 0) goto L_0x008c
            int r0 = r8.A0J
            int r3 = r1.getColorForState(r9, r0)
        L_0x008c:
            int r0 = r8.A0J
            if (r0 == r3) goto L_0x00ea
            r8.A0J = r3
            android.content.res.ColorStateList r3 = r8.A0R
            android.graphics.PorterDuff$Mode r2 = r8.A0T
            if (r3 == 0) goto L_0x00e8
            if (r2 == 0) goto L_0x00e8
            int[] r1 = r8.getState()
            r0 = 0
            int r0 = r3.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r2)
        L_0x00a8:
            r8.A0U = r1
        L_0x00aa:
            android.graphics.drawable.Drawable r0 = r8.A0W
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00bb
            android.graphics.drawable.Drawable r0 = r8.A0W
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00bb:
            android.graphics.drawable.Drawable r0 = r8.A0V
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00cc
            android.graphics.drawable.Drawable r0 = r8.A0V
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00cc:
            android.graphics.drawable.Drawable r0 = r8.A0X
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00dd
            android.graphics.drawable.Drawable r0 = r8.A0X
            boolean r0 = r0.setState(r10)
            r6 = r6 | r0
        L_0x00dd:
            if (r6 == 0) goto L_0x00e2
            r8.invalidateSelf()
        L_0x00e2:
            if (r4 == 0) goto L_0x00e7
            r8.A03()
        L_0x00e7:
            return r6
        L_0x00e8:
            r1 = 0
            goto L_0x00a8
        L_0x00ea:
            r6 = r7
            goto L_0x00aa
        L_0x00ec:
            int r1 = r1 + 1
            goto L_0x005d
        L_0x00f0:
            r1 = 0
            goto L_0x004b
        L_0x00f3:
            r1 = 0
            goto L_0x0032
        L_0x00f6:
            r1 = 0
            goto L_0x0021
        L_0x00f9:
            r1 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56352nV.A0Q(int[], int[]):boolean");
    }

    public void draw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i2 = this.A0E) != 0) {
            int i3 = 0;
            Canvas canvas2 = canvas;
            if (i2 < 255) {
                float f4 = (float) bounds.left;
                float f5 = (float) bounds.top;
                float f6 = (float) bounds.right;
                float f7 = (float) bounds.bottom;
                i3 = Build.VERSION.SDK_INT > 21 ? canvas2.saveLayerAlpha(f4, f5, f6, f7, i2) : canvas2.saveLayerAlpha(f4, f5, f6, f7, i2, 31);
            }
            Paint paint = this.A0r;
            C13690nt.A0n(this.A0F, paint);
            ColorFilter colorFilter = this.A0S;
            if (colorFilter == null) {
                colorFilter = this.A0U;
            }
            paint.setColorFilter(colorFilter);
            RectF rectF = this.A0t;
            rectF.set(bounds);
            float f8 = this.A00;
            canvas2.drawRoundRect(rectF, f8, f8, paint);
            if (this.A05 > 0.0f) {
                paint.setColor(this.A0G);
                C13690nt.A0y(paint);
                ColorFilter colorFilter2 = this.A0S;
                if (colorFilter2 == null) {
                    colorFilter2 = this.A0U;
                }
                paint.setColorFilter(colorFilter2);
                float f9 = this.A05 / 2.0f;
                rectF.set(((float) bounds.left) + f9, ((float) bounds.top) + f9, ((float) bounds.right) - f9, ((float) bounds.bottom) - f9);
                float f10 = this.A00 - (this.A05 / 2.0f);
                canvas2.drawRoundRect(rectF, f10, f10, paint);
            }
            C13690nt.A0n(this.A0H, paint);
            rectF.set(bounds);
            float f11 = this.A00;
            canvas2.drawRoundRect(rectF, f11, f11, paint);
            if (A0O()) {
                A0D(bounds, rectF);
                float f12 = rectF.left;
                float f13 = rectF.top;
                canvas2.translate(f12, f13);
                this.A0W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.A0W.draw(canvas2);
                canvas2.translate(-f12, -f13);
            }
            if (A0N()) {
                A0D(bounds, rectF);
                float f14 = rectF.left;
                float f15 = rectF.top;
                canvas2.translate(f14, f15);
                this.A0V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.A0V.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.A0l && this.A0e != null) {
                PointF pointF = this.A0s;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.A0e != null) {
                    float A002 = this.A04 + A00() + this.A0C;
                    if (C018208n.A01(this) == 0) {
                        pointF.x = ((float) bounds.left) + A002;
                    } else {
                        pointF.x = ((float) bounds.right) - A002;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = (float) bounds.centerY();
                    TextPaint textPaint = this.A0u;
                    Paint.FontMetrics fontMetrics = this.A0q;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF.setEmpty();
                if (this.A0e != null) {
                    float A003 = this.A04 + A00() + this.A0C;
                    float A012 = this.A01 + A01() + this.A0B;
                    int A013 = C018208n.A01(this);
                    float f16 = (float) bounds.left;
                    if (A013 == 0) {
                        rectF.left = f16 + A003;
                        f3 = ((float) bounds.right) - A012;
                    } else {
                        rectF.left = f16 + A012;
                        f3 = ((float) bounds.right) - A003;
                    }
                    rectF.right = f3;
                    rectF.top = (float) bounds.top;
                    rectF.bottom = (float) bounds.bottom;
                }
                if (this.A0b != null) {
                    TextPaint textPaint2 = this.A0u;
                    textPaint2.drawableState = getState();
                    this.A0b.A01(this.A0p, textPaint2, this.A0v);
                }
                TextPaint textPaint3 = this.A0u;
                textPaint3.setTextAlign(align);
                if (!this.A0m) {
                    f2 = this.A0D;
                } else {
                    CharSequence charSequence = this.A0e;
                    f2 = 0.0f;
                    if (charSequence != null) {
                        f2 = textPaint3.measureText(charSequence, 0, charSequence.length());
                    }
                    this.A0D = f2;
                    this.A0m = false;
                }
                int i4 = 0;
                boolean z2 = false;
                if (Math.round(f2) > Math.round(rectF.width())) {
                    z2 = true;
                    i4 = canvas2.save();
                    canvas2.clipRect(rectF);
                }
                CharSequence charSequence2 = this.A0e;
                if (z2 && this.A0Y != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint3, rectF.width(), this.A0Y);
                }
                canvas2.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint3);
                if (z2) {
                    canvas2.restoreToCount(i4);
                }
            }
            if (A0P()) {
                rectF.setEmpty();
                if (A0P()) {
                    float f17 = this.A01 + this.A06;
                    if (C018208n.A01(this) == 0) {
                        float f18 = ((float) bounds.right) - f17;
                        rectF.right = f18;
                        rectF.left = f18 - this.A07;
                    } else {
                        float f19 = ((float) bounds.left) + f17;
                        rectF.left = f19;
                        rectF.right = f19 + this.A07;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f20 = this.A07;
                    float f21 = exactCenterY - (f20 / 2.0f);
                    rectF.top = f21;
                    rectF.bottom = f21 + f20;
                }
                float f22 = rectF.left;
                float f23 = rectF.top;
                canvas2.translate(f22, f23);
                this.A0X.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.A0X.draw(canvas2);
                canvas2.translate(-f22, -f23);
            }
            if (this.A0E < 255) {
                canvas2.restoreToCount(i3);
            }
        }
    }

    public int getAlpha() {
        return this.A0E;
    }

    public ColorFilter getColorFilter() {
        return this.A0S;
    }

    public int getIntrinsicHeight() {
        return (int) this.A03;
    }

    public int getIntrinsicWidth() {
        float measureText;
        float A002 = this.A04 + A00() + this.A0C;
        if (!this.A0m) {
            measureText = this.A0D;
        } else {
            CharSequence charSequence = this.A0e;
            measureText = charSequence == null ? 0.0f : this.A0u.measureText(charSequence, 0, charSequence.length());
            this.A0D = measureText;
            this.A0m = false;
        }
        return Math.min(Math.round(A002 + measureText + this.A0B + A01() + this.A01), this.A0K);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        Rect bounds = getBounds();
        Outline outline2 = outline;
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A00);
        } else {
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A03, this.A00);
        }
        outline.setAlpha(((float) this.A0E) / 255.0f);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3 = this.A0L;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A0N;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        if (this.A0n && (colorStateList2 = this.A0P) != null && colorStateList2.isStateful()) {
            return true;
        }
        C615239g r0 = this.A0b;
        if (r0 != null && (colorStateList = r0.A0A) != null && colorStateList.isStateful()) {
            return true;
        }
        if (this.A0h && this.A0V != null && this.A0g) {
            return true;
        }
        Drawable drawable = this.A0W;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        Drawable drawable2 = this.A0V;
        if (drawable2 != null && drawable2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList5 = this.A0R;
        return colorStateList5 != null && colorStateList5.isStateful();
    }

    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (A0O()) {
            onLayoutDirectionChanged |= this.A0W.setLayoutDirection(i2);
        }
        if (A0N()) {
            onLayoutDirectionChanged |= this.A0V.setLayoutDirection(i2);
        }
        if (A0P()) {
            onLayoutDirectionChanged |= this.A0X.setLayoutDirection(i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (A0O()) {
            onLevelChange |= this.A0W.setLevel(i2);
        }
        if (A0N()) {
            onLevelChange |= this.A0V.setLevel(i2);
        }
        if (A0P()) {
            onLevelChange |= this.A0X.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        return A0Q(iArr, this.A0o);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (this.A0E != i2) {
            this.A0E = i2;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.A0S != colorFilter) {
            this.A0S = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.A0R != colorStateList) {
            this.A0R = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.A0T != mode) {
            this.A0T = mode;
            ColorStateList colorStateList = this.A0R;
            this.A0U = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (A0O()) {
            visible |= this.A0W.setVisible(z2, z3);
        }
        if (A0N()) {
            visible |= this.A0V.setVisible(z2, z3);
        }
        if (A0P()) {
            visible |= this.A0X.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
