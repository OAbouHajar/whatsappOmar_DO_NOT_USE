package X;

import android.os.Handler;

/* renamed from: X.4TD  reason: invalid class name */
public final class AnonymousClass4TD {
    public final Handler A00;
    public final AnonymousClass5TI A01;

    public AnonymousClass4TD(Handler handler, AnonymousClass5TI r2) {
        this.A00 = r2 == null ? null : handler;
        this.A01 = r2;
    }

    public void A00(C85484Oq r3) {
        synchronized (r3) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            C13700nu.A0O(handler, this, r3, 6);
        }
    }
}
