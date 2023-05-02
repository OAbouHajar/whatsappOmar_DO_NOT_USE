package com.obwhatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15830rv;
import X.C16030sJ;
import X.C16150sX;
import X.C16320sq;
import X.C16690tT;
import X.C24461Ga;
import X.C49132Rg;
import X.C606234m;
import X.C78233xY;
import X.C83924Io;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.facebook.redex.IDxCListenerShape273S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DownloadableWallpaperPreviewActivity extends C78233xY {
    public Resources A00;
    public MarginCorrectedViewPager A01;
    public C24461Ga A02;
    public C606234m A03;
    public C83924Io A04;
    public List A05;
    public List A06;
    public boolean A07;
    public final Set A08;

    public DownloadableWallpaperPreviewActivity() {
        this(0);
        this.A08 = C13680ns.A0o();
        this.A04 = new C83924Io(this);
    }

    public DownloadableWallpaperPreviewActivity(int i2) {
        this.A07 = false;
        C13680ns.A1G(this, 128);
    }

    public void A1q() {
        if (!this.A07) {
            this.A07 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = C16150sX.A0M(r1);
            this.A02 = C16150sX.A0Q(r1);
            this.A02 = (C24461Ga) r1.A7O.get();
        }
    }

    public void A37(C15830rv r5) {
        Intent A09 = C13680ns.A09();
        int currentItem = this.A01.getCurrentItem();
        if (currentItem < this.A05.size()) {
            C24461Ga r3 = this.A02;
            String path = ((Uri) this.A05.get(this.A01.getCurrentItem())).getPath();
            AnonymousClass00B.A06(path);
            File A012 = r3.A02.A01(C13700nu.A0D(path).getName().split("\\.")[0]);
            AnonymousClass00B.A06(A012);
            A09.setData(Uri.fromFile(A012));
            A09.putExtra("FROM_INTERNAL_DOWNLOADS_KEY", true);
        } else {
            A09.putExtra("selected_res_id", (Serializable) this.A06.get(currentItem - this.A05.size()));
        }
        C16030sJ.A0B(A09, r5);
        C13680ns.A0r(this, A09);
    }

    public void onBackPressed() {
        setResult(0, (Intent) null);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13680ns.A0u(this, AnonymousClass00T.A05(this, R.id.wallpaper_preview_container), R.color.color065f);
        this.A00.setEnabled(false);
        try {
            this.A00 = getPackageManager().getResourcesForApplication("com.obwhatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("DownloadableWallpaperPreviewActivity/com.obwhatsapp.wallpaper could not be found.", e2);
        }
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("THUMBNAIL_URIS_KEY");
        AnonymousClass00B.A06(parcelableArrayListExtra);
        this.A05 = parcelableArrayListExtra;
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("WHATSAPP_THUMBNAIL_RES_KEY");
        this.A06 = getIntent().getIntegerArrayListExtra("WHATSAPP_FULL_RES_KEY");
        this.A01 = (MarginCorrectedViewPager) AnonymousClass00T.A05(this, R.id.wallpaper_preview);
        C16320sq r9 = this.A05;
        C24461Ga r7 = this.A02;
        C606234m r3 = new C606234m(this, this.A00, this.A00, r7, this.A04, r9, this.A05, integerArrayListExtra, this.A06, this.A01);
        this.A03 = r3;
        this.A01.setAdapter(r3);
        this.A01.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.dimen033d));
        this.A01.A0G(new IDxCListenerShape273S0100000_2_I1(this, 2));
        this.A01.setCurrentItem(getIntent().getIntExtra("STARTING_POSITION_KEY", 0));
    }

    public void onDestroy() {
        Iterator A0q = C13680ns.A0q(this.A03.A07);
        while (A0q.hasNext()) {
            ((C16690tT) A0q.next()).A06(true);
        }
        super.onDestroy();
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
