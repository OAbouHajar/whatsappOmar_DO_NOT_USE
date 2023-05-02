package com.facebook.redex;

import X.AnonymousClass2A8;
import X.AnonymousClass3K2;
import X.AnonymousClass4PA;
import X.C84644Li;
import android.view.ViewTreeObserver;
import com.obwhatsapp.components.SelectionCheckView;

public class IDxDListenerShape1S0210000_2_I0 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public IDxDListenerShape1S0210000_2_I0(Object obj, Object obj2, int i2, boolean z2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z2;
    }

    public boolean onPreDraw() {
        if (this.A03 != 0) {
            SelectionCheckView selectionCheckView = ((AnonymousClass4PA) this.A01).A0E;
            AnonymousClass3K2.A10(selectionCheckView, this);
            selectionCheckView.A04(this.A02, true);
            return false;
        }
        C84644Li r3 = (C84644Li) this.A01;
        AnonymousClass3K2.A10(r3.A02, this);
        SelectionCheckView selectionCheckView2 = r3.A02;
        boolean z2 = this.A02;
        selectionCheckView2.A04(z2, true);
        ((AnonymousClass2A8) this.A00).A00(r3.A02, z2);
        return false;
    }
}
