package X;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0cy  reason: invalid class name and case insensitive filesystem */
public class C08060cy implements C12580kd {
    public static final String A0A = C06530Wm.A01("SystemAlarmDispatcher");
    public Intent A00 = null;
    public AnonymousClass0Rl A01;
    public C12050jl A02;
    public final Context A03;
    public final C08080d0 A04;
    public final AnonymousClass022 A05;
    public final C08050cx A06;
    public final AnonymousClass0UY A07;
    public final AnonymousClass04d A08;
    public final List A09 = AnonymousClass000.A0u();

    public C08060cy(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A03 = applicationContext;
        AnonymousClass0Rl r1 = new AnonymousClass0Rl();
        this.A01 = r1;
        this.A06 = new C08050cx(applicationContext, r1);
        AnonymousClass022 A012 = AnonymousClass022.A01(context);
        this.A05 = A012;
        this.A07 = new AnonymousClass0UY(A012.A02.A03);
        C08080d0 r12 = A012.A03;
        this.A04 = r12;
        this.A08 = A012.A06;
        r12.A02(this);
    }

    public static final void A00() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw AnonymousClass000.A0V("Needs to be invoked on the main thread.");
        }
    }

    public final void A01() {
        A00();
        PowerManager.WakeLock A002 = AnonymousClass0TC.A00(this.A03, "ProcessCommand");
        try {
            A002.acquire();
            this.A05.A06.A8p(new C09580fk(this));
        } finally {
            A002.release();
        }
    }

    public void A02(Intent intent, int i2) {
        boolean z2;
        C06530Wm A002 = C06530Wm.A00();
        String str = A0A;
        StringBuilder A0r = AnonymousClass000.A0r("Adding command ");
        A0r.append(intent);
        A0r.append(" (");
        A0r.append(i2);
        A002.A02(str, AnonymousClass000.A0h(")", A0r));
        A00();
        String action = intent.getAction();
        boolean z3 = false;
        if (TextUtils.isEmpty(action)) {
            C06530Wm.A00();
            Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            A00();
            List list = this.A09;
            synchronized (list) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i2);
        List list2 = this.A09;
        synchronized (list2) {
            if (!list2.isEmpty()) {
                z3 = true;
            }
            list2.add(intent);
            if (!z3) {
                A01();
            }
        }
    }

    public void AQm(AnonymousClass0R5 r5, boolean z2) {
        Executor executor = ((C08190dE) this.A08).A02;
        Intent intent = new Intent(this.A03, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        C08050cx.A00(intent, r5);
        C10330gx.A00(intent, this, executor, 0);
    }
}
