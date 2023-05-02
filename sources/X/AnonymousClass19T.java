package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.locks.Lock;

/* renamed from: X.19T  reason: invalid class name */
public class AnonymousClass19T extends C16590tJ {
    public final AnonymousClass16P A00;
    public final C18920xT A01;

    public AnonymousClass19T(AnonymousClass16P r1, C18920xT r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A04(DeviceJid deviceJid) {
        Lock A04 = this.A01.A04(deviceJid);
        if (A04 == null) {
            try {
                this.A00.A00();
            } catch (Throwable th) {
                if (A04 != null) {
                    A04.unlock();
                }
                throw th;
            }
        } else {
            A04.lock();
        }
        for (C33441ia AS7 : A01()) {
            AS7.AS7(deviceJid);
        }
        if (A04 != null) {
            A04.unlock();
        }
    }
}
