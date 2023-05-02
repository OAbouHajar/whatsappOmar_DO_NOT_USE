package X;

import android.view.View;

/* renamed from: X.0h0  reason: invalid class name and case insensitive filesystem */
public class C10360h0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C02410Bu A02;

    public C10360h0(View view, C02410Bu r2, int i2) {
        this.A02 = r2;
        this.A01 = view;
        this.A00 = i2;
    }

    public void run() {
        C02410Bu r6 = this.A02;
        if (r6.A06 != null) {
            int height = r6.getHeight();
            C12700kp r0 = r6.A06;
            View view = this.A01;
            AnonymousClass0V8 r3 = r6.A07;
            int i2 = r3.A03;
            int i3 = this.A00;
            r3.A08 = view;
            r3.A02 = -1;
            if (r3.A09(height - r0.AF6(view, height), 0, i3)) {
                r6.postInvalidateOnAnimation();
                return;
            }
            AnonymousClass0QC r02 = r6.A04;
            if (r02 != null && i2 == 0) {
                C12700kp r2 = r6.A06;
                AnonymousClass0A2 r1 = r02.A00;
                r1.A09.A07.A02();
                if (r2 == AnonymousClass0A2.A0H) {
                    if (!r1.A0D) {
                        r1.A03(AnonymousClass0JL.SWIPE_AWAY);
                    }
                    r1.A00();
                }
            }
        }
    }
}
