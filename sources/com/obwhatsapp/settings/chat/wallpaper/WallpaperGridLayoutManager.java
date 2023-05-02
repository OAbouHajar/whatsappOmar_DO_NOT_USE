package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass01X;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.redex.IDxSLookupShape27S0100000_2_I1;

public class WallpaperGridLayoutManager extends GridLayoutManager {
    public Context A00;
    public final AnonymousClass01X A01;

    public WallpaperGridLayoutManager(Context context, AnonymousClass01X r4) {
        super(4);
        this.A00 = context;
        this.A01 = r4;
        this.A01 = new IDxSLookupShape27S0100000_2_I1(this, 1);
    }
}
