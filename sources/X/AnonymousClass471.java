package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.471  reason: invalid class name */
public final class AnonymousClass471 {
    public static final Typeface A00(Context context, int i2) {
        Typeface typeface;
        Typeface typeface2;
        C18450wi.A0H(context, 0);
        if (i2 != 1) {
            if (i2 == 2) {
                typeface2 = AnonymousClass32z.A03(context);
            } else if (i2 != 3) {
                typeface = Typeface.DEFAULT;
            } else {
                typeface2 = AnonymousClass32z.A02(context);
            }
            C18450wi.A0B(typeface2);
            return typeface2;
        }
        typeface = Typeface.DEFAULT_BOLD;
        C18450wi.A0D(typeface);
        return typeface;
    }
}
