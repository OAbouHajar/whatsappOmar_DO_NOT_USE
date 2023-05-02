package X;

import com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.1HS  reason: invalid class name */
public class AnonymousClass1HS {
    public final C19000xb A00;
    public final C16440t3 A01;
    public final C16460t6 A02;
    public final C18300wT A03;
    public final C18310wU A04;
    public final C18090w8 A05;
    public final C18290wS A06;
    public final AnonymousClass122 A07;

    public AnonymousClass1HS(C19000xb r1, C16440t3 r2, C16460t6 r3, C18300wT r4, C18310wU r5, C18090w8 r6, C18290wS r7, AnonymousClass122 r8) {
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r8;
        this.A04 = r5;
        this.A05 = r6;
    }

    public final void A00(UserJid userJid, int i2, boolean z2) {
        this.A00.A00(new SendPaymentInviteSetupJob(userJid, i2, z2));
        C18300wT r4 = this.A03;
        Map A072 = r4.A07(r4.A01().getString("payments_inviter_jids_with_expiry", ""));
        A072.remove(userJid);
        r4.A01().edit().putString("payments_inviter_jids_with_expiry", C18300wT.A00(A072)).apply();
    }
}
