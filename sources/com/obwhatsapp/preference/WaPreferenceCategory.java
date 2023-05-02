package com.obwhatsapp.preference;

import X.AnonymousClass0Fp;
import X.C13680ns;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import com.obwhatsapp.R;

public class WaPreferenceCategory extends PreferenceCategory {
    public WaPreferenceCategory(Context context) {
        super(context);
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A0R(AnonymousClass0Fp r4) {
        super.A0R(r4);
        View findViewById = r4.A0H.findViewById(16908310);
        if (findViewById != null && (findViewById instanceof TextView)) {
            C13680ns.A0v(this.A05, (TextView) findViewById, R.color.color0717);
        }
    }
}
