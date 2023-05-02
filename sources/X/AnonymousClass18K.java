package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.18K  reason: invalid class name */
public class AnonymousClass18K {
    public final C17030uP A00;
    public final C19780yz A01;
    public final C14710pd A02;
    public final C20260zl A03;
    public final C16490t9 A04;
    public final AnonymousClass135 A05;
    public final AnonymousClass1WA A06;

    public AnonymousClass18K(C17030uP r3, C19780yz r4, C14710pd r5, C20260zl r6, C16490t9 r7, AnonymousClass135 r8, C16320sq r9) {
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r4;
        this.A05 = r8;
        this.A00 = r3;
        this.A06 = new AnonymousClass1WA(r9, false);
    }

    public final Integer A00(C15830rv r6) {
        int i2;
        C14710pd r4 = this.A02;
        C17030uP r3 = this.A00;
        UserJid of = UserJid.of(r6);
        C20260zl r1 = this.A03;
        if (C41861wm.A01(r3, r4, r1, of)) {
            i2 = 2;
        } else if (!C41871wn.A00(r3, r4, r1, of, this.A05)) {
            return null;
        } else {
            i2 = 1;
        }
        return Integer.valueOf(i2);
    }

    public void A01(int i2) {
        C41881wo r1 = new C41881wo();
        r1.A00 = Integer.valueOf(i2);
        this.A04.A06(r1);
    }
}
