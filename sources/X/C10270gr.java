package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;

/* renamed from: X.0gr  reason: invalid class name and case insensitive filesystem */
public class C10270gr implements Runnable {
    public final /* synthetic */ C02620Dh A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ C29981bY A02;

    public C10270gr(C02620Dh r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, C29981bY r3) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void run() {
        try {
            this.A02.get();
            this.A00.A07((Object) null);
        } catch (Exception e2) {
            this.A00.A06(e2);
        }
    }
}
