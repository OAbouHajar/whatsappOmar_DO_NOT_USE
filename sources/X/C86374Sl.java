package X;

import java.util.Map;

/* renamed from: X.4Sl  reason: invalid class name and case insensitive filesystem */
public class C86374Sl {
    public Map A00;

    public synchronized void A00(C28381Vw r5) {
        Map map = this.A00;
        if (map == null) {
            map = AnonymousClass000.A0x();
            this.A00 = map;
        }
        map.put(r5, new AnonymousClass01Q(AnonymousClass3K2.A0Z(), C13680ns.A0X()));
    }

    public synchronized void A01(C28381Vw r2) {
        Map map = this.A00;
        if (map != null) {
            map.remove(r2);
        }
    }
}
