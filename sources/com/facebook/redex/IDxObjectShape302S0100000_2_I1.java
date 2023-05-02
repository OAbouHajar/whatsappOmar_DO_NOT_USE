package com.facebook.redex;

import X.AnonymousClass2FZ;
import X.AnonymousClass2Fa;
import X.C47812Kr;
import androidx.viewpager.widget.ViewPager;
import com.obwhatsapp.picker.search.StickerSearchDialogFragment;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;
import com.whatsapp.stickers.store.StickerStoreActivity;

public class IDxObjectShape302S0100000_2_I1 implements AnonymousClass2Fa, AnonymousClass2FZ {
    public Object A00;
    public final int A01;

    public IDxObjectShape302S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AYi(C47812Kr r1) {
    }

    public void AYj(C47812Kr r4) {
        ViewPager viewPager;
        switch (this.A01) {
            case 0:
                StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A00;
                stickerSearchDialogFragment.A05.A03();
                viewPager = stickerSearchDialogFragment.A03;
                break;
            case 1:
                ExpressionsSearchDialogFragment expressionsSearchDialogFragment = (ExpressionsSearchDialogFragment) this.A00;
                expressionsSearchDialogFragment.A03.A03();
                expressionsSearchDialogFragment.A04.setCurrentItem(r4.A00);
                expressionsSearchDialogFragment.A1O(r4.A00);
                return;
            default:
                viewPager = ((StickerStoreActivity) this.A00).A01;
                break;
        }
        viewPager.setCurrentItem(r4.A00);
    }
}
