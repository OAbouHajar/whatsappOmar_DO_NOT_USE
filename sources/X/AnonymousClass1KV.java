package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1KV  reason: invalid class name */
public class AnonymousClass1KV {
    public final C17150uc A00;
    public final C17170ue A01;
    public final C14710pd A02;
    public final C16320sq A03;

    public AnonymousClass1KV(C17150uc r1, C17170ue r2, C14710pd r3, C16320sq r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void A00(UserJid userJid, Boolean bool, Integer num, Integer num2, String str, String str2, int i2, int i3) {
        if (this.A02.A0E(C16620tM.A02, 1514)) {
            this.A03.Acl(new AnonymousClass56T(this, userJid, bool, num, num2, str, str2, i2, i3));
        }
    }

    public void A01(UserJid userJid, String str, int i2, int i3, int i4, boolean z2) {
        UserJid userJid2 = userJid;
        A00(userJid2, Boolean.valueOf(z2), Integer.valueOf(i4), Integer.valueOf(i2), str, (String) null, i3, 1);
    }
}
