package X;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: X.0hw  reason: invalid class name and case insensitive filesystem */
public final class C10940hw implements Consumer {
    public final AnonymousClass0XM A00;
    public final C12010jh A01;

    public C10940hw(AnonymousClass0XM r1, C12010jh r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* renamed from: A00 */
    public void accept(List list) {
        C18450wi.A0H(list, 0);
        C12010jh r1 = this.A01;
        List A0A = this.A00.A0A(list);
        C07890cf r12 = (C07890cf) r1;
        r12.A00 = A0A;
        Iterator it = r12.A01.A02.iterator();
        while (it.hasNext()) {
            ((C05130Pk) it.next()).A00(A0A);
        }
    }
}
