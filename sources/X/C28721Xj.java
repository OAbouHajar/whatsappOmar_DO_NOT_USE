package X;

import android.content.Context;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Xj  reason: invalid class name and case insensitive filesystem */
public class C28721Xj {
    public final Context A00;
    public final Executor A01;
    public final AtomicBoolean A02;
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final C28811Xu A04;
    public final C28771Xo A05;
    public final C28731Xk A06;

    public C28721Xj(Context context, AnonymousClass2Nu r13, C48542Nt r14, List list, int i2, int i3, int i4, boolean z2, boolean z3) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.A01 = newSingleThreadExecutor;
        this.A02 = new AtomicBoolean(false);
        this.A04 = new C28811Xu(r13, z3);
        this.A00 = context;
        C28771Xo r1 = new C28771Xo();
        this.A05 = r1;
        this.A06 = new C28731Xk(context, r14, r1);
        newSingleThreadExecutor.execute(new RunnableRunnableShape16S0100000_I0_15(this));
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C48472Nl) it.next()).Ae7(this);
            }
        }
        for (int i5 = 0; i5 < i2; i5++) {
            StringBuilder sb = new StringBuilder("JobConsumer-");
            sb.append(i5);
            new AnonymousClass1Z5(sb.toString(), this.A03, this.A04, this.A06, i3, i4, z2).start();
        }
    }

    public void A00() {
        this.A01.execute(new RunnableRunnableShape16S0100000_I0_15(this, 36));
    }
}
