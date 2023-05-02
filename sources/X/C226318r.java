package X;

import com.facebook.redex.RunnableRunnableShape0S0202000_I0;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.18r  reason: invalid class name and case insensitive filesystem */
public class C226318r {
    public final C28991Zq A00 = new C28991Zq();
    public final C28991Zq A01 = new C28991Zq();
    public final AnonymousClass1CJ A02;
    public final CountDownLatch A03 = new CountDownLatch(1);

    public C226318r(AnonymousClass1CJ r3) {
        this.A02 = r3;
    }

    public void A00(int i2) {
        AnonymousClass1CJ r0 = this.A02;
        long j2 = (i2 != 2 ? r0.A01 : r0.A02).A05;
        Thread currentThread = Thread.currentThread();
        boolean z2 = false;
        if (j2 == currentThread.getId()) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Not running on this SerialExecutor", z2);
        try {
            this.A03.await();
        } catch (InterruptedException e2) {
            StringBuilder sb = new StringBuilder("wamruntime: unexpected thread interrupt (");
            sb.append(e2);
            sb.append(")");
            Log.a(sb.toString());
            currentThread.interrupt();
        }
    }

    public void A01(Object obj, int i2, int i3) {
        ((i3 == 1 || i3 == 0) ? this.A00 : this.A01).A00(i2, obj);
    }

    public void A02(Object obj, int i2, int i3) {
        AnonymousClass1CJ r6 = this.A02;
        long j2 = r6.A00.A05;
        Thread currentThread = Thread.currentThread();
        Object obj2 = obj;
        int i4 = i2;
        int i5 = i3;
        if (j2 == currentThread.getId()) {
            A01(obj, i2, i3);
        } else if (i3 != 2) {
            r6.A01.execute(new RunnableRunnableShape0S0202000_I0(this, obj2, i5, i4, 1));
        } else {
            AnonymousClass1WA r5 = r6.A02;
            if (r5.A05 == currentThread.getId()) {
                A00(i3);
                this.A01.A00(i2, obj);
                return;
            }
            r5.execute(new RunnableRunnableShape0S0202000_I0(this, obj2, i5, i4, 0));
        }
    }
}
