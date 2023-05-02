package com.obwhatsapp.qrcode.contactqr;

import X.AnonymousClass000;
import X.C004601z;
import X.C16040sK;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class ContactQrMyCodeFragment extends Hilt_ContactQrMyCodeFragment {
    public C16040sK A00;
    public ContactQrContactCardView A01;
    public String A02;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.layout014a, viewGroup, false);
        ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) C004601z.A0E(inflate, R.id.contact_qr_card);
        this.A01 = contactQrContactCardView;
        contactQrContactCardView.setStyle(0);
        ContactQrContactCardView contactQrContactCardView2 = this.A01;
        C16040sK r0 = this.A00;
        r0.A0B();
        contactQrContactCardView2.A02(r0.A01, true);
        this.A01.setPrompt(A0J(R.string.str0578));
        ContactQrContactCardView contactQrContactCardView3 = this.A01;
        if (!(contactQrContactCardView3 == null || (str = this.A02) == null)) {
            contactQrContactCardView3.setQrCode(AnonymousClass000.A0h(str, AnonymousClass000.A0r("https://wa.me/qr/")));
        }
        return inflate;
    }
}
