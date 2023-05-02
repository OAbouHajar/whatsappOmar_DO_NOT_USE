package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.66q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1217366q implements Runnable {
    public final /* synthetic */ AnonymousClass2H9 A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C110715ei A02;
    public final /* synthetic */ AnonymousClass5yZ A03;
    public final /* synthetic */ C797441c A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C1217366q(AnonymousClass2H9 r1, UserJid userJid, C110715ei r3, AnonymousClass5yZ r4, C797441c r5, boolean z2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = userJid;
        this.A05 = z2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void run() {
        C110715ei r4 = this.A02;
        AnonymousClass2H9 r3 = this.A00;
        UserJid userJid = this.A01;
        boolean z2 = this.A05;
        AnonymousClass5yZ r6 = this.A03;
        C797441c r7 = this.A04;
        C28381Vw r1 = r4.A0C;
        if (r1 != null) {
            C16830ti r8 = (C16830ti) r4.A0A.A01.A0K.A03(r1);
            if (r8 != null) {
                r8.A0L = r3 == null ? null : r3.A00;
            }
            r4.A03.A09(r4.A0B.A00(userJid, r6, r7, r8, Boolean.valueOf(z2)));
        }
    }
}
