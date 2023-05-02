package X;

import android.content.Context;

/* renamed from: X.4r9  reason: invalid class name and case insensitive filesystem */
public final class C98134r9 implements AnonymousClass5Ny {
    public final C84154Jl AdJ(Context context, AnonymousClass5RF r5, String str) {
        C84154Jl r2 = new C84154Jl();
        int Aj0 = r5.Aj0(context, str, true);
        r2.A01 = Aj0;
        if (Aj0 != 0) {
            r2.A02 = 1;
        } else {
            int Aik = r5.Aik(context, str);
            r2.A00 = Aik;
            if (Aik != 0) {
                r2.A02 = -1;
                return r2;
            }
        }
        return r2;
    }
}
