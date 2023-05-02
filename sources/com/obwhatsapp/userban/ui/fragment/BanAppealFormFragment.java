package com.obwhatsapp.userban.ui.fragment;

import X.AnonymousClass01V;
import X.AnonymousClass1ZW;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14870pt;
import X.C17090uW;
import X.C19750yw;
import X.C23061Ai;
import X.C23071Aj;
import X.C30531cW;
import X.C59142uk;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.redex.IDxPCallbackShape18S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanAppealFormFragment extends Hilt_BanAppealFormFragment {
    public EditText A00;
    public C14870pt A01;
    public C17090uW A02;
    public C23071Aj A03;
    public AnonymousClass01V A04;
    public BanAppealViewModel A05;
    public C23061Ai A06;

    public void A0w() {
        super.A0w();
        String A0f = C13680ns.A0f(this.A00);
        C19750yw r1 = this.A05.A09;
        Log.i("BanAppealRepository/storeFormReviewDraft");
        C13680ns.A0y(r1.A04.A0K(), "support_ban_appeal_form_review_draft", A0f);
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A05.A07();
        return true;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A0a(true);
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout008a);
    }

    public void A14() {
        super.A14();
        C19750yw r1 = this.A05.A09;
        Log.i("BanAppealRepository/getFormReviewDraft");
        String A0E = C13700nu.A0E(C13680ns.A0B(r1.A04), "support_ban_appeal_form_review_draft");
        if (A0E != null) {
            this.A00.setText(A0E);
        }
    }

    public void A18(Bundle bundle, View view) {
        this.A05 = C13680ns.A0W(this);
        BanAppealViewModel.A01(A0D(), true);
        View view2 = view;
        this.A00 = (EditText) C004601z.A0E(view2, R.id.form_appeal_reason);
        C13680ns.A19(C004601z.A0E(view2, R.id.submit_button), this, 44);
        C13680ns.A1N(A0D(), this.A05.A02, this, 134);
        TextEmojiLabel A0Q = C13680ns.A0Q(view2, R.id.heading);
        C30531cW.A02(A0Q);
        C30531cW.A03(A0Q, this.A04);
        SpannableStringBuilder A0F = C13690nt.A0F(AnonymousClass1ZW.A00(A0u(), new Object[]{this.A03.A00("https://www.whatsapp.com/legal/terms-of-service#terms-of-service-acceptable-use-of-our-services").toString()}, R.string.str0152));
        URLSpan[] uRLSpanArr = (URLSpan[]) A0F.getSpans(0, A0F.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A0F.setSpan(new C59142uk(A0u(), this.A02, this.A01, this.A04, uRLSpan.getURL()), A0F.getSpanStart(uRLSpan), A0F.getSpanEnd(uRLSpan), A0F.getSpanFlags(uRLSpan));
                A0F.removeSpan(uRLSpan);
            }
        }
        A0Q.setText(A0F);
        A0D().A04.A01(new IDxPCallbackShape18S0100000_2_I1(this, 1), A0H());
    }
}
