package com.obwhatsapp.gallery;

import X.AnonymousClass05J;
import X.C18450wi;
import X.C434920f;
import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.gallerypicker.MediaPicker;

public final class NewMediaPicker extends MediaPicker {
    public void AYY(AnonymousClass05J r2) {
        C18450wi.A0H(r2, 0);
        super.AYY(r2);
        C434920f.A03(this, R.color.color045d);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1 && i3 == -1) {
            setResult(-1, intent);
            finish();
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }
}
