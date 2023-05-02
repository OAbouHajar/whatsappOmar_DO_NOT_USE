package X;

import java.util.Comparator;

/* renamed from: X.2A7  reason: invalid class name */
public class AnonymousClass2A7 implements Comparator {
    public C16000sG A00;
    public AnonymousClass2BZ A01;

    public AnonymousClass2A7(C16040sK r3, C16000sG r4, C16080sP r5) {
        this.A00 = r4;
        this.A01 = new AnonymousClass2BZ(r3, r5, true);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C39721sx r5 = (C39721sx) obj2;
        C16000sG r1 = this.A00;
        C16010sH A08 = r1.A08(((C39721sx) obj).A06);
        if (A08 == null) {
            return 1;
        }
        C16010sH A082 = r1.A08(r5.A06);
        if (A082 == null) {
            return -1;
        }
        return this.A01.compare(A08, A082);
    }
}
