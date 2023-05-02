package X;

import com.obwhatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.obwhatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;

/* renamed from: X.5Dv  reason: invalid class name and case insensitive filesystem */
public final class C106435Dv extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogAllCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106435Dv(CatalogAllCategoryFragment catalogAllCategoryFragment) {
        super(0);
        this.this$0 = catalogAllCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        CatalogAllCategoryFragment catalogAllCategoryFragment = this.this$0;
        AnonymousClass4CY r0 = catalogAllCategoryFragment.A02;
        if (r0 != null) {
            return new CategoryThumbnailLoader(catalogAllCategoryFragment, r0.A00.A01.A1s);
        }
        throw C18450wi.A03("thumbnailLoaderFactory");
    }
}
