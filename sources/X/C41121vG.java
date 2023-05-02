package X;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.1vG  reason: invalid class name and case insensitive filesystem */
public final class C41121vG extends C41091vD {
    public void A01(Notification notification, Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 19 && Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i2)});
            } catch (Exception unused) {
                Log.e("Could not set badge for Xiaomi notification");
            }
        }
    }
}
