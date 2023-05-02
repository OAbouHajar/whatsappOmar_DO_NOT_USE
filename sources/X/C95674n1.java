package X;

/* renamed from: X.4n1  reason: invalid class name and case insensitive filesystem */
public class C95674n1 implements C12880l7 {
    public final /* synthetic */ C85004Ms A00;
    public final /* synthetic */ C95604mu A01;

    public C95674n1(C85004Ms r1, C95604mu r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Abg(Object obj) {
        boolean z2;
        C09110ev A02;
        C82064Bb r0;
        C95604mu r3 = this.A01;
        C85004Ms r4 = this.A00;
        synchronized (r3) {
            int i2 = r4.A00;
            AnonymousClass0T3.A01(AnonymousClass000.A1Q(i2));
            int i3 = i2 - 1;
            r4.A00 = i3;
            if (r4.A01 || i3 != 0) {
                z2 = false;
            } else {
                r3.A05.A03(r4.A04, r4);
                z2 = true;
            }
            A02 = r3.A02(r4);
        }
        if (A02 != null) {
            A02.close();
        }
        if (z2 && (r0 = r4.A03) != null) {
            Object obj2 = r4.A04;
            C87404Wq r1 = r0.A00;
            synchronized (r1) {
                r1.A03.add(obj2);
            }
        }
        r3.A04();
        r3.A03();
    }
}
