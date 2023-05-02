package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Random;

/* renamed from: X.2wz  reason: invalid class name and case insensitive filesystem */
public class C59282wz extends AnonymousClass4X3 {
    public final C210712r A00;
    public final C16440t3 A01;
    public final C15860rz A02;
    public final C19090xk A03;
    public final Random A04;

    public C59282wz(Context context, C210712r r2, C16440t3 r3, C15860rz r4, C19090xk r5, Random random) {
        super(context);
        this.A01 = r3;
        this.A04 = random;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
    }

    public void A01() {
        A05();
    }

    public void A02(Intent intent) {
        A06(intent);
    }

    public boolean A04(Intent intent) {
        return "com.obwhatsapp.action.HEARTBEAT_WAKEUP".equals(intent.getAction());
    }

    public final void A05() {
        long A002 = this.A01.A00();
        C15860rz r9 = this.A02;
        AnonymousClass01D r8 = r9.A01;
        if (!C13680ns.A0C(r8).contains("last_heartbeat_login")) {
            long nextInt = A002 - (((long) this.A04.nextInt(86400)) * 1000);
            C13680ns.A0x(r9.A0K(), "last_heartbeat_login", nextInt);
            Log.i(AnonymousClass000.A0h(C42681yF.A02(nextInt), AnonymousClass000.A0r("no last heartbeat known; setting to ")));
        }
        long A08 = C13680ns.A08(C13680ns.A0C(r8), "last_heartbeat_login");
        if (A08 <= A002) {
            long j2 = 86400000 + A08;
            if (j2 >= A002) {
                long elapsedRealtime = (j2 - A002) + SystemClock.elapsedRealtime();
                Log.i(AnonymousClass000.A0h(C42681yF.A02(elapsedRealtime), AnonymousClass000.A0r("HeartbeatWakeupAction; elapsedRealTimeHeartbeatLogin=")));
                if (!this.A00.A02(A00("com.obwhatsapp.action.HEARTBEAT_WAKEUP", 134217728), 2, elapsedRealtime)) {
                    Log.w("HeartbeatWakeupAction; AlarmManager is null");
                    return;
                }
                return;
            }
        }
        StringBuilder A0r = AnonymousClass000.A0r("HeartbeatWakeupAction/last heart beat login=");
        A0r.append(A08);
        A0r.append(" server time=");
        A0r.append(A002);
        A0r.append(" client time=");
        A0r.append(System.currentTimeMillis());
        A0r.append(" interval=");
        A0r.append(86400);
        C13680ns.A1V(A0r);
        A06((Intent) null);
    }

    public final void A06(Intent intent) {
        Log.i(AnonymousClass000.A0g("HeartbeatWakeupAction; intent=", intent));
        long A002 = this.A01.A00();
        this.A03.A0C((String) null, (String) null, 0, false, true, true, true, false, false);
        StringBuilder A0r = AnonymousClass000.A0r("HeartbeatWakeupAction/setting last heart beat login time: ");
        A0r.append(A002);
        C13680ns.A1V(A0r);
        C13680ns.A0x(this.A02.A0K(), "last_heartbeat_login", A002);
        A05();
    }
}
