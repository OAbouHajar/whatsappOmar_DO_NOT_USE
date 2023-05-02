package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass0Ri;
import X.AnonymousClass0SJ;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public final class WallpaperAutoFitGridLayoutManager extends GridLayoutManager {
    public int A00;
    public boolean A01 = true;
    public final Context A02;

    public WallpaperAutoFitGridLayoutManager(Context context, int i2) {
        super(1);
        this.A02 = context;
        this.A00 = i2;
        if (i2 > 0 && i2 != i2) {
            this.A00 = i2;
            this.A01 = true;
        }
    }

    public void A0t(AnonymousClass0SJ r5, AnonymousClass0Ri r6) {
        int i2;
        int A0A;
        int A07;
        if (this.A01 && (i2 = this.A00) > 0) {
            if (this.A01 == 1) {
                A0A = this.A03 - A09();
                A07 = A08();
            } else {
                A0A = this.A00 - A0A();
                A07 = A07();
            }
            A1g(Math.max(1, (A0A - A07) / i2));
            this.A01 = false;
        }
        super.A0t(r5, r6);
    }
}
