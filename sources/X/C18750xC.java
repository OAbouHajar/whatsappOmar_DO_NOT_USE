package X;

import com.facebook.redex.RunnableRunnableShape0S1101000_I0;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0xC  reason: invalid class name and case insensitive filesystem */
public class C18750xC {
    public final C18740xB A00;
    public final C18730xA A01;
    public final C16320sq A02;
    public final Map A03 = new ConcurrentHashMap();

    public C18750xC(C18740xB r2, C18730xA r3, C16320sq r4) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public void A00(UserJid userJid, String str, int i2) {
        Integer A002 = C18740xB.A00(i2);
        if (A002 != null) {
            this.A03.put(str, new AnonymousClass4L1(userJid, this.A01.A00(A002.intValue()), i2));
        }
    }

    public void A01(String str) {
        this.A02.Acl(new RunnableRunnableShape0S1101000_I0(this, str, 1, 2));
    }

    public void A02(String str) {
        this.A02.Acl(new RunnableRunnableShape0S1101000_I0(this, str, 0, 2));
    }
}
