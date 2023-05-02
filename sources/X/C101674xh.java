package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4xh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101674xh implements AnonymousClass27N {
    public final /* synthetic */ AnonymousClass39S A00;

    public /* synthetic */ C101674xh(AnonymousClass39S r1) {
        this.A00 = r1;
    }

    public final void AN7(List list) {
        AnonymousClass39S r3 = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid != null) {
                r3.A0K.remove(deviceJid);
                r3.A04.A00(deviceJid);
            }
        }
    }
}
