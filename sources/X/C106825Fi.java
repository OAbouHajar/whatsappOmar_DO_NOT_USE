package X;

import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Fi  reason: invalid class name and case insensitive filesystem */
public final class C106825Fi extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ List $catalogCategoryGroups;
    public final /* synthetic */ Map $categoryParentToChildItemMap;
    public final /* synthetic */ CatalogCategoryGroupsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106825Fi(CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid, List list, Map map) {
        super(1);
        this.this$0 = catalogCategoryGroupsViewModel;
        this.$catalogCategoryGroups = list;
        this.$categoryParentToChildItemMap = map;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C82574Di r9 = (C82574Di) obj;
        C18450wi.A0H(r9, 0);
        if (r9 instanceof C73073nG) {
            this.this$0.A03.A09(Boolean.FALSE);
            Map map = ((C73073nG) r9).A01;
            Map map2 = this.$categoryParentToChildItemMap;
            UserJid userJid = this.$bizJid;
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                Iterable<AnonymousClass4N4> iterable = (Iterable) A0z.getValue();
                Object key = A0z.getKey();
                ArrayList A0N = AnonymousClass1J9.A0N(iterable);
                for (AnonymousClass4N4 r1 : iterable) {
                    A0N.add(new C73113nK(r1, userJid));
                }
                map2.put(key, A0N);
            }
            ((AnonymousClass028) this.this$0.A08.getValue()).A09(new C73233nY(this.$catalogCategoryGroups, this.$categoryParentToChildItemMap));
        } else if (r9 instanceof C73043nD) {
            this.this$0.A03.A09(Boolean.TRUE);
        }
        return AnonymousClass22M.A00;
    }
}
