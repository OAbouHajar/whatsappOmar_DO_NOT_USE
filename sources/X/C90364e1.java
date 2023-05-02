package X;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: X.4e1  reason: invalid class name and case insensitive filesystem */
public class C90364e1 {
    public static volatile UserManager A00;
    public static volatile boolean A01 = (!AnonymousClass3K3.A1P(Build.VERSION.SDK_INT, 24));

    public static boolean A00(Context context) {
        return Build.VERSION.SDK_INT >= 24 && !A01(context);
    }

    public static boolean A01(Context context) {
        boolean z2 = A01;
        if (!z2) {
            UserManager userManager = A00;
            if (userManager == null) {
                synchronized (C90364e1.class) {
                    userManager = A00;
                    if (userManager == null) {
                        userManager = (UserManager) context.getSystemService(UserManager.class);
                        A00 = userManager;
                        if (userManager == null) {
                            A01 = true;
                            return true;
                        }
                    }
                }
            }
            z2 = userManager.isUserUnlocked();
            A01 = z2;
            if (z2) {
                A00 = null;
            }
        }
        return z2;
    }
}
