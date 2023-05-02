package X;

import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.5E2  reason: invalid class name */
public final class AnonymousClass5E2 extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5E2(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        CatalogSearchFragment catalogSearchFragment = this.this$0;
        C49992Xb r2 = (C49992Xb) catalogSearchFragment.A0X.getValue();
        AnonymousClass1PR r1 = this.this$0.A0J;
        if (r1 != null) {
            return new C006602z((AnonymousClass04o) new C95234mJ(r1, r2), (C001500q) catalogSearchFragment).A01(C49982Xa.class);
        }
        throw C18450wi.A03("productSearchLogger");
    }
}
