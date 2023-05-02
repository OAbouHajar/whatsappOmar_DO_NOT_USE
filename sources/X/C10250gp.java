package X;

import java.util.List;

/* renamed from: X.0gp  reason: invalid class name and case insensitive filesystem */
public class C10250gp implements Runnable {
    public final /* synthetic */ C02790Ey A00;
    public final /* synthetic */ AnonymousClass0S3 A01;
    public final /* synthetic */ List A02;

    public C10250gp(C02790Ey r1, AnonymousClass0S3 r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public void run() {
        List list = this.A02;
        AnonymousClass0S3 r2 = this.A01;
        if (list.contains(r2)) {
            list.remove(r2);
            r2.A01.A02(r2.A04.A0A);
        }
    }
}
