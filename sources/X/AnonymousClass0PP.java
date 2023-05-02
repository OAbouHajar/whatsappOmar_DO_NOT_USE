package X;

import android.os.Handler;

/* renamed from: X.0PP  reason: invalid class name */
public class AnonymousClass0PP {
    public final Handler A00;
    public final AnonymousClass0NP A01;

    public AnonymousClass0PP(Handler handler, AnonymousClass0NP r2) {
        this.A01 = r2;
        this.A00 = handler;
    }

    public void A00(C05970Ts r5) {
        int i2 = r5.A00;
        if (i2 == 0) {
            this.A00.post(new C10210gl(r5.A01, this.A01, this));
            return;
        }
        this.A00.post(new C10220gm(this.A01, this, i2));
    }
}
