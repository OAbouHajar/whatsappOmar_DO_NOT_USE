package com.obwhatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.C108055Mm;
import X.C13680ns;
import X.C15890s4;
import X.C23071Aj;
import X.C811046w;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class PermissionsFragment extends Hilt_PermissionsFragment {
    public C23071Aj A00;
    public C15890s4 A01;
    public C108055Mm A02;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0357);
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C108055Mm) {
            this.A02 = (C108055Mm) context;
        }
    }

    public void A18(Bundle bundle, View view) {
        int i2;
        String str;
        C13680ns.A16(view.findViewById(R.id.instrumentation_auth_perm_button), this, 28);
        if (this.A01.A01.A02(2624) == 2) {
            i2 = R.string.str0b91;
            str = "https://faq.whatsapp.com/660493885504088";
        } else {
            i2 = R.string.str0b90;
            str = "https://faq.whatsapp.com/general/security-and-privacy/about-your-privacy-when-using-whatsapp-on-ray-ban-stories/";
        }
        C811046w.A00(C13680ns.A0L(view, R.id.instrumentation_auth_perm_paragraph_two), AnonymousClass000.A1a(this.A00.A00(str).toString()), i2);
    }
}
