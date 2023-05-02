package com.obwhatsapp.businessdirectory.view.custom;

import X.AnonymousClass04o;
import X.AnonymousClass3PU;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C016407u;
import X.C109235Rf;
import X.C13680ns;
import X.C34331k5;
import X.C57232qV;
import X.C64573Qv;
import X.C82374Co;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;

public class FilterBottomSheetDialogFragment extends Hilt_FilterBottomSheetDialogFragment {
    public C82374Co A00;
    public C64573Qv A01;
    public C109235Rf A02 = null;
    public C57232qV A03;
    public final C34331k5 A04 = new ViewOnClickCListenerShape4S0100000_I1(this, 25);

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        C57232qV r3 = this.A03;
        C016407u r2 = r3.A02;
        r2.A06("saved_all_categories", r3.A00);
        r2.A06("saved_selected_categories", C13680ns.A0n(r3.A03));
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0285);
        C13680ns.A18(C004601z.A0E(A0H, R.id.iv_close), this, 4);
        C13680ns.A1F(C13680ns.A0L(A0H, R.id.tv_title), this, R.string.str01b1);
        this.A01 = new C64573Qv(this);
        ((RecyclerView) A0H.findViewById(R.id.rv_categories)).setAdapter(this.A01);
        C13680ns.A1N(A0H(), this.A03.A01, this, 20);
        View A0E = C004601z.A0E(A0H, R.id.btn_clear);
        C34331k5 r1 = this.A04;
        A0E.setOnClickListener(r1);
        C004601z.A0E(A0H, R.id.btn_apply).setOnClickListener(r1);
        return A0H;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A03 = (C57232qV) new C006602z((AnonymousClass04o) new AnonymousClass3PU(bundle, this, this.A00, A04().getParcelableArrayList("arg-categories"), A04().getParcelableArrayList("arg-selected-categories")), (C001500q) this).A01(C57232qV.class);
    }
}
