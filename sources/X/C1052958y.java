package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.58y  reason: invalid class name and case insensitive filesystem */
public final class C1052958y implements AnonymousClass22G {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ AnonymousClass22G A01;

    public C1052958y(Comparator comparator, AnonymousClass22G r2) {
        this.A01 = r2;
        this.A00 = comparator;
    }

    public Iterator iterator() {
        List A02 = C11490ir.A02(this.A01);
        C003301l.A0L(A02, this.A00);
        return A02.iterator();
    }
}
