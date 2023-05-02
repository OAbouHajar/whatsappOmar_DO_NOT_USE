package com.google.android.material.bottomsheet;

import X.AnonymousClass3K4;
import X.C54882iQ;
import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.whatsapp.stickers.store.StickerStoreActivity;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;

public class IDxSCallbackShape46S0100000_2_I1 extends C54882iQ {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape46S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static void A00(IDxSCallbackShape46S0100000_2_I1 iDxSCallbackShape46S0100000_2_I1, int i2) {
        if (i2 == 4 || i2 == 5) {
            AnonymousClass3K4.A0z(iDxSCallbackShape46S0100000_2_I1.A00);
        }
    }

    public void A01(View view, float f2) {
    }

    public void A02(View view, int i2) {
        switch (this.A01) {
            case 0:
                if (i2 == 5) {
                    ((Dialog) this.A00).cancel();
                    return;
                }
                return;
            case 1:
                A00(this, i2);
                return;
            case 3:
                if (i2 == 5 || i2 == 4) {
                    AnonymousClass3K4.A0j((Activity) this.A00);
                    return;
                } else if (i2 == 3) {
                    StickerStoreActivity stickerStoreActivity = (StickerStoreActivity) this.A00;
                    StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = stickerStoreActivity.A06;
                    if (stickerStoreFeaturedTabFragment != null) {
                        stickerStoreFeaturedTabFragment.A1B();
                    }
                    StickerStoreMyTabFragment stickerStoreMyTabFragment = stickerStoreActivity.A07;
                    if (stickerStoreMyTabFragment != null) {
                        stickerStoreMyTabFragment.A1B();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                if (i2 == 4 || i2 == 5) {
                    AnonymousClass3K4.A0z(this.A00);
                    return;
                }
                return;
        }
    }
}
