package com.obwhatsapp;

import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14630pV;
import X.C16150sX;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.biz.catalog.CatalogMediaViewFragment;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;

public class CatalogMediaView extends C14530pL implements C14630pV {
    public boolean A00;

    public CatalogMediaView() {
        this(0);
    }

    public CatalogMediaView(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 1);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public void APw() {
    }

    public void ATb() {
        finish();
    }

    public void ATc() {
    }

    public void AYZ() {
    }

    public boolean AfS() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A07(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            setContentView((int) R.layout.layout03d0);
            AnonymousClass02C AGM = AGM();
            AnonymousClass01A A0B = AGM.A0B("catalog_media_view_fragment");
            if (A0B == null) {
                A0B = new CatalogMediaViewFragment();
            }
            Bundle A0D = C13690nt.A0D();
            A0D.putParcelable("product", intent.getParcelableExtra("product"));
            A0D.putInt("target_image_index", intent.getIntExtra("target_image_index", 0));
            A0D.putString("cached_jid", intent.getStringExtra("cached_jid"));
            A0D.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A0B.A0T(A0D);
            AnonymousClass050 r1 = new AnonymousClass050(AGM);
            r1.A0E(A0B, "catalog_media_view_fragment", R.id.media_view_fragment_container);
            r1.A01();
        }
    }

    public void onStop() {
        super.onStop();
        MediaViewBaseFragment.A08(this, true);
    }
}
