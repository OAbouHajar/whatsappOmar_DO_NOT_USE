package com.obwhatsapp.payments.ui;

import X.C110105dW;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import com.obwhatsapp.contact.picker.ContactPicker;
import com.obwhatsapp.contact.picker.ContactPickerFragment;

public class PaymentContactPicker extends ContactPicker {
    public boolean A00;

    public PaymentContactPicker() {
        this(0);
    }

    public PaymentContactPicker(int i2) {
        this.A00 = false;
        C110105dW.A0t(this, 89);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C110105dW.A0z(A0C, r1, this);
        }
    }

    public ContactPickerFragment A39() {
        return new PaymentContactPickerFragment();
    }
}
