package X;

import android.app.Activity;
import com.obwhatsapp.R;

/* renamed from: X.2Dj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C46282Dj implements AnonymousClass1ZI {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass01Y A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C46282Dj(Activity activity, AnonymousClass01Y r2, boolean z2) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = z2;
    }

    public final void AWT(boolean z2) {
        AnonymousClass01Y r2 = this.A01;
        Activity activity = this.A00;
        boolean z3 = this.A02;
        if (!z2) {
            r2.A0J.A0X();
            if (activity != null && !activity.isFinishing()) {
                C14870pt r22 = r2.A07;
                int i2 = R.string.str187f;
                if (z3) {
                    i2 = R.string.str023a;
                }
                r22.A0N(activity.getString(i2), 0);
            }
        }
    }
}
