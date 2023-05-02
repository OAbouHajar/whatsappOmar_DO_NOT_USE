package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.55e  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1043955e implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ C101944y9 A02;

    public /* synthetic */ C1043955e(Drawable drawable, C101944y9 r2, long j2) {
        this.A02 = r2;
        this.A01 = drawable;
        this.A00 = j2;
    }

    public final void run() {
        C101944y9 r0 = this.A02;
        Drawable drawable = this.A01;
        long j2 = this.A00;
        AnonymousClass3Q4 r3 = r0.A03.A04;
        if (r3 == null) {
            return;
        }
        if (drawable != null) {
            r3.A05(drawable, 0);
            return;
        }
        int i2 = 2;
        if (!AnonymousClass000.A1O((j2 > -1 ? 1 : (j2 == -1 ? 0 : -1)))) {
            i2 = 1;
        }
        r3.A05((Drawable) null, i2);
    }
}
