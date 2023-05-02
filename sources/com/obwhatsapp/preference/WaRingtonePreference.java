package com.obwhatsapp.preference;

import X.AnonymousClass0Fp;
import X.C13700nu;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;

public class WaRingtonePreference extends Preference {
    public int A00;
    public String A01;
    public boolean A02;
    public boolean A03;

    public WaRingtonePreference(Context context) {
        super(context);
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A0R(AnonymousClass0Fp r2) {
        super.A0R(r2);
        View view = r2.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
    }

    public Intent A0S() {
        Intent A022 = C13700nu.A02("android.intent.action.RINGTONE_PICKER");
        A022.putExtra("android.intent.extra.ringtone.EXISTING_URI", TextUtils.isEmpty(this.A01) ? null : Uri.parse(this.A01));
        A022.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", this.A02);
        if (this.A02) {
            A022.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(this.A00));
        }
        A022.putExtra("android.intent.extra.ringtone.SHOW_SILENT", this.A03);
        A022.putExtra("android.intent.extra.ringtone.TYPE", this.A00);
        A022.putExtra("android.intent.extra.ringtone.TITLE", this.A0H);
        if (this.A02) {
            int i2 = this.A00;
            if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                A022.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            A022.putExtra("android.intent.extra.ringtone.TYPE", 2);
        }
        Intent A023 = C13700nu.A02("android.intent.action.CHOOSER");
        A023.putExtra("android.intent.extra.INTENT", A022);
        return A023;
    }
}
