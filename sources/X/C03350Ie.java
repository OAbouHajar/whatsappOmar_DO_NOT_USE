package X;

/* renamed from: X.0Ie  reason: invalid class name and case insensitive filesystem */
public class C03350Ie extends C10670hV {
    public final /* synthetic */ AnonymousClass09W A00;

    public C03350Ie(AnonymousClass09W r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass09W r2 = this.A00;
        if (r2.A0U != null) {
            while (true) {
                C12830l2 r1 = (C12830l2) r2.A0U.poll();
                if (r1 != null) {
                    r1.ATJ(r2.A0M);
                } else {
                    r2.A0U = null;
                    return;
                }
            }
        }
    }
}
