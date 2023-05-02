package X;

import com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5DU  reason: invalid class name */
public final class AnonymousClass5DU extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5DU(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(0);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String str;
        UserJid A1D = this.this$0.A1D();
        BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
        C16320sq r3 = businessProductListBaseFragment.A0G;
        if (r3 != null) {
            C24511Gf r2 = businessProductListBaseFragment.A04;
            if (r2 != null) {
                C17170ue r1 = businessProductListBaseFragment.A07;
                if (r1 != null) {
                    return new C49992Xb(r2, r1, A1D, r3);
                }
                str = "catalogAnalyticManager";
            } else {
                str = "cartItemStore";
            }
        } else {
            str = "waWorkers";
        }
        throw C18450wi.A03(str);
    }
}
