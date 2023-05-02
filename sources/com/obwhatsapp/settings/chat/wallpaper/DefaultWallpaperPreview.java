package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass00T;
import X.AnonymousClass1YG;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15830rv;
import X.C16030sJ;
import X.C16150sX;
import X.C49132Rg;
import X.C62063Bm;
import X.C78233xY;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import com.obwhatsapp.R;

public class DefaultWallpaperPreview extends C78233xY {
    public boolean A00;

    public DefaultWallpaperPreview() {
        this(0);
    }

    public DefaultWallpaperPreview(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 123);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = C16150sX.A0M(r1);
            this.A02 = C16150sX.A0Q(r1);
        }
    }

    public int A35() {
        return R.layout.layout0619;
    }

    public void A37(C15830rv r4) {
        Intent A09 = C13680ns.A09();
        C16030sJ.A0B(A09, r4);
        A09.putExtra("is_default", true);
        C13680ns.A0r(this, A09);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ImageView) AnonymousClass00T.A05(this, R.id.wallpaper_preview_default_view)).setImageDrawable(C62063Bm.A00(this, getResources()));
        ((WallpaperMockChatView) AnonymousClass00T.A05(this, R.id.wallpaper_preview_default_chat_view)).setMessages(getString(R.string.str1b40), A36(), (AnonymousClass1YG) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }
}
