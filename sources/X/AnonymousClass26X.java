package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;

/* renamed from: X.26X  reason: invalid class name */
public abstract class AnonymousClass26X implements C19550yc, AnonymousClass22Z {
    public boolean A00 = false;
    public final C17150uc A01;

    public AnonymousClass26X(C17150uc r2) {
        this.A01 = r2;
    }

    public static void A00(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C28371Vv(str, str2, (C35081lL[]) null));
    }

    public boolean A01(UserJid userJid, int i2) {
        if (i2 != 421) {
            return false;
        }
        if (!this.A00) {
            this.A00 = true;
            this.A01.A07.A02(this, userJid, true);
            return true;
        }
        APn(userJid);
        return true;
    }
}
