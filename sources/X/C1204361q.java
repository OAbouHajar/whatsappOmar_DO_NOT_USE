package X;

import java.util.Map;

/* renamed from: X.61q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1204361q implements AnonymousClass5Q9 {
    public final /* synthetic */ AnonymousClass1WD A00;
    public final /* synthetic */ C1220968g A01;
    public final /* synthetic */ C118205uJ A02;

    public /* synthetic */ C1204361q(AnonymousClass1WD r1, C1220968g r2, C118205uJ r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void ARR(Map map) {
        Boolean bool;
        C118205uJ r0 = this.A02;
        AnonymousClass1WD r4 = this.A00;
        C1220968g r3 = this.A01;
        r0.A01.A01.A0I.remove("PaymentData");
        if (map == null) {
            C110105dW.A1O("BrazilVerifyCardPhoenixHelper", "startVerifyCardPhoenixFlow :: terminalParams is null");
        } else {
            Object obj = map.get(C795940l.A00.key);
            if (obj instanceof AnonymousClass4W3) {
                r3.ARQ((int) ((AnonymousClass4W3) obj).A00);
            } else if (obj instanceof Map) {
                r3.ARQ(AnonymousClass000.A0D(((Map) obj).get(C796140n.ERROR_CODE.key)));
                return;
            } else {
                r3.ARQ(0);
                bool = Boolean.TRUE;
                r4.A02(bool);
            }
        }
        bool = Boolean.FALSE;
        r4.A02(bool);
    }
}
