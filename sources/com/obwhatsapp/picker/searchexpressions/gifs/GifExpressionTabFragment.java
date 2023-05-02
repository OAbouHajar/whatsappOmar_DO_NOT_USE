package com.obwhatsapp.picker.searchexpressions.gifs;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass3H7;
import X.AnonymousClass3R7;
import X.C108745Pe;
import X.C13680ns;
import X.C15860rz;
import X.C16490t9;
import X.C17020u3;
import X.C23061Ai;
import X.C25841Li;
import X.C76293tg;
import X.C93544jN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;

public class GifExpressionTabFragment extends Hilt_GifExpressionTabFragment implements C108745Pe {
    public AnonymousClass01V A00;
    public C15860rz A01;
    public C16490t9 A02;
    public C25841Li A03;
    public AnonymousClass3R7 A04;
    public AnonymousClass3H7 A05;
    public ExpressionSearchViewModel A06;
    public C17020u3 A07;
    public C23061Ai A08;

    public void A0q() {
        super.A0q();
        GifTabContainerLayout gifTabContainerLayout = (GifTabContainerLayout) this.A0A;
        if (gifTabContainerLayout != null) {
            WaEditText waEditText = gifTabContainerLayout.A03;
            if (waEditText != null) {
                waEditText.A04(false);
            }
            C13680ns.A1N(A0H(), this.A06.A03, this, 114);
            C13680ns.A1N(A0H(), this.A06.A09, gifTabContainerLayout, 115);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass01A r9 = this.A0D;
        if (r9 instanceof ExpressionsSearchDialogFragment) {
            ExpressionsSearchDialogFragment expressionsSearchDialogFragment = (ExpressionsSearchDialogFragment) r9;
            this.A06 = expressionsSearchDialogFragment.A08;
            C25841Li r3 = this.A03;
            this.A04 = new C76293tg(this.A00, this.A02, r3, this, this, this.A07);
            AnonymousClass3H7 r0 = expressionsSearchDialogFragment.A00;
            AnonymousClass00B.A06(r0);
            this.A05 = r0;
            GifTabContainerLayout gifTabContainerLayout = (GifTabContainerLayout) C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout027b);
            C23061Ai r10 = this.A08;
            gifTabContainerLayout.A00(A0D(), this.A01, this.A04, expressionsSearchDialogFragment, r10);
            return gifTabContainerLayout;
        }
        throw AnonymousClass000.A0a("Parent fragment of StickerTabFragment is not of type ExpressionsSearchDialogFragment");
    }

    public void ARt(C93544jN r3) {
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof ExpressionsSearchDialogFragment) {
            ((ExpressionsSearchDialogFragment) r1).A03.A03();
            AnonymousClass3H7 r0 = this.A05;
            if (r0 != null) {
                r0.ARt(r3);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0a("Parent fragment of StickerTabFragment is not of type ExpressionsSearchDialogFragment");
    }
}
