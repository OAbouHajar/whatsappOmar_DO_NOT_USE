package X;

import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0zt  reason: invalid class name and case insensitive filesystem */
public class C20340zt {
    public final C16300so A00;
    public final C18020w1 A01;
    public final C16600tK A02;
    public final C17190ug A03;

    public C20340zt(C16300so r1, C18020w1 r2, C16600tK r3, C17190ug r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(AnonymousClass2QJ r8) {
        int i2 = r8.A01;
        StringBuilder sb = new StringBuilder("MessageReceiptXmppMethod/message-retry; message.key=");
        sb.append(r8.A0A);
        sb.append("; jid=");
        Jid jid = r8.A04;
        sb.append(jid);
        sb.append("; retryCount=");
        sb.append(i2);
        Log.i(sb.toString());
        if (i2 > 4) {
            this.A00.AcB("retry-count-too-high", String.valueOf(i2), false);
            C18020w1 r4 = this.A01;
            C52672eG r3 = new C52672eG();
            r3.A04 = Long.valueOf((long) i2);
            Jid jid2 = r8.A06;
            if (jid2 == null) {
                jid2 = jid;
            }
            r3.A03 = Integer.valueOf(C18020w1.A04(jid2));
            C16040sK r1 = r4.A02;
            Jid jid3 = r8.A05;
            if (jid3 == null) {
                jid3 = jid;
            }
            r3.A01 = Integer.valueOf(C18020w1.A01(r1, DeviceJid.of(jid3)));
            C30841d3 r0 = (C30841d3) r4.A0D.A00(0, r8.A02);
            if (r0 != null) {
                r3.A02 = Integer.valueOf(r0.A00);
            }
            r4.A0L.Acl(new RunnableRunnableShape0S0300000_I0(r4, r8, r3, 4));
        }
    }
}
