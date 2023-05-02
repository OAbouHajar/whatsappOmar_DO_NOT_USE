package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.2fq  reason: invalid class name and case insensitive filesystem */
public class C53522fq extends C53462fk {
    public InsetDrawable A00;

    public C53522fq(AnonymousClass2WL r1, C53512fp r2) {
        super(r1, r2);
    }

    public float A01() {
        return this.A0N.getElevation();
    }

    public GradientDrawable A03() {
        return new AnonymousClass3LE();
    }

    public C53562fu A04() {
        return new C67513bp();
    }

    public void A06() {
    }

    public void A07() {
        A09();
    }

    public void A0A(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.A0N.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C53462fk.A0V, A0I(f2, f4));
            stateListAnimator.addState(C53462fk.A0U, A0I(f2, f3));
            stateListAnimator.addState(C53462fk.A0S, A0I(f2, f3));
            stateListAnimator.addState(C53462fk.A0T, A0I(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            AnonymousClass2WL r6 = this.A0N;
            arrayList.add(ObjectAnimator.ofFloat(r6, "elevation", new float[]{f2}).setDuration(0));
            if (i2 >= 22 && i2 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(r6, View.TRANSLATION_Z, new float[]{r6.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(r6, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C53462fk.A0P);
            stateListAnimator.addState(C53462fk.A0R, animatorSet);
            stateListAnimator.addState(C53462fk.A0Q, A0I(0.0f, 0.0f));
            r6.setStateListAnimator(stateListAnimator);
        }
        if (((C53502fo) this.A0O).A00.A0B) {
            A09();
        }
    }

    public void A0B(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C53732gB.A02(colorStateList));
        } else {
            super.A0B(colorStateList);
        }
    }

    public void A0C(ColorStateList colorStateList, ColorStateList colorStateList2, PorterDuff.Mode mode, int i2) {
        Drawable drawable;
        AnonymousClass3LE r1 = new AnonymousClass3LE();
        r1.setShape(1);
        r1.setColor(-1);
        Drawable A03 = C018208n.A03(r1);
        this.A0A = A03;
        C018208n.A04(colorStateList, A03);
        if (mode != null) {
            C018208n.A07(mode, this.A0A);
        }
        if (i2 > 0) {
            C53562fu A05 = A05(colorStateList, i2);
            this.A0G = A05;
            drawable = new LayerDrawable(new Drawable[]{A05, this.A0A});
        } else {
            this.A0G = null;
            drawable = this.A0A;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C53732gB.A02(colorStateList2), drawable, (Drawable) null);
        this.A09 = rippleDrawable;
        this.A08 = rippleDrawable;
        C53522fq.super.setBackgroundDrawable(rippleDrawable);
    }

    public void A0E(Rect rect) {
        AnonymousClass2WK r2 = ((C53502fo) this.A0O).A00;
        if (r2.A0B) {
            r2.getSizeDimension();
            float elevation = this.A0N.getElevation() + this.A03;
            int ceil = (int) Math.ceil((double) elevation);
            int ceil2 = (int) Math.ceil((double) (elevation * 1.5f));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    public void A0F(Rect rect) {
        InsetDrawable insetDrawable;
        AnonymousClass2WK r1 = ((C53502fo) this.A0O).A00;
        if (r1.A0B) {
            InsetDrawable insetDrawable2 = new InsetDrawable(this.A09, rect.left, rect.top, rect.right, rect.bottom);
            this.A00 = insetDrawable2;
            insetDrawable = insetDrawable2;
        } else {
            insetDrawable = this.A09;
        }
        C53522fq.super.setBackgroundDrawable(insetDrawable);
    }

    public void A0G(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            AnonymousClass2WL r2 = this.A0N;
            float f2 = 0.0f;
            if (r2.isEnabled()) {
                r2.setElevation(this.A00);
                if (r2.isPressed()) {
                    f2 = this.A03;
                } else if (r2.isFocused() || r2.isHovered()) {
                    f2 = this.A01;
                }
            } else {
                r2.setElevation(0.0f);
            }
            r2.setTranslationZ(f2);
        }
    }

    public boolean A0H() {
        return false;
    }

    public final Animator A0I(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnonymousClass2WL r7 = this.A0N;
        animatorSet.play(ObjectAnimator.ofFloat(r7, "elevation", new float[]{f2}).setDuration(0)).with(ObjectAnimator.ofFloat(r7, View.TRANSLATION_Z, new float[]{f3}).setDuration(100));
        animatorSet.setInterpolator(C53462fk.A0P);
        return animatorSet;
    }
}
