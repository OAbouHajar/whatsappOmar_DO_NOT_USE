package X;

import android.os.Build;

/* renamed from: X.0G6  reason: invalid class name */
public final class AnonymousClass0G6 extends AnonymousClass0PS {
    public static final AnonymousClass0G6 A00 = new AnonymousClass0G6();

    public AnonymousClass0G6() {
        super(3, 4);
    }

    public void A00(C13620mg r3) {
        C18450wi.A0H(r3, 0);
        if (Build.VERSION.SDK_INT >= 23) {
            r3.A8n("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
