package com.obwhatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01D;
import X.AnonymousClass2Wa;
import X.C004601z;
import X.C110115dX;
import X.C115915qW;
import X.C13680ns;
import X.C13690nt;
import X.C20140zZ;
import X.C29671b0;
import X.C89924dA;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxEWrapperShape176S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.base.GenericBkLayoutViewModel;
import com.whatsapp.util.Log;
import java.util.List;

public class BkBottomSheetContentFragment extends Hilt_BkBottomSheetContentFragment {
    public View A00;
    public Toolbar A01;
    public C115915qW A02;
    public C29671b0 A03;
    public AnonymousClass01D A04;
    public String A05;
    public String A06;
    public boolean A07;

    public static BkBottomSheetContentFragment A01(C115915qW r4, C20140zZ r5, String str, boolean z2) {
        Bundle A0D = C13690nt.A0D();
        String A0l = AnonymousClass000.A0l(AnonymousClass000.A0r("bk_bottom_sheet_content_fragment"), r4.hashCode());
        A0D.putString("bottom_sheet_fragment_tag", str);
        A0D.putBoolean("bottom_sheet_back_stack", z2);
        A0D.putString("bk_bottom_sheet_content_fragment", A0l);
        r5.A02(new C89924dA(r4), "bk_bottom_sheet_content_fragment", A0l);
        BkBottomSheetContentFragment bkBottomSheetContentFragment = new BkBottomSheetContentFragment();
        bkBottomSheetContentFragment.A0T(A0D);
        bkBottomSheetContentFragment.A02 = (AnonymousClass2Wa) r4.A00.A02.get(35);
        return bkBottomSheetContentFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0092);
    }

    public void A12() {
        C29671b0 r1 = this.A03;
        if (!(r1 == null || this.A02 == null)) {
            try {
                A1D(r1, (List) null);
            } catch (NullPointerException e2) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(getClass().getName());
                Log.e(AnonymousClass000.A0h("Failed to execute onContentDismiss Expression: ", A0o), e2);
            }
        }
        if (this.A0g && this.A02 != null) {
            ((C20140zZ) this.A04.get()).A04("bk_bottom_sheet_content_fragment", AnonymousClass000.A0l(AnonymousClass000.A0r("bk_bottom_sheet_content_fragment"), this.A02.hashCode()));
        }
        super.A12();
    }

    public void A13() {
        this.A01 = null;
        this.A00 = null;
        super.A13();
    }

    public void A17(Bundle bundle) {
        C115915qW r0 = (C115915qW) ((C20140zZ) this.A04.get()).A01("bk_bottom_sheet_content_fragment", A04().getString("bk_bottom_sheet_content_fragment", ""));
        this.A02 = r0;
        if (r0 != null) {
            this.A02 = (AnonymousClass2Wa) r0.A00.A02.get(35);
        }
        super.A17(bundle);
    }

    public void A18(Bundle bundle, View view) {
        Bundle A042 = A04();
        this.A00 = view.findViewById(R.id.bloks_dialogfragment_progressbar);
        this.A01 = (Toolbar) C004601z.A0E(view, R.id.bk_bottom_sheet_toolbar);
        this.A05 = A042.getString("bottom_sheet_fragment_tag");
        this.A07 = A042.getBoolean("bottom_sheet_back_stack");
        C115915qW r0 = this.A02;
        if (r0 != null) {
            String A0J = r0.A00.A0J(36);
            this.A06 = A0J;
            if (!TextUtils.isEmpty(A0J)) {
                this.A01.setVisibility(0);
                this.A01.setTitle((CharSequence) this.A06);
            }
            this.A03 = this.A02.A00.A0H(38) == null ? null : new IDxEWrapperShape176S0100000_3_I1(this, 5);
            boolean z2 = this.A07;
            Toolbar toolbar = this.A01;
            if (z2) {
                toolbar.setVisibility(0);
                this.A01.getNavigationIcon().setVisible(true, true);
                this.A01.setNavigationOnClickListener(C110115dX.A06(this, 145));
            } else {
                Drawable navigationIcon = toolbar.getNavigationIcon();
                AnonymousClass00B.A06(navigationIcon);
                navigationIcon.setVisible(false, false);
            }
        }
        super.A18(bundle, view);
    }

    public int A19() {
        return R.id.bloks_container;
    }

    public Class A1A() {
        return GenericBkLayoutViewModel.class;
    }
}
