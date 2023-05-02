package X;

import android.os.PowerManager;

/* renamed from: X.1zy  reason: invalid class name and case insensitive filesystem */
public class C43421zy {
    public static PowerManager.WakeLock A00(PowerManager powerManager, String str, int i2) {
        StringBuilder sb = new StringBuilder("com.obwhatsapp");
        sb.append(":");
        sb.append(str);
        return powerManager.newWakeLock(i2, sb.toString());
    }
}
