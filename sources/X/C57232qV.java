package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2qV  reason: invalid class name and case insensitive filesystem */
public class C57232qV extends AnonymousClass02H {
    public List A00;
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final C016407u A02;
    public final Set A03;

    public C57232qV(Application application, C016407u r4, List list, List list2) {
        super(application);
        HashSet A0o = C13680ns.A0o();
        this.A03 = A0o;
        this.A02 = r4;
        this.A00 = list;
        if (list2 != null) {
            A0o.addAll(list2);
        }
        Map map = r4.A03;
        List list3 = (List) map.get("saved_all_categories");
        if (list3 != null) {
            this.A00 = list3;
        }
        Collection collection = (Collection) map.get("saved_selected_categories");
        if (collection != null) {
            Set set = this.A03;
            set.clear();
            set.addAll(collection);
        }
        A05();
    }

    public final void A05() {
        AnonymousClass027 r8 = this.A01;
        List list = this.A00;
        Set set = this.A03;
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C31241dn r2 = (C31241dn) list.get(i2);
            A0u.add(set.contains(r2) ? new AnonymousClass4TQ(r2, true) : new AnonymousClass4TQ(r2, false));
        }
        r8.A09(A0u);
    }
}
