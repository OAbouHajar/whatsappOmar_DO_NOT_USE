package com.obwhatsapp.preference;

import X.AnonymousClass0Fp;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;

public class WaCheckBoxPreference extends CheckBoxPreference {
    public WaCheckBoxPreference(Context context) {
        super(context);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A0R(AnonymousClass0Fp r3) {
        super.A0R(r3);
        View view = r3.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            TextView textView = (TextView) findViewById;
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }
}
