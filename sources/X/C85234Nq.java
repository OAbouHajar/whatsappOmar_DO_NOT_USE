package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.AccelerateInterpolator;
import com.facebook.redex.IDxLAdapterShape1S0200000_2_I1;

/* renamed from: X.4Nq  reason: invalid class name and case insensitive filesystem */
public class C85234Nq {
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public PointF A04;
    public boolean A05;

    public C85234Nq(PointF pointF, AnonymousClass1W7 r7, float f2, float f3, int i2, long j2) {
        this.A04 = pointF;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.2f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A02 = ofFloat;
        ofFloat.setDuration(250);
        this.A02.setInterpolator(accelerateInterpolator);
        this.A02.addUpdateListener(new C91114fO(this, f2, f3, i2));
        this.A02.addListener(new IDxLAdapterShape1S0200000_2_I1(this, 5, r7));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A03 = ofFloat2;
        ofFloat2.setDuration(200);
        this.A03.setInterpolator(accelerateInterpolator);
        this.A03.addUpdateListener(new C91084fL(this, f2, f3));
        this.A03.addListener(new AnonymousClass3KG(r7, this, j2));
    }
}
