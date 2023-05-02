package com.obwhatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01Q;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass2Rf;
import X.AnonymousClass2kJ;
import X.AnonymousClass3RG;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16690tT;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C24461Ga;
import X.C434920f;
import X.C49132Rg;
import X.C55742kG;
import X.C55752kH;
import X.C95124m8;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class DownloadableWallpaperPickerActivity extends AnonymousClass2kJ {
    public View A00;
    public View A01;
    public AnonymousClass01Q A02;
    public RecyclerView A03;
    public AnonymousClass013 A04;
    public C24461Ga A05;
    public C55742kG A06;
    public List A07;
    public boolean A08;

    public DownloadableWallpaperPickerActivity() {
        this(0);
        this.A07 = new ArrayList();
    }

    public DownloadableWallpaperPickerActivity(int i2) {
        this.A08 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 93));
    }

    public void A1q() {
        if (!this.A08) {
            this.A08 = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A04 = (AnonymousClass013) r1.AR8.get();
            this.A05 = (C24461Ga) r1.A7O.get();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 111) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            setResult(i3, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_BRIGHT_KEY", true);
        int i2 = R.string.str1b42;
        if (booleanExtra) {
            i2 = R.string.str1b41;
        }
        setTitle(getString(i2));
        Resources resources = null;
        try {
            resources = getPackageManager().getResourcesForApplication("com.obwhatsapp.wallpaper");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                int identifier = resources.getIdentifier("wallpapers", "array", "com.obwhatsapp.wallpaper");
                if (identifier != 0) {
                    for (String str : resources.getStringArray(identifier)) {
                        int identifier2 = resources.getIdentifier(str, "drawable", "com.obwhatsapp.wallpaper");
                        if (identifier2 != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append("_small");
                            int identifier3 = resources.getIdentifier(sb.toString(), "drawable", "com.obwhatsapp.wallpaper");
                            if (identifier3 != 0) {
                                arrayList.add(Integer.valueOf(identifier3));
                                arrayList2.add(Integer.valueOf(identifier2));
                            }
                        }
                    }
                }
            } catch (Resources.NotFoundException e2) {
                Log.e("WallpaperUtils/resource not found", e2);
            }
            this.A02 = new AnonymousClass01Q(arrayList, arrayList2);
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("WallpaperCurrentPreviewActivity/com.obwhatsapp.wallpaper could not be found.", e3);
        }
        this.A01 = AnonymousClass00T.A05(this, R.id.wallpaper_thumbnails_progress_container);
        this.A00 = AnonymousClass00T.A05(this, R.id.wallpaper_thumbnail_error_container);
        this.A03 = (RecyclerView) AnonymousClass00T.A05(this, R.id.wallpaper_thumbnail_recyclerview);
        C55742kG r2 = new C55742kG(resources, new C55752kH(this), this.A05);
        this.A06 = r2;
        this.A03.setLayoutManager(new DownloadableWallpaperGridLayoutManager(r2));
        this.A03.A0m(new AnonymousClass3RG(this.A04, getResources().getDimensionPixelOffset(R.dimen.dimen0853)));
        this.A03.setAdapter(this.A06);
        if (this.A05.A00.A01() == null) {
            C24461Ga r3 = this.A05;
            r3.A04.execute(new RunnableRunnableShape14S0100000_I0_13((Object) r3, 41));
        }
        C434920f.A04(this, R.color.color04f1);
        Button button = (Button) AnonymousClass00T.A05(this, R.id.wallpaper_thumbnail_reload_button);
        button.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I0_1(this, 1, button));
        this.A05.A00.A0A(this, new C95124m8(button, this, booleanExtra));
    }

    public void onDestroy() {
        super.onDestroy();
        for (C16690tT A062 : this.A06.A04.values()) {
            A062.A06(true);
        }
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
