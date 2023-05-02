package com.obwhatsapp.picker.searchexpressions;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass027;
import X.AnonymousClass18G;
import X.AnonymousClass3H7;
import X.AnonymousClass3PR;
import X.AnonymousClass3q8;
import X.AnonymousClass4IS;
import X.AnonymousClass5QT;
import X.C004601z;
import X.C006602z;
import X.C13680ns;
import X.C13700nu;
import X.C14710pd;
import X.C16040sK;
import X.C16490t9;
import X.C16620tM;
import X.C25861Lk;
import X.C25921Lq;
import X.C26141Mm;
import X.C34151jm;
import X.C34331k5;
import X.C447725m;
import X.C47812Kr;
import X.C74353qP;
import X.C87924Ze;
import X.C95454mf;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxObjectShape302S0100000_2_I1;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.collections.MarginCorrectedViewPager;
import com.obwhatsapp.text.IDxWAdapterShape103S0100000_2_I1;
import com.whatsapp.util.Log;
import java.util.List;

public class ExpressionsSearchDialogFragment extends Hilt_ExpressionsSearchDialogFragment implements AnonymousClass5QT {
    public View A00;
    public TabLayout A01;
    public C16040sK A02;
    public WaEditText A03;
    public MarginCorrectedViewPager A04;
    public AnonymousClass013 A05;
    public C14710pd A06;
    public C16490t9 A07;
    public ExpressionSearchViewModel A08;
    public C26141Mm A09;
    public AnonymousClass18G A0A;
    public final int A0B;

    public ExpressionsSearchDialogFragment(int i2) {
        this.A0B = i2;
    }

    public void A0q() {
        super.A0q();
        this.A03.A04(false);
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        AnonymousClass027 r1 = this.A08.A0A;
        AnonymousClass00B.A06(r1.A01());
        bundle.putString("search_keyword", ((AnonymousClass4IS) r1.A01()).A01);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A11(bundle, layoutInflater, viewGroup);
        View inflate = layoutInflater.inflate(R.layout.layout0279, viewGroup, false);
        View A0E = C004601z.A0E(inflate, R.id.search_bar_layout);
        this.A03 = (WaEditText) C004601z.A0E(inflate, R.id.search_text_field);
        ExpressionSearchViewModel expressionSearchViewModel = (ExpressionSearchViewModel) new C006602z(this).A01(ExpressionSearchViewModel.class);
        this.A08 = expressionSearchViewModel;
        AnonymousClass00B.A06(expressionSearchViewModel.A0A.A01());
        C13680ns.A1L(this, this.A08.A0A, 112);
        if (bundle == null || !bundle.containsKey("search_keyword")) {
            ExpressionSearchViewModel expressionSearchViewModel2 = this.A08;
            expressionSearchViewModel2.A03.A0B(expressionSearchViewModel2.A06.A01());
            AnonymousClass027 r2 = expressionSearchViewModel2.A0A;
            int i2 = 1;
            if ("".isEmpty()) {
                i2 = 0;
            }
            r2.A0B(new AnonymousClass4IS(i2, ""));
            C16490t9 r22 = expressionSearchViewModel2.A05;
            C25861Lk r0 = expressionSearchViewModel2.A06;
            C74353qP r1 = new C74353qP();
            r1.A00 = Integer.valueOf(r0.A00());
            r22.A06(r1);
        } else {
            this.A03.setText(bundle.getString("search_keyword"));
            ExpressionSearchViewModel expressionSearchViewModel3 = this.A08;
            String string = bundle.getString("search_keyword");
            AnonymousClass027 r23 = expressionSearchViewModel3.A0A;
            int i3 = 1;
            if (string.isEmpty()) {
                i3 = 0;
            }
            r23.A0B(new AnonymousClass4IS(i3, string));
        }
        View A0E2 = C004601z.A0E(inflate, R.id.clear_search_bar_btn);
        this.A00 = A0E2;
        C34331k5.A03(A0E2, this, 37);
        ImageView A0J = C13680ns.A0J(inflate, R.id.back_btn);
        C34331k5.A03(A0J, this, 38);
        C447725m.A01(A0u(), A0J, this.A05, R.drawable.ic_back);
        TabLayout tabLayout = (TabLayout) C004601z.A0E(inflate, R.id.expression_category_tabs);
        this.A01 = tabLayout;
        C13680ns.A1K(this, tabLayout);
        C13680ns.A0u(A0u(), this.A01, R.color.color01ed);
        C13680ns.A0u(A0u(), A0E, R.color.color01ed);
        this.A01.A0E(C47812Kr.A00(this, this.A01, R.string.str149f, 0));
        this.A01.A0E(C47812Kr.A00(this, this.A01, R.string.str16ec, 1));
        if (!this.A02.A0G() && this.A06.A0E(C16620tM.A02, 1396) && Boolean.valueOf(this.A09.A01()).booleanValue()) {
            this.A01.A0E(C47812Kr.A00(this, this.A01, R.string.str08aa, 2));
        }
        this.A04 = (MarginCorrectedViewPager) C004601z.A0E(inflate, R.id.expression_category_viewpager);
        AnonymousClass3PR r24 = new AnonymousClass3PR(A0F(), this.A02, this.A06, this.A09);
        this.A04.setAdapter(r24);
        this.A04.setOffscreenPageLimit(r24.A01());
        this.A04.A0G(new C95454mf(this.A01));
        this.A04.setCurrentItem(A1N());
        A1O(A1N());
        this.A01.A0D(new IDxObjectShape302S0100000_2_I1(this, 1));
        this.A03.addTextChangedListener(new IDxWAdapterShape103S0100000_2_I1(this, 5));
        this.A03.requestFocus();
        this.A03.A04(false);
        this.A07.A06(new AnonymousClass3q8());
        this.A0A.A01();
        return inflate;
    }

    public void A13() {
        super.A13();
        this.A04 = null;
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
    }

    public final int A1N() {
        int i2 = this.A0B;
        if (i2 == 0) {
            Log.e("Tab code not found in ExpressionSearchCategoriesData.Tabs");
            return 0;
        } else if (i2 != 2) {
            return i2 == 3 ? 2 : 0;
        } else {
            return 1;
        }
    }

    public final void A1O(int i2) {
        WaEditText waEditText;
        int i3;
        if (i2 != 0) {
            if (i2 == 1) {
                waEditText = this.A03;
                i3 = R.string.str16c3;
            } else if (i2 == 2) {
                waEditText = this.A03;
                i3 = R.string.str0138;
            } else {
                return;
            }
            waEditText.setHint(i3);
            return;
        }
        this.A03.setHint(C13700nu.A0F(A03(), this.A08.A06 instanceof C25921Lq ? "Tenor" : "Giphy", new Object[1], 0, R.string.str09c2));
    }

    public void A1P(List list) {
        AnonymousClass027 r2 = this.A08.A0B;
        r2.A0B(new C87924Ze(r2.A01() != null ? ((C87924Ze) r2.A01()).A00 : null, list));
    }

    public void AXt(C34151jm r2, Integer num, int i2) {
        this.A03.A03();
        AnonymousClass3H7 r0 = this.A00;
        if (r0 != null) {
            r0.AXt(r2, num, i2);
        }
    }
}
