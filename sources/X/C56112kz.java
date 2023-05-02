package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.2kz  reason: invalid class name and case insensitive filesystem */
public class C56112kz extends GregorianCalendar {
    public final Context context;
    public int count;
    public final int id;
    public final AnonymousClass013 whatsAppLocale;

    public C56112kz(Context context2, AnonymousClass013 r3, C56112kz r4) {
        this.id = r4.id;
        this.context = context2;
        this.count = r4.count;
        setTime(r4.getTime());
        this.whatsAppLocale = r3;
    }

    public C56112kz(Context context2, AnonymousClass013 r3, Calendar calendar, int i2) {
        this.id = i2;
        this.context = context2;
        setTime(calendar.getTime());
        this.whatsAppLocale = r3;
    }

    public String toString() {
        AnonymousClass013 r2;
        Locale locale;
        int i2;
        int i3 = this.id;
        if (i3 == 1) {
            return this.context.getString(R.string.str1357);
        }
        if (i3 == 2) {
            r2 = this.whatsAppLocale;
            locale = AnonymousClass013.A00(r2.A00);
            i2 = 232;
        } else if (i3 != 3) {
            AnonymousClass013 r5 = this.whatsAppLocale;
            long timeInMillis = getTimeInMillis();
            if (i3 != 4) {
                return new SimpleDateFormat(r5.A08(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH), AnonymousClass013.A00(r5.A00)).format(new Date(timeInMillis));
            }
            Calendar instance = Calendar.getInstance(AnonymousClass013.A00(r5.A00));
            instance.setTimeInMillis(timeInMillis);
            return C28931Zg.A00(r5)[instance.get(2)];
        } else {
            r2 = this.whatsAppLocale;
            locale = AnonymousClass013.A00(r2.A00);
            i2 = 231;
        }
        return C28891Zc.A06(locale, r2.A08(i2));
    }
}
