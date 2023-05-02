package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.07Y  reason: invalid class name */
public class AnonymousClass07Y extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public Bitmap A04;
    public Paint A05;
    public PorterDuff.Mode A06;
    public PorterDuff.Mode A07;
    public AnonymousClass07Z A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public AnonymousClass07Y() {
        this.A03 = null;
        this.A07 = AnonymousClass07V.A09;
        this.A08 = new AnonymousClass07Z();
    }

    public AnonymousClass07Y(AnonymousClass07Y r4) {
        this.A03 = null;
        this.A07 = AnonymousClass07V.A09;
        if (r4 != null) {
            this.A01 = r4.A01;
            AnonymousClass07Z r2 = new AnonymousClass07Z(r4.A08);
            this.A08 = r2;
            Paint paint = r4.A08.A06;
            if (paint != null) {
                r2.A06 = new Paint(paint);
            }
            Paint paint2 = r4.A08.A07;
            if (paint2 != null) {
                this.A08.A07 = new Paint(paint2);
            }
            this.A03 = r4.A03;
            this.A07 = r4.A07;
            this.A09 = r4.A09;
        }
    }

    public void A00(int i2, int i3) {
        this.A04.eraseColor(0);
        Canvas canvas = new Canvas(this.A04);
        AnonymousClass07Z r0 = this.A08;
        r0.A00(canvas, AnonymousClass07Z.A0G, r0.A0F, i2, i3);
    }

    public int getChangingConfigurations() {
        return this.A01;
    }

    public Drawable newDrawable() {
        return new AnonymousClass07V(this);
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass07V(this);
    }
}
