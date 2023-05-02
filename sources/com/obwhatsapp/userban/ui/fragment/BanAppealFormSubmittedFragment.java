package com.obwhatsapp.userban.ui.fragment;

import X.AnonymousClass01V;
import X.AnonymousClass1ZW;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C17090uW;
import X.C23071Aj;
import X.C30531cW;
import X.C59142uk;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealFormSubmittedFragment extends Hilt_BanAppealFormSubmittedFragment {
    public C14870pt A00;
    public C17090uW A01;
    public C23071Aj A02;
    public AnonymousClass01V A03;
    public BanAppealViewModel A04;

    public void A0z(Menu menu, MenuInflater menuInflater) {
        menu.add(0, 1, 0, R.string.str1387).setShowAsAction(0);
    }

    public boolean A10(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.A04.A08(A0D(), false);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            this.A04.A0A.A0B(Boolean.TRUE);
            return true;
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A0a(true);
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout008b);
    }

    public void A18(Bundle bundle, View view) {
        this.A04 = C13680ns.A0W(this);
        BanAppealViewModel.A01(A0D(), true);
        TextEmojiLabel A0Q = C13680ns.A0Q(view, R.id.heading);
        C30531cW.A02(A0Q);
        C30531cW.A03(A0Q, this.A03);
        SpannableStringBuilder A0F = C13690nt.A0F(AnonymousClass1ZW.A00(A0u(), new Object[]{this.A02.A00("https://www.whatsapp.com/legal/terms-of-service#terms-of-service-acceptable-use-of-our-services").toString()}, R.string.str0152));
        URLSpan[] uRLSpanArr = (URLSpan[]) A0F.getSpans(0, A0F.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A0F.setSpan(new C59142uk(A0u(), this.A01, this.A00, this.A03, uRLSpan.getURL()), A0F.getSpanStart(uRLSpan), A0F.getSpanEnd(uRLSpan), A0F.getSpanFlags(uRLSpan));
                A0F.removeSpan(uRLSpan);
            }
        }
        A0Q.setText(A0F);
    }
}
