package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: X.0gH  reason: invalid class name and case insensitive filesystem */
public class C09910gH implements Runnable {
    public final /* synthetic */ C02620Dh A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;

    public C09910gH(C02620Dh r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = r1;
    }

    public void run() {
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A01;
        shortcutInfoCompatSaverImpl.A04.clear();
        Map map = shortcutInfoCompatSaverImpl.A03;
        for (Future cancel : map.values()) {
            cancel.cancel(false);
        }
        map.clear();
        shortcutInfoCompatSaverImpl.A04(this.A00);
    }
}
