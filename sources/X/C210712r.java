package X;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: X.12r  reason: invalid class name and case insensitive filesystem */
public class C210712r {
    public final AnonymousClass01V A00;

    public C210712r(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public boolean A00() {
        AlarmManager A04 = this.A00.A04();
        return A04 != null && A04.canScheduleExactAlarms();
    }

    public boolean A01(PendingIntent pendingIntent, int i2, long j2) {
        AlarmManager A04 = this.A00.A04();
        if (A04 == null) {
            return false;
        }
        if (C15450qv.A0A() ? A00() : C15450qv.A02()) {
            A04.setExact(i2, j2, pendingIntent);
            return true;
        }
        A04.set(i2, j2, pendingIntent);
        return true;
    }

    public boolean A02(PendingIntent pendingIntent, int i2, long j2) {
        AlarmManager A04 = this.A00.A04();
        if (A04 == null) {
            return false;
        }
        if (C15450qv.A0A()) {
            if (!A00()) {
                A04.setAndAllowWhileIdle(i2, j2, pendingIntent);
                return true;
            }
        } else if (!C15450qv.A04()) {
            if (C15450qv.A02()) {
                A04.setExact(i2, j2, pendingIntent);
                return true;
            }
            A04.set(i2, j2, pendingIntent);
            return true;
        }
        A04.setExactAndAllowWhileIdle(i2, j2, pendingIntent);
        return true;
    }
}
