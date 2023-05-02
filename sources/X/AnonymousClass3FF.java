package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3FF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FF implements AnonymousClass261 {
    public final /* synthetic */ AnonymousClass4HG A00;
    public final /* synthetic */ C88204a7 A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass3FF(AnonymousClass4HG r1, C88204a7 r2, List list, boolean z2) {
        this.A01 = r2;
        this.A03 = z2;
        this.A02 = list;
        this.A00 = r1;
    }

    public final void AVc() {
        C88204a7 r6 = this.A01;
        boolean z2 = this.A03;
        List list = this.A02;
        AnonymousClass4HG r4 = this.A00;
        int size = z2 ? list.size() : 14;
        List list2 = r6.A03;
        int min = Math.min(size, Math.min(150 - list2.size(), list.size()));
        list2.addAll(list.subList(0, min));
        r6.A01 = list.subList(min, Math.min(list.size(), 150));
        ArrayList A0n = C13680ns.A0n(list2);
        AnonymousClass3FH r3 = r4.A01;
        C87314Wg r2 = r4.A00;
        AnonymousClass4P1 r1 = r3.A09;
        r1.A04 = new C87314Wg(r2.A00, r2.A01, r2.A03, r2.A02, r2.A05, r2.A04, A0n, r2.A06);
        r1.A0A |= AnonymousClass000.A1R(A0n.size(), 150);
        int i2 = 1;
        if (r1.A00 > 0) {
            i2 = 7;
        }
        r1.A02 = i2;
        r3.A05();
        if (A0n.isEmpty()) {
            r1.A02 = 6;
            r3.A05();
        } else {
            r3.A08();
            r1.A00++;
        }
        r3.A0B(r2);
        r3.A09();
    }
}
