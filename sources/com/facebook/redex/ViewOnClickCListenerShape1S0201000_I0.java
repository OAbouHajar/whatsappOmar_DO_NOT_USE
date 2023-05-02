package com.facebook.redex;

import X.AnonymousClass37F;
import X.AnonymousClass3S2;
import X.AnonymousClass4WQ;
import X.C34151jm;
import X.C37771pi;
import X.C54612hq;
import X.C55522jm;
import X.C55552jq;
import android.view.View;
import com.obwhatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.concurrent.ConcurrentHashMap;

public class ViewOnClickCListenerShape1S0201000_I0 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickCListenerShape1S0201000_I0(Object obj, int i2, Object obj2, int i3) {
        this.A03 = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i2;
    }

    public final void onClick(View view) {
        String str;
        switch (this.A03) {
            case 0:
                C54612hq r3 = (C54612hq) this.A01;
                r3.A0E((AnonymousClass3S2) this.A02, (StorageUsageMediaGalleryFragment) r3.A05, this.A00);
                return;
            case 1:
                int i2 = this.A00;
                ((C55522jm) this.A01).A01.A1H((C37771pi) this.A02, i2);
                return;
            default:
                C55552jq r2 = (C55552jq) this.A01;
                int i3 = this.A00;
                C34151jm r6 = (C34151jm) this.A02;
                if (r2.A06 != null && !r2.A0K(i3) && ((AnonymousClass4WQ) r2.A06.get(i3)).A01) {
                    StickerView stickerView = r2.A0E;
                    if (stickerView != null && stickerView.getVisibility() == 0) {
                        r2.A0E();
                        return;
                    } else if (!r2.A0I(i3)) {
                        if (r6 != null) {
                            C37771pi r8 = r2.A04;
                            if (r8.A0N && ((r8.A02 == null || r8.A01()) && r8.A0G != null && (((str = r6.A09) == null || (!r2.A0H && r8.A01())) && (str == null || r6.A01 == 1)))) {
                                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = r2.A05.A00;
                                if (stickerStorePackPreviewActivity.A0V == null) {
                                    stickerStorePackPreviewActivity.A0V = new ConcurrentHashMap();
                                }
                                AnonymousClass37F r0 = stickerStorePackPreviewActivity.A0T;
                                if (r0 != null) {
                                    int i4 = r0.A00;
                                    r0.A06(true);
                                    stickerStorePackPreviewActivity.A0S.A0G(i4, false);
                                }
                                AnonymousClass37F r22 = new AnonymousClass37F(r8, stickerStorePackPreviewActivity, i3);
                                stickerStorePackPreviewActivity.A0T = r22;
                                stickerStorePackPreviewActivity.A05.Ack(r22, r6);
                                return;
                            }
                        }
                        r2.A0H(r6, r2.A04, i3);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
