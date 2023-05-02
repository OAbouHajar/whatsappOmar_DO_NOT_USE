package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2bo  reason: invalid class name and case insensitive filesystem */
public class C51522bo extends C51442bg {
    public C51522bo(C16300so r1, C14710pd r2, C16490t9 r3, AnonymousClass2H7 r4, Map map) {
        super(r1, r2, r3, r4, map);
    }

    public void A00(C28371Vv r9) {
        AnonymousClass2H8 r5;
        Bundle bundle;
        Handler handler;
        int i2;
        int i3;
        C28371Vv A0I = r9.A0I(0);
        Class<Jid> cls = Jid.class;
        C16300so r1 = this.A01;
        C15830rv A00 = C16030sJ.A00(r9.A0F(r1, cls, "from"));
        C15830rv A002 = C16030sJ.A00(r9.A0F(r1, cls, "participant"));
        if (C28371Vv.A07(A0I, "composing")) {
            String A0N = A0I.A0N("media", (String) null);
            AnonymousClass2H7 r3 = this.A04;
            UserJid of = UserJid.of(A002);
            StringBuilder sb = new StringBuilder("xmpp/reader/read/compose/composing ");
            sb.append(A00);
            sb.append(" ");
            sb.append(of);
            sb.append(" ");
            sb.append(A0N);
            Log.i(sb.toString());
            r5 = r3.A01;
            boolean equals = "audio".equals(A0N);
            bundle = new Bundle();
            AnonymousClass2RS.A01(bundle, A00, "jid");
            AnonymousClass2RS.A01(bundle, of, "author");
            bundle.putInt("media", equals ? 1 : 0);
            handler = null;
            i2 = 0;
            i3 = 20;
        } else if (C28371Vv.A07(A0I, "paused")) {
            AnonymousClass2H7 r32 = this.A04;
            UserJid of2 = UserJid.of(A002);
            StringBuilder sb2 = new StringBuilder("xmpp/reader/read/compose/paused ");
            sb2.append(A00);
            sb2.append(" ");
            sb2.append(of2);
            Log.i(sb2.toString());
            r5 = r32.A01;
            bundle = new Bundle();
            AnonymousClass2RS.A01(bundle, A00, "jid");
            AnonymousClass2RS.A01(bundle, of2, "author");
            handler = null;
            i2 = 0;
            i3 = 21;
        } else {
            return;
        }
        r5.AZq(Message.obtain(handler, i2, i3, i2, bundle));
    }
}
