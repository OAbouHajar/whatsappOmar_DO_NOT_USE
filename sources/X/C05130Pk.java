package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0Pk  reason: invalid class name and case insensitive filesystem */
public final class C05130Pk {
    public List A00;
    public final Activity A01;
    public final AnonymousClass04N A02;
    public final Executor A03;

    public C05130Pk(Activity activity, AnonymousClass04N r2, Executor executor) {
        this.A01 = activity;
        this.A03 = executor;
        this.A02 = r2;
    }

    public final void A00(List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        for (Object next : list) {
            AnonymousClass0RD r2 = (AnonymousClass0RD) next;
            Activity activity = this.A01;
            if (r2.A01.A00.contains(activity) || r2.A02.A00.contains(activity)) {
                A0u.add(next);
            }
        }
        if (!A0u.equals(this.A00)) {
            this.A00 = A0u;
            this.A03.execute(new C09920gI(this, A0u));
        }
    }
}
