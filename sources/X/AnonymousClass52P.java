package X;

import com.facebook.redex.IDxBListenerShape285S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape268S0100000_2_I1;
import com.obwhatsapp.biz.catalog.view.CatalogMediaCard;

/* renamed from: X.52P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass52P implements AnonymousClass5QY {
    public final /* synthetic */ C35701mM A00;
    public final /* synthetic */ CatalogMediaCard A01;

    public /* synthetic */ AnonymousClass52P(C35701mM r1, CatalogMediaCard catalogMediaCard) {
        this.A01 = catalogMediaCard;
        this.A00 = r1;
    }

    public final void ARD(C60032zq r9, int i2) {
        CatalogMediaCard catalogMediaCard = this.A01;
        C35701mM r1 = this.A00;
        C60032zq r3 = r9;
        if (!r1.A02()) {
            r9.setTag(r1.A0D);
            catalogMediaCard.A0A.A02(r3, (C35691mL) C13690nt.A0Z(r1.A06), new IDxBListenerShape285S0100000_2_I1(r9, 1), new IDxSListenerShape268S0100000_2_I1(r9, 1), 2);
            return;
        }
        C808345t.A00(r9);
    }
}
