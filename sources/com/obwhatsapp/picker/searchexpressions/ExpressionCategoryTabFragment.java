package com.obwhatsapp.picker.searchexpressions;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass3H7;
import X.AnonymousClass4Om;
import X.C004601z;
import X.C13680ns;
import X.C14710pd;
import X.C57482rF;
import X.C57622rT;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape20S0101000_2_I1;
import com.obwhatsapp.R;
import java.util.List;

public abstract class ExpressionCategoryTabFragment extends Hilt_ExpressionCategoryTabFragment {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public RecyclerView A01;
    public C14710pd A02;
    public ExpressionSearchViewModel A03;
    public C57482rF A04;

    public void A0w() {
        C57482rF r0 = this.A04;
        if (r0 != null) {
            r0.A04 = false;
            r0.A01();
        }
        super.A0w();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context A022 = A02();
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0588);
        this.A01 = (RecyclerView) C004601z.A0E(A0H, R.id.tab_result);
        AnonymousClass01A r9 = this.A0D;
        if (r9 instanceof ExpressionTabFragment) {
            ExpressionTabFragment expressionTabFragment = (ExpressionTabFragment) r9;
            this.A03 = expressionTabFragment.A1A().A08;
            List A0u = AnonymousClass000.A0u();
            Bundle bundle2 = this.A05;
            if (bundle2 != null) {
                int i2 = bundle2.getInt("category_tab");
                this.A03.A0A.A0A(A0H(), new IDxObserverShape20S0101000_2_I1(this, i2, 0));
                A0u = A1A(i2);
            }
            AnonymousClass3H7 r0 = expressionTabFragment.A1A().A00;
            AnonymousClass00B.A06(r0);
            C57482rF r6 = new C57482rF(A022, r0.A00(), expressionTabFragment, C13680ns.A0Y(), A0u);
            this.A04 = r6;
            this.A01.setAdapter(r6);
            AnonymousClass4Om r62 = new AnonymousClass4Om(A022, viewGroup, this.A01, this.A04);
            this.A00 = r62.A07;
            A0H.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
            this.A01.A0o(new C57622rT(A03(), r62.A08, this.A02));
            return A0H;
        }
        throw AnonymousClass000.A0a("Parent fragment is not type of ExpressionTabFragment");
    }

    public void A13() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this.A00);
            List list = this.A01.A0b;
            if (list != null) {
                list.clear();
            }
            this.A01 = null;
        }
        super.A13();
    }

    public void A14() {
        super.A14();
        C57482rF r0 = this.A04;
        if (r0 != null) {
            r0.A04 = true;
            r0.A01();
        }
    }

    public abstract List A1A(int i2);
}
