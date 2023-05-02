package X;

import android.util.Pair;

/* renamed from: X.1qq  reason: invalid class name and case insensitive filesystem */
public class C38471qq extends C16690tT {
    public final C20080zT A00;
    public final C38251qU A01;
    public final AnonymousClass1CX A02;

    public C38471qq(C20080zT r1, C38251qU r2, AnonymousClass1CX r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Pair[] pairArr = (Pair[]) objArr;
        AnonymousClass00B.A06(pairArr);
        Pair pair = pairArr[0];
        AnonymousClass00B.A06(pair);
        AnonymousClass1CX r2 = this.A02;
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        return r2.A02(this.A01, (String) pair.first, booleanValue);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C37771pi r3 = (C37771pi) obj;
        if (r3 != null) {
            C20080zT r0 = this.A00;
            r3.A05 = r0.A01.containsKey(r3.A0F);
            this.A01.AXo(r3);
        }
    }
}
