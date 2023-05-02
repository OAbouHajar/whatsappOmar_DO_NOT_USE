package X;

import java.util.ArrayList;

/* renamed from: X.3n6  reason: invalid class name and case insensitive filesystem */
public class C72993n6 extends AnonymousClass57B {
    public final C16080sP A00;
    public final ArrayList A01;

    public C72993n6(C16000sG r1, C16080sP r2, ArrayList arrayList) {
        super(r1, r2);
        this.A00 = r2;
        this.A01 = arrayList;
    }

    public int A00(C38581r1 r6, C38581r1 r7) {
        C16000sG r2 = this.A00;
        C16010sH A0A = r2.A0A(r6.A02);
        C16010sH A0A2 = r2.A0A(r7.A02);
        C16080sP r3 = this.A00;
        ArrayList arrayList = this.A01;
        boolean A0T = r3.A0T(A0A, arrayList, true);
        return A0T != r3.A0T(A0A2, arrayList, true) ? A0T ? -1 : 1 : super.compare(r6, r7);
    }
}
