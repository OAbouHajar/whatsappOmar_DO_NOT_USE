package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1l5  reason: invalid class name and case insensitive filesystem */
public final class C34921l5 {
    public static volatile C34921l5 A01;
    public final AnonymousClass03L A00 = new AnonymousClass03L(1000);

    public static C34921l5 A00() {
        if (A01 == null) {
            synchronized (C34921l5.class) {
                if (A01 == null) {
                    A01 = new C34921l5();
                }
            }
        }
        return A01;
    }

    public static final UserJid A01(String str, String str2) {
        switch (str2.hashCode()) {
            case -2070199035:
                if (str2.equals("status_me")) {
                    return C34091jg.A00;
                }
                break;
            case -1673355044:
                if (str2.equals("s.whatsapp.net")) {
                    return !str.equals("Server") ? !str.equals("0") ? new AnonymousClass1ZT(str) : C34801kt.A00 : C34991lC.A00;
                }
                break;
            case -1102975408:
                if (str2.equals("lid_me")) {
                    return C34981lB.A00;
                }
                break;
            case 107143:
                if (str2.equals("lid")) {
                    return new AnonymousClass1ZX(str);
                }
                break;
        }
        throw new AnonymousClass1W4(Jid.buildRawString(str, str2));
    }

    public UserJid A02(String str, String str2) {
        String buildRawString = Jid.buildRawString(str, str2);
        AnonymousClass03L r2 = this.A00;
        Jid jid = (Jid) r2.A02(buildRawString);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        UserJid A012 = A01(str, str2);
        r2.A06(buildRawString, A012);
        return A012;
    }
}
