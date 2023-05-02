package X;

import com.obwhatsapp.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.5lq  reason: invalid class name and case insensitive filesystem */
public class C113315lq extends AnonymousClass67Q {
    public C113315lq(AnonymousClass013 r1, Calendar calendar, int i2) {
        super(r1, calendar, i2);
    }

    public String toString() {
        long timeInMillis = getTimeInMillis();
        int i2 = (timeInMillis > 0 ? 1 : (timeInMillis == 0 ? 0 : -1));
        AnonymousClass013 r1 = this.whatsAppLocale;
        return i2 <= 0 ? r1.A09(R.string.str188a) : new SimpleDateFormat(r1.A08(177), C13690nt.A0m(r1)).format(new Date(timeInMillis));
    }
}
