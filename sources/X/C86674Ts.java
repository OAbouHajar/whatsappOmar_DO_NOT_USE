package X;

import com.mod2.fblibs.FacebookFacade;

/* renamed from: X.4Ts  reason: invalid class name and case insensitive filesystem */
public final class C86674Ts {
    public final C28371Vv A00;
    public final C86984Ux A01;

    public C86674Ts(C16300so r3, C28371Vv r4) {
        Object obj;
        C28371Vv.A06(r4, FacebookFacade.RequestParameter.DESCRIPTION);
        try {
            obj = C32271fx.A03(r4, AnonymousClass3K3.A0X(r3, 82), new String[0]);
        } catch (AnonymousClass1W9 unused) {
            obj = null;
        }
        this.A01 = (C86984Ux) obj;
        this.A00 = r4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86674Ts.class != obj.getClass()) {
            return false;
        }
        return C34901l3.A00(this.A01, ((C86674Ts) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
