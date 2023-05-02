package X;

import android.app.Activity;
import java.util.Iterator;

/* renamed from: X.0ci  reason: invalid class name and case insensitive filesystem */
public final class C07920ci implements C12560kb {
    public final /* synthetic */ C07970cn A00;

    public C07920ci(C07970cn r1) {
        this.A00 = r1;
    }

    public void AZo(Activity activity, C05370Qr r6) {
        C18450wi.A0H(activity, 0);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            C04870Og r2 = (C04870Og) it.next();
            if (C18450wi.A0R(r2.A01, activity)) {
                r2.A00 = r6;
                r2.A03.execute(new C09930gJ(r2, r6));
            }
        }
    }
}
