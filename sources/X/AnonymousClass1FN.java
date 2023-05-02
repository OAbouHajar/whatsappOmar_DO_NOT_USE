package X;

import android.content.SharedPreferences;
import com.obwhatsapp.cron.daily.RandomizedDailyCronWorker;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1FN  reason: invalid class name */
public class AnonymousClass1FN implements C19400yN {
    public final C16440t3 A00;
    public final C15860rz A01;
    public final C16900tq A02;
    public final AnonymousClass12P A03;
    public final AnonymousClass01D A04;

    public AnonymousClass1FN(C16440t3 r1, C15860rz r2, C16900tq r3, AnonymousClass12P r4, AnonymousClass01D r5) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }

    public synchronized void A00(boolean z2) {
        long j2;
        C15860rz r6 = this.A01;
        long j3 = ((SharedPreferences) r6.A01.get()).getLong("next_randomized_daily_cron", 0);
        long A002 = this.A00.A00();
        if (j3 <= 0 || j3 - A002 > 86400000) {
            j2 = (long) new Random().nextInt(43200000);
        } else if (j3 > A002) {
            C42681yF.A02(j3);
            if (z2) {
                r6.A0K().putLong("next_randomized_daily_cron", j3).apply();
                C006903e r4 = new C006903e(RandomizedDailyCronWorker.class);
                r4.A02(Math.abs(j3 - A002), TimeUnit.MILLISECONDS);
                r4.A03.add("tag.whatsapp.cron.daily.randomized");
                ((AnonymousClass022) this.A03.get()).A06(AnonymousClass03z.REPLACE, (AnonymousClass043) r4.A00(), "tag.whatsapp.cron.daily.randomized");
            }
        } else {
            C16900tq r0 = this.A02;
            r0.A04();
            if (r0.A01) {
                for (AnonymousClass1FG API : (Set) this.A04.get()) {
                    API.API();
                }
            }
            j3 += 86400000;
            if (j3 < A002) {
                j2 = j3 % 86400000;
            }
            C42681yF.A02(j3);
            r6.A0K().putLong("next_randomized_daily_cron", j3).apply();
            C006903e r42 = new C006903e(RandomizedDailyCronWorker.class);
            r42.A02(Math.abs(j3 - A002), TimeUnit.MILLISECONDS);
            r42.A03.add("tag.whatsapp.cron.daily.randomized");
            ((AnonymousClass022) this.A03.get()).A06(AnonymousClass03z.REPLACE, (AnonymousClass043) r42.A00(), "tag.whatsapp.cron.daily.randomized");
        }
        j3 = j2 + A002;
        C42681yF.A02(j3);
        r6.A0K().putLong("next_randomized_daily_cron", j3).apply();
        C006903e r422 = new C006903e(RandomizedDailyCronWorker.class);
        r422.A02(Math.abs(j3 - A002), TimeUnit.MILLISECONDS);
        r422.A03.add("tag.whatsapp.cron.daily.randomized");
        ((AnonymousClass022) this.A03.get()).A06(AnonymousClass03z.REPLACE, (AnonymousClass043) r422.A00(), "tag.whatsapp.cron.daily.randomized");
    }

    public String AGT() {
        return "RandomizedDailyCronExecutor";
    }

    public void AMc() {
        A00(false);
    }
}
