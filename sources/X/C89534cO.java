package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4cO  reason: invalid class name and case insensitive filesystem */
public class C89534cO {
    public static void A00(View view, C14990q7 r3, Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            new Handler(Looper.myLooper()).post(new C1043655a(view, r3, obj));
        }
    }

    public static void A01(C14990q7 r3, C31201dg r4, List list) {
        if (Build.VERSION.SDK_INT >= 22 && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C31201dg A00 = AnonymousClass45Y.A00(r4, new C99314tp(next == null ? null : next instanceof String ? (String) next : String.valueOf(next)));
                if (A00 != null && A00.A0C(r3) != null) {
                    A00.A0C(r3).setAccessibilityTraversalAfter(-1);
                } else {
                    return;
                }
            }
        }
    }

    public static void A02(C14990q7 r2, C31201dg r3, List list) {
        if (Build.VERSION.SDK_INT >= 22 && list != null && !list.isEmpty()) {
            new Handler(Looper.myLooper()).post(new AnonymousClass55Z(r2, r3, list));
        }
    }
}
