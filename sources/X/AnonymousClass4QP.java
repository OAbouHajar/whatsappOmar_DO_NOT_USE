package X;

import android.app.Application;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.4QP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4QP {
    public final /* synthetic */ IndiaUpiMapperLinkViewModel A00;

    public /* synthetic */ AnonymousClass4QP(IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel) {
        this.A00 = indiaUpiMapperLinkViewModel;
    }

    public final void A00(C53872gR r8, AnonymousClass2HJ r9) {
        Object obj;
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = this.A00;
        if (r9 != null) {
            int i2 = r9.A00;
            if (i2 == 21176) {
                indiaUpiMapperLinkViewModel.A05.A09(C77673wH.A00);
                return;
            }
            C30801cy r4 = indiaUpiMapperLinkViewModel.A05;
            Application application = indiaUpiMapperLinkViewModel.A02;
            if (i2 == 21138) {
                r4.A09(new C77663wG(i2, application.getString(R.string.str0cb4), application.getString(R.string.str0cb3)));
            } else {
                r4.A09(new C77663wG(i2, "", application.getString(R.string.str117b)));
            }
        } else {
            C227719f r42 = indiaUpiMapperLinkViewModel.A04;
            C18450wi.A0C(r8);
            synchronized (r42) {
                Set set = r42.A01;
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C18450wi.A0R(((C53872gR) obj).A01, r8.A01)) {
                        break;
                    }
                }
                if (((C53872gR) obj) != null) {
                    r42.A01(r8);
                } else if (set.size() < 3 && !set.contains(r8)) {
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (C18450wi.A0R(((C53872gR) it2.next()).A03, "mobile_number")) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C25421Js.A07(set.size() + 1));
                    linkedHashSet.addAll(set);
                    linkedHashSet.add(r8);
                    if (r42.A02(linkedHashSet)) {
                        set.add(r8);
                    }
                }
            }
            String str = r8.A02;
            if (str != null && str.equalsIgnoreCase("active_pending")) {
                indiaUpiMapperLinkViewModel.A05.A09(C77693wJ.A00);
            } else if (str != null && str.equalsIgnoreCase("active")) {
                indiaUpiMapperLinkViewModel.A05.A09(C77683wI.A00);
            }
        }
    }
}
