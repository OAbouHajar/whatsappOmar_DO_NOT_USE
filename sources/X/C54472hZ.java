package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.2hZ  reason: invalid class name and case insensitive filesystem */
public class C54472hZ {
    public static void A00(Intent intent, AnonymousClass01A r2) {
        AnonymousClass22U.A00(intent, r2.getClass().getSimpleName());
        r2.A0r(intent);
    }

    public static void A01(DialogFragment dialogFragment, AnonymousClass01A r4) {
        if (!r4.A0X) {
            AnonymousClass02C A0F = r4.A0F();
            String name = dialogFragment.getClass().getName();
            if (A0F.A0B(name) == null) {
                dialogFragment.A1G(r4.A0F(), name);
            }
        }
    }

    public static void A02(AnonymousClass01A r1, C17070uU r2, C17080uV r3, boolean z2, boolean z3) {
        int i2;
        if (r3 != null && z2 != z3) {
            if (z3) {
                r3.A02(r1, "visible");
                i2 = 1;
            } else {
                r3.A02(r1, "invisible");
                i2 = 2;
            }
            r2.A00(r1, i2);
        }
    }
}
