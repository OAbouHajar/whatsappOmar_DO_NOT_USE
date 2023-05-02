package X;

import java.util.List;

/* renamed from: X.0dJ  reason: invalid class name and case insensitive filesystem */
public class C08240dJ implements C13150lY, C12650kk {
    public final AnonymousClass0SI A00;
    public final AnonymousClass0SI A01;
    public final AnonymousClass0SI A02;
    public final AnonymousClass0JW A03;
    public final String A04;
    public final List A05 = AnonymousClass000.A0u();
    public final boolean A06;

    public C08240dJ(C08540do r4, C08360dV r5) {
        this.A04 = r4.A04;
        this.A06 = r4.A05;
        this.A03 = r4.A03;
        AnonymousClass0HM A002 = AnonymousClass0HC.A00(r4.A02);
        this.A02 = A002;
        AnonymousClass0HM A003 = AnonymousClass0HC.A00(r4.A00);
        this.A00 = A003;
        AnonymousClass0HM A004 = AnonymousClass0HC.A00(r4.A01);
        this.A01 = A004;
        r5.A09(A002);
        r5.A09(A003);
        r5.A09(A004);
        AnonymousClass0SI.A04(A002, this);
        AnonymousClass0SI.A04(A003, this);
        AnonymousClass0SI.A04(A004, this);
    }

    public void AZV() {
        int i2 = 0;
        while (true) {
            List list = this.A05;
            if (i2 < list.size()) {
                ((C12650kk) list.get(i2)).AZV();
                i2++;
            } else {
                return;
            }
        }
    }

    public void Adk(List list, List list2) {
    }

    public String getName() {
        return this.A04;
    }
}
