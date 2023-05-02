package com.whatsapp.util;

import X.AnonymousClass1CX;
import X.AnonymousClass1ML;
import X.AnonymousClass33c;
import X.AnonymousClass35B;
import X.AnonymousClass35I;
import X.C001100m;
import X.C13680ns;
import X.C13690nt;
import X.C15830rv;
import X.C16030sJ;
import X.C16690tT;
import X.C20080zT;
import X.C34331k5;
import X.C606734v;
import X.C62063Bm;
import X.C74983rQ;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.obwhatsapp.shops.ShopsProductPreviewFragment;
import com.obwhatsapp.shops.ShopsProductPreviewFragmentViewModel;
import com.obwhatsapp.status.audienceselector.StatusPrivacyActivity;
import com.obwhatsapp.twofactor.SetCodeFragment;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;

public class ViewOnClickCListenerShape6S0100000_I1_2 extends C34331k5 {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape6S0100000_I1_2(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A06(View view) {
        C001100m r5;
        Intent A09;
        int i2;
        switch (this.A01) {
            case 2:
                ShopsProductPreviewFragment shopsProductPreviewFragment = (ShopsProductPreviewFragment) this.A00;
                shopsProductPreviewFragment.A03.Act(shopsProductPreviewFragment.A0D(), Uri.parse(shopsProductPreviewFragment.A09));
                ShopsProductPreviewFragmentViewModel shopsProductPreviewFragmentViewModel = shopsProductPreviewFragment.A06;
                if (shopsProductPreviewFragmentViewModel.A01.A00()) {
                    C74983rQ r1 = new C74983rQ();
                    r1.A01 = C13680ns.A0a();
                    r1.A00 = C13680ns.A0Y();
                    shopsProductPreviewFragmentViewModel.A00.A06(r1);
                    return;
                }
                return;
            case 3:
                ((StatusPrivacyActivity) this.A00).A01.setChecked(true);
                return;
            case 4:
                r5 = (C001100m) this.A00;
                A09 = C13680ns.A09();
                A09.setClassName(r5.getPackageName(), "com.obwhatsapp.status.audienceselector.StatusRecipientsActivity");
                A09.putExtra("is_black_list", true);
                i2 = 0;
                break;
            case 5:
                C001100m r4 = (C001100m) this.A00;
                Intent A092 = C13680ns.A09();
                A092.setClassName(r4.getPackageName(), "com.obwhatsapp.status.audienceselector.StatusRecipientsActivity");
                A092.putExtra("is_black_list", false);
                r4.startActivityForResult(A092, 0);
                return;
            case 6:
                C606734v r0 = (C606734v) this.A00;
                r0.A04();
                r0.A0C();
                return;
            case 7:
                ((AnonymousClass33c) this.A00).A04();
                return;
            case 8:
                AnonymousClass35B r02 = (AnonymousClass35B) this.A00;
                AnonymousClass1CX r12 = r02.A06;
                String str = r02.A04.A0F;
                C20080zT r13 = r12.A0L;
                if (r13.A01.containsKey(str)) {
                    C13680ns.A1T((C16690tT) r13.A00.get(str));
                    return;
                }
                return;
            case 9:
                StickerStoreMyTabFragment stickerStoreMyTabFragment = ((AnonymousClass35I) this.A00).A00;
                AnonymousClass1ML.A01(stickerStoreMyTabFragment.A02, "sticker_store_my_stickers", C13690nt.A0h(stickerStoreMyTabFragment.A0D()));
                return;
            case 10:
                SetCodeFragment.A02((SetCodeFragment) this.A00);
                return;
            default:
                r5 = (C001100m) this.A00;
                C15830rv A03 = C62063Bm.A03(r5.getIntent());
                A09 = C13680ns.A09().setClassName(r5.getPackageName(), "com.obwhatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity");
                C16030sJ.A0B(A09, A03);
                i2 = 199;
                break;
        }
        r5.startActivityForResult(A09, i2);
    }
}
