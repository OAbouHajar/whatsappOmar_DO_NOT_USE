package X;

import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5E0  reason: invalid class name */
public final class AnonymousClass5E0 extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5E0(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String str;
        CatalogSearchFragment catalogSearchFragment = this.this$0;
        UserJid userJid = catalogSearchFragment.A0P;
        if (userJid == null) {
            str = "bizJid";
        } else {
            AnonymousClass2SO r1 = catalogSearchFragment.A0D;
            if (r1 != null) {
                return new C006602z((AnonymousClass04o) new C62343De(r1, userJid), (C001500q) catalogSearchFragment).A01(AnonymousClass2XA.class);
            }
            str = "cartMenuViewModelFactory";
        }
        throw C18450wi.A03(str);
    }
}
