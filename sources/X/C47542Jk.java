package X;

/* renamed from: X.2Jk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C47542Jk implements Runnable {
    public final /* synthetic */ C43241zg A00;
    public final /* synthetic */ AnonymousClass1HE A01;
    public final /* synthetic */ AnonymousClass1XP A02;
    public final /* synthetic */ AnonymousClass1XJ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ byte[] A08;

    public /* synthetic */ C47542Jk(C43241zg r1, AnonymousClass1HE r2, AnonymousClass1XP r3, AnonymousClass1XJ r4, byte[] bArr, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z2;
        this.A05 = z3;
        this.A03 = r4;
        this.A06 = z4;
        this.A07 = z5;
        this.A08 = bArr;
    }

    public final void run() {
        AnonymousClass21C r6;
        AnonymousClass211 r1;
        AnonymousClass1HE r2 = this.A01;
        AnonymousClass1XP r12 = this.A02;
        C43241zg r9 = this.A00;
        boolean z2 = this.A04;
        boolean z3 = this.A05;
        AnonymousClass1XJ r13 = this.A03;
        boolean z4 = this.A06;
        boolean z5 = this.A07;
        byte[] bArr = this.A08;
        if (r12 != null) {
            Number number = (Number) r12.A0A.A00();
            if (!r12.A02 && (number == null || number.intValue() == 0)) {
                if (r12.A0U == null) {
                    r2.A03(r9, r12, z2, z3);
                    C43251zh r3 = r12.A0K;
                    AnonymousClass00B.A06(r3);
                    synchronized (r3) {
                        if (!r3.A0D) {
                            r3.A08 = 0;
                        } else if (!r3.A0C) {
                            r3.A08 = 3;
                        } else {
                            r3.A08 = 2;
                        }
                    }
                    AnonymousClass00B.A06(r3);
                    r3.A02();
                    r2.A0D.A07(r12);
                    return;
                }
                r2.A03(r9, r12, z2, z3);
                return;
            }
        }
        AnonymousClass1XL A012 = AnonymousClass1XL.A01(r2.A02, r9, r2.A09, r2.A0H, r2.A0I, r13, z4);
        C18220wL r5 = r2.A0D;
        AnonymousClass1XP A042 = r5.A04(A012, z5);
        r2.A03(r9, A042, z2, z3);
        if (!(r12 == null || (r6 = (AnonymousClass21C) r12.A0D.A00()) == null || !r6.A02)) {
            Object A002 = r12.A08.A00();
            if (A002 != null) {
                A042.A08.A04(A002);
            }
            A042.A0D.A04(r6);
            C43251zh r22 = r12.A0K;
            AnonymousClass00B.A06(r22);
            synchronized (r22) {
                r1 = r22.A04;
            }
            if (r1 != null) {
                C43251zh r0 = A042.A0K;
                AnonymousClass00B.A06(r0);
                r0.A05(r1);
            }
        }
        if (r5.A0E(A042.A01().A05, A042.A00().A0E, A042.A0L.A02.A01)) {
            A042.A03 = bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r9.A01());
        sb.append("; action_params: ");
        sb.append(r13);
        r5.A0D(A042, sb.toString());
    }
}
