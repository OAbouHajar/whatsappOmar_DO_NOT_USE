package X;

import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5FW  reason: invalid class name */
public final class AnonymousClass5FW extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ CatalogCategoryGroupsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FW(CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogCategoryGroupsViewModel;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C82574Di r8 = (C82574Di) obj;
        C18450wi.A0H(r8, 0);
        if (r8 instanceof C73063nF) {
            List<AnonymousClass4N4> list = ((C73063nF) r8).A01;
            UserJid userJid = this.$bizJid;
            ArrayList A0N = AnonymousClass1J9.A0N(list);
            for (AnonymousClass4N4 r1 : list) {
                A0N.add(r1.A04 ? new C73113nK(r1, userJid) : new C73123nL(r1, userJid));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (AnonymousClass4N4 r12 : list) {
                if (!r12.A04) {
                    String str = r12.A01;
                    C18450wi.A0A(str);
                    ArrayList A0u = AnonymousClass000.A0u();
                    int i2 = 0;
                    do {
                        i2++;
                        A0u.add(new C73083nH());
                    } while (i2 < 3);
                    linkedHashMap.put(str, A0u);
                }
            }
            ((AnonymousClass028) this.this$0.A08.getValue()).A09(new C73243nZ(A0N, linkedHashMap));
        }
        return AnonymousClass22M.A00;
    }
}
