package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0gB  reason: invalid class name and case insensitive filesystem */
public class C09850gB implements Runnable {
    public final /* synthetic */ C10420h6 A00;
    public final /* synthetic */ AnonymousClass07C A01;

    public C09850gB(C10420h6 r1, AnonymousClass07C r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C10420h6 r3 = this.A00;
        AnonymousClass0UC r2 = r3.A01;
        if (r2.A00 == r3.A00) {
            List list = r3.A02;
            AnonymousClass07C r1 = this.A01;
            r2.A01 = list;
            r2.A02 = Collections.unmodifiableList(list);
            r1.A01(r2.A04);
        }
    }
}
