package com.obwhatsapp.payments.ui;

import X.AnonymousClass01A;
import X.AnonymousClass3K4;
import X.AnonymousClass5S2;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C18450wi;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public final class PaymentCheckoutIncentiveFragment extends BasePaymentIncentiveFragment {
    public AnonymousClass5S2 A00;
    public String A01;

    public void A0k() {
        super.A0k();
        AnonymousClass5S2 r0 = this.A00;
        if (r0 != null) {
            r0.APi();
        }
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        super.A18(bundle, view);
        String string = A04().getString("extra_formatted_discount");
        C18450wi.A0F(string);
        C18450wi.A0B(string);
        this.A01 = string;
        this.A02.setText(C13690nt.A0c(this, string, new Object[1], 0, R.string.str0ed4));
        TextEmojiLabel textEmojiLabel = this.A00;
        Object[] objArr = new Object[1];
        String str = this.A01;
        if (str == null) {
            throw C18450wi.A03("formattedDiscount");
        }
        textEmojiLabel.setText(C13690nt.A0c(this, str, objArr, 0, R.string.str0ed3));
        C13680ns.A1F(this.A03, this, R.string.str0ed2);
        C004601z.A0E(view, R.id.security_container).setVisibility(0);
    }

    public void A1N() {
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof DialogFragment) {
            AnonymousClass3K4.A0z(r1);
        }
        AnonymousClass5S2 r0 = this.A00;
        if (r0 != null) {
            r0.APi();
        }
    }

    public void A1O() {
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof DialogFragment) {
            AnonymousClass3K4.A0z(r1);
        }
        AnonymousClass5S2 r0 = this.A00;
        if (r0 != null) {
            r0.AP7();
        }
    }
}
