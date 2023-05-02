package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2bi  reason: invalid class name and case insensitive filesystem */
public class C51462bi extends C51442bg {
    public final C16040sK A00;

    public C51462bi(C16300so r7, C16040sK r8, C14710pd r9, C16490t9 r10, AnonymousClass2H7 r11, Map map) {
        super(r7, r9, r10, r11, map);
        this.A00 = r8;
    }

    public void A00(C28371Vv r10) {
        AnonymousClass2H8 r5;
        Bundle bundle;
        Handler handler;
        int i2;
        int i3;
        Jid A0F = r10.A0F(this.A01, Jid.class, "from");
        if (A0F instanceof DeviceJid) {
            if (this.A00.A0J((DeviceJid) A0F)) {
                this.A04.A01.AZq(Message.obtain((Handler) null, 0, 213, 0, r10));
                return;
            }
            return;
        }
        C15830rv A002 = C16030sJ.A00(A0F);
        if (A002 != null) {
            String A0N = r10.A0N("type", (String) null);
            String A0N2 = r10.A0N(FacebookFacade.RequestParameter.NAME, (String) null);
            String A0N3 = r10.A0N("presence", (String) null);
            if ("unavailable".equals(A0N)) {
                AnonymousClass2H7 r6 = this.A04;
                long A003 = AnonymousClass251.A00(r10);
                StringBuilder sb = new StringBuilder("xmpp/reader/read/presence/unavailable ");
                sb.append(A002);
                sb.append(" ");
                sb.append(A003);
                sb.append(" ");
                sb.append(A0N3);
                Log.i(sb.toString());
                r5 = r6.A01;
                bundle = new Bundle();
                AnonymousClass2RS.A01(bundle, A002, "jid");
                bundle.putString("pushName", A0N2);
                bundle.putLong("lastSeen", A003);
                bundle.putString("presence", A0N3);
                handler = null;
                i2 = 0;
                i3 = 64;
            } else if ("unsubscribe".equals(A0N)) {
                AnonymousClass2H7 r2 = this.A04;
                StringBuilder sb2 = new StringBuilder("xmpp/reader/read/presence/unsubscribe ");
                sb2.append(A002);
                Log.i(sb2.toString());
                r5 = r2.A01;
                bundle = new Bundle();
                AnonymousClass2RS.A01(bundle, A002, "jid");
                bundle.putString("pushName", A0N2);
                handler = null;
                i2 = 0;
                i3 = 88;
            } else if (A0N == null || "available".equals(A0N)) {
                AnonymousClass2H7 r22 = this.A04;
                StringBuilder sb3 = new StringBuilder("xmpp/reader/read/presence/available ");
                sb3.append(A002);
                Log.i(sb3.toString());
                r5 = r22.A01;
                bundle = new Bundle();
                AnonymousClass2RS.A01(bundle, A002, "jid");
                bundle.putString("pushName", A0N2);
                handler = null;
                i2 = 0;
                i3 = 5;
            } else {
                return;
            }
            r5.AZq(Message.obtain(handler, i2, i3, i2, bundle));
        }
    }
}
