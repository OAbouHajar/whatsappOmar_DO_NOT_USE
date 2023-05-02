package com.obwhatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass2Sy;
import X.C102834zb;
import X.C41651wK;
import X.C55602k1;
import android.text.Editable;
import android.view.View;

public class IDxWAdapterShape22S0200000_2_I0 extends C41651wK {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxWAdapterShape22S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A02 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        C55602k1 r4 = (C55602k1) this.A00;
        AnonymousClass2Sy.A07(r4.getContext(), r4.A05.getPaint(), editable, r4.A03, 1.3f);
        ((C102834zb) this.A01).A01(r4.A05.getPaint(), editable, r4.A05.getWidth());
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (1 - this.A02 != 0) {
            super.onTextChanged(charSequence, i2, i3, i4);
        } else {
            ((View) this.A01).setEnabled(AnonymousClass000.A1Q(charSequence.length()));
        }
    }
}
