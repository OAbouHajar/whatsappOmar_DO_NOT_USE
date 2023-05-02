package X;

import com.facebook.redex.IDxRCallbackShape231S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape48S0200000_1_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Future;

/* renamed from: X.1Rw  reason: invalid class name and case insensitive filesystem */
public class C27471Rw {
    public static final C35081lL[] A04 = new C35081lL[0];
    public final C16300so A00;
    public final C17190ug A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;

    public C27471Rw(C16300so r1, C17190ug r2, AnonymousClass01D r3, AnonymousClass01D r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public Future A00(C15830rv r21, C15830rv r22, C30821d1 r23, String str, int i2) {
        C17190ug r2 = this.A01;
        String A032 = r2.A03();
        C15830rv r9 = r21;
        String str2 = str;
        C28371Vv r3 = new C28371Vv(new C28371Vv(C454228o.A00(r23, i2), "location", r22 == null ? new C35081lL[]{new C35081lL("final", str2)} : new C35081lL[]{new C35081lL("final", str2), new C35081lL((Jid) r22, "context")}), "notification", new C35081lL[]{new C35081lL("id", A032), new C35081lL((Jid) r9, "to"), new C35081lL("type", "location")});
        HashMap hashMap = new HashMap();
        return r2.A06(r3, new C30641ci(r9, (Jid) null, (UserJid) null, "notification", A032, "location", (String) null, (String) null, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()), 0), 188);
    }

    public void A01(Jid jid, String str, int i2) {
        C28371Vv r2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL(jid, "to"));
        arrayList.add(new C35081lL("id", str));
        if (i2 == 0) {
            arrayList.add(new C35081lL("type", "result"));
            r2 = null;
        } else {
            arrayList.add(new C35081lL("type", "error"));
            r2 = new C28371Vv("error", new C35081lL[]{new C35081lL("code", Integer.toString(i2))});
        }
        C28371Vv r3 = new C28371Vv(r2, "iq", (C35081lL[]) arrayList.toArray(A04));
        C17190ug r1 = this.A01;
        r1.A0G(new IDxRCallbackShape231S0100000_2_I0(this, 1), r3, r1.A02(), 225, 32000);
    }

    public void A02(C454328p r15) {
        C17190ug r7 = this.A01;
        String A022 = r7.A02();
        StringBuilder sb = new StringBuilder("LocationSubscriptionSendMethods/subscribe; iqId=");
        sb.append(A022);
        Log.i(sb.toString());
        r7.A0A(new IDxRCallbackShape48S0200000_1_I0(r15, 2, this), new C28371Vv(new C28371Vv("subscribe", r15.A01 ? new C35081lL[]{new C35081lL("participants", "true")} : null), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "location"), new C35081lL("type", "get"), new C35081lL((Jid) r15.A00, "to")}), A022, 82, 32000);
    }
}
