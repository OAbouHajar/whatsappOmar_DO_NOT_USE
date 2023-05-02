package X;

import android.app.Activity;
import com.obwhatsapp.R;

/* renamed from: X.15J  reason: invalid class name */
public class AnonymousClass15J {
    public final C14870pt A00;
    public final C18260wP A01;

    public AnonymousClass15J(C14870pt r1, C18260wP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Deprecated
    public void A00(Activity activity, AnonymousClass2D0 r5, boolean z2) {
        int i2;
        C18260wP r1 = this.A01;
        if (!r1.A0A()) {
            if (C18260wP.A02(r1.A02.A00)) {
                i2 = R.string.str0e00;
                if (z2) {
                    i2 = R.string.str0dfc;
                }
            } else {
                i2 = R.string.str0dff;
                if (z2) {
                    i2 = R.string.str0dfb;
                }
            }
            this.A00.A09(i2, 0);
            return;
        }
        this.A00.A0E((C14600pS) activity);
        r5.A5d();
    }
}
