package com.obwhatsapp.gallery;

import X.AnonymousClass00B;
import X.AnonymousClass1YG;
import X.AnonymousClass2BE;
import X.AnonymousClass2BF;
import X.AnonymousClass2DW;
import X.C001000l;
import X.C004601z;
import X.C15830rv;
import X.C16460t6;
import X.C16480t8;
import X.C16730tY;
import X.C18940xV;
import X.C19150xq;
import X.C25791Ld;
import X.C42391xi;
import X.C54502hd;
import android.os.Bundle;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.obwhatsapp.scroller.RecyclerFastScroller;

public class MediaGalleryFragment extends Hilt_MediaGalleryFragment implements AnonymousClass2DW {
    public C16460t6 A00;
    public C16480t8 A01;
    public C19150xq A02;
    public C15830rv A03;
    public C25791Ld A04;
    public final C18940xV A05 = new IDxMObserverShape74S0100000_2_I0(this, 7);

    public void A0n(Bundle bundle) {
        this.A0V = true;
        C15830rv A022 = C15830rv.A02(A0D().getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A022);
        this.A03 = A022;
        C004601z.A0p(this.A08, true);
        C004601z.A0p(A06().findViewById(R.id.no_media), true);
        A1I(false);
        C001000l A0C = A0C();
        if (A0C instanceof MediaGalleryActivity) {
            this.A08.A0o(((MediaGalleryActivity) A0C).A0r);
            ((RecyclerFastScroller) this.A0A.findViewById(R.id.scroller)).setAppBarLayout((CoordinatorLayout) A0C().findViewById(R.id.coordinator), (AppBarLayout) A0C().findViewById(R.id.appbar));
        }
        this.A02.A02(this.A05);
    }

    public void A12() {
        super.A12();
        this.A02.A03(this.A05);
    }

    public boolean A1M(AnonymousClass2BF r5, C54502hd r6) {
        C16730tY r3 = ((AnonymousClass2BE) r5).A03;
        boolean A1K = A1K();
        AnonymousClass1YG r0 = (AnonymousClass1YG) A0C();
        if (A1K) {
            r6.setChecked(r0.Agy(r3));
            return true;
        }
        r0.Ag8(r3);
        r6.setChecked(true);
        return true;
    }

    public void AWn(C42391xi r1) {
    }

    public void AWv() {
        this.A06.A01();
    }
}
