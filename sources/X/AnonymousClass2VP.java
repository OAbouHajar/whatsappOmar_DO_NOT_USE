package X;

import android.content.Context;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.2VP  reason: invalid class name */
public final class AnonymousClass2VP {
    public static void A00(Context context, AnonymousClass2VO r5) {
        if (context != null) {
            C32241fu r3 = new C32241fu(context);
            r3.A01(R.string.str04f7);
            r3.A02(R.string.str04f8);
            r3.setPositiveButton(R.string.str04f9, new IDxCListenerShape127S0100000_2_I0(r5, 44));
            r3.setNegativeButton(R.string.str04f6, new IDxCListenerShape127S0100000_2_I0(r5, 45));
            r3.A00();
        }
    }
}
