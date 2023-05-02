package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.23C  reason: invalid class name */
public class AnonymousClass23C extends C16690tT {
    public AnonymousClass23B A00;
    public UserJid A01;
    public final /* synthetic */ C17150uc A02;

    public AnonymousClass23C(AnonymousClass23B r1, C17150uc r2, UserJid userJid) {
        this.A02 = r2;
        this.A01 = userJid;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A02.A0A.A00(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C35611mD r4 = (C35611mD) obj;
        AnonymousClass23B r0 = this.A00;
        if (r0 != null) {
            r0.ANn(r4);
        }
        if (r4 != null) {
            C17150uc r2 = this.A02;
            if ((r2.A04.A00() & 512) > 0 && r4.A0M) {
                r2.A04((AnonymousClass236) null, this.A01);
            }
        }
    }
}
