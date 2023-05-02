package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1GX  reason: invalid class name */
public class AnonymousClass1GX {
    public boolean A00 = false;
    public final int A01;
    public final RunnableRunnableShape16S0100000_I0_15 A02 = new RunnableRunnableShape16S0100000_I0_15(this, 10);
    public final C16300so A03;
    public final C16440t3 A04;
    public final C16250si A05;
    public final C16900tq A06;
    public final C16320sq A07;
    public final Runnable A08;
    public final List A09 = new ArrayList();
    public final Map A0A = new HashMap();
    public final Map A0B = new HashMap();
    public final Map A0C = new HashMap();

    public AnonymousClass1GX(C16300so r4, C16440t3 r5, C16250si r6, C16900tq r7, C14710pd r8, C16320sq r9) {
        RunnableRunnableShape0S0000000_I0 runnableRunnableShape0S0000000_I0 = new RunnableRunnableShape0S0000000_I0(13);
        this.A04 = r5;
        this.A03 = r4;
        this.A07 = r9;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r8.A03(C16620tM.A02, 757) * 1000;
        this.A08 = runnableRunnableShape0S0000000_I0;
    }

    public void A00() {
        synchronized (this) {
            this.A00 = false;
            for (Map.Entry entry : this.A0A.entrySet()) {
                Handler handler = (Handler) entry.getKey();
                this.A0B.put(handler, Boolean.TRUE);
                handler.postAtFrontOfQueue((Runnable) entry.getValue());
            }
        }
        this.A07.Ad4(this.A02, "StuckDbHandlerThreadDetector/monitor", 120000);
    }

    public void A01(Handler handler) {
        synchronized (this) {
            this.A0A.put(handler, new RunnableRunnableShape11S0200000_I0_9(handler, 21, this));
        }
    }

    public final void A02(String str) {
        C16250si r2 = this.A05;
        boolean equals = Boolean.TRUE.equals(r2.A03.A01());
        boolean z2 = false;
        if (System.currentTimeMillis() - r2.A07() < 240000) {
            z2 = true;
        }
        if (equals || z2) {
            this.A07.Ad4(this.A02, "StuckDbHandlerThreadDetector/heartbeat", 120000);
            return;
        }
        int i2 = this.A01;
        if (i2 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Map map = this.A0C;
            if (!map.containsKey(str)) {
                map.put(str, Long.valueOf(uptimeMillis));
                this.A07.Ad4(this.A02, "StuckDbHandlerThreadDetector/recovery", (long) i2);
            } else if (uptimeMillis - ((Number) map.get(str)).longValue() >= ((long) i2)) {
                this.A08.run();
            }
        }
        if (!this.A00) {
            StringBuilder sb = new StringBuilder("StuckDbHandlerThreadDetector/not responsive, debugName:");
            sb.append(str);
            sb.append(" msgStoreReadLock:");
            sb.append((String) null);
            Log.w(sb.toString());
            AnonymousClass01E.A00();
            this.A03.AcB("db-thread-stuck", str, false);
            this.A00 = true;
        }
    }
}
