package X;

import com.obwhatsapp.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.67Q  reason: invalid class name */
public class AnonymousClass67Q extends GregorianCalendar {
    public int count;
    public int id;
    public AnonymousClass013 whatsAppLocale;

    public AnonymousClass67Q(AnonymousClass013 r2, Calendar calendar, int i2) {
        this.whatsAppLocale = r2;
        this.id = i2;
        setTime(calendar.getTime());
    }

    public String toString() {
        long timeInMillis = getTimeInMillis();
        if (timeInMillis <= 0) {
            return this.whatsAppLocale.A09(R.string.str188a);
        }
        AnonymousClass013 r4 = this.whatsAppLocale;
        Locale A0m = C13690nt.A0m(r4);
        Calendar instance = Calendar.getInstance(A0m);
        instance.setTimeInMillis(timeInMillis);
        return (instance.get(1) == Calendar.getInstance(A0m).get(1) ? C28891Zc.A07(r4) : C28891Zc.A08(r4, 0)).format(instance.getTime());
    }
}
