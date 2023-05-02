package X;

import android.app.Application;
import com.obwhatsapp.businessproductlist.view.fragment.CollectionProductListFragment;

/* renamed from: X.3Ij  reason: invalid class name */
public final class AnonymousClass3Ij extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CollectionProductListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Ij(CollectionProductListFragment collectionProductListFragment) {
        super(0);
        this.this$0 = collectionProductListFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String str;
        CollectionProductListFragment collectionProductListFragment = this.this$0;
        Application application = collectionProductListFragment.A0D().getApplication();
        CollectionProductListFragment collectionProductListFragment2 = this.this$0;
        AnonymousClass1KA r2 = collectionProductListFragment2.A03;
        if (r2 != null) {
            AnonymousClass1KV r1 = collectionProductListFragment2.A02;
            if (r1 != null) {
                return new C006602z((AnonymousClass04o) new C95254mL(application, r1, r2), (C001500q) collectionProductListFragment).A01(AnonymousClass3PW.class);
            }
            str = "categoriesLogger";
        } else {
            str = "catalogManager";
        }
        throw C18450wi.A03(str);
    }
}
