package X;

/* renamed from: X.1zo  reason: invalid class name and case insensitive filesystem */
public class C43321zo implements Runnable, Comparable, C30721cq {
    public final Object A00;
    public final Object A01;
    public final Runnable A02;
    public volatile boolean A03 = false;
    public final /* synthetic */ C18240wN A04;

    public C43321zo(C18240wN r2, Object obj, Object obj2, Runnable runnable) {
        this.A04 = r2;
        this.A01 = obj;
        this.A02 = runnable;
        this.A00 = obj2;
    }

    public void cancel() {
        Runnable runnable = this.A02;
        if (runnable instanceof C30721cq) {
            ((C30721cq) runnable).cancel();
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C43321zo r3 = (C43321zo) obj;
        Runnable runnable = this.A02;
        if (runnable instanceof Comparable) {
            return ((Comparable) runnable).compareTo(r3.A02);
        }
        return 0;
    }

    public void run() {
        try {
            this.A03 = true;
            this.A02.run();
        } finally {
            this.A04.A04(this, this.A01);
            this.A03 = false;
        }
    }
}
