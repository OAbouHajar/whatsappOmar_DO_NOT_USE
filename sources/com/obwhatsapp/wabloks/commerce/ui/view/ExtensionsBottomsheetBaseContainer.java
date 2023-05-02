package com.obwhatsapp.wabloks.commerce.ui.view;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass050;
import X.AnonymousClass1ZW;
import X.AnonymousClass5wS;
import X.C000900k;
import X.C001000l;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C100294vP;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14710pd;
import X.C16620tM;
import X.C18450wi;
import X.C35001lD;
import X.C813247s;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxKListenerShape224S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape247S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsMetaDataViewModel;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsNavBarViewModel;
import com.whatsapp.jid.UserJid;

public final class ExtensionsBottomsheetBaseContainer extends Hilt_ExtensionsBottomsheetBaseContainer {
    public Uri A00;
    public ProgressBar A01;
    public Toolbar A02;
    public WaImageView A03;
    public WaTextView A04;
    public AnonymousClass5wS A05;
    public C14710pd A06;
    public WaExtensionsMetaDataViewModel A07;
    public WaExtensionsNavBarViewModel A08;

    public void A0z(Menu menu, MenuInflater menuInflater) {
        C18450wi.A0H(menu, 0);
        C18450wi.A0H(menuInflater, 1);
        if (this.A00 != null) {
            menu.add(0, 1, 0, A0J(R.string.str1cf6)).setShowAsAction(0);
        }
    }

    public boolean A10(MenuItem menuItem) {
        Uri uri;
        C18450wi.A0H(menuItem, 0);
        if (menuItem.getItemId() != 1 || (uri = this.A00) == null) {
            return false;
        }
        A0D().startActivity(C13690nt.A0B(uri));
        return true;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ProgressBar progressBar;
        Drawable indeterminateDrawable;
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout0609, viewGroup, false);
        C18450wi.A0B(inflate);
        A1A().setOnKeyListener(new IDxKListenerShape224S0100000_2_I1(this, 5));
        Toolbar toolbar = (Toolbar) C004601z.A0E(inflate, R.id.bk_bottom_sheet_toolbar);
        this.A02 = toolbar;
        C001000l A0C = A0C();
        if (A0C != null) {
            C000900k r0 = (C000900k) A0C;
            r0.Aem(toolbar);
            C005402i x2 = r0.x();
            if (x2 != null) {
                x2.A0Q(false);
            }
            Toolbar toolbar2 = this.A02;
            if (toolbar2 != null) {
                toolbar2.setNavigationContentDescription((CharSequence) A0J(R.string.str1c24));
            }
            C13700nu.A0V(A1N().A03, false);
            Toolbar toolbar3 = this.A02;
            if (!(toolbar3 == null || (progressBar = (ProgressBar) toolbar3.findViewById(R.id.bk_toolbar_loading)) == null || (indeterminateDrawable = progressBar.getIndeterminateDrawable()) == null)) {
                indeterminateDrawable.setColorFilter(AnonymousClass00T.A00(inflate.getContext(), R.color.color014d), PorterDuff.Mode.SRC_IN);
            }
            this.A03 = C13690nt.A0R(inflate, R.id.bk_branding_image);
            this.A04 = C13680ns.A0S(inflate, R.id.extensions_metadata_error_text);
            Toolbar toolbar4 = this.A02;
            if (toolbar4 != null) {
                toolbar4.setVisibility(0);
            }
            Toolbar toolbar5 = this.A02;
            if (toolbar5 != null) {
                toolbar5.setNavigationOnClickListener(new ViewOnClickCListenerShape20S0100000_I1_5((Object) this, 47));
            }
            this.A01 = (ProgressBar) C004601z.A0E(inflate, R.id.metadata_request_progressbar);
            Bundle bundle2 = this.A05;
            if (bundle2 != null) {
                if (bundle2.getBoolean("make_metadata_request", false)) {
                    Bundle bundle3 = this.A05;
                    ViewGroup.LayoutParams layoutParams = null;
                    if (bundle3 != null) {
                        UserJid nullable = UserJid.getNullable(bundle3.getString("chat_id"));
                        String string = bundle3.getString("flow_id");
                        if (!(nullable == null || string == null)) {
                            WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel = this.A07;
                            if (waExtensionsMetaDataViewModel != null) {
                                C13680ns.A1N(A0H(), waExtensionsMetaDataViewModel.A01, this, 138);
                                WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel2 = this.A07;
                                if (waExtensionsMetaDataViewModel2 != null) {
                                    waExtensionsMetaDataViewModel2.A03.A04(new C100294vP(nullable, waExtensionsMetaDataViewModel2, string), nullable);
                                    ProgressBar progressBar2 = this.A01;
                                    if (progressBar2 != null) {
                                        progressBar2.setVisibility(0);
                                    }
                                    Drawable A042 = AnonymousClass00T.A04(A02(), R.drawable.bloks_progress_indeterminate);
                                    ProgressBar progressBar3 = this.A01;
                                    if (!(progressBar3 == null || (layoutParams = progressBar3.getLayoutParams()) == null)) {
                                        layoutParams.height = A0D().getWindowManager().getDefaultDisplay().getHeight() >> 1;
                                    }
                                    ProgressBar progressBar4 = this.A01;
                                    if (progressBar4 != null) {
                                        progressBar4.setLayoutParams(layoutParams);
                                    }
                                    ProgressBar progressBar5 = this.A01;
                                    if (progressBar5 != null) {
                                        progressBar5.setIndeterminateDrawable(A042);
                                    }
                                }
                            }
                            throw C18450wi.A03("waExtensionsMetaDataViewModel");
                        }
                    }
                    String A0J = A0J(R.string.str0514);
                    C18450wi.A0B(A0J);
                    C13700nu.A0P(this.A01);
                    WaTextView waTextView = this.A04;
                    if (waTextView != null) {
                        waTextView.setVisibility(0);
                        waTextView.setText(A0J);
                    }
                } else {
                    A1O(inflate);
                }
            }
            Window window = A1A().getWindow();
            if (window != null) {
                window.setSoftInputMode(16);
            }
            return inflate;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
    }

    public void A17(Bundle bundle) {
        Uri uri;
        super.A17(bundle);
        A1E(0, R.style.style02ee);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = (WaExtensionsNavBarViewModel) new C006602z(A0D()).A01(WaExtensionsNavBarViewModel.class);
        C18450wi.A0H(waExtensionsNavBarViewModel, 0);
        this.A08 = waExtensionsNavBarViewModel;
        WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel = (WaExtensionsMetaDataViewModel) new C006602z(A0D()).A01(WaExtensionsMetaDataViewModel.class);
        C18450wi.A0H(waExtensionsMetaDataViewModel, 0);
        this.A07 = waExtensionsMetaDataViewModel;
        WaExtensionsNavBarViewModel A1N = A1N();
        String A062 = A1N.A05.A06(C16620tM.A02, 2069);
        if (!AnonymousClass1ZW.A0E(A062)) {
            Uri.Builder appendPath = A1N.A06.A01().appendPath(A062);
            C18450wi.A0B(appendPath);
            uri = appendPath.build();
        } else {
            uri = null;
        }
        this.A00 = uri;
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        C13680ns.A1L(this, A1N().A01, 135);
        C13680ns.A1L(this, A1N().A02, 136);
        C13680ns.A1L(this, A1N().A03, 137);
        WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel = this.A07;
        if (waExtensionsMetaDataViewModel != null) {
            C13680ns.A1L(this, waExtensionsMetaDataViewModel.A00, 139);
            return;
        }
        throw C18450wi.A03("waExtensionsMetaDataViewModel");
    }

    public Dialog A1B(Bundle bundle) {
        Dialog A1B = super.A1B(bundle);
        A1B.setOnShowListener(new IDxSListenerShape247S0100000_2_I1(this, 2));
        return A1B;
    }

    public final WaExtensionsNavBarViewModel A1N() {
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A08;
        if (waExtensionsNavBarViewModel != null) {
            return waExtensionsNavBarViewModel;
        }
        throw C18450wi.A03("waExtensionsNavBarViewModel");
    }

    public final void A1O(View view) {
        Bundle bundle = this.A05;
        if (bundle != null) {
            View A002 = C18450wi.A00(view, R.id.wa_fcs_bottom_sheet_fragment_container);
            AnonymousClass050 r4 = new AnonymousClass050(A0F());
            String string = bundle.getString("screen_name");
            C18450wi.A0F(string);
            r4.A0E(C813247s.A00((C35001lD) bundle.getParcelable("screen_cache_config"), string, bundle.getString("screen_params"), bundle.getString("qpl_param_map")), "BK_FRAGMENT", A002.getId());
            r4.A01();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18450wi.A0H(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        A0D().finish();
    }
}
