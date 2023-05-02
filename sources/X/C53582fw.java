package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import java.util.ArrayList;

/* renamed from: X.2fw  reason: invalid class name and case insensitive filesystem */
public final class C53582fw {
    public ValueAnimator A00 = null;
    public C53722gA A01 = null;
    public final Animator.AnimatorListener A02 = new IDxLAdapterShape3S0100000_2_I0(this, 0);
    public final ArrayList A03 = new ArrayList();

    public void A00(ValueAnimator valueAnimator, int[] iArr) {
        C53722gA r1 = new C53722gA(valueAnimator, iArr);
        valueAnimator.addListener(this.A02);
        this.A03.add(r1);
    }
}
