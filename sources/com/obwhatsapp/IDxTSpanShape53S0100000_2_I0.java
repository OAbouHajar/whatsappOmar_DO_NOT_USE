package com.obwhatsapp;

import X.AnonymousClass3MG;
import X.C000900k;
import X.C13680ns;
import X.C13690nt;
import X.C55442jc;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import com.obwhatsapp.contact.picker.ContactPickerFragment;

public class IDxTSpanShape53S0100000_2_I0 extends AnonymousClass3MG {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape53S0100000_2_I0(Context context, EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel, int i2) {
        super(context, i2);
        this.A01 = 0;
        this.A00 = ellipsizedTextEmojiLabel;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxTSpanShape53S0100000_2_I0(Context context, Object obj, int i2) {
        super(context);
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onClick(View view) {
        switch (this.A01) {
            case 0:
                EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = (EllipsizedTextEmojiLabel) this.A00;
                View.OnClickListener onClickListener = ellipsizedTextEmojiLabel.A03;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                ellipsizedTextEmojiLabel.A00 = Integer.MAX_VALUE;
                ellipsizedTextEmojiLabel.A0H(ellipsizedTextEmojiLabel.A04, ellipsizedTextEmojiLabel.A05, ellipsizedTextEmojiLabel.A01, true);
                return;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                contactPickerFragment.A0L.A06(contactPickerFragment.A0u(), C13690nt.A0B(contactPickerFragment.A1w.A04("26000253")));
                return;
            default:
                C000900k r4 = ((C55442jc) this.A00).A02;
                Context applicationContext = r4.getApplicationContext();
                Intent A09 = C13680ns.A09();
                A09.setClassName(applicationContext.getPackageName(), "com.obwhatsapp.settings.SettingsPrivacy");
                A09.putExtra("target_setting", "privacy_groupadd");
                r4.startActivity(A09);
                return;
        }
    }
}
