package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5De  reason: invalid class name and case insensitive filesystem */
public final class C106265De extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ AnonymousClass2SL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106265De(AnonymousClass2SL r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        AnonymousClass2SL r3 = this.this$0;
        UserJid A35 = r3.A35();
        AnonymousClass2SO r1 = this.this$0.A00;
        if (r1 != null) {
            return new C006602z((AnonymousClass04o) new C62343De(r1, A35), (C001500q) r3).A01(AnonymousClass2XA.class);
        }
        throw C18450wi.A03("cartMenuViewModelFactory");
    }
}
