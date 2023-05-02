package com.obwhatsapp.businessapisearch.view.fragment;

import X.AnonymousClass01X;
import X.AnonymousClass2Xo;
import X.AnonymousClass3Of;
import X.AnonymousClass3RR;
import X.AnonymousClass4KD;
import X.AnonymousClass4QK;
import X.C004601z;
import X.C16150sX;
import X.C18450wi;
import X.C24221Fa;
import X.C25501Ka;
import X.C50142Yd;
import X.C57252qZ;
import X.C73553oL;
import X.C77043v8;
import X.C82324Cj;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;

public final class BusinessApiBrowseFragment extends Hilt_BusinessApiBrowseFragment {
    public static C73553oL A05;
    public static C57252qZ A06;
    public static AnonymousClass3RR A07;
    public RecyclerView A00;
    public C82324Cj A01;
    public C25501Ka A02;
    public AnonymousClass2Xo A03;
    public AnonymousClass4QK A04;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout008f, viewGroup, false);
        C18450wi.A0B(inflate);
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(inflate, R.id.home_list);
        this.A00 = recyclerView;
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            AnonymousClass2Xo r0 = this.A03;
            if (r0 != null) {
                recyclerView.setAdapter(r0);
                C77043v8 r02 = new C77043v8();
                A07 = r02;
                recyclerView.A0o(r02);
            } else {
                C18450wi.A0O("listAdapter");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
        C57252qZ r03 = A06;
        if (r03 == null) {
            C18450wi.A0O("viewModel");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r03.A02.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 14));
        C57252qZ r04 = A06;
        if (r04 == null) {
            C18450wi.A0O("viewModel");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r04.A07.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 56));
        C57252qZ r05 = A06;
        if (r05 == null) {
            C18450wi.A0O("viewModel");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r05.A06.A02.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 13));
        BusinessApiSearchActivity A1B = A1B();
        C73553oL r06 = A05;
        if (r06 == null) {
            C18450wi.A0O("initialCategory");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        A1B.setTitle(r06.A01);
        A1B().A04.A01(new AnonymousClass3Of(this), A0H());
        A1B().A37();
        return inflate;
    }

    public void A12() {
        super.A12();
        this.A00 = null;
    }

    public void A13() {
        super.A13();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            AnonymousClass3RR r0 = A07;
            if (r0 == null) {
                C18450wi.A0O("paginationScrollListener");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            recyclerView.A0p(r0);
            RecyclerView recyclerView2 = this.A00;
            C18450wi.A0F(recyclerView2);
            recyclerView2.setAdapter((AnonymousClass01X) null);
            this.A00 = null;
        }
    }

    public void A17(Bundle bundle) {
        Parcelable parcelable = A04().getParcelable("INITIAL_API_CATEGORY");
        C18450wi.A0F(parcelable);
        C18450wi.A0B(parcelable);
        C73553oL r7 = (C73553oL) parcelable;
        A05 = r7;
        C82324Cj r0 = this.A01;
        if (r0 == null) {
            C18450wi.A0O("viewModelFactory");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (r7 == null) {
            C18450wi.A0O("initialCategory");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            C50142Yd r2 = r0.A00;
            C16150sX r1 = r2.A04;
            C57252qZ r4 = new C57252qZ(C24221Fa.A00(r1.AS2), (C25501Ka) r1.A2i.get(), r7, C16150sX.A0C(r1), new AnonymousClass4KD(r2.A03.A03()));
            A06 = r4;
            C73553oL r02 = A05;
            if (r02 == null) {
                C18450wi.A0O("initialCategory");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            r4.A06(r02);
            super.A17(bundle);
        }
    }

    public final BusinessApiSearchActivity A1B() {
        if (A0D() instanceof BusinessApiSearchActivity) {
            return (BusinessApiSearchActivity) A0D();
        }
        throw new IllegalStateException("BusinessApiBrowseFragment should be attached to BusinessApiSearchActivity");
    }
}
