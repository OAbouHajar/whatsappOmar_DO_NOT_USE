package com.facebook.redex;

import X.AnonymousClass4M9;
import X.C13680ns;
import X.C15830rv;
import X.C16030sJ;
import X.C29091a1;
import X.C35031lG;
import X.C62063Bm;
import X.C64793Rr;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.search.SearchViewModel;
import com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaper;

public class ViewOnClickCListenerShape2S0101000_I1 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape2S0101000_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A00 = i2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                ((C29091a1) this.A01).AOT(this.A00);
                return;
            case 1:
                ((AnonymousClass4M9) this.A01).A01.ANr(this.A00);
                return;
            case 2:
                int i2 = this.A00;
                SearchViewModel searchViewModel = (SearchViewModel) this.A01;
                if (117 == i2) {
                    searchViewModel.A15.A00(2, 117);
                    searchViewModel.A0V(new C35031lG(2, R.id.search_unread_filter, R.string.str08f3, R.drawable.smart_filter_unread));
                    return;
                }
                searchViewModel.A0R(i2);
                return;
            default:
                int i3 = this.A00;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                SolidColorWallpaper solidColorWallpaper = ((C64793Rr) this.A01).A00.A02;
                int i4 = solidColorWallpaper.A03[i3];
                C15830rv A03 = C62063Bm.A03(solidColorWallpaper.getIntent());
                boolean booleanExtra = solidColorWallpaper.getIntent().getBooleanExtra("is_using_global_wallpaper", false);
                Intent className = C13680ns.A09().setClassName(solidColorWallpaper.getPackageName(), "com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview");
                C16030sJ.A0B(className, A03);
                className.putExtra("is_using_global_wallpaper", booleanExtra);
                className.putExtra("scw_preview_color", i4);
                className.putExtra("wallpaper_preview_intent_extra_animate", true);
                className.putExtra("wallpaper_preview_intent_extra_x", iArr[0]);
                className.putExtra("wallpaper_preview_intent_extra_y", iArr[1]);
                className.putExtra("wallpaper_preview_intent_extra_width", view.getWidth());
                className.putExtra("wallpaper_preview_intent_extra_height", view.getHeight());
                solidColorWallpaper.startActivityForResult(className, 1);
                return;
        }
    }
}
