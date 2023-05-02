package X;

import com.OM7753.GOLD;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2by  reason: invalid class name and case insensitive filesystem */
public class C51622by {
    public final /* synthetic */ AnonymousClass2CW A00;

    public C51622by(AnonymousClass2CW r1) {
        this.A00 = r1;
    }

    public void A00(C16740tZ r12) {
        UserJid userJid;
        if (!yo.yoHideReceipt(r12)) {
            C28381Vw r6 = r12.A11;
            C51542bq r2 = this.A00.A00;
            boolean z2 = r12.A1D;
            String ADa = z2 ? "sender" : r12 instanceof C29881bN ? ((C29881bN) r12).ADa() : null;
            C15830rv A0B = r12.A0B();
            DeviceJid deviceJid = r12.A19;
            if (z2) {
                C15830rv r1 = r6.A00;
                if (!(r1 instanceof C16060sN)) {
                    userJid = UserJid.of(r1);
                    r2.A05(A0B, deviceJid, userJid, r6, ADa, (String[]) null, r12.A16);
                    StringBuilder sb = new StringBuilder("xmpp/writer/write/message-received; message.key=");
                    sb.append(r6);
                    Log.i(sb.toString());
                }
            }
            userJid = null;
            r2.A05(A0B, deviceJid, userJid, r6, ADa, (String[]) null, r12.A16);
            StringBuilder sb2 = new StringBuilder("xmpp/writer/write/message-received; message.key=");
            sb2.append(r6);
            Log.i(sb2.toString());
        }
    }

    public void A01(C30641ci r3) {
        this.A00.A00.A08(r3.A01(), r3);
        StringBuilder sb = new StringBuilder("xmpp/writer/write/send-stanza-received; stanzaKey=");
        sb.append(r3);
        Log.i(sb.toString());
    }

    public void A02(C30641ci r7, boolean z2) {
        C51542bq r4 = this.A00.A00;
        C28371Vv r3 = null;
        if (z2) {
            r3 = new C28371Vv("features", new C35081lL[]{new C35081lL("readreceipts", "disable")}, (C28371Vv[]) null);
        }
        r4.A08(r3, r7);
        GOLD.A00(r7);
        StringBuilder sb = new StringBuilder("xmpp/writer/write/read-receipt-received; stanzaKey=");
        sb.append(r7);
        sb.append("; disable=");
        sb.append(z2);
        Log.i(sb.toString());
    }
}
