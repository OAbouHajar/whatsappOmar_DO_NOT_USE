package com.facebook.redex;

import X.AnonymousClass00T;
import X.C30631ch;
import X.C32291fz;
import X.C67533bs;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.search.SearchFragment;

public class IDxBConsumerShape434S0100000_2_I0 implements C30631ch {
    public Object A00;
    public final int A01;

    public IDxBConsumerShape434S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void A4N(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        if (this.A01 != 0) {
            SearchFragment searchFragment = (SearchFragment) this.A00;
            View view = searchFragment.A0A;
            if (searchFragment.A0u() != null && view != null) {
                C32291fz A012 = C32291fz.A01(view.findViewById(R.id.search_fragment), charSequence, 0);
                A012.A09(charSequence2, onClickListener);
                A012.A07(AnonymousClass00T.A00(searchFragment.A0u(), R.color.color0735));
                A012.A05(new C67533bs(searchFragment));
                searchFragment.A04 = A012;
                A012.A03();
                return;
            }
            return;
        }
        ((ConversationsFragment) this.A00).A1V(charSequence, charSequence2, onClickListener);
    }
}
