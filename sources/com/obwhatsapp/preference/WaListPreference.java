package com.obwhatsapp.preference;

import X.AnonymousClass0Fp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.ListPreference;
import com.obwhatsapp.R;

public class WaListPreference extends ListPreference {
    public WaListPreference(Context context) {
        super(context);
    }

    public WaListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A0R(AnonymousClass0Fp r3) {
        super.A0R(r3);
        this.A04 = this.A05.getString(R.string.str0394);
        View view = r3.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
    }
}
