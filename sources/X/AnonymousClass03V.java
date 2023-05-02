package X;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.03V  reason: invalid class name */
public class AnonymousClass03V {
    public static Bundle A00(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        synchronized (C06480Wd.A02) {
            if (!C06480Wd.A01) {
                try {
                    Field field = C06480Wd.A00;
                    if (field == null) {
                        field = Notification.class.getDeclaredField("extras");
                        if (!Bundle.class.isAssignableFrom(field.getType())) {
                            Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                            C06480Wd.A01 = true;
                        } else {
                            field.setAccessible(true);
                            C06480Wd.A00 = field;
                        }
                    }
                    Bundle bundle = (Bundle) field.get(notification);
                    if (bundle == null) {
                        bundle = new Bundle();
                        C06480Wd.A00.set(notification, bundle);
                    }
                    return bundle;
                } catch (IllegalAccessException e2) {
                    Log.e("NotificationCompat", "Unable to access notification extras", e2);
                    C06480Wd.A01 = true;
                    return null;
                } catch (NoSuchFieldException e3) {
                    Log.e("NotificationCompat", "Unable to access notification extras", e3);
                    C06480Wd.A01 = true;
                    return null;
                }
            }
        }
    }
}
