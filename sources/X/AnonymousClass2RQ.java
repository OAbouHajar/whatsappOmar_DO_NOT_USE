package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2RQ  reason: invalid class name */
public class AnonymousClass2RQ {
    public final C17150uc A00;
    public final C14710pd A01;

    public AnonymousClass2RQ(C17150uc r1, C14710pd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A00(UserJid userJid) {
        C17150uc r4 = this.A00;
        boolean A09 = r4.A09();
        boolean A0E = this.A01.A0E(C16620tM.A02, 1867);
        C35611mD A002 = r4.A0A.A00(userJid);
        return A0E && A09 && A002 != null && A002.A0K;
    }
}
