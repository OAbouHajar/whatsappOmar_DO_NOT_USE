package X;

import com.obwhatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.obwhatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;

/* renamed from: X.5Dx  reason: invalid class name and case insensitive filesystem */
public final class C106455Dx extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106455Dx(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        super(0);
        this.this$0 = catalogCategoryExpandableGroupsListFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.this$0;
        AnonymousClass4CY r0 = catalogCategoryExpandableGroupsListFragment.A03;
        if (r0 != null) {
            return new CategoryThumbnailLoader(catalogCategoryExpandableGroupsListFragment, r0.A00.A01.A1s);
        }
        throw C18450wi.A03("thumbnailLoaderFactory");
    }
}
