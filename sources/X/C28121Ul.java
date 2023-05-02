package X;

import java.util.Set;

/* renamed from: X.1Ul  reason: invalid class name and case insensitive filesystem */
public class C28121Ul extends C28131Um {
    public final /* synthetic */ C23291Bk A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Set A03;

    public C28121Ul(C23291Bk r1, Runnable runnable, String str, Set set) {
        this.A00 = r1;
        this.A01 = runnable;
        this.A03 = set;
        this.A02 = str;
    }

    public void run() {
        try {
            this.A01.run();
            Set set = this.A03;
            synchronized (set) {
                set.remove(this.A02);
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
    }
}
