package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Handler;

/* renamed from: X.02M  reason: invalid class name */
public class AnonymousClass02M extends AlarmManager {
    public AlarmManager A00;

    public AnonymousClass02M(AlarmManager alarmManager) {
        this.A00 = alarmManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r3.getMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.lang.Throwable r3) {
        /*
            boolean r0 = r3 instanceof java.lang.NullPointerException
            r2 = 1
            if (r0 != 0) goto L_0x0017
            boolean r0 = r3 instanceof java.lang.SecurityException
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = "android.permission.GET_INTENT_SENDER_INTENT"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            return r2
        L_0x0018:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02M.A00(java.lang.Throwable):boolean");
    }

    public void cancel(AlarmManager.OnAlarmListener onAlarmListener) {
        this.A00.cancel(onAlarmListener);
    }

    public void cancel(PendingIntent pendingIntent) {
        this.A00.cancel(pendingIntent);
    }

    public AlarmManager.AlarmClockInfo getNextAlarmClock() {
        return this.A00.getNextAlarmClock();
    }

    public void set(int i2, long j2, PendingIntent pendingIntent) {
        int i3 = 0;
        do {
            try {
                this.A00.set(i2, ((long) (i3 * 10)) + j2, pendingIntent);
                return;
            } catch (NullPointerException | SecurityException e2) {
                if (A00(e2)) {
                    i3++;
                    if (i3 >= 3) {
                    }
                } else {
                    throw e2;
                }
            }
        } while (i3 >= 3);
    }

    public void set(int i2, long j2, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
        int i3 = 0;
        do {
            try {
                this.A00.set(i2, j2, str, onAlarmListener, handler);
                return;
            } catch (NullPointerException | SecurityException e2) {
                if (A00(e2)) {
                    i3++;
                    if (i3 >= 3) {
                    }
                } else {
                    throw e2;
                }
            }
        } while (i3 >= 3);
    }

    public void setAlarmClock(AlarmManager.AlarmClockInfo alarmClockInfo, PendingIntent pendingIntent) {
        this.A00.setAlarmClock(alarmClockInfo, pendingIntent);
    }

    public void setAndAllowWhileIdle(int i2, long j2, PendingIntent pendingIntent) {
        this.A00.setAndAllowWhileIdle(i2, j2, pendingIntent);
    }

    public void setExact(int i2, long j2, PendingIntent pendingIntent) {
        this.A00.setExact(i2, j2, pendingIntent);
    }

    public void setExact(int i2, long j2, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
        this.A00.setExact(i2, j2, str, onAlarmListener, handler);
    }

    public void setExactAndAllowWhileIdle(int i2, long j2, PendingIntent pendingIntent) {
        int i3 = 0;
        do {
            try {
                this.A00.setExactAndAllowWhileIdle(i2, ((long) (i3 * 10)) + j2, pendingIntent);
                return;
            } catch (NullPointerException | SecurityException e2) {
                if (A00(e2)) {
                    i3++;
                    if (i3 >= 3) {
                    }
                } else {
                    throw e2;
                }
            }
        } while (i3 >= 3);
    }

    public void setInexactRepeating(int i2, long j2, long j3, PendingIntent pendingIntent) {
        int i3 = 0;
        do {
            try {
                this.A00.setInexactRepeating(i2, j2, j3, pendingIntent);
                return;
            } catch (NullPointerException | SecurityException e2) {
                if (A00(e2)) {
                    i3++;
                    if (i3 >= 3) {
                    }
                } else {
                    throw e2;
                }
            }
        } while (i3 >= 3);
    }

    public void setRepeating(int i2, long j2, long j3, PendingIntent pendingIntent) {
        this.A00.setRepeating(i2, j2, j3, pendingIntent);
    }

    public void setTime(long j2) {
        this.A00.setTime(j2);
    }

    public void setTimeZone(String str) {
        this.A00.setTimeZone(str);
    }

    public void setWindow(int i2, long j2, long j3, PendingIntent pendingIntent) {
        this.A00.setWindow(i2, j2, j3, pendingIntent);
    }

    public void setWindow(int i2, long j2, long j3, String str, AlarmManager.OnAlarmListener onAlarmListener, Handler handler) {
        this.A00.setWindow(i2, j2, j3, str, onAlarmListener, handler);
    }
}
