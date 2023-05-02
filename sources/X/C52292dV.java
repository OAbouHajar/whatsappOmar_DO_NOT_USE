package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2dV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52292dV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C16010sH A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C208911z A04;

    public /* synthetic */ C52292dV(C16010sH r1, UserJid userJid, C208911z r3, int i2, long j2) {
        this.A04 = r3;
        this.A03 = userJid;
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = r1;
    }

    public final void run() {
        C208911z r0 = this.A04;
        UserJid userJid = this.A03;
        int i2 = this.A00;
        long j2 = this.A01;
        C16010sH r1 = this.A02;
        r0.A02.A0S(userJid, i2, j2);
        r1.A00 = i2;
        r1.A07 = j2;
    }
}
