package X;

import android.view.animation.AlphaAnimation;
import com.obwhatsapp.WaImageView;

/* renamed from: X.39Y  reason: invalid class name */
public class AnonymousClass39Y {
    public int A00 = 0;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04 = false;
    public final int A05;
    public final int A06;
    public final int A07;
    public final AnonymousClass4ET A08;
    public final C49102Rb A09;
    public final C85974Qs A0A;
    public final C85984Qt A0B;

    public AnonymousClass39Y(AnonymousClass4ET r2, C49102Rb r3, C85974Qs r4, C85984Qt r5, int i2, int i3, int i4) {
        this.A05 = i2;
        this.A07 = i3;
        this.A06 = i4;
        this.A09 = r3;
        this.A0B = r5;
        this.A08 = r2;
        this.A0A = r4;
        r3.A02 = true;
        r3.A00 = new C102774zV(this);
    }

    public void A00(int i2, int i3) {
        this.A01 = i3;
        this.A0A.A01.A09.A01(i3);
        if (this.A02 != i2 || this.A04) {
            A01(this.A04 ? this.A00 : 0, i2);
        }
    }

    public void A01(int i2, int i3) {
        if (!this.A03) {
            C85974Qs r0 = this.A0A;
            r0.A00(i2);
            this.A00 = i2;
            this.A02 = i3;
            C53742gD r2 = r0.A01;
            r2.A08.setSizeAndInvalidate((float) i3);
            if (this.A04) {
                r2.A09.A01(this.A01);
                this.A04 = false;
            }
        }
    }

    public final void A02(boolean z2) {
        C85974Qs r1 = this.A0A;
        boolean z3 = !this.A0B.A01.A03.A00.isEmpty();
        C53742gD r3 = r1.A01;
        WaImageView waImageView = r3.A07;
        if (waImageView != null) {
            int i2 = 4;
            int visibility = waImageView.getVisibility();
            if (!z3) {
                if (visibility == 4) {
                    return;
                }
            } else if (visibility == 0) {
                return;
            }
            WaImageView waImageView2 = r3.A07;
            if (z3) {
                i2 = 0;
            }
            waImageView2.setVisibility(i2);
            if (z2) {
                float f2 = 0.0f;
                float f3 = 1.0f;
                if (z3) {
                    f3 = 0.0f;
                    f2 = 1.0f;
                }
                AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f2);
                alphaAnimation.setInterpolator(z3 ? new C016007q() : new C018608r());
                alphaAnimation.setDuration(100);
                r3.A07.startAnimation(alphaAnimation);
            }
        }
    }
}
