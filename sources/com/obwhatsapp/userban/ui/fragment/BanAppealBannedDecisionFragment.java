package com.obwhatsapp.userban.ui.fragment;

import X.AnonymousClass01V;
import X.C13680ns;
import X.C17110uY;
import X.C30531cW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape1S0000000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealBannedDecisionFragment extends Hilt_BanAppealBannedDecisionFragment {
    public AnonymousClass01V A00;
    public BanAppealViewModel A01;
    public C17110uY A02;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout008c);
    }

    public void A18(Bundle bundle, View view) {
        this.A01 = C13680ns.A0W(this);
        BanAppealViewModel.A01(A0D(), false);
        C13680ns.A0J(view, R.id.ban_icon).setImageDrawable(A03().getDrawable(R.drawable.icon_banned));
        C13680ns.A0L(view, R.id.heading).setText(R.string.str015c);
        TextEmojiLabel A0Q = C13680ns.A0Q(view, R.id.sub_heading);
        Runnable[] runnableArr = {new RunnableRunnableShape1S0000000_I1()};
        C30531cW.A04(A0Q, this.A00, this.A02.A05(A0J(R.string.str015d), runnableArr, new String[]{"terms-of-service-link"}, new String[]{"https://www.whatsapp.com/legal/updates/terms-of-service"}));
        TextView A0L = C13680ns.A0L(view, R.id.action_button);
        A0L.setText(R.string.str015e);
        C13680ns.A19(A0L, this, 43);
    }
}
