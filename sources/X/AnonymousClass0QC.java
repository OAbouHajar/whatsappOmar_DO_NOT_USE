package X;

import android.view.View;

/* renamed from: X.0QC  reason: invalid class name */
public class AnonymousClass0QC {
    public final /* synthetic */ AnonymousClass0A2 A00;

    public AnonymousClass0QC(AnonymousClass0A2 r1) {
        this.A00 = r1;
    }

    public void A00(View view, int i2) {
        int top2 = view.getTop();
        AnonymousClass0A2 r3 = this.A00;
        int height = r3.A0E ? i2 : view.getHeight();
        boolean z2 = r3.A0A;
        float f2 = (!z2 || height == 0) ? 1.0f : ((float) (i2 - top2)) / ((float) height);
        r3.A00 = f2;
        if (z2) {
            r3.A02(f2);
        }
    }
}
