package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.4ul  reason: invalid class name and case insensitive filesystem */
public class C99894ul implements C33441ia {
    public final /* synthetic */ AnonymousClass39S A00;

    public C99894ul(AnonymousClass39S r1) {
        this.A00 = r1;
    }

    public void ARn(DeviceJid deviceJid, int i2) {
    }

    public void AS5(DeviceJid deviceJid) {
    }

    public void AS6(DeviceJid deviceJid) {
        AnonymousClass38X r1 = this.A00.A04;
        Log.i(AnonymousClass000.A0g("VoiceService/notifyDeviceIdentityChanged ", deviceJid));
        C447225g.A03(r1.A00, deviceJid, false);
    }

    public void AS7(DeviceJid deviceJid) {
        AnonymousClass38X r1 = this.A00.A04;
        Log.i(AnonymousClass000.A0g("VoiceService/notifyDeviceIdentityDeleted ", deviceJid));
        C447225g.A03(r1.A00, deviceJid, true);
    }
}
