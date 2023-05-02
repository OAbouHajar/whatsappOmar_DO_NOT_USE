package com.obwhatsapp.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

public class SettingsRowPrivacyText extends LinearLayout {
    public SettingsRowPrivacyText(Context context) {
        this(context, (AttributeSet) null);
    }

    public SettingsRowPrivacyText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.layout054a, this);
    }
}
