package com.obwhatsapp.mediaview;

import X.AnonymousClass00F;
import X.AnonymousClass01S;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass1yL;
import X.AnonymousClass29C;
import X.AnonymousClass2PR;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14630pV;
import X.C15830rv;
import X.C16150sX;
import X.C28381Vw;
import X.C31091dS;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class MediaViewActivity extends C14530pL implements C14630pV {
    public MediaViewFragment A00;
    public boolean A01;

    public MediaViewActivity() {
        this(0);
    }

    public MediaViewActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 86);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public int A1r() {
        return 703923716;
    }

    public C31091dS A1s() {
        C31091dS A1s = super.A1s();
        A1s.A03 = true;
        return A1s;
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A01;
    }

    public void APw() {
    }

    public void ATb() {
        finish();
    }

    public void ATc() {
        AW4();
    }

    public void AYZ() {
    }

    public boolean AfS() {
        return true;
    }

    public void finish() {
        super.finish();
        MediaViewFragment mediaViewFragment = this.A00;
        if (mediaViewFragment != null) {
            mediaViewFragment.delPrevon();
            mediaViewFragment.A0B.A0A();
        }
    }

    public void onBackPressed() {
        MediaViewFragment mediaViewFragment = this.A00;
        if (mediaViewFragment != null) {
            mediaViewFragment.A1H();
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A07(this);
        super.onCreate(bundle);
        AKw("on_activity_create");
        setContentView((int) R.layout.layout03d0);
        AnonymousClass02C AGM = AGM();
        MediaViewFragment mediaViewFragment = (MediaViewFragment) AGM.A0B("media_view_fragment");
        this.A00 = mediaViewFragment;
        if (mediaViewFragment == null) {
            Intent intent = getIntent();
            C28381Vw A02 = AnonymousClass1yL.A02(intent);
            if (A02 == null) {
                Log.e("mediaview/message key parameter is missing");
                finish();
                return;
            }
            C15830rv A022 = C15830rv.A02(intent.getStringExtra("jid"));
            boolean booleanExtra = intent.getBooleanExtra("gallery", false);
            boolean booleanExtra2 = intent.getBooleanExtra("nogallery", false);
            MediaViewFragment A023 = MediaViewFragment.A02(intent.getBundleExtra("animation_bundle"), A022, A02, intent.getIntExtra("video_play_origin", 5), intent.getIntExtra("menu_style", 1), 1, intent.getLongExtra("start_t", 0), booleanExtra, booleanExtra2, intent.getBooleanExtra("menu_set_wallpaper", false));
            A023.setPrevon(intent);
            this.A00 = A023;
        }
        AnonymousClass050 r2 = new AnonymousClass050(AGM);
        r2.A0E(this.A00, "media_view_fragment", R.id.media_view_fragment_container);
        r2.A01();
        AKv("on_activity_create");
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (mediaViewFragment == null || i2 != 62) {
            return super.onKeyUp(i2, keyEvent);
        }
        AnonymousClass29C r0 = mediaViewFragment.A1c;
        if (r0 == null) {
            return true;
        }
        boolean A0C = r0.A0C();
        AnonymousClass29C r02 = mediaViewFragment.A1c;
        if (A0C) {
            r02.A07();
            return true;
        }
        AnonymousClass2PR r1 = r02.A08;
        if (r1 == null) {
            return true;
        }
        r1.AeK(true);
        return true;
    }

    public void onStop() {
        super.onStop();
        MediaViewBaseFragment.A08(this, true);
    }
}
