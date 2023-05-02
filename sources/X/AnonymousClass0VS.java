package X;

import android.view.PointerIcon;
import android.view.View;

/* renamed from: X.0VS  reason: invalid class name */
public class AnonymousClass0VS {
    public static void A00(PointerIcon pointerIcon, View view) {
        view.setPointerIcon(pointerIcon);
    }

    public static void A01(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    public static void A02(View view) {
        view.dispatchStartTemporaryDetach();
    }
}
