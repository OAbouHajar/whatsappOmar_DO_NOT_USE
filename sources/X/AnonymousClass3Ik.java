package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ik  reason: invalid class name */
public final class AnonymousClass3Ik extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass2SL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Ik(AnonymousClass2SL r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String str;
        AnonymousClass2SL r6 = this.this$0;
        UserJid A35 = r6.A35();
        UserJid A352 = this.this$0.A35();
        AnonymousClass2SL r0 = this.this$0;
        C16320sq r3 = r0.A05;
        C24511Gf r2 = r0.A01;
        if (r2 != null) {
            C17170ue r02 = r0.A02;
            if (r02 != null) {
                return new C006602z((AnonymousClass04o) new C95224mI(new C49992Xb(r2, r02, A352, r3), A35), (C001500q) r6).A01(C64443Ps.class);
            }
            str = "catalogAnalyticManager";
        } else {
            str = "cartItemStore";
        }
        throw C18450wi.A03(str);
    }
}
