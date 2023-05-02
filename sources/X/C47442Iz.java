package X;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.2Iz  reason: invalid class name and case insensitive filesystem */
public class C47442Iz implements AnonymousClass2J0 {
    public final AnonymousClass0V2 A00;

    public C47442Iz(Context context) {
        this.A00 = new AnonymousClass0V2(new C07080Zb(context));
    }

    public void A5H(AnonymousClass024 r1, AnonymousClass2J2 r2) {
    }

    public boolean A5t() {
        return this.A00.A03(MotionEventCompat.ACTION_MASK) == 0;
    }

    public boolean AHW() {
        return this.A00.A03(MotionEventCompat.ACTION_MASK) != 11;
    }

    public boolean AIt() {
        return this.A00.A03(MotionEventCompat.ACTION_MASK) != 12;
    }
}
