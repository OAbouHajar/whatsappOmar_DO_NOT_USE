package androidx.work.impl.background.systemalarm;

import X.AnonymousClass0A5;
import X.C06530Wm;
import X.C08060cy;
import X.C12050jl;
import android.content.Intent;
import android.util.Log;

public class SystemAlarmService extends AnonymousClass0A5 implements C12050jl {
    public static final String A02 = C06530Wm.A01("SystemAlarmService");
    public C08060cy A00;
    public boolean A01;

    public void onCreate() {
        super.onCreate();
        C08060cy r1 = new C08060cy(this);
        this.A00 = r1;
        if (r1.A02 != null) {
            C06530Wm.A00();
            Log.e(C08060cy.A0A, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            r1.A02 = this;
        }
        this.A01 = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01 = true;
        C08060cy r3 = this.A00;
        C06530Wm.A00().A02(C08060cy.A0A, "Destroying SystemAlarmDispatcher");
        r3.A04.A03(r3);
        r3.A02 = null;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.A01) {
            C06530Wm.A00();
            Log.i(A02, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            C08060cy r3 = this.A00;
            C06530Wm A002 = C06530Wm.A00();
            String str = C08060cy.A0A;
            A002.A02(str, "Destroying SystemAlarmDispatcher");
            r3.A04.A03(r3);
            r3.A02 = null;
            C08060cy r1 = new C08060cy(this);
            this.A00 = r1;
            if (r1.A02 != null) {
                C06530Wm.A00();
                Log.e(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                r1.A02 = this;
            }
            this.A01 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A00.A02(intent, i3);
        return 3;
    }
}
