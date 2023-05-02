package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.1kJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C34461kJ implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C19440yR A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C34461kJ(C19440yR r1, List list, long j2) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = j2;
    }

    public final void run() {
        C19440yR r0 = this.A01;
        List<C28381Vw> list = this.A02;
        long j2 = this.A00;
        for (C28381Vw r2 : list) {
            C16460t6 r5 = r0.A0O;
            C16740tZ A03 = r5.A0K.A03(r2);
            if (A03 != null || (A03 = r0.A0S.A04(r2)) != null) {
                Set A002 = r0.A0R.A00(A03.A11);
                r0.A06.A0I(A03, 4, A03 instanceof C38541qx ? 1 : r5.A07(A03), C16030sJ.A0A(r0.A02, A002).size(), A002.size(), 0, 0, j2 - A03.A0I, false, false, false, false);
            }
        }
    }
}
