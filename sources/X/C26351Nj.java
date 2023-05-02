package X;

import java.util.ArrayList;

/* renamed from: X.1Nj  reason: invalid class name and case insensitive filesystem */
public final class C26351Nj implements C18540wr {
    public final C16000sG A00;
    public final AnonymousClass01V A01;
    public final C16260sj A02;

    public C26351Nj(C16000sG r2, AnonymousClass01V r3, C16260sj r4) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void AUu(C75983t2 r3) {
        C18450wi.A0H(r3, 0);
        Integer A002 = AnonymousClass46T.A00(this.A01, this.A02);
        if (A002 != null) {
            r3.A0b = Long.valueOf((long) A002.intValue());
        }
        ArrayList arrayList = new ArrayList();
        this.A00.A0U(arrayList);
        r3.A0c = Long.valueOf((long) arrayList.size());
    }
}
