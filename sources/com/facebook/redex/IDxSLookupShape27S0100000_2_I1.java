package com.facebook.redex;

import X.AnonymousClass0Q9;
import X.C003101j;
import X.C13680ns;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.chat.wallpaper.WallpaperGridLayoutManager;
import com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperGridLayoutManager;
import java.util.List;

public class IDxSLookupShape27S0100000_2_I1 extends AnonymousClass0Q9 {
    public Object A00;
    public final int A01;

    public IDxSLookupShape27S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public int A00(int i2) {
        switch (this.A01) {
            case 0:
                Number number = (Number) C003101j.A06((List) this.A00, i2);
                if (number != null) {
                    return number.intValue();
                }
                return 1;
            case 1:
                WallpaperGridLayoutManager wallpaperGridLayoutManager = (WallpaperGridLayoutManager) this.A00;
                int itemViewType = wallpaperGridLayoutManager.A01.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1 || itemViewType == 2 || itemViewType == 3) {
                    return 4 / wallpaperGridLayoutManager.A00.getResources().getInteger(R.integer.integer0018);
                }
                if (itemViewType == 4 || itemViewType == 5) {
                    return 4;
                }
                throw new UnsupportedOperationException(C13680ns.A0c(itemViewType, "Invalid viewType: "));
            default:
                int itemViewType2 = ((DownloadableWallpaperGridLayoutManager) this.A00).A00.getItemViewType(i2);
                if (itemViewType2 == 0 || itemViewType2 == 1) {
                    return 1;
                }
                if (itemViewType2 == 2 || itemViewType2 == 3) {
                    return 3;
                }
                throw new UnsupportedOperationException(C13680ns.A0c(itemViewType2, "Invalid viewType: "));
        }
    }
}
