package com.obwhatsapp;

import X.AnonymousClass2KO;
import X.C005402i;
import X.C009104e;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.preference.PreferenceScreen;

public abstract class WaPreferenceFragment extends Hilt_WaPreferenceFragment {
    public AnonymousClass2KO A00;

    public void A0k() {
        super.A0k();
        this.A00 = null;
    }

    public void A16(Context context) {
        super.A16(context);
        this.A00 = (AnonymousClass2KO) A0C();
    }

    public void A1C(int i2) {
        C009104e r2 = this.A02;
        if (r2 != null) {
            PreferenceScreen A02 = r2.A02(A0u(), this.A02.A07, i2);
            C009104e r1 = this.A02;
            PreferenceScreen preferenceScreen = r1.A07;
            if (A02 != preferenceScreen) {
                if (preferenceScreen != null) {
                    preferenceScreen.A08();
                }
                r1.A07 = A02;
                this.A04 = true;
                if (this.A05) {
                    Handler handler = this.A01;
                    if (!handler.hasMessages(1)) {
                        handler.obtainMessage(1).sendToTarget();
                    }
                }
            }
            AnonymousClass2KO r0 = this.A00;
            if (r0 != null) {
                CharSequence title = r0.getTitle();
                C005402i x2 = r0.x();
                if (!TextUtils.isEmpty(title) && x2 != null) {
                    x2.A0J(title);
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }
}
