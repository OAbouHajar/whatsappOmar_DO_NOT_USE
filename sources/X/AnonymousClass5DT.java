package X;

import com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5DT  reason: invalid class name */
public final class AnonymousClass5DT extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5DT(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(0);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
        UserJid A1D = businessProductListBaseFragment.A1D();
        AnonymousClass2SO r1 = this.this$0.A01;
        if (r1 != null) {
            return new C006602z((AnonymousClass04o) new C62343De(r1, A1D), (C001500q) businessProductListBaseFragment).A01(AnonymousClass2XA.class);
        }
        throw C18450wi.A03("cartMenuViewModelFactory");
    }
}
