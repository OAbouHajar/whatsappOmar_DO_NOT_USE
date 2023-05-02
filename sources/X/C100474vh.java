package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4vh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100474vh implements C108525Oi {
    public final /* synthetic */ C35691mL A00;
    public final /* synthetic */ C108525Oi A01;
    public final /* synthetic */ C50262Yq A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ Integer A04;

    public /* synthetic */ C100474vh(C35691mL r1, C108525Oi r2, C50262Yq r3, UserJid userJid, Integer num) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = userJid;
        this.A04 = num;
        this.A01 = r2;
    }

    public final void ASp(C62723Er r5) {
        C50262Yq r1 = this.A02;
        UserJid userJid = this.A03;
        Integer num = this.A04;
        C108525Oi r2 = this.A01;
        if (!(userJid == null || num == null)) {
            r1.A02.A00(userJid, num.intValue());
        }
        if (r2 != null) {
            r2.ASp(r5);
        }
    }
}
