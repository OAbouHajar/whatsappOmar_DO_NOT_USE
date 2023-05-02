package X;

import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.0xr  reason: invalid class name and case insensitive filesystem */
public class C19160xr implements C19050xg, C19170xs {
    public long A00;
    public long A01;
    public long A02;
    public final C18900xR A03;
    public final C16440t3 A04;
    public final C16490t9 A05;
    public final C16450t5 A06;
    public final AnonymousClass1HX A07;

    public C19160xr(C18900xR r1, C16440t3 r2, C16490t9 r3, C16450t5 r4, AnonymousClass1HX r5) {
        this.A04 = r2;
        this.A03 = r1;
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
    }

    public void A00() {
        long A002 = this.A04.A00() / 1000;
        long j2 = this.A00;
        if (A002 != j2) {
            boolean z2 = false;
            if (A002 < j2) {
                z2 = true;
            }
            long max = Math.max(j2, A002);
            if (A002 - j2 > 30 || z2) {
                A02();
                if (A05(A002) || z2) {
                    this.A07.A00().edit().putLong("timespent_end_time", max).apply();
                    A04(z2);
                    A03(A002);
                }
                this.A02 = A002;
            }
            this.A00 = A002;
        }
    }

    public void A01() {
        AnonymousClass1HX r4 = this.A07;
        if (r4.A00().getLong("timespent_saved_start_time", 0) > 0) {
            long j2 = r4.A00().getLong("timespent_summary_sequence", 0);
            long j3 = r4.A00().getLong("timespent_saved_start_time", 0);
            long j4 = r4.A00().getLong("timespent_saved_duration", 0);
            long j5 = r4.A00().getLong("timespent_saved_session_total", 0);
            long j6 = r4.A00().getLong("timespent_saved_foreground_count", 0);
            boolean z2 = r4.A00().getBoolean("timespent_saved_time_altered", false);
            AnonymousClass2I8 r12 = new AnonymousClass2I8();
            r12.A03 = Long.valueOf(j3);
            r12.A00 = Long.valueOf(j4);
            r12.A02 = Long.valueOf(j5);
            Long valueOf = Long.valueOf(j2);
            r12.A05 = valueOf;
            r12.A01 = Long.valueOf(j6);
            r12.A04 = Long.valueOf(z2 ? 1 : 0);
            this.A05.A05(r12);
            C16450t5 r5 = this.A06;
            long j7 = r4.A00().getLong("timespent_saved_start_time", 0);
            long j8 = r4.A00().getLong("timespent_saved_duration", 0);
            long j9 = r4.A00().getLong("timespent_saved_session_total", 0);
            long j10 = r4.A00().getLong("timespent_saved_foreground_count", 0);
            boolean z3 = r4.A00().getBoolean("timespent_saved_time_altered", false);
            AnonymousClass2I9 r122 = new AnonymousClass2I9();
            r122.A03 = Long.valueOf(j7);
            r122.A00 = Long.valueOf(j8);
            r122.A02 = Long.valueOf(j9);
            r122.A05 = valueOf;
            r122.A01 = Long.valueOf(j10);
            r122.A04 = Long.valueOf(z3 ? 1 : 0);
            r5.A02.A05(r122);
            r4.A00().edit().putLong("timespent_saved_start_time", 0).putLong("timespent_saved_duration", 0).putLong("timespent_saved_session_total", 0).putLong("timespent_saved_foreground_count", 0).putBoolean("timespent_saved_time_altered", false).putLong("timespent_summary_sequence", (j2 % 9999) + 1).apply();
        }
    }

    public final void A02() {
        long j2 = this.A02;
        if (j2 > 0) {
            long j3 = this.A00;
            long j4 = ((j3 - j2) + 1) - this.A01;
            AnonymousClass1HX r2 = this.A07;
            r2.A00().edit().putLong("timespent_last_activity_time", j3).putLong("timespent_session_total", r2.A00().getLong("timespent_session_total", 0) + j4).apply();
            this.A02 = 0;
            this.A00 = 0;
            this.A01 = 0;
        }
    }

    public final void A03(long j2) {
        long time = this.A03.A01().getTime() / 1000;
        if (1673975929 <= j2 && time >= j2) {
            AnonymousClass1HX r6 = this.A07;
            if (r6.A00().getLong("timespent_start_time", 0) == 0) {
                r6.A00().edit().putLong("timespent_start_time", j2).apply();
            }
        }
    }

    public final void A04(boolean z2) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
        instance.add(6, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        AnonymousClass1HX r11 = this.A07;
        r11.A00().edit().putLong("timespent_rollover_time", instance.getTimeInMillis() / 1000).apply();
        A01();
        SharedPreferences.Editor edit = r11.A00().edit();
        long j2 = r11.A00().getLong("timespent_start_time", 0);
        if (j2 > 0) {
            edit.putLong("timespent_saved_start_time", j2).putLong("timespent_saved_duration", (r11.A00().getLong("timespent_end_time", 0) - j2) + 1).putLong("timespent_saved_session_total", r11.A00().getLong("timespent_session_total", 0)).putLong("timespent_saved_foreground_count", r11.A00().getLong("timespent_foreground_count", 0)).putBoolean("timespent_saved_time_altered", z2);
        }
        edit.putLong("timespent_start_time", 0).putLong("timespent_session_total", 0).putLong("timespent_end_time", 0).putLong("timespent_foreground_count", 0).apply();
    }

    public final boolean A05(long j2) {
        return this.A07.A00().getLong("timespent_rollover_time", 0) < j2 || j2 < this.A00;
    }

    public void AMV() {
        long A002 = this.A04.A00() / 1000;
        long j2 = this.A00;
        boolean z2 = false;
        if (A002 < j2) {
            z2 = true;
        }
        long max = Math.max(j2, A002);
        A02();
        this.A07.A00().edit().putLong("timespent_end_time", max).apply();
        if (A05(A002) || z2) {
            A04(z2);
        }
    }

    public void AMW() {
        long A002 = this.A04.A00() / 1000;
        AnonymousClass1HX r6 = this.A07;
        long j2 = r6.A00().getLong("timespent_last_activity_time", 0);
        this.A00 = j2;
        int i2 = (A002 > j2 ? 1 : (A002 == j2 ? 0 : -1));
        boolean z2 = false;
        if (i2 < 0) {
            z2 = true;
        }
        if (A05(A002) || z2) {
            A04(z2);
        }
        A03(A002);
        this.A01 = A002 == this.A00 ? 1 : 0;
        this.A02 = A002;
        this.A00 = A002;
        r6.A00().edit().putLong("timespent_foreground_count", r6.A00().getLong("timespent_foreground_count", 0) + 1).apply();
    }

    public void AS4() {
        A01();
    }
}
