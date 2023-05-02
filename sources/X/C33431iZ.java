package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1iZ  reason: invalid class name and case insensitive filesystem */
public class C33431iZ implements C33441ia {
    public final /* synthetic */ C19350yI A00;

    public C33431iZ(C19350yI r1) {
        this.A00 = r1;
    }

    public void ARn(DeviceJid deviceJid, int i2) {
    }

    public void AS5(DeviceJid deviceJid) {
        C28331Vq r4;
        UserJid userJid = deviceJid.getUserJid();
        C19350yI r6 = this.A00;
        C16010sH A08 = r6.A04.A08(userJid);
        if (!(A08 == null || (r4 = A08.A0C) == null)) {
            StringBuilder sb = new StringBuilder("confirming unconfirmed vname cert; jid=");
            sb.append(userJid);
            Log.i(sb.toString());
            C17030uP r3 = r6.A05;
            byte[] A06 = r3.A06(userJid);
            if (A06 != null) {
                r3.A04(userJid, r4.A00(), A06, r4.A03);
            }
            r6.A0A.A0R(userJid, C28341Vr.A00(r4).A01());
        }
        if (deviceJid.device == 0) {
            r6.A0F.A02(userJid);
        }
    }

    public void AS6(DeviceJid deviceJid) {
        C19350yI.A00(this.A00, deviceJid, false);
    }

    public void AS7(DeviceJid deviceJid) {
        C19350yI.A00(this.A00, deviceJid, true);
    }
}
