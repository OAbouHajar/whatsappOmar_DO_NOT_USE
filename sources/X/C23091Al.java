package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Al  reason: invalid class name and case insensitive filesystem */
public final class C23091Al {
    public final C18730xA A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public C23091Al(C18730xA r2) {
        this.A00 = r2;
    }

    public final void A00(UserJid userJid, int i2) {
        Number number = (Number) this.A01.get(Integer.valueOf(i2));
        if (number != null) {
            this.A00.A01(new AnonymousClass4L0(userJid, (String) null, false), number.intValue(), i2);
        }
    }
}
