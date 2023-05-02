package com.obwhatsapp.biz.product.view.fragment;

import X.AnonymousClass013;
import X.AnonymousClass027;
import X.AnonymousClass26S;
import X.C004601z;
import X.C006602z;
import X.C13680ns;
import X.C13690nt;
import X.C18160wF;
import X.C34331k5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Group;
import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.jid.UserJid;

public class ProductMoreInfoFragment extends Hilt_ProductMoreInfoFragment {
    public ProgressBar A00;
    public Group A01;
    public Group A02;
    public Group A03;
    public TextEmojiLabel A04;
    public TextEmojiLabel A05;
    public TextEmojiLabel A06;
    public WaTextView A07;
    public ComplianceInfoViewModel A08;
    public AnonymousClass013 A09;
    public C18160wF A0A;

    public static ProductMoreInfoFragment A01(UserJid userJid, String str) {
        ProductMoreInfoFragment productMoreInfoFragment = new ProductMoreInfoFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("product_owner_jid", userJid);
        A0D.putString("product_id", str);
        productMoreInfoFragment.A0T(A0D);
        return productMoreInfoFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout04d7, viewGroup, false);
        View A0E = C004601z.A0E(inflate, R.id.close_button);
        C13680ns.A0t(A02(), A0E, R.string.str1c24);
        C34331k5.A01(A0E, this, 22);
        this.A00 = (ProgressBar) C004601z.A0E(inflate, R.id.more_info_progress);
        this.A04 = C13680ns.A0Q(inflate, R.id.more_info_country_description);
        this.A06 = C13680ns.A0Q(inflate, R.id.more_info_name_description);
        this.A05 = C13680ns.A0Q(inflate, R.id.more_info_address_description);
        this.A02 = (Group) C004601z.A0E(inflate, R.id.importer_country_group);
        this.A03 = (Group) C004601z.A0E(inflate, R.id.importer_name_group);
        this.A01 = (Group) C004601z.A0E(inflate, R.id.importer_address_group);
        this.A07 = C13680ns.A0S(inflate, R.id.compliance_network_error_info);
        String string = A04().getString("product_id");
        ComplianceInfoViewModel complianceInfoViewModel = this.A08;
        AnonymousClass027 r2 = complianceInfoViewModel.A01;
        r2.A0B(0);
        if (!complianceInfoViewModel.A04.A08(new AnonymousClass26S((UserJid) A04().getParcelable("product_owner_jid"), 0, (Integer) null, string, complianceInfoViewModel.A03.A00, true))) {
            C13680ns.A1O(r2, 3);
        } else {
            complianceInfoViewModel.A05.Acl(new RunnableRunnableShape1S1100000_I1(2, string, complianceInfoViewModel));
        }
        C13680ns.A1N(A0H(), this.A08.A00, this, 14);
        C13680ns.A1N(A0H(), this.A08.A01, this, 15);
        return inflate;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A08 = (ComplianceInfoViewModel) new C006602z(this).A01(ComplianceInfoViewModel.class);
    }
}
