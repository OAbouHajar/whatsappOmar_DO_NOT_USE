package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1T1  reason: invalid class name */
public class AnonymousClass1T1 extends C20040zP {
    public final C16440t3 A00;
    public final AnonymousClass1T0 A01;
    public final C18200wJ A02;
    public final C24881Hq A03;

    public AnonymousClass1T1(C16440t3 r1, AnonymousClass1T0 r2, C18200wJ r3, C24881Hq r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public AnonymousClass21V A07(UserJid userJid) {
        AnonymousClass1T0 r4 = this.A01;
        Object obj = null;
        String string = r4.A02.A00("ctwa_ads_entry_points").getString(userJid.getRawString(), (String) null);
        if (string != null) {
            try {
                obj = r4.A01.A00(string);
            } catch (C47342Io e2) {
                r4.A01(e2, "getObject");
                r4.A00(userJid);
            }
        }
        return (AnonymousClass21V) obj;
    }
}
