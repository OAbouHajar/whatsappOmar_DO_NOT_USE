package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1I0  reason: invalid class name */
public class AnonymousClass1I0 {
    public final Map A00 = new HashMap();
    public final Map A01 = new AnonymousClass197(500);

    public void A00(UserJid userJid) {
        synchronized (this) {
            Map map = this.A00;
            AnonymousClass4D2 r0 = (AnonymousClass4D2) map.get(userJid);
            if (r0 != null) {
                for (C35701mM r02 : r0.A00) {
                    this.A01.remove(r02.A0D);
                }
            }
            map.remove(userJid);
        }
    }
}
