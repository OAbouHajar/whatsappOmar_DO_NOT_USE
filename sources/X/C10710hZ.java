package X;

import java.util.Comparator;

/* renamed from: X.0hZ  reason: invalid class name and case insensitive filesystem */
public class C10710hZ implements Comparator {
    public final /* synthetic */ C09040eo A00;
    public final /* synthetic */ C14960q4 A01;
    public final /* synthetic */ C14930q1 A02;

    public C10710hZ(C09040eo r1, C14960q4 r2, C14930q1 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public int compare(Object obj, Object obj2) {
        C14930q1 r3 = this.A02;
        C14940q2 r1 = new C14940q2();
        r1.A03(obj, 0);
        r1.A03(obj2, 1);
        Object A002 = C14980q6.A00(this.A01, r1.A01(), r3);
        if (A002 instanceof Integer) {
            return AnonymousClass000.A0D(A002);
        }
        C29691b2.A00("bk.action.array.SortedArray", "Got non-integer result while evaluating comparator predicate");
        return 0;
    }
}
