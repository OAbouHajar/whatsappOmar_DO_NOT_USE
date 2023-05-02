package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2KE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2KE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass13W A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ C40111ta A06;
    public final /* synthetic */ C40111ta A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public /* synthetic */ AnonymousClass2KE(AnonymousClass13W r1, UserJid userJid, C40111ta r3, C40111ta r4, String str, String str2, int i2, int i3, int i4, int i5) {
        this.A04 = r1;
        this.A05 = userJid;
        this.A00 = i2;
        this.A01 = i3;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = r3;
        this.A07 = r4;
        this.A02 = i4;
        this.A03 = i5;
    }

    public final void run() {
        AnonymousClass13W r3 = this.A04;
        UserJid userJid = this.A05;
        int i2 = this.A00;
        int i3 = this.A01;
        String str = this.A08;
        String str2 = this.A09;
        C40111ta r5 = this.A06;
        C40111ta r6 = this.A07;
        int i4 = this.A02;
        int i5 = this.A03;
        C16000sG r0 = r3.A02;
        r0.A0A(userJid);
        r0.A0J();
        r3.A04.A0R(userJid, new C28341Vr(r5, r6, str, str2, i2, i3, i4, i5).A01());
    }
}
