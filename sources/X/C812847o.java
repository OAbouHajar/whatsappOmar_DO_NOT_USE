package X;

import android.app.Activity;
import android.os.Vibrator;
import android.provider.Settings;
import com.whatsapp.util.Log;

/* renamed from: X.47o  reason: invalid class name and case insensitive filesystem */
public class C812847o {
    public static void A00(Activity activity, AnonymousClass01V r2) {
        try {
            if (Settings.System.getInt(activity.getContentResolver(), "haptic_feedback_enabled") != 0) {
                Vibrator A0K = r2.A0K();
                AnonymousClass00B.A06(A0K);
                A0K.vibrate(75);
            }
        } catch (Settings.SettingNotFoundException e2) {
            Log.e("voicerecorderutils/vibrate", e2);
        }
    }
}
