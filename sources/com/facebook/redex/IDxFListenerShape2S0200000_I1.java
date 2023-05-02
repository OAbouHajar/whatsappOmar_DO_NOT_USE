package com.facebook.redex;

import X.AnonymousClass0D1;
import X.AnonymousClass0D3;
import X.AnonymousClass0ZV;
import X.AnonymousClass0ZW;
import X.C06970Yq;
import X.C13250li;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

public class IDxFListenerShape2S0200000_I1 extends C06970Yq {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxFListenerShape2S0200000_I1(View view, Object obj, Object obj2, int i2) {
        super(view);
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public C13250li A00() {
        if (this.A02 != 0) {
            return (AnonymousClass0ZW) this.A01;
        }
        AnonymousClass0D1 r0 = ((AnonymousClass0D3) this.A00).A00.A0F;
        if (r0 == null) {
            return null;
        }
        return r0.A00();
    }

    public boolean A02() {
        if (this.A02 != 0) {
            return super.A02();
        }
        AnonymousClass0ZV r1 = ((AnonymousClass0D3) this.A00).A00;
        if (r1.A0D != null) {
            return false;
        }
        r1.A01();
        return true;
    }

    public boolean A03() {
        if (this.A02 != 0) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.A00;
            if (appCompatSpinner.A02.AJh()) {
                return true;
            }
            appCompatSpinner.A01();
            return true;
        }
        ((AnonymousClass0D3) this.A00).A00.A03();
        return true;
    }
}
