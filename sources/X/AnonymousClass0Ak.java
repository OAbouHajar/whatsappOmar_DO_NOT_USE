package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import com.facebook.redex.IDxCTaskShape17S0101000_I1;
import com.facebook.redex.IDxCTaskShape1S0100001_I1;
import com.facebook.redex.IDxCTaskShape7S1100000_I1;
import com.facebook.redex.IDxUListenerShape139S0100000_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Ak  reason: invalid class name */
public class AnonymousClass0Ak extends Drawable implements Animatable, Drawable.Callback {
    public float A00;
    public int A01;
    public C03980Kq A02;
    public C12130jt A03;
    public AnonymousClass0Rs A04;
    public C03990Kr A05;
    public C05010Ow A06;
    public AnonymousClass0U9 A07;
    public C03050Ha A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final ValueAnimator.AnimatorUpdateListener A0I;
    public final Matrix A0J = AnonymousClass000.A0H();
    public final AnonymousClass0A0 A0K;
    public final ArrayList A0L;

    public AnonymousClass0Ak() {
        AnonymousClass0A0 r4 = new AnonymousClass0A0();
        this.A0K = r4;
        this.A00 = 1.0f;
        this.A0H = true;
        this.A0B = false;
        this.A0G = false;
        this.A0L = AnonymousClass000.A0u();
        IDxUListenerShape139S0100000_I1 iDxUListenerShape139S0100000_I1 = new IDxUListenerShape139S0100000_I1(this, 1);
        this.A0I = iDxUListenerShape139S0100000_I1;
        this.A01 = MotionEventCompat.ACTION_MASK;
        this.A0D = false;
        r4.addUpdateListener(iDxUListenerShape139S0100000_I1);
    }

    public void A00() {
        AnonymousClass0A0 r1 = this.A0K;
        if (r1.A07) {
            r1.cancel();
        }
        this.A04 = null;
        this.A08 = null;
        this.A07 = null;
        r1.A06 = null;
        r1.A02 = -2.14748365E9f;
        r1.A01 = 2.14748365E9f;
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r2.getRepeatCount() == 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            X.0Ha r0 = r3.A08
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r2 = r3.A0L
            r1 = 0
            com.facebook.redex.IDxCTaskShape399S0100000_I1 r0 = new com.facebook.redex.IDxCTaskShape399S0100000_I1
            r0.<init>(r3, r1)
            r2.add(r0)
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0020
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0020
            X.0A0 r2 = r3.A0K
            int r0 = r2.getRepeatCount()
            if (r0 != 0) goto L_0x0025
        L_0x0020:
            X.0A0 r2 = r3.A0K
            r2.A05()
        L_0x0025:
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x000f
            float r1 = r2.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            float r0 = r2.A03()
        L_0x0038:
            int r0 = (int) r0
            r3.A08(r0)
            X.AnonymousClass0A0.A01(r2)
            float r1 = r2.A03
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0048
            r0 = 1
        L_0x0048:
            r2.A09(r0)
            return
        L_0x004c:
            float r0 = r2.A02()
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ak.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r2.getRepeatCount() == 0) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r3 = this;
            X.0Ha r0 = r3.A08
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r2 = r3.A0L
            r1 = 1
            com.facebook.redex.IDxCTaskShape399S0100000_I1 r0 = new com.facebook.redex.IDxCTaskShape399S0100000_I1
            r0.<init>(r3, r1)
            r2.add(r0)
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0020
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0020
            X.0A0 r2 = r3.A0K
            int r0 = r2.getRepeatCount()
            if (r0 != 0) goto L_0x0043
        L_0x0020:
            X.0A0 r2 = r3.A0K
            r0 = 1
            r2.A07 = r0
            r2.A06()
            r0 = 0
            r2.A05 = r0
            float r1 = r2.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r1 = r2.A00
            if (r0 >= 0) goto L_0x006f
            float r0 = r2.A03()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            float r0 = r2.A02()
        L_0x0041:
            r2.A00 = r0
        L_0x0043:
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x000f
            float r1 = r2.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            float r0 = r2.A03()
        L_0x0056:
            int r0 = (int) r0
            r3.A08(r0)
            X.AnonymousClass0A0.A01(r2)
            float r1 = r2.A03
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0066
            r0 = 1
        L_0x0066:
            r2.A09(r0)
            return
        L_0x006a:
            float r0 = r2.A02()
            goto L_0x0056
        L_0x006f:
            float r0 = r2.A02()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            float r0 = r2.A03()
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ak.A02():void");
    }

    public final void A03() {
        AnonymousClass0Rs r5 = this.A04;
        Rect rect = r5.A04;
        List emptyList = Collections.emptyList();
        C03680Jl r10 = C03680Jl.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C08450df r16 = new C08450df((AnonymousClass0HT) null, (AnonymousClass0HT) null, (AnonymousClass0HT) null, (AnonymousClass0HT) null, (AnonymousClass0HT) null, (AnonymousClass0HU) null, (C08410db) null, (AnonymousClass0HV) null, (C13230lg) null);
        int width = rect.width();
        int height = rect.height();
        C05320Qf r4 = new C05320Qf(r5, (AnonymousClass0HT) null, (AnonymousClass0HS) null, (AnonymousClass0Oi) null, r16, r10, AnonymousClass0JX.NONE, "__container", (String) null, emptyList, emptyList2, Collections.emptyList(), 0.0f, 0.0f, 0, 0, 0, width, height, -1, -1, false);
        AnonymousClass0Rs r3 = this.A04;
        C03050Ha r1 = new C03050Ha(r3, this, r4, r3.A07);
        this.A08 = r1;
        if (this.A0E) {
            r1.A0B(true);
        }
    }

    public void A04(float f2) {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new IDxCTaskShape1S0100001_I1(this, f2, 2));
            return;
        }
        A09((int) AnonymousClass000.A01(r0.A00, r0.A02, f2));
    }

    public void A05(float f2) {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new IDxCTaskShape1S0100001_I1(this, f2, 1));
            return;
        }
        A0A((int) AnonymousClass000.A01(r0.A00, r0.A02, f2));
    }

    public void A06(float f2) {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new IDxCTaskShape1S0100001_I1(this, f2, 0));
            return;
        }
        this.A0K.A07(AnonymousClass000.A01(r0.A00, r0.A02, f2));
        AnonymousClass0NI.A01();
    }

    public void A07(float f2, float f3) {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new C08210dG(this, f2, f3));
            return;
        }
        float f4 = r0.A02;
        float f5 = r0.A00 - f4;
        A0B((int) (f4 + (f2 * f5)), (int) (f4 + (f3 * f5)));
    }

    public void A08(int i2) {
        if (this.A04 == null) {
            this.A0L.add(new IDxCTaskShape17S0101000_I1(this, i2, 0));
        } else {
            this.A0K.A07((float) i2);
        }
    }

    public void A09(int i2) {
        if (this.A04 == null) {
            this.A0L.add(new IDxCTaskShape17S0101000_I1(this, i2, 2));
            return;
        }
        AnonymousClass0A0 r2 = this.A0K;
        r2.A08(r2.A02, ((float) i2) + 0.99f);
    }

    public void A0A(int i2) {
        if (this.A04 == null) {
            this.A0L.add(new IDxCTaskShape17S0101000_I1(this, i2, 1));
            return;
        }
        AnonymousClass0A0 r2 = this.A0K;
        r2.A08((float) i2, (float) ((int) r2.A01));
    }

    public void A0B(int i2, int i3) {
        if (this.A04 == null) {
            this.A0L.add(new C08200dF(this, i2, i3));
        } else {
            this.A0K.A08((float) i2, ((float) i3) + 0.99f);
        }
    }

    public final void A0C(Canvas canvas) {
        float f2;
        AnonymousClass0Rs r2 = this.A04;
        if (r2 != null && !getBounds().isEmpty()) {
            Rect bounds = getBounds();
            Rect rect = r2.A04;
            if (((float) bounds.width()) / ((float) bounds.height()) != ((float) rect.width()) / ((float) rect.height())) {
                if (this.A08 != null) {
                    int i2 = -1;
                    Rect bounds2 = getBounds();
                    float width = ((float) bounds2.width()) / ((float) this.A04.A04.width());
                    float height = ((float) bounds2.height()) / ((float) this.A04.A04.height());
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        float f3 = 1.0f / min;
                        width /= f3;
                        height /= f3;
                        if (f3 > 1.0f) {
                            i2 = canvas.save();
                            float width2 = ((float) bounds2.width()) / 2.0f;
                            float height2 = ((float) bounds2.height()) / 2.0f;
                            float f4 = width2 * min;
                            float f5 = min * height2;
                            canvas.translate(width2 - f4, height2 - f5);
                            canvas.scale(f3, f3, f4, f5);
                        }
                    }
                    Matrix matrix = this.A0J;
                    matrix.reset();
                    matrix.preScale(width, height);
                    this.A08.A8F(canvas, matrix, this.A01);
                    if (i2 > 0) {
                        canvas.restoreToCount(i2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (this.A08 != null) {
            float f6 = this.A00;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.A04.A04.width()), ((float) canvas.getHeight()) / ((float) this.A04.A04.height()));
            if (f6 > min2) {
                f2 = this.A00 / min2;
            } else {
                min2 = f6;
                f2 = 1.0f;
            }
            int i3 = -1;
            if (f2 > 1.0f) {
                i3 = canvas.save();
                float width3 = ((float) this.A04.A04.width()) / 2.0f;
                float height3 = ((float) this.A04.A04.height()) / 2.0f;
                float f7 = width3 * min2;
                float f8 = height3 * min2;
                float f9 = this.A00;
                canvas.translate((f9 * width3) - f7, (f9 * height3) - f8);
                canvas.scale(f2, f2, f7, f8);
            }
            Matrix matrix2 = this.A0J;
            matrix2.reset();
            matrix2.preScale(min2, min2);
            this.A08.A8F(canvas, matrix2, this.A01);
            if (i3 > 0) {
                canvas.restoreToCount(i3);
            }
        }
    }

    public void A0D(AnonymousClass0WM r7, AnonymousClass0UV r8, Object obj) {
        C03050Ha r5 = this.A08;
        if (r5 == null) {
            this.A0L.add(new C08220dH(this, r7, r8, obj));
            return;
        }
        if (r7 == AnonymousClass0WM.A02) {
            r5.A4l(r8, obj);
        } else {
            C13160lZ r0 = r7.A00;
            if (r0 != null) {
                r0.A4l(r8, obj);
            } else {
                ArrayList A0u = AnonymousClass000.A0u();
                r5.AcW(r7, new AnonymousClass0WM(new String[0]), A0u, 0);
                for (int i2 = 0; i2 < A0u.size(); i2++) {
                    ((AnonymousClass0WM) A0u.get(i2)).A00.A4l(r8, obj);
                }
                if (!(true ^ A0u.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == C13480m6.A0J) {
            A06(AnonymousClass0A0.A00(this.A0K));
        }
    }

    public void A0E(String str) {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new IDxCTaskShape7S1100000_I1(this, str, 2));
            return;
        }
        AnonymousClass0OS A022 = r0.A02(str);
        if (A022 != null) {
            A09((int) (A022.A01 + A022.A00));
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Cannot find marker with name ");
        A0r.append(str);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(".", A0r));
    }

    public void A0F(String str) {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new IDxCTaskShape7S1100000_I1(this, str, 0));
            return;
        }
        AnonymousClass0OS A022 = r0.A02(str);
        if (A022 != null) {
            int i2 = (int) A022.A01;
            A0B(i2, ((int) A022.A00) + i2);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Cannot find marker with name ");
        A0r.append(str);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(".", A0r));
    }

    public void A0G(String str) {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            this.A0L.add(new IDxCTaskShape7S1100000_I1(this, str, 1));
            return;
        }
        AnonymousClass0OS A022 = r0.A02(str);
        if (A022 != null) {
            A0A((int) A022.A01);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Cannot find marker with name ");
        A0r.append(str);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(".", A0r));
    }

    public void A0H(boolean z2) {
        if (this.A0A == z2) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            C05770Sy.A00("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.A0A = z2;
        if (this.A04 != null) {
            A03();
        }
    }

    public void draw(Canvas canvas) {
        this.A0D = false;
        if (this.A0G) {
            try {
                A0C(canvas);
            } catch (Throwable unused) {
            }
        } else {
            A0C(canvas);
        }
        AnonymousClass0NI.A01();
    }

    public int getAlpha() {
        return this.A01;
    }

    public int getIntrinsicHeight() {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            return -1;
        }
        return (int) (((float) r0.A04.height()) * this.A00);
    }

    public int getIntrinsicWidth() {
        AnonymousClass0Rs r0 = this.A04;
        if (r0 == null) {
            return -1;
        }
        return (int) (((float) r0.A04.width()) * this.A00);
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.A0D) {
            this.A0D = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        AnonymousClass0A0 r0 = this.A0K;
        if (r0 == null) {
            return false;
        }
        return r0.A07;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        this.A01 = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C05770Sy.A00("Use addColorFilter instead.");
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            A01();
        }
    }

    public void stop() {
        this.A0L.clear();
        AnonymousClass0A0 r2 = this.A0K;
        AnonymousClass0A0.A01(r2);
        boolean z2 = false;
        if (r2.A03 < 0.0f) {
            z2 = true;
        }
        r2.A09(z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
