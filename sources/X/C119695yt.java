package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.5yt  reason: invalid class name and case insensitive filesystem */
public class C119695yt implements ViewTreeObserver.OnGlobalLayoutListener {
    public View A00;
    public C14990q7 A01;
    public C31201dg A02;
    public C14930q1 A03;
    public C14930q1 A04;
    public String A05;
    public boolean A06;

    public final void A00() {
        if (this.A01 != null) {
            this.A06 = false;
            C14930q1 r4 = this.A04;
            if (r4 != null) {
                C31201dg r3 = this.A02;
                C14940q2 r2 = new C14940q2();
                r2.A02(this.A05, 0);
                r2.A02(this.A01, 1);
                C29701b3.A01(this.A01, r3, r2.A01(), r4);
            }
        }
    }

    public void onGlobalLayout() {
        int visibility;
        int visibility2;
        View view = this.A00;
        if (view != null && this.A01 != null) {
            if (this.A06 && ((visibility2 = view.getVisibility()) == 4 || visibility2 == 8)) {
                A00();
            } else if (!this.A06 && (visibility = this.A00.getVisibility()) != 4 && visibility != 8 && this.A01 != null) {
                this.A06 = true;
                C14930q1 r4 = this.A03;
                if (r4 != null) {
                    C31201dg r3 = this.A02;
                    C14940q2 r2 = new C14940q2();
                    r2.A02(this.A05, 0);
                    r2.A02(this.A01, 1);
                    C29701b3.A01(this.A01, r3, r2.A01(), r4);
                }
            }
        }
    }
}
