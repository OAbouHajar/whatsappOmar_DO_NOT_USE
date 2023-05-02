package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.56E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56E implements Runnable {
    public final /* synthetic */ C17170ue A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ AnonymousClass56E(C17170ue r1, UserJid userJid, Integer num, Integer num2, Long l2, String str) {
        this.A00 = r1;
        this.A01 = userJid;
        this.A05 = str;
        this.A02 = num;
        this.A03 = num2;
        this.A04 = l2;
    }

    public final void run() {
        C17170ue r7 = this.A00;
        UserJid userJid = this.A01;
        String str = this.A05;
        Integer num = this.A02;
        Integer num2 = this.A03;
        Long l2 = this.A04;
        C75563sM r2 = new C75563sM();
        r2.A04 = r7.A05.A00(userJid);
        r2.A05 = r7.A00;
        r2.A06 = str;
        r2.A03 = Long.valueOf((long) r7.A09.getAndIncrement());
        r2.A01 = num;
        r2.A00 = num2;
        r2.A02 = l2;
        r7.A04.A06(r2);
    }
}
