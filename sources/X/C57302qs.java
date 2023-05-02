package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qs  reason: invalid class name and case insensitive filesystem */
public class C57302qs extends C003401n implements C109565Sq {
    public final AnonymousClass027 A00 = C13690nt.A0O();
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final AnonymousClass027 A02 = C13690nt.A0O();
    public final Map A03 = new LinkedHashMap();

    public boolean A05(int i2) {
        Number number = (Number) this.A02.A01();
        return number != null && number.intValue() == i2;
    }

    public void AUI(C37771pi r4) {
        Map map = this.A03;
        String str = r4.A0F;
        AnonymousClass028 r1 = (AnonymousClass028) map.get(str);
        if (r1 != null && r1.A01() != null) {
            r1.A0B(new AnonymousClass4IH(r4, str));
        }
    }

    public void AUJ(List list) {
        Map map = this.A03;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C37771pi r0 = (C37771pi) it.next();
            String str = r0.A0F;
            map.put(str, new AnonymousClass027(new AnonymousClass4IH(r0, str)));
        }
        C13680ns.A1O(this.A02, 2);
    }

    public void AUK() {
        C13680ns.A1O(this.A02, 3);
    }

    public void AUL(String str) {
        AnonymousClass028 r2 = (AnonymousClass028) this.A03.get(str);
        if (r2 != null && r2.A01() != null) {
            r2.A0B(new AnonymousClass4IH((C37771pi) null, str));
        }
    }
}
