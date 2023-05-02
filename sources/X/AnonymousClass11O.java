package X;

import android.os.Message;

/* renamed from: X.11O  reason: invalid class name */
public class AnonymousClass11O {
    public AnonymousClass1Zn A00;
    public final C16980tz A01;
    public final AnonymousClass12X A02;

    public AnonymousClass11O(C16980tz r1, AnonymousClass12X r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void A00() {
        AnonymousClass1Zn r0 = this.A00;
        if (r0 != null) {
            AnonymousClass00B.A06(r0);
            r0.removeMessages(1);
            this.A00.sendEmptyMessageDelayed(1, 1000);
        }
    }

    public void A01(long j2) {
        AnonymousClass1Zn r2;
        if (j2 >= 0 && (r2 = this.A00) != null) {
            AnonymousClass00B.A0G(true);
            Message obtain = Message.obtain(r2, 4, 2, -1);
            obtain.getData().putLong("long_value", j2);
            obtain.sendToTarget();
            A00();
        }
    }

    public void A02(long j2, int i2) {
        AnonymousClass1Zn r2;
        if (j2 >= 0 && (r2 = this.A00) != null) {
            AnonymousClass00B.A0G(true);
            Message obtain = Message.obtain(r2, 5, i2, -1);
            obtain.getData().putLong("long_value", j2);
            obtain.sendToTarget();
            A00();
        }
    }
}
