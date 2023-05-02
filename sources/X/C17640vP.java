package X;

import com.facebook.redex.IDxRCallbackShape48S0200000_1_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0vP  reason: invalid class name and case insensitive filesystem */
public class C17640vP {
    public final C16300so A00;
    public final C17190ug A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;
    public final AnonymousClass01D A04;
    public final AnonymousClass01D A05;
    public final AnonymousClass01D A06;
    public final AnonymousClass01D A07;
    public final AnonymousClass01D A08;

    public C17640vP(C16300so r1, C17190ug r2, AnonymousClass01D r3, AnonymousClass01D r4, AnonymousClass01D r5, AnonymousClass01D r6, AnonymousClass01D r7, AnonymousClass01D r8, AnonymousClass01D r9) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A08 = r4;
        this.A07 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r8;
        this.A02 = r9;
    }

    public static /* synthetic */ void A00(C17640vP r3, DeviceJid deviceJid, int i2) {
        StringBuilder sb = new StringBuilder("recvmessagelistener/on-get-identity-error/jid = ");
        sb.append(deviceJid);
        sb.append(" errorCode = ");
        sb.append(i2);
        Log.w(sb.toString());
        for (C33441ia ARn : ((C16590tJ) r3.A05.get()).A01()) {
            ARn.ARn(deviceJid, i2);
        }
        if (deviceJid.device != 0) {
            ((AnonymousClass16P) r3.A07.get()).A00.execute(new RunnableRunnableShape0S0201000_I0((Object) r3, i2, (Object) deviceJid, 24));
        }
    }

    public void A01(List list) {
        C17190ug r7 = this.A01;
        String A022 = r7.A02();
        C28371Vv[] r6 = new C28371Vv[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            r6[i2] = new C28371Vv("user", new C35081lL[]{new C35081lL((Jid) list.get(i2), "jid")});
        }
        r7.A0G(new IDxRCallbackShape48S0200000_1_I0(list, 0, this), new C28371Vv(new C28371Vv("identity", (C35081lL[]) null, r6), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "encrypt"), new C35081lL("type", "get"), new C35081lL((Jid) C34791ks.A00, "to")}), A022, 153, 32000);
    }
}
