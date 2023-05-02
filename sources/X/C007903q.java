package X;

import android.content.Context;

/* renamed from: X.03q  reason: invalid class name and case insensitive filesystem */
public class C007903q {
    public static C008003r A00;

    public static void A00(Context context) {
        if (A00 == null) {
            try {
                A00 = (C008003r) Class.forName("DefaultLocationProvider").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            } catch (Exception e2) {
                throw new C11100iC(e2);
            }
        }
    }
}
