package X;

import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ay  reason: invalid class name and case insensitive filesystem */
public class C23221Ay {
    public final C16000sG A00;
    public final C15810rt A01;
    public final AnonymousClass15X A02;
    public final C14710pd A03;
    public final C23211Ax A04;
    public final AnonymousClass15V A05;
    public final List A06 = new ArrayList();
    public final Map A07 = new HashMap();

    public C23221Ay(C16000sG r2, C15810rt r3, AnonymousClass15X r4, C14710pd r5, C23211Ax r6, AnonymousClass15V r7) {
        this.A03 = r5;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
    }

    public synchronized C40921uu A00(C35031lG r3) {
        Map map;
        map = this.A07;
        if (map.isEmpty()) {
            A02();
        }
        return (C40921uu) map.get(Integer.valueOf(r3.A01));
    }

    public synchronized List A01() {
        List list;
        list = this.A06;
        if (list.isEmpty()) {
            A02();
        }
        return list;
    }

    public final void A02() {
        List list = this.A06;
        list.clear();
        list.add(new C35031lG(0, R.id.search_contact_filter, R.string.str08e7, R.drawable.smart_filter_contacts));
        list.add(new C35031lG(1, R.id.search_non_contact_filter, R.string.str08f0, R.drawable.smart_filter_non_contacts));
        C14710pd r6 = this.A03;
        if (!r6.A0E(C16620tM.A02, 1608)) {
            list.add(new C35031lG(2, R.id.search_unread_filter, R.string.str08f3, R.drawable.smart_filter_unread));
        }
        Map map = this.A07;
        map.clear();
        C16000sG r2 = this.A00;
        map.put(0, new C52532dx(r2));
        map.put(1, new C52542dy(r2));
        C15810rt r22 = this.A01;
        map.put(2, new C52552dz(r22, this.A02, r6));
        map.put(3, new C52572e1(r22));
    }
}
