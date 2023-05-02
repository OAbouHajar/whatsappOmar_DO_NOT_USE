package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.5ty  reason: invalid class name and case insensitive filesystem */
public class C118045ty {
    public String A00;
    public Map A01;

    public synchronized Map A00(UserJid userJid) {
        Map map;
        map = this.A01;
        if (map == null || !userJid.getRawString().equals(this.A00)) {
            this.A00 = userJid.getRawString();
            map = AnonymousClass000.A0x();
            this.A01 = map;
        }
        return map;
    }
}
