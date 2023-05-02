package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.29W  reason: invalid class name */
public class AnonymousClass29W {
    public final int A00;
    public final int A01;
    public final C39721sx A02;
    public final String A03;
    public final List A04;

    public AnonymousClass29W(AnonymousClass1GE r7, List list, int i2) {
        this.A04 = new ArrayList(list);
        C39721sx r0 = (C39721sx) list.get(0);
        this.A02 = r0;
        this.A01 = r7.A04.A00() - r0.A05 >= 600000 ? 1 : 0;
        this.A00 = i2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C39721sx) it.next()).A06.getRawString());
        }
        this.A03 = TextUtils.join("|", arrayList);
    }

    public AnonymousClass29W(C39721sx r2, int i2) {
        this.A04 = Collections.singletonList(r2);
        this.A02 = r2;
        this.A01 = 2;
        this.A00 = i2;
        this.A03 = r2.A06.getRawString();
    }

    public LatLng A00() {
        List<C39721sx> list = this.A04;
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (C39721sx r6 : list) {
            d2 += r6.A00;
            d3 += r6.A01;
        }
        return new LatLng(d2 / ((double) list.size()), d3 / ((double) list.size()));
    }
}
