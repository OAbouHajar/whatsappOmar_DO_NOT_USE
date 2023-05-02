package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.66r  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1217466r implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C15830rv A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ AnonymousClass5xV A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public /* synthetic */ C1217466r(C28401Vy r1, C15830rv r2, UserJid userJid, AnonymousClass5xV r4, String str, List list, long j2) {
        this.A04 = r4;
        this.A05 = str;
        this.A06 = list;
        this.A02 = r2;
        this.A03 = userJid;
        this.A00 = j2;
        this.A01 = r1;
    }

    public final void run() {
        AnonymousClass5xV r4 = this.A04;
        String str = this.A05;
        List list = this.A06;
        C15830rv r5 = this.A02;
        UserJid userJid = this.A03;
        long j2 = this.A00;
        C28401Vy r3 = this.A01;
        C18310wU r2 = r4.A04;
        C30581cc A032 = r4.A03(r5, userJid, str, list, j2);
        if (!C16030sJ.A0L(r5)) {
            userJid = UserJid.of(r5);
        }
        r2.A07(r3, (C35361lo) null, userJid, A032);
    }
}
