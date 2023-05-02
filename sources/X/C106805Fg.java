package X;

import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Fg  reason: invalid class name and case insensitive filesystem */
public final class C106805Fg extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ AnonymousClass41H $displayContext;
    public final /* synthetic */ CatalogAllCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106805Fg(AnonymousClass41H r2, CatalogAllCategoryViewModel catalogAllCategoryViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogAllCategoryViewModel;
        this.$bizJid = userJid;
        this.$displayContext = r2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Object obj2;
        C82574Di r8 = (C82574Di) obj;
        C18450wi.A0H(r8, 0);
        if (r8 instanceof C73063nF) {
            List<AnonymousClass4N4> list = ((C73063nF) r8).A01;
            C13680ns.A1P((AnonymousClass028) this.this$0.A08.getValue(), 1);
            UserJid userJid = this.$bizJid;
            AnonymousClass41H r4 = this.$displayContext;
            ArrayList A0N = AnonymousClass1J9.A0N(list);
            for (AnonymousClass4N4 r1 : list) {
                switch (r4.ordinal()) {
                    case 0:
                        obj2 = new C73143nN(r1, userJid);
                        break;
                    case 1:
                        obj2 = new C73133nM(r1, userJid);
                        break;
                    default:
                        throw new AnonymousClass2Xe();
                }
                A0N.add(obj2);
            }
            if (this.$displayContext.ordinal() == 1) {
                A0N = C13680ns.A0n(A0N);
                A0N.add(0, new C73103nJ());
            }
            ((AnonymousClass028) this.this$0.A07.getValue()).A09(A0N);
        } else {
            C13680ns.A1P((AnonymousClass028) this.this$0.A08.getValue(), 2);
        }
        return AnonymousClass22M.A00;
    }
}
