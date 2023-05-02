package X;

import android.os.Handler;

/* renamed from: X.0Pc  reason: invalid class name and case insensitive filesystem */
public class C05060Pc {
    public C10260gq A00;
    public final Handler A01 = new Handler();
    public final C009604p A02;

    public C05060Pc(C001300o r2) {
        this.A02 = new C009604p(r2);
    }

    public final void A00(C011405n r3) {
        C10260gq r0 = this.A00;
        if (r0 != null) {
            r0.run();
        }
        C10260gq r1 = new C10260gq(r3, this.A02);
        this.A00 = r1;
        this.A01.postAtFrontOfQueue(r1);
    }
}
