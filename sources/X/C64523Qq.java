package X;

import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.catalogcategory.view.CategoryThumbnailLoader;

/* renamed from: X.3Qq  reason: invalid class name and case insensitive filesystem */
public final class C64523Qq extends AnonymousClass01W {
    public final CategoryThumbnailLoader A00;
    public final AnonymousClass22J A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64523Qq(CategoryThumbnailLoader categoryThumbnailLoader, AnonymousClass22J r3) {
        super((AnonymousClass0Q5) AnonymousClass3QZ.A00);
        C18450wi.A0H(categoryThumbnailLoader, 1);
        this.A00 = categoryThumbnailLoader;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        C65043Sq r22 = (C65043Sq) r2;
        C18450wi.A0H(r22, 0);
        Object A0E = A0E(i2);
        C18450wi.A0B(A0E);
        r22.A07((C82584Dj) A0E);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        if (i2 == 0) {
            return new C73203nT(AnonymousClass3K4.A0K(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout038e), this.A00, this.A01);
        }
        if (i2 == 1) {
            return new C73163nP(AnonymousClass3K4.A0K(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0395));
        }
        if (i2 == 6) {
            return new C73183nR(AnonymousClass3K4.A0K(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0389), this.A01);
        }
        if (i2 == 7) {
            return new C73153nO(AnonymousClass3K4.A0K(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout02f1));
        }
        throw AnonymousClass000.A0T(C18450wi.A06("Invalid item viewtype: ", Integer.valueOf(i2)));
    }

    public int getItemViewType(int i2) {
        return ((C82584Dj) A0E(i2)).A00;
    }
}
