package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass3R2;
import X.AnonymousClass3RG;
import X.C13680ns;
import X.C13690nt;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C434920f;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

public class SolidColorWallpaper extends C14550pN {
    public static final int[] A04 = {R.string.str0492, R.string.str04c0, R.string.str04b3, R.string.str04a2, R.string.str049a, R.string.str04c3, R.string.str04bc, R.string.str04cc, R.string.str04b6, R.string.str04cb, R.string.str048c, R.string.str048d, R.string.str04bf, R.string.str0481, R.string.str04bd, R.string.str04ac, R.string.str049f, R.string.str048a, R.string.str0485, R.string.str04b7, R.string.str04ca, R.string.str049e, R.string.str048f, R.string.str04b0, R.string.str04c4, R.string.str048b, R.string.str0488};
    public AnonymousClass013 A00;
    public boolean A01;
    public int[] A02;
    public int[] A03;

    public SolidColorWallpaper() {
        this(0);
    }

    public SolidColorWallpaper(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 125);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            C14550pN.A15(r1, this);
            this.A0A = C14550pN.A0v(r1);
            this.A00 = C16150sX.A0Z(r1);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1 && i3 == -1) {
            if (intent == null || !intent.hasExtra("wallpaper_color_file")) {
                setResult(0, (Intent) null);
            } else {
                setResult(-1, intent);
            }
            finish();
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C434920f.A04(this, R.color.color04f1);
        setTitle(R.string.str1663);
        setContentView((int) R.layout.layout0617);
        C14550pN.A0s(this, R.id.toolbar).A0N(true);
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass00T.A05(this, R.id.separator).setVisibility(8);
        }
        RecyclerView recyclerView = (RecyclerView) AnonymousClass00T.A05(this, R.id.color_grid);
        recyclerView.A0m(new AnonymousClass3RG(this.A00, getResources().getDimensionPixelOffset(R.dimen.dimen03f8)));
        int[] intArray = getResources().getIntArray(R.array.array001c);
        int length = intArray.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = i2;
        }
        Pair A0I = C13690nt.A0I(intArray, iArr);
        int[] iArr2 = (int[]) A0I.first;
        this.A02 = iArr2;
        this.A03 = (int[]) A0I.second;
        recyclerView.setAdapter(new AnonymousClass3R2(this, this, iArr2));
        recyclerView.A0h = true;
        recyclerView.setLayoutManager(new WallpaperAutoFitGridLayoutManager(this, getResources().getDimensionPixelSize(R.dimen.dimen03f9)));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        finish();
        return true;
    }
}
