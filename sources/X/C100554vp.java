package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4vp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100554vp implements C108545Ok {
    public final /* synthetic */ AnonymousClass1PR A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C100554vp(AnonymousClass1PR r1, UserJid userJid, Integer num, Integer num2, Integer num3, String str) {
        this.A00 = r1;
        this.A01 = userJid;
        this.A02 = num;
        this.A03 = num2;
        this.A04 = num3;
        this.A05 = str;
    }

    public final void AR0(UserJid userJid) {
        AnonymousClass1PR r1 = this.A00;
        UserJid userJid2 = this.A01;
        Integer num = this.A02;
        Integer num2 = this.A03;
        Integer num3 = this.A04;
        String str = this.A05;
        C17170ue r2 = r1.A00;
        r2.A07.Acl(new AnonymousClass56E(r2, userJid2, num, num2, num3 != null ? Long.valueOf((long) (num3.intValue() + 1)) : null, str));
    }
}
