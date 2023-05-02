package X;

import com.facebook.redex.IDxNConsumerShape153S0100000_2_I0;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1zp  reason: invalid class name and case insensitive filesystem */
public class C43331zp extends C18240wN {
    public final C16000sG A00;
    public final AnonymousClass120 A01;
    public final C16980tz A02;
    public final AnonymousClass013 A03;
    public final AnonymousClass1QZ A04;

    public C43331zp(C16000sG r3, AnonymousClass120 r4, C16980tz r5, AnonymousClass013 r6, AnonymousClass1QZ r7, ThreadPoolExecutor threadPoolExecutor) {
        super(new AnonymousClass01T(threadPoolExecutor, (AnonymousClass01J) null));
        this.A02 = r5;
        this.A04 = r7;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
    }

    public static ThreadPoolExecutor A00(C16320sq r9) {
        C28111Uk r0 = new C28111Uk((C23291Bk) r9, new PriorityBlockingQueue(), new C28061Uf(0, "VCardLoader"), TimeUnit.SECONDS, 1, 1, 5, false);
        r0.allowCoreThreadTimeOut(true);
        return r0;
    }

    public void A06() {
        A02(new IDxNConsumerShape153S0100000_2_I0(this, 22));
        synchronized (this) {
            ((ThreadPoolExecutor) this.A00.get()).shutdown();
        }
    }
}
