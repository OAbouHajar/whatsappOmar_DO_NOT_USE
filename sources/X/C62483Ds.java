package X;

import java.util.List;

/* renamed from: X.3Ds  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62483Ds implements C12830l2 {
    public final /* synthetic */ C72223ll A00;
    public final /* synthetic */ C59862z9 A01;

    public /* synthetic */ C62483Ds(C72223ll r1, C59862z9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void ATJ(AnonymousClass074 r27) {
        AnonymousClass076 r1;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        C72223ll r2 = this.A00;
        C59862z9 r15 = this.A01;
        AnonymousClass074 r25 = r27;
        r25.A05();
        String str = r2.A00.A08;
        if (str.equals("country_default") || str.equals("city_default")) {
            r1 = AnonymousClass0T2.A00(r15.A09());
        } else {
            boolean z2 = false;
            List list = r2.A01;
            List list2 = list;
            for (AnonymousClass1US r14 : C003101j.A0C(list, 5)) {
                AnonymousClass020 A02 = C18450wi.A02(r14);
                if (!z2) {
                    double d6 = A02.A00;
                    d4 = d6;
                    d3 = d6;
                    double d7 = A02.A01;
                    d2 = d7;
                    d5 = d7;
                    z2 = true;
                }
                double d8 = A02.A00;
                if (d8 > d3) {
                    d3 = d8;
                } else if (d8 < d4) {
                    d4 = d8;
                }
                double d9 = d2 - d5;
                double A07 = d9 + ((double) AnonymousClass000.A07((d9 > 0.0d ? 1 : (d9 == 0.0d ? 0 : -1))));
                double d10 = A02.A01;
                double d11 = d10 - d5;
                double A072 = d11 + ((double) AnonymousClass000.A07((d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1))));
                double d12 = d2 - d10;
                double A073 = d12 + ((double) AnonymousClass000.A07((d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1))));
                if (Double.compare(A072, A07) > 0 || Double.compare(A073, A07) > 0) {
                    if (A072 <= A073) {
                        d2 = d10;
                    } else {
                        d5 = d10;
                    }
                }
                AnonymousClass074 r0 = r25;
                r0.A0B(new C57812rw(r0, r15.A08, r14));
            }
            if (!list2.isEmpty()) {
                AnonymousClass0YH r22 = new AnonymousClass0YH(new AnonymousClass020(d4, d5), new AnonymousClass020(d3, d2));
                int A002 = C87594Xo.A00(r15.A03.getContext(), 30.0f);
                r1 = new AnonymousClass076();
                r1.A07 = r22;
                r1.A05 = A002;
            } else {
                return;
            }
        }
        r25.A09(r1);
    }
}
