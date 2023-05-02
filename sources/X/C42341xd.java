package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1xd  reason: invalid class name and case insensitive filesystem */
public class C42341xd {
    public static final boolean A00 = C15450qv.A04();
    public static final boolean A01 = C15450qv.A0A();

    public static PendingIntent A00(Context context, int i2, Intent intent, int i3) {
        if (A00) {
            i3 |= 67108864;
        }
        return PendingIntent.getActivity(context, i2, intent, i3);
    }

    public static PendingIntent A01(Context context, int i2, Intent intent, int i3) {
        if (A00) {
            i3 |= 67108864;
        }
        return PendingIntent.getBroadcast(context, i2, intent, i3);
    }

    public static PendingIntent A02(Context context, Intent intent) {
        int i2 = 0;
        if (A00) {
            i2 = 67108864;
        }
        return PendingIntent.getForegroundService(context, 0, intent, i2);
    }
}
