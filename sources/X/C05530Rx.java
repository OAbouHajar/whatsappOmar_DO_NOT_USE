package X;

/* renamed from: X.0Rx  reason: invalid class name and case insensitive filesystem */
public class C05530Rx {
    public final AnonymousClass00N A00 = new AnonymousClass00N();
    public final AnonymousClass03G A01 = new AnonymousClass03G();

    public void A00(AnonymousClass0O0 r4, C005602k r5) {
        AnonymousClass00N r2 = this.A00;
        AnonymousClass0U1 r1 = (AnonymousClass0U1) r2.get(r5);
        if (r1 == null) {
            r1 = (AnonymousClass0U1) AnonymousClass0U1.A03.A4T();
            if (r1 == null) {
                r1 = new AnonymousClass0U1();
            }
            r2.put(r5, r1);
        }
        r1.A01 = r4;
        r1.A00 |= 8;
    }

    public void A01(AnonymousClass0O0 r4, C005602k r5) {
        AnonymousClass00N r2 = this.A00;
        AnonymousClass0U1 r1 = (AnonymousClass0U1) r2.get(r5);
        if (r1 == null) {
            r1 = (AnonymousClass0U1) AnonymousClass0U1.A03.A4T();
            if (r1 == null) {
                r1 = new AnonymousClass0U1();
            }
            r2.put(r5, r1);
        }
        r1.A02 = r4;
        r1.A00 |= 4;
    }

    public void A02(C005602k r4) {
        AnonymousClass00N r2 = this.A00;
        AnonymousClass0U1 r1 = (AnonymousClass0U1) r2.get(r4);
        if (r1 == null) {
            r1 = (AnonymousClass0U1) AnonymousClass0U1.A03.A4T();
            if (r1 == null) {
                r1 = new AnonymousClass0U1();
            }
            r2.put(r4, r1);
        }
        r1.A00 |= 1;
    }

    public void A03(C005602k r3) {
        AnonymousClass0U1 r1 = (AnonymousClass0U1) this.A00.get(r3);
        if (r1 != null) {
            r1.A00 &= -2;
        }
    }

    public void A04(C005602k r6) {
        AnonymousClass03G r4 = this.A01;
        int A002 = r4.A00();
        while (true) {
            A002--;
            if (A002 < 0) {
                break;
            } else if (r6 == r4.A03(A002)) {
                Object[] objArr = r4.A03;
                Object obj = objArr[A002];
                Object obj2 = AnonymousClass03G.A04;
                if (obj != obj2) {
                    objArr[A002] = obj2;
                    r4.A01 = true;
                }
            }
        }
        AnonymousClass0U1 r1 = (AnonymousClass0U1) this.A00.remove(r6);
        if (r1 != null) {
            r1.A00 = 0;
            r1.A02 = null;
            r1.A01 = null;
            AnonymousClass0U1.A03.Abi(r1);
        }
    }
}
