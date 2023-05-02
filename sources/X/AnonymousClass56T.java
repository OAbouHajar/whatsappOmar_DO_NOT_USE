package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.56T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56T implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass1KV A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public /* synthetic */ AnonymousClass56T(AnonymousClass1KV r1, UserJid userJid, Boolean bool, Integer num, Integer num2, String str, String str2, int i2, int i3) {
        this.A02 = r1;
        this.A03 = userJid;
        this.A07 = str;
        this.A00 = i2;
        this.A05 = num;
        this.A06 = num2;
        this.A04 = bool;
        this.A08 = str2;
        this.A01 = i3;
    }

    public final void run() {
        AnonymousClass1KV r6 = this.A02;
        UserJid userJid = this.A03;
        String str = this.A07;
        int i2 = this.A00;
        Integer num = this.A05;
        Integer num2 = this.A06;
        Boolean bool = this.A04;
        String str2 = this.A08;
        int i3 = this.A01;
        C35611mD A002 = r6.A00.A0A.A00(userJid);
        if (A002 != null) {
            if (A002.A0K) {
                str = null;
            }
            int intValue = num2.intValue();
            C17170ue r62 = r6.A01;
            Integer valueOf = Integer.valueOf(i2);
            Long valueOf2 = num != null ? Long.valueOf((long) num.intValue()) : null;
            r62.A07.Acl(new AnonymousClass56U(r62, userJid, bool, valueOf, Integer.valueOf(i3), valueOf2, Long.valueOf((long) intValue), str, str2));
        }
    }
}
