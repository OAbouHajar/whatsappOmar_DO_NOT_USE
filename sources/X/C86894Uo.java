package X;

import com.facebook.redex.IDxNFunctionShape43S0200000_2_I1;

/* renamed from: X.4Uo  reason: invalid class name and case insensitive filesystem */
public final class C86894Uo {
    public final C28371Vv A00;
    public final AnonymousClass5NI A01;
    public final C86764Ub A02;
    public final Long A03;

    public C86894Uo(C16300so r15, C28371Vv r16, AnonymousClass38K r17) {
        C28371Vv r7 = r16;
        AnonymousClass3K3.A1G(r7);
        C28371Vv r4 = r17.A00;
        this.A03 = (Long) C32271fx.A00((C16300so) null, r7, Long.class, AnonymousClass3K2.A0a(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"error", "backoff"}, false);
        this.A02 = (C86764Ub) C32271fx.A03(r7, new IDxNFunctionShape43S0200000_2_I1(r15, r4, 14), new String[0]);
        C32261fw[] r3 = new C32261fw[3];
        r3[0] = AnonymousClass3K3.A0X(r15, 148);
        r3[1] = AnonymousClass3K3.A0X(r15, 150);
        this.A01 = (AnonymousClass5NI) C32271fx.A04(r7, "IQErrorRateOverlimit|IQErrorInternalServerError|IQErrorServiceUnavailable", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r15, 149), r3, 2), new String[]{"error"});
        this.A00 = r7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86894Uo.class != obj.getClass()) {
                return false;
            }
            C86894Uo r5 = (C86894Uo) obj;
            if (!C34901l3.A00(this.A03, r5.A03) || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A03;
        objArr[1] = this.A02;
        return AnonymousClass000.A0F(this.A01, objArr, 2);
    }
}
