package X;

import android.location.Location;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.387  reason: invalid class name */
public class AnonymousClass387 {
    public static void A00(AnonymousClass26B r6, Double d2, List list) {
        Double valueOf;
        if (r6.A08.equals("country_default")) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass1US r1 = (AnonymousClass1US) it.next();
                r1.A02 = r1.A07;
            }
        } else {
            Double d3 = r6.A03;
            AnonymousClass00B.A06(d3);
            double doubleValue = d3.doubleValue();
            Double d4 = r6.A04;
            AnonymousClass00B.A06(d4);
            double doubleValue2 = d4.doubleValue();
            Location location = new Location("");
            location.setLatitude(doubleValue);
            location.setLongitude(doubleValue2);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnonymousClass1US r4 = (AnonymousClass1US) it2.next();
                r4.A03(location);
                double d5 = r4.A00;
                if (Double.valueOf(d5) == null) {
                    valueOf = r4.A07;
                } else {
                    double doubleValue3 = d5 * (d2 == null ? 1.0d : d2.doubleValue());
                    Double d6 = r4.A07;
                    valueOf = Double.valueOf(doubleValue3 + (d6 == null ? 0.0d : d6.doubleValue()));
                }
                r4.A02 = valueOf;
            }
        }
        C13690nt.A1P(list, 9);
    }
}
