package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.2fk  reason: invalid class name and case insensitive filesystem */
public class C53462fk {
    public static final TimeInterpolator A0P = C53572fv.A01;
    public static final int[] A0Q = new int[0];
    public static final int[] A0R = {16842910};
    public static final int[] A0S = {16842908, 16842910};
    public static final int[] A0T = {16843623, 16842910};
    public static final int[] A0U = {16843623, 16842908, 16842910};
    public static final int[] A0V = {16842919, 16842910};
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03;
    public float A04;
    public int A05 = 0;
    public int A06;
    public Animator A07;
    public Drawable A08;
    public Drawable A09;
    public Drawable A0A;
    public ViewTreeObserver.OnPreDrawListener A0B;
    public C53422fg A0C;
    public C53422fg A0D;
    public C53422fg A0E;
    public C53422fg A0F;
    public C53562fu A0G;
    public C53712g9 A0H;
    public final Matrix A0I = new Matrix();
    public final Rect A0J = new Rect();
    public final RectF A0K = new RectF();
    public final RectF A0L = new RectF();
    public final C53582fw A0M;
    public final AnonymousClass2WL A0N;
    public final C53512fp A0O;

    public C53462fk(AnonymousClass2WL r4, C53512fp r5) {
        this.A0N = r4;
        this.A0O = r5;
        C53582fw r2 = new C53582fw();
        this.A0M = r2;
        r2.A00(A00(new C53592fx(this)), A0V);
        r2.A00(A00(new C53612fz(this)), A0U);
        r2.A00(A00(new C53612fz(this)), A0S);
        r2.A00(A00(new C53612fz(this)), A0T);
        r2.A00(A00(new C53632g1(this)), A0R);
        r2.A00(A00(new C53642g2(this)), A0Q);
        this.A04 = r4.getRotation();
    }

    public static final ValueAnimator A00(C53602fy r3) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(A0P);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(r3);
        valueAnimator.addUpdateListener(r3);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public float A01() {
        return this.A00;
    }

    public final AnimatorSet A02(C53422fg r10, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass2WL r6 = this.A0N;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r6, View.ALPHA, new float[]{f2});
        r10.A03("opacity").A00(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r6, View.SCALE_X, new float[]{f3});
        r10.A03("scale").A00(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r6, View.SCALE_Y, new float[]{f3});
        r10.A03("scale").A00(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.A0I;
        A0D(matrix, f4);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(r6, new C53682g6(), new C53692g7(), new Matrix[]{new Matrix(matrix)});
        r10.A03("iconScale").A00(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C53702g8.A00(animatorSet, arrayList);
        return animatorSet;
    }

    public GradientDrawable A03() {
        return new GradientDrawable();
    }

    public C53562fu A04() {
        return new C53562fu();
    }

    public C53562fu A05(ColorStateList colorStateList, int i2) {
        Context context = this.A0N.getContext();
        C53562fu A042 = A04();
        int A002 = AnonymousClass00T.A00(context, R.color.color01cd);
        int A003 = AnonymousClass00T.A00(context, R.color.color01cc);
        int A004 = AnonymousClass00T.A00(context, R.color.color01ca);
        int A005 = AnonymousClass00T.A00(context, R.color.color01cb);
        A042.A06 = A002;
        A042.A05 = A003;
        A042.A03 = A004;
        A042.A02 = A005;
        float f2 = (float) i2;
        if (A042.A00 != f2) {
            A042.A00 = f2;
            A042.A09.setStrokeWidth(f2 * 1.3333f);
            A042.A08 = true;
            A042.invalidateSelf();
        }
        if (colorStateList != null) {
            A042.A04 = colorStateList.getColorForState(A042.getState(), A042.A04);
        }
        A042.A07 = colorStateList;
        A042.A08 = true;
        A042.invalidateSelf();
        return A042;
    }

    public void A06() {
        C53582fw r1 = this.A0M;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null) {
            valueAnimator.end();
            r1.A00 = null;
        }
    }

    public void A07() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r4.getLayerType() != 1) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r5 = this;
            X.2WL r4 = r5.A0N
            float r3 = r4.getRotation()
            float r0 = r5.A04
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004b
            r5.A04 = r3
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 != r0) goto L_0x0027
            r0 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 % r0
            r0 = 0
            r2 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x004c
            int r1 = r4.getLayerType()
            r0 = 1
            if (r1 == r0) goto L_0x0027
        L_0x0024:
            r4.setLayerType(r0, r2)
        L_0x0027:
            X.2g9 r2 = r5.A0H
            if (r2 == 0) goto L_0x0039
            float r0 = r5.A04
            float r1 = -r0
            float r0 = r2.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            r2.A03 = r1
            r2.invalidateSelf()
        L_0x0039:
            X.2fu r2 = r5.A0G
            if (r2 == 0) goto L_0x004b
            float r0 = r5.A04
            float r1 = -r0
            float r0 = r2.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x004b
            r2.A01 = r1
            r2.invalidateSelf()
        L_0x004b:
            return
        L_0x004c:
            int r0 = r4.getLayerType()
            if (r0 == 0) goto L_0x0027
            r0 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53462fk.A08():void");
    }

    public final void A09() {
        Rect rect = this.A0J;
        A0E(rect);
        A0F(rect);
        C53512fp r0 = this.A0O;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        AnonymousClass2WK r1 = ((C53502fo) r0).A00;
        r1.A0C.set(i2, i3, i4, i5);
        int i6 = r1.A02;
        r1.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public void A0A(float f2, float f3, float f4) {
        C53712g9 r1 = this.A0H;
        if (r1 != null) {
            r1.A00(f2, this.A03 + f2);
            A09();
        }
    }

    public void A0B(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable != null) {
            C018208n.A04(C53732gB.A02(colorStateList), drawable);
        }
    }

    public void A0C(ColorStateList colorStateList, ColorStateList colorStateList2, PorterDuff.Mode mode, int i2) {
        Drawable[] drawableArr;
        GradientDrawable A032 = A03();
        A032.setShape(1);
        A032.setColor(-1);
        Drawable A033 = C018208n.A03(A032);
        this.A0A = A033;
        C018208n.A04(colorStateList, A033);
        if (mode != null) {
            C018208n.A07(mode, this.A0A);
        }
        GradientDrawable A034 = A03();
        A034.setShape(1);
        A034.setColor(-1);
        Drawable A035 = C018208n.A03(A034);
        this.A09 = A035;
        C018208n.A04(C53732gB.A02(colorStateList2), A035);
        if (i2 > 0) {
            C53562fu A052 = A05(colorStateList, i2);
            this.A0G = A052;
            drawableArr = new Drawable[]{A052, this.A0A, this.A09};
        } else {
            this.A0G = null;
            drawableArr = new Drawable[]{this.A0A, this.A09};
        }
        this.A08 = new LayerDrawable(drawableArr);
        Context context = this.A0N.getContext();
        Drawable drawable = this.A08;
        AnonymousClass2WK r2 = ((C53502fo) this.A0O).A00;
        float f2 = this.A00;
        C53712g9 r3 = new C53712g9(context, drawable, ((float) r2.A01(r2.A04)) / 2.0f, f2, f2 + this.A03);
        this.A0H = r3;
        r3.A06 = false;
        r3.invalidateSelf();
        C53462fk.super.setBackgroundDrawable(this.A0H);
    }

    public final void A0D(Matrix matrix, float f2) {
        matrix.reset();
        Drawable drawable = this.A0N.getDrawable();
        if (drawable != null && this.A06 != 0) {
            RectF rectF = this.A0K;
            RectF rectF2 = this.A0L;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f3 = (float) this.A06;
            rectF2.set(0.0f, 0.0f, f3, f3);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f4 = ((float) this.A06) / 2.0f;
            matrix.postScale(f2, f2, f4, f4);
        }
    }

    public void A0E(Rect rect) {
        this.A0H.getPadding(rect);
    }

    public void A0F(Rect rect) {
    }

    public void A0G(int[] iArr) {
        C53722gA r1;
        ValueAnimator valueAnimator;
        C53582fw r5 = this.A0M;
        ArrayList arrayList = r5.A03;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                r1 = null;
                break;
            }
            r1 = (C53722gA) arrayList.get(i2);
            if (StateSet.stateSetMatches(r1.A01, iArr)) {
                break;
            }
            i2++;
        }
        C53722gA r0 = r5.A01;
        if (r1 != r0) {
            if (!(r0 == null || (valueAnimator = r5.A00) == null)) {
                valueAnimator.cancel();
                r5.A00 = null;
            }
            r5.A01 = r1;
            if (r1 != null) {
                ValueAnimator valueAnimator2 = r1.A00;
                r5.A00 = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }

    public boolean A0H() {
        return true;
    }
}
