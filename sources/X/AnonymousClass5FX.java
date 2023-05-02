package X;

import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5FX  reason: invalid class name */
public final class AnonymousClass5FX extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ CatalogCategoryTabsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FX(CatalogCategoryTabsViewModel catalogCategoryTabsViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogCategoryTabsViewModel;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        ArrayList arrayList;
        C82574Di r9 = (C82574Di) obj;
        C18450wi.A0H(r9, 0);
        if (r9 instanceof C73063nF) {
            List<AnonymousClass4N4> list = ((C73063nF) r9).A01;
            AnonymousClass028 r6 = (AnonymousClass028) this.this$0.A05.getValue();
            CatalogCategoryTabsViewModel catalogCategoryTabsViewModel = this.this$0;
            UserJid userJid = this.$bizJid;
            if (catalogCategoryTabsViewModel.A02.A00.A0C(2273)) {
                arrayList = C13690nt.A0i(AnonymousClass1J9.A0M(list, 10));
                for (AnonymousClass4N4 r0 : list) {
                    String str = r0.A02;
                    C18450wi.A0A(str);
                    String str2 = r0.A01;
                    C18450wi.A0A(str2);
                    arrayList.add(new AnonymousClass4WJ(userJid, str, str2, r0.A04));
                }
            } else {
                ArrayList A0u = AnonymousClass000.A0u();
                for (Object next : list) {
                    if (!((AnonymousClass4N4) next).A04) {
                        A0u.add(next);
                    }
                }
                arrayList = C13690nt.A0i(AnonymousClass1J9.A0M(A0u, 10));
                Iterator it = A0u.iterator();
                while (it.hasNext()) {
                    AnonymousClass4N4 r02 = (AnonymousClass4N4) it.next();
                    String str3 = r02.A02;
                    C18450wi.A0A(str3);
                    String str4 = r02.A01;
                    C18450wi.A0A(str4);
                    arrayList.add(new AnonymousClass4WJ(userJid, str3, str4, r02.A04));
                }
            }
            r6.A09(arrayList);
        }
        return AnonymousClass22M.A00;
    }
}
