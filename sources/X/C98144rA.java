package X;

import android.content.Context;

/* renamed from: X.4rA  reason: invalid class name and case insensitive filesystem */
public final class C98144rA implements AnonymousClass5Ny {
    public final C84154Jl AdJ(Context context, AnonymousClass5RF r7, String str) {
        C84154Jl r4 = new C84154Jl();
        r4.A00 = r7.Aik(context, str);
        int Aj0 = r7.Aj0(context, str, true);
        r4.A01 = Aj0;
        int i2 = r4.A00;
        int i3 = 0;
        if (i2 == 0) {
            if (Aj0 != 0) {
                i2 = 0;
            }
            r4.A02 = i3;
            return r4;
        }
        if (Aj0 >= i2) {
            r4.A02 = 1;
            return r4;
        }
        i3 = -1;
        r4.A02 = i3;
        return r4;
    }
}
