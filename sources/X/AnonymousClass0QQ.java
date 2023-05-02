package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0QQ  reason: invalid class name */
public class AnonymousClass0QQ {
    public static int A03;
    public C07250ar A00;
    public C07250ar A01 = null;
    public ArrayList A02 = AnonymousClass000.A0u();

    public AnonymousClass0QQ(C07250ar r2) {
        A03++;
        this.A00 = r2;
        this.A01 = r2;
    }

    public final long A00(C07240aq r10, long j2) {
        C07250ar r4 = r10.A06;
        if (r4 instanceof AnonymousClass0Dt) {
            return j2;
        }
        List list = r10.A07;
        int size = list.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            C12360kG r8 = (C12360kG) list.get(i2);
            if (r8 instanceof C07240aq) {
                C07240aq r82 = (C07240aq) r8;
                if (r82.A06 != r4) {
                    j3 = Math.min(j3, A00(r82, ((long) r82.A00) + j2));
                }
            }
        }
        if (r10 != r4.A04) {
            return j3;
        }
        long A0A = r4.A0A();
        C07240aq r42 = r4.A05;
        long j4 = j2 - A0A;
        return Math.min(Math.min(j3, A00(r42, j4)), j4 - ((long) r42.A00));
    }

    public final long A01(C07240aq r10, long j2) {
        C07250ar r4 = r10.A06;
        if (r4 instanceof AnonymousClass0Dt) {
            return j2;
        }
        List list = r10.A07;
        int size = list.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            C12360kG r8 = (C12360kG) list.get(i2);
            if (r8 instanceof C07240aq) {
                C07240aq r82 = (C07240aq) r8;
                if (r82.A06 != r4) {
                    j3 = Math.max(j3, A01(r82, ((long) r82.A00) + j2));
                }
            }
        }
        if (r10 != r4.A05) {
            return j3;
        }
        long A0A = r4.A0A();
        C07240aq r42 = r4.A04;
        long j4 = j2 + A0A;
        return Math.max(Math.max(j3, A01(r42, j4)), j4 - ((long) r42.A00));
    }
}
