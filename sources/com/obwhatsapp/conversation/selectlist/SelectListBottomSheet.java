package com.obwhatsapp.conversation.selectlist;

import X.AnonymousClass000;
import X.AnonymousClass3RA;
import X.AnonymousClass4E9;
import X.AnonymousClass4KR;
import X.C13680ns;
import X.C16880tn;
import X.C35111lO;
import X.C35121lP;
import X.C57462rD;
import X.C87894Zb;
import X.C91524g3;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxSListenerShape35S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class SelectListBottomSheet extends Hilt_SelectListBottomSheet {
    public AnonymousClass4KR A00;
    public C16880tn A01;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout01e8);
    }

    public void A13() {
        super.A13();
        this.A00 = null;
    }

    public void A18(Bundle bundle, View view) {
        C16880tn r0 = (C16880tn) A04().getParcelable("arg_select_list_content");
        this.A01 = r0;
        if (r0 == null) {
            A1C();
        }
        C13680ns.A17(view.findViewById(R.id.close), this, 29);
        C13680ns.A0R(view, R.id.select_list_title).A0I((List) null, this.A01.A06);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.select_list_items);
        recyclerView.A0o(new IDxSListenerShape35S0100000_2_I1(this, 3));
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.A0m(new AnonymousClass3RA());
        C57462rD r3 = new C57462rD();
        recyclerView.setAdapter(r3);
        List<C35121lP> list = this.A01.A09;
        ArrayList A0u = AnonymousClass000.A0u();
        for (C35121lP r2 : list) {
            String str = r2.A00;
            if (!TextUtils.isEmpty(str)) {
                A0u.add(new C87894Zb(str));
            }
            for (C35111lO r1 : r2.A01) {
                A0u.add(new C87894Zb(r1));
            }
        }
        List list2 = r3.A02;
        list2.clear();
        list2.addAll(A0u);
        r3.A01();
        C13680ns.A1C(view.findViewById(R.id.select_list_button), this, r3, 16);
        r3.A01 = new AnonymousClass4E9(view);
        this.A03.setOnShowListener(new C91524g3());
    }
}
