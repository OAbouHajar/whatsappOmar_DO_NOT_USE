package X;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.Statistics$Data;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0ua  reason: invalid class name and case insensitive filesystem */
public class C17130ua {
    public C28981Zo A00;
    public final C18260wP A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final AnonymousClass12X A04;
    public final AnonymousClass11O A05;

    public C17130ua(C18260wP r1, C16440t3 r2, C16980tz r3, AnonymousClass12X r4, AnonymousClass11O r5) {
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = r5;
        this.A01 = r1;
        this.A04 = r4;
    }

    public Statistics$Data A00() {
        Statistics$Data statistics$Data;
        C28981Zo r1 = this.A00;
        boolean z2 = false;
        if (r1 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        try {
            r1.A03.await();
        } catch (InterruptedException e2) {
            Log.e("statistics/waitForStatsInit exception waiting", e2);
        }
        C28981Zo r2 = this.A00;
        synchronized (r2) {
            try {
                statistics$Data = new Statistics$Data(new JSONObject(r2.A00.A00()));
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        }
        return statistics$Data;
    }

    public void A01() {
        Log.i("statistics/init");
        boolean z2 = false;
        if (this.A00 == null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        HandlerThread handlerThread = new HandlerThread("stat-save", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        C28981Zo r1 = new C28981Zo(looper, this, this.A01);
        this.A00 = r1;
        r1.sendEmptyMessage(0);
        AnonymousClass11O r3 = this.A05;
        r3.A00 = new AnonymousClass1Zn(looper, r3.A01, r3.A02);
    }

    public final void A02() {
        this.A00.removeMessages(1);
        this.A00.sendEmptyMessageDelayed(1, 1000);
    }

    public void A03(long j2, int i2) {
        C28981Zo r4 = this.A00;
        boolean z2 = false;
        if (r4 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        if (j2 >= 0) {
            Message obtain = Message.obtain(r4, 5, i2, 0);
            obtain.getData().putLong("bytes", j2);
            obtain.sendToTarget();
            A02();
        }
    }

    public void A04(long j2, int i2) {
        C28981Zo r4 = this.A00;
        boolean z2 = false;
        if (r4 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        if (j2 >= 0) {
            Message obtain = Message.obtain(r4, 4, i2, 0);
            obtain.getData().putLong("bytes", j2);
            obtain.sendToTarget();
            A02();
        }
    }

    public void A05(long j2, int i2, boolean z2) {
        C28981Zo r1 = this.A00;
        boolean z3 = false;
        if (r1 != null) {
            z3 = true;
        }
        AnonymousClass00B.A0G(z3);
        Message obtain = Message.obtain(r1, 7);
        Bundle data = obtain.getData();
        data.putInt("messageType", i2);
        data.putLong("timestamp", j2);
        data.putBoolean("isPayment", z2);
        obtain.sendToTarget();
        A02();
    }

    public void A06(boolean z2) {
        C28981Zo r2 = this.A00;
        boolean z3 = false;
        if (r2 != null) {
            z3 = true;
        }
        AnonymousClass00B.A0G(z3);
        Message.obtain(r2, 8, z2 ? 1 : 0, 0).sendToTarget();
        A02();
    }
}
