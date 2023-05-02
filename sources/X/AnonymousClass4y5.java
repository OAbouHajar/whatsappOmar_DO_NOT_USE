package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4y5  reason: invalid class name */
public class AnonymousClass4y5 implements AnonymousClass27O {
    public final /* synthetic */ AnonymousClass39S A00;

    public AnonymousClass4y5(AnonymousClass39S r1) {
        this.A00 = r1;
    }

    public void AZT(UserJid userJid, Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            AnonymousClass38X r2 = this.A00.A04;
            Log.i(AnonymousClass000.A0g("VoiceService/notifyDeviceRemoved ", deviceJid));
            AnonymousClass00B.A0B("primary device should never be removed", !deviceJid.isPrimary());
            C447225g.A03(r2.A00, deviceJid, true);
        }
    }
}
