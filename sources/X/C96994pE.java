package X;

import android.util.SparseArray;

/* renamed from: X.4pE  reason: invalid class name and case insensitive filesystem */
public class C96994pE implements AnonymousClass5RA {
    public final C90204dh A00 = new C90204dh(new byte[4], 4);
    public final /* synthetic */ C96514oS A01;

    public C96994pE(C96514oS r4) {
        this.A01 = r4;
    }

    public void A6b(C90504eH r10) {
        if (r10.A0C() == 0 && (r10.A0C() & 128) != 0) {
            r10.A0T(6);
            int A002 = C90504eH.A00(r10) / 4;
            for (int i2 = 0; i2 < A002; i2++) {
                C90204dh r2 = this.A00;
                r10.A0V(r2.A03, 0, 4);
                r2.A07(0);
                int A04 = r2.A04(16);
                r2.A08(3);
                if (A04 == 0) {
                    r2.A08(13);
                } else {
                    int A042 = r2.A04(13);
                    C96514oS r3 = this.A01;
                    SparseArray sparseArray = r3.A08;
                    if (sparseArray.get(A042) == null) {
                        sparseArray.put(A042, new C97034pI(new C97014pG(r3, A042)));
                        r3.A02++;
                    }
                }
            }
            this.A01.A08.remove(0);
        }
    }

    public void AI2(C15060qG r1, AnonymousClass4WV r2, AnonymousClass4X5 r3) {
    }
}
