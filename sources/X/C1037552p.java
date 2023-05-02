package X;

import java.util.Iterator;

/* renamed from: X.52p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1037552p implements AnonymousClass1WE {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1KM A01;

    public /* synthetic */ C1037552p(AnonymousClass1KM r1, long j2) {
        this.A01 = r1;
        this.A00 = j2;
    }

    public final void accept(Object obj) {
        AnonymousClass1KM r9 = this.A01;
        long j2 = this.A00;
        long A012 = C13700nu.A01(obj);
        int i2 = (int) ((((double) A012) * 100.0d) / ((double) j2));
        if (i2 >= r9.A00 + 1) {
            r9.A00 = i2;
            Iterator A002 = C16590tJ.A00(r9.A03.A00);
            while (A002.hasNext()) {
                ((AnonymousClass12S) A002.next()).ANH(A012, j2);
            }
        }
    }
}
