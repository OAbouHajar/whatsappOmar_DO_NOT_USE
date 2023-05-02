package X;

import android.animation.Animator;
import android.view.View;
import java.util.List;

/* renamed from: X.0Fa  reason: invalid class name */
public class AnonymousClass0Fa extends AnonymousClass0XS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C02800Fh A01;
    public final /* synthetic */ C005602k A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Fa(C02800Fh r9, C005602k r10, C005602k r11, float f2, float f3, float f4, float f5, int i2, int i3) {
        super(r10, f2, f3, f4, f5, i2);
        this.A01 = r9;
        this.A00 = i3;
        this.A02 = r11;
    }

    public void onAnimationEnd(Animator animator) {
        View view;
        super.onAnimationEnd(animator);
        if (!this.A05) {
            int i2 = this.A00;
            C02800Fh r3 = this.A01;
            if (i2 <= 0) {
                C005602k r1 = this.A02;
                C13030lM r0 = C07580c8.A00;
                view = r1.A0H;
                r0.A6F(view);
            } else {
                List list = r3.A0S;
                view = this.A02.A0H;
                list.add(view);
                this.A04 = true;
                r3.A0M.post(new C09890gF(this, r3));
            }
            if (r3.A0G == view) {
                r3.A09(view);
            }
        }
    }
}
