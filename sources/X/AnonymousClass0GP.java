package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.0GP  reason: invalid class name */
public class AnonymousClass0GP extends AnonymousClass0GQ {
    public static boolean A00 = true;

    public void A07(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.A07(view, i2);
        } else if (A00) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
