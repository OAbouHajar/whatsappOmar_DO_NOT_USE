package com.obwhatsapp.contact.picker;

import X.AnonymousClass04o;
import X.AnonymousClass1G1;
import X.AnonymousClass1V8;
import X.C001500q;
import X.C006602z;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16980tz;
import X.C17150uc;
import X.C23131Ap;
import X.C49132Rg;
import X.C64403Pa;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxIFactoryShape25S0100000_2_I1;

public class ContactsAttachmentSelector extends AnonymousClass1V8 {
    public AnonymousClass1G1 A00;
    public C17150uc A01;
    public C64403Pa A02;
    public C16980tz A03;
    public C23131Ap A04;
    public boolean A05;

    public ContactsAttachmentSelector() {
        this(0);
    }

    public ContactsAttachmentSelector(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 49);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, this), this);
            this.A03 = C16150sX.A0V(r1);
            this.A04 = (C23131Ap) r1.ADU.get();
            this.A00 = (AnonymousClass1G1) r1.AJl.get();
            this.A01 = C16150sX.A09(r1);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 8) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C64403Pa r0 = (C64403Pa) new C006602z((AnonymousClass04o) new IDxIFactoryShape25S0100000_2_I1(this, 0), (C001500q) this).A01(C64403Pa.class);
        this.A02 = r0;
        C13680ns.A1L(this, r0.A03, 76);
        C13680ns.A1L(this, this.A02.A00, 77);
    }
}
