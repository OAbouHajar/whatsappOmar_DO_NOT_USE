package com.obwhatsapp.settings;

import X.AnonymousClass00T;
import X.AnonymousClass2E0;
import X.C16150sX;
import X.C46362Dz;
import X.C52652eD;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.obwhatsapp.R;

public class SettingsRowNoticeView extends SettingsRowIconText {
    public int A00;
    public Drawable A01;
    public boolean A02;

    public SettingsRowNoticeView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SettingsRowNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A01 = AnonymousClass00T.A04(context, R.drawable.ic_settings_row_badge);
    }

    public SettingsRowNoticeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            this.A04 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public int getNoticeId() {
        return this.A00;
    }

    public void setNotice(C46362Dz r3) {
        AnonymousClass2E0 r1 = r3.A04;
        this.A00 = r1.A00;
        setText(r1.A03);
        this.A01.setVisibility(4);
    }
}
