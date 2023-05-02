package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5vO  reason: invalid class name and case insensitive filesystem */
public class C118875vO {
    public final AnonymousClass013 A00;

    public C118875vO(AnonymousClass013 r1) {
        this.A00 = r1;
    }

    public C113315lq A00(long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j2));
        return new C113315lq(this.A00, new GregorianCalendar(instance.get(1), instance.get(2), 1), instance.get(6));
    }

    public AnonymousClass67Q A01(long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j2));
        return new AnonymousClass67Q(this.A00, new GregorianCalendar(instance.get(1), instance.get(2), instance.get(5)), instance.get(6));
    }

    public List A02(List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        AnonymousClass67Q r2 = null;
        while (it.hasNext()) {
            AnonymousClass67Q A01 = A01(((AnonymousClass1Vt) it.next()).A05);
            if (r2 != null) {
                if (!r2.equals(A01)) {
                    A0u.add(r2);
                } else {
                    r2.count++;
                }
            }
            A01.count = 0;
            r2 = A01;
            r2.count++;
        }
        if (r2 != null) {
            A0u.add(r2);
        }
        return A0u;
    }
}
