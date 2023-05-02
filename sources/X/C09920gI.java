package X;

import java.util.List;

/* renamed from: X.0gI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C09920gI implements Runnable {
    public final /* synthetic */ C05130Pk A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ C09920gI(C05130Pk r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C05130Pk r0 = this.A00;
        r0.A02.accept(this.A01);
    }
}
