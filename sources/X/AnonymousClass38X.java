package X;

import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.Map;

/* renamed from: X.38X  reason: invalid class name */
public class AnonymousClass38X {
    public final /* synthetic */ C447225g A00;

    public AnonymousClass38X(C447225g r1) {
        this.A00 = r1;
    }

    public void A00(DeviceJid deviceJid) {
        byte byteValue;
        Log.i(AnonymousClass000.A0g("VoiceService/notifyNewSessionEstablished ", deviceJid));
        C447225g r4 = this.A00;
        r4.A0g(deviceJid, Voip.getCurrentCallId(), false);
        Map map = r4.A2k;
        String A0e = C13690nt.A0e(deviceJid, map);
        if (A0e != null) {
            Log.i(AnonymousClass000.A0g("voip/sendOfferRetryRequest for jid:", deviceJid));
            map.remove(deviceJid);
            r4.A14.execute(new RunnableRunnableShape0S1100000_I0(23, A0e, deviceJid));
        }
        Number number = (Number) r4.A2l.get(deviceJid);
        if (number != null && (byteValue = number.byteValue()) >= 0 && byteValue <= 4) {
            StringBuilder A0r = AnonymousClass000.A0r("voip/sendPendingRekeyRequest for jid:");
            A0r.append(deviceJid);
            A0r.append(", retry:");
            A0r.append(number);
            C13680ns.A1V(A0r);
            r4.A14.execute(new RunnableRunnableShape3S0200000_I0_1(deviceJid, 44, number));
        }
    }
}
