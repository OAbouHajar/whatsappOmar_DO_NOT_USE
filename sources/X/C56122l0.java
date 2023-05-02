package X;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.2l0  reason: invalid class name and case insensitive filesystem */
public class C56122l0 {
    public final Context A00;
    public final AnonymousClass013 A01;
    public final C56112kz A02;
    public final C56112kz A03;
    public final C56112kz A04;
    public final Calendar A05;

    public C56122l0(Context context, AnonymousClass013 r6) {
        this.A00 = context;
        this.A01 = r6;
        C56112kz r1 = new C56112kz(context, r6, Calendar.getInstance(), 1);
        this.A03 = r1;
        r1.add(6, -2);
        C56112kz r12 = new C56112kz(context, r6, Calendar.getInstance(), 2);
        this.A04 = r12;
        r12.add(6, -7);
        C56112kz r13 = new C56112kz(context, r6, Calendar.getInstance(), 3);
        this.A02 = r13;
        r13.add(6, -28);
        Calendar instance = Calendar.getInstance();
        this.A05 = instance;
        instance.add(6, -366);
    }

    public C56112kz A00(long j2) {
        int i2;
        GregorianCalendar gregorianCalendar;
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j2));
        C56112kz r1 = this.A03;
        if (!instance.after(r1)) {
            r1 = this.A04;
            if (!instance.after(r1)) {
                r1 = this.A02;
                if (!instance.after(r1)) {
                    boolean after = instance.after(this.A05);
                    Context context = this.A00;
                    AnonymousClass013 r4 = this.A01;
                    if (after) {
                        i2 = 4;
                        gregorianCalendar = new GregorianCalendar(instance.get(1), instance.get(2), 1);
                    } else {
                        i2 = 5;
                        gregorianCalendar = new GregorianCalendar(instance.get(1), 1, 1);
                    }
                    return new C56112kz(context, r4, gregorianCalendar, i2);
                }
            }
        }
        return r1;
    }
}
