package com.obwhatsapp.businessdirectory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass01A;
import X.AnonymousClass1PX;
import X.AnonymousClass38U;
import X.AnonymousClass3F7;
import X.AnonymousClass3FJ;
import X.AnonymousClass3RR;
import X.AnonymousClass4KG;
import X.AnonymousClass5T5;
import X.C001000l;
import X.C004601z;
import X.C006602z;
import X.C016407u;
import X.C109235Rf;
import X.C13680ns;
import X.C13690nt;
import X.C17570vI;
import X.C18890xQ;
import X.C23061Ai;
import X.C31241dn;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.util.LocationUpdateListener;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.obwhatsapp.nativediscovery.view.pagination.IDxSListenerShape90S0100000_2_I1;
import java.util.Map;
import java.util.Set;

public class BusinessDirectoryContextualSearchFragment extends Hilt_BusinessDirectoryContextualSearchFragment implements AnonymousClass5T5, C109235Rf {
    public AnonymousClass38U A00;
    public C18890xQ A01;
    public AnonymousClass1PX A02;
    public LocationUpdateListener A03;
    public C17570vI A04;
    public AnonymousClass3FJ A05;
    public BusinessDirectoryContextualSearchViewModel A06;
    public AnonymousClass3RR A07;
    public C23061Ai A08;

    public void A0l(Bundle bundle) {
        this.A0V = true;
        A1B().A09 = this;
        AnonymousClass01A A0B = A0F().A0B("filter-bottom-sheet");
        if (A0B != null) {
            ((FilterBottomSheetDialogFragment) A0B).A02 = this;
        }
        this.A05.A01();
    }

    public void A0s(Bundle bundle) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A06;
        C016407u r2 = businessDirectoryContextualSearchViewModel.A0J;
        r2.A06("saved_search_session_started", Boolean.valueOf(businessDirectoryContextualSearchViewModel.A09));
        r2.A06("business_search_queries", businessDirectoryContextualSearchViewModel.A08);
        r2.A06("saved_search_state", Integer.valueOf(businessDirectoryContextualSearchViewModel.A04));
        r2.A06("saved_search_query", businessDirectoryContextualSearchViewModel.A07());
        r2.A06("search_context_category", businessDirectoryContextualSearchViewModel.A05);
        businessDirectoryContextualSearchViewModel.A0V.A07(r2);
        r2.A06("SEARCH_CONTEXT_CATEGORY_EXISTS", Boolean.valueOf(AnonymousClass000.A1V(businessDirectoryContextualSearchViewModel.A05)));
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout00b1, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(inflate, R.id.contextual_search_list);
        A0u();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.A04);
        IDxSListenerShape90S0100000_2_I1 iDxSListenerShape90S0100000_2_I1 = new IDxSListenerShape90S0100000_2_I1(this, 0);
        this.A07 = iDxSListenerShape90S0100000_2_I1;
        recyclerView.A0o(iDxSListenerShape90S0100000_2_I1);
        this.A0K.A00(this.A03);
        C13680ns.A1N(A0H(), this.A03.A00, this.A05, 23);
        C13680ns.A1N(A0H(), this.A06.A0H, this, 27);
        C13680ns.A1N(A0H(), this.A06.A0I, this, 26);
        C13680ns.A1N(A0H(), this.A06.A0F, this, 30);
        C13680ns.A1N(A0H(), this.A06.A0a, this, 28);
        C13680ns.A1N(A0H(), this.A06.A0b, this, 29);
        C13680ns.A1N(A0H(), this.A06.A0G, this, 30);
        C13690nt.A1J(A0H(), this.A06.A0d, this, 10);
        C13680ns.A1N(A0H(), this.A06.A0c, this, 25);
        C13680ns.A1N(A0H(), this.A06.A0X.A03, this.A05, 24);
        C13690nt.A1J(A0H(), this.A06.A0Z, this.A05, 9);
        return inflate;
    }

    public void A12() {
        super.A12();
        if (equals(A1B().A09)) {
            A1B().A09 = null;
        }
        this.A02.A01(this.A05);
        C001000l A0C = A0C();
        if (A0C == null || A0C.isFinishing()) {
            this.A06.A0R.A00();
        }
    }

    public void A16(Context context) {
        super.A16(context);
        A1B().A09 = this;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A06 = (BusinessDirectoryContextualSearchViewModel) new C006602z(this).A01(BusinessDirectoryContextualSearchViewModel.class);
        AnonymousClass3FJ A002 = this.A00.A00(this, this.A03, this);
        this.A05 = A002;
        this.A02.A00(A002);
        Bundle bundle2 = this.A05;
        if (bundle2 != null && (bundle2.getParcelable("SEARCH_CONTEXT_CATEGORY") instanceof C31241dn)) {
            C31241dn r4 = (C31241dn) this.A05.getParcelable("SEARCH_CONTEXT_CATEGORY");
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A06;
            Map map = businessDirectoryContextualSearchViewModel.A0J.A03;
            if (!(!map.containsKey("search_context_category"))) {
                r4 = (C31241dn) map.get("search_context_category");
            }
            businessDirectoryContextualSearchViewModel.A05 = r4;
            if (r4 != null) {
                businessDirectoryContextualSearchViewModel.A0V.A01 = C13680ns.A0p(r4, new C31241dn[1], 0);
            }
        }
    }

    public final BusinessDirectoryActivity A1B() {
        if (A0D() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) A0D();
        }
        throw AnonymousClass000.A0V("BusinessDirectorySearchFragment should be attached to BusinessDirectoryActivity");
    }

    public void ANl() {
        this.A06.A0H(62);
    }

    public void AT3() {
        AnonymousClass3F7 r1 = this.A06.A0X;
        r1.A06.A01();
        C13680ns.A1O(r1.A03, 2);
    }

    public void AT4() {
        this.A06.A0X.A04();
    }

    public void AT9() {
        this.A06.A0X.A05();
    }

    public void ATB(AnonymousClass4KG r2) {
        this.A06.A0X.A07(r2);
    }

    public void ATp(Set set) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A06;
        businessDirectoryContextualSearchViewModel.A0V.A01 = set;
        String A072 = businessDirectoryContextualSearchViewModel.A07();
        if (A072 == null) {
            A072 = "";
        }
        businessDirectoryContextualSearchViewModel.A0O(A072, 1);
        this.A06.A0H(64);
    }

    public void AcR() {
        C13680ns.A1O(this.A06.A0X.A03, 2);
    }

    public void Aha() {
        this.A06.A0X.A06();
    }
}
