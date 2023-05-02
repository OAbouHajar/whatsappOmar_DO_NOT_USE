package com.obwhatsapp.businessapisearch.view.fragment;

import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass3K2;
import X.C004601z;
import X.C13680ns;
import X.C14870pt;
import X.C18450wi;
import X.C19980zJ;
import X.C45922Bq;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class BusinessAPINUXBottomSheet extends Hilt_BusinessAPINUXBottomSheet {
    public C19980zJ A00;
    public C14870pt A01;
    public AnonymousClass01V A02;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout0295, viewGroup, false);
        C004601z.A0O(AnonymousClass00T.A03(A02(), R.color.color0803), inflate);
        View A0E = C004601z.A0E(inflate, R.id.btn_continue);
        TextEmojiLabel A0Q = C13680ns.A0Q(inflate, R.id.nux_privacy_policy);
        Uri parse = Uri.parse("https://faq.whatsapp.com/530309022405692/");
        C14870pt r7 = this.A01;
        String string = inflate.getContext().getString(R.string.str017b);
        C19980zJ r6 = this.A00;
        AnonymousClass01V r9 = this.A02;
        C18450wi.A0H(parse, 0);
        C18450wi.A0H(r7, 2);
        AnonymousClass3K2.A1I(string, A0Q);
        C18450wi.A0H(r6, 5);
        C18450wi.A0H(r9, 6);
        C45922Bq.A08(A0Q.getContext(), parse, r6, r7, A0Q, r9, string);
        C13680ns.A1A(C004601z.A0E(inflate, R.id.nux_close_button), this, 44);
        C13680ns.A1A(A0E, this, 43);
        return inflate;
    }

    public void A1M(View view) {
        super.A1M(view);
        BottomSheetBehavior.A00(view).A0J = true;
    }
}
