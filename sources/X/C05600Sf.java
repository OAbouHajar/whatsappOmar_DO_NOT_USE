package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0Sf  reason: invalid class name and case insensitive filesystem */
public class C05600Sf {
    public static AnonymousClass030 A00(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        AnonymousClass030 A02 = AnonymousClass030.A02(rootWindowInsets);
        AnonymousClass0VF r1 = A02.A00;
        r1.A0F(A02);
        r1.A0E(view.getRootView());
        return A02;
    }

    public static void A01(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
