package X;

import android.app.Activity;
import com.obwhatsapp.R;

/* renamed from: X.2Db  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Db implements AnonymousClass1ZI {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass1ZI A01;
    public final /* synthetic */ AnonymousClass01Y A02;
    public final /* synthetic */ C16010sH A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass2Db(Activity activity, AnonymousClass1ZI r2, AnonymousClass01Y r3, C16010sH r4, boolean z2) {
        this.A02 = r3;
        this.A04 = z2;
        this.A00 = activity;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void AWT(boolean z2) {
        AnonymousClass01Y r9 = this.A02;
        boolean z3 = this.A04;
        Activity activity = this.A00;
        C16010sH r7 = this.A03;
        AnonymousClass1ZI r6 = this.A01;
        if (z2) {
            int i2 = R.string.str187a;
            if (z3) {
                i2 = R.string.str022c;
            }
            r9.A07.A0H(activity.getString(i2, new Object[]{r9.A0G.A08(r7)}), 1);
        }
        if (r6 != null) {
            r6.AWT(z2);
        }
    }
}
