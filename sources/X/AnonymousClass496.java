package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.496  reason: invalid class name */
public class AnonymousClass496 {
    public static final String A00 = "RippleDrawableUtils";

    public static Drawable A00(C14990q7 r2, C31201dg r3, C31201dg r4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass381.A00(r2, r3, r4);
        }
        C31201dg A0G = r3.A0G(36);
        if (A0G != null) {
            return C90154da.A00().A06.A01(r2, A0G, r4);
        }
        C29691b2.A01(A00, "Client received a RippleDrawable with null fallback", (Throwable) null);
        return new ColorDrawable();
    }
}
