package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.66t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1217666t implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C35361lo A02;
    public final /* synthetic */ C15830rv A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ AnonymousClass5xV A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public /* synthetic */ C1217666t(C28401Vy r1, C35361lo r2, C15830rv r3, UserJid userJid, AnonymousClass5xV r5, String str, List list, long j2) {
        this.A05 = r5;
        this.A06 = str;
        this.A07 = list;
        this.A03 = r3;
        this.A04 = userJid;
        this.A00 = j2;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void run() {
        AnonymousClass5xV r5 = this.A05;
        String str = this.A06;
        List list = this.A07;
        C15830rv r6 = this.A03;
        UserJid userJid = this.A04;
        long j2 = this.A00;
        C28401Vy r4 = this.A01;
        C35361lo r3 = this.A02;
        C18310wU r2 = r5.A04;
        C30581cc A032 = r5.A03(r6, userJid, str, list, j2);
        if (!C16030sJ.A0L(r6)) {
            userJid = UserJid.of(r6);
        }
        r2.A07(r4, r3, userJid, A032);
    }
}
