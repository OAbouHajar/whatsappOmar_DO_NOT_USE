package X;

import com.obwhatsapp.search.SearchViewModel;

/* renamed from: X.3tc  reason: invalid class name and case insensitive filesystem */
public class C76253tc extends C55982kl {
    public final SearchViewModel A00;
    public final C71403kJ A01;

    public C76253tc(SearchViewModel searchViewModel, C71403kJ r2) {
        super(r2);
        this.A01 = r2;
        this.A00 = searchViewModel;
    }

    public void A09() {
        this.A01.A03();
    }

    public void A0A(boolean z2) {
        this.A01.setScrolling(z2);
    }

    public void A0B(boolean z2) {
        this.A01.setShouldPlay(z2);
    }

    public boolean A0C() {
        return this.A01.A05();
    }
}
