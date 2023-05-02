package X;

import android.os.Handler;
import android.os.PowerManager;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.1HC  reason: invalid class name */
public class AnonymousClass1HC {
    public boolean A00;
    public final C14870pt A01;
    public final C16600tK A02;
    public final AnonymousClass01V A03;
    public final C19090xk A04;
    public final AnonymousClass125 A05;

    public AnonymousClass1HC(C14870pt r1, C16600tK r2, AnonymousClass01V r3, C19090xk r4, AnonymousClass125 r5) {
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A02 = r2;
    }

    public void A00() {
        this.A00 = true;
        if (this.A02.A05 || !this.A00) {
            C19090xk r2 = this.A04;
            Log.i("session active");
            C34511kO r1 = r2.A08;
            AnonymousClass00B.A06(r1);
            ((Handler) r1).obtainMessage(7).sendToTarget();
            r2.A0s.A01();
            r2.A0q.A02();
            r2.A0G(true, false, false);
            r2.A0Z.A00();
        }
    }

    public void A01() {
        this.A00 = false;
        if (this.A02.A05 && !this.A00) {
            PowerManager A0I = this.A03.A0I();
            if (A0I == null) {
                Log.w("app/send/inactive pm=null");
            } else {
                PowerManager.WakeLock A002 = C43421zy.A00(A0I, "sendinactive", 1);
                if (A002 != null) {
                    A002.acquire(3000);
                    Log.i("app/sendinactive/wl");
                }
            }
            if (!yo.always_online()) {
                C19090xk r1 = this.A04;
                Log.i("session inactive");
                C34511kO r12 = r1.A08;
                AnonymousClass00B.A06(r12);
                ((Handler) r12).obtainMessage(6).sendToTarget();
            }
        }
        if (!this.A00) {
            this.A01.A0K(new RunnableRunnableShape12S0100000_I0_11((Object) this.A05, 18));
        }
    }
}
