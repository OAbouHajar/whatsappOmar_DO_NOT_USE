package com.facebook.redex;

import X.AnonymousClass000;
import X.C015507l;
import X.C13690nt;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.biz.catalog.CatalogMediaViewFragment;
import com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import com.whatsapp.stickers.store.StickerStoreActivity;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

public class IDxCListenerShape273S0100000_2_I1 implements C015507l {
    public Object A00;
    public final int A01;

    public IDxCListenerShape273S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AUN(int i2) {
    }

    public void AUO(int i2, float f2, int i3) {
    }

    public void AUP(int i2) {
        switch (this.A01) {
            case 0:
                CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this.A00;
                catalogMediaViewFragment.A03.A04(catalogMediaViewFragment.A07, 30, catalogMediaViewFragment.A02.A0D, 11);
                return;
            case 1:
                return;
            case 2:
                DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = (DownloadableWallpaperPreviewActivity) this.A00;
                downloadableWallpaperPreviewActivity.A00.setEnabled(C13690nt.A1V(downloadableWallpaperPreviewActivity.A08, i2));
                return;
            default:
                int i3 = 0;
                while (true) {
                    StickerStoreActivity stickerStoreActivity = (StickerStoreActivity) this.A00;
                    if (i3 < stickerStoreActivity.A05.A00.size()) {
                        boolean A1R = AnonymousClass000.A1R(i2, i3);
                        RecyclerView recyclerView = ((StickerStoreTabFragment) stickerStoreActivity.A05.A0G(i3)).A04;
                        if (recyclerView != null) {
                            recyclerView.setNestedScrollingEnabled(A1R);
                        }
                        i3++;
                    } else {
                        stickerStoreActivity.A01.requestLayout();
                        return;
                    }
                }
        }
    }
}
