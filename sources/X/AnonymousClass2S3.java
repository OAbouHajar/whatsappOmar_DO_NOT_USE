package X;

import com.whatsapp.util.Log;

/* renamed from: X.2S3  reason: invalid class name */
public class AnonymousClass2S3 {
    public static long A00 = -1;
    public static boolean A01;

    public static synchronized void A00(C18900xR r4, C15860rz r5) {
        synchronized (AnonymousClass2S3.class) {
            A01 = true;
            if (r4.A03()) {
                Log.w("profilephotoreminder/savelastremindertimestamp/clock is wrong, not saving last profile photo reminder time");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                A00 = currentTimeMillis;
                r5.A14("wa_last_reminder_timestamp", currentTimeMillis);
            }
        }
    }
}
