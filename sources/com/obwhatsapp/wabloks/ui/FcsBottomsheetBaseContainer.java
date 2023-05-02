package com.obwhatsapp.wabloks.ui;

import X.AnonymousClass050;
import X.AnonymousClass09K;
import X.C004601z;
import X.C110105dW;
import X.C118775vE;
import X.C1206862p;
import X.C1207162s;
import X.C1207362u;
import X.C13680ns;
import X.C13690nt;
import X.C14550pN;
import X.C16150sX;
import X.C20180zd;
import X.C82294Cg;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxPCallbackShape467S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.wabloks.base.FdsContentFragmentManager;

public class FcsBottomsheetBaseContainer extends Hilt_FcsBottomsheetBaseContainer {
    public Toolbar A00;
    public C82294Cg A01;
    public WaTextView A02;
    public C20180zd A03;
    public C118775vE A04;
    public Boolean A05 = Boolean.TRUE;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public static FcsBottomsheetBaseContainer A01(String str, String str2, String str3, String str4, String str5) {
        FcsBottomsheetBaseContainer fcsBottomsheetBaseContainer = new FcsBottomsheetBaseContainer();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("fds_observer_id", str);
        A0D.putString("fds_on_back", str2);
        A0D.putString("fds_on_back_params", str3);
        A0D.putString("fds_button_style", str4);
        A0D.putString("fds_state_name", str5);
        fcsBottomsheetBaseContainer.A0T(A0D);
        return fcsBottomsheetBaseContainer;
    }

    public void A0s(Bundle bundle) {
        bundle.putString("fds_state_name", this.A0A);
        bundle.putString("fds_on_back", this.A07);
        bundle.putString("fds_on_back_params", this.A09);
        bundle.putString("fds_button_style", this.A06);
        bundle.putString("fds_observer_id", this.A08);
        super.A0s(bundle);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0A = A04().getString("fds_state_name");
        this.A07 = A04().getString("fds_on_back");
        this.A09 = A04().getString("fds_on_back_params");
        this.A08 = A04().getString("fds_observer_id");
        this.A06 = A04().getString("fds_button_style");
        C110105dW.A1N(this.A03.A02(this.A08), C1207162s.class, this, 6);
        C110105dW.A1N(this.A03.A01(A0u()), C1206862p.class, this, 7);
        this.A04 = new C118775vE((C14550pN) A0C(), C16150sX.A0Z(this.A01.A00.A04));
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout060b);
        this.A00 = (Toolbar) C004601z.A0E(A0H, R.id.bk_bottom_sheet_toolbar);
        this.A02 = C13680ns.A0S(A0H, R.id.toolbar_customized_title);
        A1N();
        View A0E = C004601z.A0E(A0H, R.id.wa_fcs_bottom_sheet_fragment_container);
        AnonymousClass050 r3 = new AnonymousClass050(A0F());
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            r3.A0D(FdsContentFragmentManager.A01(bundle2.getString("fds_observer_id")), "fds_content_manager", A0E.getId());
            r3.A01();
        }
        return A0H;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A1E(0, R.style.style033d);
    }

    public int A19() {
        return R.style.style0233;
    }

    public final void A1N() {
        AnonymousClass09K r1 = new AnonymousClass09K(-1);
        r1.A00 = 17;
        this.A02.setLayoutParams(r1);
        this.A00.setVisibility(0);
        this.A04.A01(this.A00, new IDxPCallbackShape467S0100000_3_I1(this, 0), this.A0A, this.A09, this.A06);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Bundle bundle = this.A05;
        if (bundle != null && this.A05.booleanValue()) {
            this.A03.A02(bundle.getString("fds_observer_id")).A01(new C1207362u((String) null, (String) null, false));
        }
        super.onDismiss(dialogInterface);
    }
}
