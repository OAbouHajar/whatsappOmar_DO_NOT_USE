package X;

/* renamed from: X.1HQ  reason: invalid class name */
public class AnonymousClass1HQ {
    public final C16040sK A00;
    public final C26481Nw A01;

    public AnonymousClass1HQ(C16040sK r1, C26481Nw r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(C35361lo r10, C16740tZ r11) {
        AnonymousClass1Vt r0 = r11.A0L;
        if (r0 != null) {
            String A03 = AnonymousClass1W1.A03(r0.A03);
            if ("p2p".equals(A03) || "p2m".equals(A03)) {
                C26481Nw r5 = this.A01;
                boolean z2 = false;
                if (r10 != null) {
                    z2 = true;
                }
                boolean z3 = r11 instanceof C38641rB;
                synchronized (r5) {
                    AnonymousClass1Nx r6 = r5.A01;
                    C47382Is A002 = r6.A00();
                    A002.A05++;
                    if (z2) {
                        A002.A0A++;
                    }
                    if (z3) {
                        A002.A0B++;
                        if (z2) {
                            A002.A09++;
                        }
                    }
                    r6.A01(A002);
                }
            }
        }
    }
}
