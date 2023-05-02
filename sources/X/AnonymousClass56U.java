package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.56U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56U implements Runnable {
    public final /* synthetic */ C17170ue A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public /* synthetic */ AnonymousClass56U(C17170ue r1, UserJid userJid, Boolean bool, Integer num, Integer num2, Long l2, Long l3, String str, String str2) {
        this.A00 = r1;
        this.A07 = str;
        this.A01 = userJid;
        this.A03 = num;
        this.A05 = l2;
        this.A06 = l3;
        this.A02 = bool;
        this.A08 = str2;
        this.A04 = num2;
    }

    public final void run() {
        C17170ue r7 = this.A00;
        String str = this.A07;
        UserJid userJid = this.A01;
        Integer num = this.A03;
        Long l2 = this.A05;
        Long l3 = this.A06;
        Boolean bool = this.A02;
        String str2 = this.A08;
        Integer num2 = this.A04;
        C75763sg r2 = new C75763sg();
        r2.A06 = str;
        r2.A07 = r7.A05.A00(userJid);
        r2.A08 = r7.A00;
        r2.A01 = num;
        r2.A03 = l2;
        r2.A04 = l3;
        r2.A00 = bool;
        r2.A09 = str2;
        r2.A05 = Long.valueOf((long) r7.A09.getAndIncrement());
        r2.A02 = num2;
        r7.A04.A06(r2);
    }
}
