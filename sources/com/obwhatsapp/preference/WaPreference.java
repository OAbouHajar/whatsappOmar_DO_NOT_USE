package com.obwhatsapp.preference;

import X.AnonymousClass0Fp;
import X.C13680ns;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.obwhatsapp.R;

public class WaPreference extends Preference {
    public WaPreference(Context context) {
        super(context);
    }

    public WaPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public static void A00(View view) {
        View findViewById = view.findViewById(16908304);
        if (findViewById != null && (findViewById instanceof TextView)) {
            ((TextView) findViewById).setTextColor(C13680ns.A0D(view).getColorStateList(R.color.color06cb));
        }
    }

    public static void A01(View view) {
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(C13680ns.A0D(view).getColorStateList(R.color.color05d9));
        }
    }

    public void A0R(AnonymousClass0Fp r2) {
        super.A0R(r2);
        A01(r2.A0H);
    }
}
