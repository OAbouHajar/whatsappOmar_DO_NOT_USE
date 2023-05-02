package X;

import android.view.View;

/* renamed from: X.0fy  reason: invalid class name and case insensitive filesystem */
public class C09720fy implements Runnable {
    public AnonymousClass0D1 A00;
    public final /* synthetic */ AnonymousClass0ZV A01;

    public C09720fy(AnonymousClass0D1 r1, AnonymousClass0ZV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass06H r0;
        AnonymousClass0ZV r2 = this.A01;
        C016607w r1 = r2.A08;
        if (!(r1 == null || (r0 = r1.A03) == null)) {
            r0.ATf(r1);
        }
        View view = (View) r2.A0A;
        if (!(view == null || view.getWindowToken() == null)) {
            AnonymousClass0D1 r12 = this.A00;
            if (r12.A03()) {
                r2.A0F = r12;
            }
        }
        r2.A0D = null;
    }
}
