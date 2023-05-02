package com.obwhatsapp.biz.order.viewmodel;

import X.AnonymousClass013;
import X.AnonymousClass02H;
import X.C16040sK;
import X.C35671mJ;
import X.C39651sq;
import android.app.Application;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class OrderInfoViewModel extends AnonymousClass02H {
    public final C16040sK A00;
    public final AnonymousClass013 A01;

    public OrderInfoViewModel(Application application, C16040sK r2, AnonymousClass013 r3) {
        super(application);
        this.A01 = r3;
        this.A00 = r2;
    }

    public String A05(List list) {
        C39651sq r1;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Iterator it = list.iterator();
        C39651sq r4 = null;
        while (true) {
            if (it.hasNext()) {
                C35671mJ r3 = (C35671mJ) it.next();
                BigDecimal bigDecimal2 = r3.A03;
                if (bigDecimal2 == null || (r1 = r3.A02) == null || (r4 != null && !r1.equals(r4))) {
                    break;
                }
                r4 = r1;
                bigDecimal = bigDecimal.add(bigDecimal2.multiply(new BigDecimal(r3.A00)));
            } else if (r4 != null && !bigDecimal.equals(BigDecimal.ZERO)) {
                return r4.A03(this.A01, bigDecimal, true);
            }
        }
        return null;
    }
}
