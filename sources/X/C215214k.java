package X;

import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.14k  reason: invalid class name and case insensitive filesystem */
public class C215214k extends C18240wN {
    public final C14710pd A00;

    public C215214k(C14710pd r4, C16320sq r5) {
        super(new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(r5, 30)));
        this.A00 = r4;
    }

    /* renamed from: A06 */
    public synchronized C30701co A01(C30701co r6, C16730tY r7) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A00.get();
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int max = Math.max(1, Math.min(10, this.A00.A03(C16620tM.A02, 49)));
        if (corePoolSize != max) {
            if (max > corePoolSize) {
                threadPoolExecutor.setMaximumPoolSize(max);
                threadPoolExecutor.setCorePoolSize(max);
            } else {
                threadPoolExecutor.setCorePoolSize(max);
                threadPoolExecutor.setMaximumPoolSize(max);
            }
        }
        return (C30701co) super.A01(r7, r6);
    }
}
