package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.56Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56Q implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C17170ue A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ AnonymousClass56Q(C17170ue r1, UserJid userJid, Long l2, String str, String str2, String str3, int i2, int i3) {
        this.A02 = r1;
        this.A04 = l2;
        this.A00 = i2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = userJid;
        this.A01 = i3;
    }

    public final void run() {
        C17170ue r6 = this.A02;
        Long l2 = this.A04;
        int i2 = this.A00;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A07;
        UserJid userJid = this.A03;
        int i3 = this.A01;
        AnonymousClass2RJ r1 = new AnonymousClass2RJ();
        r1.A08 = l2;
        r1.A05 = Integer.valueOf(i2);
        r1.A0A = str;
        r1.A0B = str2;
        r1.A0F = str3;
        r1.A09 = r6.A05.A00(userJid);
        r1.A04 = i3 != 0 ? Integer.valueOf(i3) : null;
        r1.A01 = Boolean.FALSE;
        r1.A03 = Integer.valueOf(AnonymousClass2RK.A00(r6.A02.A00(userJid)));
        r6.A04.A06(r1);
    }
}
