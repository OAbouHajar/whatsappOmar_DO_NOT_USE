package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxLAdapterShape7S0200000_I1;

/* renamed from: X.0GT  reason: invalid class name */
public class AnonymousClass0GT extends AnonymousClass0GF {
    public AnonymousClass0GT() {
    }

    public AnonymousClass0GT(int i2) {
        if ((i2 & -4) == 0) {
            this.A00 = i2;
            return;
        }
        throw AnonymousClass000.A0T("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void A0W(C06230Uw r4) {
        AnonymousClass0GF.A03(r4);
        r4.A02.put("android:fade:transitionAlpha", Float.valueOf(C06430Vt.A02.A00(r4.A00)));
    }

    public Animator A0X(View view, ViewGroup viewGroup, C06230Uw r7, C06230Uw r8) {
        Number number;
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (!(r7 == null || (number = (Number) r7.A02.get("android:fade:transitionAlpha")) == null)) {
            f3 = number.floatValue();
        }
        if (f3 != 1.0f) {
            f2 = f3;
        }
        return A0Z(view, f2, 1.0f);
    }

    public Animator A0Y(View view, ViewGroup viewGroup, C06230Uw r6, C06230Uw r7) {
        C06430Vt.A02.A05(view);
        float f2 = 1.0f;
        Number number = (Number) r6.A02.get("android:fade:transitionAlpha");
        if (number != null) {
            f2 = number.floatValue();
        }
        return A0Z(view, f2, 0.0f);
    }

    public final Animator A0Z(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        C06430Vt.A02.A06(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C06430Vt.A01, new float[]{f3});
        ofFloat.addListener(new C020609o(view));
        A08(new IDxLAdapterShape7S0200000_I1(view, 0, this));
        return ofFloat;
    }
}
