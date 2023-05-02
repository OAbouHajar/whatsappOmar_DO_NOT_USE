package X;

import com.facebook.redex.IDxCallbackShape65S0200000_3_I1;
import java.util.Map;

/* renamed from: X.61o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1204161o implements AnonymousClass5Q9 {
    public final /* synthetic */ AnonymousClass1WD A00;
    public final /* synthetic */ C112085hv A01;

    public /* synthetic */ C1204161o(AnonymousClass1WD r1, C112085hv r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void ARR(Map map) {
        Boolean bool;
        C112085hv r6 = this.A01;
        AnonymousClass1WD r5 = this.A00;
        r6.A07.A01.A0I.remove("BRMerchantData");
        if (map == null) {
            C110105dW.A1O("BrazilPaymentMerchantHelper", "triggerMerchantOnboarding :: terminalParams is null");
            bool = Boolean.FALSE;
        } else {
            Object obj = map.get(C795940l.A00.key);
            if (obj instanceof AnonymousClass4W3) {
                if (489 == ((AnonymousClass4W3) obj).A00) {
                    r6.A03.A08(new IDxCallbackShape65S0200000_3_I1(r5, 0, r6));
                } else {
                    r5.A02(Boolean.FALSE);
                }
            }
            bool = Boolean.TRUE;
        }
        r5.A02(bool);
    }
}
