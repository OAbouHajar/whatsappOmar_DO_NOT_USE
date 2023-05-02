package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass2Sy;
import X.AnonymousClass5RN;
import X.C118825vJ;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.obwhatsapp.WaEditText;

public class IDxCListenerShape95S0200000_3_I1 implements AnonymousClass5RN {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape95S0200000_3_I1(WaEditText waEditText, C118825vJ r2, int i2) {
        this.A02 = i2;
        this.A00 = r2;
        this.A01 = waEditText;
    }

    public void ANC() {
        View view = (View) this.A01;
        AnonymousClass00B.A04(view);
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void AQH(int[] iArr) {
        int i2 = this.A02;
        EditText editText = (EditText) this.A01;
        if (i2 == 0 || editText.getVisibility() == 0) {
            AnonymousClass2Sy.A08(editText, iArr, 0);
        }
    }
}
