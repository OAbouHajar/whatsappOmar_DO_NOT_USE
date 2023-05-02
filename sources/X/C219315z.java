package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.15z  reason: invalid class name and case insensitive filesystem */
public class C219315z {
    public final AnonymousClass12A A00;
    public final C219215y A01;
    public final C219115x A02;
    public final C17770vc A03;

    public C219315z(AnonymousClass12A r1, C219215y r2, C219115x r3, C17770vc r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(C450927a r4) {
        UserJid userJid = r4.A0C;
        if (userJid != null) {
            boolean equals = "image".equals(r4.A0E);
            C17770vc r0 = this.A03;
            AnonymousClass00B.A06(userJid);
            (equals ? r0.A01 : r0.A02).A01(userJid);
        }
    }
}
