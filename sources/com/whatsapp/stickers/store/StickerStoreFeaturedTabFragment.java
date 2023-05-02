package com.whatsapp.stickers.store;

import X.AnonymousClass071;
import X.AnonymousClass1CX;
import X.AnonymousClass35H;
import X.C13680ns;
import X.C16490t9;
import X.C19980zJ;
import X.C211613a;
import X.C37771pi;
import X.C55522jm;
import android.view.View;
import com.facebook.redex.IDxSListenerShape35S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import java.util.List;

public class StickerStoreFeaturedTabFragment extends Hilt_StickerStoreFeaturedTabFragment {
    public View A00;
    public View A01;
    public C19980zJ A02;
    public C16490t9 A03;
    public C211613a A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass071 A07 = new IDxSListenerShape35S0100000_2_I1(this, 8);

    public static /* synthetic */ void A01(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        C55522jm r0 = stickerStoreFeaturedTabFragment.A0H;
        List list = stickerStoreFeaturedTabFragment.A0I;
        if (r0 == null) {
            stickerStoreFeaturedTabFragment.A1I(new AnonymousClass35H(stickerStoreFeaturedTabFragment, list));
            return;
        }
        r0.A00 = list;
        r0.A01();
    }

    public static /* synthetic */ boolean A02(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        return !stickerStoreFeaturedTabFragment.A06.A0G() && stickerStoreFeaturedTabFragment.A1L() && !stickerStoreFeaturedTabFragment.A09.A01();
    }

    public void A12() {
        this.A04.A00(3);
        super.A12();
    }

    public void A1E() {
        super.A1E();
        View view = this.A02;
        if (view != null) {
            view.setVisibility(C13680ns.A02(this.A06 ? 1 : 0));
        }
    }

    public void A1H(C37771pi r5, int i2) {
        super.A1H(r5, i2);
        r5.A06 = false;
        this.A0H.A02(i2);
        AnonymousClass1CX r3 = this.A0F;
        r3.A0Y.Acl(new RunnableRunnableShape10S0200000_I0_8(r3, 42, r5));
    }
}
