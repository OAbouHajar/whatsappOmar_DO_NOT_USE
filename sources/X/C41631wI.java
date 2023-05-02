package X;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.1wI  reason: invalid class name and case insensitive filesystem */
public class C41631wI {
    public static void A00(Vibrator vibrator, int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(30, i2));
            } else {
                vibrator.vibrate(30);
            }
        } catch (Exception e2) {
            Log.w("vibrationutils/vibrate-failed", e2);
        }
    }

    public static void A01(View view, AnonymousClass01V r2) {
        if (C15450qv.A09()) {
            view.performHapticFeedback(16);
        } else {
            A02(r2);
        }
    }

    public static void A02(AnonymousClass01V r1) {
        Vibrator A0K = r1.A0K();
        if (A0K != null) {
            A00(A0K, 48);
        }
    }
}
