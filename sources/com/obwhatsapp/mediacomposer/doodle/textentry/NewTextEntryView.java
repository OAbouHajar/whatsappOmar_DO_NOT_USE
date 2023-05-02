package com.obwhatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass471;
import X.AnonymousClass4MW;
import X.C004601z;
import X.C102834zb;
import X.C13680ns;
import X.C55602k1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickCListenerShape18S0100000_I1_3;
import com.obwhatsapp.R;

public class NewTextEntryView extends C55602k1 {
    public LinearLayout A00;
    public C102834zb A01;
    public final View.OnClickListener A02;

    public NewTextEntryView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NewTextEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewTextEntryView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A02 = new ViewOnClickCListenerShape18S0100000_I1_3(this, 47);
    }

    private void setUpFontPicker(int i2) {
        this.A00.removeAllViews();
        int i3 = 0;
        do {
            View A0H = C13680ns.A0H(C13680ns.A0G(this), this, R.layout.layout0290);
            C13680ns.A0L(A0H, R.id.font_item_text_view).setTypeface(AnonymousClass471.A00(getContext(), i3));
            A0H.setTag(Integer.valueOf(i3));
            A0H.setOnClickListener(this.A02);
            if (i3 == i2) {
                A0H.setSelected(true);
            }
            this.A00.addView(A0H);
            i3++;
        } while (i3 < 4);
    }

    public void A01(int i2, int i3, int i4) {
        super.A01(i2, i3, i4);
        this.A00.findViewWithTag(Integer.valueOf(i3)).setSelected(true);
        this.A00.findViewWithTag(Integer.valueOf(i2)).setSelected(false);
    }

    public void A02(Window window, C102834zb r3, AnonymousClass4MW r4, int[] iArr) {
        super.A02(window, r3, r4, iArr);
        this.A01 = r3;
        this.A00 = (LinearLayout) C004601z.A0E(this, R.id.font_picker);
        setUpFontPicker(r4.A02);
    }
}
