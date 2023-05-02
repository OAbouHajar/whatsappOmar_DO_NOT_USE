package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.3LA  reason: invalid class name */
public final class AnonymousClass3LA extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public AnonymousClass4QW A04;
    public AnonymousClass2IH A05;
    public final int A06;
    public final Context A07;
    public final Path A08 = new Path();
    public final Path A09 = new Path();
    public final RectF A0A = new RectF();
    public final C15220qW A0B;

    public AnonymousClass3LA(Context context, AnonymousClass4QW r6, AnonymousClass2IH r7) {
        int i2;
        int i3;
        Drawable mutate;
        this.A07 = context;
        this.A06 = AnonymousClass00T.A00(context, R.color.color0879);
        if (r7 instanceof AnonymousClass2II) {
            i2 = R.drawable.ic_action_add;
        } else if (r7 instanceof AnonymousClass2IJ) {
            i2 = R.drawable.ic_camera;
        } else if (r7 instanceof AnonymousClass2IL) {
            i2 = ((AnonymousClass2IL) r7).A00.drawableRes;
        } else if (r7 instanceof AnonymousClass2IM) {
            i2 = R.drawable.ic_group_ephemeral_v2;
        } else if (r7 instanceof C79453zw) {
            i2 = R.drawable.ic_checkmark_selected;
        } else {
            throw new AnonymousClass2Xe();
        }
        Drawable A042 = AnonymousClass00T.A04(context, i2);
        Drawable drawable = null;
        if (!(A042 == null || (mutate = A042.mutate()) == null)) {
            drawable = C018208n.A03(mutate);
            C18450wi.A0B(drawable);
            C018208n.A0A(drawable, AnonymousClass00T.A00(context, r7.A01.A01));
        }
        this.A03 = drawable;
        Resources resources = context.getResources();
        AnonymousClass4WR r2 = r7.A00;
        C18450wi.A0H(r2, 1);
        if (r6 instanceof C79383zp) {
            i3 = r2.A00;
        } else if (r6 instanceof C79413zs) {
            i3 = r2.A03;
        } else if (r6 instanceof C79403zr) {
            i3 = r2.A02;
        } else if (r6 instanceof C79393zq) {
            i3 = r2.A01;
        } else {
            throw new AnonymousClass2Xe();
        }
        float f2 = (float) 2;
        this.A00 = resources.getDimension(i3) / f2;
        this.A01 = AnonymousClass00T.A00(context, r7.A01.A00);
        this.A02 = (int) (context.getResources().getDimension(r6.A00) + (r6.A00() * f2));
        this.A0B = AnonymousClass3K3.A0t(14);
        this.A04 = r6;
        this.A05 = r7;
    }

    public void draw(Canvas canvas) {
        C18450wi.A0H(canvas, 0);
        Drawable drawable = this.A03;
        if (drawable != null) {
            C15220qW r2 = this.A0B;
            ((Paint) r2.getValue()).setColor(this.A06);
            AnonymousClass3K4.A0k(canvas, this.A09, r2);
        }
        C15220qW r22 = this.A0B;
        ((Paint) r22.getValue()).setColor(this.A01);
        AnonymousClass4JA r1 = this.A05.A01;
        if ((r1 instanceof C79423zt) || (r1 instanceof C79443zv)) {
            AnonymousClass3K4.A0k(canvas, this.A08, r22);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public int getIntrinsicHeight() {
        return this.A02;
    }

    public int getIntrinsicWidth() {
        return this.A02;
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        C18450wi.A0H(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0A;
        rectF.set(rect);
        Path path = this.A09;
        path.reset();
        float f2 = (float) 2;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / f2, direction);
        float A002 = this.A04.A00();
        rectF.inset(A002, A002);
        Path path2 = this.A08;
        path2.reset();
        path2.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / f2, direction);
        Drawable drawable = this.A03;
        if (drawable != null) {
            float centerX = rectF.centerX();
            float f3 = this.A00;
            RectF rectF2 = new RectF(centerX - f3, rectF.centerY() - f3, rectF.centerX() + f3, rectF.centerY() + f3);
            Rect rect2 = new Rect();
            rectF2.roundOut(rect2);
            drawable.setBounds(rect2);
        }
        invalidateSelf();
    }

    public void setAlpha(int i2) {
        ((Paint) this.A0B.getValue()).setAlpha(i2);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
