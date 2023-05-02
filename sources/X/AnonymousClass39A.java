package X;

import com.facebook.redex.IDxCHandlerShape102S0200000_2_I1;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.39A  reason: invalid class name */
public final class AnonymousClass39A {
    public final C17170ue A00;
    public final AnonymousClass1KA A01;
    public final AnonymousClass4D3 A02;
    public final AnonymousClass1KU A03;

    public AnonymousClass39A(C17170ue r2, AnonymousClass1KA r3, AnonymousClass4D3 r4, AnonymousClass1KU r5) {
        C18450wi.A0J(r3, r5);
        C18450wi.A0H(r2, 4);
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void A00(UserJid userJid, String str, AnonymousClass22J r5) {
        C18450wi.A0H(str, 0);
        Set singleton = Collections.singleton(str);
        C18450wi.A0B(singleton);
        A01(userJid, singleton, new AnonymousClass5FV(str, r5));
    }

    public void A01(UserJid userJid, Set set, AnonymousClass22J r13) {
        UserJid userJid2;
        Iterator it = set.iterator();
        do {
            userJid2 = userJid;
            if (it.hasNext()) {
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String A0m = AnonymousClass000.A0m(it2);
                    linkedHashMap.put(A0m, this.A03.A01(userJid, A0m));
                }
                r13.AIU(new C73073nG(linkedHashMap, true));
                return;
            }
        } while (this.A03.A03(userJid, AnonymousClass000.A0m(it)));
        Set set2 = set;
        if (set.contains("catalog_category_dummy_root_id")) {
            set2 = C23851Dp.A00;
        }
        C100324vS r2 = new C100324vS(this, userJid, set, r13);
        int i2 = this.A02.A00;
        C86124Rh r4 = new C86124Rh(userJid2, this.A00.A00, set2, i2, i2);
        this.A01.A02(new IDxCHandlerShape102S0200000_2_I1(r2, 1, this), r4);
    }
}
