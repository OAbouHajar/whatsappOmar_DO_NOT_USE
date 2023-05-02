package com.obwhatsapp.chatinfo.view.custom;

import X.AnonymousClass04h;
import X.C13680ns;
import X.C15450qv;
import X.C18450wi;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;

public abstract class PnhBottomSheet extends RoundedBottomSheetDialogFragment implements View.OnClickListener {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A11(android.os.Bundle r3, android.view.LayoutInflater r4, android.view.ViewGroup r5) {
        /*
            r2 = this;
            r0 = 0
            X.C18450wi.A0H(r4, r0)
            r1 = r2
            boolean r0 = r2 instanceof com.obwhatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet
            if (r0 != 0) goto L_0x0022
            boolean r0 = r2 instanceof com.obwhatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet
            if (r0 != 0) goto L_0x001a
            boolean r0 = r2 instanceof com.obwhatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet
            if (r0 == 0) goto L_0x0022
            com.obwhatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet r1 = (com.obwhatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet) r1
            boolean r1 = r1.A04
        L_0x0015:
            r0 = 2131559767(0x7f0d0557, float:1.8744887E38)
            if (r1 == 0) goto L_0x001d
        L_0x001a:
            r0 = 2131559572(0x7f0d0494, float:1.8744492E38)
        L_0x001d:
            android.view.View r0 = X.AnonymousClass3K4.A0K(r4, r5, r0)
            return r0
        L_0x0022:
            r1 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.chatinfo.view.custom.PnhBottomSheet.A11(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A13() {
        super.A13();
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener) null);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            textView2.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        this.A00 = view.findViewById(R.id.share_pn_close_button);
        this.A05 = C13680ns.A0M(view, R.id.share_pn_title);
        this.A04 = C13680ns.A0M(view, R.id.share_pn_text);
        this.A01 = C13680ns.A0M(view, R.id.share_pn_cta_negative);
        this.A03 = C13680ns.A0M(view, R.id.share_pn_cta_positive);
        TextView A0M = C13680ns.A0M(view, R.id.share_pn_own_number);
        if (C15450qv.A00()) {
            A0M.setTextDirection(3);
        }
        AnonymousClass04h.A09(A0M, 8, 24, 2, 2);
        this.A02 = A0M;
        View view2 = this.A00;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
    }
}
