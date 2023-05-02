package X;

import java.util.TimerTask;

/* renamed from: X.5CT  reason: invalid class name */
public class AnonymousClass5CT extends TimerTask {
    public final /* synthetic */ AnonymousClass27A A00;

    public AnonymousClass5CT(AnonymousClass27A r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass27A r2 = this.A00;
        if (!r2.A03) {
            AnonymousClass27A.A0N.remove(r2.A02.toString());
            if (!r2.A04) {
                C14870pt.A01(r2.A07, this, 16);
            }
            r2.A01(2);
        }
    }
}
