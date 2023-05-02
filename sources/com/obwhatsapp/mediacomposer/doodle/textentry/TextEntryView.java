package com.obwhatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass2VI;
import X.AnonymousClass4MW;
import X.C004601z;
import X.C102834zb;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C55602k1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

public class TextEntryView extends C55602k1 {
    public View A00;
    public WaImageView A01;
    public WaTextView A02;
    public AnonymousClass2VI A03;

    public TextEntryView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextEntryView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A02(Window window, C102834zb r7, AnonymousClass4MW r8, int[] iArr) {
        super.A02(window, r7, r8, iArr);
        this.A03 = new AnonymousClass2VI(getContext(), 0);
        this.A02 = C13680ns.A0S(this, R.id.font_picker_preview);
        View A0E = C004601z.A0E(this, R.id.picker_button_container);
        this.A00 = A0E;
        A0E.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        this.A03.A01(r8.A01);
        this.A02.setTypeface(this.A05.getTypeface());
        WaImageView A0R = C13690nt.A0R(this, R.id.font_picker_btn);
        this.A01 = A0R;
        C13680ns.A16(A0R, r7, 48);
        C13700nu.A0S(this.A01, r7, 9);
        this.A01.setImageDrawable(this.A03);
    }
}
