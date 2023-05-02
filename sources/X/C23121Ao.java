package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallParticipantJid;

/* renamed from: X.1Ao  reason: invalid class name and case insensitive filesystem */
public class C23121Ao {
    public final AnonymousClass12G A00;
    public final C19810z2 A01;
    public final C14710pd A02;

    public C23121Ao(AnonymousClass12G r1, C19810z2 r2, C14710pd r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public CallParticipantJid A00(UserJid userJid, String str) {
        DeviceJid[] deviceJidArr = (DeviceJid[]) this.A01.A0D(userJid).toArray(new DeviceJid[0]);
        C14710pd r2 = this.A02;
        C16620tM r1 = C16620tM.A02;
        byte[] A08 = r2.A0E(r1, 1970) ? this.A00.A08(userJid) : null;
        int length = deviceJidArr.length;
        if (length > 5 && r2.A0E(r1, 1525)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" calling to primary device only because callee has too many devices");
            Log.i(sb.toString());
            int i2 = 0;
            while (true) {
                DeviceJid deviceJid = deviceJidArr[i2];
                if (deviceJid.device != 0) {
                    i2++;
                    if (i2 >= length) {
                        break;
                    }
                } else {
                    deviceJidArr = new DeviceJid[]{deviceJid};
                    break;
                }
            }
        }
        return new CallParticipantJid(userJid, deviceJidArr, A08);
    }
}
