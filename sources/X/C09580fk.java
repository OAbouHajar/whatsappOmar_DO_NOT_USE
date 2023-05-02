package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.List;

/* renamed from: X.0fk  reason: invalid class name and case insensitive filesystem */
public class C09580fk implements Runnable {
    public final /* synthetic */ C08060cy A00;

    public C09580fk(C08060cy r1) {
        this.A00 = r1;
    }

    public void run() {
        C06530Wm r2;
        String str;
        C08060cy r3 = this.A00;
        List list = r3.A09;
        synchronized (list) {
            r3.A00 = (Intent) list.get(0);
        }
        Intent intent = r3.A00;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = r3.A00.getIntExtra("KEY_START_ID", 0);
            C06530Wm A002 = C06530Wm.A00();
            String str2 = C08060cy.A0A;
            StringBuilder A0r = AnonymousClass000.A0r("Processing command ");
            AnonymousClass000.A1H(r3.A00, A0r);
            A002.A02(str2, AnonymousClass000.A0l(A0r, intExtra));
            Context context = r3.A03;
            StringBuilder A0q = AnonymousClass000.A0q(action);
            A0q.append(" (");
            A0q.append(intExtra);
            PowerManager.WakeLock A003 = AnonymousClass0TC.A00(context, AnonymousClass000.A0h(")", A0q));
            try {
                C06530Wm A004 = C06530Wm.A00();
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Acquiring operation wake lock (");
                A0o.append(action);
                A004.A02(str2, AnonymousClass000.A0e(A003, ") ", A0o));
                A003.acquire();
                r3.A06.A01(r3.A00, r3, intExtra);
                r2 = C06530Wm.A00();
                StringBuilder A0r2 = AnonymousClass000.A0r("Releasing operation wake lock (");
                A0r2.append(action);
                str = AnonymousClass000.A0e(A003, ") ", A0r2);
            } catch (Throwable th) {
                C06530Wm A005 = C06530Wm.A00();
                StringBuilder A0r3 = AnonymousClass000.A0r("Releasing operation wake lock (");
                A0r3.append(action);
                A005.A02(str2, AnonymousClass000.A0e(A003, ") ", A0r3));
                A003.release();
                ((C08190dE) r3.A08).A02.execute(new C09590fl(r3));
                throw th;
            }
            r2.A02(str2, str);
            A003.release();
            ((C08190dE) r3.A08).A02.execute(new C09590fl(r3));
        }
    }
}
