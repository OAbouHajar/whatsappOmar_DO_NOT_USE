package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0d5  reason: invalid class name */
public class AnonymousClass0d5 implements C13110lU, C12120js {
    public static final String A0C = C06530Wm.A01("DelayMetCommandHandler");
    public int A00 = 0;
    public PowerManager.WakeLock A01;
    public boolean A02 = false;
    public final int A03;
    public final Context A04;
    public final AnonymousClass0NV A05;
    public final C08060cy A06;
    public final AnonymousClass0d6 A07;
    public final AnonymousClass0R5 A08;
    public final Object A09 = new Object();
    public final Executor A0A;
    public final Executor A0B;

    public AnonymousClass0d5(Context context, AnonymousClass0NV r5, C08060cy r6, int i2) {
        this.A04 = context;
        this.A03 = i2;
        this.A06 = r6;
        this.A08 = r5.A00;
        this.A05 = r5;
        AnonymousClass0U8 r2 = r6.A05.A09;
        C08190dE r1 = (C08190dE) r6.A08;
        this.A0B = r1.A01;
        this.A0A = r1.A02;
        this.A07 = new AnonymousClass0d6(this, r2);
    }

    public final void A00() {
        synchronized (this.A09) {
            this.A07.reset();
            AnonymousClass0UY r0 = this.A06.A07;
            AnonymousClass0R5 r4 = this.A08;
            r0.A00(r4);
            PowerManager.WakeLock wakeLock = this.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                C06530Wm A002 = C06530Wm.A00();
                String str = A0C;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Releasing wakelock ");
                A0o.append(this.A01);
                A002.A02(str, AnonymousClass000.A0e(r4, "for WorkSpec ", A0o));
                this.A01.release();
            }
        }
    }

    public void AMN(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AnonymousClass0MO.A00((C007303i) it.next()).equals(this.A08)) {
                this.A0B.execute(new C09560fi(this));
                return;
            }
        }
    }

    public void AMO(List list) {
        this.A0B.execute(new C09570fj(this));
    }
}
