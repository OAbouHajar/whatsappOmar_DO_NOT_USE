package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3kB  reason: invalid class name and case insensitive filesystem */
public class C71323kB extends C439822h {
    public final /* synthetic */ AnonymousClass37H A00;
    public final /* synthetic */ UserJid A01;

    public C71323kB(AnonymousClass37H r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public void A00(UserJid userJid) {
        if (this.A01.equals(userJid)) {
            this.A00.A06.countDown();
        }
    }
}
