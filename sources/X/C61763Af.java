package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;

/* renamed from: X.3Af  reason: invalid class name and case insensitive filesystem */
public class C61763Af {
    public static final boolean A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public PorterDuff.Mode A09;
    public Drawable A0A;
    public Drawable A0B;
    public GradientDrawable A0C;
    public GradientDrawable A0D;
    public GradientDrawable A0E;
    public GradientDrawable A0F;
    public GradientDrawable A0G;
    public boolean A0H = false;
    public final Paint A0I = C13680ns.A0E();
    public final Rect A0J = AnonymousClass000.A0J();
    public final RectF A0K = AnonymousClass000.A0K();
    public final MaterialButton A0L;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
        }
        A0M = z2;
    }

    public C61763Af(MaterialButton materialButton) {
        this.A0L = materialButton;
    }

    public final Drawable A00() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A0C = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.A00) + 1.0E-5f);
        this.A0C.setColor(-1);
        A01();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.A0G = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.A00) + 1.0E-5f);
        this.A0G.setColor(0);
        this.A0G.setStroke(this.A05, this.A08);
        InsetDrawable insetDrawable = new InsetDrawable(new LayerDrawable(new Drawable[]{this.A0C, this.A0G}), this.A02, this.A04, this.A03, this.A01);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.A0E = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.A00) + 1.0E-5f);
        this.A0E.setColor(-1);
        return new AnonymousClass3LI(C53732gB.A02(this.A07), this.A0E, insetDrawable);
    }

    public final void A01() {
        GradientDrawable gradientDrawable = this.A0C;
        if (gradientDrawable != null) {
            C018208n.A04(this.A06, gradientDrawable);
            PorterDuff.Mode mode = this.A09;
            if (mode != null) {
                C018208n.A07(mode, this.A0C);
            }
        }
    }

    public void A02(int i2) {
        if (this.A00 != i2) {
            this.A00 = i2;
            if (!A0M) {
                GradientDrawable gradientDrawable = this.A0D;
                if (gradientDrawable != null && this.A0F != null) {
                    float f2 = ((float) i2) + 1.0E-5f;
                    gradientDrawable.setCornerRadius(f2);
                    this.A0F.setCornerRadius(f2);
                    this.A0L.invalidate();
                }
            } else if (this.A0C != null && this.A0G != null && this.A0E != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    MaterialButton materialButton = this.A0L;
                    float f3 = ((float) i2) + 1.0E-5f;
                    (materialButton.getBackground() != null ? (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((LayerDrawable) materialButton.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0) : null).setCornerRadius(f3);
                    (materialButton.getBackground() != null ? (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((LayerDrawable) materialButton.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1) : null).setCornerRadius(f3);
                }
                float f4 = ((float) i2) + 1.0E-5f;
                this.A0C.setCornerRadius(f4);
                this.A0G.setCornerRadius(f4);
                this.A0E.setCornerRadius(f4);
            }
        }
    }

    public void A03(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            if (A0M) {
                MaterialButton materialButton = this.A0L;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(colorStateList);
                    return;
                }
                return;
            }
            Drawable drawable = this.A0B;
            if (drawable != null) {
                C018208n.A04(colorStateList, drawable);
            }
        }
    }
}
