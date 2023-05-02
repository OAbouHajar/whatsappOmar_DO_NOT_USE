package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4nI  reason: invalid class name and case insensitive filesystem */
public final class C95794nI implements AnonymousClass5R7 {
    public AnonymousClass41N A00 = AnonymousClass41N.NONE;
    public C801342r A01;
    public C800242g A02;
    public AnonymousClass3LA A03;
    public AnonymousClass3LA A04;
    public AnonymousClass4QW A05;
    public AnonymousClass2IH A06;
    public final Context A07;
    public final RectF A08 = new RectF();
    public final AnonymousClass013 A09;
    public final C109105Qs A0A;
    public final C15220qW A0B = AnonymousClass3K3.A0t(9);
    public final C15220qW A0C = C32521gW.A00(new C106565Ei(this));
    public final C15220qW A0D = AnonymousClass3K3.A0t(10);

    public C95794nI(Context context, AnonymousClass013 r4, C109105Qs r5, C801342r r6, C800242g r7, AnonymousClass2IH r8) {
        this.A07 = context;
        this.A09 = r4;
        this.A0A = r5;
        this.A01 = r6;
        AnonymousClass4QW A012 = C89594cV.A01(context, r7);
        this.A05 = A012;
        this.A03 = r8 == null ? null : new AnonymousClass3LA(context, A012, r8);
        this.A02 = r7;
        this.A06 = r8;
    }

    public static void A00(Drawable drawable, C95794nI r7, float f2) {
        C15220qW r4 = r7.A0D;
        ((RectF) r4.getValue()).set(r7.A08);
        float f3 = (float) 2;
        ((RectF) r4.getValue()).inset((((RectF) r4.getValue()).width() / f3) * f2, (((RectF) r4.getValue()).height() / f3) * f2);
        drawable.setBounds((int) ((RectF) r4.getValue()).left, (int) ((RectF) r4.getValue()).top, (int) ((RectF) r4.getValue()).right, (int) ((RectF) r4.getValue()).bottom);
    }

    public final void A01() {
        float f2 = (float) ((AnonymousClass4X6) this.A0C.getValue()).A07.A00;
        AnonymousClass3LA r10 = this.A03;
        if (r10 != null) {
            A00(r10, this, f2);
            r10.setAlpha((int) (((double) MotionEventCompat.ACTION_MASK) * (1.0d - ((double) f2))));
        }
        AnonymousClass3LA r2 = this.A04;
        if (r2 != null) {
            A00(r2, this, (float) (1.0d - ((double) f2)));
            r2.setAlpha((int) (((float) MotionEventCompat.ACTION_MASK) * f2));
        }
    }

    public void A02(RectF rectF) {
        float f2;
        float f3;
        AnonymousClass4QW r0 = this.A05;
        Context context = this.A07;
        float dimension = context.getResources().getDimension(r0.A00);
        PointF A002 = C89594cV.A00(context, this.A01, this.A02);
        RectF rectF2 = this.A08;
        float f4 = rectF.bottom - (dimension - A002.y);
        rectF2.top = f4;
        rectF2.bottom = f4 + dimension;
        if (this.A09.A0T()) {
            f2 = rectF.left;
            f3 = A002.x;
        } else {
            f2 = rectF.right;
            f3 = dimension - A002.x;
        }
        float f5 = f2 - f3;
        rectF2.left = f5;
        float f6 = f5 + dimension;
        rectF2.right = f6;
        float A003 = this.A05.A00();
        rectF2.left = f5 - A003;
        rectF2.top -= A003;
        rectF2.right = f6 + A003;
        rectF2.bottom += A003;
        A01();
    }

    public void AXN(AnonymousClass4X6 r6) {
        AnonymousClass41N r0;
        double d2 = r6.A07.A00;
        if (d2 == 0.0d) {
            r0 = AnonymousClass41N.NONE;
        } else if (d2 == 1.0d) {
            r0 = AnonymousClass41N.CHECKED;
        } else {
            return;
        }
        this.A00 = r0;
    }

    public void AXO(AnonymousClass4X6 r2) {
        A01();
        this.A0A.invalidate();
    }
}
