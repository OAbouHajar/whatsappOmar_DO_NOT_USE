package X;

import android.graphics.Bitmap;
import android.view.View;

/* renamed from: X.25W  reason: invalid class name */
public abstract class AnonymousClass25W {
    public Bitmap A00() {
        if (this instanceof AnonymousClass25Y) {
            return C25791Ld.A01(((AnonymousClass25Y) this).A00, 100, false, false);
        }
        AnonymousClass25X r0 = (AnonymousClass25X) this;
        return C25791Ld.A01(r0.A02, r0.A00, true, r0.A07);
    }

    public void A01() {
        if (this instanceof AnonymousClass25X) {
            AnonymousClass25X r0 = (AnonymousClass25X) this;
            C25791Ld r11 = r0.A04;
            C16740tZ r3 = r0.A02;
            View view = r0.A01;
            AnonymousClass25V r5 = r0.A03;
            Object obj = r0.A05;
            r11.A04.A01(view, r3, new AnonymousClass25Z(view, r3, r5, r11, obj), r5, obj, r0.A06);
        }
    }
}
