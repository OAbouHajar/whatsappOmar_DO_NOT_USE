package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;

/* renamed from: X.0gv  reason: invalid class name and case insensitive filesystem */
public class C10310gv implements Runnable {
    public final /* synthetic */ C02620Dh A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ Runnable A02;

    public C10310gv(C02620Dh r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, Runnable runnable) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = r1;
        this.A02 = runnable;
    }

    public void run() {
        C02620Dh r1 = this.A00;
        if (!r1.isCancelled()) {
            try {
                this.A02.run();
                r1.A07((Object) null);
            } catch (Exception e2) {
                r1.A06(e2);
            }
        }
    }
}
