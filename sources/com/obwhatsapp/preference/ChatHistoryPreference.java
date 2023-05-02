package com.obwhatsapp.preference;

import X.AnonymousClass0Fp;
import X.AnonymousClass2SR;
import X.C13680ns;
import X.C434920f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public class ChatHistoryPreference extends WaPreference {
    public int A00;
    public int A01;

    public ChatHistoryPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A00 = C434920f.A00(context, R.attr.attr0451, R.color.color070f);
        this.A01 = C434920f.A00(context, R.attr.attr0468, R.color.color0711);
    }

    public void A0R(AnonymousClass0Fp r4) {
        super.A0R(r4);
        View view = r4.A0H;
        AnonymousClass2SR.A08(C13680ns.A0K(view, 16908294), this.A00);
        C13680ns.A0M(view, 16908310).setTextColor(this.A01);
    }
}
