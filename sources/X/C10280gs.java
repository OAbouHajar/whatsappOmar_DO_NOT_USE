package X;

/* renamed from: X.0gs  reason: invalid class name and case insensitive filesystem */
public class C10280gs implements Runnable {
    public final /* synthetic */ C10290gt A00;
    public final /* synthetic */ C29981bY A01;
    public final /* synthetic */ String A02;

    public C10280gs(C10290gt r1, C29981bY r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public void run() {
        C10290gt r2 = this.A00;
        r2.A01.A03.remove(this.A02);
        C29981bY r1 = this.A01;
        if (!r1.isCancelled()) {
            try {
                r1.get();
            } catch (Exception e2) {
                r2.A00.A06(e2);
            }
        }
    }
}
