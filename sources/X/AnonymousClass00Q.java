package X;

import android.content.Context;
import android.os.UserManager;

/* renamed from: X.00Q  reason: invalid class name */
public class AnonymousClass00Q {
    public static boolean A00(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
