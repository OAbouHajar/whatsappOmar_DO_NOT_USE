package com.obwhatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.C108045Ml;
import X.C13680ns;
import X.C23071Aj;
import X.C811046w;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class ConfirmFragment extends Hilt_ConfirmFragment {
    public C23071Aj A00;
    public C108045Ml A01;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0356);
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C108045Ml) {
            this.A01 = (C108045Ml) context;
        }
    }

    public void A18(Bundle bundle, View view) {
        C13680ns.A16(view.findViewById(R.id.instrumentation_auth_complete_button), this, 27);
        C811046w.A00(C13680ns.A0L(view, R.id.instrumentation_auth_complete_link), AnonymousClass000.A1a(this.A00.A00("https://faq.whatsapp.com/general/security-and-privacy/how-to-use-whatsapp-on-ray-ban-stories/").toString()), R.string.str0b8c);
    }
}
